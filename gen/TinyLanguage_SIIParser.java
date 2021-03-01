// Generated from C:/Users/ASUS VIVOBOOK S14/IdeaProjects/TinyLanguage_SII/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyLanguage_SIIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMPIL=7, START=8, INT=9, 
		STRING=10, FLOAT=11, SCAN=12, PRINT=13, IF=14, THEN=15, ELSE=16, DO=17, 
		WHILE=18, PLUS=19, MINUS=20, MUL=21, DIV=22, SUP=23, INF=24, SUPE=25, 
		INFE=26, EQ=27, DIF=28, AFF=29, IDPROGRAMME=30, ID=31, INTEGERVAL=32, 
		FLOATVAL=33, STRINGVAL=34, COMMENT=35, WS=36;
	public static final int
		RULE_start_rule = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_variables = 4, RULE_instructions = 5, RULE_instruction = 6, RULE_affectation = 7, 
		RULE_exp = 8, RULE_exp2 = 9, RULE_exp3 = 10, RULE_value = 11, RULE_operpm = 12, 
		RULE_opermd = 13, RULE_instif = 14, RULE_condition = 15, RULE_op = 16, 
		RULE_scan = 17, RULE_print = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_rule", "declarations", "declaration", "type", "variables", "instructions", 
			"instruction", "affectation", "exp", "exp2", "exp3", "value", "operpm", 
			"opermd", "instif", "condition", "op", "scan", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "','", "'compil'", "'start'", 
			"'intCompil'", "'StringCompil'", "'floatCompil'", "'scanCompil'", "'printCompil'", 
			"'if'", "'then'", "'else'", "'do'", "'while'", "'+'", "'-'", "'*'", "'/'", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "COMPIL", "START", "INT", "STRING", 
			"FLOAT", "SCAN", "PRINT", "IF", "THEN", "ELSE", "DO", "WHILE", "PLUS", 
			"MINUS", "MUL", "DIV", "SUP", "INF", "SUPE", "INFE", "EQ", "DIF", "AFF", 
			"IDPROGRAMME", "ID", "INTEGERVAL", "FLOATVAL", "STRINGVAL", "COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TinyLanguage_SII.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyLanguage_SIIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_ruleContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(TinyLanguage_SIIParser.COMPIL, 0); }
		public TerminalNode IDPROGRAMME() { return getToken(TinyLanguage_SIIParser.IDPROGRAMME, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode START() { return getToken(TinyLanguage_SIIParser.START, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterStart_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitStart_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitStart_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_ruleContext start_rule() throws RecognitionException {
		Start_ruleContext _localctx = new Start_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(COMPIL);
			setState(39);
			match(IDPROGRAMME);
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);
			setState(42);
			match(T__2);
			setState(43);
			declarations();
			setState(44);
			match(START);
			setState(45);
			instructions();
			setState(46);
			match(T__3);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				declaration();
				setState(49);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type();
			setState(55);
			variables();
			setState(56);
			match(T__4);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TinyLanguage_SIIParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TinyLanguage_SIIParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(TinyLanguage_SIIParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyLanguage_SIIParser.ID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(60);
				match(ID);
				setState(61);
				match(T__5);
				setState(62);
				variables();
				}
				}
				break;
			case 2:
				{
				setState(63);
				match(ID);
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instructions);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(66);
				instruction();
				setState(67);
				match(T__4);
				setState(68);
				instructions();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				instruction();
				setState(71);
				match(T__4);
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

	public static class InstructionContext extends ParserRuleContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				affectation();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				scan();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				print();
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

	public static class AffectationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyLanguage_SIIParser.ID, 0); }
		public TerminalNode AFF() { return getToken(TinyLanguage_SIIParser.AFF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitAffectation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitAffectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(AFF);
			setState(82);
			exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OperpmContext operpm() {
			return getRuleContext(OperpmContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85);
			exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(87);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(88);
					operpm();
					setState(89);
					exp2(0);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public OpermdContext opermd() {
			return getRuleContext(OpermdContext.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		return exp2(0);
	}

	private Exp2Context exp2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp2Context _localctx = new Exp2Context(_ctx, _parentState);
		Exp2Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(97);
			exp3();
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(99);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(100);
					opermd();
					setState(101);
					exp3();
					}
					} 
				}
				setState(107);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp3Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TinyLanguage_SIIParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitExp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitExp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		Exp3Context _localctx = new Exp3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp3);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__0);
				setState(110);
				exp(0);
				setState(111);
				match(T__1);
				}
				break;
			case INTEGERVAL:
			case FLOATVAL:
			case STRINGVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGERVAL() { return getToken(TinyLanguage_SIIParser.INTEGERVAL, 0); }
		public TerminalNode FLOATVAL() { return getToken(TinyLanguage_SIIParser.FLOATVAL, 0); }
		public TerminalNode STRINGVAL() { return getToken(TinyLanguage_SIIParser.STRINGVAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERVAL) | (1L << FLOATVAL) | (1L << STRINGVAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperpmContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TinyLanguage_SIIParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TinyLanguage_SIIParser.MINUS, 0); }
		public OperpmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operpm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterOperpm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitOperpm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitOperpm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperpmContext operpm() throws RecognitionException {
		OperpmContext _localctx = new OperpmContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operpm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OpermdContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(TinyLanguage_SIIParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TinyLanguage_SIIParser.DIV, 0); }
		public OpermdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterOpermd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitOpermd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitOpermd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermdContext opermd() throws RecognitionException {
		OpermdContext _localctx = new OpermdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_opermd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InstifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TinyLanguage_SIIParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TinyLanguage_SIIParser.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TinyLanguage_SIIParser.ELSE, 0); }
		public InstifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterInstif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitInstif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitInstif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstifContext instif() throws RecognitionException {
		InstifContext _localctx = new InstifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IF);
			setState(123);
			match(T__0);
			setState(124);
			condition();
			setState(125);
			match(T__1);
			setState(126);
			match(THEN);
			setState(127);
			match(T__2);
			setState(128);
			instructions();
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(129);
				match(T__3);
				setState(130);
				match(ELSE);
				setState(131);
				match(T__2);
				setState(132);
				instructions();
				}
				break;
			}
			setState(135);
			match(T__3);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			exp(0);
			setState(138);
			op();
			setState(139);
			exp(0);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(TinyLanguage_SIIParser.SUP, 0); }
		public TerminalNode INF() { return getToken(TinyLanguage_SIIParser.INF, 0); }
		public TerminalNode SUPE() { return getToken(TinyLanguage_SIIParser.SUPE, 0); }
		public TerminalNode INFE() { return getToken(TinyLanguage_SIIParser.INFE, 0); }
		public TerminalNode DIF() { return getToken(TinyLanguage_SIIParser.DIF, 0); }
		public TerminalNode EQ() { return getToken(TinyLanguage_SIIParser.EQ, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUP) | (1L << INF) | (1L << SUPE) | (1L << INFE) | (1L << EQ) | (1L << DIF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(TinyLanguage_SIIParser.SCAN, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SCAN);
			setState(144);
			match(T__0);
			setState(145);
			variables();
			setState(146);
			match(T__1);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TinyLanguage_SIIParser.PRINT, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode STRINGVAL() { return getToken(TinyLanguage_SIIParser.STRINGVAL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyLanguage_SIIListener ) ((TinyLanguage_SIIListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TinyLanguage_SIIVisitor ) return ((TinyLanguage_SIIVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PRINT);
			setState(149);
			match(T__0);
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(150);
				variables();
				}
				break;
			case STRINGVAL:
				{
				setState(151);
				match(STRINGVAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			match(T__1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 9:
			return exp2_sempred((Exp2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u009f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6C\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n^\n\n\f\n\16\na\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\fu\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0088\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u009b\n\24"+
		"\3\24\3\24\3\24\2\4\22\24\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&\2\7\3\2\13\r\3\2\"$\3\2\25\26\3\2\27\30\3\2\31\36\2\u0096\2(\3\2\2"+
		"\2\4\66\3\2\2\2\68\3\2\2\2\b<\3\2\2\2\nB\3\2\2\2\fK\3\2\2\2\16P\3\2\2"+
		"\2\20R\3\2\2\2\22V\3\2\2\2\24b\3\2\2\2\26t\3\2\2\2\30v\3\2\2\2\32x\3\2"+
		"\2\2\34z\3\2\2\2\36|\3\2\2\2 \u008b\3\2\2\2\"\u008f\3\2\2\2$\u0091\3\2"+
		"\2\2&\u0096\3\2\2\2()\7\t\2\2)*\7 \2\2*+\7\3\2\2+,\7\4\2\2,-\7\5\2\2-"+
		".\5\4\3\2./\7\n\2\2/\60\5\f\7\2\60\61\7\6\2\2\61\3\3\2\2\2\62\63\5\6\4"+
		"\2\63\64\5\4\3\2\64\67\3\2\2\2\65\67\5\6\4\2\66\62\3\2\2\2\66\65\3\2\2"+
		"\2\67\5\3\2\2\289\5\b\5\29:\5\n\6\2:;\7\7\2\2;\7\3\2\2\2<=\t\2\2\2=\t"+
		"\3\2\2\2>?\7!\2\2?@\7\b\2\2@C\5\n\6\2AC\7!\2\2B>\3\2\2\2BA\3\2\2\2C\13"+
		"\3\2\2\2DE\5\16\b\2EF\7\7\2\2FG\5\f\7\2GL\3\2\2\2HI\5\16\b\2IJ\7\7\2\2"+
		"JL\3\2\2\2KD\3\2\2\2KH\3\2\2\2L\r\3\2\2\2MQ\5\20\t\2NQ\5$\23\2OQ\5&\24"+
		"\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\17\3\2\2\2RS\7!\2\2ST\7\37\2\2TU\5\22"+
		"\n\2U\21\3\2\2\2VW\b\n\1\2WX\5\24\13\2X_\3\2\2\2YZ\f\4\2\2Z[\5\32\16\2"+
		"[\\\5\24\13\2\\^\3\2\2\2]Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\23\3"+
		"\2\2\2a_\3\2\2\2bc\b\13\1\2cd\5\26\f\2dk\3\2\2\2ef\f\4\2\2fg\5\34\17\2"+
		"gh\5\26\f\2hj\3\2\2\2ie\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\25\3\2"+
		"\2\2mk\3\2\2\2nu\7!\2\2op\7\3\2\2pq\5\22\n\2qr\7\4\2\2ru\3\2\2\2su\5\30"+
		"\r\2tn\3\2\2\2to\3\2\2\2ts\3\2\2\2u\27\3\2\2\2vw\t\3\2\2w\31\3\2\2\2x"+
		"y\t\4\2\2y\33\3\2\2\2z{\t\5\2\2{\35\3\2\2\2|}\7\20\2\2}~\7\3\2\2~\177"+
		"\5 \21\2\177\u0080\7\4\2\2\u0080\u0081\7\21\2\2\u0081\u0082\7\5\2\2\u0082"+
		"\u0087\5\f\7\2\u0083\u0084\7\6\2\2\u0084\u0085\7\22\2\2\u0085\u0086\7"+
		"\5\2\2\u0086\u0088\5\f\7\2\u0087\u0083\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7\6\2\2\u008a\37\3\2\2\2\u008b\u008c\5\22\n"+
		"\2\u008c\u008d\5\"\22\2\u008d\u008e\5\22\n\2\u008e!\3\2\2\2\u008f\u0090"+
		"\t\6\2\2\u0090#\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u0093\7\3\2\2\u0093"+
		"\u0094\5\n\6\2\u0094\u0095\7\4\2\2\u0095%\3\2\2\2\u0096\u0097\7\17\2\2"+
		"\u0097\u009a\7\3\2\2\u0098\u009b\5\n\6\2\u0099\u009b\7$\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\4\2\2\u009d"+
		"\'\3\2\2\2\13\66BKP_kt\u0087\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}