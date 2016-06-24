package org.eclipse.january.geometry.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.january.geometry.xtext.services.IGESGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIGESParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_WS", "RULE_SEPARATER", "RULE_INT", "RULE_ENDLINE", "RULE_DELIMITER", "RULE_HOLLERITH", "RULE_DOUBLE", "'G'", "'D'", "'P'", "'S'", "'T'"
    };
    public static final int RULE_HOLLERITH=10;
    public static final int RULE_SEPARATER=6;
    public static final int RULE_ENDLINE=8;
    public static final int RULE_WS=5;
    public static final int RULE_STRING=4;
    public static final int RULE_DELIMITER=9;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int RULE_INT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalIGESParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIGESParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIGESParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIGES.g"; }


    	private IGESGrammarAccess grammarAccess;

    	public void setGrammarAccess(IGESGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleIGES"
    // InternalIGES.g:53:1: entryRuleIGES : ruleIGES EOF ;
    public final void entryRuleIGES() throws RecognitionException {
        try {
            // InternalIGES.g:54:1: ( ruleIGES EOF )
            // InternalIGES.g:55:1: ruleIGES EOF
            {
             before(grammarAccess.getIGESRule()); 
            pushFollow(FOLLOW_1);
            ruleIGES();

            state._fsp--;

             after(grammarAccess.getIGESRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIGES"


    // $ANTLR start "ruleIGES"
    // InternalIGES.g:62:1: ruleIGES : ( ( rule__IGES__Group__0 ) ) ;
    public final void ruleIGES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:66:2: ( ( ( rule__IGES__Group__0 ) ) )
            // InternalIGES.g:67:2: ( ( rule__IGES__Group__0 ) )
            {
            // InternalIGES.g:67:2: ( ( rule__IGES__Group__0 ) )
            // InternalIGES.g:68:3: ( rule__IGES__Group__0 )
            {
             before(grammarAccess.getIGESAccess().getGroup()); 
            // InternalIGES.g:69:3: ( rule__IGES__Group__0 )
            // InternalIGES.g:69:4: rule__IGES__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IGES__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIGESAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIGES"


    // $ANTLR start "entryRuleStart"
    // InternalIGES.g:78:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // InternalIGES.g:79:1: ( ruleStart EOF )
            // InternalIGES.g:80:1: ruleStart EOF
            {
             before(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getStartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalIGES.g:87:1: ruleStart : ( ( ( rule__Start__LinesAssignment ) ) ( ( rule__Start__LinesAssignment )* ) ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:91:2: ( ( ( ( rule__Start__LinesAssignment ) ) ( ( rule__Start__LinesAssignment )* ) ) )
            // InternalIGES.g:92:2: ( ( ( rule__Start__LinesAssignment ) ) ( ( rule__Start__LinesAssignment )* ) )
            {
            // InternalIGES.g:92:2: ( ( ( rule__Start__LinesAssignment ) ) ( ( rule__Start__LinesAssignment )* ) )
            // InternalIGES.g:93:3: ( ( rule__Start__LinesAssignment ) ) ( ( rule__Start__LinesAssignment )* )
            {
            // InternalIGES.g:93:3: ( ( rule__Start__LinesAssignment ) )
            // InternalIGES.g:94:4: ( rule__Start__LinesAssignment )
            {
             before(grammarAccess.getStartAccess().getLinesAssignment()); 
            // InternalIGES.g:95:4: ( rule__Start__LinesAssignment )
            // InternalIGES.g:95:5: rule__Start__LinesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Start__LinesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStartAccess().getLinesAssignment()); 

            }

            // InternalIGES.g:98:3: ( ( rule__Start__LinesAssignment )* )
            // InternalIGES.g:99:4: ( rule__Start__LinesAssignment )*
            {
             before(grammarAccess.getStartAccess().getLinesAssignment()); 
            // InternalIGES.g:100:4: ( rule__Start__LinesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    int LA1_2 = input.LA(2);

                    if ( ((LA1_2>=RULE_STRING && LA1_2<=RULE_WS)||LA1_2==15) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==RULE_STRING||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIGES.g:100:5: rule__Start__LinesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Start__LinesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStartAccess().getLinesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleGlobal"
    // InternalIGES.g:110:1: entryRuleGlobal : ruleGlobal EOF ;
    public final void entryRuleGlobal() throws RecognitionException {
        try {
            // InternalIGES.g:111:1: ( ruleGlobal EOF )
            // InternalIGES.g:112:1: ruleGlobal EOF
            {
             before(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getGlobalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalIGES.g:119:1: ruleGlobal : ( ( rule__Global__Group__0 ) ) ;
    public final void ruleGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:123:2: ( ( ( rule__Global__Group__0 ) ) )
            // InternalIGES.g:124:2: ( ( rule__Global__Group__0 ) )
            {
            // InternalIGES.g:124:2: ( ( rule__Global__Group__0 ) )
            // InternalIGES.g:125:3: ( rule__Global__Group__0 )
            {
             before(grammarAccess.getGlobalAccess().getGroup()); 
            // InternalIGES.g:126:3: ( rule__Global__Group__0 )
            // InternalIGES.g:126:4: rule__Global__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleData"
    // InternalIGES.g:135:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalIGES.g:136:1: ( ruleData EOF )
            // InternalIGES.g:137:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalIGES.g:144:1: ruleData : ( ( ( rule__Data__EntriesAssignment ) ) ( ( rule__Data__EntriesAssignment )* ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:148:2: ( ( ( ( rule__Data__EntriesAssignment ) ) ( ( rule__Data__EntriesAssignment )* ) ) )
            // InternalIGES.g:149:2: ( ( ( rule__Data__EntriesAssignment ) ) ( ( rule__Data__EntriesAssignment )* ) )
            {
            // InternalIGES.g:149:2: ( ( ( rule__Data__EntriesAssignment ) ) ( ( rule__Data__EntriesAssignment )* ) )
            // InternalIGES.g:150:3: ( ( rule__Data__EntriesAssignment ) ) ( ( rule__Data__EntriesAssignment )* )
            {
            // InternalIGES.g:150:3: ( ( rule__Data__EntriesAssignment ) )
            // InternalIGES.g:151:4: ( rule__Data__EntriesAssignment )
            {
             before(grammarAccess.getDataAccess().getEntriesAssignment()); 
            // InternalIGES.g:152:4: ( rule__Data__EntriesAssignment )
            // InternalIGES.g:152:5: rule__Data__EntriesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Data__EntriesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getEntriesAssignment()); 

            }

            // InternalIGES.g:155:3: ( ( rule__Data__EntriesAssignment )* )
            // InternalIGES.g:156:4: ( rule__Data__EntriesAssignment )*
            {
             before(grammarAccess.getDataAccess().getEntriesAssignment()); 
            // InternalIGES.g:157:4: ( rule__Data__EntriesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WS) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_INT) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==RULE_WS||LA2_3==RULE_INT) ) {
                            alt2=1;
                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalIGES.g:157:5: rule__Data__EntriesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Data__EntriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getEntriesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleEntry"
    // InternalIGES.g:167:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalIGES.g:168:1: ( ruleEntry EOF )
            // InternalIGES.g:169:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalIGES.g:176:1: ruleEntry : ( ( rule__Entry__Group__0 ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:180:2: ( ( ( rule__Entry__Group__0 ) ) )
            // InternalIGES.g:181:2: ( ( rule__Entry__Group__0 ) )
            {
            // InternalIGES.g:181:2: ( ( rule__Entry__Group__0 ) )
            // InternalIGES.g:182:3: ( rule__Entry__Group__0 )
            {
             before(grammarAccess.getEntryAccess().getGroup()); 
            // InternalIGES.g:183:3: ( rule__Entry__Group__0 )
            // InternalIGES.g:183:4: rule__Entry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleParameters"
    // InternalIGES.g:192:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalIGES.g:193:1: ( ruleParameters EOF )
            // InternalIGES.g:194:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalIGES.g:201:1: ruleParameters : ( ( ( rule__Parameters__EntriesAssignment ) ) ( ( rule__Parameters__EntriesAssignment )* ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:205:2: ( ( ( ( rule__Parameters__EntriesAssignment ) ) ( ( rule__Parameters__EntriesAssignment )* ) ) )
            // InternalIGES.g:206:2: ( ( ( rule__Parameters__EntriesAssignment ) ) ( ( rule__Parameters__EntriesAssignment )* ) )
            {
            // InternalIGES.g:206:2: ( ( ( rule__Parameters__EntriesAssignment ) ) ( ( rule__Parameters__EntriesAssignment )* ) )
            // InternalIGES.g:207:3: ( ( rule__Parameters__EntriesAssignment ) ) ( ( rule__Parameters__EntriesAssignment )* )
            {
            // InternalIGES.g:207:3: ( ( rule__Parameters__EntriesAssignment ) )
            // InternalIGES.g:208:4: ( rule__Parameters__EntriesAssignment )
            {
             before(grammarAccess.getParametersAccess().getEntriesAssignment()); 
            // InternalIGES.g:209:4: ( rule__Parameters__EntriesAssignment )
            // InternalIGES.g:209:5: rule__Parameters__EntriesAssignment
            {
            pushFollow(FOLLOW_5);
            rule__Parameters__EntriesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getEntriesAssignment()); 

            }

            // InternalIGES.g:212:3: ( ( rule__Parameters__EntriesAssignment )* )
            // InternalIGES.g:213:4: ( rule__Parameters__EntriesAssignment )*
            {
             before(grammarAccess.getParametersAccess().getEntriesAssignment()); 
            // InternalIGES.g:214:4: ( rule__Parameters__EntriesAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_WS||LA3_0==RULE_INT||(LA3_0>=RULE_DELIMITER && LA3_0<=RULE_DOUBLE)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIGES.g:214:5: rule__Parameters__EntriesAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Parameters__EntriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getParametersAccess().getEntriesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRulePEntry"
    // InternalIGES.g:224:1: entryRulePEntry : rulePEntry EOF ;
    public final void entryRulePEntry() throws RecognitionException {
        try {
            // InternalIGES.g:225:1: ( rulePEntry EOF )
            // InternalIGES.g:226:1: rulePEntry EOF
            {
             before(grammarAccess.getPEntryRule()); 
            pushFollow(FOLLOW_1);
            rulePEntry();

            state._fsp--;

             after(grammarAccess.getPEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePEntry"


    // $ANTLR start "rulePEntry"
    // InternalIGES.g:233:1: rulePEntry : ( ( rule__PEntry__Group__0 ) ) ;
    public final void rulePEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:237:2: ( ( ( rule__PEntry__Group__0 ) ) )
            // InternalIGES.g:238:2: ( ( rule__PEntry__Group__0 ) )
            {
            // InternalIGES.g:238:2: ( ( rule__PEntry__Group__0 ) )
            // InternalIGES.g:239:3: ( rule__PEntry__Group__0 )
            {
             before(grammarAccess.getPEntryAccess().getGroup()); 
            // InternalIGES.g:240:3: ( rule__PEntry__Group__0 )
            // InternalIGES.g:240:4: rule__PEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePEntry"


    // $ANTLR start "entryRulePMultiEntry"
    // InternalIGES.g:249:1: entryRulePMultiEntry : rulePMultiEntry EOF ;
    public final void entryRulePMultiEntry() throws RecognitionException {
        try {
            // InternalIGES.g:250:1: ( rulePMultiEntry EOF )
            // InternalIGES.g:251:1: rulePMultiEntry EOF
            {
             before(grammarAccess.getPMultiEntryRule()); 
            pushFollow(FOLLOW_1);
            rulePMultiEntry();

            state._fsp--;

             after(grammarAccess.getPMultiEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePMultiEntry"


    // $ANTLR start "rulePMultiEntry"
    // InternalIGES.g:258:1: rulePMultiEntry : ( ( rule__PMultiEntry__Group__0 ) ) ;
    public final void rulePMultiEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:262:2: ( ( ( rule__PMultiEntry__Group__0 ) ) )
            // InternalIGES.g:263:2: ( ( rule__PMultiEntry__Group__0 ) )
            {
            // InternalIGES.g:263:2: ( ( rule__PMultiEntry__Group__0 ) )
            // InternalIGES.g:264:3: ( rule__PMultiEntry__Group__0 )
            {
             before(grammarAccess.getPMultiEntryAccess().getGroup()); 
            // InternalIGES.g:265:3: ( rule__PMultiEntry__Group__0 )
            // InternalIGES.g:265:4: rule__PMultiEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePMultiEntry"


    // $ANTLR start "entryRuleValue"
    // InternalIGES.g:274:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalIGES.g:275:1: ( ruleValue EOF )
            // InternalIGES.g:276:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalIGES.g:283:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:287:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalIGES.g:288:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalIGES.g:288:2: ( ( rule__Value__Alternatives ) )
            // InternalIGES.g:289:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalIGES.g:290:3: ( rule__Value__Alternatives )
            // InternalIGES.g:290:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleHString"
    // InternalIGES.g:299:1: entryRuleHString : ruleHString EOF ;
    public final void entryRuleHString() throws RecognitionException {
        try {
            // InternalIGES.g:300:1: ( ruleHString EOF )
            // InternalIGES.g:301:1: ruleHString EOF
            {
             before(grammarAccess.getHStringRule()); 
            pushFollow(FOLLOW_1);
            ruleHString();

            state._fsp--;

             after(grammarAccess.getHStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHString"


    // $ANTLR start "ruleHString"
    // InternalIGES.g:308:1: ruleHString : ( ( rule__HString__Group__0 ) ) ;
    public final void ruleHString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:312:2: ( ( ( rule__HString__Group__0 ) ) )
            // InternalIGES.g:313:2: ( ( rule__HString__Group__0 ) )
            {
            // InternalIGES.g:313:2: ( ( rule__HString__Group__0 ) )
            // InternalIGES.g:314:3: ( rule__HString__Group__0 )
            {
             before(grammarAccess.getHStringAccess().getGroup()); 
            // InternalIGES.g:315:3: ( rule__HString__Group__0 )
            // InternalIGES.g:315:4: rule__HString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHString"


    // $ANTLR start "entryRuleParam"
    // InternalIGES.g:324:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalIGES.g:325:1: ( ruleParam EOF )
            // InternalIGES.g:326:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalIGES.g:333:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:337:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalIGES.g:338:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalIGES.g:338:2: ( ( rule__Param__Group__0 ) )
            // InternalIGES.g:339:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalIGES.g:340:3: ( rule__Param__Group__0 )
            // InternalIGES.g:340:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRulePointer"
    // InternalIGES.g:349:1: entryRulePointer : rulePointer EOF ;
    public final void entryRulePointer() throws RecognitionException {
        try {
            // InternalIGES.g:350:1: ( rulePointer EOF )
            // InternalIGES.g:351:1: rulePointer EOF
            {
             before(grammarAccess.getPointerRule()); 
            pushFollow(FOLLOW_1);
            rulePointer();

            state._fsp--;

             after(grammarAccess.getPointerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePointer"


    // $ANTLR start "rulePointer"
    // InternalIGES.g:358:1: rulePointer : ( ( rule__Pointer__Group__0 ) ) ;
    public final void rulePointer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:362:2: ( ( ( rule__Pointer__Group__0 ) ) )
            // InternalIGES.g:363:2: ( ( rule__Pointer__Group__0 ) )
            {
            // InternalIGES.g:363:2: ( ( rule__Pointer__Group__0 ) )
            // InternalIGES.g:364:3: ( rule__Pointer__Group__0 )
            {
             before(grammarAccess.getPointerAccess().getGroup()); 
            // InternalIGES.g:365:3: ( rule__Pointer__Group__0 )
            // InternalIGES.g:365:4: rule__Pointer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pointer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointer"


    // $ANTLR start "entryRuleEnd"
    // InternalIGES.g:374:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalIGES.g:375:1: ( ruleEnd EOF )
            // InternalIGES.g:376:1: ruleEnd EOF
            {
             before(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalIGES.g:383:1: ruleEnd : ( ( rule__End__Group__0 ) ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:387:2: ( ( ( rule__End__Group__0 ) ) )
            // InternalIGES.g:388:2: ( ( rule__End__Group__0 ) )
            {
            // InternalIGES.g:388:2: ( ( rule__End__Group__0 ) )
            // InternalIGES.g:389:3: ( rule__End__Group__0 )
            {
             before(grammarAccess.getEndAccess().getGroup()); 
            // InternalIGES.g:390:3: ( rule__End__Group__0 )
            // InternalIGES.g:390:4: rule__End__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__End__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRulestartLine"
    // InternalIGES.g:399:1: entryRulestartLine : rulestartLine EOF ;
    public final void entryRulestartLine() throws RecognitionException {
        try {
            // InternalIGES.g:400:1: ( rulestartLine EOF )
            // InternalIGES.g:401:1: rulestartLine EOF
            {
             before(grammarAccess.getStartLineRule()); 
            pushFollow(FOLLOW_1);
            rulestartLine();

            state._fsp--;

             after(grammarAccess.getStartLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestartLine"


    // $ANTLR start "rulestartLine"
    // InternalIGES.g:408:1: rulestartLine : ( ( rule__StartLine__Group__0 ) ) ;
    public final void rulestartLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:412:2: ( ( ( rule__StartLine__Group__0 ) ) )
            // InternalIGES.g:413:2: ( ( rule__StartLine__Group__0 ) )
            {
            // InternalIGES.g:413:2: ( ( rule__StartLine__Group__0 ) )
            // InternalIGES.g:414:3: ( rule__StartLine__Group__0 )
            {
             before(grammarAccess.getStartLineAccess().getGroup()); 
            // InternalIGES.g:415:3: ( rule__StartLine__Group__0 )
            // InternalIGES.g:415:4: rule__StartLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestartLine"


    // $ANTLR start "rule__Parameters__EntriesAlternatives_0"
    // InternalIGES.g:423:1: rule__Parameters__EntriesAlternatives_0 : ( ( rulePMultiEntry ) | ( rulePEntry ) );
    public final void rule__Parameters__EntriesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:427:1: ( ( rulePMultiEntry ) | ( rulePEntry ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalIGES.g:428:2: ( rulePMultiEntry )
                    {
                    // InternalIGES.g:428:2: ( rulePMultiEntry )
                    // InternalIGES.g:429:3: rulePMultiEntry
                    {
                     before(grammarAccess.getParametersAccess().getEntriesPMultiEntryParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePMultiEntry();

                    state._fsp--;

                     after(grammarAccess.getParametersAccess().getEntriesPMultiEntryParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIGES.g:434:2: ( rulePEntry )
                    {
                    // InternalIGES.g:434:2: ( rulePEntry )
                    // InternalIGES.g:435:3: rulePEntry
                    {
                     before(grammarAccess.getParametersAccess().getEntriesPEntryParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePEntry();

                    state._fsp--;

                     after(grammarAccess.getParametersAccess().getEntriesPEntryParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__EntriesAlternatives_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalIGES.g:444:1: rule__Value__Alternatives : ( ( ruleParam ) | ( rulePointer ) | ( ruleHString ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:448:1: ( ( ruleParam ) | ( rulePointer ) | ( ruleHString ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_DELIMITER:
                {
                switch ( input.LA(2) ) {
                case RULE_HOLLERITH:
                    {
                    alt5=3;
                    }
                    break;
                case RULE_DOUBLE:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_DOUBLE:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_HOLLERITH:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalIGES.g:449:2: ( ruleParam )
                    {
                    // InternalIGES.g:449:2: ( ruleParam )
                    // InternalIGES.g:450:3: ruleParam
                    {
                     before(grammarAccess.getValueAccess().getParamParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParam();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getParamParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIGES.g:455:2: ( rulePointer )
                    {
                    // InternalIGES.g:455:2: ( rulePointer )
                    // InternalIGES.g:456:3: rulePointer
                    {
                     before(grammarAccess.getValueAccess().getPointerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePointer();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getPointerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIGES.g:461:2: ( ruleHString )
                    {
                    // InternalIGES.g:461:2: ( ruleHString )
                    // InternalIGES.g:462:3: ruleHString
                    {
                     before(grammarAccess.getValueAccess().getHStringParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleHString();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getHStringParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__StartLine__Alternatives_0"
    // InternalIGES.g:471:1: rule__StartLine__Alternatives_0 : ( ( RULE_STRING ) | ( RULE_WS ) );
    public final void rule__StartLine__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:475:1: ( ( RULE_STRING ) | ( RULE_WS ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_WS) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIGES.g:476:2: ( RULE_STRING )
                    {
                    // InternalIGES.g:476:2: ( RULE_STRING )
                    // InternalIGES.g:477:3: RULE_STRING
                    {
                     before(grammarAccess.getStartLineAccess().getSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStartLineAccess().getSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIGES.g:482:2: ( RULE_WS )
                    {
                    // InternalIGES.g:482:2: ( RULE_WS )
                    // InternalIGES.g:483:3: RULE_WS
                    {
                     before(grammarAccess.getStartLineAccess().getWSTerminalRuleCall_0_1()); 
                    match(input,RULE_WS,FOLLOW_2); 
                     after(grammarAccess.getStartLineAccess().getWSTerminalRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Alternatives_0"


    // $ANTLR start "rule__IGES__Group__0"
    // InternalIGES.g:492:1: rule__IGES__Group__0 : rule__IGES__Group__0__Impl rule__IGES__Group__1 ;
    public final void rule__IGES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:496:1: ( rule__IGES__Group__0__Impl rule__IGES__Group__1 )
            // InternalIGES.g:497:2: rule__IGES__Group__0__Impl rule__IGES__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__IGES__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IGES__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__0"


    // $ANTLR start "rule__IGES__Group__0__Impl"
    // InternalIGES.g:504:1: rule__IGES__Group__0__Impl : ( ( rule__IGES__StartAssignment_0 ) ) ;
    public final void rule__IGES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:508:1: ( ( ( rule__IGES__StartAssignment_0 ) ) )
            // InternalIGES.g:509:1: ( ( rule__IGES__StartAssignment_0 ) )
            {
            // InternalIGES.g:509:1: ( ( rule__IGES__StartAssignment_0 ) )
            // InternalIGES.g:510:2: ( rule__IGES__StartAssignment_0 )
            {
             before(grammarAccess.getIGESAccess().getStartAssignment_0()); 
            // InternalIGES.g:511:2: ( rule__IGES__StartAssignment_0 )
            // InternalIGES.g:511:3: rule__IGES__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IGES__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIGESAccess().getStartAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__0__Impl"


    // $ANTLR start "rule__IGES__Group__1"
    // InternalIGES.g:519:1: rule__IGES__Group__1 : rule__IGES__Group__1__Impl rule__IGES__Group__2 ;
    public final void rule__IGES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:523:1: ( rule__IGES__Group__1__Impl rule__IGES__Group__2 )
            // InternalIGES.g:524:2: rule__IGES__Group__1__Impl rule__IGES__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__IGES__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IGES__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__1"


    // $ANTLR start "rule__IGES__Group__1__Impl"
    // InternalIGES.g:531:1: rule__IGES__Group__1__Impl : ( ( rule__IGES__GlobalAssignment_1 ) ) ;
    public final void rule__IGES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:535:1: ( ( ( rule__IGES__GlobalAssignment_1 ) ) )
            // InternalIGES.g:536:1: ( ( rule__IGES__GlobalAssignment_1 ) )
            {
            // InternalIGES.g:536:1: ( ( rule__IGES__GlobalAssignment_1 ) )
            // InternalIGES.g:537:2: ( rule__IGES__GlobalAssignment_1 )
            {
             before(grammarAccess.getIGESAccess().getGlobalAssignment_1()); 
            // InternalIGES.g:538:2: ( rule__IGES__GlobalAssignment_1 )
            // InternalIGES.g:538:3: rule__IGES__GlobalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IGES__GlobalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIGESAccess().getGlobalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__1__Impl"


    // $ANTLR start "rule__IGES__Group__2"
    // InternalIGES.g:546:1: rule__IGES__Group__2 : rule__IGES__Group__2__Impl rule__IGES__Group__3 ;
    public final void rule__IGES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:550:1: ( rule__IGES__Group__2__Impl rule__IGES__Group__3 )
            // InternalIGES.g:551:2: rule__IGES__Group__2__Impl rule__IGES__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__IGES__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IGES__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__2"


    // $ANTLR start "rule__IGES__Group__2__Impl"
    // InternalIGES.g:558:1: rule__IGES__Group__2__Impl : ( ( rule__IGES__DataAssignment_2 ) ) ;
    public final void rule__IGES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:562:1: ( ( ( rule__IGES__DataAssignment_2 ) ) )
            // InternalIGES.g:563:1: ( ( rule__IGES__DataAssignment_2 ) )
            {
            // InternalIGES.g:563:1: ( ( rule__IGES__DataAssignment_2 ) )
            // InternalIGES.g:564:2: ( rule__IGES__DataAssignment_2 )
            {
             before(grammarAccess.getIGESAccess().getDataAssignment_2()); 
            // InternalIGES.g:565:2: ( rule__IGES__DataAssignment_2 )
            // InternalIGES.g:565:3: rule__IGES__DataAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IGES__DataAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIGESAccess().getDataAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__2__Impl"


    // $ANTLR start "rule__IGES__Group__3"
    // InternalIGES.g:573:1: rule__IGES__Group__3 : rule__IGES__Group__3__Impl rule__IGES__Group__4 ;
    public final void rule__IGES__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:577:1: ( rule__IGES__Group__3__Impl rule__IGES__Group__4 )
            // InternalIGES.g:578:2: rule__IGES__Group__3__Impl rule__IGES__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__IGES__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IGES__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__3"


    // $ANTLR start "rule__IGES__Group__3__Impl"
    // InternalIGES.g:585:1: rule__IGES__Group__3__Impl : ( ( rule__IGES__ParametersAssignment_3 ) ) ;
    public final void rule__IGES__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:589:1: ( ( ( rule__IGES__ParametersAssignment_3 ) ) )
            // InternalIGES.g:590:1: ( ( rule__IGES__ParametersAssignment_3 ) )
            {
            // InternalIGES.g:590:1: ( ( rule__IGES__ParametersAssignment_3 ) )
            // InternalIGES.g:591:2: ( rule__IGES__ParametersAssignment_3 )
            {
             before(grammarAccess.getIGESAccess().getParametersAssignment_3()); 
            // InternalIGES.g:592:2: ( rule__IGES__ParametersAssignment_3 )
            // InternalIGES.g:592:3: rule__IGES__ParametersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IGES__ParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIGESAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__3__Impl"


    // $ANTLR start "rule__IGES__Group__4"
    // InternalIGES.g:600:1: rule__IGES__Group__4 : rule__IGES__Group__4__Impl ;
    public final void rule__IGES__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:604:1: ( rule__IGES__Group__4__Impl )
            // InternalIGES.g:605:2: rule__IGES__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IGES__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__4"


    // $ANTLR start "rule__IGES__Group__4__Impl"
    // InternalIGES.g:611:1: rule__IGES__Group__4__Impl : ( ( rule__IGES__EndAssignment_4 ) ) ;
    public final void rule__IGES__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:615:1: ( ( ( rule__IGES__EndAssignment_4 ) ) )
            // InternalIGES.g:616:1: ( ( rule__IGES__EndAssignment_4 ) )
            {
            // InternalIGES.g:616:1: ( ( rule__IGES__EndAssignment_4 ) )
            // InternalIGES.g:617:2: ( rule__IGES__EndAssignment_4 )
            {
             before(grammarAccess.getIGESAccess().getEndAssignment_4()); 
            // InternalIGES.g:618:2: ( rule__IGES__EndAssignment_4 )
            // InternalIGES.g:618:3: rule__IGES__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IGES__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIGESAccess().getEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__Group__4__Impl"


    // $ANTLR start "rule__Global__Group__0"
    // InternalIGES.g:627:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:631:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalIGES.g:632:2: rule__Global__Group__0__Impl rule__Global__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Global__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0"


    // $ANTLR start "rule__Global__Group__0__Impl"
    // InternalIGES.g:639:1: rule__Global__Group__0__Impl : ( () ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:643:1: ( ( () ) )
            // InternalIGES.g:644:1: ( () )
            {
            // InternalIGES.g:644:1: ( () )
            // InternalIGES.g:645:2: ()
            {
             before(grammarAccess.getGlobalAccess().getGlobalAction_0()); 
            // InternalIGES.g:646:2: ()
            // InternalIGES.g:646:3: 
            {
            }

             after(grammarAccess.getGlobalAccess().getGlobalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__0__Impl"


    // $ANTLR start "rule__Global__Group__1"
    // InternalIGES.g:654:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:658:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalIGES.g:659:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Global__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1"


    // $ANTLR start "rule__Global__Group__1__Impl"
    // InternalIGES.g:666:1: rule__Global__Group__1__Impl : ( ( ( rule__Global__Group_1__0 ) ) ( ( rule__Global__Group_1__0 )* ) ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:670:1: ( ( ( ( rule__Global__Group_1__0 ) ) ( ( rule__Global__Group_1__0 )* ) ) )
            // InternalIGES.g:671:1: ( ( ( rule__Global__Group_1__0 ) ) ( ( rule__Global__Group_1__0 )* ) )
            {
            // InternalIGES.g:671:1: ( ( ( rule__Global__Group_1__0 ) ) ( ( rule__Global__Group_1__0 )* ) )
            // InternalIGES.g:672:2: ( ( rule__Global__Group_1__0 ) ) ( ( rule__Global__Group_1__0 )* )
            {
            // InternalIGES.g:672:2: ( ( rule__Global__Group_1__0 ) )
            // InternalIGES.g:673:3: ( rule__Global__Group_1__0 )
            {
             before(grammarAccess.getGlobalAccess().getGroup_1()); 
            // InternalIGES.g:674:3: ( rule__Global__Group_1__0 )
            // InternalIGES.g:674:4: rule__Global__Group_1__0
            {
            pushFollow(FOLLOW_11);
            rule__Global__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getGroup_1()); 

            }

            // InternalIGES.g:677:2: ( ( rule__Global__Group_1__0 )* )
            // InternalIGES.g:678:3: ( rule__Global__Group_1__0 )*
            {
             before(grammarAccess.getGlobalAccess().getGroup_1()); 
            // InternalIGES.g:679:3: ( rule__Global__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalIGES.g:679:4: rule__Global__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Global__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGlobalAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__1__Impl"


    // $ANTLR start "rule__Global__Group__2"
    // InternalIGES.g:688:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:692:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalIGES.g:693:2: rule__Global__Group__2__Impl rule__Global__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Global__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2"


    // $ANTLR start "rule__Global__Group__2__Impl"
    // InternalIGES.g:700:1: rule__Global__Group__2__Impl : ( ( rule__Global__ValuesAssignment_2 )* ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:704:1: ( ( ( rule__Global__ValuesAssignment_2 )* ) )
            // InternalIGES.g:705:1: ( ( rule__Global__ValuesAssignment_2 )* )
            {
            // InternalIGES.g:705:1: ( ( rule__Global__ValuesAssignment_2 )* )
            // InternalIGES.g:706:2: ( rule__Global__ValuesAssignment_2 )*
            {
             before(grammarAccess.getGlobalAccess().getValuesAssignment_2()); 
            // InternalIGES.g:707:2: ( rule__Global__ValuesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT||(LA8_0>=RULE_DELIMITER && LA8_0<=RULE_DOUBLE)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIGES.g:707:3: rule__Global__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Global__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGlobalAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__2__Impl"


    // $ANTLR start "rule__Global__Group__3"
    // InternalIGES.g:715:1: rule__Global__Group__3 : rule__Global__Group__3__Impl rule__Global__Group__4 ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:719:1: ( rule__Global__Group__3__Impl rule__Global__Group__4 )
            // InternalIGES.g:720:2: rule__Global__Group__3__Impl rule__Global__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Global__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__3"


    // $ANTLR start "rule__Global__Group__3__Impl"
    // InternalIGES.g:727:1: rule__Global__Group__3__Impl : ( RULE_SEPARATER ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:731:1: ( ( RULE_SEPARATER ) )
            // InternalIGES.g:732:1: ( RULE_SEPARATER )
            {
            // InternalIGES.g:732:1: ( RULE_SEPARATER )
            // InternalIGES.g:733:2: RULE_SEPARATER
            {
             before(grammarAccess.getGlobalAccess().getSEPARATERTerminalRuleCall_3()); 
            match(input,RULE_SEPARATER,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getSEPARATERTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__3__Impl"


    // $ANTLR start "rule__Global__Group__4"
    // InternalIGES.g:742:1: rule__Global__Group__4 : rule__Global__Group__4__Impl rule__Global__Group__5 ;
    public final void rule__Global__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:746:1: ( rule__Global__Group__4__Impl rule__Global__Group__5 )
            // InternalIGES.g:747:2: rule__Global__Group__4__Impl rule__Global__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Global__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__4"


    // $ANTLR start "rule__Global__Group__4__Impl"
    // InternalIGES.g:754:1: rule__Global__Group__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:758:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:759:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:759:1: ( ( RULE_WS )? )
            // InternalIGES.g:760:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4()); 
            // InternalIGES.g:761:2: ( RULE_WS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_WS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIGES.g:761:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__4__Impl"


    // $ANTLR start "rule__Global__Group__5"
    // InternalIGES.g:769:1: rule__Global__Group__5 : rule__Global__Group__5__Impl rule__Global__Group__6 ;
    public final void rule__Global__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:773:1: ( rule__Global__Group__5__Impl rule__Global__Group__6 )
            // InternalIGES.g:774:2: rule__Global__Group__5__Impl rule__Global__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__5"


    // $ANTLR start "rule__Global__Group__5__Impl"
    // InternalIGES.g:781:1: rule__Global__Group__5__Impl : ( 'G' ) ;
    public final void rule__Global__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:785:1: ( ( 'G' ) )
            // InternalIGES.g:786:1: ( 'G' )
            {
            // InternalIGES.g:786:1: ( 'G' )
            // InternalIGES.g:787:2: 'G'
            {
             before(grammarAccess.getGlobalAccess().getGKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getGKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__5__Impl"


    // $ANTLR start "rule__Global__Group__6"
    // InternalIGES.g:796:1: rule__Global__Group__6 : rule__Global__Group__6__Impl rule__Global__Group__7 ;
    public final void rule__Global__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:800:1: ( rule__Global__Group__6__Impl rule__Global__Group__7 )
            // InternalIGES.g:801:2: rule__Global__Group__6__Impl rule__Global__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__6"


    // $ANTLR start "rule__Global__Group__6__Impl"
    // InternalIGES.g:808:1: rule__Global__Group__6__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:812:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:813:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:813:1: ( ( RULE_WS )? )
            // InternalIGES.g:814:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_6()); 
            // InternalIGES.g:815:2: ( RULE_WS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIGES.g:815:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__6__Impl"


    // $ANTLR start "rule__Global__Group__7"
    // InternalIGES.g:823:1: rule__Global__Group__7 : rule__Global__Group__7__Impl rule__Global__Group__8 ;
    public final void rule__Global__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:827:1: ( rule__Global__Group__7__Impl rule__Global__Group__8 )
            // InternalIGES.g:828:2: rule__Global__Group__7__Impl rule__Global__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Global__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__7"


    // $ANTLR start "rule__Global__Group__7__Impl"
    // InternalIGES.g:835:1: rule__Global__Group__7__Impl : ( RULE_INT ) ;
    public final void rule__Global__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:839:1: ( ( RULE_INT ) )
            // InternalIGES.g:840:1: ( RULE_INT )
            {
            // InternalIGES.g:840:1: ( RULE_INT )
            // InternalIGES.g:841:2: RULE_INT
            {
             before(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_7()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__7__Impl"


    // $ANTLR start "rule__Global__Group__8"
    // InternalIGES.g:850:1: rule__Global__Group__8 : rule__Global__Group__8__Impl ;
    public final void rule__Global__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:854:1: ( rule__Global__Group__8__Impl )
            // InternalIGES.g:855:2: rule__Global__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__8"


    // $ANTLR start "rule__Global__Group__8__Impl"
    // InternalIGES.g:861:1: rule__Global__Group__8__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Global__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:865:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:866:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:866:1: ( RULE_ENDLINE )
            // InternalIGES.g:867:2: RULE_ENDLINE
            {
             before(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_8()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group__8__Impl"


    // $ANTLR start "rule__Global__Group_1__0"
    // InternalIGES.g:877:1: rule__Global__Group_1__0 : rule__Global__Group_1__0__Impl rule__Global__Group_1__1 ;
    public final void rule__Global__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:881:1: ( rule__Global__Group_1__0__Impl rule__Global__Group_1__1 )
            // InternalIGES.g:882:2: rule__Global__Group_1__0__Impl rule__Global__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Global__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__0"


    // $ANTLR start "rule__Global__Group_1__0__Impl"
    // InternalIGES.g:889:1: rule__Global__Group_1__0__Impl : ( ( rule__Global__ValuesAssignment_1_0 )* ) ;
    public final void rule__Global__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:893:1: ( ( ( rule__Global__ValuesAssignment_1_0 )* ) )
            // InternalIGES.g:894:1: ( ( rule__Global__ValuesAssignment_1_0 )* )
            {
            // InternalIGES.g:894:1: ( ( rule__Global__ValuesAssignment_1_0 )* )
            // InternalIGES.g:895:2: ( rule__Global__ValuesAssignment_1_0 )*
            {
             before(grammarAccess.getGlobalAccess().getValuesAssignment_1_0()); 
            // InternalIGES.g:896:2: ( rule__Global__ValuesAssignment_1_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT||(LA11_0>=RULE_DELIMITER && LA11_0<=RULE_DOUBLE)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIGES.g:896:3: rule__Global__ValuesAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Global__ValuesAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGlobalAccess().getValuesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__0__Impl"


    // $ANTLR start "rule__Global__Group_1__1"
    // InternalIGES.g:904:1: rule__Global__Group_1__1 : rule__Global__Group_1__1__Impl rule__Global__Group_1__2 ;
    public final void rule__Global__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:908:1: ( rule__Global__Group_1__1__Impl rule__Global__Group_1__2 )
            // InternalIGES.g:909:2: rule__Global__Group_1__1__Impl rule__Global__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Global__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__1"


    // $ANTLR start "rule__Global__Group_1__1__Impl"
    // InternalIGES.g:916:1: rule__Global__Group_1__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:920:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:921:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:921:1: ( ( RULE_WS )? )
            // InternalIGES.g:922:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_1_1()); 
            // InternalIGES.g:923:2: ( RULE_WS )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_WS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIGES.g:923:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__1__Impl"


    // $ANTLR start "rule__Global__Group_1__2"
    // InternalIGES.g:931:1: rule__Global__Group_1__2 : rule__Global__Group_1__2__Impl rule__Global__Group_1__3 ;
    public final void rule__Global__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:935:1: ( rule__Global__Group_1__2__Impl rule__Global__Group_1__3 )
            // InternalIGES.g:936:2: rule__Global__Group_1__2__Impl rule__Global__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__2"


    // $ANTLR start "rule__Global__Group_1__2__Impl"
    // InternalIGES.g:943:1: rule__Global__Group_1__2__Impl : ( 'G' ) ;
    public final void rule__Global__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:947:1: ( ( 'G' ) )
            // InternalIGES.g:948:1: ( 'G' )
            {
            // InternalIGES.g:948:1: ( 'G' )
            // InternalIGES.g:949:2: 'G'
            {
             before(grammarAccess.getGlobalAccess().getGKeyword_1_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getGKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__2__Impl"


    // $ANTLR start "rule__Global__Group_1__3"
    // InternalIGES.g:958:1: rule__Global__Group_1__3 : rule__Global__Group_1__3__Impl rule__Global__Group_1__4 ;
    public final void rule__Global__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:962:1: ( rule__Global__Group_1__3__Impl rule__Global__Group_1__4 )
            // InternalIGES.g:963:2: rule__Global__Group_1__3__Impl rule__Global__Group_1__4
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__3"


    // $ANTLR start "rule__Global__Group_1__3__Impl"
    // InternalIGES.g:970:1: rule__Global__Group_1__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:974:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:975:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:975:1: ( ( RULE_WS )? )
            // InternalIGES.g:976:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_1_3()); 
            // InternalIGES.g:977:2: ( RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIGES.g:977:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__3__Impl"


    // $ANTLR start "rule__Global__Group_1__4"
    // InternalIGES.g:985:1: rule__Global__Group_1__4 : rule__Global__Group_1__4__Impl rule__Global__Group_1__5 ;
    public final void rule__Global__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:989:1: ( rule__Global__Group_1__4__Impl rule__Global__Group_1__5 )
            // InternalIGES.g:990:2: rule__Global__Group_1__4__Impl rule__Global__Group_1__5
            {
            pushFollow(FOLLOW_15);
            rule__Global__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__4"


    // $ANTLR start "rule__Global__Group_1__4__Impl"
    // InternalIGES.g:997:1: rule__Global__Group_1__4__Impl : ( RULE_INT ) ;
    public final void rule__Global__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1001:1: ( ( RULE_INT ) )
            // InternalIGES.g:1002:1: ( RULE_INT )
            {
            // InternalIGES.g:1002:1: ( RULE_INT )
            // InternalIGES.g:1003:2: RULE_INT
            {
             before(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_1_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__4__Impl"


    // $ANTLR start "rule__Global__Group_1__5"
    // InternalIGES.g:1012:1: rule__Global__Group_1__5 : rule__Global__Group_1__5__Impl ;
    public final void rule__Global__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1016:1: ( rule__Global__Group_1__5__Impl )
            // InternalIGES.g:1017:2: rule__Global__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__5"


    // $ANTLR start "rule__Global__Group_1__5__Impl"
    // InternalIGES.g:1023:1: rule__Global__Group_1__5__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Global__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1027:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:1028:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:1028:1: ( RULE_ENDLINE )
            // InternalIGES.g:1029:2: RULE_ENDLINE
            {
             before(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_1_5()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__Group_1__5__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // InternalIGES.g:1039:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1043:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalIGES.g:1044:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Entry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0"


    // $ANTLR start "rule__Entry__Group__0__Impl"
    // InternalIGES.g:1051:1: rule__Entry__Group__0__Impl : ( RULE_WS ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1055:1: ( ( RULE_WS ) )
            // InternalIGES.g:1056:1: ( RULE_WS )
            {
            // InternalIGES.g:1056:1: ( RULE_WS )
            // InternalIGES.g:1057:2: RULE_WS
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_0()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__0__Impl"


    // $ANTLR start "rule__Entry__Group__1"
    // InternalIGES.g:1066:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1070:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalIGES.g:1071:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1"


    // $ANTLR start "rule__Entry__Group__1__Impl"
    // InternalIGES.g:1078:1: rule__Entry__Group__1__Impl : ( ( rule__Entry__TypeAssignment_1 ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1082:1: ( ( ( rule__Entry__TypeAssignment_1 ) ) )
            // InternalIGES.g:1083:1: ( ( rule__Entry__TypeAssignment_1 ) )
            {
            // InternalIGES.g:1083:1: ( ( rule__Entry__TypeAssignment_1 ) )
            // InternalIGES.g:1084:2: ( rule__Entry__TypeAssignment_1 )
            {
             before(grammarAccess.getEntryAccess().getTypeAssignment_1()); 
            // InternalIGES.g:1085:2: ( rule__Entry__TypeAssignment_1 )
            // InternalIGES.g:1085:3: rule__Entry__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entry__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__1__Impl"


    // $ANTLR start "rule__Entry__Group__2"
    // InternalIGES.g:1093:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1097:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalIGES.g:1098:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2"


    // $ANTLR start "rule__Entry__Group__2__Impl"
    // InternalIGES.g:1105:1: rule__Entry__Group__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1109:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1110:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1110:1: ( ( RULE_WS )? )
            // InternalIGES.g:1111:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_2()); 
            // InternalIGES.g:1112:2: ( RULE_WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIGES.g:1112:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__2__Impl"


    // $ANTLR start "rule__Entry__Group__3"
    // InternalIGES.g:1120:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1124:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalIGES.g:1125:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__3"


    // $ANTLR start "rule__Entry__Group__3__Impl"
    // InternalIGES.g:1132:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__ParamDataAssignment_3 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1136:1: ( ( ( rule__Entry__ParamDataAssignment_3 ) ) )
            // InternalIGES.g:1137:1: ( ( rule__Entry__ParamDataAssignment_3 ) )
            {
            // InternalIGES.g:1137:1: ( ( rule__Entry__ParamDataAssignment_3 ) )
            // InternalIGES.g:1138:2: ( rule__Entry__ParamDataAssignment_3 )
            {
             before(grammarAccess.getEntryAccess().getParamDataAssignment_3()); 
            // InternalIGES.g:1139:2: ( rule__Entry__ParamDataAssignment_3 )
            // InternalIGES.g:1139:3: rule__Entry__ParamDataAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ParamDataAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getParamDataAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__3__Impl"


    // $ANTLR start "rule__Entry__Group__4"
    // InternalIGES.g:1147:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl rule__Entry__Group__5 ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1151:1: ( rule__Entry__Group__4__Impl rule__Entry__Group__5 )
            // InternalIGES.g:1152:2: rule__Entry__Group__4__Impl rule__Entry__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__4"


    // $ANTLR start "rule__Entry__Group__4__Impl"
    // InternalIGES.g:1159:1: rule__Entry__Group__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1163:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1164:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1164:1: ( ( RULE_WS )? )
            // InternalIGES.g:1165:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_4()); 
            // InternalIGES.g:1166:2: ( RULE_WS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_WS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIGES.g:1166:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__4__Impl"


    // $ANTLR start "rule__Entry__Group__5"
    // InternalIGES.g:1174:1: rule__Entry__Group__5 : rule__Entry__Group__5__Impl rule__Entry__Group__6 ;
    public final void rule__Entry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1178:1: ( rule__Entry__Group__5__Impl rule__Entry__Group__6 )
            // InternalIGES.g:1179:2: rule__Entry__Group__5__Impl rule__Entry__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__5"


    // $ANTLR start "rule__Entry__Group__5__Impl"
    // InternalIGES.g:1186:1: rule__Entry__Group__5__Impl : ( ( rule__Entry__StructureAssignment_5 ) ) ;
    public final void rule__Entry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1190:1: ( ( ( rule__Entry__StructureAssignment_5 ) ) )
            // InternalIGES.g:1191:1: ( ( rule__Entry__StructureAssignment_5 ) )
            {
            // InternalIGES.g:1191:1: ( ( rule__Entry__StructureAssignment_5 ) )
            // InternalIGES.g:1192:2: ( rule__Entry__StructureAssignment_5 )
            {
             before(grammarAccess.getEntryAccess().getStructureAssignment_5()); 
            // InternalIGES.g:1193:2: ( rule__Entry__StructureAssignment_5 )
            // InternalIGES.g:1193:3: rule__Entry__StructureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Entry__StructureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getStructureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__5__Impl"


    // $ANTLR start "rule__Entry__Group__6"
    // InternalIGES.g:1201:1: rule__Entry__Group__6 : rule__Entry__Group__6__Impl rule__Entry__Group__7 ;
    public final void rule__Entry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1205:1: ( rule__Entry__Group__6__Impl rule__Entry__Group__7 )
            // InternalIGES.g:1206:2: rule__Entry__Group__6__Impl rule__Entry__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__6"


    // $ANTLR start "rule__Entry__Group__6__Impl"
    // InternalIGES.g:1213:1: rule__Entry__Group__6__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1217:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1218:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1218:1: ( ( RULE_WS )? )
            // InternalIGES.g:1219:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_6()); 
            // InternalIGES.g:1220:2: ( RULE_WS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_WS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIGES.g:1220:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__6__Impl"


    // $ANTLR start "rule__Entry__Group__7"
    // InternalIGES.g:1228:1: rule__Entry__Group__7 : rule__Entry__Group__7__Impl rule__Entry__Group__8 ;
    public final void rule__Entry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1232:1: ( rule__Entry__Group__7__Impl rule__Entry__Group__8 )
            // InternalIGES.g:1233:2: rule__Entry__Group__7__Impl rule__Entry__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__7"


    // $ANTLR start "rule__Entry__Group__7__Impl"
    // InternalIGES.g:1240:1: rule__Entry__Group__7__Impl : ( ( rule__Entry__LineFontAssignment_7 ) ) ;
    public final void rule__Entry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1244:1: ( ( ( rule__Entry__LineFontAssignment_7 ) ) )
            // InternalIGES.g:1245:1: ( ( rule__Entry__LineFontAssignment_7 ) )
            {
            // InternalIGES.g:1245:1: ( ( rule__Entry__LineFontAssignment_7 ) )
            // InternalIGES.g:1246:2: ( rule__Entry__LineFontAssignment_7 )
            {
             before(grammarAccess.getEntryAccess().getLineFontAssignment_7()); 
            // InternalIGES.g:1247:2: ( rule__Entry__LineFontAssignment_7 )
            // InternalIGES.g:1247:3: rule__Entry__LineFontAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Entry__LineFontAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getLineFontAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__7__Impl"


    // $ANTLR start "rule__Entry__Group__8"
    // InternalIGES.g:1255:1: rule__Entry__Group__8 : rule__Entry__Group__8__Impl rule__Entry__Group__9 ;
    public final void rule__Entry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1259:1: ( rule__Entry__Group__8__Impl rule__Entry__Group__9 )
            // InternalIGES.g:1260:2: rule__Entry__Group__8__Impl rule__Entry__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__8"


    // $ANTLR start "rule__Entry__Group__8__Impl"
    // InternalIGES.g:1267:1: rule__Entry__Group__8__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1271:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1272:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1272:1: ( ( RULE_WS )? )
            // InternalIGES.g:1273:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_8()); 
            // InternalIGES.g:1274:2: ( RULE_WS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_WS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIGES.g:1274:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__8__Impl"


    // $ANTLR start "rule__Entry__Group__9"
    // InternalIGES.g:1282:1: rule__Entry__Group__9 : rule__Entry__Group__9__Impl rule__Entry__Group__10 ;
    public final void rule__Entry__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1286:1: ( rule__Entry__Group__9__Impl rule__Entry__Group__10 )
            // InternalIGES.g:1287:2: rule__Entry__Group__9__Impl rule__Entry__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__9"


    // $ANTLR start "rule__Entry__Group__9__Impl"
    // InternalIGES.g:1294:1: rule__Entry__Group__9__Impl : ( ( rule__Entry__LevelAssignment_9 ) ) ;
    public final void rule__Entry__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1298:1: ( ( ( rule__Entry__LevelAssignment_9 ) ) )
            // InternalIGES.g:1299:1: ( ( rule__Entry__LevelAssignment_9 ) )
            {
            // InternalIGES.g:1299:1: ( ( rule__Entry__LevelAssignment_9 ) )
            // InternalIGES.g:1300:2: ( rule__Entry__LevelAssignment_9 )
            {
             before(grammarAccess.getEntryAccess().getLevelAssignment_9()); 
            // InternalIGES.g:1301:2: ( rule__Entry__LevelAssignment_9 )
            // InternalIGES.g:1301:3: rule__Entry__LevelAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Entry__LevelAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getLevelAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__9__Impl"


    // $ANTLR start "rule__Entry__Group__10"
    // InternalIGES.g:1309:1: rule__Entry__Group__10 : rule__Entry__Group__10__Impl rule__Entry__Group__11 ;
    public final void rule__Entry__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1313:1: ( rule__Entry__Group__10__Impl rule__Entry__Group__11 )
            // InternalIGES.g:1314:2: rule__Entry__Group__10__Impl rule__Entry__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__10"


    // $ANTLR start "rule__Entry__Group__10__Impl"
    // InternalIGES.g:1321:1: rule__Entry__Group__10__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1325:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1326:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1326:1: ( ( RULE_WS )? )
            // InternalIGES.g:1327:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_10()); 
            // InternalIGES.g:1328:2: ( RULE_WS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_WS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIGES.g:1328:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__10__Impl"


    // $ANTLR start "rule__Entry__Group__11"
    // InternalIGES.g:1336:1: rule__Entry__Group__11 : rule__Entry__Group__11__Impl rule__Entry__Group__12 ;
    public final void rule__Entry__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1340:1: ( rule__Entry__Group__11__Impl rule__Entry__Group__12 )
            // InternalIGES.g:1341:2: rule__Entry__Group__11__Impl rule__Entry__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__11"


    // $ANTLR start "rule__Entry__Group__11__Impl"
    // InternalIGES.g:1348:1: rule__Entry__Group__11__Impl : ( ( rule__Entry__ViewAssignment_11 ) ) ;
    public final void rule__Entry__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1352:1: ( ( ( rule__Entry__ViewAssignment_11 ) ) )
            // InternalIGES.g:1353:1: ( ( rule__Entry__ViewAssignment_11 ) )
            {
            // InternalIGES.g:1353:1: ( ( rule__Entry__ViewAssignment_11 ) )
            // InternalIGES.g:1354:2: ( rule__Entry__ViewAssignment_11 )
            {
             before(grammarAccess.getEntryAccess().getViewAssignment_11()); 
            // InternalIGES.g:1355:2: ( rule__Entry__ViewAssignment_11 )
            // InternalIGES.g:1355:3: rule__Entry__ViewAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ViewAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getViewAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__11__Impl"


    // $ANTLR start "rule__Entry__Group__12"
    // InternalIGES.g:1363:1: rule__Entry__Group__12 : rule__Entry__Group__12__Impl rule__Entry__Group__13 ;
    public final void rule__Entry__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1367:1: ( rule__Entry__Group__12__Impl rule__Entry__Group__13 )
            // InternalIGES.g:1368:2: rule__Entry__Group__12__Impl rule__Entry__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__12"


    // $ANTLR start "rule__Entry__Group__12__Impl"
    // InternalIGES.g:1375:1: rule__Entry__Group__12__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1379:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1380:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1380:1: ( ( RULE_WS )? )
            // InternalIGES.g:1381:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_12()); 
            // InternalIGES.g:1382:2: ( RULE_WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_WS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIGES.g:1382:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__12__Impl"


    // $ANTLR start "rule__Entry__Group__13"
    // InternalIGES.g:1390:1: rule__Entry__Group__13 : rule__Entry__Group__13__Impl rule__Entry__Group__14 ;
    public final void rule__Entry__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1394:1: ( rule__Entry__Group__13__Impl rule__Entry__Group__14 )
            // InternalIGES.g:1395:2: rule__Entry__Group__13__Impl rule__Entry__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__13"


    // $ANTLR start "rule__Entry__Group__13__Impl"
    // InternalIGES.g:1402:1: rule__Entry__Group__13__Impl : ( ( rule__Entry__TransformMatrixAssignment_13 ) ) ;
    public final void rule__Entry__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1406:1: ( ( ( rule__Entry__TransformMatrixAssignment_13 ) ) )
            // InternalIGES.g:1407:1: ( ( rule__Entry__TransformMatrixAssignment_13 ) )
            {
            // InternalIGES.g:1407:1: ( ( rule__Entry__TransformMatrixAssignment_13 ) )
            // InternalIGES.g:1408:2: ( rule__Entry__TransformMatrixAssignment_13 )
            {
             before(grammarAccess.getEntryAccess().getTransformMatrixAssignment_13()); 
            // InternalIGES.g:1409:2: ( rule__Entry__TransformMatrixAssignment_13 )
            // InternalIGES.g:1409:3: rule__Entry__TransformMatrixAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Entry__TransformMatrixAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getTransformMatrixAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__13__Impl"


    // $ANTLR start "rule__Entry__Group__14"
    // InternalIGES.g:1417:1: rule__Entry__Group__14 : rule__Entry__Group__14__Impl rule__Entry__Group__15 ;
    public final void rule__Entry__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1421:1: ( rule__Entry__Group__14__Impl rule__Entry__Group__15 )
            // InternalIGES.g:1422:2: rule__Entry__Group__14__Impl rule__Entry__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__14"


    // $ANTLR start "rule__Entry__Group__14__Impl"
    // InternalIGES.g:1429:1: rule__Entry__Group__14__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1433:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1434:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1434:1: ( ( RULE_WS )? )
            // InternalIGES.g:1435:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_14()); 
            // InternalIGES.g:1436:2: ( RULE_WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_WS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIGES.g:1436:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__14__Impl"


    // $ANTLR start "rule__Entry__Group__15"
    // InternalIGES.g:1444:1: rule__Entry__Group__15 : rule__Entry__Group__15__Impl rule__Entry__Group__16 ;
    public final void rule__Entry__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1448:1: ( rule__Entry__Group__15__Impl rule__Entry__Group__16 )
            // InternalIGES.g:1449:2: rule__Entry__Group__15__Impl rule__Entry__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__15"


    // $ANTLR start "rule__Entry__Group__15__Impl"
    // InternalIGES.g:1456:1: rule__Entry__Group__15__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Entry__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1460:1: ( ( ( RULE_INT )? ) )
            // InternalIGES.g:1461:1: ( ( RULE_INT )? )
            {
            // InternalIGES.g:1461:1: ( ( RULE_INT )? )
            // InternalIGES.g:1462:2: ( RULE_INT )?
            {
             before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_15()); 
            // InternalIGES.g:1463:2: ( RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_WS||LA21_1==RULE_INT) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalIGES.g:1463:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getINTTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__15__Impl"


    // $ANTLR start "rule__Entry__Group__16"
    // InternalIGES.g:1471:1: rule__Entry__Group__16 : rule__Entry__Group__16__Impl rule__Entry__Group__17 ;
    public final void rule__Entry__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1475:1: ( rule__Entry__Group__16__Impl rule__Entry__Group__17 )
            // InternalIGES.g:1476:2: rule__Entry__Group__16__Impl rule__Entry__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__16"


    // $ANTLR start "rule__Entry__Group__16__Impl"
    // InternalIGES.g:1483:1: rule__Entry__Group__16__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1487:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1488:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1488:1: ( ( RULE_WS )? )
            // InternalIGES.g:1489:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_16()); 
            // InternalIGES.g:1490:2: ( RULE_WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_WS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIGES.g:1490:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__16__Impl"


    // $ANTLR start "rule__Entry__Group__17"
    // InternalIGES.g:1498:1: rule__Entry__Group__17 : rule__Entry__Group__17__Impl rule__Entry__Group__18 ;
    public final void rule__Entry__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1502:1: ( rule__Entry__Group__17__Impl rule__Entry__Group__18 )
            // InternalIGES.g:1503:2: rule__Entry__Group__17__Impl rule__Entry__Group__18
            {
            pushFollow(FOLLOW_17);
            rule__Entry__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__17"


    // $ANTLR start "rule__Entry__Group__17__Impl"
    // InternalIGES.g:1510:1: rule__Entry__Group__17__Impl : ( ( rule__Entry__StatusAssignment_17 ) ) ;
    public final void rule__Entry__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1514:1: ( ( ( rule__Entry__StatusAssignment_17 ) ) )
            // InternalIGES.g:1515:1: ( ( rule__Entry__StatusAssignment_17 ) )
            {
            // InternalIGES.g:1515:1: ( ( rule__Entry__StatusAssignment_17 ) )
            // InternalIGES.g:1516:2: ( rule__Entry__StatusAssignment_17 )
            {
             before(grammarAccess.getEntryAccess().getStatusAssignment_17()); 
            // InternalIGES.g:1517:2: ( rule__Entry__StatusAssignment_17 )
            // InternalIGES.g:1517:3: rule__Entry__StatusAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Entry__StatusAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getStatusAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__17__Impl"


    // $ANTLR start "rule__Entry__Group__18"
    // InternalIGES.g:1525:1: rule__Entry__Group__18 : rule__Entry__Group__18__Impl rule__Entry__Group__19 ;
    public final void rule__Entry__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1529:1: ( rule__Entry__Group__18__Impl rule__Entry__Group__19 )
            // InternalIGES.g:1530:2: rule__Entry__Group__18__Impl rule__Entry__Group__19
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__18"


    // $ANTLR start "rule__Entry__Group__18__Impl"
    // InternalIGES.g:1537:1: rule__Entry__Group__18__Impl : ( 'D' ) ;
    public final void rule__Entry__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1541:1: ( ( 'D' ) )
            // InternalIGES.g:1542:1: ( 'D' )
            {
            // InternalIGES.g:1542:1: ( 'D' )
            // InternalIGES.g:1543:2: 'D'
            {
             before(grammarAccess.getEntryAccess().getDKeyword_18()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getDKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__18__Impl"


    // $ANTLR start "rule__Entry__Group__19"
    // InternalIGES.g:1552:1: rule__Entry__Group__19 : rule__Entry__Group__19__Impl rule__Entry__Group__20 ;
    public final void rule__Entry__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1556:1: ( rule__Entry__Group__19__Impl rule__Entry__Group__20 )
            // InternalIGES.g:1557:2: rule__Entry__Group__19__Impl rule__Entry__Group__20
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__19"


    // $ANTLR start "rule__Entry__Group__19__Impl"
    // InternalIGES.g:1564:1: rule__Entry__Group__19__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1568:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1569:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1569:1: ( ( RULE_WS )? )
            // InternalIGES.g:1570:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_19()); 
            // InternalIGES.g:1571:2: ( RULE_WS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_WS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIGES.g:1571:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__19__Impl"


    // $ANTLR start "rule__Entry__Group__20"
    // InternalIGES.g:1579:1: rule__Entry__Group__20 : rule__Entry__Group__20__Impl rule__Entry__Group__21 ;
    public final void rule__Entry__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1583:1: ( rule__Entry__Group__20__Impl rule__Entry__Group__21 )
            // InternalIGES.g:1584:2: rule__Entry__Group__20__Impl rule__Entry__Group__21
            {
            pushFollow(FOLLOW_15);
            rule__Entry__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__20"


    // $ANTLR start "rule__Entry__Group__20__Impl"
    // InternalIGES.g:1591:1: rule__Entry__Group__20__Impl : ( ( rule__Entry__IndexAssignment_20 ) ) ;
    public final void rule__Entry__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1595:1: ( ( ( rule__Entry__IndexAssignment_20 ) ) )
            // InternalIGES.g:1596:1: ( ( rule__Entry__IndexAssignment_20 ) )
            {
            // InternalIGES.g:1596:1: ( ( rule__Entry__IndexAssignment_20 ) )
            // InternalIGES.g:1597:2: ( rule__Entry__IndexAssignment_20 )
            {
             before(grammarAccess.getEntryAccess().getIndexAssignment_20()); 
            // InternalIGES.g:1598:2: ( rule__Entry__IndexAssignment_20 )
            // InternalIGES.g:1598:3: rule__Entry__IndexAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__Entry__IndexAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getIndexAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__20__Impl"


    // $ANTLR start "rule__Entry__Group__21"
    // InternalIGES.g:1606:1: rule__Entry__Group__21 : rule__Entry__Group__21__Impl rule__Entry__Group__22 ;
    public final void rule__Entry__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1610:1: ( rule__Entry__Group__21__Impl rule__Entry__Group__22 )
            // InternalIGES.g:1611:2: rule__Entry__Group__21__Impl rule__Entry__Group__22
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__21"


    // $ANTLR start "rule__Entry__Group__21__Impl"
    // InternalIGES.g:1618:1: rule__Entry__Group__21__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Entry__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1622:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:1623:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:1623:1: ( RULE_ENDLINE )
            // InternalIGES.g:1624:2: RULE_ENDLINE
            {
             before(grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_21()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__21__Impl"


    // $ANTLR start "rule__Entry__Group__22"
    // InternalIGES.g:1633:1: rule__Entry__Group__22 : rule__Entry__Group__22__Impl rule__Entry__Group__23 ;
    public final void rule__Entry__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1637:1: ( rule__Entry__Group__22__Impl rule__Entry__Group__23 )
            // InternalIGES.g:1638:2: rule__Entry__Group__22__Impl rule__Entry__Group__23
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__22"


    // $ANTLR start "rule__Entry__Group__22__Impl"
    // InternalIGES.g:1645:1: rule__Entry__Group__22__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1649:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1650:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1650:1: ( ( RULE_WS )? )
            // InternalIGES.g:1651:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_22()); 
            // InternalIGES.g:1652:2: ( RULE_WS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_WS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIGES.g:1652:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__22__Impl"


    // $ANTLR start "rule__Entry__Group__23"
    // InternalIGES.g:1660:1: rule__Entry__Group__23 : rule__Entry__Group__23__Impl rule__Entry__Group__24 ;
    public final void rule__Entry__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1664:1: ( rule__Entry__Group__23__Impl rule__Entry__Group__24 )
            // InternalIGES.g:1665:2: rule__Entry__Group__23__Impl rule__Entry__Group__24
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__23"


    // $ANTLR start "rule__Entry__Group__23__Impl"
    // InternalIGES.g:1672:1: rule__Entry__Group__23__Impl : ( RULE_INT ) ;
    public final void rule__Entry__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1676:1: ( ( RULE_INT ) )
            // InternalIGES.g:1677:1: ( RULE_INT )
            {
            // InternalIGES.g:1677:1: ( RULE_INT )
            // InternalIGES.g:1678:2: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_23()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getINTTerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__23__Impl"


    // $ANTLR start "rule__Entry__Group__24"
    // InternalIGES.g:1687:1: rule__Entry__Group__24 : rule__Entry__Group__24__Impl rule__Entry__Group__25 ;
    public final void rule__Entry__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1691:1: ( rule__Entry__Group__24__Impl rule__Entry__Group__25 )
            // InternalIGES.g:1692:2: rule__Entry__Group__24__Impl rule__Entry__Group__25
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__24"


    // $ANTLR start "rule__Entry__Group__24__Impl"
    // InternalIGES.g:1699:1: rule__Entry__Group__24__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1703:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1704:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1704:1: ( ( RULE_WS )? )
            // InternalIGES.g:1705:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_24()); 
            // InternalIGES.g:1706:2: ( RULE_WS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_WS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIGES.g:1706:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__24__Impl"


    // $ANTLR start "rule__Entry__Group__25"
    // InternalIGES.g:1714:1: rule__Entry__Group__25 : rule__Entry__Group__25__Impl rule__Entry__Group__26 ;
    public final void rule__Entry__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1718:1: ( rule__Entry__Group__25__Impl rule__Entry__Group__26 )
            // InternalIGES.g:1719:2: rule__Entry__Group__25__Impl rule__Entry__Group__26
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__25"


    // $ANTLR start "rule__Entry__Group__25__Impl"
    // InternalIGES.g:1726:1: rule__Entry__Group__25__Impl : ( ( rule__Entry__LineWeightAssignment_25 ) ) ;
    public final void rule__Entry__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1730:1: ( ( ( rule__Entry__LineWeightAssignment_25 ) ) )
            // InternalIGES.g:1731:1: ( ( rule__Entry__LineWeightAssignment_25 ) )
            {
            // InternalIGES.g:1731:1: ( ( rule__Entry__LineWeightAssignment_25 ) )
            // InternalIGES.g:1732:2: ( rule__Entry__LineWeightAssignment_25 )
            {
             before(grammarAccess.getEntryAccess().getLineWeightAssignment_25()); 
            // InternalIGES.g:1733:2: ( rule__Entry__LineWeightAssignment_25 )
            // InternalIGES.g:1733:3: rule__Entry__LineWeightAssignment_25
            {
            pushFollow(FOLLOW_2);
            rule__Entry__LineWeightAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getLineWeightAssignment_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__25__Impl"


    // $ANTLR start "rule__Entry__Group__26"
    // InternalIGES.g:1741:1: rule__Entry__Group__26 : rule__Entry__Group__26__Impl rule__Entry__Group__27 ;
    public final void rule__Entry__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1745:1: ( rule__Entry__Group__26__Impl rule__Entry__Group__27 )
            // InternalIGES.g:1746:2: rule__Entry__Group__26__Impl rule__Entry__Group__27
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__26"


    // $ANTLR start "rule__Entry__Group__26__Impl"
    // InternalIGES.g:1753:1: rule__Entry__Group__26__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1757:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1758:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1758:1: ( ( RULE_WS )? )
            // InternalIGES.g:1759:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_26()); 
            // InternalIGES.g:1760:2: ( RULE_WS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_WS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIGES.g:1760:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__26__Impl"


    // $ANTLR start "rule__Entry__Group__27"
    // InternalIGES.g:1768:1: rule__Entry__Group__27 : rule__Entry__Group__27__Impl rule__Entry__Group__28 ;
    public final void rule__Entry__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1772:1: ( rule__Entry__Group__27__Impl rule__Entry__Group__28 )
            // InternalIGES.g:1773:2: rule__Entry__Group__27__Impl rule__Entry__Group__28
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__27"


    // $ANTLR start "rule__Entry__Group__27__Impl"
    // InternalIGES.g:1780:1: rule__Entry__Group__27__Impl : ( ( rule__Entry__ColorAssignment_27 ) ) ;
    public final void rule__Entry__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1784:1: ( ( ( rule__Entry__ColorAssignment_27 ) ) )
            // InternalIGES.g:1785:1: ( ( rule__Entry__ColorAssignment_27 ) )
            {
            // InternalIGES.g:1785:1: ( ( rule__Entry__ColorAssignment_27 ) )
            // InternalIGES.g:1786:2: ( rule__Entry__ColorAssignment_27 )
            {
             before(grammarAccess.getEntryAccess().getColorAssignment_27()); 
            // InternalIGES.g:1787:2: ( rule__Entry__ColorAssignment_27 )
            // InternalIGES.g:1787:3: rule__Entry__ColorAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ColorAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getColorAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__27__Impl"


    // $ANTLR start "rule__Entry__Group__28"
    // InternalIGES.g:1795:1: rule__Entry__Group__28 : rule__Entry__Group__28__Impl rule__Entry__Group__29 ;
    public final void rule__Entry__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1799:1: ( rule__Entry__Group__28__Impl rule__Entry__Group__29 )
            // InternalIGES.g:1800:2: rule__Entry__Group__28__Impl rule__Entry__Group__29
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__28"


    // $ANTLR start "rule__Entry__Group__28__Impl"
    // InternalIGES.g:1807:1: rule__Entry__Group__28__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1811:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1812:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1812:1: ( ( RULE_WS )? )
            // InternalIGES.g:1813:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_28()); 
            // InternalIGES.g:1814:2: ( RULE_WS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_WS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalIGES.g:1814:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__28__Impl"


    // $ANTLR start "rule__Entry__Group__29"
    // InternalIGES.g:1822:1: rule__Entry__Group__29 : rule__Entry__Group__29__Impl rule__Entry__Group__30 ;
    public final void rule__Entry__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1826:1: ( rule__Entry__Group__29__Impl rule__Entry__Group__30 )
            // InternalIGES.g:1827:2: rule__Entry__Group__29__Impl rule__Entry__Group__30
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__29"


    // $ANTLR start "rule__Entry__Group__29__Impl"
    // InternalIGES.g:1834:1: rule__Entry__Group__29__Impl : ( ( rule__Entry__ParamLinesAssignment_29 ) ) ;
    public final void rule__Entry__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1838:1: ( ( ( rule__Entry__ParamLinesAssignment_29 ) ) )
            // InternalIGES.g:1839:1: ( ( rule__Entry__ParamLinesAssignment_29 ) )
            {
            // InternalIGES.g:1839:1: ( ( rule__Entry__ParamLinesAssignment_29 ) )
            // InternalIGES.g:1840:2: ( rule__Entry__ParamLinesAssignment_29 )
            {
             before(grammarAccess.getEntryAccess().getParamLinesAssignment_29()); 
            // InternalIGES.g:1841:2: ( rule__Entry__ParamLinesAssignment_29 )
            // InternalIGES.g:1841:3: rule__Entry__ParamLinesAssignment_29
            {
            pushFollow(FOLLOW_2);
            rule__Entry__ParamLinesAssignment_29();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getParamLinesAssignment_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__29__Impl"


    // $ANTLR start "rule__Entry__Group__30"
    // InternalIGES.g:1849:1: rule__Entry__Group__30 : rule__Entry__Group__30__Impl rule__Entry__Group__31 ;
    public final void rule__Entry__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1853:1: ( rule__Entry__Group__30__Impl rule__Entry__Group__31 )
            // InternalIGES.g:1854:2: rule__Entry__Group__30__Impl rule__Entry__Group__31
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__30"


    // $ANTLR start "rule__Entry__Group__30__Impl"
    // InternalIGES.g:1861:1: rule__Entry__Group__30__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1865:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1866:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1866:1: ( ( RULE_WS )? )
            // InternalIGES.g:1867:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_30()); 
            // InternalIGES.g:1868:2: ( RULE_WS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_WS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIGES.g:1868:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__30__Impl"


    // $ANTLR start "rule__Entry__Group__31"
    // InternalIGES.g:1876:1: rule__Entry__Group__31 : rule__Entry__Group__31__Impl rule__Entry__Group__32 ;
    public final void rule__Entry__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1880:1: ( rule__Entry__Group__31__Impl rule__Entry__Group__32 )
            // InternalIGES.g:1881:2: rule__Entry__Group__31__Impl rule__Entry__Group__32
            {
            pushFollow(FOLLOW_18);
            rule__Entry__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__32();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__31"


    // $ANTLR start "rule__Entry__Group__31__Impl"
    // InternalIGES.g:1888:1: rule__Entry__Group__31__Impl : ( ( rule__Entry__FormAssignment_31 ) ) ;
    public final void rule__Entry__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1892:1: ( ( ( rule__Entry__FormAssignment_31 ) ) )
            // InternalIGES.g:1893:1: ( ( rule__Entry__FormAssignment_31 ) )
            {
            // InternalIGES.g:1893:1: ( ( rule__Entry__FormAssignment_31 ) )
            // InternalIGES.g:1894:2: ( rule__Entry__FormAssignment_31 )
            {
             before(grammarAccess.getEntryAccess().getFormAssignment_31()); 
            // InternalIGES.g:1895:2: ( rule__Entry__FormAssignment_31 )
            // InternalIGES.g:1895:3: rule__Entry__FormAssignment_31
            {
            pushFollow(FOLLOW_2);
            rule__Entry__FormAssignment_31();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getFormAssignment_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__31__Impl"


    // $ANTLR start "rule__Entry__Group__32"
    // InternalIGES.g:1903:1: rule__Entry__Group__32 : rule__Entry__Group__32__Impl rule__Entry__Group__33 ;
    public final void rule__Entry__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1907:1: ( rule__Entry__Group__32__Impl rule__Entry__Group__33 )
            // InternalIGES.g:1908:2: rule__Entry__Group__32__Impl rule__Entry__Group__33
            {
            pushFollow(FOLLOW_18);
            rule__Entry__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__33();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__32"


    // $ANTLR start "rule__Entry__Group__32__Impl"
    // InternalIGES.g:1915:1: rule__Entry__Group__32__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1919:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1920:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1920:1: ( ( RULE_WS )? )
            // InternalIGES.g:1921:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_32()); 
            // InternalIGES.g:1922:2: ( RULE_WS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_WS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalIGES.g:1922:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__32__Impl"


    // $ANTLR start "rule__Entry__Group__33"
    // InternalIGES.g:1930:1: rule__Entry__Group__33 : rule__Entry__Group__33__Impl rule__Entry__Group__34 ;
    public final void rule__Entry__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1934:1: ( rule__Entry__Group__33__Impl rule__Entry__Group__34 )
            // InternalIGES.g:1935:2: rule__Entry__Group__33__Impl rule__Entry__Group__34
            {
            pushFollow(FOLLOW_18);
            rule__Entry__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__34();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__33"


    // $ANTLR start "rule__Entry__Group__33__Impl"
    // InternalIGES.g:1942:1: rule__Entry__Group__33__Impl : ( ( rule__Entry__EntityLabelAssignment_33 )? ) ;
    public final void rule__Entry__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1946:1: ( ( ( rule__Entry__EntityLabelAssignment_33 )? ) )
            // InternalIGES.g:1947:1: ( ( rule__Entry__EntityLabelAssignment_33 )? )
            {
            // InternalIGES.g:1947:1: ( ( rule__Entry__EntityLabelAssignment_33 )? )
            // InternalIGES.g:1948:2: ( rule__Entry__EntityLabelAssignment_33 )?
            {
             before(grammarAccess.getEntryAccess().getEntityLabelAssignment_33()); 
            // InternalIGES.g:1949:2: ( rule__Entry__EntityLabelAssignment_33 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIGES.g:1949:3: rule__Entry__EntityLabelAssignment_33
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entry__EntityLabelAssignment_33();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getEntityLabelAssignment_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__33__Impl"


    // $ANTLR start "rule__Entry__Group__34"
    // InternalIGES.g:1957:1: rule__Entry__Group__34 : rule__Entry__Group__34__Impl rule__Entry__Group__35 ;
    public final void rule__Entry__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1961:1: ( rule__Entry__Group__34__Impl rule__Entry__Group__35 )
            // InternalIGES.g:1962:2: rule__Entry__Group__34__Impl rule__Entry__Group__35
            {
            pushFollow(FOLLOW_18);
            rule__Entry__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__35();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__34"


    // $ANTLR start "rule__Entry__Group__34__Impl"
    // InternalIGES.g:1969:1: rule__Entry__Group__34__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1973:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1974:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1974:1: ( ( RULE_WS )? )
            // InternalIGES.g:1975:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_34()); 
            // InternalIGES.g:1976:2: ( RULE_WS )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_WS) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIGES.g:1976:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_34()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__34__Impl"


    // $ANTLR start "rule__Entry__Group__35"
    // InternalIGES.g:1984:1: rule__Entry__Group__35 : rule__Entry__Group__35__Impl rule__Entry__Group__36 ;
    public final void rule__Entry__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1988:1: ( rule__Entry__Group__35__Impl rule__Entry__Group__36 )
            // InternalIGES.g:1989:2: rule__Entry__Group__35__Impl rule__Entry__Group__36
            {
            pushFollow(FOLLOW_17);
            rule__Entry__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__36();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__35"


    // $ANTLR start "rule__Entry__Group__35__Impl"
    // InternalIGES.g:1996:1: rule__Entry__Group__35__Impl : ( ( rule__Entry__SubNumAssignment_35 ) ) ;
    public final void rule__Entry__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2000:1: ( ( ( rule__Entry__SubNumAssignment_35 ) ) )
            // InternalIGES.g:2001:1: ( ( rule__Entry__SubNumAssignment_35 ) )
            {
            // InternalIGES.g:2001:1: ( ( rule__Entry__SubNumAssignment_35 ) )
            // InternalIGES.g:2002:2: ( rule__Entry__SubNumAssignment_35 )
            {
             before(grammarAccess.getEntryAccess().getSubNumAssignment_35()); 
            // InternalIGES.g:2003:2: ( rule__Entry__SubNumAssignment_35 )
            // InternalIGES.g:2003:3: rule__Entry__SubNumAssignment_35
            {
            pushFollow(FOLLOW_2);
            rule__Entry__SubNumAssignment_35();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getSubNumAssignment_35()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__35__Impl"


    // $ANTLR start "rule__Entry__Group__36"
    // InternalIGES.g:2011:1: rule__Entry__Group__36 : rule__Entry__Group__36__Impl rule__Entry__Group__37 ;
    public final void rule__Entry__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2015:1: ( rule__Entry__Group__36__Impl rule__Entry__Group__37 )
            // InternalIGES.g:2016:2: rule__Entry__Group__36__Impl rule__Entry__Group__37
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__37();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__36"


    // $ANTLR start "rule__Entry__Group__36__Impl"
    // InternalIGES.g:2023:1: rule__Entry__Group__36__Impl : ( 'D' ) ;
    public final void rule__Entry__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2027:1: ( ( 'D' ) )
            // InternalIGES.g:2028:1: ( 'D' )
            {
            // InternalIGES.g:2028:1: ( 'D' )
            // InternalIGES.g:2029:2: 'D'
            {
             before(grammarAccess.getEntryAccess().getDKeyword_36()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getDKeyword_36()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__36__Impl"


    // $ANTLR start "rule__Entry__Group__37"
    // InternalIGES.g:2038:1: rule__Entry__Group__37 : rule__Entry__Group__37__Impl rule__Entry__Group__38 ;
    public final void rule__Entry__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2042:1: ( rule__Entry__Group__37__Impl rule__Entry__Group__38 )
            // InternalIGES.g:2043:2: rule__Entry__Group__37__Impl rule__Entry__Group__38
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__38();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__37"


    // $ANTLR start "rule__Entry__Group__37__Impl"
    // InternalIGES.g:2050:1: rule__Entry__Group__37__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2054:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2055:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2055:1: ( ( RULE_WS )? )
            // InternalIGES.g:2056:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_37()); 
            // InternalIGES.g:2057:2: ( RULE_WS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_WS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalIGES.g:2057:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_37()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__37__Impl"


    // $ANTLR start "rule__Entry__Group__38"
    // InternalIGES.g:2065:1: rule__Entry__Group__38 : rule__Entry__Group__38__Impl rule__Entry__Group__39 ;
    public final void rule__Entry__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2069:1: ( rule__Entry__Group__38__Impl rule__Entry__Group__39 )
            // InternalIGES.g:2070:2: rule__Entry__Group__38__Impl rule__Entry__Group__39
            {
            pushFollow(FOLLOW_15);
            rule__Entry__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__39();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__38"


    // $ANTLR start "rule__Entry__Group__38__Impl"
    // InternalIGES.g:2077:1: rule__Entry__Group__38__Impl : ( RULE_INT ) ;
    public final void rule__Entry__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2081:1: ( ( RULE_INT ) )
            // InternalIGES.g:2082:1: ( RULE_INT )
            {
            // InternalIGES.g:2082:1: ( RULE_INT )
            // InternalIGES.g:2083:2: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_38()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getINTTerminalRuleCall_38()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__38__Impl"


    // $ANTLR start "rule__Entry__Group__39"
    // InternalIGES.g:2092:1: rule__Entry__Group__39 : rule__Entry__Group__39__Impl ;
    public final void rule__Entry__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2096:1: ( rule__Entry__Group__39__Impl )
            // InternalIGES.g:2097:2: rule__Entry__Group__39__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__39__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__39"


    // $ANTLR start "rule__Entry__Group__39__Impl"
    // InternalIGES.g:2103:1: rule__Entry__Group__39__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Entry__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2107:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:2108:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:2108:1: ( RULE_ENDLINE )
            // InternalIGES.g:2109:2: RULE_ENDLINE
            {
             before(grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_39()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_39()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Group__39__Impl"


    // $ANTLR start "rule__PEntry__Group__0"
    // InternalIGES.g:2119:1: rule__PEntry__Group__0 : rule__PEntry__Group__0__Impl rule__PEntry__Group__1 ;
    public final void rule__PEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2123:1: ( rule__PEntry__Group__0__Impl rule__PEntry__Group__1 )
            // InternalIGES.g:2124:2: rule__PEntry__Group__0__Impl rule__PEntry__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__0"


    // $ANTLR start "rule__PEntry__Group__0__Impl"
    // InternalIGES.g:2131:1: rule__PEntry__Group__0__Impl : ( ( rule__PEntry__TypeAssignment_0 ) ) ;
    public final void rule__PEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2135:1: ( ( ( rule__PEntry__TypeAssignment_0 ) ) )
            // InternalIGES.g:2136:1: ( ( rule__PEntry__TypeAssignment_0 ) )
            {
            // InternalIGES.g:2136:1: ( ( rule__PEntry__TypeAssignment_0 ) )
            // InternalIGES.g:2137:2: ( rule__PEntry__TypeAssignment_0 )
            {
             before(grammarAccess.getPEntryAccess().getTypeAssignment_0()); 
            // InternalIGES.g:2138:2: ( rule__PEntry__TypeAssignment_0 )
            // InternalIGES.g:2138:3: rule__PEntry__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPEntryAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__0__Impl"


    // $ANTLR start "rule__PEntry__Group__1"
    // InternalIGES.g:2146:1: rule__PEntry__Group__1 : rule__PEntry__Group__1__Impl rule__PEntry__Group__2 ;
    public final void rule__PEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2150:1: ( rule__PEntry__Group__1__Impl rule__PEntry__Group__2 )
            // InternalIGES.g:2151:2: rule__PEntry__Group__1__Impl rule__PEntry__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__1"


    // $ANTLR start "rule__PEntry__Group__1__Impl"
    // InternalIGES.g:2158:1: rule__PEntry__Group__1__Impl : ( ( rule__PEntry__ValuesAssignment_1 )* ) ;
    public final void rule__PEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2162:1: ( ( ( rule__PEntry__ValuesAssignment_1 )* ) )
            // InternalIGES.g:2163:1: ( ( rule__PEntry__ValuesAssignment_1 )* )
            {
            // InternalIGES.g:2163:1: ( ( rule__PEntry__ValuesAssignment_1 )* )
            // InternalIGES.g:2164:2: ( rule__PEntry__ValuesAssignment_1 )*
            {
             before(grammarAccess.getPEntryAccess().getValuesAssignment_1()); 
            // InternalIGES.g:2165:2: ( rule__PEntry__ValuesAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT||(LA33_0>=RULE_DELIMITER && LA33_0<=RULE_DOUBLE)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalIGES.g:2165:3: rule__PEntry__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PEntry__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPEntryAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__1__Impl"


    // $ANTLR start "rule__PEntry__Group__2"
    // InternalIGES.g:2173:1: rule__PEntry__Group__2 : rule__PEntry__Group__2__Impl rule__PEntry__Group__3 ;
    public final void rule__PEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2177:1: ( rule__PEntry__Group__2__Impl rule__PEntry__Group__3 )
            // InternalIGES.g:2178:2: rule__PEntry__Group__2__Impl rule__PEntry__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__PEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__2"


    // $ANTLR start "rule__PEntry__Group__2__Impl"
    // InternalIGES.g:2185:1: rule__PEntry__Group__2__Impl : ( RULE_SEPARATER ) ;
    public final void rule__PEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2189:1: ( ( RULE_SEPARATER ) )
            // InternalIGES.g:2190:1: ( RULE_SEPARATER )
            {
            // InternalIGES.g:2190:1: ( RULE_SEPARATER )
            // InternalIGES.g:2191:2: RULE_SEPARATER
            {
             before(grammarAccess.getPEntryAccess().getSEPARATERTerminalRuleCall_2()); 
            match(input,RULE_SEPARATER,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getSEPARATERTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__2__Impl"


    // $ANTLR start "rule__PEntry__Group__3"
    // InternalIGES.g:2200:1: rule__PEntry__Group__3 : rule__PEntry__Group__3__Impl rule__PEntry__Group__4 ;
    public final void rule__PEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2204:1: ( rule__PEntry__Group__3__Impl rule__PEntry__Group__4 )
            // InternalIGES.g:2205:2: rule__PEntry__Group__3__Impl rule__PEntry__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__PEntry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__3"


    // $ANTLR start "rule__PEntry__Group__3__Impl"
    // InternalIGES.g:2212:1: rule__PEntry__Group__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2216:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2217:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2217:1: ( ( RULE_WS )? )
            // InternalIGES.g:2218:2: ( RULE_WS )?
            {
             before(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_3()); 
            // InternalIGES.g:2219:2: ( RULE_WS )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_WS) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIGES.g:2219:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__3__Impl"


    // $ANTLR start "rule__PEntry__Group__4"
    // InternalIGES.g:2227:1: rule__PEntry__Group__4 : rule__PEntry__Group__4__Impl rule__PEntry__Group__5 ;
    public final void rule__PEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2231:1: ( rule__PEntry__Group__4__Impl rule__PEntry__Group__5 )
            // InternalIGES.g:2232:2: rule__PEntry__Group__4__Impl rule__PEntry__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__PEntry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__4"


    // $ANTLR start "rule__PEntry__Group__4__Impl"
    // InternalIGES.g:2239:1: rule__PEntry__Group__4__Impl : ( ( rule__PEntry__DIndexAssignment_4 ) ) ;
    public final void rule__PEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2243:1: ( ( ( rule__PEntry__DIndexAssignment_4 ) ) )
            // InternalIGES.g:2244:1: ( ( rule__PEntry__DIndexAssignment_4 ) )
            {
            // InternalIGES.g:2244:1: ( ( rule__PEntry__DIndexAssignment_4 ) )
            // InternalIGES.g:2245:2: ( rule__PEntry__DIndexAssignment_4 )
            {
             before(grammarAccess.getPEntryAccess().getDIndexAssignment_4()); 
            // InternalIGES.g:2246:2: ( rule__PEntry__DIndexAssignment_4 )
            // InternalIGES.g:2246:3: rule__PEntry__DIndexAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__DIndexAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPEntryAccess().getDIndexAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__4__Impl"


    // $ANTLR start "rule__PEntry__Group__5"
    // InternalIGES.g:2254:1: rule__PEntry__Group__5 : rule__PEntry__Group__5__Impl rule__PEntry__Group__6 ;
    public final void rule__PEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2258:1: ( rule__PEntry__Group__5__Impl rule__PEntry__Group__6 )
            // InternalIGES.g:2259:2: rule__PEntry__Group__5__Impl rule__PEntry__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__PEntry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__5"


    // $ANTLR start "rule__PEntry__Group__5__Impl"
    // InternalIGES.g:2266:1: rule__PEntry__Group__5__Impl : ( 'P' ) ;
    public final void rule__PEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2270:1: ( ( 'P' ) )
            // InternalIGES.g:2271:1: ( 'P' )
            {
            // InternalIGES.g:2271:1: ( 'P' )
            // InternalIGES.g:2272:2: 'P'
            {
             before(grammarAccess.getPEntryAccess().getPKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getPKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__5__Impl"


    // $ANTLR start "rule__PEntry__Group__6"
    // InternalIGES.g:2281:1: rule__PEntry__Group__6 : rule__PEntry__Group__6__Impl rule__PEntry__Group__7 ;
    public final void rule__PEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2285:1: ( rule__PEntry__Group__6__Impl rule__PEntry__Group__7 )
            // InternalIGES.g:2286:2: rule__PEntry__Group__6__Impl rule__PEntry__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__PEntry__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__6"


    // $ANTLR start "rule__PEntry__Group__6__Impl"
    // InternalIGES.g:2293:1: rule__PEntry__Group__6__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2297:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2298:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2298:1: ( ( RULE_WS )? )
            // InternalIGES.g:2299:2: ( RULE_WS )?
            {
             before(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_6()); 
            // InternalIGES.g:2300:2: ( RULE_WS )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_WS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalIGES.g:2300:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__6__Impl"


    // $ANTLR start "rule__PEntry__Group__7"
    // InternalIGES.g:2308:1: rule__PEntry__Group__7 : rule__PEntry__Group__7__Impl rule__PEntry__Group__8 ;
    public final void rule__PEntry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2312:1: ( rule__PEntry__Group__7__Impl rule__PEntry__Group__8 )
            // InternalIGES.g:2313:2: rule__PEntry__Group__7__Impl rule__PEntry__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__PEntry__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__7"


    // $ANTLR start "rule__PEntry__Group__7__Impl"
    // InternalIGES.g:2320:1: rule__PEntry__Group__7__Impl : ( ( rule__PEntry__IndiciesAssignment_7 ) ) ;
    public final void rule__PEntry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2324:1: ( ( ( rule__PEntry__IndiciesAssignment_7 ) ) )
            // InternalIGES.g:2325:1: ( ( rule__PEntry__IndiciesAssignment_7 ) )
            {
            // InternalIGES.g:2325:1: ( ( rule__PEntry__IndiciesAssignment_7 ) )
            // InternalIGES.g:2326:2: ( rule__PEntry__IndiciesAssignment_7 )
            {
             before(grammarAccess.getPEntryAccess().getIndiciesAssignment_7()); 
            // InternalIGES.g:2327:2: ( rule__PEntry__IndiciesAssignment_7 )
            // InternalIGES.g:2327:3: rule__PEntry__IndiciesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__IndiciesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPEntryAccess().getIndiciesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__7__Impl"


    // $ANTLR start "rule__PEntry__Group__8"
    // InternalIGES.g:2335:1: rule__PEntry__Group__8 : rule__PEntry__Group__8__Impl ;
    public final void rule__PEntry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2339:1: ( rule__PEntry__Group__8__Impl )
            // InternalIGES.g:2340:2: rule__PEntry__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__8"


    // $ANTLR start "rule__PEntry__Group__8__Impl"
    // InternalIGES.g:2346:1: rule__PEntry__Group__8__Impl : ( RULE_ENDLINE ) ;
    public final void rule__PEntry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2350:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:2351:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:2351:1: ( RULE_ENDLINE )
            // InternalIGES.g:2352:2: RULE_ENDLINE
            {
             before(grammarAccess.getPEntryAccess().getENDLINETerminalRuleCall_8()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getENDLINETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__Group__8__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__0"
    // InternalIGES.g:2362:1: rule__PMultiEntry__Group__0 : rule__PMultiEntry__Group__0__Impl rule__PMultiEntry__Group__1 ;
    public final void rule__PMultiEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2366:1: ( rule__PMultiEntry__Group__0__Impl rule__PMultiEntry__Group__1 )
            // InternalIGES.g:2367:2: rule__PMultiEntry__Group__0__Impl rule__PMultiEntry__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PMultiEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__0"


    // $ANTLR start "rule__PMultiEntry__Group__0__Impl"
    // InternalIGES.g:2374:1: rule__PMultiEntry__Group__0__Impl : ( ( ( rule__PMultiEntry__Group_0__0 ) ) ( ( rule__PMultiEntry__Group_0__0 )* ) ) ;
    public final void rule__PMultiEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2378:1: ( ( ( ( rule__PMultiEntry__Group_0__0 ) ) ( ( rule__PMultiEntry__Group_0__0 )* ) ) )
            // InternalIGES.g:2379:1: ( ( ( rule__PMultiEntry__Group_0__0 ) ) ( ( rule__PMultiEntry__Group_0__0 )* ) )
            {
            // InternalIGES.g:2379:1: ( ( ( rule__PMultiEntry__Group_0__0 ) ) ( ( rule__PMultiEntry__Group_0__0 )* ) )
            // InternalIGES.g:2380:2: ( ( rule__PMultiEntry__Group_0__0 ) ) ( ( rule__PMultiEntry__Group_0__0 )* )
            {
            // InternalIGES.g:2380:2: ( ( rule__PMultiEntry__Group_0__0 ) )
            // InternalIGES.g:2381:3: ( rule__PMultiEntry__Group_0__0 )
            {
             before(grammarAccess.getPMultiEntryAccess().getGroup_0()); 
            // InternalIGES.g:2382:3: ( rule__PMultiEntry__Group_0__0 )
            // InternalIGES.g:2382:4: rule__PMultiEntry__Group_0__0
            {
            pushFollow(FOLLOW_5);
            rule__PMultiEntry__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getGroup_0()); 

            }

            // InternalIGES.g:2385:2: ( ( rule__PMultiEntry__Group_0__0 )* )
            // InternalIGES.g:2386:3: ( rule__PMultiEntry__Group_0__0 )*
            {
             before(grammarAccess.getPMultiEntryAccess().getGroup_0()); 
            // InternalIGES.g:2387:3: ( rule__PMultiEntry__Group_0__0 )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // InternalIGES.g:2387:4: rule__PMultiEntry__Group_0__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__PMultiEntry__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getPMultiEntryAccess().getGroup_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__0__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__1"
    // InternalIGES.g:2396:1: rule__PMultiEntry__Group__1 : rule__PMultiEntry__Group__1__Impl rule__PMultiEntry__Group__2 ;
    public final void rule__PMultiEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2400:1: ( rule__PMultiEntry__Group__1__Impl rule__PMultiEntry__Group__2 )
            // InternalIGES.g:2401:2: rule__PMultiEntry__Group__1__Impl rule__PMultiEntry__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PMultiEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__1"


    // $ANTLR start "rule__PMultiEntry__Group__1__Impl"
    // InternalIGES.g:2408:1: rule__PMultiEntry__Group__1__Impl : ( ( rule__PMultiEntry__ValuesAssignment_1 )* ) ;
    public final void rule__PMultiEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2412:1: ( ( ( rule__PMultiEntry__ValuesAssignment_1 )* ) )
            // InternalIGES.g:2413:1: ( ( rule__PMultiEntry__ValuesAssignment_1 )* )
            {
            // InternalIGES.g:2413:1: ( ( rule__PMultiEntry__ValuesAssignment_1 )* )
            // InternalIGES.g:2414:2: ( rule__PMultiEntry__ValuesAssignment_1 )*
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesAssignment_1()); 
            // InternalIGES.g:2415:2: ( rule__PMultiEntry__ValuesAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_INT||(LA37_0>=RULE_DELIMITER && LA37_0<=RULE_DOUBLE)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalIGES.g:2415:3: rule__PMultiEntry__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PMultiEntry__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getPMultiEntryAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__1__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__2"
    // InternalIGES.g:2423:1: rule__PMultiEntry__Group__2 : rule__PMultiEntry__Group__2__Impl rule__PMultiEntry__Group__3 ;
    public final void rule__PMultiEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2427:1: ( rule__PMultiEntry__Group__2__Impl rule__PMultiEntry__Group__3 )
            // InternalIGES.g:2428:2: rule__PMultiEntry__Group__2__Impl rule__PMultiEntry__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__2"


    // $ANTLR start "rule__PMultiEntry__Group__2__Impl"
    // InternalIGES.g:2435:1: rule__PMultiEntry__Group__2__Impl : ( RULE_SEPARATER ) ;
    public final void rule__PMultiEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2439:1: ( ( RULE_SEPARATER ) )
            // InternalIGES.g:2440:1: ( RULE_SEPARATER )
            {
            // InternalIGES.g:2440:1: ( RULE_SEPARATER )
            // InternalIGES.g:2441:2: RULE_SEPARATER
            {
             before(grammarAccess.getPMultiEntryAccess().getSEPARATERTerminalRuleCall_2()); 
            match(input,RULE_SEPARATER,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getSEPARATERTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__2__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__3"
    // InternalIGES.g:2450:1: rule__PMultiEntry__Group__3 : rule__PMultiEntry__Group__3__Impl rule__PMultiEntry__Group__4 ;
    public final void rule__PMultiEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2454:1: ( rule__PMultiEntry__Group__3__Impl rule__PMultiEntry__Group__4 )
            // InternalIGES.g:2455:2: rule__PMultiEntry__Group__3__Impl rule__PMultiEntry__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__3"


    // $ANTLR start "rule__PMultiEntry__Group__3__Impl"
    // InternalIGES.g:2462:1: rule__PMultiEntry__Group__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2466:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2467:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2467:1: ( ( RULE_WS )? )
            // InternalIGES.g:2468:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_3()); 
            // InternalIGES.g:2469:2: ( RULE_WS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_WS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIGES.g:2469:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__3__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__4"
    // InternalIGES.g:2477:1: rule__PMultiEntry__Group__4 : rule__PMultiEntry__Group__4__Impl rule__PMultiEntry__Group__5 ;
    public final void rule__PMultiEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2481:1: ( rule__PMultiEntry__Group__4__Impl rule__PMultiEntry__Group__5 )
            // InternalIGES.g:2482:2: rule__PMultiEntry__Group__4__Impl rule__PMultiEntry__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__PMultiEntry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__4"


    // $ANTLR start "rule__PMultiEntry__Group__4__Impl"
    // InternalIGES.g:2489:1: rule__PMultiEntry__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__PMultiEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2493:1: ( ( RULE_INT ) )
            // InternalIGES.g:2494:1: ( RULE_INT )
            {
            // InternalIGES.g:2494:1: ( RULE_INT )
            // InternalIGES.g:2495:2: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__4__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__5"
    // InternalIGES.g:2504:1: rule__PMultiEntry__Group__5 : rule__PMultiEntry__Group__5__Impl rule__PMultiEntry__Group__6 ;
    public final void rule__PMultiEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2508:1: ( rule__PMultiEntry__Group__5__Impl rule__PMultiEntry__Group__6 )
            // InternalIGES.g:2509:2: rule__PMultiEntry__Group__5__Impl rule__PMultiEntry__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__5"


    // $ANTLR start "rule__PMultiEntry__Group__5__Impl"
    // InternalIGES.g:2516:1: rule__PMultiEntry__Group__5__Impl : ( 'P' ) ;
    public final void rule__PMultiEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2520:1: ( ( 'P' ) )
            // InternalIGES.g:2521:1: ( 'P' )
            {
            // InternalIGES.g:2521:1: ( 'P' )
            // InternalIGES.g:2522:2: 'P'
            {
             before(grammarAccess.getPMultiEntryAccess().getPKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getPKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__5__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__6"
    // InternalIGES.g:2531:1: rule__PMultiEntry__Group__6 : rule__PMultiEntry__Group__6__Impl rule__PMultiEntry__Group__7 ;
    public final void rule__PMultiEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2535:1: ( rule__PMultiEntry__Group__6__Impl rule__PMultiEntry__Group__7 )
            // InternalIGES.g:2536:2: rule__PMultiEntry__Group__6__Impl rule__PMultiEntry__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__6"


    // $ANTLR start "rule__PMultiEntry__Group__6__Impl"
    // InternalIGES.g:2543:1: rule__PMultiEntry__Group__6__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2547:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2548:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2548:1: ( ( RULE_WS )? )
            // InternalIGES.g:2549:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_6()); 
            // InternalIGES.g:2550:2: ( RULE_WS )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_WS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalIGES.g:2550:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__6__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__7"
    // InternalIGES.g:2558:1: rule__PMultiEntry__Group__7 : rule__PMultiEntry__Group__7__Impl rule__PMultiEntry__Group__8 ;
    public final void rule__PMultiEntry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2562:1: ( rule__PMultiEntry__Group__7__Impl rule__PMultiEntry__Group__8 )
            // InternalIGES.g:2563:2: rule__PMultiEntry__Group__7__Impl rule__PMultiEntry__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__PMultiEntry__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__7"


    // $ANTLR start "rule__PMultiEntry__Group__7__Impl"
    // InternalIGES.g:2570:1: rule__PMultiEntry__Group__7__Impl : ( RULE_INT ) ;
    public final void rule__PMultiEntry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2574:1: ( ( RULE_INT ) )
            // InternalIGES.g:2575:1: ( RULE_INT )
            {
            // InternalIGES.g:2575:1: ( RULE_INT )
            // InternalIGES.g:2576:2: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_7()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__7__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__8"
    // InternalIGES.g:2585:1: rule__PMultiEntry__Group__8 : rule__PMultiEntry__Group__8__Impl ;
    public final void rule__PMultiEntry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2589:1: ( rule__PMultiEntry__Group__8__Impl )
            // InternalIGES.g:2590:2: rule__PMultiEntry__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__8"


    // $ANTLR start "rule__PMultiEntry__Group__8__Impl"
    // InternalIGES.g:2596:1: rule__PMultiEntry__Group__8__Impl : ( RULE_ENDLINE ) ;
    public final void rule__PMultiEntry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2600:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:2601:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:2601:1: ( RULE_ENDLINE )
            // InternalIGES.g:2602:2: RULE_ENDLINE
            {
             before(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_8()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group__8__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_0__0"
    // InternalIGES.g:2612:1: rule__PMultiEntry__Group_0__0 : rule__PMultiEntry__Group_0__0__Impl rule__PMultiEntry__Group_0__1 ;
    public final void rule__PMultiEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2616:1: ( rule__PMultiEntry__Group_0__0__Impl rule__PMultiEntry__Group_0__1 )
            // InternalIGES.g:2617:2: rule__PMultiEntry__Group_0__0__Impl rule__PMultiEntry__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__PMultiEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__0"


    // $ANTLR start "rule__PMultiEntry__Group_0__0__Impl"
    // InternalIGES.g:2624:1: rule__PMultiEntry__Group_0__0__Impl : ( ( rule__PMultiEntry__ValuesAssignment_0_0 )* ) ;
    public final void rule__PMultiEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2628:1: ( ( ( rule__PMultiEntry__ValuesAssignment_0_0 )* ) )
            // InternalIGES.g:2629:1: ( ( rule__PMultiEntry__ValuesAssignment_0_0 )* )
            {
            // InternalIGES.g:2629:1: ( ( rule__PMultiEntry__ValuesAssignment_0_0 )* )
            // InternalIGES.g:2630:2: ( rule__PMultiEntry__ValuesAssignment_0_0 )*
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesAssignment_0_0()); 
            // InternalIGES.g:2631:2: ( rule__PMultiEntry__ValuesAssignment_0_0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_INT) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_WS||LA40_2==RULE_INT||(LA40_2>=RULE_DELIMITER && LA40_2<=RULE_DOUBLE)) ) {
                        alt40=1;
                    }


                }
                else if ( ((LA40_0>=RULE_DELIMITER && LA40_0<=RULE_DOUBLE)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalIGES.g:2631:3: rule__PMultiEntry__ValuesAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PMultiEntry__ValuesAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getPMultiEntryAccess().getValuesAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__0__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_0__1"
    // InternalIGES.g:2639:1: rule__PMultiEntry__Group_0__1 : rule__PMultiEntry__Group_0__1__Impl rule__PMultiEntry__Group_0__2 ;
    public final void rule__PMultiEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2643:1: ( rule__PMultiEntry__Group_0__1__Impl rule__PMultiEntry__Group_0__2 )
            // InternalIGES.g:2644:2: rule__PMultiEntry__Group_0__1__Impl rule__PMultiEntry__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__PMultiEntry__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__1"


    // $ANTLR start "rule__PMultiEntry__Group_0__1__Impl"
    // InternalIGES.g:2651:1: rule__PMultiEntry__Group_0__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2655:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2656:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2656:1: ( ( RULE_WS )? )
            // InternalIGES.g:2657:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_0_1()); 
            // InternalIGES.g:2658:2: ( RULE_WS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_WS) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalIGES.g:2658:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__1__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_0__2"
    // InternalIGES.g:2666:1: rule__PMultiEntry__Group_0__2 : rule__PMultiEntry__Group_0__2__Impl rule__PMultiEntry__Group_0__3 ;
    public final void rule__PMultiEntry__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2670:1: ( rule__PMultiEntry__Group_0__2__Impl rule__PMultiEntry__Group_0__3 )
            // InternalIGES.g:2671:2: rule__PMultiEntry__Group_0__2__Impl rule__PMultiEntry__Group_0__3
            {
            pushFollow(FOLLOW_19);
            rule__PMultiEntry__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__2"


    // $ANTLR start "rule__PMultiEntry__Group_0__2__Impl"
    // InternalIGES.g:2678:1: rule__PMultiEntry__Group_0__2__Impl : ( ( rule__PMultiEntry__DIndexAssignment_0_2 ) ) ;
    public final void rule__PMultiEntry__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2682:1: ( ( ( rule__PMultiEntry__DIndexAssignment_0_2 ) ) )
            // InternalIGES.g:2683:1: ( ( rule__PMultiEntry__DIndexAssignment_0_2 ) )
            {
            // InternalIGES.g:2683:1: ( ( rule__PMultiEntry__DIndexAssignment_0_2 ) )
            // InternalIGES.g:2684:2: ( rule__PMultiEntry__DIndexAssignment_0_2 )
            {
             before(grammarAccess.getPMultiEntryAccess().getDIndexAssignment_0_2()); 
            // InternalIGES.g:2685:2: ( rule__PMultiEntry__DIndexAssignment_0_2 )
            // InternalIGES.g:2685:3: rule__PMultiEntry__DIndexAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__DIndexAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getDIndexAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__2__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_0__3"
    // InternalIGES.g:2693:1: rule__PMultiEntry__Group_0__3 : rule__PMultiEntry__Group_0__3__Impl rule__PMultiEntry__Group_0__4 ;
    public final void rule__PMultiEntry__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2697:1: ( rule__PMultiEntry__Group_0__3__Impl rule__PMultiEntry__Group_0__4 )
            // InternalIGES.g:2698:2: rule__PMultiEntry__Group_0__3__Impl rule__PMultiEntry__Group_0__4
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__3"


    // $ANTLR start "rule__PMultiEntry__Group_0__3__Impl"
    // InternalIGES.g:2705:1: rule__PMultiEntry__Group_0__3__Impl : ( 'P' ) ;
    public final void rule__PMultiEntry__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2709:1: ( ( 'P' ) )
            // InternalIGES.g:2710:1: ( 'P' )
            {
            // InternalIGES.g:2710:1: ( 'P' )
            // InternalIGES.g:2711:2: 'P'
            {
             before(grammarAccess.getPMultiEntryAccess().getPKeyword_0_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getPKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__3__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_0__4"
    // InternalIGES.g:2720:1: rule__PMultiEntry__Group_0__4 : rule__PMultiEntry__Group_0__4__Impl rule__PMultiEntry__Group_0__5 ;
    public final void rule__PMultiEntry__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2724:1: ( rule__PMultiEntry__Group_0__4__Impl rule__PMultiEntry__Group_0__5 )
            // InternalIGES.g:2725:2: rule__PMultiEntry__Group_0__4__Impl rule__PMultiEntry__Group_0__5
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__4"


    // $ANTLR start "rule__PMultiEntry__Group_0__4__Impl"
    // InternalIGES.g:2732:1: rule__PMultiEntry__Group_0__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2736:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2737:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2737:1: ( ( RULE_WS )? )
            // InternalIGES.g:2738:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_0_4()); 
            // InternalIGES.g:2739:2: ( RULE_WS )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_WS) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalIGES.g:2739:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__4__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_0__5"
    // InternalIGES.g:2747:1: rule__PMultiEntry__Group_0__5 : rule__PMultiEntry__Group_0__5__Impl rule__PMultiEntry__Group_0__6 ;
    public final void rule__PMultiEntry__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2751:1: ( rule__PMultiEntry__Group_0__5__Impl rule__PMultiEntry__Group_0__6 )
            // InternalIGES.g:2752:2: rule__PMultiEntry__Group_0__5__Impl rule__PMultiEntry__Group_0__6
            {
            pushFollow(FOLLOW_15);
            rule__PMultiEntry__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__5"


    // $ANTLR start "rule__PMultiEntry__Group_0__5__Impl"
    // InternalIGES.g:2759:1: rule__PMultiEntry__Group_0__5__Impl : ( ( rule__PMultiEntry__IndiciesAssignment_0_5 ) ) ;
    public final void rule__PMultiEntry__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2763:1: ( ( ( rule__PMultiEntry__IndiciesAssignment_0_5 ) ) )
            // InternalIGES.g:2764:1: ( ( rule__PMultiEntry__IndiciesAssignment_0_5 ) )
            {
            // InternalIGES.g:2764:1: ( ( rule__PMultiEntry__IndiciesAssignment_0_5 ) )
            // InternalIGES.g:2765:2: ( rule__PMultiEntry__IndiciesAssignment_0_5 )
            {
             before(grammarAccess.getPMultiEntryAccess().getIndiciesAssignment_0_5()); 
            // InternalIGES.g:2766:2: ( rule__PMultiEntry__IndiciesAssignment_0_5 )
            // InternalIGES.g:2766:3: rule__PMultiEntry__IndiciesAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__IndiciesAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getIndiciesAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__5__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_0__6"
    // InternalIGES.g:2774:1: rule__PMultiEntry__Group_0__6 : rule__PMultiEntry__Group_0__6__Impl ;
    public final void rule__PMultiEntry__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2778:1: ( rule__PMultiEntry__Group_0__6__Impl )
            // InternalIGES.g:2779:2: rule__PMultiEntry__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__6"


    // $ANTLR start "rule__PMultiEntry__Group_0__6__Impl"
    // InternalIGES.g:2785:1: rule__PMultiEntry__Group_0__6__Impl : ( RULE_ENDLINE ) ;
    public final void rule__PMultiEntry__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2789:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:2790:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:2790:1: ( RULE_ENDLINE )
            // InternalIGES.g:2791:2: RULE_ENDLINE
            {
             before(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_0_6()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__Group_0__6__Impl"


    // $ANTLR start "rule__HString__Group__0"
    // InternalIGES.g:2801:1: rule__HString__Group__0 : rule__HString__Group__0__Impl rule__HString__Group__1 ;
    public final void rule__HString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2805:1: ( rule__HString__Group__0__Impl rule__HString__Group__1 )
            // InternalIGES.g:2806:2: rule__HString__Group__0__Impl rule__HString__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__HString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HString__Group__0"


    // $ANTLR start "rule__HString__Group__0__Impl"
    // InternalIGES.g:2813:1: rule__HString__Group__0__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__HString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2817:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:2818:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:2818:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:2819:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_0()); 
            // InternalIGES.g:2820:2: ( RULE_DELIMITER )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DELIMITER) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalIGES.g:2820:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HString__Group__0__Impl"


    // $ANTLR start "rule__HString__Group__1"
    // InternalIGES.g:2828:1: rule__HString__Group__1 : rule__HString__Group__1__Impl rule__HString__Group__2 ;
    public final void rule__HString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2832:1: ( rule__HString__Group__1__Impl rule__HString__Group__2 )
            // InternalIGES.g:2833:2: rule__HString__Group__1__Impl rule__HString__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__HString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HString__Group__1"


    // $ANTLR start "rule__HString__Group__1__Impl"
    // InternalIGES.g:2840:1: rule__HString__Group__1__Impl : ( ( rule__HString__ValAssignment_1 ) ) ;
    public final void rule__HString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2844:1: ( ( ( rule__HString__ValAssignment_1 ) ) )
            // InternalIGES.g:2845:1: ( ( rule__HString__ValAssignment_1 ) )
            {
            // InternalIGES.g:2845:1: ( ( rule__HString__ValAssignment_1 ) )
            // InternalIGES.g:2846:2: ( rule__HString__ValAssignment_1 )
            {
             before(grammarAccess.getHStringAccess().getValAssignment_1()); 
            // InternalIGES.g:2847:2: ( rule__HString__ValAssignment_1 )
            // InternalIGES.g:2847:3: rule__HString__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HString__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHStringAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HString__Group__1__Impl"


    // $ANTLR start "rule__HString__Group__2"
    // InternalIGES.g:2855:1: rule__HString__Group__2 : rule__HString__Group__2__Impl ;
    public final void rule__HString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2859:1: ( rule__HString__Group__2__Impl )
            // InternalIGES.g:2860:2: rule__HString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HString__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HString__Group__2"


    // $ANTLR start "rule__HString__Group__2__Impl"
    // InternalIGES.g:2866:1: rule__HString__Group__2__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__HString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2870:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:2871:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:2871:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:2872:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_2()); 
            // InternalIGES.g:2873:2: ( RULE_DELIMITER )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DELIMITER) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalIGES.g:2873:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HString__Group__2__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalIGES.g:2882:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2886:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalIGES.g:2887:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalIGES.g:2894:1: rule__Param__Group__0__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2898:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:2899:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:2899:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:2900:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_0()); 
            // InternalIGES.g:2901:2: ( RULE_DELIMITER )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_DELIMITER) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalIGES.g:2901:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalIGES.g:2909:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2913:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalIGES.g:2914:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalIGES.g:2921:1: rule__Param__Group__1__Impl : ( ( rule__Param__ValAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2925:1: ( ( ( rule__Param__ValAssignment_1 ) ) )
            // InternalIGES.g:2926:1: ( ( rule__Param__ValAssignment_1 ) )
            {
            // InternalIGES.g:2926:1: ( ( rule__Param__ValAssignment_1 ) )
            // InternalIGES.g:2927:2: ( rule__Param__ValAssignment_1 )
            {
             before(grammarAccess.getParamAccess().getValAssignment_1()); 
            // InternalIGES.g:2928:2: ( rule__Param__ValAssignment_1 )
            // InternalIGES.g:2928:3: rule__Param__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Param__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // InternalIGES.g:2936:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2940:1: ( rule__Param__Group__2__Impl )
            // InternalIGES.g:2941:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__2"


    // $ANTLR start "rule__Param__Group__2__Impl"
    // InternalIGES.g:2947:1: rule__Param__Group__2__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2951:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:2952:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:2952:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:2953:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_2()); 
            // InternalIGES.g:2954:2: ( RULE_DELIMITER )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DELIMITER) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalIGES.g:2954:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__Pointer__Group__0"
    // InternalIGES.g:2963:1: rule__Pointer__Group__0 : rule__Pointer__Group__0__Impl rule__Pointer__Group__1 ;
    public final void rule__Pointer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2967:1: ( rule__Pointer__Group__0__Impl rule__Pointer__Group__1 )
            // InternalIGES.g:2968:2: rule__Pointer__Group__0__Impl rule__Pointer__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Pointer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pointer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer__Group__0"


    // $ANTLR start "rule__Pointer__Group__0__Impl"
    // InternalIGES.g:2975:1: rule__Pointer__Group__0__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Pointer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2979:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:2980:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:2980:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:2981:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_0()); 
            // InternalIGES.g:2982:2: ( RULE_DELIMITER )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DELIMITER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalIGES.g:2982:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer__Group__0__Impl"


    // $ANTLR start "rule__Pointer__Group__1"
    // InternalIGES.g:2990:1: rule__Pointer__Group__1 : rule__Pointer__Group__1__Impl rule__Pointer__Group__2 ;
    public final void rule__Pointer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2994:1: ( rule__Pointer__Group__1__Impl rule__Pointer__Group__2 )
            // InternalIGES.g:2995:2: rule__Pointer__Group__1__Impl rule__Pointer__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Pointer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pointer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer__Group__1"


    // $ANTLR start "rule__Pointer__Group__1__Impl"
    // InternalIGES.g:3002:1: rule__Pointer__Group__1__Impl : ( ( rule__Pointer__ValAssignment_1 ) ) ;
    public final void rule__Pointer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3006:1: ( ( ( rule__Pointer__ValAssignment_1 ) ) )
            // InternalIGES.g:3007:1: ( ( rule__Pointer__ValAssignment_1 ) )
            {
            // InternalIGES.g:3007:1: ( ( rule__Pointer__ValAssignment_1 ) )
            // InternalIGES.g:3008:2: ( rule__Pointer__ValAssignment_1 )
            {
             before(grammarAccess.getPointerAccess().getValAssignment_1()); 
            // InternalIGES.g:3009:2: ( rule__Pointer__ValAssignment_1 )
            // InternalIGES.g:3009:3: rule__Pointer__ValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointer__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointerAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer__Group__1__Impl"


    // $ANTLR start "rule__Pointer__Group__2"
    // InternalIGES.g:3017:1: rule__Pointer__Group__2 : rule__Pointer__Group__2__Impl ;
    public final void rule__Pointer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3021:1: ( rule__Pointer__Group__2__Impl )
            // InternalIGES.g:3022:2: rule__Pointer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer__Group__2"


    // $ANTLR start "rule__Pointer__Group__2__Impl"
    // InternalIGES.g:3028:1: rule__Pointer__Group__2__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Pointer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3032:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:3033:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:3033:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:3034:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_2()); 
            // InternalIGES.g:3035:2: ( RULE_DELIMITER )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DELIMITER) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalIGES.g:3035:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer__Group__2__Impl"


    // $ANTLR start "rule__End__Group__0"
    // InternalIGES.g:3044:1: rule__End__Group__0 : rule__End__Group__0__Impl rule__End__Group__1 ;
    public final void rule__End__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3048:1: ( rule__End__Group__0__Impl rule__End__Group__1 )
            // InternalIGES.g:3049:2: rule__End__Group__0__Impl rule__End__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__0"


    // $ANTLR start "rule__End__Group__0__Impl"
    // InternalIGES.g:3056:1: rule__End__Group__0__Impl : ( 'S' ) ;
    public final void rule__End__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3060:1: ( ( 'S' ) )
            // InternalIGES.g:3061:1: ( 'S' )
            {
            // InternalIGES.g:3061:1: ( 'S' )
            // InternalIGES.g:3062:2: 'S'
            {
             before(grammarAccess.getEndAccess().getSKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__0__Impl"


    // $ANTLR start "rule__End__Group__1"
    // InternalIGES.g:3071:1: rule__End__Group__1 : rule__End__Group__1__Impl rule__End__Group__2 ;
    public final void rule__End__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3075:1: ( rule__End__Group__1__Impl rule__End__Group__2 )
            // InternalIGES.g:3076:2: rule__End__Group__1__Impl rule__End__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__1"


    // $ANTLR start "rule__End__Group__1__Impl"
    // InternalIGES.g:3083:1: rule__End__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3087:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3088:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3088:1: ( ( RULE_WS )? )
            // InternalIGES.g:3089:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_1()); 
            // InternalIGES.g:3090:2: ( RULE_WS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_WS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalIGES.g:3090:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEndAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__1__Impl"


    // $ANTLR start "rule__End__Group__2"
    // InternalIGES.g:3098:1: rule__End__Group__2 : rule__End__Group__2__Impl rule__End__Group__3 ;
    public final void rule__End__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3102:1: ( rule__End__Group__2__Impl rule__End__Group__3 )
            // InternalIGES.g:3103:2: rule__End__Group__2__Impl rule__End__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__End__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__2"


    // $ANTLR start "rule__End__Group__2__Impl"
    // InternalIGES.g:3110:1: rule__End__Group__2__Impl : ( ( rule__End__SvalAssignment_2 ) ) ;
    public final void rule__End__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3114:1: ( ( ( rule__End__SvalAssignment_2 ) ) )
            // InternalIGES.g:3115:1: ( ( rule__End__SvalAssignment_2 ) )
            {
            // InternalIGES.g:3115:1: ( ( rule__End__SvalAssignment_2 ) )
            // InternalIGES.g:3116:2: ( rule__End__SvalAssignment_2 )
            {
             before(grammarAccess.getEndAccess().getSvalAssignment_2()); 
            // InternalIGES.g:3117:2: ( rule__End__SvalAssignment_2 )
            // InternalIGES.g:3117:3: rule__End__SvalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__End__SvalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getSvalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__2__Impl"


    // $ANTLR start "rule__End__Group__3"
    // InternalIGES.g:3125:1: rule__End__Group__3 : rule__End__Group__3__Impl rule__End__Group__4 ;
    public final void rule__End__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3129:1: ( rule__End__Group__3__Impl rule__End__Group__4 )
            // InternalIGES.g:3130:2: rule__End__Group__3__Impl rule__End__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__3"


    // $ANTLR start "rule__End__Group__3__Impl"
    // InternalIGES.g:3137:1: rule__End__Group__3__Impl : ( 'G' ) ;
    public final void rule__End__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3141:1: ( ( 'G' ) )
            // InternalIGES.g:3142:1: ( 'G' )
            {
            // InternalIGES.g:3142:1: ( 'G' )
            // InternalIGES.g:3143:2: 'G'
            {
             before(grammarAccess.getEndAccess().getGKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getGKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__3__Impl"


    // $ANTLR start "rule__End__Group__4"
    // InternalIGES.g:3152:1: rule__End__Group__4 : rule__End__Group__4__Impl rule__End__Group__5 ;
    public final void rule__End__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3156:1: ( rule__End__Group__4__Impl rule__End__Group__5 )
            // InternalIGES.g:3157:2: rule__End__Group__4__Impl rule__End__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__4"


    // $ANTLR start "rule__End__Group__4__Impl"
    // InternalIGES.g:3164:1: rule__End__Group__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3168:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3169:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3169:1: ( ( RULE_WS )? )
            // InternalIGES.g:3170:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_4()); 
            // InternalIGES.g:3171:2: ( RULE_WS )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_WS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalIGES.g:3171:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEndAccess().getWSTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__4__Impl"


    // $ANTLR start "rule__End__Group__5"
    // InternalIGES.g:3179:1: rule__End__Group__5 : rule__End__Group__5__Impl rule__End__Group__6 ;
    public final void rule__End__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3183:1: ( rule__End__Group__5__Impl rule__End__Group__6 )
            // InternalIGES.g:3184:2: rule__End__Group__5__Impl rule__End__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__End__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__5"


    // $ANTLR start "rule__End__Group__5__Impl"
    // InternalIGES.g:3191:1: rule__End__Group__5__Impl : ( ( rule__End__GvalAssignment_5 ) ) ;
    public final void rule__End__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3195:1: ( ( ( rule__End__GvalAssignment_5 ) ) )
            // InternalIGES.g:3196:1: ( ( rule__End__GvalAssignment_5 ) )
            {
            // InternalIGES.g:3196:1: ( ( rule__End__GvalAssignment_5 ) )
            // InternalIGES.g:3197:2: ( rule__End__GvalAssignment_5 )
            {
             before(grammarAccess.getEndAccess().getGvalAssignment_5()); 
            // InternalIGES.g:3198:2: ( rule__End__GvalAssignment_5 )
            // InternalIGES.g:3198:3: rule__End__GvalAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__End__GvalAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getGvalAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__5__Impl"


    // $ANTLR start "rule__End__Group__6"
    // InternalIGES.g:3206:1: rule__End__Group__6 : rule__End__Group__6__Impl rule__End__Group__7 ;
    public final void rule__End__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3210:1: ( rule__End__Group__6__Impl rule__End__Group__7 )
            // InternalIGES.g:3211:2: rule__End__Group__6__Impl rule__End__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__6"


    // $ANTLR start "rule__End__Group__6__Impl"
    // InternalIGES.g:3218:1: rule__End__Group__6__Impl : ( 'D' ) ;
    public final void rule__End__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3222:1: ( ( 'D' ) )
            // InternalIGES.g:3223:1: ( 'D' )
            {
            // InternalIGES.g:3223:1: ( 'D' )
            // InternalIGES.g:3224:2: 'D'
            {
             before(grammarAccess.getEndAccess().getDKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getDKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__6__Impl"


    // $ANTLR start "rule__End__Group__7"
    // InternalIGES.g:3233:1: rule__End__Group__7 : rule__End__Group__7__Impl rule__End__Group__8 ;
    public final void rule__End__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3237:1: ( rule__End__Group__7__Impl rule__End__Group__8 )
            // InternalIGES.g:3238:2: rule__End__Group__7__Impl rule__End__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__7"


    // $ANTLR start "rule__End__Group__7__Impl"
    // InternalIGES.g:3245:1: rule__End__Group__7__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3249:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3250:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3250:1: ( ( RULE_WS )? )
            // InternalIGES.g:3251:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_7()); 
            // InternalIGES.g:3252:2: ( RULE_WS )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_WS) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalIGES.g:3252:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEndAccess().getWSTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__7__Impl"


    // $ANTLR start "rule__End__Group__8"
    // InternalIGES.g:3260:1: rule__End__Group__8 : rule__End__Group__8__Impl rule__End__Group__9 ;
    public final void rule__End__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3264:1: ( rule__End__Group__8__Impl rule__End__Group__9 )
            // InternalIGES.g:3265:2: rule__End__Group__8__Impl rule__End__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__End__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__8"


    // $ANTLR start "rule__End__Group__8__Impl"
    // InternalIGES.g:3272:1: rule__End__Group__8__Impl : ( ( rule__End__DvalAssignment_8 ) ) ;
    public final void rule__End__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3276:1: ( ( ( rule__End__DvalAssignment_8 ) ) )
            // InternalIGES.g:3277:1: ( ( rule__End__DvalAssignment_8 ) )
            {
            // InternalIGES.g:3277:1: ( ( rule__End__DvalAssignment_8 ) )
            // InternalIGES.g:3278:2: ( rule__End__DvalAssignment_8 )
            {
             before(grammarAccess.getEndAccess().getDvalAssignment_8()); 
            // InternalIGES.g:3279:2: ( rule__End__DvalAssignment_8 )
            // InternalIGES.g:3279:3: rule__End__DvalAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__End__DvalAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getDvalAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__8__Impl"


    // $ANTLR start "rule__End__Group__9"
    // InternalIGES.g:3287:1: rule__End__Group__9 : rule__End__Group__9__Impl rule__End__Group__10 ;
    public final void rule__End__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3291:1: ( rule__End__Group__9__Impl rule__End__Group__10 )
            // InternalIGES.g:3292:2: rule__End__Group__9__Impl rule__End__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__9"


    // $ANTLR start "rule__End__Group__9__Impl"
    // InternalIGES.g:3299:1: rule__End__Group__9__Impl : ( 'P' ) ;
    public final void rule__End__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3303:1: ( ( 'P' ) )
            // InternalIGES.g:3304:1: ( 'P' )
            {
            // InternalIGES.g:3304:1: ( 'P' )
            // InternalIGES.g:3305:2: 'P'
            {
             before(grammarAccess.getEndAccess().getPKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getPKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__9__Impl"


    // $ANTLR start "rule__End__Group__10"
    // InternalIGES.g:3314:1: rule__End__Group__10 : rule__End__Group__10__Impl rule__End__Group__11 ;
    public final void rule__End__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3318:1: ( rule__End__Group__10__Impl rule__End__Group__11 )
            // InternalIGES.g:3319:2: rule__End__Group__10__Impl rule__End__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__10"


    // $ANTLR start "rule__End__Group__10__Impl"
    // InternalIGES.g:3326:1: rule__End__Group__10__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3330:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3331:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3331:1: ( ( RULE_WS )? )
            // InternalIGES.g:3332:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_10()); 
            // InternalIGES.g:3333:2: ( RULE_WS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_WS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalIGES.g:3333:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEndAccess().getWSTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__10__Impl"


    // $ANTLR start "rule__End__Group__11"
    // InternalIGES.g:3341:1: rule__End__Group__11 : rule__End__Group__11__Impl rule__End__Group__12 ;
    public final void rule__End__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3345:1: ( rule__End__Group__11__Impl rule__End__Group__12 )
            // InternalIGES.g:3346:2: rule__End__Group__11__Impl rule__End__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__End__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__11"


    // $ANTLR start "rule__End__Group__11__Impl"
    // InternalIGES.g:3353:1: rule__End__Group__11__Impl : ( ( rule__End__PvalAssignment_11 ) ) ;
    public final void rule__End__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3357:1: ( ( ( rule__End__PvalAssignment_11 ) ) )
            // InternalIGES.g:3358:1: ( ( rule__End__PvalAssignment_11 ) )
            {
            // InternalIGES.g:3358:1: ( ( rule__End__PvalAssignment_11 ) )
            // InternalIGES.g:3359:2: ( rule__End__PvalAssignment_11 )
            {
             before(grammarAccess.getEndAccess().getPvalAssignment_11()); 
            // InternalIGES.g:3360:2: ( rule__End__PvalAssignment_11 )
            // InternalIGES.g:3360:3: rule__End__PvalAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__End__PvalAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getPvalAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__11__Impl"


    // $ANTLR start "rule__End__Group__12"
    // InternalIGES.g:3368:1: rule__End__Group__12 : rule__End__Group__12__Impl rule__End__Group__13 ;
    public final void rule__End__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3372:1: ( rule__End__Group__12__Impl rule__End__Group__13 )
            // InternalIGES.g:3373:2: rule__End__Group__12__Impl rule__End__Group__13
            {
            pushFollow(FOLLOW_25);
            rule__End__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__12"


    // $ANTLR start "rule__End__Group__12__Impl"
    // InternalIGES.g:3380:1: rule__End__Group__12__Impl : ( RULE_WS ) ;
    public final void rule__End__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3384:1: ( ( RULE_WS ) )
            // InternalIGES.g:3385:1: ( RULE_WS )
            {
            // InternalIGES.g:3385:1: ( RULE_WS )
            // InternalIGES.g:3386:2: RULE_WS
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_12()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getWSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__12__Impl"


    // $ANTLR start "rule__End__Group__13"
    // InternalIGES.g:3395:1: rule__End__Group__13 : rule__End__Group__13__Impl rule__End__Group__14 ;
    public final void rule__End__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3399:1: ( rule__End__Group__13__Impl rule__End__Group__14 )
            // InternalIGES.g:3400:2: rule__End__Group__13__Impl rule__End__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__13"


    // $ANTLR start "rule__End__Group__13__Impl"
    // InternalIGES.g:3407:1: rule__End__Group__13__Impl : ( 'T' ) ;
    public final void rule__End__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3411:1: ( ( 'T' ) )
            // InternalIGES.g:3412:1: ( 'T' )
            {
            // InternalIGES.g:3412:1: ( 'T' )
            // InternalIGES.g:3413:2: 'T'
            {
             before(grammarAccess.getEndAccess().getTKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getTKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__13__Impl"


    // $ANTLR start "rule__End__Group__14"
    // InternalIGES.g:3422:1: rule__End__Group__14 : rule__End__Group__14__Impl rule__End__Group__15 ;
    public final void rule__End__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3426:1: ( rule__End__Group__14__Impl rule__End__Group__15 )
            // InternalIGES.g:3427:2: rule__End__Group__14__Impl rule__End__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__End__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__14"


    // $ANTLR start "rule__End__Group__14__Impl"
    // InternalIGES.g:3434:1: rule__End__Group__14__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3438:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3439:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3439:1: ( ( RULE_WS )? )
            // InternalIGES.g:3440:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_14()); 
            // InternalIGES.g:3441:2: ( RULE_WS )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_WS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalIGES.g:3441:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEndAccess().getWSTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__14__Impl"


    // $ANTLR start "rule__End__Group__15"
    // InternalIGES.g:3449:1: rule__End__Group__15 : rule__End__Group__15__Impl ;
    public final void rule__End__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3453:1: ( rule__End__Group__15__Impl )
            // InternalIGES.g:3454:2: rule__End__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__End__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__15"


    // $ANTLR start "rule__End__Group__15__Impl"
    // InternalIGES.g:3460:1: rule__End__Group__15__Impl : ( ( rule__End__TvalAssignment_15 ) ) ;
    public final void rule__End__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3464:1: ( ( ( rule__End__TvalAssignment_15 ) ) )
            // InternalIGES.g:3465:1: ( ( rule__End__TvalAssignment_15 ) )
            {
            // InternalIGES.g:3465:1: ( ( rule__End__TvalAssignment_15 ) )
            // InternalIGES.g:3466:2: ( rule__End__TvalAssignment_15 )
            {
             before(grammarAccess.getEndAccess().getTvalAssignment_15()); 
            // InternalIGES.g:3467:2: ( rule__End__TvalAssignment_15 )
            // InternalIGES.g:3467:3: rule__End__TvalAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__End__TvalAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getTvalAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__15__Impl"


    // $ANTLR start "rule__StartLine__Group__0"
    // InternalIGES.g:3476:1: rule__StartLine__Group__0 : rule__StartLine__Group__0__Impl rule__StartLine__Group__1 ;
    public final void rule__StartLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3480:1: ( rule__StartLine__Group__0__Impl rule__StartLine__Group__1 )
            // InternalIGES.g:3481:2: rule__StartLine__Group__0__Impl rule__StartLine__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__StartLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__0"


    // $ANTLR start "rule__StartLine__Group__0__Impl"
    // InternalIGES.g:3488:1: rule__StartLine__Group__0__Impl : ( ( rule__StartLine__Alternatives_0 )* ) ;
    public final void rule__StartLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3492:1: ( ( ( rule__StartLine__Alternatives_0 )* ) )
            // InternalIGES.g:3493:1: ( ( rule__StartLine__Alternatives_0 )* )
            {
            // InternalIGES.g:3493:1: ( ( rule__StartLine__Alternatives_0 )* )
            // InternalIGES.g:3494:2: ( rule__StartLine__Alternatives_0 )*
            {
             before(grammarAccess.getStartLineAccess().getAlternatives_0()); 
            // InternalIGES.g:3495:2: ( rule__StartLine__Alternatives_0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_WS)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalIGES.g:3495:3: rule__StartLine__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__StartLine__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getStartLineAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__0__Impl"


    // $ANTLR start "rule__StartLine__Group__1"
    // InternalIGES.g:3503:1: rule__StartLine__Group__1 : rule__StartLine__Group__1__Impl rule__StartLine__Group__2 ;
    public final void rule__StartLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3507:1: ( rule__StartLine__Group__1__Impl rule__StartLine__Group__2 )
            // InternalIGES.g:3508:2: rule__StartLine__Group__1__Impl rule__StartLine__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__StartLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartLine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__1"


    // $ANTLR start "rule__StartLine__Group__1__Impl"
    // InternalIGES.g:3515:1: rule__StartLine__Group__1__Impl : ( 'S' ) ;
    public final void rule__StartLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3519:1: ( ( 'S' ) )
            // InternalIGES.g:3520:1: ( 'S' )
            {
            // InternalIGES.g:3520:1: ( 'S' )
            // InternalIGES.g:3521:2: 'S'
            {
             before(grammarAccess.getStartLineAccess().getSKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStartLineAccess().getSKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__1__Impl"


    // $ANTLR start "rule__StartLine__Group__2"
    // InternalIGES.g:3530:1: rule__StartLine__Group__2 : rule__StartLine__Group__2__Impl rule__StartLine__Group__3 ;
    public final void rule__StartLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3534:1: ( rule__StartLine__Group__2__Impl rule__StartLine__Group__3 )
            // InternalIGES.g:3535:2: rule__StartLine__Group__2__Impl rule__StartLine__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__StartLine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartLine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__2"


    // $ANTLR start "rule__StartLine__Group__2__Impl"
    // InternalIGES.g:3542:1: rule__StartLine__Group__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__StartLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3546:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3547:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3547:1: ( ( RULE_WS )? )
            // InternalIGES.g:3548:2: ( RULE_WS )?
            {
             before(grammarAccess.getStartLineAccess().getWSTerminalRuleCall_2()); 
            // InternalIGES.g:3549:2: ( RULE_WS )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_WS) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalIGES.g:3549:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStartLineAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__2__Impl"


    // $ANTLR start "rule__StartLine__Group__3"
    // InternalIGES.g:3557:1: rule__StartLine__Group__3 : rule__StartLine__Group__3__Impl rule__StartLine__Group__4 ;
    public final void rule__StartLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3561:1: ( rule__StartLine__Group__3__Impl rule__StartLine__Group__4 )
            // InternalIGES.g:3562:2: rule__StartLine__Group__3__Impl rule__StartLine__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__StartLine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartLine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__3"


    // $ANTLR start "rule__StartLine__Group__3__Impl"
    // InternalIGES.g:3569:1: rule__StartLine__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__StartLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3573:1: ( ( RULE_INT ) )
            // InternalIGES.g:3574:1: ( RULE_INT )
            {
            // InternalIGES.g:3574:1: ( RULE_INT )
            // InternalIGES.g:3575:2: RULE_INT
            {
             before(grammarAccess.getStartLineAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStartLineAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__3__Impl"


    // $ANTLR start "rule__StartLine__Group__4"
    // InternalIGES.g:3584:1: rule__StartLine__Group__4 : rule__StartLine__Group__4__Impl ;
    public final void rule__StartLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3588:1: ( rule__StartLine__Group__4__Impl )
            // InternalIGES.g:3589:2: rule__StartLine__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartLine__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__4"


    // $ANTLR start "rule__StartLine__Group__4__Impl"
    // InternalIGES.g:3595:1: rule__StartLine__Group__4__Impl : ( RULE_ENDLINE ) ;
    public final void rule__StartLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3599:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:3600:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:3600:1: ( RULE_ENDLINE )
            // InternalIGES.g:3601:2: RULE_ENDLINE
            {
             before(grammarAccess.getStartLineAccess().getENDLINETerminalRuleCall_4()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getStartLineAccess().getENDLINETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartLine__Group__4__Impl"


    // $ANTLR start "rule__IGES__StartAssignment_0"
    // InternalIGES.g:3611:1: rule__IGES__StartAssignment_0 : ( ruleStart ) ;
    public final void rule__IGES__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3615:1: ( ( ruleStart ) )
            // InternalIGES.g:3616:2: ( ruleStart )
            {
            // InternalIGES.g:3616:2: ( ruleStart )
            // InternalIGES.g:3617:3: ruleStart
            {
             before(grammarAccess.getIGESAccess().getStartStartParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getIGESAccess().getStartStartParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__StartAssignment_0"


    // $ANTLR start "rule__IGES__GlobalAssignment_1"
    // InternalIGES.g:3626:1: rule__IGES__GlobalAssignment_1 : ( ruleGlobal ) ;
    public final void rule__IGES__GlobalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3630:1: ( ( ruleGlobal ) )
            // InternalIGES.g:3631:2: ( ruleGlobal )
            {
            // InternalIGES.g:3631:2: ( ruleGlobal )
            // InternalIGES.g:3632:3: ruleGlobal
            {
             before(grammarAccess.getIGESAccess().getGlobalGlobalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobal();

            state._fsp--;

             after(grammarAccess.getIGESAccess().getGlobalGlobalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__GlobalAssignment_1"


    // $ANTLR start "rule__IGES__DataAssignment_2"
    // InternalIGES.g:3641:1: rule__IGES__DataAssignment_2 : ( ruleData ) ;
    public final void rule__IGES__DataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3645:1: ( ( ruleData ) )
            // InternalIGES.g:3646:2: ( ruleData )
            {
            // InternalIGES.g:3646:2: ( ruleData )
            // InternalIGES.g:3647:3: ruleData
            {
             before(grammarAccess.getIGESAccess().getDataDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getIGESAccess().getDataDataParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__DataAssignment_2"


    // $ANTLR start "rule__IGES__ParametersAssignment_3"
    // InternalIGES.g:3656:1: rule__IGES__ParametersAssignment_3 : ( ruleParameters ) ;
    public final void rule__IGES__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3660:1: ( ( ruleParameters ) )
            // InternalIGES.g:3661:2: ( ruleParameters )
            {
            // InternalIGES.g:3661:2: ( ruleParameters )
            // InternalIGES.g:3662:3: ruleParameters
            {
             before(grammarAccess.getIGESAccess().getParametersParametersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getIGESAccess().getParametersParametersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__ParametersAssignment_3"


    // $ANTLR start "rule__IGES__EndAssignment_4"
    // InternalIGES.g:3671:1: rule__IGES__EndAssignment_4 : ( ruleEnd ) ;
    public final void rule__IGES__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3675:1: ( ( ruleEnd ) )
            // InternalIGES.g:3676:2: ( ruleEnd )
            {
            // InternalIGES.g:3676:2: ( ruleEnd )
            // InternalIGES.g:3677:3: ruleEnd
            {
             before(grammarAccess.getIGESAccess().getEndEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getIGESAccess().getEndEndParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IGES__EndAssignment_4"


    // $ANTLR start "rule__Start__LinesAssignment"
    // InternalIGES.g:3686:1: rule__Start__LinesAssignment : ( rulestartLine ) ;
    public final void rule__Start__LinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3690:1: ( ( rulestartLine ) )
            // InternalIGES.g:3691:2: ( rulestartLine )
            {
            // InternalIGES.g:3691:2: ( rulestartLine )
            // InternalIGES.g:3692:3: rulestartLine
            {
             before(grammarAccess.getStartAccess().getLinesStartLineParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulestartLine();

            state._fsp--;

             after(grammarAccess.getStartAccess().getLinesStartLineParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__LinesAssignment"


    // $ANTLR start "rule__Global__ValuesAssignment_1_0"
    // InternalIGES.g:3701:1: rule__Global__ValuesAssignment_1_0 : ( ruleValue ) ;
    public final void rule__Global__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3705:1: ( ( ruleValue ) )
            // InternalIGES.g:3706:2: ( ruleValue )
            {
            // InternalIGES.g:3706:2: ( ruleValue )
            // InternalIGES.g:3707:3: ruleValue
            {
             before(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__ValuesAssignment_1_0"


    // $ANTLR start "rule__Global__ValuesAssignment_2"
    // InternalIGES.g:3716:1: rule__Global__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__Global__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3720:1: ( ( ruleValue ) )
            // InternalIGES.g:3721:2: ( ruleValue )
            {
            // InternalIGES.g:3721:2: ( ruleValue )
            // InternalIGES.g:3722:3: ruleValue
            {
             before(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Global__ValuesAssignment_2"


    // $ANTLR start "rule__Data__EntriesAssignment"
    // InternalIGES.g:3731:1: rule__Data__EntriesAssignment : ( ruleEntry ) ;
    public final void rule__Data__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3735:1: ( ( ruleEntry ) )
            // InternalIGES.g:3736:2: ( ruleEntry )
            {
            // InternalIGES.g:3736:2: ( ruleEntry )
            // InternalIGES.g:3737:3: ruleEntry
            {
             before(grammarAccess.getDataAccess().getEntriesEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getDataAccess().getEntriesEntryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__EntriesAssignment"


    // $ANTLR start "rule__Entry__TypeAssignment_1"
    // InternalIGES.g:3746:1: rule__Entry__TypeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Entry__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3750:1: ( ( RULE_INT ) )
            // InternalIGES.g:3751:2: ( RULE_INT )
            {
            // InternalIGES.g:3751:2: ( RULE_INT )
            // InternalIGES.g:3752:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getTypeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getTypeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__TypeAssignment_1"


    // $ANTLR start "rule__Entry__ParamDataAssignment_3"
    // InternalIGES.g:3761:1: rule__Entry__ParamDataAssignment_3 : ( RULE_INT ) ;
    public final void rule__Entry__ParamDataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3765:1: ( ( RULE_INT ) )
            // InternalIGES.g:3766:2: ( RULE_INT )
            {
            // InternalIGES.g:3766:2: ( RULE_INT )
            // InternalIGES.g:3767:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getParamDataINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getParamDataINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__ParamDataAssignment_3"


    // $ANTLR start "rule__Entry__StructureAssignment_5"
    // InternalIGES.g:3776:1: rule__Entry__StructureAssignment_5 : ( RULE_INT ) ;
    public final void rule__Entry__StructureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3780:1: ( ( RULE_INT ) )
            // InternalIGES.g:3781:2: ( RULE_INT )
            {
            // InternalIGES.g:3781:2: ( RULE_INT )
            // InternalIGES.g:3782:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getStructureINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getStructureINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__StructureAssignment_5"


    // $ANTLR start "rule__Entry__LineFontAssignment_7"
    // InternalIGES.g:3791:1: rule__Entry__LineFontAssignment_7 : ( RULE_INT ) ;
    public final void rule__Entry__LineFontAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3795:1: ( ( RULE_INT ) )
            // InternalIGES.g:3796:2: ( RULE_INT )
            {
            // InternalIGES.g:3796:2: ( RULE_INT )
            // InternalIGES.g:3797:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getLineFontINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getLineFontINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__LineFontAssignment_7"


    // $ANTLR start "rule__Entry__LevelAssignment_9"
    // InternalIGES.g:3806:1: rule__Entry__LevelAssignment_9 : ( RULE_INT ) ;
    public final void rule__Entry__LevelAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3810:1: ( ( RULE_INT ) )
            // InternalIGES.g:3811:2: ( RULE_INT )
            {
            // InternalIGES.g:3811:2: ( RULE_INT )
            // InternalIGES.g:3812:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getLevelINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getLevelINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__LevelAssignment_9"


    // $ANTLR start "rule__Entry__ViewAssignment_11"
    // InternalIGES.g:3821:1: rule__Entry__ViewAssignment_11 : ( RULE_INT ) ;
    public final void rule__Entry__ViewAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3825:1: ( ( RULE_INT ) )
            // InternalIGES.g:3826:2: ( RULE_INT )
            {
            // InternalIGES.g:3826:2: ( RULE_INT )
            // InternalIGES.g:3827:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getViewINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getViewINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__ViewAssignment_11"


    // $ANTLR start "rule__Entry__TransformMatrixAssignment_13"
    // InternalIGES.g:3836:1: rule__Entry__TransformMatrixAssignment_13 : ( RULE_INT ) ;
    public final void rule__Entry__TransformMatrixAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3840:1: ( ( RULE_INT ) )
            // InternalIGES.g:3841:2: ( RULE_INT )
            {
            // InternalIGES.g:3841:2: ( RULE_INT )
            // InternalIGES.g:3842:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getTransformMatrixINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getTransformMatrixINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__TransformMatrixAssignment_13"


    // $ANTLR start "rule__Entry__StatusAssignment_17"
    // InternalIGES.g:3851:1: rule__Entry__StatusAssignment_17 : ( RULE_INT ) ;
    public final void rule__Entry__StatusAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3855:1: ( ( RULE_INT ) )
            // InternalIGES.g:3856:2: ( RULE_INT )
            {
            // InternalIGES.g:3856:2: ( RULE_INT )
            // InternalIGES.g:3857:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getStatusINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getStatusINTTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__StatusAssignment_17"


    // $ANTLR start "rule__Entry__IndexAssignment_20"
    // InternalIGES.g:3866:1: rule__Entry__IndexAssignment_20 : ( RULE_INT ) ;
    public final void rule__Entry__IndexAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3870:1: ( ( RULE_INT ) )
            // InternalIGES.g:3871:2: ( RULE_INT )
            {
            // InternalIGES.g:3871:2: ( RULE_INT )
            // InternalIGES.g:3872:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getIndexINTTerminalRuleCall_20_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getIndexINTTerminalRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__IndexAssignment_20"


    // $ANTLR start "rule__Entry__LineWeightAssignment_25"
    // InternalIGES.g:3881:1: rule__Entry__LineWeightAssignment_25 : ( RULE_INT ) ;
    public final void rule__Entry__LineWeightAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3885:1: ( ( RULE_INT ) )
            // InternalIGES.g:3886:2: ( RULE_INT )
            {
            // InternalIGES.g:3886:2: ( RULE_INT )
            // InternalIGES.g:3887:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getLineWeightINTTerminalRuleCall_25_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getLineWeightINTTerminalRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__LineWeightAssignment_25"


    // $ANTLR start "rule__Entry__ColorAssignment_27"
    // InternalIGES.g:3896:1: rule__Entry__ColorAssignment_27 : ( RULE_INT ) ;
    public final void rule__Entry__ColorAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3900:1: ( ( RULE_INT ) )
            // InternalIGES.g:3901:2: ( RULE_INT )
            {
            // InternalIGES.g:3901:2: ( RULE_INT )
            // InternalIGES.g:3902:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getColorINTTerminalRuleCall_27_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getColorINTTerminalRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__ColorAssignment_27"


    // $ANTLR start "rule__Entry__ParamLinesAssignment_29"
    // InternalIGES.g:3911:1: rule__Entry__ParamLinesAssignment_29 : ( RULE_INT ) ;
    public final void rule__Entry__ParamLinesAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3915:1: ( ( RULE_INT ) )
            // InternalIGES.g:3916:2: ( RULE_INT )
            {
            // InternalIGES.g:3916:2: ( RULE_INT )
            // InternalIGES.g:3917:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getParamLinesINTTerminalRuleCall_29_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getParamLinesINTTerminalRuleCall_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__ParamLinesAssignment_29"


    // $ANTLR start "rule__Entry__FormAssignment_31"
    // InternalIGES.g:3926:1: rule__Entry__FormAssignment_31 : ( RULE_INT ) ;
    public final void rule__Entry__FormAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3930:1: ( ( RULE_INT ) )
            // InternalIGES.g:3931:2: ( RULE_INT )
            {
            // InternalIGES.g:3931:2: ( RULE_INT )
            // InternalIGES.g:3932:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getFormINTTerminalRuleCall_31_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getFormINTTerminalRuleCall_31_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__FormAssignment_31"


    // $ANTLR start "rule__Entry__EntityLabelAssignment_33"
    // InternalIGES.g:3941:1: rule__Entry__EntityLabelAssignment_33 : ( RULE_STRING ) ;
    public final void rule__Entry__EntityLabelAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3945:1: ( ( RULE_STRING ) )
            // InternalIGES.g:3946:2: ( RULE_STRING )
            {
            // InternalIGES.g:3946:2: ( RULE_STRING )
            // InternalIGES.g:3947:3: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getEntityLabelSTRINGTerminalRuleCall_33_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getEntityLabelSTRINGTerminalRuleCall_33_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__EntityLabelAssignment_33"


    // $ANTLR start "rule__Entry__SubNumAssignment_35"
    // InternalIGES.g:3956:1: rule__Entry__SubNumAssignment_35 : ( RULE_INT ) ;
    public final void rule__Entry__SubNumAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3960:1: ( ( RULE_INT ) )
            // InternalIGES.g:3961:2: ( RULE_INT )
            {
            // InternalIGES.g:3961:2: ( RULE_INT )
            // InternalIGES.g:3962:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getSubNumINTTerminalRuleCall_35_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getSubNumINTTerminalRuleCall_35_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__SubNumAssignment_35"


    // $ANTLR start "rule__Parameters__EntriesAssignment"
    // InternalIGES.g:3971:1: rule__Parameters__EntriesAssignment : ( ( rule__Parameters__EntriesAlternatives_0 ) ) ;
    public final void rule__Parameters__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3975:1: ( ( ( rule__Parameters__EntriesAlternatives_0 ) ) )
            // InternalIGES.g:3976:2: ( ( rule__Parameters__EntriesAlternatives_0 ) )
            {
            // InternalIGES.g:3976:2: ( ( rule__Parameters__EntriesAlternatives_0 ) )
            // InternalIGES.g:3977:3: ( rule__Parameters__EntriesAlternatives_0 )
            {
             before(grammarAccess.getParametersAccess().getEntriesAlternatives_0()); 
            // InternalIGES.g:3978:3: ( rule__Parameters__EntriesAlternatives_0 )
            // InternalIGES.g:3978:4: rule__Parameters__EntriesAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__EntriesAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getEntriesAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__EntriesAssignment"


    // $ANTLR start "rule__PEntry__TypeAssignment_0"
    // InternalIGES.g:3986:1: rule__PEntry__TypeAssignment_0 : ( RULE_INT ) ;
    public final void rule__PEntry__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3990:1: ( ( RULE_INT ) )
            // InternalIGES.g:3991:2: ( RULE_INT )
            {
            // InternalIGES.g:3991:2: ( RULE_INT )
            // InternalIGES.g:3992:3: RULE_INT
            {
             before(grammarAccess.getPEntryAccess().getTypeINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getTypeINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__TypeAssignment_0"


    // $ANTLR start "rule__PEntry__ValuesAssignment_1"
    // InternalIGES.g:4001:1: rule__PEntry__ValuesAssignment_1 : ( ruleValue ) ;
    public final void rule__PEntry__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4005:1: ( ( ruleValue ) )
            // InternalIGES.g:4006:2: ( ruleValue )
            {
            // InternalIGES.g:4006:2: ( ruleValue )
            // InternalIGES.g:4007:3: ruleValue
            {
             before(grammarAccess.getPEntryAccess().getValuesValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPEntryAccess().getValuesValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__ValuesAssignment_1"


    // $ANTLR start "rule__PEntry__DIndexAssignment_4"
    // InternalIGES.g:4016:1: rule__PEntry__DIndexAssignment_4 : ( RULE_INT ) ;
    public final void rule__PEntry__DIndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4020:1: ( ( RULE_INT ) )
            // InternalIGES.g:4021:2: ( RULE_INT )
            {
            // InternalIGES.g:4021:2: ( RULE_INT )
            // InternalIGES.g:4022:3: RULE_INT
            {
             before(grammarAccess.getPEntryAccess().getDIndexINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getDIndexINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__DIndexAssignment_4"


    // $ANTLR start "rule__PEntry__IndiciesAssignment_7"
    // InternalIGES.g:4031:1: rule__PEntry__IndiciesAssignment_7 : ( RULE_INT ) ;
    public final void rule__PEntry__IndiciesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4035:1: ( ( RULE_INT ) )
            // InternalIGES.g:4036:2: ( RULE_INT )
            {
            // InternalIGES.g:4036:2: ( RULE_INT )
            // InternalIGES.g:4037:3: RULE_INT
            {
             before(grammarAccess.getPEntryAccess().getIndiciesINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getIndiciesINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PEntry__IndiciesAssignment_7"


    // $ANTLR start "rule__PMultiEntry__ValuesAssignment_0_0"
    // InternalIGES.g:4046:1: rule__PMultiEntry__ValuesAssignment_0_0 : ( ruleValue ) ;
    public final void rule__PMultiEntry__ValuesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4050:1: ( ( ruleValue ) )
            // InternalIGES.g:4051:2: ( ruleValue )
            {
            // InternalIGES.g:4051:2: ( ruleValue )
            // InternalIGES.g:4052:3: ruleValue
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__ValuesAssignment_0_0"


    // $ANTLR start "rule__PMultiEntry__DIndexAssignment_0_2"
    // InternalIGES.g:4061:1: rule__PMultiEntry__DIndexAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__PMultiEntry__DIndexAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4065:1: ( ( RULE_INT ) )
            // InternalIGES.g:4066:2: ( RULE_INT )
            {
            // InternalIGES.g:4066:2: ( RULE_INT )
            // InternalIGES.g:4067:3: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getDIndexINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getDIndexINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__DIndexAssignment_0_2"


    // $ANTLR start "rule__PMultiEntry__IndiciesAssignment_0_5"
    // InternalIGES.g:4076:1: rule__PMultiEntry__IndiciesAssignment_0_5 : ( RULE_INT ) ;
    public final void rule__PMultiEntry__IndiciesAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4080:1: ( ( RULE_INT ) )
            // InternalIGES.g:4081:2: ( RULE_INT )
            {
            // InternalIGES.g:4081:2: ( RULE_INT )
            // InternalIGES.g:4082:3: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getIndiciesINTTerminalRuleCall_0_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getIndiciesINTTerminalRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__IndiciesAssignment_0_5"


    // $ANTLR start "rule__PMultiEntry__ValuesAssignment_1"
    // InternalIGES.g:4091:1: rule__PMultiEntry__ValuesAssignment_1 : ( ruleValue ) ;
    public final void rule__PMultiEntry__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4095:1: ( ( ruleValue ) )
            // InternalIGES.g:4096:2: ( ruleValue )
            {
            // InternalIGES.g:4096:2: ( ruleValue )
            // InternalIGES.g:4097:3: ruleValue
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PMultiEntry__ValuesAssignment_1"


    // $ANTLR start "rule__HString__ValAssignment_1"
    // InternalIGES.g:4106:1: rule__HString__ValAssignment_1 : ( RULE_HOLLERITH ) ;
    public final void rule__HString__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4110:1: ( ( RULE_HOLLERITH ) )
            // InternalIGES.g:4111:2: ( RULE_HOLLERITH )
            {
            // InternalIGES.g:4111:2: ( RULE_HOLLERITH )
            // InternalIGES.g:4112:3: RULE_HOLLERITH
            {
             before(grammarAccess.getHStringAccess().getValHOLLERITHTerminalRuleCall_1_0()); 
            match(input,RULE_HOLLERITH,FOLLOW_2); 
             after(grammarAccess.getHStringAccess().getValHOLLERITHTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HString__ValAssignment_1"


    // $ANTLR start "rule__Param__ValAssignment_1"
    // InternalIGES.g:4121:1: rule__Param__ValAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__Param__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4125:1: ( ( RULE_DOUBLE ) )
            // InternalIGES.g:4126:2: ( RULE_DOUBLE )
            {
            // InternalIGES.g:4126:2: ( RULE_DOUBLE )
            // InternalIGES.g:4127:3: RULE_DOUBLE
            {
             before(grammarAccess.getParamAccess().getValDOUBLETerminalRuleCall_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getValDOUBLETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__ValAssignment_1"


    // $ANTLR start "rule__Pointer__ValAssignment_1"
    // InternalIGES.g:4136:1: rule__Pointer__ValAssignment_1 : ( RULE_INT ) ;
    public final void rule__Pointer__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4140:1: ( ( RULE_INT ) )
            // InternalIGES.g:4141:2: ( RULE_INT )
            {
            // InternalIGES.g:4141:2: ( RULE_INT )
            // InternalIGES.g:4142:3: RULE_INT
            {
             before(grammarAccess.getPointerAccess().getValINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointerAccess().getValINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer__ValAssignment_1"


    // $ANTLR start "rule__End__SvalAssignment_2"
    // InternalIGES.g:4151:1: rule__End__SvalAssignment_2 : ( RULE_INT ) ;
    public final void rule__End__SvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4155:1: ( ( RULE_INT ) )
            // InternalIGES.g:4156:2: ( RULE_INT )
            {
            // InternalIGES.g:4156:2: ( RULE_INT )
            // InternalIGES.g:4157:3: RULE_INT
            {
             before(grammarAccess.getEndAccess().getSvalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getSvalINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__SvalAssignment_2"


    // $ANTLR start "rule__End__GvalAssignment_5"
    // InternalIGES.g:4166:1: rule__End__GvalAssignment_5 : ( RULE_INT ) ;
    public final void rule__End__GvalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4170:1: ( ( RULE_INT ) )
            // InternalIGES.g:4171:2: ( RULE_INT )
            {
            // InternalIGES.g:4171:2: ( RULE_INT )
            // InternalIGES.g:4172:3: RULE_INT
            {
             before(grammarAccess.getEndAccess().getGvalINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getGvalINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__GvalAssignment_5"


    // $ANTLR start "rule__End__DvalAssignment_8"
    // InternalIGES.g:4181:1: rule__End__DvalAssignment_8 : ( RULE_INT ) ;
    public final void rule__End__DvalAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4185:1: ( ( RULE_INT ) )
            // InternalIGES.g:4186:2: ( RULE_INT )
            {
            // InternalIGES.g:4186:2: ( RULE_INT )
            // InternalIGES.g:4187:3: RULE_INT
            {
             before(grammarAccess.getEndAccess().getDvalINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getDvalINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__DvalAssignment_8"


    // $ANTLR start "rule__End__PvalAssignment_11"
    // InternalIGES.g:4196:1: rule__End__PvalAssignment_11 : ( RULE_INT ) ;
    public final void rule__End__PvalAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4200:1: ( ( RULE_INT ) )
            // InternalIGES.g:4201:2: ( RULE_INT )
            {
            // InternalIGES.g:4201:2: ( RULE_INT )
            // InternalIGES.g:4202:3: RULE_INT
            {
             before(grammarAccess.getEndAccess().getPvalINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getPvalINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__PvalAssignment_11"


    // $ANTLR start "rule__End__TvalAssignment_15"
    // InternalIGES.g:4211:1: rule__End__TvalAssignment_15 : ( RULE_INT ) ;
    public final void rule__End__TvalAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4215:1: ( ( RULE_INT ) )
            // InternalIGES.g:4216:2: ( RULE_INT )
            {
            // InternalIGES.g:4216:2: ( RULE_INT )
            // InternalIGES.g:4217:3: RULE_INT
            {
             before(grammarAccess.getEndAccess().getTvalINTTerminalRuleCall_15_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getTvalINTTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__TvalAssignment_15"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\5\1\uffff\5\5\1\uffff\3\5\1\7\1\5";
    static final String dfa_3s = "\1\13\1\uffff\1\16\2\13\1\16\1\13\1\uffff\5\13";
    static final String dfa_4s = "\1\uffff\1\1\5\uffff\1\2\5\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\3\1",
            "",
            "\1\1\1\7\1\5\1\uffff\1\3\1\6\1\4\2\uffff\1\1",
            "\1\1\1\uffff\1\5\1\uffff\1\1\1\6\1\4",
            "\1\1\1\7\1\5\1\uffff\1\10\1\6\1\4",
            "\1\1\1\7\1\5\1\uffff\1\11\1\6\1\4\2\uffff\1\1",
            "\1\1\1\7\1\5\1\uffff\1\12\1\6\1\4",
            "",
            "\1\1\1\7\1\5\1\uffff\1\13\1\6\1\4",
            "\1\1\1\7\1\5\1\uffff\1\13\1\6\1\4",
            "\1\1\1\7\1\5\1\uffff\1\13\1\6\1\4",
            "\1\14\2\uffff\1\6\1\4",
            "\1\1\1\7\1\5\1\uffff\1\11\1\6\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "423:1: rule__Parameters__EntriesAlternatives_0 : ( ( rulePMultiEntry ) | ( rulePEntry ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\5\1\7\3\5\2\uffff\3\5";
    static final String dfa_9s = "\1\14\1\13\3\14\2\uffff\3\14";
    static final String dfa_10s = "\5\uffff\1\2\1\1\3\uffff";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2\1\6",
            "\1\3\2\uffff\1\4\1\2",
            "\1\6\1\5\1\3\1\uffff\1\7\1\4\1\2\1\6",
            "\1\6\1\5\1\3\1\uffff\1\10\1\4\1\2\1\6",
            "\1\6\1\5\1\3\1\uffff\1\11\1\4\1\2\1\6",
            "",
            "",
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2\1\6",
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2\1\6",
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2\1\6"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 679:3: ( rule__Global__Group_1__0 )*";
        }
    }
    static final String dfa_13s = "\13\uffff";
    static final String dfa_14s = "\1\5\1\7\3\5\2\uffff\4\5";
    static final String dfa_15s = "\3\13\1\16\1\13\2\uffff\4\13";
    static final String dfa_16s = "\5\uffff\1\2\1\1\4\uffff";
    static final String dfa_17s = "\13\uffff}>";
    static final String[] dfa_18s = {
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2",
            "\1\7\2\uffff\1\4\1\2",
            "\1\6\1\5\1\3\1\uffff\1\10\1\4\1\2",
            "\1\6\1\5\1\3\1\uffff\1\11\1\4\1\2\2\uffff\1\6",
            "\1\6\1\5\1\3\1\uffff\1\12\1\4\1\2",
            "",
            "",
            "\1\6\1\5\1\3\1\uffff\1\11\1\4\1\2",
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2",
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2",
            "\1\6\1\5\1\3\1\uffff\1\1\1\4\1\2"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 2387:3: ( rule__PMultiEntry__Group_0__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000EA2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001EA0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000EA0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000EC0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001EA2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000E82L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000032L});

}