// Generated from /Users/captcybok/Development/ANTLRWorks Languages/PASTing Language/Pasting.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PastingParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, ASSIGN=20, GT=21, LT=22, BANG=23, TILDE=24, 
		QUESTION=25, COLON=26, EQUAL=27, LE=28, GE=29, NOTEQUAL=30, AND=31, OR=32, 
		INC=33, DEC=34, ADD=35, SUB=36, MUL=37, DIV=38, BITAND=39, BITOR=40, CARET=41, 
		MOD=42, OPAR=43, CPAR=44, OBRAC=45, CBRAC=46, OCURL=47, CCURL=48, DQUOTE=49, 
		SC=50, DT=51, CONS=52, ID=53, INT=54, WS=55, FLOAT=56, COMMENT=57, STRING=58, 
		CHAR=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'\"%f\"'", "'mained'", "'elsed'", "'cased'", "'printfed'", 
		"'breaked;'", "'fored'", "'doed'", "'switched'", "'\"%s\"'", "'whiled'", 
		"'scanfed'", "'elseifed'", "'returned'", "'defaulted'", "','", "'\"%d\"'", 
		"'\"%c\"'", "'ifed'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'\"'", "';'", "DT", "CONS", "ID", "INT", "WS", "FLOAT", 
		"COMMENT", "STRING", "CHAR"
	};
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_function = 2, RULE_localDecl = 3, RULE_varDecl = 4, 
		RULE_arrayDecl = 5, RULE_funcVarDecl = 6, RULE_funcCallVar = 7, RULE_expr = 8, 
		RULE_assignExpr = 9, RULE_arrayValues = 10, RULE_mathExpr = 11, RULE_relExpr = 12, 
		RULE_returnExpr = 13, RULE_funcCall = 14, RULE_stat = 15, RULE_block = 16, 
		RULE_declStat = 17, RULE_exprStat = 18, RULE_ifStat = 19, RULE_elseIfStat = 20, 
		RULE_elseStat = 21, RULE_loopStat = 22, RULE_whiledStat = 23, RULE_dowhiledStat = 24, 
		RULE_foredStat = 25, RULE_switchStat = 26, RULE_switchCon = 27, RULE_switchBlock = 28, 
		RULE_caseStat = 29, RULE_caseCond = 30, RULE_defStat = 31, RULE_ioStat = 32, 
		RULE_printStat = 33, RULE_scanStat = 34, RULE_scanCond = 35, RULE_retStat = 36;
	public static final String[] ruleNames = {
		"prog", "main", "function", "localDecl", "varDecl", "arrayDecl", "funcVarDecl", 
		"funcCallVar", "expr", "assignExpr", "arrayValues", "mathExpr", "relExpr", 
		"returnExpr", "funcCall", "stat", "block", "declStat", "exprStat", "ifStat", 
		"elseIfStat", "elseStat", "loopStat", "whiledStat", "dowhiledStat", "foredStat", 
		"switchStat", "switchCon", "switchBlock", "caseStat", "caseCond", "defStat", 
		"ioStat", "printStat", "scanStat", "scanCond", "retStat"
	};

	@Override
	public String getGrammarFileName() { return "Pasting.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PastingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(74); function();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(80); main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode DT() { return getToken(PastingParser.DT, 0); }
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(DT);
			setState(83); match(2);
			setState(84); match(OPAR);
			setState(85); match(CPAR);
			setState(86); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public TerminalNode DT() { return getToken(PastingParser.DT, 0); }
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public FuncVarDeclContext funcVarDecl() {
			return getRuleContext(FuncVarDeclContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(DT);
			setState(89); match(ID);
			setState(90); match(OPAR);
			setState(91); funcVarDecl();
			setState(92); match(CPAR);
			setState(93); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclContext extends ParserRuleContext {
		public TerminalNode DT() { return getToken(PastingParser.DT, 0); }
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
		}
		public LocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterLocalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitLocalDecl(this);
		}
	}

	public final LocalDeclContext localDecl() throws RecognitionException {
		LocalDeclContext _localctx = new LocalDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_localDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(DT);
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(96); varDecl();
				}
				break;

			case 2:
				{
				setState(97); arrayDecl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(ID);
			setState(102);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << CONS) | (1L << ID))) != 0)) {
				{
				setState(101); expr();
				}
			}

			setState(106);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(104); match(16);
				setState(105); varDecl();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclContext extends ParserRuleContext {
		public Token size;
		public List<TerminalNode> ID() { return getTokens(PastingParser.ID); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PastingParser.ID, i);
		}
		public TerminalNode OBRAC() { return getToken(PastingParser.OBRAC, 0); }
		public TerminalNode CONS() { return getToken(PastingParser.CONS, 0); }
		public TerminalNode CBRAC() { return getToken(PastingParser.CBRAC, 0); }
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitArrayDecl(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(ID);
			setState(109); match(OBRAC);
			setState(110);
			((ArrayDeclContext)_localctx).size = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CONS || _la==ID) ) {
				((ArrayDeclContext)_localctx).size = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(111); match(CBRAC);
			setState(113);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << CONS) | (1L << ID))) != 0)) {
				{
				setState(112); expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncVarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public TerminalNode DT() { return getToken(PastingParser.DT, 0); }
		public FuncVarDeclContext funcVarDecl(int i) {
			return getRuleContext(FuncVarDeclContext.class,i);
		}
		public List<FuncVarDeclContext> funcVarDecl() {
			return getRuleContexts(FuncVarDeclContext.class);
		}
		public FuncVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterFuncVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitFuncVarDecl(this);
		}
	}

	public final FuncVarDeclContext funcVarDecl() throws RecognitionException {
		FuncVarDeclContext _localctx = new FuncVarDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcVarDecl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(DT);
			setState(116); match(ID);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(117); match(16);
					setState(118); funcVarDecl();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallVarContext extends ParserRuleContext {
		public Token fcCONS;
		public Token fcCons;
		public List<TerminalNode> ID() { return getTokens(PastingParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PastingParser.ID, i);
		}
		public List<TerminalNode> CONS() { return getTokens(PastingParser.CONS); }
		public TerminalNode CONS(int i) {
			return getToken(PastingParser.CONS, i);
		}
		public FuncCallVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterFuncCallVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitFuncCallVar(this);
		}
	}

	public final FuncCallVarContext funcCallVar() throws RecognitionException {
		FuncCallVarContext _localctx = new FuncCallVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCallVar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((FuncCallVarContext)_localctx).fcCONS = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CONS || _la==ID) ) {
				((FuncCallVarContext)_localctx).fcCONS = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(125); match(16);
					setState(126);
					((FuncCallVarContext)_localctx).fcCons = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CONS || _la==ID) ) {
						((FuncCallVarContext)_localctx).fcCons = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public RelExprContext relExpr() {
			return getRuleContext(RelExprContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); funcCall();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); assignExpr();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); mathExpr();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); relExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExprContext extends ParserRuleContext {
		public Token varName;
		public Token index;
		public Token consRight;
		public TerminalNode ASSIGN() { return getToken(PastingParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(PastingParser.ID); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PastingParser.ID, i);
		}
		public List<TerminalNode> CONS() { return getTokens(PastingParser.CONS); }
		public TerminalNode OBRAC() { return getToken(PastingParser.OBRAC, 0); }
		public TerminalNode CBRAC() { return getToken(PastingParser.CBRAC, 0); }
		public TerminalNode CONS(int i) {
			return getToken(PastingParser.CONS, i);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitAssignExpr(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(138); ((AssignExprContext)_localctx).varName = match(ID);
				setState(142);
				_la = _input.LA(1);
				if (_la==OBRAC) {
					{
					setState(139); match(OBRAC);
					setState(140);
					((AssignExprContext)_localctx).index = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CONS || _la==ID) ) {
						((AssignExprContext)_localctx).index = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(141); match(CBRAC);
					}
				}

				}
			}

			setState(146); match(ASSIGN);
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(147); expr();
				}
				break;

			case 2:
				{
				setState(148); arrayValues();
				}
				break;

			case 3:
				{
				setState(149);
				((AssignExprContext)_localctx).consRight = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((AssignExprContext)_localctx).consRight = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayValuesContext extends ParserRuleContext {
		public Token arrayCons;
		public TerminalNode OCURL() { return getToken(PastingParser.OCURL, 0); }
		public TerminalNode CCURL() { return getToken(PastingParser.CCURL, 0); }
		public List<TerminalNode> CONS() { return getTokens(PastingParser.CONS); }
		public TerminalNode CONS(int i) {
			return getToken(PastingParser.CONS, i);
		}
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitArrayValues(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayValues);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(OCURL);
			setState(153); ((ArrayValuesContext)_localctx).arrayCons = match(CONS);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(154); match(16);
					setState(155); ((ArrayValuesContext)_localctx).arrayCons = match(CONS);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(161); match(CCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathExprContext extends ParserRuleContext {
		public Token consLeft;
		public Token mathOp;
		public Token consRight;
		public List<TerminalNode> ID() { return getTokens(PastingParser.ID); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(PastingParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(PastingParser.ADD, 0); }
		public TerminalNode ID(int i) {
			return getToken(PastingParser.ID, i);
		}
		public List<TerminalNode> CONS() { return getTokens(PastingParser.CONS); }
		public TerminalNode DIV() { return getToken(PastingParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(PastingParser.MUL, 0); }
		public TerminalNode CONS(int i) {
			return getToken(PastingParser.CONS, i);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitMathExpr(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if (_la==CONS || _la==ID) {
				{
				setState(163);
				((MathExprContext)_localctx).consLeft = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((MathExprContext)_localctx).consLeft = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(166);
			((MathExprContext)_localctx).mathOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				((MathExprContext)_localctx).mathOp = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(167); expr();
				}
				break;

			case 2:
				{
				setState(168);
				((MathExprContext)_localctx).consRight = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((MathExprContext)_localctx).consRight = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExprContext extends ParserRuleContext {
		public Token consLeft;
		public Token relOp;
		public Token consRight;
		public TerminalNode GE() { return getToken(PastingParser.GE, 0); }
		public TerminalNode LT() { return getToken(PastingParser.LT, 0); }
		public TerminalNode GT() { return getToken(PastingParser.GT, 0); }
		public TerminalNode LE() { return getToken(PastingParser.LE, 0); }
		public TerminalNode ID(int i) {
			return getToken(PastingParser.ID, i);
		}
		public TerminalNode OR() { return getToken(PastingParser.OR, 0); }
		public TerminalNode CONS(int i) {
			return getToken(PastingParser.CONS, i);
		}
		public TerminalNode EQUAL() { return getToken(PastingParser.EQUAL, 0); }
		public List<TerminalNode> ID() { return getTokens(PastingParser.ID); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(PastingParser.AND, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PastingParser.NOTEQUAL, 0); }
		public List<TerminalNode> CONS() { return getTokens(PastingParser.CONS); }
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitRelExpr(this);
		}
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if (_la==CONS || _la==ID) {
				{
				setState(171);
				((RelExprContext)_localctx).consLeft = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((RelExprContext)_localctx).consLeft = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(174);
			((RelExprContext)_localctx).relOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR))) != 0)) ) {
				((RelExprContext)_localctx).relOp = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(175); expr();
				}
				break;

			case 2:
				{
				setState(176);
				((RelExprContext)_localctx).consRight = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((RelExprContext)_localctx).consRight = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnExprContext extends ParserRuleContext {
		public Token consRet;
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONS() { return getToken(PastingParser.CONS, 0); }
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitReturnExpr(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(14);
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(180);
				((ReturnExprContext)_localctx).consRet = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((ReturnExprContext)_localctx).consRet = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				{
				setState(181); expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public FuncCallVarContext funcCallVar() {
			return getRuleContext(FuncCallVarContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(ID);
			setState(185); match(OPAR);
			setState(186); funcCallVar();
			setState(187); match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public IoStatContext ioStat() {
			return getRuleContext(IoStatContext.class,0);
		}
		public DeclStatContext declStat() {
			return getRuleContext(DeclStatContext.class,0);
		}
		public SwitchStatContext switchStat() {
			return getRuleContext(SwitchStatContext.class,0);
		}
		public ExprStatContext exprStat() {
			return getRuleContext(ExprStatContext.class,0);
		}
		public RetStatContext retStat() {
			return getRuleContext(RetStatContext.class,0);
		}
		public LoopStatContext loopStat() {
			return getRuleContext(LoopStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case DT:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); declStat();
				}
				break;
			case ASSIGN:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
			case AND:
			case OR:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case CONS:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); exprStat();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); ifStat();
				}
				break;
			case 7:
			case 8:
			case 11:
				enterOuterAlt(_localctx, 4);
				{
				setState(192); loopStat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(193); switchStat();
				}
				break;
			case 5:
			case 12:
				enterOuterAlt(_localctx, 6);
				{
				setState(194); ioStat();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 7);
				{
				setState(195); retStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OCURL() { return getToken(PastingParser.OCURL, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode CCURL() { return getToken(PastingParser.CCURL, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(OCURL);
			setState(199); stat();
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(200); stat();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(206); match(CCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclStatContext extends ParserRuleContext {
		public LocalDeclContext localDecl() {
			return getRuleContext(LocalDeclContext.class,0);
		}
		public TerminalNode SC() { return getToken(PastingParser.SC, 0); }
		public DeclStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterDeclStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitDeclStat(this);
		}
	}

	public final DeclStatContext declStat() throws RecognitionException {
		DeclStatContext _localctx = new DeclStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); localDecl();
			setState(209); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(PastingParser.SC, 0); }
		public ExprStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterExprStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitExprStat(this);
		}
	}

	public final ExprStatContext exprStat() throws RecognitionException {
		ExprStatContext _localctx = new ExprStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); expr();
			setState(212); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public ElseIfStatContext elseIfStat() {
			return getRuleContext(ElseIfStatContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitIfStat(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(19);
			setState(215); match(OPAR);
			setState(216); expr();
			setState(217); match(CPAR);
			setState(220);
			switch (_input.LA(1)) {
			case 5:
			case 7:
			case 8:
			case 9:
			case 11:
			case 12:
			case 14:
			case 19:
			case ASSIGN:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
			case AND:
			case OR:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case DT:
			case CONS:
			case ID:
				{
				setState(218); stat();
				}
				break;
			case OCURL:
				{
				setState(219); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(222); elseIfStat();
				}
				break;

			case 2:
				{
				setState(223); elseStat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public ElseIfStatContext elseIfStat() {
			return getRuleContext(ElseIfStatContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitElseIfStat(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseIfStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(13);
			setState(227); match(OPAR);
			setState(228); expr();
			setState(229); match(CPAR);
			setState(232);
			switch (_input.LA(1)) {
			case 5:
			case 7:
			case 8:
			case 9:
			case 11:
			case 12:
			case 14:
			case 19:
			case ASSIGN:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
			case AND:
			case OR:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case DT:
			case CONS:
			case ID:
				{
				setState(230); stat();
				}
				break;
			case OCURL:
				{
				setState(231); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(235);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(234); elseIfStat();
				}
			}

			setState(237); elseStat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitElseStat(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(3);
			setState(242);
			switch (_input.LA(1)) {
			case 5:
			case 7:
			case 8:
			case 9:
			case 11:
			case 12:
			case 14:
			case 19:
			case ASSIGN:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
			case AND:
			case OR:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case DT:
			case CONS:
			case ID:
				{
				setState(240); stat();
				}
				break;
			case OCURL:
				{
				setState(241); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatContext extends ParserRuleContext {
		public ForedStatContext foredStat() {
			return getRuleContext(ForedStatContext.class,0);
		}
		public WhiledStatContext whiledStat() {
			return getRuleContext(WhiledStatContext.class,0);
		}
		public DowhiledStatContext dowhiledStat() {
			return getRuleContext(DowhiledStatContext.class,0);
		}
		public LoopStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterLoopStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitLoopStat(this);
		}
	}

	public final LoopStatContext loopStat() throws RecognitionException {
		LoopStatContext _localctx = new LoopStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopStat);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); whiledStat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); dowhiledStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 3);
				{
				setState(246); foredStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhiledStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public WhiledStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterWhiledStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitWhiledStat(this);
		}
	}

	public final WhiledStatContext whiledStat() throws RecognitionException {
		WhiledStatContext _localctx = new WhiledStatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whiledStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(11);
			setState(250); match(OPAR);
			setState(251); expr();
			setState(252); match(CPAR);
			setState(255);
			switch (_input.LA(1)) {
			case 5:
			case 7:
			case 8:
			case 9:
			case 11:
			case 12:
			case 14:
			case 19:
			case ASSIGN:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
			case AND:
			case OR:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case DT:
			case CONS:
			case ID:
				{
				setState(253); stat();
				}
				break;
			case OCURL:
				{
				setState(254); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DowhiledStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SC() { return getToken(PastingParser.SC, 0); }
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public DowhiledStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhiledStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterDowhiledStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitDowhiledStat(this);
		}
	}

	public final DowhiledStatContext dowhiledStat() throws RecognitionException {
		DowhiledStatContext _localctx = new DowhiledStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dowhiledStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(8);
			setState(258); block();
			setState(259); match(11);
			setState(260); match(OPAR);
			setState(261); expr();
			setState(262); match(CPAR);
			setState(263); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForedStatContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public TerminalNode SC(int i) {
			return getToken(PastingParser.SC, i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SC() { return getTokens(PastingParser.SC); }
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public ForedStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foredStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterForedStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitForedStat(this);
		}
	}

	public final ForedStatContext foredStat() throws RecognitionException {
		ForedStatContext _localctx = new ForedStatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_foredStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(7);
			setState(266); match(OPAR);
			setState(267); expr();
			setState(268); match(SC);
			setState(269); expr();
			setState(270); match(SC);
			setState(271); expr();
			setState(272); match(CPAR);
			setState(275);
			switch (_input.LA(1)) {
			case 5:
			case 7:
			case 8:
			case 9:
			case 11:
			case 12:
			case 14:
			case 19:
			case ASSIGN:
			case GT:
			case LT:
			case EQUAL:
			case LE:
			case GE:
			case NOTEQUAL:
			case AND:
			case OR:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case DT:
			case CONS:
			case ID:
				{
				setState(273); stat();
				}
				break;
			case OCURL:
				{
				setState(274); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchConContext switchCon() {
			return getRuleContext(SwitchConContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public SwitchStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterSwitchStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitSwitchStat(this);
		}
	}

	public final SwitchStatContext switchStat() throws RecognitionException {
		SwitchStatContext _localctx = new SwitchStatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switchStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(9);
			setState(278); match(OPAR);
			setState(279); switchCon();
			setState(280); match(CPAR);
			setState(281); switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchConContext extends ParserRuleContext {
		public Token consSwitch;
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONS() { return getToken(PastingParser.CONS, 0); }
		public SwitchConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterSwitchCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitSwitchCon(this);
		}
	}

	public final SwitchConContext switchCon() throws RecognitionException {
		SwitchConContext _localctx = new SwitchConContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchCon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(283);
				((SwitchConContext)_localctx).consSwitch = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((SwitchConContext)_localctx).consSwitch = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				{
				setState(284); expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public DefStatContext defStat() {
			return getRuleContext(DefStatContext.class,0);
		}
		public List<CaseStatContext> caseStat() {
			return getRuleContexts(CaseStatContext.class);
		}
		public CaseStatContext caseStat(int i) {
			return getRuleContext(CaseStatContext.class,i);
		}
		public TerminalNode OCURL() { return getToken(PastingParser.OCURL, 0); }
		public TerminalNode CCURL() { return getToken(PastingParser.CCURL, 0); }
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(OCURL);
			setState(288); caseStat();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(289); caseStat();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(296);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(295); defStat();
				}
			}

			setState(298); match(CCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatContext extends ParserRuleContext {
		public Token consCased;
		public TerminalNode COLON() { return getToken(PastingParser.COLON, 0); }
		public CaseCondContext caseCond() {
			return getRuleContext(CaseCondContext.class,0);
		}
		public TerminalNode CONS() { return getToken(PastingParser.CONS, 0); }
		public CaseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterCaseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitCaseStat(this);
		}
	}

	public final CaseStatContext caseStat() throws RecognitionException {
		CaseStatContext _localctx = new CaseStatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(4);
			setState(301); ((CaseStatContext)_localctx).consCased = match(CONS);
			setState(302); match(COLON);
			setState(303); caseCond();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseCondContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public CaseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterCaseCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitCaseCond(this);
		}
	}

	public final CaseCondContext caseCond() throws RecognitionException {
		CaseCondContext _localctx = new CaseCondContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_caseCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); stat();
			setState(307);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 19) | (1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << DT) | (1L << CONS) | (1L << ID))) != 0)) {
				{
				setState(306); stat();
				}
			}

			setState(310);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(309); match(6);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefStatContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PastingParser.COLON, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public DefStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterDefStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitDefStat(this);
		}
	}

	public final DefStatContext defStat() throws RecognitionException {
		DefStatContext _localctx = new DefStatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_defStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(15);
			setState(313); match(COLON);
			setState(314); stat();
			setState(316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 19) | (1L << ASSIGN) | (1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << DT) | (1L << CONS) | (1L << ID))) != 0)) {
				{
				setState(315); stat();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoStatContext extends ParserRuleContext {
		public PrintStatContext printStat() {
			return getRuleContext(PrintStatContext.class,0);
		}
		public ScanStatContext scanStat() {
			return getRuleContext(ScanStatContext.class,0);
		}
		public TerminalNode SC() { return getToken(PastingParser.SC, 0); }
		public IoStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterIoStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitIoStat(this);
		}
	}

	public final IoStatContext ioStat() throws RecognitionException {
		IoStatContext _localctx = new IoStatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ioStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			switch (_input.LA(1)) {
			case 5:
				{
				setState(318); printStat();
				}
				break;
			case 12:
				{
				setState(319); scanStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322); match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatContext extends ParserRuleContext {
		public Token print;
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public TerminalNode CONS() { return getToken(PastingParser.CONS, 0); }
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public PrintStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterPrintStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitPrintStat(this);
		}
	}

	public final PrintStatContext printStat() throws RecognitionException {
		PrintStatContext _localctx = new PrintStatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_printStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(5);
			setState(325); match(OPAR);
			setState(326);
			((PrintStatContext)_localctx).print = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CONS || _la==ID) ) {
				((PrintStatContext)_localctx).print = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(327); match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanStatContext extends ParserRuleContext {
		public TerminalNode CPAR() { return getToken(PastingParser.CPAR, 0); }
		public ScanCondContext scanCond() {
			return getRuleContext(ScanCondContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(PastingParser.OPAR, 0); }
		public ScanStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterScanStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitScanStat(this);
		}
	}

	public final ScanStatContext scanStat() throws RecognitionException {
		ScanStatContext _localctx = new ScanStatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_scanStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(12);
			setState(330); match(OPAR);
			setState(331); scanCond();
			setState(332); match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanCondContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public ScanCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterScanCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitScanCond(this);
		}
	}

	public final ScanCondContext scanCond() throws RecognitionException {
		ScanCondContext _localctx = new ScanCondContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_scanCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 10) | (1L << 17) | (1L << 18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(335); match(16);
			setState(336); match(BITAND);
			setState(337); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetStatContext extends ParserRuleContext {
		public Token retCons;
		public TerminalNode ID() { return getToken(PastingParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONS() { return getToken(PastingParser.CONS, 0); }
		public RetStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).enterRetStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PastingListener ) ((PastingListener)listener).exitRetStat(this);
		}
	}

	public final RetStatContext retStat() throws RecognitionException {
		RetStatContext _localctx = new RetStatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_retStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(14);
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(340);
				((RetStatContext)_localctx).retCons = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONS || _la==ID) ) {
					((RetStatContext)_localctx).retCons = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				{
				setState(341); expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3=\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5"+
		"e\n\5\3\6\3\6\5\6i\n\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\7\5\7t\n\7\3"+
		"\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16"+
		"\t\u0085\13\t\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\5\13\u0091"+
		"\n\13\5\13\u0093\n\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f"+
		"\3\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\f\3\f\3\r\5\r\u00a7\n\r\3\r\3"+
		"\r\3\r\5\r\u00ac\n\r\3\16\5\16\u00af\n\16\3\16\3\16\3\16\5\16\u00b4\n"+
		"\16\3\17\3\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\22\3\22\3\22\7\22\u00cc\n"+
		"\22\f\22\16\22\u00cf\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00df\n\25\3\25\3\25\5\25\u00e3\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u00eb\n\26\3\26\5\26\u00ee\n\26\3\26"+
		"\3\26\3\27\3\27\3\27\5\27\u00f5\n\27\3\30\3\30\3\30\5\30\u00fa\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u0102\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0116\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u0120\n\35\3"+
		"\36\3\36\3\36\7\36\u0125\n\36\f\36\16\36\u0128\13\36\3\36\5\36\u012b\n"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \5 \u0136\n \3 \5 \u0139\n"+
		" \3!\3!\3!\3!\5!\u013f\n!\3\"\3\"\5\"\u0143\n\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\5&\u0159\n&\3&\bO{\u0083\u00a0"+
		"\u00cd\u0126\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJ\2\6\3\2\66\67\3\2%(\4\2\27\30\35\"\5\2\3\3\f\f\23\24\u0162"+
		"\2O\3\2\2\2\4T\3\2\2\2\6Z\3\2\2\2\ba\3\2\2\2\nf\3\2\2\2\fn\3\2\2\2\16"+
		"u\3\2\2\2\20~\3\2\2\2\22\u008a\3\2\2\2\24\u0092\3\2\2\2\26\u009a\3\2\2"+
		"\2\30\u00a6\3\2\2\2\32\u00ae\3\2\2\2\34\u00b5\3\2\2\2\36\u00ba\3\2\2\2"+
		" \u00c6\3\2\2\2\"\u00c8\3\2\2\2$\u00d2\3\2\2\2&\u00d5\3\2\2\2(\u00d8\3"+
		"\2\2\2*\u00e4\3\2\2\2,\u00f1\3\2\2\2.\u00f9\3\2\2\2\60\u00fb\3\2\2\2\62"+
		"\u0103\3\2\2\2\64\u010b\3\2\2\2\66\u0117\3\2\2\28\u011f\3\2\2\2:\u0121"+
		"\3\2\2\2<\u012e\3\2\2\2>\u0133\3\2\2\2@\u013a\3\2\2\2B\u0142\3\2\2\2D"+
		"\u0146\3\2\2\2F\u014b\3\2\2\2H\u0150\3\2\2\2J\u0155\3\2\2\2LN\5\6\4\2"+
		"ML\3\2\2\2NQ\3\2\2\2OP\3\2\2\2OM\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\5\4\3\2"+
		"S\3\3\2\2\2TU\7\65\2\2UV\7\4\2\2VW\7-\2\2WX\7.\2\2XY\5\"\22\2Y\5\3\2\2"+
		"\2Z[\7\65\2\2[\\\7\67\2\2\\]\7-\2\2]^\5\16\b\2^_\7.\2\2_`\5\"\22\2`\7"+
		"\3\2\2\2ad\7\65\2\2be\5\n\6\2ce\5\f\7\2db\3\2\2\2dc\3\2\2\2e\t\3\2\2\2"+
		"fh\7\67\2\2gi\5\22\n\2hg\3\2\2\2hi\3\2\2\2il\3\2\2\2jk\7\22\2\2km\5\n"+
		"\6\2lj\3\2\2\2lm\3\2\2\2m\13\3\2\2\2no\7\67\2\2op\7/\2\2pq\t\2\2\2qs\7"+
		"\60\2\2rt\5\22\n\2sr\3\2\2\2st\3\2\2\2t\r\3\2\2\2uv\7\65\2\2v{\7\67\2"+
		"\2wx\7\22\2\2xz\5\16\b\2yw\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|\17\3"+
		"\2\2\2}{\3\2\2\2~\u0083\t\2\2\2\177\u0080\7\22\2\2\u0080\u0082\t\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\21\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b\5\36\20\2\u0087"+
		"\u008b\5\24\13\2\u0088\u008b\5\30\r\2\u0089\u008b\5\32\16\2\u008a\u0086"+
		"\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\23\3\2\2\2\u008c\u0090\7\67\2\2\u008d\u008e\7/\2\2\u008e\u008f\t\2\2"+
		"\2\u008f\u0091\7\60\2\2\u0090\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0098\7\26\2\2\u0095\u0099\5\22\n\2\u0096\u0099\5\26\f\2\u0097"+
		"\u0099\t\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2"+
		"\2\2\u0099\25\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u00a0\7\66\2\2\u009c"+
		"\u009d\7\22\2\2\u009d\u009f\7\66\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7\62\2\2\u00a4\27\3\2\2\2\u00a5\u00a7\t\2\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab"+
		"\t\3\2\2\u00a9\u00ac\5\22\n\2\u00aa\u00ac\t\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\31\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\t\4\2\2\u00b1"+
		"\u00b4\5\22\n\2\u00b2\u00b4\t\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b8\7\20\2\2\u00b6\u00b9\t\2\2\2\u00b7"+
		"\u00b9\5\22\n\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\35\3\2\2"+
		"\2\u00ba\u00bb\7\67\2\2\u00bb\u00bc\7-\2\2\u00bc\u00bd\5\20\t\2\u00bd"+
		"\u00be\7.\2\2\u00be\37\3\2\2\2\u00bf\u00c7\5$\23\2\u00c0\u00c7\5&\24\2"+
		"\u00c1\u00c7\5(\25\2\u00c2\u00c7\5.\30\2\u00c3\u00c7\5\66\34\2\u00c4\u00c7"+
		"\5B\"\2\u00c5\u00c7\5J&\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6"+
		"\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00cd"+
		"\5 \21\2\u00ca\u00cc\5 \21\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d1\7\62\2\2\u00d1#\3\2\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4"+
		"\7\64\2\2\u00d4%\3\2\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\7\64\2\2\u00d7"+
		"\'\3\2\2\2\u00d8\u00d9\7\25\2\2\u00d9\u00da\7-\2\2\u00da\u00db\5\22\n"+
		"\2\u00db\u00de\7.\2\2\u00dc\u00df\5 \21\2\u00dd\u00df\5\"\22\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e3\5*\26\2\u00e1"+
		"\u00e3\5,\27\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3)\3\2\2\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6\7-\2\2\u00e6\u00e7"+
		"\5\22\n\2\u00e7\u00ea\7.\2\2\u00e8\u00eb\5 \21\2\u00e9\u00eb\5\"\22\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ee"+
		"\5*\26\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\5,\27\2\u00f0+\3\2\2\2\u00f1\u00f4\7\5\2\2\u00f2\u00f5\5 \21\2"+
		"\u00f3\u00f5\5\"\22\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5-\3"+
		"\2\2\2\u00f6\u00fa\5\60\31\2\u00f7\u00fa\5\62\32\2\u00f8\u00fa\5\64\33"+
		"\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa/"+
		"\3\2\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\7-\2\2\u00fd\u00fe\5\22\n\2\u00fe"+
		"\u0101\7.\2\2\u00ff\u0102\5 \21\2\u0100\u0102\5\"\22\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0100\3\2\2\2\u0102\61\3\2\2\2\u0103\u0104\7\n\2\2\u0104\u0105"+
		"\5\"\22\2\u0105\u0106\7\r\2\2\u0106\u0107\7-\2\2\u0107\u0108\5\22\n\2"+
		"\u0108\u0109\7.\2\2\u0109\u010a\7\64\2\2\u010a\63\3\2\2\2\u010b\u010c"+
		"\7\t\2\2\u010c\u010d\7-\2\2\u010d\u010e\5\22\n\2\u010e\u010f\7\64\2\2"+
		"\u010f\u0110\5\22\n\2\u0110\u0111\7\64\2\2\u0111\u0112\5\22\n\2\u0112"+
		"\u0115\7.\2\2\u0113\u0116\5 \21\2\u0114\u0116\5\"\22\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0114\3\2\2\2\u0116\65\3\2\2\2\u0117\u0118\7\13\2\2\u0118\u0119"+
		"\7-\2\2\u0119\u011a\58\35\2\u011a\u011b\7.\2\2\u011b\u011c\5:\36\2\u011c"+
		"\67\3\2\2\2\u011d\u0120\t\2\2\2\u011e\u0120\5\22\n\2\u011f\u011d\3\2\2"+
		"\2\u011f\u011e\3\2\2\2\u01209\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0126"+
		"\5<\37\2\u0123\u0125\5<\37\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012b\5@!\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\7\62\2\2\u012d;\3\2\2\2\u012e\u012f\7\6\2\2\u012f"+
		"\u0130\7\66\2\2\u0130\u0131\7\34\2\2\u0131\u0132\5> \2\u0132=\3\2\2\2"+
		"\u0133\u0135\5 \21\2\u0134\u0136\5 \21\2\u0135\u0134\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\7\b\2\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139?\3\2\2\2\u013a\u013b\7\21\2\2\u013b\u013c\7\34\2"+
		"\2\u013c\u013e\5 \21\2\u013d\u013f\5 \21\2\u013e\u013d\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013fA\3\2\2\2\u0140\u0143\5D#\2\u0141\u0143\5F$\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\64\2\2"+
		"\u0145C\3\2\2\2\u0146\u0147\7\7\2\2\u0147\u0148\7-\2\2\u0148\u0149\t\2"+
		"\2\2\u0149\u014a\7.\2\2\u014aE\3\2\2\2\u014b\u014c\7\16\2\2\u014c\u014d"+
		"\7-\2\2\u014d\u014e\5H%\2\u014e\u014f\7.\2\2\u014fG\3\2\2\2\u0150\u0151"+
		"\t\5\2\2\u0151\u0152\7\22\2\2\u0152\u0153\7)\2\2\u0153\u0154\7\67\2\2"+
		"\u0154I\3\2\2\2\u0155\u0158\7\20\2\2\u0156\u0159\t\2\2\2\u0157\u0159\5"+
		"\22\n\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159K\3\2\2\2%Odhls{"+
		"\u0083\u008a\u0090\u0092\u0098\u00a0\u00a6\u00ab\u00ae\u00b3\u00b8\u00c6"+
		"\u00cd\u00de\u00e2\u00ea\u00ed\u00f4\u00f9\u0101\u0115\u011f\u0126\u012a"+
		"\u0135\u0138\u013e\u0142\u0158";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}