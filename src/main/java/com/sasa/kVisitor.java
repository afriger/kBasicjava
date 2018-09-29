package com.sasa;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;

public class kVisitor extends kbasBaseVisitor<Value>
{
    private InputStream stdin;
    private PrintStream stdout;
    private PrintStream stderr;
    private Memory memory;

    private PrintStream printStream;
    private BufferedReader inputStream;
    private kbasParser.ProgContext pctx;

    @Override
    public Value visitReturnstmt(kbasParser.ReturnstmtContext ctx)
    {
        return super.visitReturnstmt(ctx);
    }

    @Override
    public Value visitPsstmt(kbasParser.PsstmtContext ctx)
    {
        return super.visitPsstmt(ctx);
    }

    @Override
    public Value visitGpsstmt(kbasParser.GpsstmtContext ctx)
    {

        int count = ctx.expression().getChildCount();
        String cc = ctx.expression().getText();
        int size = pctx.line().size();
        for (int k = 0; k < size; ++k)
        {
            kbasParser.LineContext line = pctx.line(k);
            String str= line.amprstmt(0).getText();
            continue;
        }
        return super.visitGpsstmt(ctx);
    }

    @Override
    public Value visitForstmt1(kbasParser.Forstmt1Context ctx)
    {
        String varname = ctx.vardecl().get(0).var().getText();// varname().ID().getText();
        Value start = visit(ctx.expression(0));
        Value end = visit(ctx.expression(1));
        Value step = ctx.expression(2) != null ? visit(ctx.expression(2)) : new Value(1);
        for (long i = start.internalNumber(); i <= end.internalNumber(); i = i + step.internalNumber())
        {
            memory.assign(varname, new Value(i));
            try
            {
                visit(ctx.block());
            }
            catch (ContinueLoopException e)
            {
                continue;
            }
            catch (ExitLoopException e)
            {
                break;
            }
        }
        return new Value(0);
    }

    @Override
    public Value visitProg(kbasParser.ProgContext ctx)
    {
        pctx = ctx;
        init();
/*
        int size = ctx.line().size();
        for (int k = 0; k < size; ++k)
        {
            kbasParser.LineContext line = ctx.line(k);
            String txt = line.getText();
            continue;
        }
*/


        try
        {
            return super.visitProg(ctx);
        }
        finally
        {
            cleanup();
        }

    }

    @Override
    public Value visitIfstmt(kbasParser.IfstmtContext ctx)
    {
        Value condition = visit(ctx.expression());
        if (condition.isTrue())
        {
            Value val = visit(ctx.statement());
            return val;
        }
        if (condition.isFalse())
        {
            return condition;
        }
        return null;
    }

    @Override
    public Value visitVar(kbasParser.VarContext ctx)
    {
        String id = ctx.getText();
        Value val = memory.get(id);// get var value
        return val;
    }

    @Override
    public Value visitLine(kbasParser.LineContext ctx)
    {
        int line = ctx.getStart().getLine();
        //System.out.println("#Line: " + line);
        return super.visitLine(ctx);
    }

    @Override
    public Value visitLetstmt(kbasParser.LetstmtContext ctx)
    {
        int line = ctx.getStart().getLine();
        String varname = ctx.variableassignment().vardecl().var().getText();
        Value value = visit(ctx.variableassignment().exprlist());//   //.expression());
        memory.assign(varname, value);
        return value;
    }

    @Override
    public Value visitPrintlist(kbasParser.PrintlistContext ctx)
    {
        ParseTree child = ctx.expression(0);
        Value val = visit(child);
        return val;
    }

    @Override
    public Value visitParenExpr(kbasParser.ParenExprContext ctx)
    {
        Value val = visit(ctx.expression());
        return val;
    }

    @Override
    public Value visitPrintstmt1(kbasParser.Printstmt1Context ctx)
    {
        Value value = super.visitPrintstmt1(ctx);
        if (value.isNumber())
        {
            printStream.println(value.internalNumber());
        }
        else
        {
            printStream.println(value.internalString());
        }
        return value;


    }

    @Override
    public Value visitFunc(kbasParser.FuncContext ctx)
    {
        return super.visitFunc(ctx);
    }

    @Override
    public Value visitNumber(kbasParser.NumberContext ctx)
    {
        Value value = new Value(Long.parseLong(ctx.getText()));
        return value;
    }

    @Override
    public Value visitExponentExp(kbasParser.ExponentExpContext ctx)
    {
        Value left = visit(ctx.expression(0));
        Value right = visit(ctx.expression(1));
        // TODO which one is left and which is right ?
        return left.exp(right);

    }

    @Override
    public Value visitRelExp(kbasParser.RelExpContext ctx)
    {
        Value left = visit(ctx.expression(0));
        Value right = visit(ctx.expression(1));
        switch (ctx.op.getType())
        {
            case kbasParser.GT:
                return left.gt(right);
            case kbasParser.GTE:
                return left.gte(right);
            case kbasParser.LT:
                return left.lt(right);
            case kbasParser.LTE:
                return left.lte(right);
            case kbasParser.EQ:
                return left.eq(right);
            default:
                return left.neq(right);
        }

    }

    @Override
    public Value visitMulExp(kbasParser.MulExpContext ctx)
    {
        Value left = visit(ctx.expression(0));
        Value right = visit(ctx.expression(1));
        switch (ctx.op.getType())
        {
            case kbasParser.TIMES:
                return left.mul(right);
            case kbasParser.DIV:
                return left.div(right);
        }
        return super.visitMulExp(ctx);
    }

    @Override
    public Value visitAddExp(kbasParser.AddExpContext ctx)
    {
        Value left = visit(ctx.expression(0));
        Value right = visit(ctx.expression(1));
        switch (ctx.op.getType())
        {
            case kbasParser.PLUS:
                return left.add(right);
            case kbasParser.MINUS:
                return left.sub(right);
        }
        return super.visitAddExp(ctx);
    }


    @Override
    public Value visitStringer(kbasParser.StringerContext ctx)
    {
        String value = ctx.getText();
        return new Value(value.substring(1, value.length() - 1));
    }


    public kVisitor(Memory memory, InputStream stdin, PrintStream stdout, PrintStream stderr)
    {
        this.stdin = stdin;
        this.stdout = stdout;
        this.stderr = stderr;
        this.memory = memory;
    }

    private void init()
    {
        printStream = new PrintStream(stdout, true);
        inputStream = new BufferedReader(new InputStreamReader(stdin));
    }

    private void cleanup()
    {
        printStream.close();
    }
}//calss
