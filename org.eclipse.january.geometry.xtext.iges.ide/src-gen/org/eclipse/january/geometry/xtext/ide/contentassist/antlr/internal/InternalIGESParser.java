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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_DELIMITER", "RULE_SEPARATOR", "RULE_ENDLINE", "RULE_HOLLERITH", "RULE_DOUBLE", "'G'", "'D'", "'P'", "'S'", "'T'"
    };
    public static final int RULE_HOLLERITH=10;
    public static final int RULE_ENDLINE=9;
    public static final int RULE_WS=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SEPARATOR=8;
    public static final int RULE_DELIMITER=7;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int RULE_INT=4;
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
                    alt2=1;
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

                if ( (LA3_0==RULE_INT) ) {
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


    // $ANTLR start "rule__Entry__Alternatives_35"
    // InternalIGES.g:423:1: rule__Entry__Alternatives_35 : ( ( ( rule__Entry__EntityLabelAssignment_35_0 ) ) | ( RULE_INT ) );
    public final void rule__Entry__Alternatives_35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:427:1: ( ( ( rule__Entry__EntityLabelAssignment_35_0 ) ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIGES.g:428:2: ( ( rule__Entry__EntityLabelAssignment_35_0 ) )
                    {
                    // InternalIGES.g:428:2: ( ( rule__Entry__EntityLabelAssignment_35_0 ) )
                    // InternalIGES.g:429:3: ( rule__Entry__EntityLabelAssignment_35_0 )
                    {
                     before(grammarAccess.getEntryAccess().getEntityLabelAssignment_35_0()); 
                    // InternalIGES.g:430:3: ( rule__Entry__EntityLabelAssignment_35_0 )
                    // InternalIGES.g:430:4: rule__Entry__EntityLabelAssignment_35_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entry__EntityLabelAssignment_35_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntryAccess().getEntityLabelAssignment_35_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIGES.g:434:2: ( RULE_INT )
                    {
                    // InternalIGES.g:434:2: ( RULE_INT )
                    // InternalIGES.g:435:3: RULE_INT
                    {
                     before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_35_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getEntryAccess().getINTTerminalRuleCall_35_1()); 

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
    // $ANTLR end "rule__Entry__Alternatives_35"


    // $ANTLR start "rule__Parameters__EntriesAlternatives_0"
    // InternalIGES.g:444:1: rule__Parameters__EntriesAlternatives_0 : ( ( rulePMultiEntry ) | ( rulePEntry ) );
    public final void rule__Parameters__EntriesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:448:1: ( ( rulePMultiEntry ) | ( rulePEntry ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalIGES.g:449:2: ( rulePMultiEntry )
                    {
                    // InternalIGES.g:449:2: ( rulePMultiEntry )
                    // InternalIGES.g:450:3: rulePMultiEntry
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
                    // InternalIGES.g:455:2: ( rulePEntry )
                    {
                    // InternalIGES.g:455:2: ( rulePEntry )
                    // InternalIGES.g:456:3: rulePEntry
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
    // InternalIGES.g:465:1: rule__Value__Alternatives : ( ( ruleParam ) | ( rulePointer ) | ( ruleHString ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:469:1: ( ( ruleParam ) | ( rulePointer ) | ( ruleHString ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_HOLLERITH:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIGES.g:470:2: ( ruleParam )
                    {
                    // InternalIGES.g:470:2: ( ruleParam )
                    // InternalIGES.g:471:3: ruleParam
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
                    // InternalIGES.g:476:2: ( rulePointer )
                    {
                    // InternalIGES.g:476:2: ( rulePointer )
                    // InternalIGES.g:477:3: rulePointer
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
                    // InternalIGES.g:482:2: ( ruleHString )
                    {
                    // InternalIGES.g:482:2: ( ruleHString )
                    // InternalIGES.g:483:3: ruleHString
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
    // InternalIGES.g:492:1: rule__StartLine__Alternatives_0 : ( ( RULE_STRING ) | ( RULE_WS ) );
    public final void rule__StartLine__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:496:1: ( ( RULE_STRING ) | ( RULE_WS ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_WS) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIGES.g:497:2: ( RULE_STRING )
                    {
                    // InternalIGES.g:497:2: ( RULE_STRING )
                    // InternalIGES.g:498:3: RULE_STRING
                    {
                     before(grammarAccess.getStartLineAccess().getSTRINGTerminalRuleCall_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStartLineAccess().getSTRINGTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIGES.g:503:2: ( RULE_WS )
                    {
                    // InternalIGES.g:503:2: ( RULE_WS )
                    // InternalIGES.g:504:3: RULE_WS
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
    // InternalIGES.g:513:1: rule__IGES__Group__0 : rule__IGES__Group__0__Impl rule__IGES__Group__1 ;
    public final void rule__IGES__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:517:1: ( rule__IGES__Group__0__Impl rule__IGES__Group__1 )
            // InternalIGES.g:518:2: rule__IGES__Group__0__Impl rule__IGES__Group__1
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
    // InternalIGES.g:525:1: rule__IGES__Group__0__Impl : ( ( rule__IGES__StartAssignment_0 ) ) ;
    public final void rule__IGES__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:529:1: ( ( ( rule__IGES__StartAssignment_0 ) ) )
            // InternalIGES.g:530:1: ( ( rule__IGES__StartAssignment_0 ) )
            {
            // InternalIGES.g:530:1: ( ( rule__IGES__StartAssignment_0 ) )
            // InternalIGES.g:531:2: ( rule__IGES__StartAssignment_0 )
            {
             before(grammarAccess.getIGESAccess().getStartAssignment_0()); 
            // InternalIGES.g:532:2: ( rule__IGES__StartAssignment_0 )
            // InternalIGES.g:532:3: rule__IGES__StartAssignment_0
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
    // InternalIGES.g:540:1: rule__IGES__Group__1 : rule__IGES__Group__1__Impl rule__IGES__Group__2 ;
    public final void rule__IGES__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:544:1: ( rule__IGES__Group__1__Impl rule__IGES__Group__2 )
            // InternalIGES.g:545:2: rule__IGES__Group__1__Impl rule__IGES__Group__2
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
    // InternalIGES.g:552:1: rule__IGES__Group__1__Impl : ( ( rule__IGES__GlobalAssignment_1 ) ) ;
    public final void rule__IGES__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:556:1: ( ( ( rule__IGES__GlobalAssignment_1 ) ) )
            // InternalIGES.g:557:1: ( ( rule__IGES__GlobalAssignment_1 ) )
            {
            // InternalIGES.g:557:1: ( ( rule__IGES__GlobalAssignment_1 ) )
            // InternalIGES.g:558:2: ( rule__IGES__GlobalAssignment_1 )
            {
             before(grammarAccess.getIGESAccess().getGlobalAssignment_1()); 
            // InternalIGES.g:559:2: ( rule__IGES__GlobalAssignment_1 )
            // InternalIGES.g:559:3: rule__IGES__GlobalAssignment_1
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
    // InternalIGES.g:567:1: rule__IGES__Group__2 : rule__IGES__Group__2__Impl rule__IGES__Group__3 ;
    public final void rule__IGES__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:571:1: ( rule__IGES__Group__2__Impl rule__IGES__Group__3 )
            // InternalIGES.g:572:2: rule__IGES__Group__2__Impl rule__IGES__Group__3
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
    // InternalIGES.g:579:1: rule__IGES__Group__2__Impl : ( ( rule__IGES__DataAssignment_2 ) ) ;
    public final void rule__IGES__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:583:1: ( ( ( rule__IGES__DataAssignment_2 ) ) )
            // InternalIGES.g:584:1: ( ( rule__IGES__DataAssignment_2 ) )
            {
            // InternalIGES.g:584:1: ( ( rule__IGES__DataAssignment_2 ) )
            // InternalIGES.g:585:2: ( rule__IGES__DataAssignment_2 )
            {
             before(grammarAccess.getIGESAccess().getDataAssignment_2()); 
            // InternalIGES.g:586:2: ( rule__IGES__DataAssignment_2 )
            // InternalIGES.g:586:3: rule__IGES__DataAssignment_2
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
    // InternalIGES.g:594:1: rule__IGES__Group__3 : rule__IGES__Group__3__Impl rule__IGES__Group__4 ;
    public final void rule__IGES__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:598:1: ( rule__IGES__Group__3__Impl rule__IGES__Group__4 )
            // InternalIGES.g:599:2: rule__IGES__Group__3__Impl rule__IGES__Group__4
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
    // InternalIGES.g:606:1: rule__IGES__Group__3__Impl : ( ( rule__IGES__ParametersAssignment_3 ) ) ;
    public final void rule__IGES__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:610:1: ( ( ( rule__IGES__ParametersAssignment_3 ) ) )
            // InternalIGES.g:611:1: ( ( rule__IGES__ParametersAssignment_3 ) )
            {
            // InternalIGES.g:611:1: ( ( rule__IGES__ParametersAssignment_3 ) )
            // InternalIGES.g:612:2: ( rule__IGES__ParametersAssignment_3 )
            {
             before(grammarAccess.getIGESAccess().getParametersAssignment_3()); 
            // InternalIGES.g:613:2: ( rule__IGES__ParametersAssignment_3 )
            // InternalIGES.g:613:3: rule__IGES__ParametersAssignment_3
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
    // InternalIGES.g:621:1: rule__IGES__Group__4 : rule__IGES__Group__4__Impl ;
    public final void rule__IGES__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:625:1: ( rule__IGES__Group__4__Impl )
            // InternalIGES.g:626:2: rule__IGES__Group__4__Impl
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
    // InternalIGES.g:632:1: rule__IGES__Group__4__Impl : ( ( rule__IGES__EndAssignment_4 ) ) ;
    public final void rule__IGES__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:636:1: ( ( ( rule__IGES__EndAssignment_4 ) ) )
            // InternalIGES.g:637:1: ( ( rule__IGES__EndAssignment_4 ) )
            {
            // InternalIGES.g:637:1: ( ( rule__IGES__EndAssignment_4 ) )
            // InternalIGES.g:638:2: ( rule__IGES__EndAssignment_4 )
            {
             before(grammarAccess.getIGESAccess().getEndAssignment_4()); 
            // InternalIGES.g:639:2: ( rule__IGES__EndAssignment_4 )
            // InternalIGES.g:639:3: rule__IGES__EndAssignment_4
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
    // InternalIGES.g:648:1: rule__Global__Group__0 : rule__Global__Group__0__Impl rule__Global__Group__1 ;
    public final void rule__Global__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:652:1: ( rule__Global__Group__0__Impl rule__Global__Group__1 )
            // InternalIGES.g:653:2: rule__Global__Group__0__Impl rule__Global__Group__1
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
    // InternalIGES.g:660:1: rule__Global__Group__0__Impl : ( () ) ;
    public final void rule__Global__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:664:1: ( ( () ) )
            // InternalIGES.g:665:1: ( () )
            {
            // InternalIGES.g:665:1: ( () )
            // InternalIGES.g:666:2: ()
            {
             before(grammarAccess.getGlobalAccess().getGlobalAction_0()); 
            // InternalIGES.g:667:2: ()
            // InternalIGES.g:667:3: 
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
    // InternalIGES.g:675:1: rule__Global__Group__1 : rule__Global__Group__1__Impl rule__Global__Group__2 ;
    public final void rule__Global__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:679:1: ( rule__Global__Group__1__Impl rule__Global__Group__2 )
            // InternalIGES.g:680:2: rule__Global__Group__1__Impl rule__Global__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalIGES.g:687:1: rule__Global__Group__1__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Global__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:691:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:692:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:692:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:693:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_1()); 
            // InternalIGES.g:694:2: ( RULE_DELIMITER )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DELIMITER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIGES.g:694:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_1()); 

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
    // InternalIGES.g:702:1: rule__Global__Group__2 : rule__Global__Group__2__Impl rule__Global__Group__3 ;
    public final void rule__Global__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:706:1: ( rule__Global__Group__2__Impl rule__Global__Group__3 )
            // InternalIGES.g:707:2: rule__Global__Group__2__Impl rule__Global__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalIGES.g:714:1: rule__Global__Group__2__Impl : ( ( ruleHString )? ) ;
    public final void rule__Global__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:718:1: ( ( ( ruleHString )? ) )
            // InternalIGES.g:719:1: ( ( ruleHString )? )
            {
            // InternalIGES.g:719:1: ( ( ruleHString )? )
            // InternalIGES.g:720:2: ( ruleHString )?
            {
             before(grammarAccess.getGlobalAccess().getHStringParserRuleCall_2()); 
            // InternalIGES.g:721:2: ( ruleHString )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_HOLLERITH) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIGES.g:721:3: ruleHString
                    {
                    pushFollow(FOLLOW_2);
                    ruleHString();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getHStringParserRuleCall_2()); 

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
    // InternalIGES.g:729:1: rule__Global__Group__3 : rule__Global__Group__3__Impl rule__Global__Group__4 ;
    public final void rule__Global__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:733:1: ( rule__Global__Group__3__Impl rule__Global__Group__4 )
            // InternalIGES.g:734:2: rule__Global__Group__3__Impl rule__Global__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalIGES.g:741:1: rule__Global__Group__3__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Global__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:745:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:746:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:746:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:747:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_3()); 
            // InternalIGES.g:748:2: ( RULE_DELIMITER )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DELIMITER) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIGES.g:748:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_3()); 

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
    // InternalIGES.g:756:1: rule__Global__Group__4 : rule__Global__Group__4__Impl rule__Global__Group__5 ;
    public final void rule__Global__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:760:1: ( rule__Global__Group__4__Impl rule__Global__Group__5 )
            // InternalIGES.g:761:2: rule__Global__Group__4__Impl rule__Global__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalIGES.g:768:1: rule__Global__Group__4__Impl : ( ( ( rule__Global__Group_4__0 ) ) ( ( rule__Global__Group_4__0 )* ) ) ;
    public final void rule__Global__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:772:1: ( ( ( ( rule__Global__Group_4__0 ) ) ( ( rule__Global__Group_4__0 )* ) ) )
            // InternalIGES.g:773:1: ( ( ( rule__Global__Group_4__0 ) ) ( ( rule__Global__Group_4__0 )* ) )
            {
            // InternalIGES.g:773:1: ( ( ( rule__Global__Group_4__0 ) ) ( ( rule__Global__Group_4__0 )* ) )
            // InternalIGES.g:774:2: ( ( rule__Global__Group_4__0 ) ) ( ( rule__Global__Group_4__0 )* )
            {
            // InternalIGES.g:774:2: ( ( rule__Global__Group_4__0 ) )
            // InternalIGES.g:775:3: ( rule__Global__Group_4__0 )
            {
             before(grammarAccess.getGlobalAccess().getGroup_4()); 
            // InternalIGES.g:776:3: ( rule__Global__Group_4__0 )
            // InternalIGES.g:776:4: rule__Global__Group_4__0
            {
            pushFollow(FOLLOW_11);
            rule__Global__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalAccess().getGroup_4()); 

            }

            // InternalIGES.g:779:2: ( ( rule__Global__Group_4__0 )* )
            // InternalIGES.g:780:3: ( rule__Global__Group_4__0 )*
            {
             before(grammarAccess.getGlobalAccess().getGroup_4()); 
            // InternalIGES.g:781:3: ( rule__Global__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalIGES.g:781:4: rule__Global__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Global__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGlobalAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Global__Group__4__Impl"


    // $ANTLR start "rule__Global__Group__5"
    // InternalIGES.g:790:1: rule__Global__Group__5 : rule__Global__Group__5__Impl rule__Global__Group__6 ;
    public final void rule__Global__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:794:1: ( rule__Global__Group__5__Impl rule__Global__Group__6 )
            // InternalIGES.g:795:2: rule__Global__Group__5__Impl rule__Global__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalIGES.g:802:1: rule__Global__Group__5__Impl : ( ( rule__Global__ValuesAssignment_5 )* ) ;
    public final void rule__Global__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:806:1: ( ( ( rule__Global__ValuesAssignment_5 )* ) )
            // InternalIGES.g:807:1: ( ( rule__Global__ValuesAssignment_5 )* )
            {
            // InternalIGES.g:807:1: ( ( rule__Global__ValuesAssignment_5 )* )
            // InternalIGES.g:808:2: ( rule__Global__ValuesAssignment_5 )*
            {
             before(grammarAccess.getGlobalAccess().getValuesAssignment_5()); 
            // InternalIGES.g:809:2: ( rule__Global__ValuesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT||(LA12_0>=RULE_HOLLERITH && LA12_0<=RULE_DOUBLE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIGES.g:809:3: rule__Global__ValuesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Global__ValuesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGlobalAccess().getValuesAssignment_5()); 

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
    // InternalIGES.g:817:1: rule__Global__Group__6 : rule__Global__Group__6__Impl rule__Global__Group__7 ;
    public final void rule__Global__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:821:1: ( rule__Global__Group__6__Impl rule__Global__Group__7 )
            // InternalIGES.g:822:2: rule__Global__Group__6__Impl rule__Global__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalIGES.g:829:1: rule__Global__Group__6__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__Global__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:833:1: ( ( RULE_SEPARATOR ) )
            // InternalIGES.g:834:1: ( RULE_SEPARATOR )
            {
            // InternalIGES.g:834:1: ( RULE_SEPARATOR )
            // InternalIGES.g:835:2: RULE_SEPARATOR
            {
             before(grammarAccess.getGlobalAccess().getSEPARATORTerminalRuleCall_6()); 
            match(input,RULE_SEPARATOR,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getSEPARATORTerminalRuleCall_6()); 

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
    // InternalIGES.g:844:1: rule__Global__Group__7 : rule__Global__Group__7__Impl rule__Global__Group__8 ;
    public final void rule__Global__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:848:1: ( rule__Global__Group__7__Impl rule__Global__Group__8 )
            // InternalIGES.g:849:2: rule__Global__Group__7__Impl rule__Global__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalIGES.g:856:1: rule__Global__Group__7__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:860:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:861:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:861:1: ( ( RULE_WS )? )
            // InternalIGES.g:862:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_7()); 
            // InternalIGES.g:863:2: ( RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIGES.g:863:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_7()); 

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
    // InternalIGES.g:871:1: rule__Global__Group__8 : rule__Global__Group__8__Impl rule__Global__Group__9 ;
    public final void rule__Global__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:875:1: ( rule__Global__Group__8__Impl rule__Global__Group__9 )
            // InternalIGES.g:876:2: rule__Global__Group__8__Impl rule__Global__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__9();

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
    // InternalIGES.g:883:1: rule__Global__Group__8__Impl : ( 'G' ) ;
    public final void rule__Global__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:887:1: ( ( 'G' ) )
            // InternalIGES.g:888:1: ( 'G' )
            {
            // InternalIGES.g:888:1: ( 'G' )
            // InternalIGES.g:889:2: 'G'
            {
             before(grammarAccess.getGlobalAccess().getGKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getGKeyword_8()); 

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


    // $ANTLR start "rule__Global__Group__9"
    // InternalIGES.g:898:1: rule__Global__Group__9 : rule__Global__Group__9__Impl rule__Global__Group__10 ;
    public final void rule__Global__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:902:1: ( rule__Global__Group__9__Impl rule__Global__Group__10 )
            // InternalIGES.g:903:2: rule__Global__Group__9__Impl rule__Global__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__10();

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
    // $ANTLR end "rule__Global__Group__9"


    // $ANTLR start "rule__Global__Group__9__Impl"
    // InternalIGES.g:910:1: rule__Global__Group__9__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:914:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:915:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:915:1: ( ( RULE_WS )? )
            // InternalIGES.g:916:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_9()); 
            // InternalIGES.g:917:2: ( RULE_WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIGES.g:917:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__Global__Group__9__Impl"


    // $ANTLR start "rule__Global__Group__10"
    // InternalIGES.g:925:1: rule__Global__Group__10 : rule__Global__Group__10__Impl rule__Global__Group__11 ;
    public final void rule__Global__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:929:1: ( rule__Global__Group__10__Impl rule__Global__Group__11 )
            // InternalIGES.g:930:2: rule__Global__Group__10__Impl rule__Global__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Global__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group__11();

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
    // $ANTLR end "rule__Global__Group__10"


    // $ANTLR start "rule__Global__Group__10__Impl"
    // InternalIGES.g:937:1: rule__Global__Group__10__Impl : ( RULE_INT ) ;
    public final void rule__Global__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:941:1: ( ( RULE_INT ) )
            // InternalIGES.g:942:1: ( RULE_INT )
            {
            // InternalIGES.g:942:1: ( RULE_INT )
            // InternalIGES.g:943:2: RULE_INT
            {
             before(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_10()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_10()); 

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
    // $ANTLR end "rule__Global__Group__10__Impl"


    // $ANTLR start "rule__Global__Group__11"
    // InternalIGES.g:952:1: rule__Global__Group__11 : rule__Global__Group__11__Impl ;
    public final void rule__Global__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:956:1: ( rule__Global__Group__11__Impl )
            // InternalIGES.g:957:2: rule__Global__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group__11__Impl();

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
    // $ANTLR end "rule__Global__Group__11"


    // $ANTLR start "rule__Global__Group__11__Impl"
    // InternalIGES.g:963:1: rule__Global__Group__11__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Global__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:967:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:968:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:968:1: ( RULE_ENDLINE )
            // InternalIGES.g:969:2: RULE_ENDLINE
            {
             before(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_11()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_11()); 

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
    // $ANTLR end "rule__Global__Group__11__Impl"


    // $ANTLR start "rule__Global__Group_4__0"
    // InternalIGES.g:979:1: rule__Global__Group_4__0 : rule__Global__Group_4__0__Impl rule__Global__Group_4__1 ;
    public final void rule__Global__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:983:1: ( rule__Global__Group_4__0__Impl rule__Global__Group_4__1 )
            // InternalIGES.g:984:2: rule__Global__Group_4__0__Impl rule__Global__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Global__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_4__1();

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
    // $ANTLR end "rule__Global__Group_4__0"


    // $ANTLR start "rule__Global__Group_4__0__Impl"
    // InternalIGES.g:991:1: rule__Global__Group_4__0__Impl : ( ( rule__Global__ValuesAssignment_4_0 )* ) ;
    public final void rule__Global__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:995:1: ( ( ( rule__Global__ValuesAssignment_4_0 )* ) )
            // InternalIGES.g:996:1: ( ( rule__Global__ValuesAssignment_4_0 )* )
            {
            // InternalIGES.g:996:1: ( ( rule__Global__ValuesAssignment_4_0 )* )
            // InternalIGES.g:997:2: ( rule__Global__ValuesAssignment_4_0 )*
            {
             before(grammarAccess.getGlobalAccess().getValuesAssignment_4_0()); 
            // InternalIGES.g:998:2: ( rule__Global__ValuesAssignment_4_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT||(LA15_0>=RULE_HOLLERITH && LA15_0<=RULE_DOUBLE)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIGES.g:998:3: rule__Global__ValuesAssignment_4_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Global__ValuesAssignment_4_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getGlobalAccess().getValuesAssignment_4_0()); 

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
    // $ANTLR end "rule__Global__Group_4__0__Impl"


    // $ANTLR start "rule__Global__Group_4__1"
    // InternalIGES.g:1006:1: rule__Global__Group_4__1 : rule__Global__Group_4__1__Impl rule__Global__Group_4__2 ;
    public final void rule__Global__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1010:1: ( rule__Global__Group_4__1__Impl rule__Global__Group_4__2 )
            // InternalIGES.g:1011:2: rule__Global__Group_4__1__Impl rule__Global__Group_4__2
            {
            pushFollow(FOLLOW_6);
            rule__Global__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_4__2();

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
    // $ANTLR end "rule__Global__Group_4__1"


    // $ANTLR start "rule__Global__Group_4__1__Impl"
    // InternalIGES.g:1018:1: rule__Global__Group_4__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1022:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1023:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1023:1: ( ( RULE_WS )? )
            // InternalIGES.g:1024:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4_1()); 
            // InternalIGES.g:1025:2: ( RULE_WS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_WS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIGES.g:1025:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Global__Group_4__1__Impl"


    // $ANTLR start "rule__Global__Group_4__2"
    // InternalIGES.g:1033:1: rule__Global__Group_4__2 : rule__Global__Group_4__2__Impl rule__Global__Group_4__3 ;
    public final void rule__Global__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1037:1: ( rule__Global__Group_4__2__Impl rule__Global__Group_4__3 )
            // InternalIGES.g:1038:2: rule__Global__Group_4__2__Impl rule__Global__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_4__3();

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
    // $ANTLR end "rule__Global__Group_4__2"


    // $ANTLR start "rule__Global__Group_4__2__Impl"
    // InternalIGES.g:1045:1: rule__Global__Group_4__2__Impl : ( 'G' ) ;
    public final void rule__Global__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1049:1: ( ( 'G' ) )
            // InternalIGES.g:1050:1: ( 'G' )
            {
            // InternalIGES.g:1050:1: ( 'G' )
            // InternalIGES.g:1051:2: 'G'
            {
             before(grammarAccess.getGlobalAccess().getGKeyword_4_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getGKeyword_4_2()); 

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
    // $ANTLR end "rule__Global__Group_4__2__Impl"


    // $ANTLR start "rule__Global__Group_4__3"
    // InternalIGES.g:1060:1: rule__Global__Group_4__3 : rule__Global__Group_4__3__Impl rule__Global__Group_4__4 ;
    public final void rule__Global__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1064:1: ( rule__Global__Group_4__3__Impl rule__Global__Group_4__4 )
            // InternalIGES.g:1065:2: rule__Global__Group_4__3__Impl rule__Global__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__Global__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_4__4();

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
    // $ANTLR end "rule__Global__Group_4__3"


    // $ANTLR start "rule__Global__Group_4__3__Impl"
    // InternalIGES.g:1072:1: rule__Global__Group_4__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Global__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1076:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1077:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1077:1: ( ( RULE_WS )? )
            // InternalIGES.g:1078:2: ( RULE_WS )?
            {
             before(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4_3()); 
            // InternalIGES.g:1079:2: ( RULE_WS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_WS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIGES.g:1079:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4_3()); 

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
    // $ANTLR end "rule__Global__Group_4__3__Impl"


    // $ANTLR start "rule__Global__Group_4__4"
    // InternalIGES.g:1087:1: rule__Global__Group_4__4 : rule__Global__Group_4__4__Impl rule__Global__Group_4__5 ;
    public final void rule__Global__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1091:1: ( rule__Global__Group_4__4__Impl rule__Global__Group_4__5 )
            // InternalIGES.g:1092:2: rule__Global__Group_4__4__Impl rule__Global__Group_4__5
            {
            pushFollow(FOLLOW_15);
            rule__Global__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Global__Group_4__5();

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
    // $ANTLR end "rule__Global__Group_4__4"


    // $ANTLR start "rule__Global__Group_4__4__Impl"
    // InternalIGES.g:1099:1: rule__Global__Group_4__4__Impl : ( RULE_INT ) ;
    public final void rule__Global__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1103:1: ( ( RULE_INT ) )
            // InternalIGES.g:1104:1: ( RULE_INT )
            {
            // InternalIGES.g:1104:1: ( RULE_INT )
            // InternalIGES.g:1105:2: RULE_INT
            {
             before(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_4_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getINTTerminalRuleCall_4_4()); 

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
    // $ANTLR end "rule__Global__Group_4__4__Impl"


    // $ANTLR start "rule__Global__Group_4__5"
    // InternalIGES.g:1114:1: rule__Global__Group_4__5 : rule__Global__Group_4__5__Impl ;
    public final void rule__Global__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1118:1: ( rule__Global__Group_4__5__Impl )
            // InternalIGES.g:1119:2: rule__Global__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Global__Group_4__5__Impl();

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
    // $ANTLR end "rule__Global__Group_4__5"


    // $ANTLR start "rule__Global__Group_4__5__Impl"
    // InternalIGES.g:1125:1: rule__Global__Group_4__5__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Global__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1129:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:1130:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:1130:1: ( RULE_ENDLINE )
            // InternalIGES.g:1131:2: RULE_ENDLINE
            {
             before(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_4_5()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_4_5()); 

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
    // $ANTLR end "rule__Global__Group_4__5__Impl"


    // $ANTLR start "rule__Entry__Group__0"
    // InternalIGES.g:1141:1: rule__Entry__Group__0 : rule__Entry__Group__0__Impl rule__Entry__Group__1 ;
    public final void rule__Entry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1145:1: ( rule__Entry__Group__0__Impl rule__Entry__Group__1 )
            // InternalIGES.g:1146:2: rule__Entry__Group__0__Impl rule__Entry__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalIGES.g:1153:1: rule__Entry__Group__0__Impl : ( RULE_WS ) ;
    public final void rule__Entry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1157:1: ( ( RULE_WS ) )
            // InternalIGES.g:1158:1: ( RULE_WS )
            {
            // InternalIGES.g:1158:1: ( RULE_WS )
            // InternalIGES.g:1159:2: RULE_WS
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
    // InternalIGES.g:1168:1: rule__Entry__Group__1 : rule__Entry__Group__1__Impl rule__Entry__Group__2 ;
    public final void rule__Entry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1172:1: ( rule__Entry__Group__1__Impl rule__Entry__Group__2 )
            // InternalIGES.g:1173:2: rule__Entry__Group__1__Impl rule__Entry__Group__2
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
    // InternalIGES.g:1180:1: rule__Entry__Group__1__Impl : ( ( rule__Entry__TypeAssignment_1 ) ) ;
    public final void rule__Entry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1184:1: ( ( ( rule__Entry__TypeAssignment_1 ) ) )
            // InternalIGES.g:1185:1: ( ( rule__Entry__TypeAssignment_1 ) )
            {
            // InternalIGES.g:1185:1: ( ( rule__Entry__TypeAssignment_1 ) )
            // InternalIGES.g:1186:2: ( rule__Entry__TypeAssignment_1 )
            {
             before(grammarAccess.getEntryAccess().getTypeAssignment_1()); 
            // InternalIGES.g:1187:2: ( rule__Entry__TypeAssignment_1 )
            // InternalIGES.g:1187:3: rule__Entry__TypeAssignment_1
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
    // InternalIGES.g:1195:1: rule__Entry__Group__2 : rule__Entry__Group__2__Impl rule__Entry__Group__3 ;
    public final void rule__Entry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1199:1: ( rule__Entry__Group__2__Impl rule__Entry__Group__3 )
            // InternalIGES.g:1200:2: rule__Entry__Group__2__Impl rule__Entry__Group__3
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
    // InternalIGES.g:1207:1: rule__Entry__Group__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1211:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1212:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1212:1: ( ( RULE_WS )? )
            // InternalIGES.g:1213:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_2()); 
            // InternalIGES.g:1214:2: ( RULE_WS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_WS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIGES.g:1214:3: RULE_WS
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
    // InternalIGES.g:1222:1: rule__Entry__Group__3 : rule__Entry__Group__3__Impl rule__Entry__Group__4 ;
    public final void rule__Entry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1226:1: ( rule__Entry__Group__3__Impl rule__Entry__Group__4 )
            // InternalIGES.g:1227:2: rule__Entry__Group__3__Impl rule__Entry__Group__4
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
    // InternalIGES.g:1234:1: rule__Entry__Group__3__Impl : ( ( rule__Entry__ParamDataAssignment_3 ) ) ;
    public final void rule__Entry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1238:1: ( ( ( rule__Entry__ParamDataAssignment_3 ) ) )
            // InternalIGES.g:1239:1: ( ( rule__Entry__ParamDataAssignment_3 ) )
            {
            // InternalIGES.g:1239:1: ( ( rule__Entry__ParamDataAssignment_3 ) )
            // InternalIGES.g:1240:2: ( rule__Entry__ParamDataAssignment_3 )
            {
             before(grammarAccess.getEntryAccess().getParamDataAssignment_3()); 
            // InternalIGES.g:1241:2: ( rule__Entry__ParamDataAssignment_3 )
            // InternalIGES.g:1241:3: rule__Entry__ParamDataAssignment_3
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
    // InternalIGES.g:1249:1: rule__Entry__Group__4 : rule__Entry__Group__4__Impl rule__Entry__Group__5 ;
    public final void rule__Entry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1253:1: ( rule__Entry__Group__4__Impl rule__Entry__Group__5 )
            // InternalIGES.g:1254:2: rule__Entry__Group__4__Impl rule__Entry__Group__5
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
    // InternalIGES.g:1261:1: rule__Entry__Group__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1265:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1266:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1266:1: ( ( RULE_WS )? )
            // InternalIGES.g:1267:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_4()); 
            // InternalIGES.g:1268:2: ( RULE_WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_WS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIGES.g:1268:3: RULE_WS
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
    // InternalIGES.g:1276:1: rule__Entry__Group__5 : rule__Entry__Group__5__Impl rule__Entry__Group__6 ;
    public final void rule__Entry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1280:1: ( rule__Entry__Group__5__Impl rule__Entry__Group__6 )
            // InternalIGES.g:1281:2: rule__Entry__Group__5__Impl rule__Entry__Group__6
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
    // InternalIGES.g:1288:1: rule__Entry__Group__5__Impl : ( ( rule__Entry__StructureAssignment_5 ) ) ;
    public final void rule__Entry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1292:1: ( ( ( rule__Entry__StructureAssignment_5 ) ) )
            // InternalIGES.g:1293:1: ( ( rule__Entry__StructureAssignment_5 ) )
            {
            // InternalIGES.g:1293:1: ( ( rule__Entry__StructureAssignment_5 ) )
            // InternalIGES.g:1294:2: ( rule__Entry__StructureAssignment_5 )
            {
             before(grammarAccess.getEntryAccess().getStructureAssignment_5()); 
            // InternalIGES.g:1295:2: ( rule__Entry__StructureAssignment_5 )
            // InternalIGES.g:1295:3: rule__Entry__StructureAssignment_5
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
    // InternalIGES.g:1303:1: rule__Entry__Group__6 : rule__Entry__Group__6__Impl rule__Entry__Group__7 ;
    public final void rule__Entry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1307:1: ( rule__Entry__Group__6__Impl rule__Entry__Group__7 )
            // InternalIGES.g:1308:2: rule__Entry__Group__6__Impl rule__Entry__Group__7
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
    // InternalIGES.g:1315:1: rule__Entry__Group__6__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1319:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1320:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1320:1: ( ( RULE_WS )? )
            // InternalIGES.g:1321:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_6()); 
            // InternalIGES.g:1322:2: ( RULE_WS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_WS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIGES.g:1322:3: RULE_WS
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
    // InternalIGES.g:1330:1: rule__Entry__Group__7 : rule__Entry__Group__7__Impl rule__Entry__Group__8 ;
    public final void rule__Entry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1334:1: ( rule__Entry__Group__7__Impl rule__Entry__Group__8 )
            // InternalIGES.g:1335:2: rule__Entry__Group__7__Impl rule__Entry__Group__8
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
    // InternalIGES.g:1342:1: rule__Entry__Group__7__Impl : ( ( rule__Entry__LineFontAssignment_7 ) ) ;
    public final void rule__Entry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1346:1: ( ( ( rule__Entry__LineFontAssignment_7 ) ) )
            // InternalIGES.g:1347:1: ( ( rule__Entry__LineFontAssignment_7 ) )
            {
            // InternalIGES.g:1347:1: ( ( rule__Entry__LineFontAssignment_7 ) )
            // InternalIGES.g:1348:2: ( rule__Entry__LineFontAssignment_7 )
            {
             before(grammarAccess.getEntryAccess().getLineFontAssignment_7()); 
            // InternalIGES.g:1349:2: ( rule__Entry__LineFontAssignment_7 )
            // InternalIGES.g:1349:3: rule__Entry__LineFontAssignment_7
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
    // InternalIGES.g:1357:1: rule__Entry__Group__8 : rule__Entry__Group__8__Impl rule__Entry__Group__9 ;
    public final void rule__Entry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1361:1: ( rule__Entry__Group__8__Impl rule__Entry__Group__9 )
            // InternalIGES.g:1362:2: rule__Entry__Group__8__Impl rule__Entry__Group__9
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
    // InternalIGES.g:1369:1: rule__Entry__Group__8__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1373:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1374:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1374:1: ( ( RULE_WS )? )
            // InternalIGES.g:1375:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_8()); 
            // InternalIGES.g:1376:2: ( RULE_WS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_WS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIGES.g:1376:3: RULE_WS
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
    // InternalIGES.g:1384:1: rule__Entry__Group__9 : rule__Entry__Group__9__Impl rule__Entry__Group__10 ;
    public final void rule__Entry__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1388:1: ( rule__Entry__Group__9__Impl rule__Entry__Group__10 )
            // InternalIGES.g:1389:2: rule__Entry__Group__9__Impl rule__Entry__Group__10
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
    // InternalIGES.g:1396:1: rule__Entry__Group__9__Impl : ( ( rule__Entry__LevelAssignment_9 ) ) ;
    public final void rule__Entry__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1400:1: ( ( ( rule__Entry__LevelAssignment_9 ) ) )
            // InternalIGES.g:1401:1: ( ( rule__Entry__LevelAssignment_9 ) )
            {
            // InternalIGES.g:1401:1: ( ( rule__Entry__LevelAssignment_9 ) )
            // InternalIGES.g:1402:2: ( rule__Entry__LevelAssignment_9 )
            {
             before(grammarAccess.getEntryAccess().getLevelAssignment_9()); 
            // InternalIGES.g:1403:2: ( rule__Entry__LevelAssignment_9 )
            // InternalIGES.g:1403:3: rule__Entry__LevelAssignment_9
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
    // InternalIGES.g:1411:1: rule__Entry__Group__10 : rule__Entry__Group__10__Impl rule__Entry__Group__11 ;
    public final void rule__Entry__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1415:1: ( rule__Entry__Group__10__Impl rule__Entry__Group__11 )
            // InternalIGES.g:1416:2: rule__Entry__Group__10__Impl rule__Entry__Group__11
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
    // InternalIGES.g:1423:1: rule__Entry__Group__10__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1427:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1428:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1428:1: ( ( RULE_WS )? )
            // InternalIGES.g:1429:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_10()); 
            // InternalIGES.g:1430:2: ( RULE_WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_WS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIGES.g:1430:3: RULE_WS
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
    // InternalIGES.g:1438:1: rule__Entry__Group__11 : rule__Entry__Group__11__Impl rule__Entry__Group__12 ;
    public final void rule__Entry__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1442:1: ( rule__Entry__Group__11__Impl rule__Entry__Group__12 )
            // InternalIGES.g:1443:2: rule__Entry__Group__11__Impl rule__Entry__Group__12
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
    // InternalIGES.g:1450:1: rule__Entry__Group__11__Impl : ( ( rule__Entry__ViewAssignment_11 ) ) ;
    public final void rule__Entry__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1454:1: ( ( ( rule__Entry__ViewAssignment_11 ) ) )
            // InternalIGES.g:1455:1: ( ( rule__Entry__ViewAssignment_11 ) )
            {
            // InternalIGES.g:1455:1: ( ( rule__Entry__ViewAssignment_11 ) )
            // InternalIGES.g:1456:2: ( rule__Entry__ViewAssignment_11 )
            {
             before(grammarAccess.getEntryAccess().getViewAssignment_11()); 
            // InternalIGES.g:1457:2: ( rule__Entry__ViewAssignment_11 )
            // InternalIGES.g:1457:3: rule__Entry__ViewAssignment_11
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
    // InternalIGES.g:1465:1: rule__Entry__Group__12 : rule__Entry__Group__12__Impl rule__Entry__Group__13 ;
    public final void rule__Entry__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1469:1: ( rule__Entry__Group__12__Impl rule__Entry__Group__13 )
            // InternalIGES.g:1470:2: rule__Entry__Group__12__Impl rule__Entry__Group__13
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
    // InternalIGES.g:1477:1: rule__Entry__Group__12__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1481:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1482:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1482:1: ( ( RULE_WS )? )
            // InternalIGES.g:1483:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_12()); 
            // InternalIGES.g:1484:2: ( RULE_WS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_WS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIGES.g:1484:3: RULE_WS
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
    // InternalIGES.g:1492:1: rule__Entry__Group__13 : rule__Entry__Group__13__Impl rule__Entry__Group__14 ;
    public final void rule__Entry__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1496:1: ( rule__Entry__Group__13__Impl rule__Entry__Group__14 )
            // InternalIGES.g:1497:2: rule__Entry__Group__13__Impl rule__Entry__Group__14
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
    // InternalIGES.g:1504:1: rule__Entry__Group__13__Impl : ( ( rule__Entry__TransformMatrixAssignment_13 ) ) ;
    public final void rule__Entry__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1508:1: ( ( ( rule__Entry__TransformMatrixAssignment_13 ) ) )
            // InternalIGES.g:1509:1: ( ( rule__Entry__TransformMatrixAssignment_13 ) )
            {
            // InternalIGES.g:1509:1: ( ( rule__Entry__TransformMatrixAssignment_13 ) )
            // InternalIGES.g:1510:2: ( rule__Entry__TransformMatrixAssignment_13 )
            {
             before(grammarAccess.getEntryAccess().getTransformMatrixAssignment_13()); 
            // InternalIGES.g:1511:2: ( rule__Entry__TransformMatrixAssignment_13 )
            // InternalIGES.g:1511:3: rule__Entry__TransformMatrixAssignment_13
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
    // InternalIGES.g:1519:1: rule__Entry__Group__14 : rule__Entry__Group__14__Impl rule__Entry__Group__15 ;
    public final void rule__Entry__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1523:1: ( rule__Entry__Group__14__Impl rule__Entry__Group__15 )
            // InternalIGES.g:1524:2: rule__Entry__Group__14__Impl rule__Entry__Group__15
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
    // InternalIGES.g:1531:1: rule__Entry__Group__14__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1535:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1536:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1536:1: ( ( RULE_WS )? )
            // InternalIGES.g:1537:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_14()); 
            // InternalIGES.g:1538:2: ( RULE_WS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_WS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIGES.g:1538:3: RULE_WS
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
    // InternalIGES.g:1546:1: rule__Entry__Group__15 : rule__Entry__Group__15__Impl rule__Entry__Group__16 ;
    public final void rule__Entry__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1550:1: ( rule__Entry__Group__15__Impl rule__Entry__Group__16 )
            // InternalIGES.g:1551:2: rule__Entry__Group__15__Impl rule__Entry__Group__16
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
    // InternalIGES.g:1558:1: rule__Entry__Group__15__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Entry__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1562:1: ( ( ( RULE_INT )? ) )
            // InternalIGES.g:1563:1: ( ( RULE_INT )? )
            {
            // InternalIGES.g:1563:1: ( ( RULE_INT )? )
            // InternalIGES.g:1564:2: ( RULE_INT )?
            {
             before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_15()); 
            // InternalIGES.g:1565:2: ( RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_INT||LA25_1==RULE_WS) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalIGES.g:1565:3: RULE_INT
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
    // InternalIGES.g:1573:1: rule__Entry__Group__16 : rule__Entry__Group__16__Impl rule__Entry__Group__17 ;
    public final void rule__Entry__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1577:1: ( rule__Entry__Group__16__Impl rule__Entry__Group__17 )
            // InternalIGES.g:1578:2: rule__Entry__Group__16__Impl rule__Entry__Group__17
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
    // InternalIGES.g:1585:1: rule__Entry__Group__16__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1589:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1590:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1590:1: ( ( RULE_WS )? )
            // InternalIGES.g:1591:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_16()); 
            // InternalIGES.g:1592:2: ( RULE_WS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_WS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIGES.g:1592:3: RULE_WS
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
    // InternalIGES.g:1600:1: rule__Entry__Group__17 : rule__Entry__Group__17__Impl rule__Entry__Group__18 ;
    public final void rule__Entry__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1604:1: ( rule__Entry__Group__17__Impl rule__Entry__Group__18 )
            // InternalIGES.g:1605:2: rule__Entry__Group__17__Impl rule__Entry__Group__18
            {
            pushFollow(FOLLOW_16);
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
    // InternalIGES.g:1612:1: rule__Entry__Group__17__Impl : ( ( rule__Entry__StatusAssignment_17 ) ) ;
    public final void rule__Entry__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1616:1: ( ( ( rule__Entry__StatusAssignment_17 ) ) )
            // InternalIGES.g:1617:1: ( ( rule__Entry__StatusAssignment_17 ) )
            {
            // InternalIGES.g:1617:1: ( ( rule__Entry__StatusAssignment_17 ) )
            // InternalIGES.g:1618:2: ( rule__Entry__StatusAssignment_17 )
            {
             before(grammarAccess.getEntryAccess().getStatusAssignment_17()); 
            // InternalIGES.g:1619:2: ( rule__Entry__StatusAssignment_17 )
            // InternalIGES.g:1619:3: rule__Entry__StatusAssignment_17
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
    // InternalIGES.g:1627:1: rule__Entry__Group__18 : rule__Entry__Group__18__Impl rule__Entry__Group__19 ;
    public final void rule__Entry__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1631:1: ( rule__Entry__Group__18__Impl rule__Entry__Group__19 )
            // InternalIGES.g:1632:2: rule__Entry__Group__18__Impl rule__Entry__Group__19
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
    // InternalIGES.g:1639:1: rule__Entry__Group__18__Impl : ( 'D' ) ;
    public final void rule__Entry__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1643:1: ( ( 'D' ) )
            // InternalIGES.g:1644:1: ( 'D' )
            {
            // InternalIGES.g:1644:1: ( 'D' )
            // InternalIGES.g:1645:2: 'D'
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
    // InternalIGES.g:1654:1: rule__Entry__Group__19 : rule__Entry__Group__19__Impl rule__Entry__Group__20 ;
    public final void rule__Entry__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1658:1: ( rule__Entry__Group__19__Impl rule__Entry__Group__20 )
            // InternalIGES.g:1659:2: rule__Entry__Group__19__Impl rule__Entry__Group__20
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
    // InternalIGES.g:1666:1: rule__Entry__Group__19__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1670:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1671:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1671:1: ( ( RULE_WS )? )
            // InternalIGES.g:1672:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_19()); 
            // InternalIGES.g:1673:2: ( RULE_WS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_WS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalIGES.g:1673:3: RULE_WS
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
    // InternalIGES.g:1681:1: rule__Entry__Group__20 : rule__Entry__Group__20__Impl rule__Entry__Group__21 ;
    public final void rule__Entry__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1685:1: ( rule__Entry__Group__20__Impl rule__Entry__Group__21 )
            // InternalIGES.g:1686:2: rule__Entry__Group__20__Impl rule__Entry__Group__21
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
    // InternalIGES.g:1693:1: rule__Entry__Group__20__Impl : ( ( rule__Entry__IndexAssignment_20 ) ) ;
    public final void rule__Entry__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1697:1: ( ( ( rule__Entry__IndexAssignment_20 ) ) )
            // InternalIGES.g:1698:1: ( ( rule__Entry__IndexAssignment_20 ) )
            {
            // InternalIGES.g:1698:1: ( ( rule__Entry__IndexAssignment_20 ) )
            // InternalIGES.g:1699:2: ( rule__Entry__IndexAssignment_20 )
            {
             before(grammarAccess.getEntryAccess().getIndexAssignment_20()); 
            // InternalIGES.g:1700:2: ( rule__Entry__IndexAssignment_20 )
            // InternalIGES.g:1700:3: rule__Entry__IndexAssignment_20
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
    // InternalIGES.g:1708:1: rule__Entry__Group__21 : rule__Entry__Group__21__Impl rule__Entry__Group__22 ;
    public final void rule__Entry__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1712:1: ( rule__Entry__Group__21__Impl rule__Entry__Group__22 )
            // InternalIGES.g:1713:2: rule__Entry__Group__21__Impl rule__Entry__Group__22
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
    // InternalIGES.g:1720:1: rule__Entry__Group__21__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Entry__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1724:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:1725:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:1725:1: ( RULE_ENDLINE )
            // InternalIGES.g:1726:2: RULE_ENDLINE
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
    // InternalIGES.g:1735:1: rule__Entry__Group__22 : rule__Entry__Group__22__Impl rule__Entry__Group__23 ;
    public final void rule__Entry__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1739:1: ( rule__Entry__Group__22__Impl rule__Entry__Group__23 )
            // InternalIGES.g:1740:2: rule__Entry__Group__22__Impl rule__Entry__Group__23
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
    // InternalIGES.g:1747:1: rule__Entry__Group__22__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1751:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1752:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1752:1: ( ( RULE_WS )? )
            // InternalIGES.g:1753:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_22()); 
            // InternalIGES.g:1754:2: ( RULE_WS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_WS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIGES.g:1754:3: RULE_WS
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
    // InternalIGES.g:1762:1: rule__Entry__Group__23 : rule__Entry__Group__23__Impl rule__Entry__Group__24 ;
    public final void rule__Entry__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1766:1: ( rule__Entry__Group__23__Impl rule__Entry__Group__24 )
            // InternalIGES.g:1767:2: rule__Entry__Group__23__Impl rule__Entry__Group__24
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
    // InternalIGES.g:1774:1: rule__Entry__Group__23__Impl : ( RULE_INT ) ;
    public final void rule__Entry__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1778:1: ( ( RULE_INT ) )
            // InternalIGES.g:1779:1: ( RULE_INT )
            {
            // InternalIGES.g:1779:1: ( RULE_INT )
            // InternalIGES.g:1780:2: RULE_INT
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
    // InternalIGES.g:1789:1: rule__Entry__Group__24 : rule__Entry__Group__24__Impl rule__Entry__Group__25 ;
    public final void rule__Entry__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1793:1: ( rule__Entry__Group__24__Impl rule__Entry__Group__25 )
            // InternalIGES.g:1794:2: rule__Entry__Group__24__Impl rule__Entry__Group__25
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
    // InternalIGES.g:1801:1: rule__Entry__Group__24__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1805:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1806:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1806:1: ( ( RULE_WS )? )
            // InternalIGES.g:1807:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_24()); 
            // InternalIGES.g:1808:2: ( RULE_WS )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_WS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalIGES.g:1808:3: RULE_WS
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
    // InternalIGES.g:1816:1: rule__Entry__Group__25 : rule__Entry__Group__25__Impl rule__Entry__Group__26 ;
    public final void rule__Entry__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1820:1: ( rule__Entry__Group__25__Impl rule__Entry__Group__26 )
            // InternalIGES.g:1821:2: rule__Entry__Group__25__Impl rule__Entry__Group__26
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
    // InternalIGES.g:1828:1: rule__Entry__Group__25__Impl : ( ( rule__Entry__LineWeightAssignment_25 ) ) ;
    public final void rule__Entry__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1832:1: ( ( ( rule__Entry__LineWeightAssignment_25 ) ) )
            // InternalIGES.g:1833:1: ( ( rule__Entry__LineWeightAssignment_25 ) )
            {
            // InternalIGES.g:1833:1: ( ( rule__Entry__LineWeightAssignment_25 ) )
            // InternalIGES.g:1834:2: ( rule__Entry__LineWeightAssignment_25 )
            {
             before(grammarAccess.getEntryAccess().getLineWeightAssignment_25()); 
            // InternalIGES.g:1835:2: ( rule__Entry__LineWeightAssignment_25 )
            // InternalIGES.g:1835:3: rule__Entry__LineWeightAssignment_25
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
    // InternalIGES.g:1843:1: rule__Entry__Group__26 : rule__Entry__Group__26__Impl rule__Entry__Group__27 ;
    public final void rule__Entry__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1847:1: ( rule__Entry__Group__26__Impl rule__Entry__Group__27 )
            // InternalIGES.g:1848:2: rule__Entry__Group__26__Impl rule__Entry__Group__27
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
    // InternalIGES.g:1855:1: rule__Entry__Group__26__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1859:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1860:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1860:1: ( ( RULE_WS )? )
            // InternalIGES.g:1861:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_26()); 
            // InternalIGES.g:1862:2: ( RULE_WS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_WS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIGES.g:1862:3: RULE_WS
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
    // InternalIGES.g:1870:1: rule__Entry__Group__27 : rule__Entry__Group__27__Impl rule__Entry__Group__28 ;
    public final void rule__Entry__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1874:1: ( rule__Entry__Group__27__Impl rule__Entry__Group__28 )
            // InternalIGES.g:1875:2: rule__Entry__Group__27__Impl rule__Entry__Group__28
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
    // InternalIGES.g:1882:1: rule__Entry__Group__27__Impl : ( ( rule__Entry__ColorAssignment_27 ) ) ;
    public final void rule__Entry__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1886:1: ( ( ( rule__Entry__ColorAssignment_27 ) ) )
            // InternalIGES.g:1887:1: ( ( rule__Entry__ColorAssignment_27 ) )
            {
            // InternalIGES.g:1887:1: ( ( rule__Entry__ColorAssignment_27 ) )
            // InternalIGES.g:1888:2: ( rule__Entry__ColorAssignment_27 )
            {
             before(grammarAccess.getEntryAccess().getColorAssignment_27()); 
            // InternalIGES.g:1889:2: ( rule__Entry__ColorAssignment_27 )
            // InternalIGES.g:1889:3: rule__Entry__ColorAssignment_27
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
    // InternalIGES.g:1897:1: rule__Entry__Group__28 : rule__Entry__Group__28__Impl rule__Entry__Group__29 ;
    public final void rule__Entry__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1901:1: ( rule__Entry__Group__28__Impl rule__Entry__Group__29 )
            // InternalIGES.g:1902:2: rule__Entry__Group__28__Impl rule__Entry__Group__29
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
    // InternalIGES.g:1909:1: rule__Entry__Group__28__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1913:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1914:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1914:1: ( ( RULE_WS )? )
            // InternalIGES.g:1915:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_28()); 
            // InternalIGES.g:1916:2: ( RULE_WS )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_WS) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIGES.g:1916:3: RULE_WS
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
    // InternalIGES.g:1924:1: rule__Entry__Group__29 : rule__Entry__Group__29__Impl rule__Entry__Group__30 ;
    public final void rule__Entry__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1928:1: ( rule__Entry__Group__29__Impl rule__Entry__Group__30 )
            // InternalIGES.g:1929:2: rule__Entry__Group__29__Impl rule__Entry__Group__30
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
    // InternalIGES.g:1936:1: rule__Entry__Group__29__Impl : ( ( rule__Entry__ParamLinesAssignment_29 ) ) ;
    public final void rule__Entry__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1940:1: ( ( ( rule__Entry__ParamLinesAssignment_29 ) ) )
            // InternalIGES.g:1941:1: ( ( rule__Entry__ParamLinesAssignment_29 ) )
            {
            // InternalIGES.g:1941:1: ( ( rule__Entry__ParamLinesAssignment_29 ) )
            // InternalIGES.g:1942:2: ( rule__Entry__ParamLinesAssignment_29 )
            {
             before(grammarAccess.getEntryAccess().getParamLinesAssignment_29()); 
            // InternalIGES.g:1943:2: ( rule__Entry__ParamLinesAssignment_29 )
            // InternalIGES.g:1943:3: rule__Entry__ParamLinesAssignment_29
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
    // InternalIGES.g:1951:1: rule__Entry__Group__30 : rule__Entry__Group__30__Impl rule__Entry__Group__31 ;
    public final void rule__Entry__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1955:1: ( rule__Entry__Group__30__Impl rule__Entry__Group__31 )
            // InternalIGES.g:1956:2: rule__Entry__Group__30__Impl rule__Entry__Group__31
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
    // InternalIGES.g:1963:1: rule__Entry__Group__30__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1967:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:1968:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:1968:1: ( ( RULE_WS )? )
            // InternalIGES.g:1969:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_30()); 
            // InternalIGES.g:1970:2: ( RULE_WS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_WS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalIGES.g:1970:3: RULE_WS
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
    // InternalIGES.g:1978:1: rule__Entry__Group__31 : rule__Entry__Group__31__Impl rule__Entry__Group__32 ;
    public final void rule__Entry__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1982:1: ( rule__Entry__Group__31__Impl rule__Entry__Group__32 )
            // InternalIGES.g:1983:2: rule__Entry__Group__31__Impl rule__Entry__Group__32
            {
            pushFollow(FOLLOW_17);
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
    // InternalIGES.g:1990:1: rule__Entry__Group__31__Impl : ( ( rule__Entry__FormAssignment_31 ) ) ;
    public final void rule__Entry__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:1994:1: ( ( ( rule__Entry__FormAssignment_31 ) ) )
            // InternalIGES.g:1995:1: ( ( rule__Entry__FormAssignment_31 ) )
            {
            // InternalIGES.g:1995:1: ( ( rule__Entry__FormAssignment_31 ) )
            // InternalIGES.g:1996:2: ( rule__Entry__FormAssignment_31 )
            {
             before(grammarAccess.getEntryAccess().getFormAssignment_31()); 
            // InternalIGES.g:1997:2: ( rule__Entry__FormAssignment_31 )
            // InternalIGES.g:1997:3: rule__Entry__FormAssignment_31
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
    // InternalIGES.g:2005:1: rule__Entry__Group__32 : rule__Entry__Group__32__Impl rule__Entry__Group__33 ;
    public final void rule__Entry__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2009:1: ( rule__Entry__Group__32__Impl rule__Entry__Group__33 )
            // InternalIGES.g:2010:2: rule__Entry__Group__32__Impl rule__Entry__Group__33
            {
            pushFollow(FOLLOW_17);
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
    // InternalIGES.g:2017:1: rule__Entry__Group__32__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2021:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2022:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2022:1: ( ( RULE_WS )? )
            // InternalIGES.g:2023:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_32()); 
            // InternalIGES.g:2024:2: ( RULE_WS )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_WS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalIGES.g:2024:3: RULE_WS
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
    // InternalIGES.g:2032:1: rule__Entry__Group__33 : rule__Entry__Group__33__Impl rule__Entry__Group__34 ;
    public final void rule__Entry__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2036:1: ( rule__Entry__Group__33__Impl rule__Entry__Group__34 )
            // InternalIGES.g:2037:2: rule__Entry__Group__33__Impl rule__Entry__Group__34
            {
            pushFollow(FOLLOW_17);
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
    // InternalIGES.g:2044:1: rule__Entry__Group__33__Impl : ( ( rule__Entry__Group_33__0 )? ) ;
    public final void rule__Entry__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2048:1: ( ( ( rule__Entry__Group_33__0 )? ) )
            // InternalIGES.g:2049:1: ( ( rule__Entry__Group_33__0 )? )
            {
            // InternalIGES.g:2049:1: ( ( rule__Entry__Group_33__0 )? )
            // InternalIGES.g:2050:2: ( rule__Entry__Group_33__0 )?
            {
             before(grammarAccess.getEntryAccess().getGroup_33()); 
            // InternalIGES.g:2051:2: ( rule__Entry__Group_33__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIGES.g:2051:3: rule__Entry__Group_33__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entry__Group_33__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getGroup_33()); 

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
    // InternalIGES.g:2059:1: rule__Entry__Group__34 : rule__Entry__Group__34__Impl rule__Entry__Group__35 ;
    public final void rule__Entry__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2063:1: ( rule__Entry__Group__34__Impl rule__Entry__Group__35 )
            // InternalIGES.g:2064:2: rule__Entry__Group__34__Impl rule__Entry__Group__35
            {
            pushFollow(FOLLOW_17);
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
    // InternalIGES.g:2071:1: rule__Entry__Group__34__Impl : ( ( rule__Entry__Group_34__0 )? ) ;
    public final void rule__Entry__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2075:1: ( ( ( rule__Entry__Group_34__0 )? ) )
            // InternalIGES.g:2076:1: ( ( rule__Entry__Group_34__0 )? )
            {
            // InternalIGES.g:2076:1: ( ( rule__Entry__Group_34__0 )? )
            // InternalIGES.g:2077:2: ( rule__Entry__Group_34__0 )?
            {
             before(grammarAccess.getEntryAccess().getGroup_34()); 
            // InternalIGES.g:2078:2: ( rule__Entry__Group_34__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalIGES.g:2078:3: rule__Entry__Group_34__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entry__Group_34__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getGroup_34()); 

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
    // InternalIGES.g:2086:1: rule__Entry__Group__35 : rule__Entry__Group__35__Impl rule__Entry__Group__36 ;
    public final void rule__Entry__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2090:1: ( rule__Entry__Group__35__Impl rule__Entry__Group__36 )
            // InternalIGES.g:2091:2: rule__Entry__Group__35__Impl rule__Entry__Group__36
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
    // InternalIGES.g:2098:1: rule__Entry__Group__35__Impl : ( ( rule__Entry__Alternatives_35 )? ) ;
    public final void rule__Entry__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2102:1: ( ( ( rule__Entry__Alternatives_35 )? ) )
            // InternalIGES.g:2103:1: ( ( rule__Entry__Alternatives_35 )? )
            {
            // InternalIGES.g:2103:1: ( ( rule__Entry__Alternatives_35 )? )
            // InternalIGES.g:2104:2: ( rule__Entry__Alternatives_35 )?
            {
             before(grammarAccess.getEntryAccess().getAlternatives_35()); 
            // InternalIGES.g:2105:2: ( rule__Entry__Alternatives_35 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIGES.g:2105:3: rule__Entry__Alternatives_35
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entry__Alternatives_35();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getAlternatives_35()); 

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
    // InternalIGES.g:2113:1: rule__Entry__Group__36 : rule__Entry__Group__36__Impl rule__Entry__Group__37 ;
    public final void rule__Entry__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2117:1: ( rule__Entry__Group__36__Impl rule__Entry__Group__37 )
            // InternalIGES.g:2118:2: rule__Entry__Group__36__Impl rule__Entry__Group__37
            {
            pushFollow(FOLLOW_17);
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
    // InternalIGES.g:2125:1: rule__Entry__Group__36__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2129:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2130:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2130:1: ( ( RULE_WS )? )
            // InternalIGES.g:2131:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_36()); 
            // InternalIGES.g:2132:2: ( RULE_WS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_WS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIGES.g:2132:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_36()); 

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
    // InternalIGES.g:2140:1: rule__Entry__Group__37 : rule__Entry__Group__37__Impl rule__Entry__Group__38 ;
    public final void rule__Entry__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2144:1: ( rule__Entry__Group__37__Impl rule__Entry__Group__38 )
            // InternalIGES.g:2145:2: rule__Entry__Group__37__Impl rule__Entry__Group__38
            {
            pushFollow(FOLLOW_17);
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
    // InternalIGES.g:2152:1: rule__Entry__Group__37__Impl : ( ( rule__Entry__SubNumAssignment_37 )? ) ;
    public final void rule__Entry__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2156:1: ( ( ( rule__Entry__SubNumAssignment_37 )? ) )
            // InternalIGES.g:2157:1: ( ( rule__Entry__SubNumAssignment_37 )? )
            {
            // InternalIGES.g:2157:1: ( ( rule__Entry__SubNumAssignment_37 )? )
            // InternalIGES.g:2158:2: ( rule__Entry__SubNumAssignment_37 )?
            {
             before(grammarAccess.getEntryAccess().getSubNumAssignment_37()); 
            // InternalIGES.g:2159:2: ( rule__Entry__SubNumAssignment_37 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIGES.g:2159:3: rule__Entry__SubNumAssignment_37
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entry__SubNumAssignment_37();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getSubNumAssignment_37()); 

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
    // InternalIGES.g:2167:1: rule__Entry__Group__38 : rule__Entry__Group__38__Impl rule__Entry__Group__39 ;
    public final void rule__Entry__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2171:1: ( rule__Entry__Group__38__Impl rule__Entry__Group__39 )
            // InternalIGES.g:2172:2: rule__Entry__Group__38__Impl rule__Entry__Group__39
            {
            pushFollow(FOLLOW_14);
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
    // InternalIGES.g:2179:1: rule__Entry__Group__38__Impl : ( 'D' ) ;
    public final void rule__Entry__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2183:1: ( ( 'D' ) )
            // InternalIGES.g:2184:1: ( 'D' )
            {
            // InternalIGES.g:2184:1: ( 'D' )
            // InternalIGES.g:2185:2: 'D'
            {
             before(grammarAccess.getEntryAccess().getDKeyword_38()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getDKeyword_38()); 

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
    // InternalIGES.g:2194:1: rule__Entry__Group__39 : rule__Entry__Group__39__Impl rule__Entry__Group__40 ;
    public final void rule__Entry__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2198:1: ( rule__Entry__Group__39__Impl rule__Entry__Group__40 )
            // InternalIGES.g:2199:2: rule__Entry__Group__39__Impl rule__Entry__Group__40
            {
            pushFollow(FOLLOW_14);
            rule__Entry__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__40();

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
    // InternalIGES.g:2206:1: rule__Entry__Group__39__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2210:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2211:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2211:1: ( ( RULE_WS )? )
            // InternalIGES.g:2212:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_39()); 
            // InternalIGES.g:2213:2: ( RULE_WS )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_WS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalIGES.g:2213:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_39()); 

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


    // $ANTLR start "rule__Entry__Group__40"
    // InternalIGES.g:2221:1: rule__Entry__Group__40 : rule__Entry__Group__40__Impl rule__Entry__Group__41 ;
    public final void rule__Entry__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2225:1: ( rule__Entry__Group__40__Impl rule__Entry__Group__41 )
            // InternalIGES.g:2226:2: rule__Entry__Group__40__Impl rule__Entry__Group__41
            {
            pushFollow(FOLLOW_15);
            rule__Entry__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group__41();

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
    // $ANTLR end "rule__Entry__Group__40"


    // $ANTLR start "rule__Entry__Group__40__Impl"
    // InternalIGES.g:2233:1: rule__Entry__Group__40__Impl : ( RULE_INT ) ;
    public final void rule__Entry__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2237:1: ( ( RULE_INT ) )
            // InternalIGES.g:2238:1: ( RULE_INT )
            {
            // InternalIGES.g:2238:1: ( RULE_INT )
            // InternalIGES.g:2239:2: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_40()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getINTTerminalRuleCall_40()); 

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
    // $ANTLR end "rule__Entry__Group__40__Impl"


    // $ANTLR start "rule__Entry__Group__41"
    // InternalIGES.g:2248:1: rule__Entry__Group__41 : rule__Entry__Group__41__Impl ;
    public final void rule__Entry__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2252:1: ( rule__Entry__Group__41__Impl )
            // InternalIGES.g:2253:2: rule__Entry__Group__41__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group__41__Impl();

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
    // $ANTLR end "rule__Entry__Group__41"


    // $ANTLR start "rule__Entry__Group__41__Impl"
    // InternalIGES.g:2259:1: rule__Entry__Group__41__Impl : ( RULE_ENDLINE ) ;
    public final void rule__Entry__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2263:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:2264:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:2264:1: ( RULE_ENDLINE )
            // InternalIGES.g:2265:2: RULE_ENDLINE
            {
             before(grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_41()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_41()); 

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
    // $ANTLR end "rule__Entry__Group__41__Impl"


    // $ANTLR start "rule__Entry__Group_33__0"
    // InternalIGES.g:2275:1: rule__Entry__Group_33__0 : rule__Entry__Group_33__0__Impl rule__Entry__Group_33__1 ;
    public final void rule__Entry__Group_33__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2279:1: ( rule__Entry__Group_33__0__Impl rule__Entry__Group_33__1 )
            // InternalIGES.g:2280:2: rule__Entry__Group_33__0__Impl rule__Entry__Group_33__1
            {
            pushFollow(FOLLOW_7);
            rule__Entry__Group_33__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group_33__1();

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
    // $ANTLR end "rule__Entry__Group_33__0"


    // $ANTLR start "rule__Entry__Group_33__0__Impl"
    // InternalIGES.g:2287:1: rule__Entry__Group_33__0__Impl : ( RULE_INT ) ;
    public final void rule__Entry__Group_33__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2291:1: ( ( RULE_INT ) )
            // InternalIGES.g:2292:1: ( RULE_INT )
            {
            // InternalIGES.g:2292:1: ( RULE_INT )
            // InternalIGES.g:2293:2: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_33_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getINTTerminalRuleCall_33_0()); 

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
    // $ANTLR end "rule__Entry__Group_33__0__Impl"


    // $ANTLR start "rule__Entry__Group_33__1"
    // InternalIGES.g:2302:1: rule__Entry__Group_33__1 : rule__Entry__Group_33__1__Impl ;
    public final void rule__Entry__Group_33__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2306:1: ( rule__Entry__Group_33__1__Impl )
            // InternalIGES.g:2307:2: rule__Entry__Group_33__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group_33__1__Impl();

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
    // $ANTLR end "rule__Entry__Group_33__1"


    // $ANTLR start "rule__Entry__Group_33__1__Impl"
    // InternalIGES.g:2313:1: rule__Entry__Group_33__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group_33__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2317:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2318:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2318:1: ( ( RULE_WS )? )
            // InternalIGES.g:2319:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_33_1()); 
            // InternalIGES.g:2320:2: ( RULE_WS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_WS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalIGES.g:2320:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_33_1()); 

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
    // $ANTLR end "rule__Entry__Group_33__1__Impl"


    // $ANTLR start "rule__Entry__Group_34__0"
    // InternalIGES.g:2329:1: rule__Entry__Group_34__0 : rule__Entry__Group_34__0__Impl rule__Entry__Group_34__1 ;
    public final void rule__Entry__Group_34__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2333:1: ( rule__Entry__Group_34__0__Impl rule__Entry__Group_34__1 )
            // InternalIGES.g:2334:2: rule__Entry__Group_34__0__Impl rule__Entry__Group_34__1
            {
            pushFollow(FOLLOW_7);
            rule__Entry__Group_34__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entry__Group_34__1();

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
    // $ANTLR end "rule__Entry__Group_34__0"


    // $ANTLR start "rule__Entry__Group_34__0__Impl"
    // InternalIGES.g:2341:1: rule__Entry__Group_34__0__Impl : ( RULE_INT ) ;
    public final void rule__Entry__Group_34__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2345:1: ( ( RULE_INT ) )
            // InternalIGES.g:2346:1: ( RULE_INT )
            {
            // InternalIGES.g:2346:1: ( RULE_INT )
            // InternalIGES.g:2347:2: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getINTTerminalRuleCall_34_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getINTTerminalRuleCall_34_0()); 

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
    // $ANTLR end "rule__Entry__Group_34__0__Impl"


    // $ANTLR start "rule__Entry__Group_34__1"
    // InternalIGES.g:2356:1: rule__Entry__Group_34__1 : rule__Entry__Group_34__1__Impl ;
    public final void rule__Entry__Group_34__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2360:1: ( rule__Entry__Group_34__1__Impl )
            // InternalIGES.g:2361:2: rule__Entry__Group_34__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entry__Group_34__1__Impl();

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
    // $ANTLR end "rule__Entry__Group_34__1"


    // $ANTLR start "rule__Entry__Group_34__1__Impl"
    // InternalIGES.g:2367:1: rule__Entry__Group_34__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__Entry__Group_34__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2371:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2372:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2372:1: ( ( RULE_WS )? )
            // InternalIGES.g:2373:2: ( RULE_WS )?
            {
             before(grammarAccess.getEntryAccess().getWSTerminalRuleCall_34_1()); 
            // InternalIGES.g:2374:2: ( RULE_WS )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_WS) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalIGES.g:2374:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntryAccess().getWSTerminalRuleCall_34_1()); 

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
    // $ANTLR end "rule__Entry__Group_34__1__Impl"


    // $ANTLR start "rule__PEntry__Group__0"
    // InternalIGES.g:2383:1: rule__PEntry__Group__0 : rule__PEntry__Group__0__Impl rule__PEntry__Group__1 ;
    public final void rule__PEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2387:1: ( rule__PEntry__Group__0__Impl rule__PEntry__Group__1 )
            // InternalIGES.g:2388:2: rule__PEntry__Group__0__Impl rule__PEntry__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalIGES.g:2395:1: rule__PEntry__Group__0__Impl : ( ( rule__PEntry__TypeAssignment_0 ) ) ;
    public final void rule__PEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2399:1: ( ( ( rule__PEntry__TypeAssignment_0 ) ) )
            // InternalIGES.g:2400:1: ( ( rule__PEntry__TypeAssignment_0 ) )
            {
            // InternalIGES.g:2400:1: ( ( rule__PEntry__TypeAssignment_0 ) )
            // InternalIGES.g:2401:2: ( rule__PEntry__TypeAssignment_0 )
            {
             before(grammarAccess.getPEntryAccess().getTypeAssignment_0()); 
            // InternalIGES.g:2402:2: ( rule__PEntry__TypeAssignment_0 )
            // InternalIGES.g:2402:3: rule__PEntry__TypeAssignment_0
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
    // InternalIGES.g:2410:1: rule__PEntry__Group__1 : rule__PEntry__Group__1__Impl rule__PEntry__Group__2 ;
    public final void rule__PEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2414:1: ( rule__PEntry__Group__1__Impl rule__PEntry__Group__2 )
            // InternalIGES.g:2415:2: rule__PEntry__Group__1__Impl rule__PEntry__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalIGES.g:2422:1: rule__PEntry__Group__1__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__PEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2426:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:2427:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:2427:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:2428:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getPEntryAccess().getDELIMITERTerminalRuleCall_1()); 
            // InternalIGES.g:2429:2: ( RULE_DELIMITER )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DELIMITER) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalIGES.g:2429:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPEntryAccess().getDELIMITERTerminalRuleCall_1()); 

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
    // InternalIGES.g:2437:1: rule__PEntry__Group__2 : rule__PEntry__Group__2__Impl rule__PEntry__Group__3 ;
    public final void rule__PEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2441:1: ( rule__PEntry__Group__2__Impl rule__PEntry__Group__3 )
            // InternalIGES.g:2442:2: rule__PEntry__Group__2__Impl rule__PEntry__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalIGES.g:2449:1: rule__PEntry__Group__2__Impl : ( ( rule__PEntry__ValuesAssignment_2 )* ) ;
    public final void rule__PEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2453:1: ( ( ( rule__PEntry__ValuesAssignment_2 )* ) )
            // InternalIGES.g:2454:1: ( ( rule__PEntry__ValuesAssignment_2 )* )
            {
            // InternalIGES.g:2454:1: ( ( rule__PEntry__ValuesAssignment_2 )* )
            // InternalIGES.g:2455:2: ( rule__PEntry__ValuesAssignment_2 )*
            {
             before(grammarAccess.getPEntryAccess().getValuesAssignment_2()); 
            // InternalIGES.g:2456:2: ( rule__PEntry__ValuesAssignment_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_INT||(LA43_0>=RULE_HOLLERITH && LA43_0<=RULE_DOUBLE)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalIGES.g:2456:3: rule__PEntry__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PEntry__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getPEntryAccess().getValuesAssignment_2()); 

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
    // InternalIGES.g:2464:1: rule__PEntry__Group__3 : rule__PEntry__Group__3__Impl rule__PEntry__Group__4 ;
    public final void rule__PEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2468:1: ( rule__PEntry__Group__3__Impl rule__PEntry__Group__4 )
            // InternalIGES.g:2469:2: rule__PEntry__Group__3__Impl rule__PEntry__Group__4
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
    // InternalIGES.g:2476:1: rule__PEntry__Group__3__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__PEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2480:1: ( ( RULE_SEPARATOR ) )
            // InternalIGES.g:2481:1: ( RULE_SEPARATOR )
            {
            // InternalIGES.g:2481:1: ( RULE_SEPARATOR )
            // InternalIGES.g:2482:2: RULE_SEPARATOR
            {
             before(grammarAccess.getPEntryAccess().getSEPARATORTerminalRuleCall_3()); 
            match(input,RULE_SEPARATOR,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getSEPARATORTerminalRuleCall_3()); 

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
    // InternalIGES.g:2491:1: rule__PEntry__Group__4 : rule__PEntry__Group__4__Impl rule__PEntry__Group__5 ;
    public final void rule__PEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2495:1: ( rule__PEntry__Group__4__Impl rule__PEntry__Group__5 )
            // InternalIGES.g:2496:2: rule__PEntry__Group__4__Impl rule__PEntry__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalIGES.g:2503:1: rule__PEntry__Group__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2507:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2508:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2508:1: ( ( RULE_WS )? )
            // InternalIGES.g:2509:2: ( RULE_WS )?
            {
             before(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_4()); 
            // InternalIGES.g:2510:2: ( RULE_WS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_WS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalIGES.g:2510:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_4()); 

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
    // InternalIGES.g:2518:1: rule__PEntry__Group__5 : rule__PEntry__Group__5__Impl rule__PEntry__Group__6 ;
    public final void rule__PEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2522:1: ( rule__PEntry__Group__5__Impl rule__PEntry__Group__6 )
            // InternalIGES.g:2523:2: rule__PEntry__Group__5__Impl rule__PEntry__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalIGES.g:2530:1: rule__PEntry__Group__5__Impl : ( ( rule__PEntry__DIndexAssignment_5 ) ) ;
    public final void rule__PEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2534:1: ( ( ( rule__PEntry__DIndexAssignment_5 ) ) )
            // InternalIGES.g:2535:1: ( ( rule__PEntry__DIndexAssignment_5 ) )
            {
            // InternalIGES.g:2535:1: ( ( rule__PEntry__DIndexAssignment_5 ) )
            // InternalIGES.g:2536:2: ( rule__PEntry__DIndexAssignment_5 )
            {
             before(grammarAccess.getPEntryAccess().getDIndexAssignment_5()); 
            // InternalIGES.g:2537:2: ( rule__PEntry__DIndexAssignment_5 )
            // InternalIGES.g:2537:3: rule__PEntry__DIndexAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__DIndexAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPEntryAccess().getDIndexAssignment_5()); 

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
    // InternalIGES.g:2545:1: rule__PEntry__Group__6 : rule__PEntry__Group__6__Impl rule__PEntry__Group__7 ;
    public final void rule__PEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2549:1: ( rule__PEntry__Group__6__Impl rule__PEntry__Group__7 )
            // InternalIGES.g:2550:2: rule__PEntry__Group__6__Impl rule__PEntry__Group__7
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
    // InternalIGES.g:2557:1: rule__PEntry__Group__6__Impl : ( 'P' ) ;
    public final void rule__PEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2561:1: ( ( 'P' ) )
            // InternalIGES.g:2562:1: ( 'P' )
            {
            // InternalIGES.g:2562:1: ( 'P' )
            // InternalIGES.g:2563:2: 'P'
            {
             before(grammarAccess.getPEntryAccess().getPKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getPKeyword_6()); 

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
    // InternalIGES.g:2572:1: rule__PEntry__Group__7 : rule__PEntry__Group__7__Impl rule__PEntry__Group__8 ;
    public final void rule__PEntry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2576:1: ( rule__PEntry__Group__7__Impl rule__PEntry__Group__8 )
            // InternalIGES.g:2577:2: rule__PEntry__Group__7__Impl rule__PEntry__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalIGES.g:2584:1: rule__PEntry__Group__7__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PEntry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2588:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2589:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2589:1: ( ( RULE_WS )? )
            // InternalIGES.g:2590:2: ( RULE_WS )?
            {
             before(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_7()); 
            // InternalIGES.g:2591:2: ( RULE_WS )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_WS) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalIGES.g:2591:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPEntryAccess().getWSTerminalRuleCall_7()); 

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
    // InternalIGES.g:2599:1: rule__PEntry__Group__8 : rule__PEntry__Group__8__Impl rule__PEntry__Group__9 ;
    public final void rule__PEntry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2603:1: ( rule__PEntry__Group__8__Impl rule__PEntry__Group__9 )
            // InternalIGES.g:2604:2: rule__PEntry__Group__8__Impl rule__PEntry__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__PEntry__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PEntry__Group__9();

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
    // InternalIGES.g:2611:1: rule__PEntry__Group__8__Impl : ( ( rule__PEntry__IndiciesAssignment_8 ) ) ;
    public final void rule__PEntry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2615:1: ( ( ( rule__PEntry__IndiciesAssignment_8 ) ) )
            // InternalIGES.g:2616:1: ( ( rule__PEntry__IndiciesAssignment_8 ) )
            {
            // InternalIGES.g:2616:1: ( ( rule__PEntry__IndiciesAssignment_8 ) )
            // InternalIGES.g:2617:2: ( rule__PEntry__IndiciesAssignment_8 )
            {
             before(grammarAccess.getPEntryAccess().getIndiciesAssignment_8()); 
            // InternalIGES.g:2618:2: ( rule__PEntry__IndiciesAssignment_8 )
            // InternalIGES.g:2618:3: rule__PEntry__IndiciesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__IndiciesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPEntryAccess().getIndiciesAssignment_8()); 

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


    // $ANTLR start "rule__PEntry__Group__9"
    // InternalIGES.g:2626:1: rule__PEntry__Group__9 : rule__PEntry__Group__9__Impl ;
    public final void rule__PEntry__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2630:1: ( rule__PEntry__Group__9__Impl )
            // InternalIGES.g:2631:2: rule__PEntry__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PEntry__Group__9__Impl();

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
    // $ANTLR end "rule__PEntry__Group__9"


    // $ANTLR start "rule__PEntry__Group__9__Impl"
    // InternalIGES.g:2637:1: rule__PEntry__Group__9__Impl : ( RULE_ENDLINE ) ;
    public final void rule__PEntry__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2641:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:2642:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:2642:1: ( RULE_ENDLINE )
            // InternalIGES.g:2643:2: RULE_ENDLINE
            {
             before(grammarAccess.getPEntryAccess().getENDLINETerminalRuleCall_9()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getENDLINETerminalRuleCall_9()); 

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
    // $ANTLR end "rule__PEntry__Group__9__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__0"
    // InternalIGES.g:2653:1: rule__PMultiEntry__Group__0 : rule__PMultiEntry__Group__0__Impl rule__PMultiEntry__Group__1 ;
    public final void rule__PMultiEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2657:1: ( rule__PMultiEntry__Group__0__Impl rule__PMultiEntry__Group__1 )
            // InternalIGES.g:2658:2: rule__PMultiEntry__Group__0__Impl rule__PMultiEntry__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalIGES.g:2665:1: rule__PMultiEntry__Group__0__Impl : ( ( rule__PMultiEntry__TypeAssignment_0 ) ) ;
    public final void rule__PMultiEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2669:1: ( ( ( rule__PMultiEntry__TypeAssignment_0 ) ) )
            // InternalIGES.g:2670:1: ( ( rule__PMultiEntry__TypeAssignment_0 ) )
            {
            // InternalIGES.g:2670:1: ( ( rule__PMultiEntry__TypeAssignment_0 ) )
            // InternalIGES.g:2671:2: ( rule__PMultiEntry__TypeAssignment_0 )
            {
             before(grammarAccess.getPMultiEntryAccess().getTypeAssignment_0()); 
            // InternalIGES.g:2672:2: ( rule__PMultiEntry__TypeAssignment_0 )
            // InternalIGES.g:2672:3: rule__PMultiEntry__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getTypeAssignment_0()); 

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
    // InternalIGES.g:2680:1: rule__PMultiEntry__Group__1 : rule__PMultiEntry__Group__1__Impl rule__PMultiEntry__Group__2 ;
    public final void rule__PMultiEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2684:1: ( rule__PMultiEntry__Group__1__Impl rule__PMultiEntry__Group__2 )
            // InternalIGES.g:2685:2: rule__PMultiEntry__Group__1__Impl rule__PMultiEntry__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalIGES.g:2692:1: rule__PMultiEntry__Group__1__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__PMultiEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2696:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:2697:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:2697:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:2698:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getPMultiEntryAccess().getDELIMITERTerminalRuleCall_1()); 
            // InternalIGES.g:2699:2: ( RULE_DELIMITER )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_DELIMITER) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalIGES.g:2699:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getDELIMITERTerminalRuleCall_1()); 

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
    // InternalIGES.g:2707:1: rule__PMultiEntry__Group__2 : rule__PMultiEntry__Group__2__Impl rule__PMultiEntry__Group__3 ;
    public final void rule__PMultiEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2711:1: ( rule__PMultiEntry__Group__2__Impl rule__PMultiEntry__Group__3 )
            // InternalIGES.g:2712:2: rule__PMultiEntry__Group__2__Impl rule__PMultiEntry__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalIGES.g:2719:1: rule__PMultiEntry__Group__2__Impl : ( ( ( rule__PMultiEntry__Group_2__0 ) ) ( ( rule__PMultiEntry__Group_2__0 )* ) ) ;
    public final void rule__PMultiEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2723:1: ( ( ( ( rule__PMultiEntry__Group_2__0 ) ) ( ( rule__PMultiEntry__Group_2__0 )* ) ) )
            // InternalIGES.g:2724:1: ( ( ( rule__PMultiEntry__Group_2__0 ) ) ( ( rule__PMultiEntry__Group_2__0 )* ) )
            {
            // InternalIGES.g:2724:1: ( ( ( rule__PMultiEntry__Group_2__0 ) ) ( ( rule__PMultiEntry__Group_2__0 )* ) )
            // InternalIGES.g:2725:2: ( ( rule__PMultiEntry__Group_2__0 ) ) ( ( rule__PMultiEntry__Group_2__0 )* )
            {
            // InternalIGES.g:2725:2: ( ( rule__PMultiEntry__Group_2__0 ) )
            // InternalIGES.g:2726:3: ( rule__PMultiEntry__Group_2__0 )
            {
             before(grammarAccess.getPMultiEntryAccess().getGroup_2()); 
            // InternalIGES.g:2727:3: ( rule__PMultiEntry__Group_2__0 )
            // InternalIGES.g:2727:4: rule__PMultiEntry__Group_2__0
            {
            pushFollow(FOLLOW_21);
            rule__PMultiEntry__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getGroup_2()); 

            }

            // InternalIGES.g:2730:2: ( ( rule__PMultiEntry__Group_2__0 )* )
            // InternalIGES.g:2731:3: ( rule__PMultiEntry__Group_2__0 )*
            {
             before(grammarAccess.getPMultiEntryAccess().getGroup_2()); 
            // InternalIGES.g:2732:3: ( rule__PMultiEntry__Group_2__0 )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // InternalIGES.g:2732:4: rule__PMultiEntry__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PMultiEntry__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getPMultiEntryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PMultiEntry__Group__2__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__3"
    // InternalIGES.g:2741:1: rule__PMultiEntry__Group__3 : rule__PMultiEntry__Group__3__Impl rule__PMultiEntry__Group__4 ;
    public final void rule__PMultiEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2745:1: ( rule__PMultiEntry__Group__3__Impl rule__PMultiEntry__Group__4 )
            // InternalIGES.g:2746:2: rule__PMultiEntry__Group__3__Impl rule__PMultiEntry__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalIGES.g:2753:1: rule__PMultiEntry__Group__3__Impl : ( ( rule__PMultiEntry__ValuesAssignment_3 )* ) ;
    public final void rule__PMultiEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2757:1: ( ( ( rule__PMultiEntry__ValuesAssignment_3 )* ) )
            // InternalIGES.g:2758:1: ( ( rule__PMultiEntry__ValuesAssignment_3 )* )
            {
            // InternalIGES.g:2758:1: ( ( rule__PMultiEntry__ValuesAssignment_3 )* )
            // InternalIGES.g:2759:2: ( rule__PMultiEntry__ValuesAssignment_3 )*
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesAssignment_3()); 
            // InternalIGES.g:2760:2: ( rule__PMultiEntry__ValuesAssignment_3 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_INT||(LA48_0>=RULE_HOLLERITH && LA48_0<=RULE_DOUBLE)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalIGES.g:2760:3: rule__PMultiEntry__ValuesAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PMultiEntry__ValuesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getPMultiEntryAccess().getValuesAssignment_3()); 

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
    // InternalIGES.g:2768:1: rule__PMultiEntry__Group__4 : rule__PMultiEntry__Group__4__Impl rule__PMultiEntry__Group__5 ;
    public final void rule__PMultiEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2772:1: ( rule__PMultiEntry__Group__4__Impl rule__PMultiEntry__Group__5 )
            // InternalIGES.g:2773:2: rule__PMultiEntry__Group__4__Impl rule__PMultiEntry__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalIGES.g:2780:1: rule__PMultiEntry__Group__4__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__PMultiEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2784:1: ( ( RULE_SEPARATOR ) )
            // InternalIGES.g:2785:1: ( RULE_SEPARATOR )
            {
            // InternalIGES.g:2785:1: ( RULE_SEPARATOR )
            // InternalIGES.g:2786:2: RULE_SEPARATOR
            {
             before(grammarAccess.getPMultiEntryAccess().getSEPARATORTerminalRuleCall_4()); 
            match(input,RULE_SEPARATOR,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getSEPARATORTerminalRuleCall_4()); 

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
    // InternalIGES.g:2795:1: rule__PMultiEntry__Group__5 : rule__PMultiEntry__Group__5__Impl rule__PMultiEntry__Group__6 ;
    public final void rule__PMultiEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2799:1: ( rule__PMultiEntry__Group__5__Impl rule__PMultiEntry__Group__6 )
            // InternalIGES.g:2800:2: rule__PMultiEntry__Group__5__Impl rule__PMultiEntry__Group__6
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
    // InternalIGES.g:2807:1: rule__PMultiEntry__Group__5__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2811:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2812:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2812:1: ( ( RULE_WS )? )
            // InternalIGES.g:2813:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_5()); 
            // InternalIGES.g:2814:2: ( RULE_WS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_WS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalIGES.g:2814:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_5()); 

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
    // InternalIGES.g:2822:1: rule__PMultiEntry__Group__6 : rule__PMultiEntry__Group__6__Impl rule__PMultiEntry__Group__7 ;
    public final void rule__PMultiEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2826:1: ( rule__PMultiEntry__Group__6__Impl rule__PMultiEntry__Group__7 )
            // InternalIGES.g:2827:2: rule__PMultiEntry__Group__6__Impl rule__PMultiEntry__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalIGES.g:2834:1: rule__PMultiEntry__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__PMultiEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2838:1: ( ( RULE_INT ) )
            // InternalIGES.g:2839:1: ( RULE_INT )
            {
            // InternalIGES.g:2839:1: ( RULE_INT )
            // InternalIGES.g:2840:2: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_6()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_6()); 

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
    // InternalIGES.g:2849:1: rule__PMultiEntry__Group__7 : rule__PMultiEntry__Group__7__Impl rule__PMultiEntry__Group__8 ;
    public final void rule__PMultiEntry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2853:1: ( rule__PMultiEntry__Group__7__Impl rule__PMultiEntry__Group__8 )
            // InternalIGES.g:2854:2: rule__PMultiEntry__Group__7__Impl rule__PMultiEntry__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalIGES.g:2861:1: rule__PMultiEntry__Group__7__Impl : ( 'P' ) ;
    public final void rule__PMultiEntry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2865:1: ( ( 'P' ) )
            // InternalIGES.g:2866:1: ( 'P' )
            {
            // InternalIGES.g:2866:1: ( 'P' )
            // InternalIGES.g:2867:2: 'P'
            {
             before(grammarAccess.getPMultiEntryAccess().getPKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getPKeyword_7()); 

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
    // InternalIGES.g:2876:1: rule__PMultiEntry__Group__8 : rule__PMultiEntry__Group__8__Impl rule__PMultiEntry__Group__9 ;
    public final void rule__PMultiEntry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2880:1: ( rule__PMultiEntry__Group__8__Impl rule__PMultiEntry__Group__9 )
            // InternalIGES.g:2881:2: rule__PMultiEntry__Group__8__Impl rule__PMultiEntry__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__9();

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
    // InternalIGES.g:2888:1: rule__PMultiEntry__Group__8__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2892:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:2893:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:2893:1: ( ( RULE_WS )? )
            // InternalIGES.g:2894:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_8()); 
            // InternalIGES.g:2895:2: ( RULE_WS )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_WS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalIGES.g:2895:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_8()); 

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


    // $ANTLR start "rule__PMultiEntry__Group__9"
    // InternalIGES.g:2903:1: rule__PMultiEntry__Group__9 : rule__PMultiEntry__Group__9__Impl rule__PMultiEntry__Group__10 ;
    public final void rule__PMultiEntry__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2907:1: ( rule__PMultiEntry__Group__9__Impl rule__PMultiEntry__Group__10 )
            // InternalIGES.g:2908:2: rule__PMultiEntry__Group__9__Impl rule__PMultiEntry__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__PMultiEntry__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__10();

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
    // $ANTLR end "rule__PMultiEntry__Group__9"


    // $ANTLR start "rule__PMultiEntry__Group__9__Impl"
    // InternalIGES.g:2915:1: rule__PMultiEntry__Group__9__Impl : ( RULE_INT ) ;
    public final void rule__PMultiEntry__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2919:1: ( ( RULE_INT ) )
            // InternalIGES.g:2920:1: ( RULE_INT )
            {
            // InternalIGES.g:2920:1: ( RULE_INT )
            // InternalIGES.g:2921:2: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_9()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__PMultiEntry__Group__9__Impl"


    // $ANTLR start "rule__PMultiEntry__Group__10"
    // InternalIGES.g:2930:1: rule__PMultiEntry__Group__10 : rule__PMultiEntry__Group__10__Impl ;
    public final void rule__PMultiEntry__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2934:1: ( rule__PMultiEntry__Group__10__Impl )
            // InternalIGES.g:2935:2: rule__PMultiEntry__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group__10__Impl();

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
    // $ANTLR end "rule__PMultiEntry__Group__10"


    // $ANTLR start "rule__PMultiEntry__Group__10__Impl"
    // InternalIGES.g:2941:1: rule__PMultiEntry__Group__10__Impl : ( RULE_ENDLINE ) ;
    public final void rule__PMultiEntry__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2945:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:2946:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:2946:1: ( RULE_ENDLINE )
            // InternalIGES.g:2947:2: RULE_ENDLINE
            {
             before(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_10()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_10()); 

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
    // $ANTLR end "rule__PMultiEntry__Group__10__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_2__0"
    // InternalIGES.g:2957:1: rule__PMultiEntry__Group_2__0 : rule__PMultiEntry__Group_2__0__Impl rule__PMultiEntry__Group_2__1 ;
    public final void rule__PMultiEntry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2961:1: ( rule__PMultiEntry__Group_2__0__Impl rule__PMultiEntry__Group_2__1 )
            // InternalIGES.g:2962:2: rule__PMultiEntry__Group_2__0__Impl rule__PMultiEntry__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__PMultiEntry__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_2__1();

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
    // $ANTLR end "rule__PMultiEntry__Group_2__0"


    // $ANTLR start "rule__PMultiEntry__Group_2__0__Impl"
    // InternalIGES.g:2969:1: rule__PMultiEntry__Group_2__0__Impl : ( ( rule__PMultiEntry__ValuesAssignment_2_0 )* ) ;
    public final void rule__PMultiEntry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2973:1: ( ( ( rule__PMultiEntry__ValuesAssignment_2_0 )* ) )
            // InternalIGES.g:2974:1: ( ( rule__PMultiEntry__ValuesAssignment_2_0 )* )
            {
            // InternalIGES.g:2974:1: ( ( rule__PMultiEntry__ValuesAssignment_2_0 )* )
            // InternalIGES.g:2975:2: ( rule__PMultiEntry__ValuesAssignment_2_0 )*
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesAssignment_2_0()); 
            // InternalIGES.g:2976:2: ( rule__PMultiEntry__ValuesAssignment_2_0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_INT) ) {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==RULE_INT||(LA51_2>=RULE_WS && LA51_2<=RULE_DELIMITER)||(LA51_2>=RULE_HOLLERITH && LA51_2<=RULE_DOUBLE)) ) {
                        alt51=1;
                    }


                }
                else if ( ((LA51_0>=RULE_HOLLERITH && LA51_0<=RULE_DOUBLE)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalIGES.g:2976:3: rule__PMultiEntry__ValuesAssignment_2_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PMultiEntry__ValuesAssignment_2_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getPMultiEntryAccess().getValuesAssignment_2_0()); 

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
    // $ANTLR end "rule__PMultiEntry__Group_2__0__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_2__1"
    // InternalIGES.g:2984:1: rule__PMultiEntry__Group_2__1 : rule__PMultiEntry__Group_2__1__Impl rule__PMultiEntry__Group_2__2 ;
    public final void rule__PMultiEntry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:2988:1: ( rule__PMultiEntry__Group_2__1__Impl rule__PMultiEntry__Group_2__2 )
            // InternalIGES.g:2989:2: rule__PMultiEntry__Group_2__1__Impl rule__PMultiEntry__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__PMultiEntry__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_2__2();

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
    // $ANTLR end "rule__PMultiEntry__Group_2__1"


    // $ANTLR start "rule__PMultiEntry__Group_2__1__Impl"
    // InternalIGES.g:2996:1: rule__PMultiEntry__Group_2__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3000:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3001:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3001:1: ( ( RULE_WS )? )
            // InternalIGES.g:3002:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_1()); 
            // InternalIGES.g:3003:2: ( RULE_WS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_WS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalIGES.g:3003:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__PMultiEntry__Group_2__1__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_2__2"
    // InternalIGES.g:3011:1: rule__PMultiEntry__Group_2__2 : rule__PMultiEntry__Group_2__2__Impl rule__PMultiEntry__Group_2__3 ;
    public final void rule__PMultiEntry__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3015:1: ( rule__PMultiEntry__Group_2__2__Impl rule__PMultiEntry__Group_2__3 )
            // InternalIGES.g:3016:2: rule__PMultiEntry__Group_2__2__Impl rule__PMultiEntry__Group_2__3
            {
            pushFollow(FOLLOW_19);
            rule__PMultiEntry__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_2__3();

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
    // $ANTLR end "rule__PMultiEntry__Group_2__2"


    // $ANTLR start "rule__PMultiEntry__Group_2__2__Impl"
    // InternalIGES.g:3023:1: rule__PMultiEntry__Group_2__2__Impl : ( ( rule__PMultiEntry__DIndexAssignment_2_2 ) ) ;
    public final void rule__PMultiEntry__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3027:1: ( ( ( rule__PMultiEntry__DIndexAssignment_2_2 ) ) )
            // InternalIGES.g:3028:1: ( ( rule__PMultiEntry__DIndexAssignment_2_2 ) )
            {
            // InternalIGES.g:3028:1: ( ( rule__PMultiEntry__DIndexAssignment_2_2 ) )
            // InternalIGES.g:3029:2: ( rule__PMultiEntry__DIndexAssignment_2_2 )
            {
             before(grammarAccess.getPMultiEntryAccess().getDIndexAssignment_2_2()); 
            // InternalIGES.g:3030:2: ( rule__PMultiEntry__DIndexAssignment_2_2 )
            // InternalIGES.g:3030:3: rule__PMultiEntry__DIndexAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__DIndexAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getDIndexAssignment_2_2()); 

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
    // $ANTLR end "rule__PMultiEntry__Group_2__2__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_2__3"
    // InternalIGES.g:3038:1: rule__PMultiEntry__Group_2__3 : rule__PMultiEntry__Group_2__3__Impl rule__PMultiEntry__Group_2__4 ;
    public final void rule__PMultiEntry__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3042:1: ( rule__PMultiEntry__Group_2__3__Impl rule__PMultiEntry__Group_2__4 )
            // InternalIGES.g:3043:2: rule__PMultiEntry__Group_2__3__Impl rule__PMultiEntry__Group_2__4
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_2__4();

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
    // $ANTLR end "rule__PMultiEntry__Group_2__3"


    // $ANTLR start "rule__PMultiEntry__Group_2__3__Impl"
    // InternalIGES.g:3050:1: rule__PMultiEntry__Group_2__3__Impl : ( 'P' ) ;
    public final void rule__PMultiEntry__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3054:1: ( ( 'P' ) )
            // InternalIGES.g:3055:1: ( 'P' )
            {
            // InternalIGES.g:3055:1: ( 'P' )
            // InternalIGES.g:3056:2: 'P'
            {
             before(grammarAccess.getPMultiEntryAccess().getPKeyword_2_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getPKeyword_2_3()); 

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
    // $ANTLR end "rule__PMultiEntry__Group_2__3__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_2__4"
    // InternalIGES.g:3065:1: rule__PMultiEntry__Group_2__4 : rule__PMultiEntry__Group_2__4__Impl rule__PMultiEntry__Group_2__5 ;
    public final void rule__PMultiEntry__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3069:1: ( rule__PMultiEntry__Group_2__4__Impl rule__PMultiEntry__Group_2__5 )
            // InternalIGES.g:3070:2: rule__PMultiEntry__Group_2__4__Impl rule__PMultiEntry__Group_2__5
            {
            pushFollow(FOLLOW_14);
            rule__PMultiEntry__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_2__5();

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
    // $ANTLR end "rule__PMultiEntry__Group_2__4"


    // $ANTLR start "rule__PMultiEntry__Group_2__4__Impl"
    // InternalIGES.g:3077:1: rule__PMultiEntry__Group_2__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__PMultiEntry__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3081:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3082:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3082:1: ( ( RULE_WS )? )
            // InternalIGES.g:3083:2: ( RULE_WS )?
            {
             before(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_4()); 
            // InternalIGES.g:3084:2: ( RULE_WS )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_WS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalIGES.g:3084:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_4()); 

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
    // $ANTLR end "rule__PMultiEntry__Group_2__4__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_2__5"
    // InternalIGES.g:3092:1: rule__PMultiEntry__Group_2__5 : rule__PMultiEntry__Group_2__5__Impl rule__PMultiEntry__Group_2__6 ;
    public final void rule__PMultiEntry__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3096:1: ( rule__PMultiEntry__Group_2__5__Impl rule__PMultiEntry__Group_2__6 )
            // InternalIGES.g:3097:2: rule__PMultiEntry__Group_2__5__Impl rule__PMultiEntry__Group_2__6
            {
            pushFollow(FOLLOW_15);
            rule__PMultiEntry__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_2__6();

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
    // $ANTLR end "rule__PMultiEntry__Group_2__5"


    // $ANTLR start "rule__PMultiEntry__Group_2__5__Impl"
    // InternalIGES.g:3104:1: rule__PMultiEntry__Group_2__5__Impl : ( ( rule__PMultiEntry__IndiciesAssignment_2_5 ) ) ;
    public final void rule__PMultiEntry__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3108:1: ( ( ( rule__PMultiEntry__IndiciesAssignment_2_5 ) ) )
            // InternalIGES.g:3109:1: ( ( rule__PMultiEntry__IndiciesAssignment_2_5 ) )
            {
            // InternalIGES.g:3109:1: ( ( rule__PMultiEntry__IndiciesAssignment_2_5 ) )
            // InternalIGES.g:3110:2: ( rule__PMultiEntry__IndiciesAssignment_2_5 )
            {
             before(grammarAccess.getPMultiEntryAccess().getIndiciesAssignment_2_5()); 
            // InternalIGES.g:3111:2: ( rule__PMultiEntry__IndiciesAssignment_2_5 )
            // InternalIGES.g:3111:3: rule__PMultiEntry__IndiciesAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__IndiciesAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getPMultiEntryAccess().getIndiciesAssignment_2_5()); 

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
    // $ANTLR end "rule__PMultiEntry__Group_2__5__Impl"


    // $ANTLR start "rule__PMultiEntry__Group_2__6"
    // InternalIGES.g:3119:1: rule__PMultiEntry__Group_2__6 : rule__PMultiEntry__Group_2__6__Impl ;
    public final void rule__PMultiEntry__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3123:1: ( rule__PMultiEntry__Group_2__6__Impl )
            // InternalIGES.g:3124:2: rule__PMultiEntry__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PMultiEntry__Group_2__6__Impl();

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
    // $ANTLR end "rule__PMultiEntry__Group_2__6"


    // $ANTLR start "rule__PMultiEntry__Group_2__6__Impl"
    // InternalIGES.g:3130:1: rule__PMultiEntry__Group_2__6__Impl : ( RULE_ENDLINE ) ;
    public final void rule__PMultiEntry__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3134:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:3135:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:3135:1: ( RULE_ENDLINE )
            // InternalIGES.g:3136:2: RULE_ENDLINE
            {
             before(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_2_6()); 
            match(input,RULE_ENDLINE,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_2_6()); 

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
    // $ANTLR end "rule__PMultiEntry__Group_2__6__Impl"


    // $ANTLR start "rule__HString__Group__0"
    // InternalIGES.g:3146:1: rule__HString__Group__0 : rule__HString__Group__0__Impl rule__HString__Group__1 ;
    public final void rule__HString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3150:1: ( rule__HString__Group__0__Impl rule__HString__Group__1 )
            // InternalIGES.g:3151:2: rule__HString__Group__0__Impl rule__HString__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalIGES.g:3158:1: rule__HString__Group__0__Impl : ( ( rule__HString__ValAssignment_0 ) ) ;
    public final void rule__HString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3162:1: ( ( ( rule__HString__ValAssignment_0 ) ) )
            // InternalIGES.g:3163:1: ( ( rule__HString__ValAssignment_0 ) )
            {
            // InternalIGES.g:3163:1: ( ( rule__HString__ValAssignment_0 ) )
            // InternalIGES.g:3164:2: ( rule__HString__ValAssignment_0 )
            {
             before(grammarAccess.getHStringAccess().getValAssignment_0()); 
            // InternalIGES.g:3165:2: ( rule__HString__ValAssignment_0 )
            // InternalIGES.g:3165:3: rule__HString__ValAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HString__ValAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHStringAccess().getValAssignment_0()); 

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
    // InternalIGES.g:3173:1: rule__HString__Group__1 : rule__HString__Group__1__Impl ;
    public final void rule__HString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3177:1: ( rule__HString__Group__1__Impl )
            // InternalIGES.g:3178:2: rule__HString__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HString__Group__1__Impl();

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
    // InternalIGES.g:3184:1: rule__HString__Group__1__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__HString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3188:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:3189:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:3189:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:3190:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_1()); 
            // InternalIGES.g:3191:2: ( RULE_DELIMITER )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_DELIMITER) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalIGES.g:3191:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Param__Group__0"
    // InternalIGES.g:3200:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3204:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalIGES.g:3205:2: rule__Param__Group__0__Impl rule__Param__Group__1
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
    // InternalIGES.g:3212:1: rule__Param__Group__0__Impl : ( ( rule__Param__ValAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3216:1: ( ( ( rule__Param__ValAssignment_0 ) ) )
            // InternalIGES.g:3217:1: ( ( rule__Param__ValAssignment_0 ) )
            {
            // InternalIGES.g:3217:1: ( ( rule__Param__ValAssignment_0 ) )
            // InternalIGES.g:3218:2: ( rule__Param__ValAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getValAssignment_0()); 
            // InternalIGES.g:3219:2: ( rule__Param__ValAssignment_0 )
            // InternalIGES.g:3219:3: rule__Param__ValAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__ValAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getValAssignment_0()); 

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
    // InternalIGES.g:3227:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3231:1: ( rule__Param__Group__1__Impl )
            // InternalIGES.g:3232:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__1__Impl();

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
    // InternalIGES.g:3238:1: rule__Param__Group__1__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3242:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:3243:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:3243:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:3244:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_1()); 
            // InternalIGES.g:3245:2: ( RULE_DELIMITER )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_DELIMITER) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalIGES.g:3245:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Pointer__Group__0"
    // InternalIGES.g:3254:1: rule__Pointer__Group__0 : rule__Pointer__Group__0__Impl rule__Pointer__Group__1 ;
    public final void rule__Pointer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3258:1: ( rule__Pointer__Group__0__Impl rule__Pointer__Group__1 )
            // InternalIGES.g:3259:2: rule__Pointer__Group__0__Impl rule__Pointer__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalIGES.g:3266:1: rule__Pointer__Group__0__Impl : ( ( rule__Pointer__ValAssignment_0 ) ) ;
    public final void rule__Pointer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3270:1: ( ( ( rule__Pointer__ValAssignment_0 ) ) )
            // InternalIGES.g:3271:1: ( ( rule__Pointer__ValAssignment_0 ) )
            {
            // InternalIGES.g:3271:1: ( ( rule__Pointer__ValAssignment_0 ) )
            // InternalIGES.g:3272:2: ( rule__Pointer__ValAssignment_0 )
            {
             before(grammarAccess.getPointerAccess().getValAssignment_0()); 
            // InternalIGES.g:3273:2: ( rule__Pointer__ValAssignment_0 )
            // InternalIGES.g:3273:3: rule__Pointer__ValAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pointer__ValAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPointerAccess().getValAssignment_0()); 

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
    // InternalIGES.g:3281:1: rule__Pointer__Group__1 : rule__Pointer__Group__1__Impl ;
    public final void rule__Pointer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3285:1: ( rule__Pointer__Group__1__Impl )
            // InternalIGES.g:3286:2: rule__Pointer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointer__Group__1__Impl();

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
    // InternalIGES.g:3292:1: rule__Pointer__Group__1__Impl : ( ( RULE_DELIMITER )? ) ;
    public final void rule__Pointer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3296:1: ( ( ( RULE_DELIMITER )? ) )
            // InternalIGES.g:3297:1: ( ( RULE_DELIMITER )? )
            {
            // InternalIGES.g:3297:1: ( ( RULE_DELIMITER )? )
            // InternalIGES.g:3298:2: ( RULE_DELIMITER )?
            {
             before(grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_1()); 
            // InternalIGES.g:3299:2: ( RULE_DELIMITER )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_DELIMITER) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalIGES.g:3299:3: RULE_DELIMITER
                    {
                    match(input,RULE_DELIMITER,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__End__Group__0"
    // InternalIGES.g:3308:1: rule__End__Group__0 : rule__End__Group__0__Impl rule__End__Group__1 ;
    public final void rule__End__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3312:1: ( rule__End__Group__0__Impl rule__End__Group__1 )
            // InternalIGES.g:3313:2: rule__End__Group__0__Impl rule__End__Group__1
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
    // InternalIGES.g:3320:1: rule__End__Group__0__Impl : ( 'S' ) ;
    public final void rule__End__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3324:1: ( ( 'S' ) )
            // InternalIGES.g:3325:1: ( 'S' )
            {
            // InternalIGES.g:3325:1: ( 'S' )
            // InternalIGES.g:3326:2: 'S'
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
    // InternalIGES.g:3335:1: rule__End__Group__1 : rule__End__Group__1__Impl rule__End__Group__2 ;
    public final void rule__End__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3339:1: ( rule__End__Group__1__Impl rule__End__Group__2 )
            // InternalIGES.g:3340:2: rule__End__Group__1__Impl rule__End__Group__2
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
    // InternalIGES.g:3347:1: rule__End__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3351:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3352:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3352:1: ( ( RULE_WS )? )
            // InternalIGES.g:3353:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_1()); 
            // InternalIGES.g:3354:2: ( RULE_WS )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_WS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalIGES.g:3354:3: RULE_WS
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
    // InternalIGES.g:3362:1: rule__End__Group__2 : rule__End__Group__2__Impl rule__End__Group__3 ;
    public final void rule__End__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3366:1: ( rule__End__Group__2__Impl rule__End__Group__3 )
            // InternalIGES.g:3367:2: rule__End__Group__2__Impl rule__End__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalIGES.g:3374:1: rule__End__Group__2__Impl : ( ( rule__End__SvalAssignment_2 ) ) ;
    public final void rule__End__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3378:1: ( ( ( rule__End__SvalAssignment_2 ) ) )
            // InternalIGES.g:3379:1: ( ( rule__End__SvalAssignment_2 ) )
            {
            // InternalIGES.g:3379:1: ( ( rule__End__SvalAssignment_2 ) )
            // InternalIGES.g:3380:2: ( rule__End__SvalAssignment_2 )
            {
             before(grammarAccess.getEndAccess().getSvalAssignment_2()); 
            // InternalIGES.g:3381:2: ( rule__End__SvalAssignment_2 )
            // InternalIGES.g:3381:3: rule__End__SvalAssignment_2
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
    // InternalIGES.g:3389:1: rule__End__Group__3 : rule__End__Group__3__Impl rule__End__Group__4 ;
    public final void rule__End__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3393:1: ( rule__End__Group__3__Impl rule__End__Group__4 )
            // InternalIGES.g:3394:2: rule__End__Group__3__Impl rule__End__Group__4
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
    // InternalIGES.g:3401:1: rule__End__Group__3__Impl : ( 'G' ) ;
    public final void rule__End__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3405:1: ( ( 'G' ) )
            // InternalIGES.g:3406:1: ( 'G' )
            {
            // InternalIGES.g:3406:1: ( 'G' )
            // InternalIGES.g:3407:2: 'G'
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
    // InternalIGES.g:3416:1: rule__End__Group__4 : rule__End__Group__4__Impl rule__End__Group__5 ;
    public final void rule__End__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3420:1: ( rule__End__Group__4__Impl rule__End__Group__5 )
            // InternalIGES.g:3421:2: rule__End__Group__4__Impl rule__End__Group__5
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
    // InternalIGES.g:3428:1: rule__End__Group__4__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3432:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3433:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3433:1: ( ( RULE_WS )? )
            // InternalIGES.g:3434:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_4()); 
            // InternalIGES.g:3435:2: ( RULE_WS )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_WS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalIGES.g:3435:3: RULE_WS
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
    // InternalIGES.g:3443:1: rule__End__Group__5 : rule__End__Group__5__Impl rule__End__Group__6 ;
    public final void rule__End__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3447:1: ( rule__End__Group__5__Impl rule__End__Group__6 )
            // InternalIGES.g:3448:2: rule__End__Group__5__Impl rule__End__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalIGES.g:3455:1: rule__End__Group__5__Impl : ( ( rule__End__GvalAssignment_5 ) ) ;
    public final void rule__End__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3459:1: ( ( ( rule__End__GvalAssignment_5 ) ) )
            // InternalIGES.g:3460:1: ( ( rule__End__GvalAssignment_5 ) )
            {
            // InternalIGES.g:3460:1: ( ( rule__End__GvalAssignment_5 ) )
            // InternalIGES.g:3461:2: ( rule__End__GvalAssignment_5 )
            {
             before(grammarAccess.getEndAccess().getGvalAssignment_5()); 
            // InternalIGES.g:3462:2: ( rule__End__GvalAssignment_5 )
            // InternalIGES.g:3462:3: rule__End__GvalAssignment_5
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
    // InternalIGES.g:3470:1: rule__End__Group__6 : rule__End__Group__6__Impl rule__End__Group__7 ;
    public final void rule__End__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3474:1: ( rule__End__Group__6__Impl rule__End__Group__7 )
            // InternalIGES.g:3475:2: rule__End__Group__6__Impl rule__End__Group__7
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
    // InternalIGES.g:3482:1: rule__End__Group__6__Impl : ( 'D' ) ;
    public final void rule__End__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3486:1: ( ( 'D' ) )
            // InternalIGES.g:3487:1: ( 'D' )
            {
            // InternalIGES.g:3487:1: ( 'D' )
            // InternalIGES.g:3488:2: 'D'
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
    // InternalIGES.g:3497:1: rule__End__Group__7 : rule__End__Group__7__Impl rule__End__Group__8 ;
    public final void rule__End__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3501:1: ( rule__End__Group__7__Impl rule__End__Group__8 )
            // InternalIGES.g:3502:2: rule__End__Group__7__Impl rule__End__Group__8
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
    // InternalIGES.g:3509:1: rule__End__Group__7__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3513:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3514:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3514:1: ( ( RULE_WS )? )
            // InternalIGES.g:3515:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_7()); 
            // InternalIGES.g:3516:2: ( RULE_WS )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_WS) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalIGES.g:3516:3: RULE_WS
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
    // InternalIGES.g:3524:1: rule__End__Group__8 : rule__End__Group__8__Impl rule__End__Group__9 ;
    public final void rule__End__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3528:1: ( rule__End__Group__8__Impl rule__End__Group__9 )
            // InternalIGES.g:3529:2: rule__End__Group__8__Impl rule__End__Group__9
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
    // InternalIGES.g:3536:1: rule__End__Group__8__Impl : ( ( rule__End__DvalAssignment_8 ) ) ;
    public final void rule__End__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3540:1: ( ( ( rule__End__DvalAssignment_8 ) ) )
            // InternalIGES.g:3541:1: ( ( rule__End__DvalAssignment_8 ) )
            {
            // InternalIGES.g:3541:1: ( ( rule__End__DvalAssignment_8 ) )
            // InternalIGES.g:3542:2: ( rule__End__DvalAssignment_8 )
            {
             before(grammarAccess.getEndAccess().getDvalAssignment_8()); 
            // InternalIGES.g:3543:2: ( rule__End__DvalAssignment_8 )
            // InternalIGES.g:3543:3: rule__End__DvalAssignment_8
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
    // InternalIGES.g:3551:1: rule__End__Group__9 : rule__End__Group__9__Impl rule__End__Group__10 ;
    public final void rule__End__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3555:1: ( rule__End__Group__9__Impl rule__End__Group__10 )
            // InternalIGES.g:3556:2: rule__End__Group__9__Impl rule__End__Group__10
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
    // InternalIGES.g:3563:1: rule__End__Group__9__Impl : ( 'P' ) ;
    public final void rule__End__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3567:1: ( ( 'P' ) )
            // InternalIGES.g:3568:1: ( 'P' )
            {
            // InternalIGES.g:3568:1: ( 'P' )
            // InternalIGES.g:3569:2: 'P'
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
    // InternalIGES.g:3578:1: rule__End__Group__10 : rule__End__Group__10__Impl rule__End__Group__11 ;
    public final void rule__End__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3582:1: ( rule__End__Group__10__Impl rule__End__Group__11 )
            // InternalIGES.g:3583:2: rule__End__Group__10__Impl rule__End__Group__11
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
    // InternalIGES.g:3590:1: rule__End__Group__10__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3594:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3595:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3595:1: ( ( RULE_WS )? )
            // InternalIGES.g:3596:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_10()); 
            // InternalIGES.g:3597:2: ( RULE_WS )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_WS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalIGES.g:3597:3: RULE_WS
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
    // InternalIGES.g:3605:1: rule__End__Group__11 : rule__End__Group__11__Impl rule__End__Group__12 ;
    public final void rule__End__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3609:1: ( rule__End__Group__11__Impl rule__End__Group__12 )
            // InternalIGES.g:3610:2: rule__End__Group__11__Impl rule__End__Group__12
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
    // InternalIGES.g:3617:1: rule__End__Group__11__Impl : ( ( rule__End__PvalAssignment_11 ) ) ;
    public final void rule__End__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3621:1: ( ( ( rule__End__PvalAssignment_11 ) ) )
            // InternalIGES.g:3622:1: ( ( rule__End__PvalAssignment_11 ) )
            {
            // InternalIGES.g:3622:1: ( ( rule__End__PvalAssignment_11 ) )
            // InternalIGES.g:3623:2: ( rule__End__PvalAssignment_11 )
            {
             before(grammarAccess.getEndAccess().getPvalAssignment_11()); 
            // InternalIGES.g:3624:2: ( rule__End__PvalAssignment_11 )
            // InternalIGES.g:3624:3: rule__End__PvalAssignment_11
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
    // InternalIGES.g:3632:1: rule__End__Group__12 : rule__End__Group__12__Impl rule__End__Group__13 ;
    public final void rule__End__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3636:1: ( rule__End__Group__12__Impl rule__End__Group__13 )
            // InternalIGES.g:3637:2: rule__End__Group__12__Impl rule__End__Group__13
            {
            pushFollow(FOLLOW_24);
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
    // InternalIGES.g:3644:1: rule__End__Group__12__Impl : ( RULE_WS ) ;
    public final void rule__End__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3648:1: ( ( RULE_WS ) )
            // InternalIGES.g:3649:1: ( RULE_WS )
            {
            // InternalIGES.g:3649:1: ( RULE_WS )
            // InternalIGES.g:3650:2: RULE_WS
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
    // InternalIGES.g:3659:1: rule__End__Group__13 : rule__End__Group__13__Impl rule__End__Group__14 ;
    public final void rule__End__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3663:1: ( rule__End__Group__13__Impl rule__End__Group__14 )
            // InternalIGES.g:3664:2: rule__End__Group__13__Impl rule__End__Group__14
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
    // InternalIGES.g:3671:1: rule__End__Group__13__Impl : ( 'T' ) ;
    public final void rule__End__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3675:1: ( ( 'T' ) )
            // InternalIGES.g:3676:1: ( 'T' )
            {
            // InternalIGES.g:3676:1: ( 'T' )
            // InternalIGES.g:3677:2: 'T'
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
    // InternalIGES.g:3686:1: rule__End__Group__14 : rule__End__Group__14__Impl rule__End__Group__15 ;
    public final void rule__End__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3690:1: ( rule__End__Group__14__Impl rule__End__Group__15 )
            // InternalIGES.g:3691:2: rule__End__Group__14__Impl rule__End__Group__15
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
    // InternalIGES.g:3698:1: rule__End__Group__14__Impl : ( ( RULE_WS )? ) ;
    public final void rule__End__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3702:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3703:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3703:1: ( ( RULE_WS )? )
            // InternalIGES.g:3704:2: ( RULE_WS )?
            {
             before(grammarAccess.getEndAccess().getWSTerminalRuleCall_14()); 
            // InternalIGES.g:3705:2: ( RULE_WS )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_WS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalIGES.g:3705:3: RULE_WS
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
    // InternalIGES.g:3713:1: rule__End__Group__15 : rule__End__Group__15__Impl ;
    public final void rule__End__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3717:1: ( rule__End__Group__15__Impl )
            // InternalIGES.g:3718:2: rule__End__Group__15__Impl
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
    // InternalIGES.g:3724:1: rule__End__Group__15__Impl : ( ( rule__End__TvalAssignment_15 ) ) ;
    public final void rule__End__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3728:1: ( ( ( rule__End__TvalAssignment_15 ) ) )
            // InternalIGES.g:3729:1: ( ( rule__End__TvalAssignment_15 ) )
            {
            // InternalIGES.g:3729:1: ( ( rule__End__TvalAssignment_15 ) )
            // InternalIGES.g:3730:2: ( rule__End__TvalAssignment_15 )
            {
             before(grammarAccess.getEndAccess().getTvalAssignment_15()); 
            // InternalIGES.g:3731:2: ( rule__End__TvalAssignment_15 )
            // InternalIGES.g:3731:3: rule__End__TvalAssignment_15
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
    // InternalIGES.g:3740:1: rule__StartLine__Group__0 : rule__StartLine__Group__0__Impl rule__StartLine__Group__1 ;
    public final void rule__StartLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3744:1: ( rule__StartLine__Group__0__Impl rule__StartLine__Group__1 )
            // InternalIGES.g:3745:2: rule__StartLine__Group__0__Impl rule__StartLine__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalIGES.g:3752:1: rule__StartLine__Group__0__Impl : ( ( rule__StartLine__Alternatives_0 )* ) ;
    public final void rule__StartLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3756:1: ( ( ( rule__StartLine__Alternatives_0 )* ) )
            // InternalIGES.g:3757:1: ( ( rule__StartLine__Alternatives_0 )* )
            {
            // InternalIGES.g:3757:1: ( ( rule__StartLine__Alternatives_0 )* )
            // InternalIGES.g:3758:2: ( rule__StartLine__Alternatives_0 )*
            {
             before(grammarAccess.getStartLineAccess().getAlternatives_0()); 
            // InternalIGES.g:3759:2: ( rule__StartLine__Alternatives_0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_STRING && LA62_0<=RULE_WS)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalIGES.g:3759:3: rule__StartLine__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__StartLine__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalIGES.g:3767:1: rule__StartLine__Group__1 : rule__StartLine__Group__1__Impl rule__StartLine__Group__2 ;
    public final void rule__StartLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3771:1: ( rule__StartLine__Group__1__Impl rule__StartLine__Group__2 )
            // InternalIGES.g:3772:2: rule__StartLine__Group__1__Impl rule__StartLine__Group__2
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
    // InternalIGES.g:3779:1: rule__StartLine__Group__1__Impl : ( 'S' ) ;
    public final void rule__StartLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3783:1: ( ( 'S' ) )
            // InternalIGES.g:3784:1: ( 'S' )
            {
            // InternalIGES.g:3784:1: ( 'S' )
            // InternalIGES.g:3785:2: 'S'
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
    // InternalIGES.g:3794:1: rule__StartLine__Group__2 : rule__StartLine__Group__2__Impl rule__StartLine__Group__3 ;
    public final void rule__StartLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3798:1: ( rule__StartLine__Group__2__Impl rule__StartLine__Group__3 )
            // InternalIGES.g:3799:2: rule__StartLine__Group__2__Impl rule__StartLine__Group__3
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
    // InternalIGES.g:3806:1: rule__StartLine__Group__2__Impl : ( ( RULE_WS )? ) ;
    public final void rule__StartLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3810:1: ( ( ( RULE_WS )? ) )
            // InternalIGES.g:3811:1: ( ( RULE_WS )? )
            {
            // InternalIGES.g:3811:1: ( ( RULE_WS )? )
            // InternalIGES.g:3812:2: ( RULE_WS )?
            {
             before(grammarAccess.getStartLineAccess().getWSTerminalRuleCall_2()); 
            // InternalIGES.g:3813:2: ( RULE_WS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_WS) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalIGES.g:3813:3: RULE_WS
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
    // InternalIGES.g:3821:1: rule__StartLine__Group__3 : rule__StartLine__Group__3__Impl rule__StartLine__Group__4 ;
    public final void rule__StartLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3825:1: ( rule__StartLine__Group__3__Impl rule__StartLine__Group__4 )
            // InternalIGES.g:3826:2: rule__StartLine__Group__3__Impl rule__StartLine__Group__4
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
    // InternalIGES.g:3833:1: rule__StartLine__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__StartLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3837:1: ( ( RULE_INT ) )
            // InternalIGES.g:3838:1: ( RULE_INT )
            {
            // InternalIGES.g:3838:1: ( RULE_INT )
            // InternalIGES.g:3839:2: RULE_INT
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
    // InternalIGES.g:3848:1: rule__StartLine__Group__4 : rule__StartLine__Group__4__Impl ;
    public final void rule__StartLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3852:1: ( rule__StartLine__Group__4__Impl )
            // InternalIGES.g:3853:2: rule__StartLine__Group__4__Impl
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
    // InternalIGES.g:3859:1: rule__StartLine__Group__4__Impl : ( RULE_ENDLINE ) ;
    public final void rule__StartLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3863:1: ( ( RULE_ENDLINE ) )
            // InternalIGES.g:3864:1: ( RULE_ENDLINE )
            {
            // InternalIGES.g:3864:1: ( RULE_ENDLINE )
            // InternalIGES.g:3865:2: RULE_ENDLINE
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
    // InternalIGES.g:3875:1: rule__IGES__StartAssignment_0 : ( ruleStart ) ;
    public final void rule__IGES__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3879:1: ( ( ruleStart ) )
            // InternalIGES.g:3880:2: ( ruleStart )
            {
            // InternalIGES.g:3880:2: ( ruleStart )
            // InternalIGES.g:3881:3: ruleStart
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
    // InternalIGES.g:3890:1: rule__IGES__GlobalAssignment_1 : ( ruleGlobal ) ;
    public final void rule__IGES__GlobalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3894:1: ( ( ruleGlobal ) )
            // InternalIGES.g:3895:2: ( ruleGlobal )
            {
            // InternalIGES.g:3895:2: ( ruleGlobal )
            // InternalIGES.g:3896:3: ruleGlobal
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
    // InternalIGES.g:3905:1: rule__IGES__DataAssignment_2 : ( ruleData ) ;
    public final void rule__IGES__DataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3909:1: ( ( ruleData ) )
            // InternalIGES.g:3910:2: ( ruleData )
            {
            // InternalIGES.g:3910:2: ( ruleData )
            // InternalIGES.g:3911:3: ruleData
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
    // InternalIGES.g:3920:1: rule__IGES__ParametersAssignment_3 : ( ruleParameters ) ;
    public final void rule__IGES__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3924:1: ( ( ruleParameters ) )
            // InternalIGES.g:3925:2: ( ruleParameters )
            {
            // InternalIGES.g:3925:2: ( ruleParameters )
            // InternalIGES.g:3926:3: ruleParameters
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
    // InternalIGES.g:3935:1: rule__IGES__EndAssignment_4 : ( ruleEnd ) ;
    public final void rule__IGES__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3939:1: ( ( ruleEnd ) )
            // InternalIGES.g:3940:2: ( ruleEnd )
            {
            // InternalIGES.g:3940:2: ( ruleEnd )
            // InternalIGES.g:3941:3: ruleEnd
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
    // InternalIGES.g:3950:1: rule__Start__LinesAssignment : ( rulestartLine ) ;
    public final void rule__Start__LinesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3954:1: ( ( rulestartLine ) )
            // InternalIGES.g:3955:2: ( rulestartLine )
            {
            // InternalIGES.g:3955:2: ( rulestartLine )
            // InternalIGES.g:3956:3: rulestartLine
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


    // $ANTLR start "rule__Global__ValuesAssignment_4_0"
    // InternalIGES.g:3965:1: rule__Global__ValuesAssignment_4_0 : ( ruleValue ) ;
    public final void rule__Global__ValuesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3969:1: ( ( ruleValue ) )
            // InternalIGES.g:3970:2: ( ruleValue )
            {
            // InternalIGES.g:3970:2: ( ruleValue )
            // InternalIGES.g:3971:3: ruleValue
            {
             before(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Global__ValuesAssignment_4_0"


    // $ANTLR start "rule__Global__ValuesAssignment_5"
    // InternalIGES.g:3980:1: rule__Global__ValuesAssignment_5 : ( ruleValue ) ;
    public final void rule__Global__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3984:1: ( ( ruleValue ) )
            // InternalIGES.g:3985:2: ( ruleValue )
            {
            // InternalIGES.g:3985:2: ( ruleValue )
            // InternalIGES.g:3986:3: ruleValue
            {
             before(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Global__ValuesAssignment_5"


    // $ANTLR start "rule__Data__EntriesAssignment"
    // InternalIGES.g:3995:1: rule__Data__EntriesAssignment : ( ruleEntry ) ;
    public final void rule__Data__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:3999:1: ( ( ruleEntry ) )
            // InternalIGES.g:4000:2: ( ruleEntry )
            {
            // InternalIGES.g:4000:2: ( ruleEntry )
            // InternalIGES.g:4001:3: ruleEntry
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
    // InternalIGES.g:4010:1: rule__Entry__TypeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Entry__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4014:1: ( ( RULE_INT ) )
            // InternalIGES.g:4015:2: ( RULE_INT )
            {
            // InternalIGES.g:4015:2: ( RULE_INT )
            // InternalIGES.g:4016:3: RULE_INT
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
    // InternalIGES.g:4025:1: rule__Entry__ParamDataAssignment_3 : ( RULE_INT ) ;
    public final void rule__Entry__ParamDataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4029:1: ( ( RULE_INT ) )
            // InternalIGES.g:4030:2: ( RULE_INT )
            {
            // InternalIGES.g:4030:2: ( RULE_INT )
            // InternalIGES.g:4031:3: RULE_INT
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
    // InternalIGES.g:4040:1: rule__Entry__StructureAssignment_5 : ( RULE_INT ) ;
    public final void rule__Entry__StructureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4044:1: ( ( RULE_INT ) )
            // InternalIGES.g:4045:2: ( RULE_INT )
            {
            // InternalIGES.g:4045:2: ( RULE_INT )
            // InternalIGES.g:4046:3: RULE_INT
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
    // InternalIGES.g:4055:1: rule__Entry__LineFontAssignment_7 : ( RULE_INT ) ;
    public final void rule__Entry__LineFontAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4059:1: ( ( RULE_INT ) )
            // InternalIGES.g:4060:2: ( RULE_INT )
            {
            // InternalIGES.g:4060:2: ( RULE_INT )
            // InternalIGES.g:4061:3: RULE_INT
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
    // InternalIGES.g:4070:1: rule__Entry__LevelAssignment_9 : ( RULE_INT ) ;
    public final void rule__Entry__LevelAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4074:1: ( ( RULE_INT ) )
            // InternalIGES.g:4075:2: ( RULE_INT )
            {
            // InternalIGES.g:4075:2: ( RULE_INT )
            // InternalIGES.g:4076:3: RULE_INT
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
    // InternalIGES.g:4085:1: rule__Entry__ViewAssignment_11 : ( RULE_INT ) ;
    public final void rule__Entry__ViewAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4089:1: ( ( RULE_INT ) )
            // InternalIGES.g:4090:2: ( RULE_INT )
            {
            // InternalIGES.g:4090:2: ( RULE_INT )
            // InternalIGES.g:4091:3: RULE_INT
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
    // InternalIGES.g:4100:1: rule__Entry__TransformMatrixAssignment_13 : ( RULE_INT ) ;
    public final void rule__Entry__TransformMatrixAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4104:1: ( ( RULE_INT ) )
            // InternalIGES.g:4105:2: ( RULE_INT )
            {
            // InternalIGES.g:4105:2: ( RULE_INT )
            // InternalIGES.g:4106:3: RULE_INT
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
    // InternalIGES.g:4115:1: rule__Entry__StatusAssignment_17 : ( RULE_INT ) ;
    public final void rule__Entry__StatusAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4119:1: ( ( RULE_INT ) )
            // InternalIGES.g:4120:2: ( RULE_INT )
            {
            // InternalIGES.g:4120:2: ( RULE_INT )
            // InternalIGES.g:4121:3: RULE_INT
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
    // InternalIGES.g:4130:1: rule__Entry__IndexAssignment_20 : ( RULE_INT ) ;
    public final void rule__Entry__IndexAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4134:1: ( ( RULE_INT ) )
            // InternalIGES.g:4135:2: ( RULE_INT )
            {
            // InternalIGES.g:4135:2: ( RULE_INT )
            // InternalIGES.g:4136:3: RULE_INT
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
    // InternalIGES.g:4145:1: rule__Entry__LineWeightAssignment_25 : ( RULE_INT ) ;
    public final void rule__Entry__LineWeightAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4149:1: ( ( RULE_INT ) )
            // InternalIGES.g:4150:2: ( RULE_INT )
            {
            // InternalIGES.g:4150:2: ( RULE_INT )
            // InternalIGES.g:4151:3: RULE_INT
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
    // InternalIGES.g:4160:1: rule__Entry__ColorAssignment_27 : ( RULE_INT ) ;
    public final void rule__Entry__ColorAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4164:1: ( ( RULE_INT ) )
            // InternalIGES.g:4165:2: ( RULE_INT )
            {
            // InternalIGES.g:4165:2: ( RULE_INT )
            // InternalIGES.g:4166:3: RULE_INT
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
    // InternalIGES.g:4175:1: rule__Entry__ParamLinesAssignment_29 : ( RULE_INT ) ;
    public final void rule__Entry__ParamLinesAssignment_29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4179:1: ( ( RULE_INT ) )
            // InternalIGES.g:4180:2: ( RULE_INT )
            {
            // InternalIGES.g:4180:2: ( RULE_INT )
            // InternalIGES.g:4181:3: RULE_INT
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
    // InternalIGES.g:4190:1: rule__Entry__FormAssignment_31 : ( RULE_INT ) ;
    public final void rule__Entry__FormAssignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4194:1: ( ( RULE_INT ) )
            // InternalIGES.g:4195:2: ( RULE_INT )
            {
            // InternalIGES.g:4195:2: ( RULE_INT )
            // InternalIGES.g:4196:3: RULE_INT
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


    // $ANTLR start "rule__Entry__EntityLabelAssignment_35_0"
    // InternalIGES.g:4205:1: rule__Entry__EntityLabelAssignment_35_0 : ( RULE_STRING ) ;
    public final void rule__Entry__EntityLabelAssignment_35_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4209:1: ( ( RULE_STRING ) )
            // InternalIGES.g:4210:2: ( RULE_STRING )
            {
            // InternalIGES.g:4210:2: ( RULE_STRING )
            // InternalIGES.g:4211:3: RULE_STRING
            {
             before(grammarAccess.getEntryAccess().getEntityLabelSTRINGTerminalRuleCall_35_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getEntityLabelSTRINGTerminalRuleCall_35_0_0()); 

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
    // $ANTLR end "rule__Entry__EntityLabelAssignment_35_0"


    // $ANTLR start "rule__Entry__SubNumAssignment_37"
    // InternalIGES.g:4220:1: rule__Entry__SubNumAssignment_37 : ( RULE_INT ) ;
    public final void rule__Entry__SubNumAssignment_37() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4224:1: ( ( RULE_INT ) )
            // InternalIGES.g:4225:2: ( RULE_INT )
            {
            // InternalIGES.g:4225:2: ( RULE_INT )
            // InternalIGES.g:4226:3: RULE_INT
            {
             before(grammarAccess.getEntryAccess().getSubNumINTTerminalRuleCall_37_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntryAccess().getSubNumINTTerminalRuleCall_37_0()); 

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
    // $ANTLR end "rule__Entry__SubNumAssignment_37"


    // $ANTLR start "rule__Parameters__EntriesAssignment"
    // InternalIGES.g:4235:1: rule__Parameters__EntriesAssignment : ( ( rule__Parameters__EntriesAlternatives_0 ) ) ;
    public final void rule__Parameters__EntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4239:1: ( ( ( rule__Parameters__EntriesAlternatives_0 ) ) )
            // InternalIGES.g:4240:2: ( ( rule__Parameters__EntriesAlternatives_0 ) )
            {
            // InternalIGES.g:4240:2: ( ( rule__Parameters__EntriesAlternatives_0 ) )
            // InternalIGES.g:4241:3: ( rule__Parameters__EntriesAlternatives_0 )
            {
             before(grammarAccess.getParametersAccess().getEntriesAlternatives_0()); 
            // InternalIGES.g:4242:3: ( rule__Parameters__EntriesAlternatives_0 )
            // InternalIGES.g:4242:4: rule__Parameters__EntriesAlternatives_0
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
    // InternalIGES.g:4250:1: rule__PEntry__TypeAssignment_0 : ( RULE_INT ) ;
    public final void rule__PEntry__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4254:1: ( ( RULE_INT ) )
            // InternalIGES.g:4255:2: ( RULE_INT )
            {
            // InternalIGES.g:4255:2: ( RULE_INT )
            // InternalIGES.g:4256:3: RULE_INT
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


    // $ANTLR start "rule__PEntry__ValuesAssignment_2"
    // InternalIGES.g:4265:1: rule__PEntry__ValuesAssignment_2 : ( ruleValue ) ;
    public final void rule__PEntry__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4269:1: ( ( ruleValue ) )
            // InternalIGES.g:4270:2: ( ruleValue )
            {
            // InternalIGES.g:4270:2: ( ruleValue )
            // InternalIGES.g:4271:3: ruleValue
            {
             before(grammarAccess.getPEntryAccess().getValuesValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPEntryAccess().getValuesValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PEntry__ValuesAssignment_2"


    // $ANTLR start "rule__PEntry__DIndexAssignment_5"
    // InternalIGES.g:4280:1: rule__PEntry__DIndexAssignment_5 : ( RULE_INT ) ;
    public final void rule__PEntry__DIndexAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4284:1: ( ( RULE_INT ) )
            // InternalIGES.g:4285:2: ( RULE_INT )
            {
            // InternalIGES.g:4285:2: ( RULE_INT )
            // InternalIGES.g:4286:3: RULE_INT
            {
             before(grammarAccess.getPEntryAccess().getDIndexINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getDIndexINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__PEntry__DIndexAssignment_5"


    // $ANTLR start "rule__PEntry__IndiciesAssignment_8"
    // InternalIGES.g:4295:1: rule__PEntry__IndiciesAssignment_8 : ( RULE_INT ) ;
    public final void rule__PEntry__IndiciesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4299:1: ( ( RULE_INT ) )
            // InternalIGES.g:4300:2: ( RULE_INT )
            {
            // InternalIGES.g:4300:2: ( RULE_INT )
            // InternalIGES.g:4301:3: RULE_INT
            {
             before(grammarAccess.getPEntryAccess().getIndiciesINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPEntryAccess().getIndiciesINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__PEntry__IndiciesAssignment_8"


    // $ANTLR start "rule__PMultiEntry__TypeAssignment_0"
    // InternalIGES.g:4310:1: rule__PMultiEntry__TypeAssignment_0 : ( RULE_INT ) ;
    public final void rule__PMultiEntry__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4314:1: ( ( RULE_INT ) )
            // InternalIGES.g:4315:2: ( RULE_INT )
            {
            // InternalIGES.g:4315:2: ( RULE_INT )
            // InternalIGES.g:4316:3: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getTypeINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getTypeINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PMultiEntry__TypeAssignment_0"


    // $ANTLR start "rule__PMultiEntry__ValuesAssignment_2_0"
    // InternalIGES.g:4325:1: rule__PMultiEntry__ValuesAssignment_2_0 : ( ruleValue ) ;
    public final void rule__PMultiEntry__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4329:1: ( ( ruleValue ) )
            // InternalIGES.g:4330:2: ( ruleValue )
            {
            // InternalIGES.g:4330:2: ( ruleValue )
            // InternalIGES.g:4331:3: ruleValue
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__PMultiEntry__ValuesAssignment_2_0"


    // $ANTLR start "rule__PMultiEntry__DIndexAssignment_2_2"
    // InternalIGES.g:4340:1: rule__PMultiEntry__DIndexAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__PMultiEntry__DIndexAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4344:1: ( ( RULE_INT ) )
            // InternalIGES.g:4345:2: ( RULE_INT )
            {
            // InternalIGES.g:4345:2: ( RULE_INT )
            // InternalIGES.g:4346:3: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getDIndexINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getDIndexINTTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__PMultiEntry__DIndexAssignment_2_2"


    // $ANTLR start "rule__PMultiEntry__IndiciesAssignment_2_5"
    // InternalIGES.g:4355:1: rule__PMultiEntry__IndiciesAssignment_2_5 : ( RULE_INT ) ;
    public final void rule__PMultiEntry__IndiciesAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4359:1: ( ( RULE_INT ) )
            // InternalIGES.g:4360:2: ( RULE_INT )
            {
            // InternalIGES.g:4360:2: ( RULE_INT )
            // InternalIGES.g:4361:3: RULE_INT
            {
             before(grammarAccess.getPMultiEntryAccess().getIndiciesINTTerminalRuleCall_2_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPMultiEntryAccess().getIndiciesINTTerminalRuleCall_2_5_0()); 

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
    // $ANTLR end "rule__PMultiEntry__IndiciesAssignment_2_5"


    // $ANTLR start "rule__PMultiEntry__ValuesAssignment_3"
    // InternalIGES.g:4370:1: rule__PMultiEntry__ValuesAssignment_3 : ( ruleValue ) ;
    public final void rule__PMultiEntry__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4374:1: ( ( ruleValue ) )
            // InternalIGES.g:4375:2: ( ruleValue )
            {
            // InternalIGES.g:4375:2: ( ruleValue )
            // InternalIGES.g:4376:3: ruleValue
            {
             before(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PMultiEntry__ValuesAssignment_3"


    // $ANTLR start "rule__HString__ValAssignment_0"
    // InternalIGES.g:4385:1: rule__HString__ValAssignment_0 : ( RULE_HOLLERITH ) ;
    public final void rule__HString__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4389:1: ( ( RULE_HOLLERITH ) )
            // InternalIGES.g:4390:2: ( RULE_HOLLERITH )
            {
            // InternalIGES.g:4390:2: ( RULE_HOLLERITH )
            // InternalIGES.g:4391:3: RULE_HOLLERITH
            {
             before(grammarAccess.getHStringAccess().getValHOLLERITHTerminalRuleCall_0_0()); 
            match(input,RULE_HOLLERITH,FOLLOW_2); 
             after(grammarAccess.getHStringAccess().getValHOLLERITHTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__HString__ValAssignment_0"


    // $ANTLR start "rule__Param__ValAssignment_0"
    // InternalIGES.g:4400:1: rule__Param__ValAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__Param__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4404:1: ( ( RULE_DOUBLE ) )
            // InternalIGES.g:4405:2: ( RULE_DOUBLE )
            {
            // InternalIGES.g:4405:2: ( RULE_DOUBLE )
            // InternalIGES.g:4406:3: RULE_DOUBLE
            {
             before(grammarAccess.getParamAccess().getValDOUBLETerminalRuleCall_0_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getValDOUBLETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__ValAssignment_0"


    // $ANTLR start "rule__Pointer__ValAssignment_0"
    // InternalIGES.g:4415:1: rule__Pointer__ValAssignment_0 : ( RULE_INT ) ;
    public final void rule__Pointer__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4419:1: ( ( RULE_INT ) )
            // InternalIGES.g:4420:2: ( RULE_INT )
            {
            // InternalIGES.g:4420:2: ( RULE_INT )
            // InternalIGES.g:4421:3: RULE_INT
            {
             before(grammarAccess.getPointerAccess().getValINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointerAccess().getValINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Pointer__ValAssignment_0"


    // $ANTLR start "rule__End__SvalAssignment_2"
    // InternalIGES.g:4430:1: rule__End__SvalAssignment_2 : ( RULE_INT ) ;
    public final void rule__End__SvalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4434:1: ( ( RULE_INT ) )
            // InternalIGES.g:4435:2: ( RULE_INT )
            {
            // InternalIGES.g:4435:2: ( RULE_INT )
            // InternalIGES.g:4436:3: RULE_INT
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
    // InternalIGES.g:4445:1: rule__End__GvalAssignment_5 : ( RULE_INT ) ;
    public final void rule__End__GvalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4449:1: ( ( RULE_INT ) )
            // InternalIGES.g:4450:2: ( RULE_INT )
            {
            // InternalIGES.g:4450:2: ( RULE_INT )
            // InternalIGES.g:4451:3: RULE_INT
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
    // InternalIGES.g:4460:1: rule__End__DvalAssignment_8 : ( RULE_INT ) ;
    public final void rule__End__DvalAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4464:1: ( ( RULE_INT ) )
            // InternalIGES.g:4465:2: ( RULE_INT )
            {
            // InternalIGES.g:4465:2: ( RULE_INT )
            // InternalIGES.g:4466:3: RULE_INT
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
    // InternalIGES.g:4475:1: rule__End__PvalAssignment_11 : ( RULE_INT ) ;
    public final void rule__End__PvalAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4479:1: ( ( RULE_INT ) )
            // InternalIGES.g:4480:2: ( RULE_INT )
            {
            // InternalIGES.g:4480:2: ( RULE_INT )
            // InternalIGES.g:4481:3: RULE_INT
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
    // InternalIGES.g:4490:1: rule__End__TvalAssignment_15 : ( RULE_INT ) ;
    public final void rule__End__TvalAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIGES.g:4494:1: ( ( RULE_INT ) )
            // InternalIGES.g:4495:2: ( RULE_INT )
            {
            // InternalIGES.g:4495:2: ( RULE_INT )
            // InternalIGES.g:4496:3: RULE_INT
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\6\4\2\uffff\3\4";
    static final String dfa_3s = "\1\4\3\13\1\16\1\13\2\uffff\3\13";
    static final String dfa_4s = "\6\uffff\1\1\1\2\3\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\4\1\uffff\1\6\1\2\1\7\1\uffff\1\5\1\3",
            "\1\4\1\uffff\1\6\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\4\1\uffff\1\6\1\10\1\7\1\uffff\1\5\1\3",
            "\1\4\1\uffff\1\6\1\11\1\7\1\uffff\1\5\1\3\2\uffff\1\6",
            "\1\4\1\uffff\1\6\1\12\1\7\1\uffff\1\5\1\3",
            "",
            "",
            "\1\4\1\uffff\1\6\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\4\1\uffff\1\6\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\4\1\uffff\1\6\1\uffff\1\7\1\uffff\1\5\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "444:1: rule__Parameters__EntriesAlternatives_0 : ( ( rulePMultiEntry ) | ( rulePEntry ) );";
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\4\4\2\uffff\3\4";
    static final String dfa_9s = "\4\14\2\uffff\3\14";
    static final String dfa_10s = "\4\uffff\1\2\1\1\3\uffff";
    static final String dfa_11s = "\11\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\2\1\uffff\1\5\1\6\1\4\1\uffff\1\3\1\1\1\5",
            "\1\2\1\uffff\1\5\1\7\1\4\1\uffff\1\3\1\1\1\5",
            "\1\2\1\uffff\1\5\1\10\1\4\1\uffff\1\3\1\1\1\5",
            "",
            "",
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 781:3: ( rule__Global__Group_4__0 )*";
        }
    }
    static final String dfa_13s = "\2\13\1\16\1\13\2\uffff\3\13";
    static final String[] dfa_14s = {
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1",
            "\1\2\1\uffff\1\5\1\6\1\4\1\uffff\1\3\1\1",
            "\1\2\1\uffff\1\5\1\7\1\4\1\uffff\1\3\1\1\2\uffff\1\5",
            "\1\2\1\uffff\1\5\1\10\1\4\1\uffff\1\3\1\1",
            "",
            "",
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1",
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1",
            "\1\2\1\uffff\1\5\1\uffff\1\4\1\uffff\1\3\1\1"
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_13;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 2732:3: ( rule__PMultiEntry__Group_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008062L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001CD0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000D10L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001CD2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000C12L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000D90L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000CD0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000CD2L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000062L});

}