// Generated from C:/dev/__JavaProjects/blinnafig/src/main\kbas.g4 by ANTLR 4.7
package com.sasa;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link kbasParser}.
 */
public interface kbasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link kbasParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(kbasParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(kbasParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(kbasParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(kbasParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#amperoper}.
	 * @param ctx the parse tree
	 */
	void enterAmperoper(kbasParser.AmperoperContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#amperoper}.
	 * @param ctx the parse tree
	 */
	void exitAmperoper(kbasParser.AmperoperContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#linenumber}.
	 * @param ctx the parse tree
	 */
	void enterLinenumber(kbasParser.LinenumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#linenumber}.
	 * @param ctx the parse tree
	 */
	void exitLinenumber(kbasParser.LinenumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#amprstmt}.
	 * @param ctx the parse tree
	 */
	void enterAmprstmt(kbasParser.AmprstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#amprstmt}.
	 * @param ctx the parse tree
	 */
	void exitAmprstmt(kbasParser.AmprstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(kbasParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(kbasParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(kbasParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(kbasParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#printstmt1}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt1(kbasParser.Printstmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#printstmt1}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt1(kbasParser.Printstmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#printlist}.
	 * @param ctx the parse tree
	 */
	void enterPrintlist(kbasParser.PrintlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#printlist}.
	 * @param ctx the parse tree
	 */
	void exitPrintlist(kbasParser.PrintlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#getstmt}.
	 * @param ctx the parse tree
	 */
	void enterGetstmt(kbasParser.GetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#getstmt}.
	 * @param ctx the parse tree
	 */
	void exitGetstmt(kbasParser.GetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#letstmt}.
	 * @param ctx the parse tree
	 */
	void enterLetstmt(kbasParser.LetstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#letstmt}.
	 * @param ctx the parse tree
	 */
	void exitLetstmt(kbasParser.LetstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableassignment(kbasParser.VariableassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#variableassignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableassignment(kbasParser.VariableassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(kbasParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(kbasParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#forstmt1}.
	 * @param ctx the parse tree
	 */
	void enterForstmt1(kbasParser.Forstmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#forstmt1}.
	 * @param ctx the parse tree
	 */
	void exitForstmt1(kbasParser.Forstmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#forstmt2}.
	 * @param ctx the parse tree
	 */
	void enterForstmt2(kbasParser.Forstmt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#forstmt2}.
	 * @param ctx the parse tree
	 */
	void exitForstmt2(kbasParser.Forstmt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#nextstmt}.
	 * @param ctx the parse tree
	 */
	void enterNextstmt(kbasParser.NextstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#nextstmt}.
	 * @param ctx the parse tree
	 */
	void exitNextstmt(kbasParser.NextstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#inputstmt}.
	 * @param ctx the parse tree
	 */
	void enterInputstmt(kbasParser.InputstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#inputstmt}.
	 * @param ctx the parse tree
	 */
	void exitInputstmt(kbasParser.InputstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#readstmt}.
	 * @param ctx the parse tree
	 */
	void enterReadstmt(kbasParser.ReadstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#readstmt}.
	 * @param ctx the parse tree
	 */
	void exitReadstmt(kbasParser.ReadstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#dimstmt}.
	 * @param ctx the parse tree
	 */
	void enterDimstmt(kbasParser.DimstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#dimstmt}.
	 * @param ctx the parse tree
	 */
	void exitDimstmt(kbasParser.DimstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#gotostmt}.
	 * @param ctx the parse tree
	 */
	void enterGotostmt(kbasParser.GotostmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#gotostmt}.
	 * @param ctx the parse tree
	 */
	void exitGotostmt(kbasParser.GotostmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#gosubstmt}.
	 * @param ctx the parse tree
	 */
	void enterGosubstmt(kbasParser.GosubstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#gosubstmt}.
	 * @param ctx the parse tree
	 */
	void exitGosubstmt(kbasParser.GosubstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#gpsstmt}.
	 * @param ctx the parse tree
	 */
	void enterGpsstmt(kbasParser.GpsstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#gpsstmt}.
	 * @param ctx the parse tree
	 */
	void exitGpsstmt(kbasParser.GpsstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#returnsubstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnsubstmt(kbasParser.ReturnsubstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#returnsubstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnsubstmt(kbasParser.ReturnsubstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#psstmt}.
	 * @param ctx the parse tree
	 */
	void enterPsstmt(kbasParser.PsstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#psstmt}.
	 * @param ctx the parse tree
	 */
	void exitPsstmt(kbasParser.PsstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#pokestmt}.
	 * @param ctx the parse tree
	 */
	void enterPokestmt(kbasParser.PokestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#pokestmt}.
	 * @param ctx the parse tree
	 */
	void exitPokestmt(kbasParser.PokestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(kbasParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(kbasParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#hplotstmt}.
	 * @param ctx the parse tree
	 */
	void enterHplotstmt(kbasParser.HplotstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#hplotstmt}.
	 * @param ctx the parse tree
	 */
	void exitHplotstmt(kbasParser.HplotstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#vplotstmt}.
	 * @param ctx the parse tree
	 */
	void enterVplotstmt(kbasParser.VplotstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#vplotstmt}.
	 * @param ctx the parse tree
	 */
	void exitVplotstmt(kbasParser.VplotstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#plotstmt}.
	 * @param ctx the parse tree
	 */
	void enterPlotstmt(kbasParser.PlotstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#plotstmt}.
	 * @param ctx the parse tree
	 */
	void exitPlotstmt(kbasParser.PlotstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#vtabstmnt}.
	 * @param ctx the parse tree
	 */
	void enterVtabstmnt(kbasParser.VtabstmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#vtabstmnt}.
	 * @param ctx the parse tree
	 */
	void exitVtabstmnt(kbasParser.VtabstmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#htabstmnt}.
	 * @param ctx the parse tree
	 */
	void enterHtabstmnt(kbasParser.HtabstmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#htabstmnt}.
	 * @param ctx the parse tree
	 */
	void exitHtabstmnt(kbasParser.HtabstmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#himemstmt}.
	 * @param ctx the parse tree
	 */
	void enterHimemstmt(kbasParser.HimemstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#himemstmt}.
	 * @param ctx the parse tree
	 */
	void exitHimemstmt(kbasParser.HimemstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#lomemstmt}.
	 * @param ctx the parse tree
	 */
	void enterLomemstmt(kbasParser.LomemstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#lomemstmt}.
	 * @param ctx the parse tree
	 */
	void exitLomemstmt(kbasParser.LomemstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#datastmt}.
	 * @param ctx the parse tree
	 */
	void enterDatastmt(kbasParser.DatastmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#datastmt}.
	 * @param ctx the parse tree
	 */
	void exitDatastmt(kbasParser.DatastmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#datum}.
	 * @param ctx the parse tree
	 */
	void enterDatum(kbasParser.DatumContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#datum}.
	 * @param ctx the parse tree
	 */
	void exitDatum(kbasParser.DatumContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#waitstmt}.
	 * @param ctx the parse tree
	 */
	void enterWaitstmt(kbasParser.WaitstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#waitstmt}.
	 * @param ctx the parse tree
	 */
	void exitWaitstmt(kbasParser.WaitstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#xdrawstmt}.
	 * @param ctx the parse tree
	 */
	void enterXdrawstmt(kbasParser.XdrawstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#xdrawstmt}.
	 * @param ctx the parse tree
	 */
	void exitXdrawstmt(kbasParser.XdrawstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#drawstmt}.
	 * @param ctx the parse tree
	 */
	void enterDrawstmt(kbasParser.DrawstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#drawstmt}.
	 * @param ctx the parse tree
	 */
	void exitDrawstmt(kbasParser.DrawstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#defstmt}.
	 * @param ctx the parse tree
	 */
	void enterDefstmt(kbasParser.DefstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#defstmt}.
	 * @param ctx the parse tree
	 */
	void exitDefstmt(kbasParser.DefstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#tabstmt}.
	 * @param ctx the parse tree
	 */
	void enterTabstmt(kbasParser.TabstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#tabstmt}.
	 * @param ctx the parse tree
	 */
	void exitTabstmt(kbasParser.TabstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#speedstmt}.
	 * @param ctx the parse tree
	 */
	void enterSpeedstmt(kbasParser.SpeedstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#speedstmt}.
	 * @param ctx the parse tree
	 */
	void exitSpeedstmt(kbasParser.SpeedstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#rotstmt}.
	 * @param ctx the parse tree
	 */
	void enterRotstmt(kbasParser.RotstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#rotstmt}.
	 * @param ctx the parse tree
	 */
	void exitRotstmt(kbasParser.RotstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#scalestmt}.
	 * @param ctx the parse tree
	 */
	void enterScalestmt(kbasParser.ScalestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#scalestmt}.
	 * @param ctx the parse tree
	 */
	void exitScalestmt(kbasParser.ScalestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#colorstmt}.
	 * @param ctx the parse tree
	 */
	void enterColorstmt(kbasParser.ColorstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#colorstmt}.
	 * @param ctx the parse tree
	 */
	void exitColorstmt(kbasParser.ColorstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#hcolorstmt}.
	 * @param ctx the parse tree
	 */
	void enterHcolorstmt(kbasParser.HcolorstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#hcolorstmt}.
	 * @param ctx the parse tree
	 */
	void exitHcolorstmt(kbasParser.HcolorstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#hlinstmt}.
	 * @param ctx the parse tree
	 */
	void enterHlinstmt(kbasParser.HlinstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#hlinstmt}.
	 * @param ctx the parse tree
	 */
	void exitHlinstmt(kbasParser.HlinstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#vlinstmt}.
	 * @param ctx the parse tree
	 */
	void enterVlinstmt(kbasParser.VlinstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#vlinstmt}.
	 * @param ctx the parse tree
	 */
	void exitVlinstmt(kbasParser.VlinstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#onerrstmt}.
	 * @param ctx the parse tree
	 */
	void enterOnerrstmt(kbasParser.OnerrstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#onerrstmt}.
	 * @param ctx the parse tree
	 */
	void exitOnerrstmt(kbasParser.OnerrstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#prstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrstmt(kbasParser.PrstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#prstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrstmt(kbasParser.PrstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#instmt}.
	 * @param ctx the parse tree
	 */
	void enterInstmt(kbasParser.InstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#instmt}.
	 * @param ctx the parse tree
	 */
	void exitInstmt(kbasParser.InstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#storestmt}.
	 * @param ctx the parse tree
	 */
	void enterStorestmt(kbasParser.StorestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#storestmt}.
	 * @param ctx the parse tree
	 */
	void exitStorestmt(kbasParser.StorestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#recallstmt}.
	 * @param ctx the parse tree
	 */
	void enterRecallstmt(kbasParser.RecallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#recallstmt}.
	 * @param ctx the parse tree
	 */
	void exitRecallstmt(kbasParser.RecallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#liststmt}.
	 * @param ctx the parse tree
	 */
	void enterListstmt(kbasParser.ListstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#liststmt}.
	 * @param ctx the parse tree
	 */
	void exitListstmt(kbasParser.ListstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#popstmt}.
	 * @param ctx the parse tree
	 */
	void enterPopstmt(kbasParser.PopstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#popstmt}.
	 * @param ctx the parse tree
	 */
	void exitPopstmt(kbasParser.PopstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#amptstmt}.
	 * @param ctx the parse tree
	 */
	void enterAmptstmt(kbasParser.AmptstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#amptstmt}.
	 * @param ctx the parse tree
	 */
	void exitAmptstmt(kbasParser.AmptstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#includestmt}.
	 * @param ctx the parse tree
	 */
	void enterIncludestmt(kbasParser.IncludestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#includestmt}.
	 * @param ctx the parse tree
	 */
	void exitIncludestmt(kbasParser.IncludestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#endstmt}.
	 * @param ctx the parse tree
	 */
	void enterEndstmt(kbasParser.EndstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#endstmt}.
	 * @param ctx the parse tree
	 */
	void exitEndstmt(kbasParser.EndstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(kbasParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(kbasParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#restorestmt}.
	 * @param ctx the parse tree
	 */
	void enterRestorestmt(kbasParser.RestorestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#restorestmt}.
	 * @param ctx the parse tree
	 */
	void exitRestorestmt(kbasParser.RestorestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(kbasParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(kbasParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#stringer}.
	 * @param ctx the parse tree
	 */
	void enterStringer(kbasParser.StringerContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#stringer}.
	 * @param ctx the parse tree
	 */
	void exitStringer(kbasParser.StringerContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(kbasParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(kbasParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSignExp(kbasParser.SignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSignExp(kbasParser.SignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExponentExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentExp(kbasParser.ExponentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExponentExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentExp(kbasParser.ExponentExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(kbasParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(kbasParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(kbasParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(kbasParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(kbasParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelExp}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(kbasParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(kbasParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(kbasParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(kbasParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link kbasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(kbasParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(kbasParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(kbasParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(kbasParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(kbasParser.VarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#varsuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarsuffix(kbasParser.VarsuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#varsuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarsuffix(kbasParser.VarsuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(kbasParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(kbasParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(kbasParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(kbasParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#sqrfunc}.
	 * @param ctx the parse tree
	 */
	void enterSqrfunc(kbasParser.SqrfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#sqrfunc}.
	 * @param ctx the parse tree
	 */
	void exitSqrfunc(kbasParser.SqrfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#chrfunc}.
	 * @param ctx the parse tree
	 */
	void enterChrfunc(kbasParser.ChrfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#chrfunc}.
	 * @param ctx the parse tree
	 */
	void exitChrfunc(kbasParser.ChrfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#lenfunc}.
	 * @param ctx the parse tree
	 */
	void enterLenfunc(kbasParser.LenfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#lenfunc}.
	 * @param ctx the parse tree
	 */
	void exitLenfunc(kbasParser.LenfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#ascfunc}.
	 * @param ctx the parse tree
	 */
	void enterAscfunc(kbasParser.AscfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#ascfunc}.
	 * @param ctx the parse tree
	 */
	void exitAscfunc(kbasParser.AscfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#midfunc}.
	 * @param ctx the parse tree
	 */
	void enterMidfunc(kbasParser.MidfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#midfunc}.
	 * @param ctx the parse tree
	 */
	void exitMidfunc(kbasParser.MidfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#pdlfunc}.
	 * @param ctx the parse tree
	 */
	void enterPdlfunc(kbasParser.PdlfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#pdlfunc}.
	 * @param ctx the parse tree
	 */
	void exitPdlfunc(kbasParser.PdlfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#peekfunc}.
	 * @param ctx the parse tree
	 */
	void enterPeekfunc(kbasParser.PeekfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#peekfunc}.
	 * @param ctx the parse tree
	 */
	void exitPeekfunc(kbasParser.PeekfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#intfunc}.
	 * @param ctx the parse tree
	 */
	void enterIntfunc(kbasParser.IntfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#intfunc}.
	 * @param ctx the parse tree
	 */
	void exitIntfunc(kbasParser.IntfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#spcfunc}.
	 * @param ctx the parse tree
	 */
	void enterSpcfunc(kbasParser.SpcfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#spcfunc}.
	 * @param ctx the parse tree
	 */
	void exitSpcfunc(kbasParser.SpcfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#frefunc}.
	 * @param ctx the parse tree
	 */
	void enterFrefunc(kbasParser.FrefuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#frefunc}.
	 * @param ctx the parse tree
	 */
	void exitFrefunc(kbasParser.FrefuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#posfunc}.
	 * @param ctx the parse tree
	 */
	void enterPosfunc(kbasParser.PosfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#posfunc}.
	 * @param ctx the parse tree
	 */
	void exitPosfunc(kbasParser.PosfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#usrfunc}.
	 * @param ctx the parse tree
	 */
	void enterUsrfunc(kbasParser.UsrfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#usrfunc}.
	 * @param ctx the parse tree
	 */
	void exitUsrfunc(kbasParser.UsrfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#leftfunc}.
	 * @param ctx the parse tree
	 */
	void enterLeftfunc(kbasParser.LeftfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#leftfunc}.
	 * @param ctx the parse tree
	 */
	void exitLeftfunc(kbasParser.LeftfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#rightfunc}.
	 * @param ctx the parse tree
	 */
	void enterRightfunc(kbasParser.RightfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#rightfunc}.
	 * @param ctx the parse tree
	 */
	void exitRightfunc(kbasParser.RightfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#strfunc}.
	 * @param ctx the parse tree
	 */
	void enterStrfunc(kbasParser.StrfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#strfunc}.
	 * @param ctx the parse tree
	 */
	void exitStrfunc(kbasParser.StrfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#fnfunc}.
	 * @param ctx the parse tree
	 */
	void enterFnfunc(kbasParser.FnfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#fnfunc}.
	 * @param ctx the parse tree
	 */
	void exitFnfunc(kbasParser.FnfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#valfunc}.
	 * @param ctx the parse tree
	 */
	void enterValfunc(kbasParser.ValfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#valfunc}.
	 * @param ctx the parse tree
	 */
	void exitValfunc(kbasParser.ValfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#scrnfunc}.
	 * @param ctx the parse tree
	 */
	void enterScrnfunc(kbasParser.ScrnfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#scrnfunc}.
	 * @param ctx the parse tree
	 */
	void exitScrnfunc(kbasParser.ScrnfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#sinfunc}.
	 * @param ctx the parse tree
	 */
	void enterSinfunc(kbasParser.SinfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#sinfunc}.
	 * @param ctx the parse tree
	 */
	void exitSinfunc(kbasParser.SinfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#cosfunc}.
	 * @param ctx the parse tree
	 */
	void enterCosfunc(kbasParser.CosfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#cosfunc}.
	 * @param ctx the parse tree
	 */
	void exitCosfunc(kbasParser.CosfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#tanfunc}.
	 * @param ctx the parse tree
	 */
	void enterTanfunc(kbasParser.TanfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#tanfunc}.
	 * @param ctx the parse tree
	 */
	void exitTanfunc(kbasParser.TanfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#atnfunc}.
	 * @param ctx the parse tree
	 */
	void enterAtnfunc(kbasParser.AtnfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#atnfunc}.
	 * @param ctx the parse tree
	 */
	void exitAtnfunc(kbasParser.AtnfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#rndfunc}.
	 * @param ctx the parse tree
	 */
	void enterRndfunc(kbasParser.RndfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#rndfunc}.
	 * @param ctx the parse tree
	 */
	void exitRndfunc(kbasParser.RndfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#sgnfunc}.
	 * @param ctx the parse tree
	 */
	void enterSgnfunc(kbasParser.SgnfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#sgnfunc}.
	 * @param ctx the parse tree
	 */
	void exitSgnfunc(kbasParser.SgnfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#expfunc}.
	 * @param ctx the parse tree
	 */
	void enterExpfunc(kbasParser.ExpfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#expfunc}.
	 * @param ctx the parse tree
	 */
	void exitExpfunc(kbasParser.ExpfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#logfunc}.
	 * @param ctx the parse tree
	 */
	void enterLogfunc(kbasParser.LogfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#logfunc}.
	 * @param ctx the parse tree
	 */
	void exitLogfunc(kbasParser.LogfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#absfunc}.
	 * @param ctx the parse tree
	 */
	void enterAbsfunc(kbasParser.AbsfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#absfunc}.
	 * @param ctx the parse tree
	 */
	void exitAbsfunc(kbasParser.AbsfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link kbasParser#tabfunc}.
	 * @param ctx the parse tree
	 */
	void enterTabfunc(kbasParser.TabfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link kbasParser#tabfunc}.
	 * @param ctx the parse tree
	 */
	void exitTabfunc(kbasParser.TabfuncContext ctx);
}