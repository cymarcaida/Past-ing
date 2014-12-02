// Generated from D:\Development\ANTLRWorks Languages\PASTing Language\Pasting.g4 by ANTLR 4.1


import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


/**
 * This class provides an empty implementation of {@link PastingListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class PastingBaseListener implements PastingListener
{
	HashMap<String, VarInfo> varTable = new HashMap<String, VarInfo>();
	//HashMap<String, FuncInfo> funcTable = new HashMap<String, FuncInfo>();
	
	boolean declFlag = false;
	
	String declType = "none";
	String currVar = "none";
	String varVal = "none";
	
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterElseIfStat(@NotNull PastingParser.ElseIfStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitElseIfStat(@NotNull PastingParser.ElseIfStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSwitchCon(@NotNull PastingParser.SwitchConContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSwitchCon(@NotNull PastingParser.SwitchConContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPrintStat(@NotNull PastingParser.PrintStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPrintStat(@NotNull PastingParser.PrintStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterElseStat(@NotNull PastingParser.ElseStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitElseStat(@NotNull PastingParser.ElseStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMain(@NotNull PastingParser.MainContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMain(@NotNull PastingParser.MainContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDeclStat(@NotNull PastingParser.DeclStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDeclStat(@NotNull PastingParser.DeclStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCaseCond(@NotNull PastingParser.CaseCondContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCaseCond(@NotNull PastingParser.CaseCondContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncCallVar(@NotNull PastingParser.FuncCallVarContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncCallVar(@NotNull PastingParser.FuncCallVarContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLoopStat(@NotNull PastingParser.LoopStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLoopStat(@NotNull PastingParser.LoopStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFunction(@NotNull PastingParser.FunctionContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFunction(@NotNull PastingParser.FunctionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterLocalDecl(@NotNull PastingParser.LocalDeclContext ctx)
	{
		declFlag = true;
		declType = ctx.DT().getText();
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitLocalDecl(@NotNull PastingParser.LocalDeclContext ctx)
	{
		declFlag = false;
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExpr(@NotNull PastingParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExpr(@NotNull PastingParser.ExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterBlock(@NotNull PastingParser.BlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitBlock(@NotNull PastingParser.BlockContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterScanStat(@NotNull PastingParser.ScanStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitScanStat(@NotNull PastingParser.ScanStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterScanCond(@NotNull PastingParser.ScanCondContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitScanCond(@NotNull PastingParser.ScanCondContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterRelExpr(@NotNull PastingParser.RelExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitRelExpr(@NotNull PastingParser.RelExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAssignExpr(@NotNull PastingParser.AssignExprContext ctx)
	{
		if(declFlag == true)
		{
			if(ctx.varName == null & currVar != "none")
			{
				String assignVarName = currVar;
				if(varTable.containsKey(assignVarName))
				{
					int lineNum = ctx.start.getLine();
					int charPos = ctx.start.getCharPositionInLine();
					System.out.println(lineNum + ":" + charPos + " variable name exists!");
				}
				else
				{
					VarInfo newVar = new VarInfo(declType, ctx.consRight.getText().toString());
					varTable.put(assignVarName, newVar);
				}
			}
			else
			{
				if(ctx.varName == null && currVar == "none")
				{
					int lineNum = ctx.start.getLine();
					int charPos = ctx.start.getCharPositionInLine();
					System.err.println(lineNum + ":" + charPos + " no identifier");
				}
			}
		}
		else
		{
			if(ctx.varName == null)
			{
				int lineNum = ctx.start.getLine();
				int charPos = ctx.start.getCharPositionInLine();
				System.err.println(lineNum + ":" + charPos + " no identifier");
			}
			else
			{
				String assignVarName = ctx.varName.getText().toString();
				if(varTable.containsKey(assignVarName))
				{
					VarInfo tempVar = varTable.get(assignVarName);
					tempVar.setValue(ctx.consRight.getText().toString());
					varTable.put(assignVarName, tempVar);
				}
				else
				{
					int lineNum = ctx.start.getLine();
					int charPos = ctx.start.getCharPositionInLine();
					System.err.println("line " + lineNum + ":" + charPos + " variable does not exist!");
				}
			}
		}
		System.out.println(varTable.get("k").getValue());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAssignExpr(@NotNull PastingParser.AssignExprContext ctx)
	{
		currVar = "none";
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterArrayValues(@NotNull PastingParser.ArrayValuesContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitArrayValues(@NotNull PastingParser.ArrayValuesContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterIfStat(@NotNull PastingParser.IfStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitIfStat(@NotNull PastingParser.IfStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCaseStat(@NotNull PastingParser.CaseStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCaseStat(@NotNull PastingParser.CaseStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterStat(@NotNull PastingParser.StatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitStat(@NotNull PastingParser.StatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSwitchStat(@NotNull PastingParser.SwitchStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSwitchStat(@NotNull PastingParser.SwitchStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExprStat(@NotNull PastingParser.ExprStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExprStat(@NotNull PastingParser.ExprStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterReturnExpr(@NotNull PastingParser.ReturnExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitReturnExpr(@NotNull PastingParser.ReturnExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterWhiledStat(@NotNull PastingParser.WhiledStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitWhiledStat(@NotNull PastingParser.WhiledStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterArrayDecl(@NotNull PastingParser.ArrayDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitArrayDecl(@NotNull PastingParser.ArrayDeclContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterIoStat(@NotNull PastingParser.IoStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitIoStat(@NotNull PastingParser.IoStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterProg(@NotNull PastingParser.ProgContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitProg(@NotNull PastingParser.ProgContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDowhiledStat(@NotNull PastingParser.DowhiledStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDowhiledStat(@NotNull PastingParser.DowhiledStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterForedStat(@NotNull PastingParser.ForedStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitForedStat(@NotNull PastingParser.ForedStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMathExpr(@NotNull PastingParser.MathExprContext ctx)
	{
		if(currVar != "none")
		{
			String val = varTable.get(currVar).getValue();
			String consLeft = ctx.consLeft.getText().toString();
			String consRight = ctx.consRight.getText().toString();
			String mathOp = ctx.mathOp.getText().toString();
			doOperation(mathOp, consLeft, consRight);
		}
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMathExpr(@NotNull PastingParser.MathExprContext ctx)
	{ }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDefStat(@NotNull PastingParser.DefStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDefStat(@NotNull PastingParser.DefStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSwitchBlock(@NotNull PastingParser.SwitchBlockContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSwitchBlock(@NotNull PastingParser.SwitchBlockContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncCall(@NotNull PastingParser.FuncCallContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncCall(@NotNull PastingParser.FuncCallContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterRetStat(@NotNull PastingParser.RetStatContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitRetStat(@NotNull PastingParser.RetStatContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVarDecl(@NotNull PastingParser.VarDeclContext ctx)
	{
		if(ctx.ID().getText().toString().isEmpty() == false)
		{
			String varName = ctx.ID().getText().toString();
			currVar = varName;
			if(varTable.containsKey(varName))
			{
				int lineNum = ctx.start.getLine();
				int charPos = ctx.start.getCharPositionInLine();
				System.err.println("line " + lineNum + ":" + charPos + " variable name exists!");
			}
			else
			{
				VarInfo newVar = new VarInfo(declType, "null");
				varTable.put(varName, newVar);
			}
		}
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVarDecl(@NotNull PastingParser.VarDeclContext ctx)
	{
		currVar = "none";
	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFuncVarDecl(@NotNull PastingParser.FuncVarDeclContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFuncVarDecl(@NotNull PastingParser.FuncVarDeclContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
	
	public void doOperation(String mathOp, String consLeft)
	{
		
	}
	
	public void doOperation(String mathOp, String consLeft, String consRight)
	{
		
	}
}