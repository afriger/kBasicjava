// Generated from C:/dev/__JavaProjects/blinnafig/src/main\kbas.g4 by ANTLR 4.7
package com.sasa;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link kbasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface kbasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link kbasParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(kbasParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(kbasParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#amperoper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmperoper(kbasParser.AmperoperContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#linenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinenumber(kbasParser.LinenumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#amprstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmprstmt(kbasParser.AmprstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(kbasParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(kbasParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(kbasParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#printstmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintstmt1(kbasParser.Printstmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#printlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlist(kbasParser.PrintlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#getstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetstmt(kbasParser.GetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#letstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetstmt(kbasParser.LetstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#variableassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableassignment(kbasParser.VariableassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(kbasParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#forstmt11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt11(kbasParser.Forstmt11Context ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#forstmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt1(kbasParser.Forstmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#forstmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt2(kbasParser.Forstmt2Context ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#nextstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextstmt(kbasParser.NextstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#inputstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputstmt(kbasParser.InputstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#readstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadstmt(kbasParser.ReadstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#dimstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimstmt(kbasParser.DimstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#gotostmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotostmt(kbasParser.GotostmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#gosubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGosubstmt(kbasParser.GosubstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#gpsstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGpsstmt(kbasParser.GpsstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#returnsubstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnsubstmt(kbasParser.ReturnsubstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#psstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPsstmt(kbasParser.PsstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#pokestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokestmt(kbasParser.PokestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(kbasParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#hplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHplotstmt(kbasParser.HplotstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#vplotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVplotstmt(kbasParser.VplotstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#plotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlotstmt(kbasParser.PlotstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#vtabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVtabstmnt(kbasParser.VtabstmntContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#htabstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtabstmnt(kbasParser.HtabstmntContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#himemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHimemstmt(kbasParser.HimemstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#lomemstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLomemstmt(kbasParser.LomemstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#datastmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatastmt(kbasParser.DatastmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatum(kbasParser.DatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#waitstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitstmt(kbasParser.WaitstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#xdrawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXdrawstmt(kbasParser.XdrawstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#drawstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawstmt(kbasParser.DrawstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#defstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefstmt(kbasParser.DefstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#tabstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabstmt(kbasParser.TabstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#speedstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeedstmt(kbasParser.SpeedstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#rotstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotstmt(kbasParser.RotstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#scalestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalestmt(kbasParser.ScalestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#colorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorstmt(kbasParser.ColorstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#hcolorstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHcolorstmt(kbasParser.HcolorstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#hlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHlinstmt(kbasParser.HlinstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#vlinstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVlinstmt(kbasParser.VlinstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#onerrstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnerrstmt(kbasParser.OnerrstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#prstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrstmt(kbasParser.PrstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#instmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstmt(kbasParser.InstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#storestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorestmt(kbasParser.StorestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#recallstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecallstmt(kbasParser.RecallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#liststmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListstmt(kbasParser.ListstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#popstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopstmt(kbasParser.PopstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#amptstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmptstmt(kbasParser.AmptstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#includestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludestmt(kbasParser.IncludestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#endstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndstmt(kbasParser.EndstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(kbasParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#restorestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestorestmt(kbasParser.RestorestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(kbasParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#stringer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringer(kbasParser.StringerContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(kbasParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExp(kbasParser.SignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponentExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentExp(kbasParser.ExponentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(kbasParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(kbasParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(kbasParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(kbasParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(kbasParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(kbasParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(kbasParser.VarnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#varsuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsuffix(kbasParser.VarsuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(kbasParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(kbasParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#sqrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrfunc(kbasParser.SqrfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#chrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChrfunc(kbasParser.ChrfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#lenfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenfunc(kbasParser.LenfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#ascfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscfunc(kbasParser.AscfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#midfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidfunc(kbasParser.MidfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#pdlfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdlfunc(kbasParser.PdlfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#peekfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeekfunc(kbasParser.PeekfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#intfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntfunc(kbasParser.IntfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#spcfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpcfunc(kbasParser.SpcfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#frefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrefunc(kbasParser.FrefuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#posfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosfunc(kbasParser.PosfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#usrfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsrfunc(kbasParser.UsrfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#leftfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftfunc(kbasParser.LeftfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#rightfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightfunc(kbasParser.RightfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#strfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrfunc(kbasParser.StrfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#fnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnfunc(kbasParser.FnfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#valfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValfunc(kbasParser.ValfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#scrnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrnfunc(kbasParser.ScrnfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#sinfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinfunc(kbasParser.SinfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#cosfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosfunc(kbasParser.CosfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#tanfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanfunc(kbasParser.TanfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#atnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtnfunc(kbasParser.AtnfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#rndfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRndfunc(kbasParser.RndfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#sgnfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSgnfunc(kbasParser.SgnfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#expfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpfunc(kbasParser.ExpfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#logfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogfunc(kbasParser.LogfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#absfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsfunc(kbasParser.AbsfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link kbasParser#tabfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabfunc(kbasParser.TabfuncContext ctx);
}