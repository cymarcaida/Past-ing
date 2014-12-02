// Generated from /Users/captcybok/Development/ANTLRWorks Languages/PASTing Language/Pasting.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PastingParser}.
 */
public interface PastingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PastingParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(@NotNull PastingParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(@NotNull PastingParser.ElseIfStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#switchCon}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCon(@NotNull PastingParser.SwitchConContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#switchCon}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCon(@NotNull PastingParser.SwitchConContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(@NotNull PastingParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(@NotNull PastingParser.PrintStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(@NotNull PastingParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(@NotNull PastingParser.ElseStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull PastingParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull PastingParser.MainContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#declStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclStat(@NotNull PastingParser.DeclStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#declStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclStat(@NotNull PastingParser.DeclStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#caseCond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCond(@NotNull PastingParser.CaseCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#caseCond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCond(@NotNull PastingParser.CaseCondContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#funcCallVar}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallVar(@NotNull PastingParser.FuncCallVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#funcCallVar}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallVar(@NotNull PastingParser.FuncCallVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void enterLoopStat(@NotNull PastingParser.LoopStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void exitLoopStat(@NotNull PastingParser.LoopStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull PastingParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull PastingParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecl(@NotNull PastingParser.LocalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#localDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecl(@NotNull PastingParser.LocalDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull PastingParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull PastingParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PastingParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PastingParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#scanStat}.
	 * @param ctx the parse tree
	 */
	void enterScanStat(@NotNull PastingParser.ScanStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#scanStat}.
	 * @param ctx the parse tree
	 */
	void exitScanStat(@NotNull PastingParser.ScanStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#scanCond}.
	 * @param ctx the parse tree
	 */
	void enterScanCond(@NotNull PastingParser.ScanCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#scanCond}.
	 * @param ctx the parse tree
	 */
	void exitScanCond(@NotNull PastingParser.ScanCondContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(@NotNull PastingParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(@NotNull PastingParser.RelExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(@NotNull PastingParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(@NotNull PastingParser.AssignExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValues(@NotNull PastingParser.ArrayValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValues(@NotNull PastingParser.ArrayValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull PastingParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull PastingParser.IfStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#caseStat}.
	 * @param ctx the parse tree
	 */
	void enterCaseStat(@NotNull PastingParser.CaseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#caseStat}.
	 * @param ctx the parse tree
	 */
	void exitCaseStat(@NotNull PastingParser.CaseStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull PastingParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull PastingParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#switchStat}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStat(@NotNull PastingParser.SwitchStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#switchStat}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStat(@NotNull PastingParser.SwitchStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(@NotNull PastingParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#exprStat}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(@NotNull PastingParser.ExprStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(@NotNull PastingParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(@NotNull PastingParser.ReturnExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#whiledStat}.
	 * @param ctx the parse tree
	 */
	void enterWhiledStat(@NotNull PastingParser.WhiledStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#whiledStat}.
	 * @param ctx the parse tree
	 */
	void exitWhiledStat(@NotNull PastingParser.WhiledStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(@NotNull PastingParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(@NotNull PastingParser.ArrayDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#ioStat}.
	 * @param ctx the parse tree
	 */
	void enterIoStat(@NotNull PastingParser.IoStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#ioStat}.
	 * @param ctx the parse tree
	 */
	void exitIoStat(@NotNull PastingParser.IoStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull PastingParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull PastingParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#dowhiledStat}.
	 * @param ctx the parse tree
	 */
	void enterDowhiledStat(@NotNull PastingParser.DowhiledStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#dowhiledStat}.
	 * @param ctx the parse tree
	 */
	void exitDowhiledStat(@NotNull PastingParser.DowhiledStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#foredStat}.
	 * @param ctx the parse tree
	 */
	void enterForedStat(@NotNull PastingParser.ForedStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#foredStat}.
	 * @param ctx the parse tree
	 */
	void exitForedStat(@NotNull PastingParser.ForedStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(@NotNull PastingParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(@NotNull PastingParser.MathExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#defStat}.
	 * @param ctx the parse tree
	 */
	void enterDefStat(@NotNull PastingParser.DefStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#defStat}.
	 * @param ctx the parse tree
	 */
	void exitDefStat(@NotNull PastingParser.DefStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull PastingParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull PastingParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull PastingParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull PastingParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#retStat}.
	 * @param ctx the parse tree
	 */
	void enterRetStat(@NotNull PastingParser.RetStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#retStat}.
	 * @param ctx the parse tree
	 */
	void exitRetStat(@NotNull PastingParser.RetStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull PastingParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull PastingParser.VarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link PastingParser#funcVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncVarDecl(@NotNull PastingParser.FuncVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PastingParser#funcVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncVarDecl(@NotNull PastingParser.FuncVarDeclContext ctx);
}