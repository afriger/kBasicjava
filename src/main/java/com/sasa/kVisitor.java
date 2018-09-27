package com.sasa;

import org.antlr.v4.runtime.RuleContext;
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

    @Override
    public Value visitProg(kbasParser.ProgContext ctx)
    {
        init();
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
