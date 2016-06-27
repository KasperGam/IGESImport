package org.eclipse.january.geometry.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.january.geometry.xtext.services.IGESGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIGESParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DELIMITER", "RULE_WS", "RULE_INT", "RULE_ENDLINE", "RULE_SEPARATOR", "RULE_STRING", "RULE_HOLLERITH", "RULE_DOUBLE", "'G'", "'D'", "'P'", "'S'", "'T'"
    };
    public static final int RULE_HOLLERITH=10;
    public static final int RULE_ENDLINE=7;
    public static final int RULE_WS=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SEPARATOR=8;
    public static final int RULE_DELIMITER=4;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int RULE_INT=6;
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

        public InternalIGESParser(TokenStream input, IGESGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IGES";
       	}

       	@Override
       	protected IGESGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIGES"
    // InternalIGES.g:64:1: entryRuleIGES returns [EObject current=null] : iv_ruleIGES= ruleIGES EOF ;
    public final EObject entryRuleIGES() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIGES = null;


        try {
            // InternalIGES.g:64:45: (iv_ruleIGES= ruleIGES EOF )
            // InternalIGES.g:65:2: iv_ruleIGES= ruleIGES EOF
            {
             newCompositeNode(grammarAccess.getIGESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIGES=ruleIGES();

            state._fsp--;

             current =iv_ruleIGES; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIGES"


    // $ANTLR start "ruleIGES"
    // InternalIGES.g:71:1: ruleIGES returns [EObject current=null] : ( ( (lv_start_0_0= ruleStart ) ) ( (lv_global_1_0= ruleGlobal ) ) ( (lv_data_2_0= ruleData ) ) ( (lv_parameters_3_0= ruleParameters ) ) ( (lv_end_4_0= ruleEnd ) ) ) ;
    public final EObject ruleIGES() throws RecognitionException {
        EObject current = null;

        EObject lv_start_0_0 = null;

        EObject lv_global_1_0 = null;

        EObject lv_data_2_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalIGES.g:77:2: ( ( ( (lv_start_0_0= ruleStart ) ) ( (lv_global_1_0= ruleGlobal ) ) ( (lv_data_2_0= ruleData ) ) ( (lv_parameters_3_0= ruleParameters ) ) ( (lv_end_4_0= ruleEnd ) ) ) )
            // InternalIGES.g:78:2: ( ( (lv_start_0_0= ruleStart ) ) ( (lv_global_1_0= ruleGlobal ) ) ( (lv_data_2_0= ruleData ) ) ( (lv_parameters_3_0= ruleParameters ) ) ( (lv_end_4_0= ruleEnd ) ) )
            {
            // InternalIGES.g:78:2: ( ( (lv_start_0_0= ruleStart ) ) ( (lv_global_1_0= ruleGlobal ) ) ( (lv_data_2_0= ruleData ) ) ( (lv_parameters_3_0= ruleParameters ) ) ( (lv_end_4_0= ruleEnd ) ) )
            // InternalIGES.g:79:3: ( (lv_start_0_0= ruleStart ) ) ( (lv_global_1_0= ruleGlobal ) ) ( (lv_data_2_0= ruleData ) ) ( (lv_parameters_3_0= ruleParameters ) ) ( (lv_end_4_0= ruleEnd ) )
            {
            // InternalIGES.g:79:3: ( (lv_start_0_0= ruleStart ) )
            // InternalIGES.g:80:4: (lv_start_0_0= ruleStart )
            {
            // InternalIGES.g:80:4: (lv_start_0_0= ruleStart )
            // InternalIGES.g:81:5: lv_start_0_0= ruleStart
            {

            					newCompositeNode(grammarAccess.getIGESAccess().getStartStartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_start_0_0=ruleStart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIGESRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"org.eclipse.january.geometry.xtext.IGES.Start");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIGES.g:98:3: ( (lv_global_1_0= ruleGlobal ) )
            // InternalIGES.g:99:4: (lv_global_1_0= ruleGlobal )
            {
            // InternalIGES.g:99:4: (lv_global_1_0= ruleGlobal )
            // InternalIGES.g:100:5: lv_global_1_0= ruleGlobal
            {

            					newCompositeNode(grammarAccess.getIGESAccess().getGlobalGlobalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_global_1_0=ruleGlobal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIGESRule());
            					}
            					set(
            						current,
            						"global",
            						lv_global_1_0,
            						"org.eclipse.january.geometry.xtext.IGES.Global");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIGES.g:117:3: ( (lv_data_2_0= ruleData ) )
            // InternalIGES.g:118:4: (lv_data_2_0= ruleData )
            {
            // InternalIGES.g:118:4: (lv_data_2_0= ruleData )
            // InternalIGES.g:119:5: lv_data_2_0= ruleData
            {

            					newCompositeNode(grammarAccess.getIGESAccess().getDataDataParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_data_2_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIGESRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_2_0,
            						"org.eclipse.january.geometry.xtext.IGES.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIGES.g:136:3: ( (lv_parameters_3_0= ruleParameters ) )
            // InternalIGES.g:137:4: (lv_parameters_3_0= ruleParameters )
            {
            // InternalIGES.g:137:4: (lv_parameters_3_0= ruleParameters )
            // InternalIGES.g:138:5: lv_parameters_3_0= ruleParameters
            {

            					newCompositeNode(grammarAccess.getIGESAccess().getParametersParametersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_parameters_3_0=ruleParameters();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIGESRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_3_0,
            						"org.eclipse.january.geometry.xtext.IGES.Parameters");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIGES.g:155:3: ( (lv_end_4_0= ruleEnd ) )
            // InternalIGES.g:156:4: (lv_end_4_0= ruleEnd )
            {
            // InternalIGES.g:156:4: (lv_end_4_0= ruleEnd )
            // InternalIGES.g:157:5: lv_end_4_0= ruleEnd
            {

            					newCompositeNode(grammarAccess.getIGESAccess().getEndEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_4_0=ruleEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIGESRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.january.geometry.xtext.IGES.End");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIGES"


    // $ANTLR start "entryRuleStart"
    // InternalIGES.g:178:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalIGES.g:178:46: (iv_ruleStart= ruleStart EOF )
            // InternalIGES.g:179:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalIGES.g:185:1: ruleStart returns [EObject current=null] : ( (lv_lines_0_0= rulestartLine ) )+ ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_lines_0_0 = null;



        	enterRule();

        try {
            // InternalIGES.g:191:2: ( ( (lv_lines_0_0= rulestartLine ) )+ )
            // InternalIGES.g:192:2: ( (lv_lines_0_0= rulestartLine ) )+
            {
            // InternalIGES.g:192:2: ( (lv_lines_0_0= rulestartLine ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WS) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_WS||LA1_2==RULE_STRING||LA1_2==15) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==RULE_STRING||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIGES.g:193:3: (lv_lines_0_0= rulestartLine )
            	    {
            	    // InternalIGES.g:193:3: (lv_lines_0_0= rulestartLine )
            	    // InternalIGES.g:194:4: lv_lines_0_0= rulestartLine
            	    {

            	    				newCompositeNode(grammarAccess.getStartAccess().getLinesStartLineParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    lv_lines_0_0=rulestartLine();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getStartRule());
            	    				}
            	    				add(
            	    					current,
            	    					"lines",
            	    					lv_lines_0_0,
            	    					"org.eclipse.january.geometry.xtext.IGES.startLine");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleGlobal"
    // InternalIGES.g:214:1: entryRuleGlobal returns [EObject current=null] : iv_ruleGlobal= ruleGlobal EOF ;
    public final EObject entryRuleGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobal = null;


        try {
            // InternalIGES.g:214:47: (iv_ruleGlobal= ruleGlobal EOF )
            // InternalIGES.g:215:2: iv_ruleGlobal= ruleGlobal EOF
            {
             newCompositeNode(grammarAccess.getGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobal=ruleGlobal();

            state._fsp--;

             current =iv_ruleGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobal"


    // $ANTLR start "ruleGlobal"
    // InternalIGES.g:221:1: ruleGlobal returns [EObject current=null] : ( () (this_DELIMITER_1= RULE_DELIMITER )? (this_HString_2= ruleHString )? (this_DELIMITER_3= RULE_DELIMITER )? ( ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE )+ ( (lv_values_10_0= ruleValue ) )* this_SEPARATOR_11= RULE_SEPARATOR (this_WS_12= RULE_WS )? otherlv_13= 'G' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE ) ;
    public final EObject ruleGlobal() throws RecognitionException {
        EObject current = null;

        Token this_DELIMITER_1=null;
        Token this_DELIMITER_3=null;
        Token this_WS_5=null;
        Token otherlv_6=null;
        Token this_WS_7=null;
        Token this_INT_8=null;
        Token this_ENDLINE_9=null;
        Token this_SEPARATOR_11=null;
        Token this_WS_12=null;
        Token otherlv_13=null;
        Token this_WS_14=null;
        Token this_INT_15=null;
        Token this_ENDLINE_16=null;
        EObject this_HString_2 = null;

        EObject lv_values_4_0 = null;

        EObject lv_values_10_0 = null;



        	enterRule();

        try {
            // InternalIGES.g:227:2: ( ( () (this_DELIMITER_1= RULE_DELIMITER )? (this_HString_2= ruleHString )? (this_DELIMITER_3= RULE_DELIMITER )? ( ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE )+ ( (lv_values_10_0= ruleValue ) )* this_SEPARATOR_11= RULE_SEPARATOR (this_WS_12= RULE_WS )? otherlv_13= 'G' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE ) )
            // InternalIGES.g:228:2: ( () (this_DELIMITER_1= RULE_DELIMITER )? (this_HString_2= ruleHString )? (this_DELIMITER_3= RULE_DELIMITER )? ( ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE )+ ( (lv_values_10_0= ruleValue ) )* this_SEPARATOR_11= RULE_SEPARATOR (this_WS_12= RULE_WS )? otherlv_13= 'G' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE )
            {
            // InternalIGES.g:228:2: ( () (this_DELIMITER_1= RULE_DELIMITER )? (this_HString_2= ruleHString )? (this_DELIMITER_3= RULE_DELIMITER )? ( ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE )+ ( (lv_values_10_0= ruleValue ) )* this_SEPARATOR_11= RULE_SEPARATOR (this_WS_12= RULE_WS )? otherlv_13= 'G' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE )
            // InternalIGES.g:229:3: () (this_DELIMITER_1= RULE_DELIMITER )? (this_HString_2= ruleHString )? (this_DELIMITER_3= RULE_DELIMITER )? ( ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE )+ ( (lv_values_10_0= ruleValue ) )* this_SEPARATOR_11= RULE_SEPARATOR (this_WS_12= RULE_WS )? otherlv_13= 'G' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE
            {
            // InternalIGES.g:229:3: ()
            // InternalIGES.g:230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalAccess().getGlobalAction_0(),
            					current);
            			

            }

            // InternalIGES.g:236:3: (this_DELIMITER_1= RULE_DELIMITER )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DELIMITER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalIGES.g:237:4: this_DELIMITER_1= RULE_DELIMITER
                    {
                    this_DELIMITER_1=(Token)match(input,RULE_DELIMITER,FOLLOW_3); 

                    				newLeafNode(this_DELIMITER_1, grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalIGES.g:242:3: (this_HString_2= ruleHString )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_HOLLERITH) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIGES.g:243:4: this_HString_2= ruleHString
                    {

                    				newCompositeNode(grammarAccess.getGlobalAccess().getHStringParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_3);
                    this_HString_2=ruleHString();

                    state._fsp--;


                    				current = this_HString_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalIGES.g:252:3: (this_DELIMITER_3= RULE_DELIMITER )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DELIMITER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalIGES.g:253:4: this_DELIMITER_3= RULE_DELIMITER
                    {
                    this_DELIMITER_3=(Token)match(input,RULE_DELIMITER,FOLLOW_8); 

                    				newLeafNode(this_DELIMITER_3, grammarAccess.getGlobalAccess().getDELIMITERTerminalRuleCall_3());
                    			

                    }
                    break;

            }

            // InternalIGES.g:258:3: ( ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalIGES.g:259:4: ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE
            	    {
            	    // InternalIGES.g:259:4: ( (lv_values_4_0= ruleValue ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_INT||(LA5_0>=RULE_HOLLERITH && LA5_0<=RULE_DOUBLE)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalIGES.g:260:5: (lv_values_4_0= ruleValue )
            	    	    {
            	    	    // InternalIGES.g:260:5: (lv_values_4_0= ruleValue )
            	    	    // InternalIGES.g:261:6: lv_values_4_0= ruleValue
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_4_0_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_values_4_0=ruleValue();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getGlobalRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"values",
            	    	    							lv_values_4_0,
            	    	    							"org.eclipse.january.geometry.xtext.IGES.Value");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // InternalIGES.g:278:4: (this_WS_5= RULE_WS )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_WS) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalIGES.g:279:5: this_WS_5= RULE_WS
            	            {
            	            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_9); 

            	            					newLeafNode(this_WS_5, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4_1());
            	            				

            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,12,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getGlobalAccess().getGKeyword_4_2());
            	    			
            	    // InternalIGES.g:288:4: (this_WS_7= RULE_WS )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_WS) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalIGES.g:289:5: this_WS_7= RULE_WS
            	            {
            	            this_WS_7=(Token)match(input,RULE_WS,FOLLOW_5); 

            	            					newLeafNode(this_WS_7, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_4_3());
            	            				

            	            }
            	            break;

            	    }

            	    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_11); 

            	    				newLeafNode(this_INT_8, grammarAccess.getGlobalAccess().getINTTerminalRuleCall_4_4());
            	    			
            	    this_ENDLINE_9=(Token)match(input,RULE_ENDLINE,FOLLOW_12); 

            	    				newLeafNode(this_ENDLINE_9, grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_4_5());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalIGES.g:303:3: ( (lv_values_10_0= ruleValue ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT||(LA9_0>=RULE_HOLLERITH && LA9_0<=RULE_DOUBLE)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIGES.g:304:4: (lv_values_10_0= ruleValue )
            	    {
            	    // InternalIGES.g:304:4: (lv_values_10_0= ruleValue )
            	    // InternalIGES.g:305:5: lv_values_10_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getGlobalAccess().getValuesValueParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_values_10_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGlobalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_10_0,
            	    						"org.eclipse.january.geometry.xtext.IGES.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_SEPARATOR_11=(Token)match(input,RULE_SEPARATOR,FOLLOW_14); 

            			newLeafNode(this_SEPARATOR_11, grammarAccess.getGlobalAccess().getSEPARATORTerminalRuleCall_6());
            		
            // InternalIGES.g:326:3: (this_WS_12= RULE_WS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIGES.g:327:4: this_WS_12= RULE_WS
                    {
                    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_9); 

                    				newLeafNode(this_WS_12, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_7());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getGlobalAccess().getGKeyword_8());
            		
            // InternalIGES.g:336:3: (this_WS_14= RULE_WS )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_WS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIGES.g:337:4: this_WS_14= RULE_WS
                    {
                    this_WS_14=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_14, grammarAccess.getGlobalAccess().getWSTerminalRuleCall_9());
                    			

                    }
                    break;

            }

            this_INT_15=(Token)match(input,RULE_INT,FOLLOW_11); 

            			newLeafNode(this_INT_15, grammarAccess.getGlobalAccess().getINTTerminalRuleCall_10());
            		
            this_ENDLINE_16=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_16, grammarAccess.getGlobalAccess().getENDLINETerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobal"


    // $ANTLR start "entryRuleData"
    // InternalIGES.g:354:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalIGES.g:354:45: (iv_ruleData= ruleData EOF )
            // InternalIGES.g:355:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalIGES.g:361:1: ruleData returns [EObject current=null] : ( (lv_entries_0_0= ruleEntry ) )+ ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalIGES.g:367:2: ( ( (lv_entries_0_0= ruleEntry ) )+ )
            // InternalIGES.g:368:2: ( (lv_entries_0_0= ruleEntry ) )+
            {
            // InternalIGES.g:368:2: ( (lv_entries_0_0= ruleEntry ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIGES.g:369:3: (lv_entries_0_0= ruleEntry )
            	    {
            	    // InternalIGES.g:369:3: (lv_entries_0_0= ruleEntry )
            	    // InternalIGES.g:370:4: lv_entries_0_0= ruleEntry
            	    {

            	    				newCompositeNode(grammarAccess.getDataAccess().getEntriesEntryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_15);
            	    lv_entries_0_0=ruleEntry();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDataRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entries",
            	    					lv_entries_0_0,
            	    					"org.eclipse.january.geometry.xtext.IGES.Entry");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleEntry"
    // InternalIGES.g:390:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalIGES.g:390:46: (iv_ruleEntry= ruleEntry EOF )
            // InternalIGES.g:391:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalIGES.g:397:1: ruleEntry returns [EObject current=null] : (this_WS_0= RULE_WS ( (lv_type_1_0= RULE_INT ) ) (this_WS_2= RULE_WS )? ( (lv_paramData_3_0= RULE_INT ) ) (this_WS_4= RULE_WS )? ( (lv_structure_5_0= RULE_INT ) ) (this_WS_6= RULE_WS )? ( (lv_lineFont_7_0= RULE_INT ) ) (this_WS_8= RULE_WS )? ( (lv_level_9_0= RULE_INT ) ) (this_WS_10= RULE_WS )? ( (lv_view_11_0= RULE_INT ) ) (this_WS_12= RULE_WS )? ( (lv_TransformMatrix_13_0= RULE_INT ) ) (this_WS_14= RULE_WS )? (this_INT_15= RULE_INT )? (this_WS_16= RULE_WS )? ( (lv_status_17_0= RULE_INT ) ) otherlv_18= 'D' (this_WS_19= RULE_WS )? ( (lv_index_20_0= RULE_INT ) ) this_ENDLINE_21= RULE_ENDLINE (this_WS_22= RULE_WS )? this_INT_23= RULE_INT (this_WS_24= RULE_WS )? ( (lv_lineWeight_25_0= RULE_INT ) ) (this_WS_26= RULE_WS )? ( (lv_color_27_0= RULE_INT ) ) (this_WS_28= RULE_WS )? ( (lv_paramLines_29_0= RULE_INT ) ) (this_WS_30= RULE_WS )? ( (lv_form_31_0= RULE_INT ) ) (this_WS_32= RULE_WS )? ( (lv_entityLabel_33_0= RULE_STRING ) )? (this_WS_34= RULE_WS )? ( (lv_subNum_35_0= RULE_INT ) ) otherlv_36= 'D' (this_WS_37= RULE_WS )? this_INT_38= RULE_INT this_ENDLINE_39= RULE_ENDLINE ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token lv_type_1_0=null;
        Token this_WS_2=null;
        Token lv_paramData_3_0=null;
        Token this_WS_4=null;
        Token lv_structure_5_0=null;
        Token this_WS_6=null;
        Token lv_lineFont_7_0=null;
        Token this_WS_8=null;
        Token lv_level_9_0=null;
        Token this_WS_10=null;
        Token lv_view_11_0=null;
        Token this_WS_12=null;
        Token lv_TransformMatrix_13_0=null;
        Token this_WS_14=null;
        Token this_INT_15=null;
        Token this_WS_16=null;
        Token lv_status_17_0=null;
        Token otherlv_18=null;
        Token this_WS_19=null;
        Token lv_index_20_0=null;
        Token this_ENDLINE_21=null;
        Token this_WS_22=null;
        Token this_INT_23=null;
        Token this_WS_24=null;
        Token lv_lineWeight_25_0=null;
        Token this_WS_26=null;
        Token lv_color_27_0=null;
        Token this_WS_28=null;
        Token lv_paramLines_29_0=null;
        Token this_WS_30=null;
        Token lv_form_31_0=null;
        Token this_WS_32=null;
        Token lv_entityLabel_33_0=null;
        Token this_WS_34=null;
        Token lv_subNum_35_0=null;
        Token otherlv_36=null;
        Token this_WS_37=null;
        Token this_INT_38=null;
        Token this_ENDLINE_39=null;


        	enterRule();

        try {
            // InternalIGES.g:403:2: ( (this_WS_0= RULE_WS ( (lv_type_1_0= RULE_INT ) ) (this_WS_2= RULE_WS )? ( (lv_paramData_3_0= RULE_INT ) ) (this_WS_4= RULE_WS )? ( (lv_structure_5_0= RULE_INT ) ) (this_WS_6= RULE_WS )? ( (lv_lineFont_7_0= RULE_INT ) ) (this_WS_8= RULE_WS )? ( (lv_level_9_0= RULE_INT ) ) (this_WS_10= RULE_WS )? ( (lv_view_11_0= RULE_INT ) ) (this_WS_12= RULE_WS )? ( (lv_TransformMatrix_13_0= RULE_INT ) ) (this_WS_14= RULE_WS )? (this_INT_15= RULE_INT )? (this_WS_16= RULE_WS )? ( (lv_status_17_0= RULE_INT ) ) otherlv_18= 'D' (this_WS_19= RULE_WS )? ( (lv_index_20_0= RULE_INT ) ) this_ENDLINE_21= RULE_ENDLINE (this_WS_22= RULE_WS )? this_INT_23= RULE_INT (this_WS_24= RULE_WS )? ( (lv_lineWeight_25_0= RULE_INT ) ) (this_WS_26= RULE_WS )? ( (lv_color_27_0= RULE_INT ) ) (this_WS_28= RULE_WS )? ( (lv_paramLines_29_0= RULE_INT ) ) (this_WS_30= RULE_WS )? ( (lv_form_31_0= RULE_INT ) ) (this_WS_32= RULE_WS )? ( (lv_entityLabel_33_0= RULE_STRING ) )? (this_WS_34= RULE_WS )? ( (lv_subNum_35_0= RULE_INT ) ) otherlv_36= 'D' (this_WS_37= RULE_WS )? this_INT_38= RULE_INT this_ENDLINE_39= RULE_ENDLINE ) )
            // InternalIGES.g:404:2: (this_WS_0= RULE_WS ( (lv_type_1_0= RULE_INT ) ) (this_WS_2= RULE_WS )? ( (lv_paramData_3_0= RULE_INT ) ) (this_WS_4= RULE_WS )? ( (lv_structure_5_0= RULE_INT ) ) (this_WS_6= RULE_WS )? ( (lv_lineFont_7_0= RULE_INT ) ) (this_WS_8= RULE_WS )? ( (lv_level_9_0= RULE_INT ) ) (this_WS_10= RULE_WS )? ( (lv_view_11_0= RULE_INT ) ) (this_WS_12= RULE_WS )? ( (lv_TransformMatrix_13_0= RULE_INT ) ) (this_WS_14= RULE_WS )? (this_INT_15= RULE_INT )? (this_WS_16= RULE_WS )? ( (lv_status_17_0= RULE_INT ) ) otherlv_18= 'D' (this_WS_19= RULE_WS )? ( (lv_index_20_0= RULE_INT ) ) this_ENDLINE_21= RULE_ENDLINE (this_WS_22= RULE_WS )? this_INT_23= RULE_INT (this_WS_24= RULE_WS )? ( (lv_lineWeight_25_0= RULE_INT ) ) (this_WS_26= RULE_WS )? ( (lv_color_27_0= RULE_INT ) ) (this_WS_28= RULE_WS )? ( (lv_paramLines_29_0= RULE_INT ) ) (this_WS_30= RULE_WS )? ( (lv_form_31_0= RULE_INT ) ) (this_WS_32= RULE_WS )? ( (lv_entityLabel_33_0= RULE_STRING ) )? (this_WS_34= RULE_WS )? ( (lv_subNum_35_0= RULE_INT ) ) otherlv_36= 'D' (this_WS_37= RULE_WS )? this_INT_38= RULE_INT this_ENDLINE_39= RULE_ENDLINE )
            {
            // InternalIGES.g:404:2: (this_WS_0= RULE_WS ( (lv_type_1_0= RULE_INT ) ) (this_WS_2= RULE_WS )? ( (lv_paramData_3_0= RULE_INT ) ) (this_WS_4= RULE_WS )? ( (lv_structure_5_0= RULE_INT ) ) (this_WS_6= RULE_WS )? ( (lv_lineFont_7_0= RULE_INT ) ) (this_WS_8= RULE_WS )? ( (lv_level_9_0= RULE_INT ) ) (this_WS_10= RULE_WS )? ( (lv_view_11_0= RULE_INT ) ) (this_WS_12= RULE_WS )? ( (lv_TransformMatrix_13_0= RULE_INT ) ) (this_WS_14= RULE_WS )? (this_INT_15= RULE_INT )? (this_WS_16= RULE_WS )? ( (lv_status_17_0= RULE_INT ) ) otherlv_18= 'D' (this_WS_19= RULE_WS )? ( (lv_index_20_0= RULE_INT ) ) this_ENDLINE_21= RULE_ENDLINE (this_WS_22= RULE_WS )? this_INT_23= RULE_INT (this_WS_24= RULE_WS )? ( (lv_lineWeight_25_0= RULE_INT ) ) (this_WS_26= RULE_WS )? ( (lv_color_27_0= RULE_INT ) ) (this_WS_28= RULE_WS )? ( (lv_paramLines_29_0= RULE_INT ) ) (this_WS_30= RULE_WS )? ( (lv_form_31_0= RULE_INT ) ) (this_WS_32= RULE_WS )? ( (lv_entityLabel_33_0= RULE_STRING ) )? (this_WS_34= RULE_WS )? ( (lv_subNum_35_0= RULE_INT ) ) otherlv_36= 'D' (this_WS_37= RULE_WS )? this_INT_38= RULE_INT this_ENDLINE_39= RULE_ENDLINE )
            // InternalIGES.g:405:3: this_WS_0= RULE_WS ( (lv_type_1_0= RULE_INT ) ) (this_WS_2= RULE_WS )? ( (lv_paramData_3_0= RULE_INT ) ) (this_WS_4= RULE_WS )? ( (lv_structure_5_0= RULE_INT ) ) (this_WS_6= RULE_WS )? ( (lv_lineFont_7_0= RULE_INT ) ) (this_WS_8= RULE_WS )? ( (lv_level_9_0= RULE_INT ) ) (this_WS_10= RULE_WS )? ( (lv_view_11_0= RULE_INT ) ) (this_WS_12= RULE_WS )? ( (lv_TransformMatrix_13_0= RULE_INT ) ) (this_WS_14= RULE_WS )? (this_INT_15= RULE_INT )? (this_WS_16= RULE_WS )? ( (lv_status_17_0= RULE_INT ) ) otherlv_18= 'D' (this_WS_19= RULE_WS )? ( (lv_index_20_0= RULE_INT ) ) this_ENDLINE_21= RULE_ENDLINE (this_WS_22= RULE_WS )? this_INT_23= RULE_INT (this_WS_24= RULE_WS )? ( (lv_lineWeight_25_0= RULE_INT ) ) (this_WS_26= RULE_WS )? ( (lv_color_27_0= RULE_INT ) ) (this_WS_28= RULE_WS )? ( (lv_paramLines_29_0= RULE_INT ) ) (this_WS_30= RULE_WS )? ( (lv_form_31_0= RULE_INT ) ) (this_WS_32= RULE_WS )? ( (lv_entityLabel_33_0= RULE_STRING ) )? (this_WS_34= RULE_WS )? ( (lv_subNum_35_0= RULE_INT ) ) otherlv_36= 'D' (this_WS_37= RULE_WS )? this_INT_38= RULE_INT this_ENDLINE_39= RULE_ENDLINE
            {
            this_WS_0=(Token)match(input,RULE_WS,FOLLOW_5); 

            			newLeafNode(this_WS_0, grammarAccess.getEntryAccess().getWSTerminalRuleCall_0());
            		
            // InternalIGES.g:409:3: ( (lv_type_1_0= RULE_INT ) )
            // InternalIGES.g:410:4: (lv_type_1_0= RULE_INT )
            {
            // InternalIGES.g:410:4: (lv_type_1_0= RULE_INT )
            // InternalIGES.g:411:5: lv_type_1_0= RULE_INT
            {
            lv_type_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_type_1_0, grammarAccess.getEntryAccess().getTypeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:427:3: (this_WS_2= RULE_WS )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_WS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIGES.g:428:4: this_WS_2= RULE_WS
                    {
                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_2, grammarAccess.getEntryAccess().getWSTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalIGES.g:433:3: ( (lv_paramData_3_0= RULE_INT ) )
            // InternalIGES.g:434:4: (lv_paramData_3_0= RULE_INT )
            {
            // InternalIGES.g:434:4: (lv_paramData_3_0= RULE_INT )
            // InternalIGES.g:435:5: lv_paramData_3_0= RULE_INT
            {
            lv_paramData_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_paramData_3_0, grammarAccess.getEntryAccess().getParamDataINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"paramData",
            						lv_paramData_3_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:451:3: (this_WS_4= RULE_WS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_WS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIGES.g:452:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_4, grammarAccess.getEntryAccess().getWSTerminalRuleCall_4());
                    			

                    }
                    break;

            }

            // InternalIGES.g:457:3: ( (lv_structure_5_0= RULE_INT ) )
            // InternalIGES.g:458:4: (lv_structure_5_0= RULE_INT )
            {
            // InternalIGES.g:458:4: (lv_structure_5_0= RULE_INT )
            // InternalIGES.g:459:5: lv_structure_5_0= RULE_INT
            {
            lv_structure_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_structure_5_0, grammarAccess.getEntryAccess().getStructureINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"structure",
            						lv_structure_5_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:475:3: (this_WS_6= RULE_WS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_WS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIGES.g:476:4: this_WS_6= RULE_WS
                    {
                    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_6, grammarAccess.getEntryAccess().getWSTerminalRuleCall_6());
                    			

                    }
                    break;

            }

            // InternalIGES.g:481:3: ( (lv_lineFont_7_0= RULE_INT ) )
            // InternalIGES.g:482:4: (lv_lineFont_7_0= RULE_INT )
            {
            // InternalIGES.g:482:4: (lv_lineFont_7_0= RULE_INT )
            // InternalIGES.g:483:5: lv_lineFont_7_0= RULE_INT
            {
            lv_lineFont_7_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_lineFont_7_0, grammarAccess.getEntryAccess().getLineFontINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineFont",
            						lv_lineFont_7_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:499:3: (this_WS_8= RULE_WS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_WS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIGES.g:500:4: this_WS_8= RULE_WS
                    {
                    this_WS_8=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_8, grammarAccess.getEntryAccess().getWSTerminalRuleCall_8());
                    			

                    }
                    break;

            }

            // InternalIGES.g:505:3: ( (lv_level_9_0= RULE_INT ) )
            // InternalIGES.g:506:4: (lv_level_9_0= RULE_INT )
            {
            // InternalIGES.g:506:4: (lv_level_9_0= RULE_INT )
            // InternalIGES.g:507:5: lv_level_9_0= RULE_INT
            {
            lv_level_9_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_level_9_0, grammarAccess.getEntryAccess().getLevelINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_9_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:523:3: (this_WS_10= RULE_WS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_WS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIGES.g:524:4: this_WS_10= RULE_WS
                    {
                    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_10, grammarAccess.getEntryAccess().getWSTerminalRuleCall_10());
                    			

                    }
                    break;

            }

            // InternalIGES.g:529:3: ( (lv_view_11_0= RULE_INT ) )
            // InternalIGES.g:530:4: (lv_view_11_0= RULE_INT )
            {
            // InternalIGES.g:530:4: (lv_view_11_0= RULE_INT )
            // InternalIGES.g:531:5: lv_view_11_0= RULE_INT
            {
            lv_view_11_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_view_11_0, grammarAccess.getEntryAccess().getViewINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"view",
            						lv_view_11_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:547:3: (this_WS_12= RULE_WS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_WS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIGES.g:548:4: this_WS_12= RULE_WS
                    {
                    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_12, grammarAccess.getEntryAccess().getWSTerminalRuleCall_12());
                    			

                    }
                    break;

            }

            // InternalIGES.g:553:3: ( (lv_TransformMatrix_13_0= RULE_INT ) )
            // InternalIGES.g:554:4: (lv_TransformMatrix_13_0= RULE_INT )
            {
            // InternalIGES.g:554:4: (lv_TransformMatrix_13_0= RULE_INT )
            // InternalIGES.g:555:5: lv_TransformMatrix_13_0= RULE_INT
            {
            lv_TransformMatrix_13_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_TransformMatrix_13_0, grammarAccess.getEntryAccess().getTransformMatrixINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"TransformMatrix",
            						lv_TransformMatrix_13_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:571:3: (this_WS_14= RULE_WS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_WS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIGES.g:572:4: this_WS_14= RULE_WS
                    {
                    this_WS_14=(Token)match(input,RULE_WS,FOLLOW_10); 

                    				newLeafNode(this_WS_14, grammarAccess.getEntryAccess().getWSTerminalRuleCall_14());
                    			

                    }
                    break;

            }

            // InternalIGES.g:577:3: (this_INT_15= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=RULE_WS && LA20_1<=RULE_INT)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalIGES.g:578:4: this_INT_15= RULE_INT
                    {
                    this_INT_15=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				newLeafNode(this_INT_15, grammarAccess.getEntryAccess().getINTTerminalRuleCall_15());
                    			

                    }
                    break;

            }

            // InternalIGES.g:583:3: (this_WS_16= RULE_WS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_WS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalIGES.g:584:4: this_WS_16= RULE_WS
                    {
                    this_WS_16=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_16, grammarAccess.getEntryAccess().getWSTerminalRuleCall_16());
                    			

                    }
                    break;

            }

            // InternalIGES.g:589:3: ( (lv_status_17_0= RULE_INT ) )
            // InternalIGES.g:590:4: (lv_status_17_0= RULE_INT )
            {
            // InternalIGES.g:590:4: (lv_status_17_0= RULE_INT )
            // InternalIGES.g:591:5: lv_status_17_0= RULE_INT
            {
            lv_status_17_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_status_17_0, grammarAccess.getEntryAccess().getStatusINTTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"status",
            						lv_status_17_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_18, grammarAccess.getEntryAccess().getDKeyword_18());
            		
            // InternalIGES.g:611:3: (this_WS_19= RULE_WS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_WS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIGES.g:612:4: this_WS_19= RULE_WS
                    {
                    this_WS_19=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_19, grammarAccess.getEntryAccess().getWSTerminalRuleCall_19());
                    			

                    }
                    break;

            }

            // InternalIGES.g:617:3: ( (lv_index_20_0= RULE_INT ) )
            // InternalIGES.g:618:4: (lv_index_20_0= RULE_INT )
            {
            // InternalIGES.g:618:4: (lv_index_20_0= RULE_INT )
            // InternalIGES.g:619:5: lv_index_20_0= RULE_INT
            {
            lv_index_20_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_index_20_0, grammarAccess.getEntryAccess().getIndexINTTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_20_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            this_ENDLINE_21=(Token)match(input,RULE_ENDLINE,FOLLOW_10); 

            			newLeafNode(this_ENDLINE_21, grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_21());
            		
            // InternalIGES.g:639:3: (this_WS_22= RULE_WS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_WS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIGES.g:640:4: this_WS_22= RULE_WS
                    {
                    this_WS_22=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_22, grammarAccess.getEntryAccess().getWSTerminalRuleCall_22());
                    			

                    }
                    break;

            }

            this_INT_23=(Token)match(input,RULE_INT,FOLLOW_10); 

            			newLeafNode(this_INT_23, grammarAccess.getEntryAccess().getINTTerminalRuleCall_23());
            		
            // InternalIGES.g:649:3: (this_WS_24= RULE_WS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_WS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIGES.g:650:4: this_WS_24= RULE_WS
                    {
                    this_WS_24=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_24, grammarAccess.getEntryAccess().getWSTerminalRuleCall_24());
                    			

                    }
                    break;

            }

            // InternalIGES.g:655:3: ( (lv_lineWeight_25_0= RULE_INT ) )
            // InternalIGES.g:656:4: (lv_lineWeight_25_0= RULE_INT )
            {
            // InternalIGES.g:656:4: (lv_lineWeight_25_0= RULE_INT )
            // InternalIGES.g:657:5: lv_lineWeight_25_0= RULE_INT
            {
            lv_lineWeight_25_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_lineWeight_25_0, grammarAccess.getEntryAccess().getLineWeightINTTerminalRuleCall_25_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lineWeight",
            						lv_lineWeight_25_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:673:3: (this_WS_26= RULE_WS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_WS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIGES.g:674:4: this_WS_26= RULE_WS
                    {
                    this_WS_26=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_26, grammarAccess.getEntryAccess().getWSTerminalRuleCall_26());
                    			

                    }
                    break;

            }

            // InternalIGES.g:679:3: ( (lv_color_27_0= RULE_INT ) )
            // InternalIGES.g:680:4: (lv_color_27_0= RULE_INT )
            {
            // InternalIGES.g:680:4: (lv_color_27_0= RULE_INT )
            // InternalIGES.g:681:5: lv_color_27_0= RULE_INT
            {
            lv_color_27_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_color_27_0, grammarAccess.getEntryAccess().getColorINTTerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"color",
            						lv_color_27_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:697:3: (this_WS_28= RULE_WS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_WS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalIGES.g:698:4: this_WS_28= RULE_WS
                    {
                    this_WS_28=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_28, grammarAccess.getEntryAccess().getWSTerminalRuleCall_28());
                    			

                    }
                    break;

            }

            // InternalIGES.g:703:3: ( (lv_paramLines_29_0= RULE_INT ) )
            // InternalIGES.g:704:4: (lv_paramLines_29_0= RULE_INT )
            {
            // InternalIGES.g:704:4: (lv_paramLines_29_0= RULE_INT )
            // InternalIGES.g:705:5: lv_paramLines_29_0= RULE_INT
            {
            lv_paramLines_29_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_paramLines_29_0, grammarAccess.getEntryAccess().getParamLinesINTTerminalRuleCall_29_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"paramLines",
            						lv_paramLines_29_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:721:3: (this_WS_30= RULE_WS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_WS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalIGES.g:722:4: this_WS_30= RULE_WS
                    {
                    this_WS_30=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_30, grammarAccess.getEntryAccess().getWSTerminalRuleCall_30());
                    			

                    }
                    break;

            }

            // InternalIGES.g:727:3: ( (lv_form_31_0= RULE_INT ) )
            // InternalIGES.g:728:4: (lv_form_31_0= RULE_INT )
            {
            // InternalIGES.g:728:4: (lv_form_31_0= RULE_INT )
            // InternalIGES.g:729:5: lv_form_31_0= RULE_INT
            {
            lv_form_31_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_form_31_0, grammarAccess.getEntryAccess().getFormINTTerminalRuleCall_31_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"form",
            						lv_form_31_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:745:3: (this_WS_32= RULE_WS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_WS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalIGES.g:746:4: this_WS_32= RULE_WS
                    {
                    this_WS_32=(Token)match(input,RULE_WS,FOLLOW_17); 

                    				newLeafNode(this_WS_32, grammarAccess.getEntryAccess().getWSTerminalRuleCall_32());
                    			

                    }
                    break;

            }

            // InternalIGES.g:751:3: ( (lv_entityLabel_33_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalIGES.g:752:4: (lv_entityLabel_33_0= RULE_STRING )
                    {
                    // InternalIGES.g:752:4: (lv_entityLabel_33_0= RULE_STRING )
                    // InternalIGES.g:753:5: lv_entityLabel_33_0= RULE_STRING
                    {
                    lv_entityLabel_33_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    					newLeafNode(lv_entityLabel_33_0, grammarAccess.getEntryAccess().getEntityLabelSTRINGTerminalRuleCall_33_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"entityLabel",
                    						lv_entityLabel_33_0,
                    						"org.eclipse.january.geometry.xtext.IGES.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalIGES.g:769:3: (this_WS_34= RULE_WS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_WS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalIGES.g:770:4: this_WS_34= RULE_WS
                    {
                    this_WS_34=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_34, grammarAccess.getEntryAccess().getWSTerminalRuleCall_34());
                    			

                    }
                    break;

            }

            // InternalIGES.g:775:3: ( (lv_subNum_35_0= RULE_INT ) )
            // InternalIGES.g:776:4: (lv_subNum_35_0= RULE_INT )
            {
            // InternalIGES.g:776:4: (lv_subNum_35_0= RULE_INT )
            // InternalIGES.g:777:5: lv_subNum_35_0= RULE_INT
            {
            lv_subNum_35_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_subNum_35_0, grammarAccess.getEntryAccess().getSubNumINTTerminalRuleCall_35_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subNum",
            						lv_subNum_35_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            otherlv_36=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_36, grammarAccess.getEntryAccess().getDKeyword_36());
            		
            // InternalIGES.g:797:3: (this_WS_37= RULE_WS )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_WS) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalIGES.g:798:4: this_WS_37= RULE_WS
                    {
                    this_WS_37=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_37, grammarAccess.getEntryAccess().getWSTerminalRuleCall_37());
                    			

                    }
                    break;

            }

            this_INT_38=(Token)match(input,RULE_INT,FOLLOW_11); 

            			newLeafNode(this_INT_38, grammarAccess.getEntryAccess().getINTTerminalRuleCall_38());
            		
            this_ENDLINE_39=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_39, grammarAccess.getEntryAccess().getENDLINETerminalRuleCall_39());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleParameters"
    // InternalIGES.g:815:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalIGES.g:815:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalIGES.g:816:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalIGES.g:822:1: ruleParameters returns [EObject current=null] : ( ( (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry ) ) )+ ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        EObject lv_entries_0_1 = null;

        EObject lv_entries_0_2 = null;



        	enterRule();

        try {
            // InternalIGES.g:828:2: ( ( ( (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry ) ) )+ )
            // InternalIGES.g:829:2: ( ( (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry ) ) )+
            {
            // InternalIGES.g:829:2: ( ( (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalIGES.g:830:3: ( (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry ) )
            	    {
            	    // InternalIGES.g:830:3: ( (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry ) )
            	    // InternalIGES.g:831:4: (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry )
            	    {
            	    // InternalIGES.g:831:4: (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry )
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // InternalIGES.g:832:5: lv_entries_0_1= rulePMultiEntry
            	            {

            	            					newCompositeNode(grammarAccess.getParametersAccess().getEntriesPMultiEntryParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_18);
            	            lv_entries_0_1=rulePMultiEntry();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getParametersRule());
            	            					}
            	            					add(
            	            						current,
            	            						"entries",
            	            						lv_entries_0_1,
            	            						"org.eclipse.january.geometry.xtext.IGES.PMultiEntry");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalIGES.g:848:5: lv_entries_0_2= rulePEntry
            	            {

            	            					newCompositeNode(grammarAccess.getParametersAccess().getEntriesPEntryParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_18);
            	            lv_entries_0_2=rulePEntry();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getParametersRule());
            	            					}
            	            					add(
            	            						current,
            	            						"entries",
            	            						lv_entries_0_2,
            	            						"org.eclipse.january.geometry.xtext.IGES.PEntry");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRulePEntry"
    // InternalIGES.g:869:1: entryRulePEntry returns [EObject current=null] : iv_rulePEntry= rulePEntry EOF ;
    public final EObject entryRulePEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePEntry = null;


        try {
            // InternalIGES.g:869:47: (iv_rulePEntry= rulePEntry EOF )
            // InternalIGES.g:870:2: iv_rulePEntry= rulePEntry EOF
            {
             newCompositeNode(grammarAccess.getPEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePEntry=rulePEntry();

            state._fsp--;

             current =iv_rulePEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePEntry"


    // $ANTLR start "rulePEntry"
    // InternalIGES.g:876:1: rulePEntry returns [EObject current=null] : ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( (lv_values_2_0= ruleValue ) )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )? ( (lv_dIndex_5_0= RULE_INT ) ) otherlv_6= 'P' (this_WS_7= RULE_WS )? ( (lv_indicies_8_0= RULE_INT ) ) this_ENDLINE_9= RULE_ENDLINE ) ;
    public final EObject rulePEntry() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token this_DELIMITER_1=null;
        Token this_SEPARATOR_3=null;
        Token this_WS_4=null;
        Token lv_dIndex_5_0=null;
        Token otherlv_6=null;
        Token this_WS_7=null;
        Token lv_indicies_8_0=null;
        Token this_ENDLINE_9=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalIGES.g:882:2: ( ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( (lv_values_2_0= ruleValue ) )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )? ( (lv_dIndex_5_0= RULE_INT ) ) otherlv_6= 'P' (this_WS_7= RULE_WS )? ( (lv_indicies_8_0= RULE_INT ) ) this_ENDLINE_9= RULE_ENDLINE ) )
            // InternalIGES.g:883:2: ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( (lv_values_2_0= ruleValue ) )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )? ( (lv_dIndex_5_0= RULE_INT ) ) otherlv_6= 'P' (this_WS_7= RULE_WS )? ( (lv_indicies_8_0= RULE_INT ) ) this_ENDLINE_9= RULE_ENDLINE )
            {
            // InternalIGES.g:883:2: ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( (lv_values_2_0= ruleValue ) )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )? ( (lv_dIndex_5_0= RULE_INT ) ) otherlv_6= 'P' (this_WS_7= RULE_WS )? ( (lv_indicies_8_0= RULE_INT ) ) this_ENDLINE_9= RULE_ENDLINE )
            // InternalIGES.g:884:3: ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( (lv_values_2_0= ruleValue ) )* this_SEPARATOR_3= RULE_SEPARATOR (this_WS_4= RULE_WS )? ( (lv_dIndex_5_0= RULE_INT ) ) otherlv_6= 'P' (this_WS_7= RULE_WS )? ( (lv_indicies_8_0= RULE_INT ) ) this_ENDLINE_9= RULE_ENDLINE
            {
            // InternalIGES.g:884:3: ( (lv_type_0_0= RULE_INT ) )
            // InternalIGES.g:885:4: (lv_type_0_0= RULE_INT )
            {
            // InternalIGES.g:885:4: (lv_type_0_0= RULE_INT )
            // InternalIGES.g:886:5: lv_type_0_0= RULE_INT
            {
            lv_type_0_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_type_0_0, grammarAccess.getPEntryAccess().getTypeINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:902:3: (this_DELIMITER_1= RULE_DELIMITER )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_DELIMITER) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalIGES.g:903:4: this_DELIMITER_1= RULE_DELIMITER
                    {
                    this_DELIMITER_1=(Token)match(input,RULE_DELIMITER,FOLLOW_13); 

                    				newLeafNode(this_DELIMITER_1, grammarAccess.getPEntryAccess().getDELIMITERTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalIGES.g:908:3: ( (lv_values_2_0= ruleValue ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_INT||(LA35_0>=RULE_HOLLERITH && LA35_0<=RULE_DOUBLE)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalIGES.g:909:4: (lv_values_2_0= ruleValue )
            	    {
            	    // InternalIGES.g:909:4: (lv_values_2_0= ruleValue )
            	    // InternalIGES.g:910:5: lv_values_2_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getPEntryAccess().getValuesValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_values_2_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPEntryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_2_0,
            	    						"org.eclipse.january.geometry.xtext.IGES.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_10); 

            			newLeafNode(this_SEPARATOR_3, grammarAccess.getPEntryAccess().getSEPARATORTerminalRuleCall_3());
            		
            // InternalIGES.g:931:3: (this_WS_4= RULE_WS )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_WS) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIGES.g:932:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_4, grammarAccess.getPEntryAccess().getWSTerminalRuleCall_4());
                    			

                    }
                    break;

            }

            // InternalIGES.g:937:3: ( (lv_dIndex_5_0= RULE_INT ) )
            // InternalIGES.g:938:4: (lv_dIndex_5_0= RULE_INT )
            {
            // InternalIGES.g:938:4: (lv_dIndex_5_0= RULE_INT )
            // InternalIGES.g:939:5: lv_dIndex_5_0= RULE_INT
            {
            lv_dIndex_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_dIndex_5_0, grammarAccess.getPEntryAccess().getDIndexINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dIndex",
            						lv_dIndex_5_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getPEntryAccess().getPKeyword_6());
            		
            // InternalIGES.g:959:3: (this_WS_7= RULE_WS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_WS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIGES.g:960:4: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_7, grammarAccess.getPEntryAccess().getWSTerminalRuleCall_7());
                    			

                    }
                    break;

            }

            // InternalIGES.g:965:3: ( (lv_indicies_8_0= RULE_INT ) )
            // InternalIGES.g:966:4: (lv_indicies_8_0= RULE_INT )
            {
            // InternalIGES.g:966:4: (lv_indicies_8_0= RULE_INT )
            // InternalIGES.g:967:5: lv_indicies_8_0= RULE_INT
            {
            lv_indicies_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_indicies_8_0, grammarAccess.getPEntryAccess().getIndiciesINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPEntryRule());
            					}
            					addWithLastConsumed(
            						current,
            						"indicies",
            						lv_indicies_8_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            this_ENDLINE_9=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_9, grammarAccess.getPEntryAccess().getENDLINETerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePEntry"


    // $ANTLR start "entryRulePMultiEntry"
    // InternalIGES.g:991:1: entryRulePMultiEntry returns [EObject current=null] : iv_rulePMultiEntry= rulePMultiEntry EOF ;
    public final EObject entryRulePMultiEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePMultiEntry = null;


        try {
            // InternalIGES.g:991:52: (iv_rulePMultiEntry= rulePMultiEntry EOF )
            // InternalIGES.g:992:2: iv_rulePMultiEntry= rulePMultiEntry EOF
            {
             newCompositeNode(grammarAccess.getPMultiEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePMultiEntry=rulePMultiEntry();

            state._fsp--;

             current =iv_rulePMultiEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePMultiEntry"


    // $ANTLR start "rulePMultiEntry"
    // InternalIGES.g:998:1: rulePMultiEntry returns [EObject current=null] : ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE )+ ( (lv_values_9_0= ruleValue ) )* this_SEPARATOR_10= RULE_SEPARATOR (this_WS_11= RULE_WS )? this_INT_12= RULE_INT otherlv_13= 'P' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE ) ;
    public final EObject rulePMultiEntry() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token this_DELIMITER_1=null;
        Token this_WS_3=null;
        Token lv_dIndex_4_0=null;
        Token otherlv_5=null;
        Token this_WS_6=null;
        Token lv_indicies_7_0=null;
        Token this_ENDLINE_8=null;
        Token this_SEPARATOR_10=null;
        Token this_WS_11=null;
        Token this_INT_12=null;
        Token otherlv_13=null;
        Token this_WS_14=null;
        Token this_INT_15=null;
        Token this_ENDLINE_16=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_9_0 = null;



        	enterRule();

        try {
            // InternalIGES.g:1004:2: ( ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE )+ ( (lv_values_9_0= ruleValue ) )* this_SEPARATOR_10= RULE_SEPARATOR (this_WS_11= RULE_WS )? this_INT_12= RULE_INT otherlv_13= 'P' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE ) )
            // InternalIGES.g:1005:2: ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE )+ ( (lv_values_9_0= ruleValue ) )* this_SEPARATOR_10= RULE_SEPARATOR (this_WS_11= RULE_WS )? this_INT_12= RULE_INT otherlv_13= 'P' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE )
            {
            // InternalIGES.g:1005:2: ( ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE )+ ( (lv_values_9_0= ruleValue ) )* this_SEPARATOR_10= RULE_SEPARATOR (this_WS_11= RULE_WS )? this_INT_12= RULE_INT otherlv_13= 'P' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE )
            // InternalIGES.g:1006:3: ( (lv_type_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ( ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE )+ ( (lv_values_9_0= ruleValue ) )* this_SEPARATOR_10= RULE_SEPARATOR (this_WS_11= RULE_WS )? this_INT_12= RULE_INT otherlv_13= 'P' (this_WS_14= RULE_WS )? this_INT_15= RULE_INT this_ENDLINE_16= RULE_ENDLINE
            {
            // InternalIGES.g:1006:3: ( (lv_type_0_0= RULE_INT ) )
            // InternalIGES.g:1007:4: (lv_type_0_0= RULE_INT )
            {
            // InternalIGES.g:1007:4: (lv_type_0_0= RULE_INT )
            // InternalIGES.g:1008:5: lv_type_0_0= RULE_INT
            {
            lv_type_0_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_type_0_0, grammarAccess.getPMultiEntryAccess().getTypeINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPMultiEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:1024:3: (this_DELIMITER_1= RULE_DELIMITER )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_DELIMITER) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIGES.g:1025:4: this_DELIMITER_1= RULE_DELIMITER
                    {
                    this_DELIMITER_1=(Token)match(input,RULE_DELIMITER,FOLLOW_22); 

                    				newLeafNode(this_DELIMITER_1, grammarAccess.getPMultiEntryAccess().getDELIMITERTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalIGES.g:1030:3: ( ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // InternalIGES.g:1031:4: ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE
            	    {
            	    // InternalIGES.g:1031:4: ( (lv_values_2_0= ruleValue ) )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==RULE_INT) ) {
            	            int LA39_2 = input.LA(2);

            	            if ( ((LA39_2>=RULE_DELIMITER && LA39_2<=RULE_INT)||(LA39_2>=RULE_HOLLERITH && LA39_2<=RULE_DOUBLE)) ) {
            	                alt39=1;
            	            }


            	        }
            	        else if ( ((LA39_0>=RULE_HOLLERITH && LA39_0<=RULE_DOUBLE)) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // InternalIGES.g:1032:5: (lv_values_2_0= ruleValue )
            	    	    {
            	    	    // InternalIGES.g:1032:5: (lv_values_2_0= ruleValue )
            	    	    // InternalIGES.g:1033:6: lv_values_2_0= ruleValue
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_2_0_0());
            	    	    					
            	    	    pushFollow(FOLLOW_22);
            	    	    lv_values_2_0=ruleValue();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getPMultiEntryRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"values",
            	    	    							lv_values_2_0,
            	    	    							"org.eclipse.january.geometry.xtext.IGES.Value");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);

            	    // InternalIGES.g:1050:4: (this_WS_3= RULE_WS )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_WS) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalIGES.g:1051:5: this_WS_3= RULE_WS
            	            {
            	            this_WS_3=(Token)match(input,RULE_WS,FOLLOW_5); 

            	            					newLeafNode(this_WS_3, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalIGES.g:1056:4: ( (lv_dIndex_4_0= RULE_INT ) )
            	    // InternalIGES.g:1057:5: (lv_dIndex_4_0= RULE_INT )
            	    {
            	    // InternalIGES.g:1057:5: (lv_dIndex_4_0= RULE_INT )
            	    // InternalIGES.g:1058:6: lv_dIndex_4_0= RULE_INT
            	    {
            	    lv_dIndex_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            	    						newLeafNode(lv_dIndex_4_0, grammarAccess.getPMultiEntryAccess().getDIndexINTTerminalRuleCall_2_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPMultiEntryRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"dIndex",
            	    							lv_dIndex_4_0,
            	    							"org.eclipse.january.geometry.xtext.IGES.INT");
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPMultiEntryAccess().getPKeyword_2_3());
            	    			
            	    // InternalIGES.g:1078:4: (this_WS_6= RULE_WS )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==RULE_WS) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalIGES.g:1079:5: this_WS_6= RULE_WS
            	            {
            	            this_WS_6=(Token)match(input,RULE_WS,FOLLOW_5); 

            	            					newLeafNode(this_WS_6, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_2_4());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalIGES.g:1084:4: ( (lv_indicies_7_0= RULE_INT ) )
            	    // InternalIGES.g:1085:5: (lv_indicies_7_0= RULE_INT )
            	    {
            	    // InternalIGES.g:1085:5: (lv_indicies_7_0= RULE_INT )
            	    // InternalIGES.g:1086:6: lv_indicies_7_0= RULE_INT
            	    {
            	    lv_indicies_7_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            	    						newLeafNode(lv_indicies_7_0, grammarAccess.getPMultiEntryAccess().getIndiciesINTTerminalRuleCall_2_5_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPMultiEntryRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"indicies",
            	    							lv_indicies_7_0,
            	    							"org.eclipse.january.geometry.xtext.IGES.INT");
            	    					

            	    }


            	    }

            	    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_23); 

            	    				newLeafNode(this_ENDLINE_8, grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_2_6());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // InternalIGES.g:1107:3: ( (lv_values_9_0= ruleValue ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_INT||(LA43_0>=RULE_HOLLERITH && LA43_0<=RULE_DOUBLE)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalIGES.g:1108:4: (lv_values_9_0= ruleValue )
            	    {
            	    // InternalIGES.g:1108:4: (lv_values_9_0= ruleValue )
            	    // InternalIGES.g:1109:5: lv_values_9_0= ruleValue
            	    {

            	    					newCompositeNode(grammarAccess.getPMultiEntryAccess().getValuesValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_values_9_0=ruleValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPMultiEntryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_9_0,
            	    						"org.eclipse.january.geometry.xtext.IGES.Value");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            this_SEPARATOR_10=(Token)match(input,RULE_SEPARATOR,FOLLOW_10); 

            			newLeafNode(this_SEPARATOR_10, grammarAccess.getPMultiEntryAccess().getSEPARATORTerminalRuleCall_4());
            		
            // InternalIGES.g:1130:3: (this_WS_11= RULE_WS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_WS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalIGES.g:1131:4: this_WS_11= RULE_WS
                    {
                    this_WS_11=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_11, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_5());
                    			

                    }
                    break;

            }

            this_INT_12=(Token)match(input,RULE_INT,FOLLOW_20); 

            			newLeafNode(this_INT_12, grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_6());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getPMultiEntryAccess().getPKeyword_7());
            		
            // InternalIGES.g:1144:3: (this_WS_14= RULE_WS )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_WS) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalIGES.g:1145:4: this_WS_14= RULE_WS
                    {
                    this_WS_14=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_14, grammarAccess.getPMultiEntryAccess().getWSTerminalRuleCall_8());
                    			

                    }
                    break;

            }

            this_INT_15=(Token)match(input,RULE_INT,FOLLOW_11); 

            			newLeafNode(this_INT_15, grammarAccess.getPMultiEntryAccess().getINTTerminalRuleCall_9());
            		
            this_ENDLINE_16=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			newLeafNode(this_ENDLINE_16, grammarAccess.getPMultiEntryAccess().getENDLINETerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePMultiEntry"


    // $ANTLR start "entryRuleValue"
    // InternalIGES.g:1162:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalIGES.g:1162:46: (iv_ruleValue= ruleValue EOF )
            // InternalIGES.g:1163:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalIGES.g:1169:1: ruleValue returns [EObject current=null] : (this_Param_0= ruleParam | this_Pointer_1= rulePointer | this_HString_2= ruleHString ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Param_0 = null;

        EObject this_Pointer_1 = null;

        EObject this_HString_2 = null;



        	enterRule();

        try {
            // InternalIGES.g:1175:2: ( (this_Param_0= ruleParam | this_Pointer_1= rulePointer | this_HString_2= ruleHString ) )
            // InternalIGES.g:1176:2: (this_Param_0= ruleParam | this_Pointer_1= rulePointer | this_HString_2= ruleHString )
            {
            // InternalIGES.g:1176:2: (this_Param_0= ruleParam | this_Pointer_1= rulePointer | this_HString_2= ruleHString )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt46=1;
                }
                break;
            case RULE_INT:
                {
                alt46=2;
                }
                break;
            case RULE_HOLLERITH:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalIGES.g:1177:3: this_Param_0= ruleParam
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getParamParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Param_0=ruleParam();

                    state._fsp--;


                    			current = this_Param_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIGES.g:1186:3: this_Pointer_1= rulePointer
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getPointerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pointer_1=rulePointer();

                    state._fsp--;


                    			current = this_Pointer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIGES.g:1195:3: this_HString_2= ruleHString
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getHStringParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_HString_2=ruleHString();

                    state._fsp--;


                    			current = this_HString_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleHString"
    // InternalIGES.g:1207:1: entryRuleHString returns [EObject current=null] : iv_ruleHString= ruleHString EOF ;
    public final EObject entryRuleHString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHString = null;


        try {
            // InternalIGES.g:1207:48: (iv_ruleHString= ruleHString EOF )
            // InternalIGES.g:1208:2: iv_ruleHString= ruleHString EOF
            {
             newCompositeNode(grammarAccess.getHStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHString=ruleHString();

            state._fsp--;

             current =iv_ruleHString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHString"


    // $ANTLR start "ruleHString"
    // InternalIGES.g:1214:1: ruleHString returns [EObject current=null] : ( ( (lv_val_0_0= RULE_HOLLERITH ) ) (this_DELIMITER_1= RULE_DELIMITER )? ) ;
    public final EObject ruleHString() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token this_DELIMITER_1=null;


        	enterRule();

        try {
            // InternalIGES.g:1220:2: ( ( ( (lv_val_0_0= RULE_HOLLERITH ) ) (this_DELIMITER_1= RULE_DELIMITER )? ) )
            // InternalIGES.g:1221:2: ( ( (lv_val_0_0= RULE_HOLLERITH ) ) (this_DELIMITER_1= RULE_DELIMITER )? )
            {
            // InternalIGES.g:1221:2: ( ( (lv_val_0_0= RULE_HOLLERITH ) ) (this_DELIMITER_1= RULE_DELIMITER )? )
            // InternalIGES.g:1222:3: ( (lv_val_0_0= RULE_HOLLERITH ) ) (this_DELIMITER_1= RULE_DELIMITER )?
            {
            // InternalIGES.g:1222:3: ( (lv_val_0_0= RULE_HOLLERITH ) )
            // InternalIGES.g:1223:4: (lv_val_0_0= RULE_HOLLERITH )
            {
            // InternalIGES.g:1223:4: (lv_val_0_0= RULE_HOLLERITH )
            // InternalIGES.g:1224:5: lv_val_0_0= RULE_HOLLERITH
            {
            lv_val_0_0=(Token)match(input,RULE_HOLLERITH,FOLLOW_24); 

            					newLeafNode(lv_val_0_0, grammarAccess.getHStringAccess().getValHOLLERITHTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.eclipse.january.geometry.xtext.IGES.HOLLERITH");
            				

            }


            }

            // InternalIGES.g:1240:3: (this_DELIMITER_1= RULE_DELIMITER )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DELIMITER) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalIGES.g:1241:4: this_DELIMITER_1= RULE_DELIMITER
                    {
                    this_DELIMITER_1=(Token)match(input,RULE_DELIMITER,FOLLOW_2); 

                    				newLeafNode(this_DELIMITER_1, grammarAccess.getHStringAccess().getDELIMITERTerminalRuleCall_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHString"


    // $ANTLR start "entryRuleParam"
    // InternalIGES.g:1250:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalIGES.g:1250:46: (iv_ruleParam= ruleParam EOF )
            // InternalIGES.g:1251:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalIGES.g:1257:1: ruleParam returns [EObject current=null] : ( ( (lv_val_0_0= RULE_DOUBLE ) ) (this_DELIMITER_1= RULE_DELIMITER )? ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token this_DELIMITER_1=null;


        	enterRule();

        try {
            // InternalIGES.g:1263:2: ( ( ( (lv_val_0_0= RULE_DOUBLE ) ) (this_DELIMITER_1= RULE_DELIMITER )? ) )
            // InternalIGES.g:1264:2: ( ( (lv_val_0_0= RULE_DOUBLE ) ) (this_DELIMITER_1= RULE_DELIMITER )? )
            {
            // InternalIGES.g:1264:2: ( ( (lv_val_0_0= RULE_DOUBLE ) ) (this_DELIMITER_1= RULE_DELIMITER )? )
            // InternalIGES.g:1265:3: ( (lv_val_0_0= RULE_DOUBLE ) ) (this_DELIMITER_1= RULE_DELIMITER )?
            {
            // InternalIGES.g:1265:3: ( (lv_val_0_0= RULE_DOUBLE ) )
            // InternalIGES.g:1266:4: (lv_val_0_0= RULE_DOUBLE )
            {
            // InternalIGES.g:1266:4: (lv_val_0_0= RULE_DOUBLE )
            // InternalIGES.g:1267:5: lv_val_0_0= RULE_DOUBLE
            {
            lv_val_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_24); 

            					newLeafNode(lv_val_0_0, grammarAccess.getParamAccess().getValDOUBLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.eclipse.january.geometry.xtext.IGES.DOUBLE");
            				

            }


            }

            // InternalIGES.g:1283:3: (this_DELIMITER_1= RULE_DELIMITER )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DELIMITER) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalIGES.g:1284:4: this_DELIMITER_1= RULE_DELIMITER
                    {
                    this_DELIMITER_1=(Token)match(input,RULE_DELIMITER,FOLLOW_2); 

                    				newLeafNode(this_DELIMITER_1, grammarAccess.getParamAccess().getDELIMITERTerminalRuleCall_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRulePointer"
    // InternalIGES.g:1293:1: entryRulePointer returns [EObject current=null] : iv_rulePointer= rulePointer EOF ;
    public final EObject entryRulePointer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointer = null;


        try {
            // InternalIGES.g:1293:48: (iv_rulePointer= rulePointer EOF )
            // InternalIGES.g:1294:2: iv_rulePointer= rulePointer EOF
            {
             newCompositeNode(grammarAccess.getPointerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePointer=rulePointer();

            state._fsp--;

             current =iv_rulePointer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointer"


    // $ANTLR start "rulePointer"
    // InternalIGES.g:1300:1: rulePointer returns [EObject current=null] : ( ( (lv_val_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ) ;
    public final EObject rulePointer() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token this_DELIMITER_1=null;


        	enterRule();

        try {
            // InternalIGES.g:1306:2: ( ( ( (lv_val_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? ) )
            // InternalIGES.g:1307:2: ( ( (lv_val_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? )
            {
            // InternalIGES.g:1307:2: ( ( (lv_val_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )? )
            // InternalIGES.g:1308:3: ( (lv_val_0_0= RULE_INT ) ) (this_DELIMITER_1= RULE_DELIMITER )?
            {
            // InternalIGES.g:1308:3: ( (lv_val_0_0= RULE_INT ) )
            // InternalIGES.g:1309:4: (lv_val_0_0= RULE_INT )
            {
            // InternalIGES.g:1309:4: (lv_val_0_0= RULE_INT )
            // InternalIGES.g:1310:5: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_val_0_0, grammarAccess.getPointerAccess().getValINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_0_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            // InternalIGES.g:1326:3: (this_DELIMITER_1= RULE_DELIMITER )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DELIMITER) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalIGES.g:1327:4: this_DELIMITER_1= RULE_DELIMITER
                    {
                    this_DELIMITER_1=(Token)match(input,RULE_DELIMITER,FOLLOW_2); 

                    				newLeafNode(this_DELIMITER_1, grammarAccess.getPointerAccess().getDELIMITERTerminalRuleCall_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointer"


    // $ANTLR start "entryRuleEnd"
    // InternalIGES.g:1336:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalIGES.g:1336:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalIGES.g:1337:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalIGES.g:1343:1: ruleEnd returns [EObject current=null] : (otherlv_0= 'S' (this_WS_1= RULE_WS )? ( (lv_sval_2_0= RULE_INT ) ) otherlv_3= 'G' (this_WS_4= RULE_WS )? ( (lv_gval_5_0= RULE_INT ) ) otherlv_6= 'D' (this_WS_7= RULE_WS )? ( (lv_dval_8_0= RULE_INT ) ) otherlv_9= 'P' (this_WS_10= RULE_WS )? ( (lv_pval_11_0= RULE_INT ) ) this_WS_12= RULE_WS otherlv_13= 'T' (this_WS_14= RULE_WS )? ( (lv_tval_15_0= RULE_INT ) ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_sval_2_0=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token lv_gval_5_0=null;
        Token otherlv_6=null;
        Token this_WS_7=null;
        Token lv_dval_8_0=null;
        Token otherlv_9=null;
        Token this_WS_10=null;
        Token lv_pval_11_0=null;
        Token this_WS_12=null;
        Token otherlv_13=null;
        Token this_WS_14=null;
        Token lv_tval_15_0=null;


        	enterRule();

        try {
            // InternalIGES.g:1349:2: ( (otherlv_0= 'S' (this_WS_1= RULE_WS )? ( (lv_sval_2_0= RULE_INT ) ) otherlv_3= 'G' (this_WS_4= RULE_WS )? ( (lv_gval_5_0= RULE_INT ) ) otherlv_6= 'D' (this_WS_7= RULE_WS )? ( (lv_dval_8_0= RULE_INT ) ) otherlv_9= 'P' (this_WS_10= RULE_WS )? ( (lv_pval_11_0= RULE_INT ) ) this_WS_12= RULE_WS otherlv_13= 'T' (this_WS_14= RULE_WS )? ( (lv_tval_15_0= RULE_INT ) ) ) )
            // InternalIGES.g:1350:2: (otherlv_0= 'S' (this_WS_1= RULE_WS )? ( (lv_sval_2_0= RULE_INT ) ) otherlv_3= 'G' (this_WS_4= RULE_WS )? ( (lv_gval_5_0= RULE_INT ) ) otherlv_6= 'D' (this_WS_7= RULE_WS )? ( (lv_dval_8_0= RULE_INT ) ) otherlv_9= 'P' (this_WS_10= RULE_WS )? ( (lv_pval_11_0= RULE_INT ) ) this_WS_12= RULE_WS otherlv_13= 'T' (this_WS_14= RULE_WS )? ( (lv_tval_15_0= RULE_INT ) ) )
            {
            // InternalIGES.g:1350:2: (otherlv_0= 'S' (this_WS_1= RULE_WS )? ( (lv_sval_2_0= RULE_INT ) ) otherlv_3= 'G' (this_WS_4= RULE_WS )? ( (lv_gval_5_0= RULE_INT ) ) otherlv_6= 'D' (this_WS_7= RULE_WS )? ( (lv_dval_8_0= RULE_INT ) ) otherlv_9= 'P' (this_WS_10= RULE_WS )? ( (lv_pval_11_0= RULE_INT ) ) this_WS_12= RULE_WS otherlv_13= 'T' (this_WS_14= RULE_WS )? ( (lv_tval_15_0= RULE_INT ) ) )
            // InternalIGES.g:1351:3: otherlv_0= 'S' (this_WS_1= RULE_WS )? ( (lv_sval_2_0= RULE_INT ) ) otherlv_3= 'G' (this_WS_4= RULE_WS )? ( (lv_gval_5_0= RULE_INT ) ) otherlv_6= 'D' (this_WS_7= RULE_WS )? ( (lv_dval_8_0= RULE_INT ) ) otherlv_9= 'P' (this_WS_10= RULE_WS )? ( (lv_pval_11_0= RULE_INT ) ) this_WS_12= RULE_WS otherlv_13= 'T' (this_WS_14= RULE_WS )? ( (lv_tval_15_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getSKeyword_0());
            		
            // InternalIGES.g:1355:3: (this_WS_1= RULE_WS )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_WS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalIGES.g:1356:4: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_1, grammarAccess.getEndAccess().getWSTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalIGES.g:1361:3: ( (lv_sval_2_0= RULE_INT ) )
            // InternalIGES.g:1362:4: (lv_sval_2_0= RULE_INT )
            {
            // InternalIGES.g:1362:4: (lv_sval_2_0= RULE_INT )
            // InternalIGES.g:1363:5: lv_sval_2_0= RULE_INT
            {
            lv_sval_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_sval_2_0, grammarAccess.getEndAccess().getSvalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sval",
            						lv_sval_2_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getEndAccess().getGKeyword_3());
            		
            // InternalIGES.g:1383:3: (this_WS_4= RULE_WS )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_WS) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalIGES.g:1384:4: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_4, grammarAccess.getEndAccess().getWSTerminalRuleCall_4());
                    			

                    }
                    break;

            }

            // InternalIGES.g:1389:3: ( (lv_gval_5_0= RULE_INT ) )
            // InternalIGES.g:1390:4: (lv_gval_5_0= RULE_INT )
            {
            // InternalIGES.g:1390:4: (lv_gval_5_0= RULE_INT )
            // InternalIGES.g:1391:5: lv_gval_5_0= RULE_INT
            {
            lv_gval_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_gval_5_0, grammarAccess.getEndAccess().getGvalINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"gval",
            						lv_gval_5_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getEndAccess().getDKeyword_6());
            		
            // InternalIGES.g:1411:3: (this_WS_7= RULE_WS )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_WS) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalIGES.g:1412:4: this_WS_7= RULE_WS
                    {
                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_7, grammarAccess.getEndAccess().getWSTerminalRuleCall_7());
                    			

                    }
                    break;

            }

            // InternalIGES.g:1417:3: ( (lv_dval_8_0= RULE_INT ) )
            // InternalIGES.g:1418:4: (lv_dval_8_0= RULE_INT )
            {
            // InternalIGES.g:1418:4: (lv_dval_8_0= RULE_INT )
            // InternalIGES.g:1419:5: lv_dval_8_0= RULE_INT
            {
            lv_dval_8_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_dval_8_0, grammarAccess.getEndAccess().getDvalINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dval",
            						lv_dval_8_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getEndAccess().getPKeyword_9());
            		
            // InternalIGES.g:1439:3: (this_WS_10= RULE_WS )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_WS) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalIGES.g:1440:4: this_WS_10= RULE_WS
                    {
                    this_WS_10=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_10, grammarAccess.getEndAccess().getWSTerminalRuleCall_10());
                    			

                    }
                    break;

            }

            // InternalIGES.g:1445:3: ( (lv_pval_11_0= RULE_INT ) )
            // InternalIGES.g:1446:4: (lv_pval_11_0= RULE_INT )
            {
            // InternalIGES.g:1446:4: (lv_pval_11_0= RULE_INT )
            // InternalIGES.g:1447:5: lv_pval_11_0= RULE_INT
            {
            lv_pval_11_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_pval_11_0, grammarAccess.getEndAccess().getPvalINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pval",
            						lv_pval_11_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }

            this_WS_12=(Token)match(input,RULE_WS,FOLLOW_25); 

            			newLeafNode(this_WS_12, grammarAccess.getEndAccess().getWSTerminalRuleCall_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getEndAccess().getTKeyword_13());
            		
            // InternalIGES.g:1471:3: (this_WS_14= RULE_WS )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_WS) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalIGES.g:1472:4: this_WS_14= RULE_WS
                    {
                    this_WS_14=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				newLeafNode(this_WS_14, grammarAccess.getEndAccess().getWSTerminalRuleCall_14());
                    			

                    }
                    break;

            }

            // InternalIGES.g:1477:3: ( (lv_tval_15_0= RULE_INT ) )
            // InternalIGES.g:1478:4: (lv_tval_15_0= RULE_INT )
            {
            // InternalIGES.g:1478:4: (lv_tval_15_0= RULE_INT )
            // InternalIGES.g:1479:5: lv_tval_15_0= RULE_INT
            {
            lv_tval_15_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_tval_15_0, grammarAccess.getEndAccess().getTvalINTTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tval",
            						lv_tval_15_0,
            						"org.eclipse.january.geometry.xtext.IGES.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRulestartLine"
    // InternalIGES.g:1499:1: entryRulestartLine returns [String current=null] : iv_rulestartLine= rulestartLine EOF ;
    public final String entryRulestartLine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulestartLine = null;


        try {
            // InternalIGES.g:1499:49: (iv_rulestartLine= rulestartLine EOF )
            // InternalIGES.g:1500:2: iv_rulestartLine= rulestartLine EOF
            {
             newCompositeNode(grammarAccess.getStartLineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestartLine=rulestartLine();

            state._fsp--;

             current =iv_rulestartLine.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestartLine"


    // $ANTLR start "rulestartLine"
    // InternalIGES.g:1506:1: rulestartLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_STRING_0= RULE_STRING | this_WS_1= RULE_WS )* kw= 'S' (this_WS_3= RULE_WS )? this_INT_4= RULE_INT this_ENDLINE_5= RULE_ENDLINE ) ;
    public final AntlrDatatypeRuleToken rulestartLine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_WS_1=null;
        Token kw=null;
        Token this_WS_3=null;
        Token this_INT_4=null;
        Token this_ENDLINE_5=null;


        	enterRule();

        try {
            // InternalIGES.g:1512:2: ( ( (this_STRING_0= RULE_STRING | this_WS_1= RULE_WS )* kw= 'S' (this_WS_3= RULE_WS )? this_INT_4= RULE_INT this_ENDLINE_5= RULE_ENDLINE ) )
            // InternalIGES.g:1513:2: ( (this_STRING_0= RULE_STRING | this_WS_1= RULE_WS )* kw= 'S' (this_WS_3= RULE_WS )? this_INT_4= RULE_INT this_ENDLINE_5= RULE_ENDLINE )
            {
            // InternalIGES.g:1513:2: ( (this_STRING_0= RULE_STRING | this_WS_1= RULE_WS )* kw= 'S' (this_WS_3= RULE_WS )? this_INT_4= RULE_INT this_ENDLINE_5= RULE_ENDLINE )
            // InternalIGES.g:1514:3: (this_STRING_0= RULE_STRING | this_WS_1= RULE_WS )* kw= 'S' (this_WS_3= RULE_WS )? this_INT_4= RULE_INT this_ENDLINE_5= RULE_ENDLINE
            {
            // InternalIGES.g:1514:3: (this_STRING_0= RULE_STRING | this_WS_1= RULE_WS )*
            loop55:
            do {
                int alt55=3;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_STRING) ) {
                    alt55=1;
                }
                else if ( (LA55_0==RULE_WS) ) {
                    alt55=2;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalIGES.g:1515:4: this_STRING_0= RULE_STRING
            	    {
            	    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    				current.merge(this_STRING_0);
            	    			

            	    				newLeafNode(this_STRING_0, grammarAccess.getStartLineAccess().getSTRINGTerminalRuleCall_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalIGES.g:1523:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_26); 

            	    				current.merge(this_WS_1);
            	    			

            	    				newLeafNode(this_WS_1, grammarAccess.getStartLineAccess().getWSTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            kw=(Token)match(input,15,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStartLineAccess().getSKeyword_1());
            		
            // InternalIGES.g:1536:3: (this_WS_3= RULE_WS )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_WS) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalIGES.g:1537:4: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_5); 

                    				current.merge(this_WS_3);
                    			

                    				newLeafNode(this_WS_3, grammarAccess.getStartLineAccess().getWSTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getStartLineAccess().getINTTerminalRuleCall_3());
            		
            this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_2); 

            			current.merge(this_ENDLINE_5);
            		

            			newLeafNode(this_ENDLINE_5, grammarAccess.getStartLineAccess().getENDLINETerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestartLine"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\5\3\4\2\uffff\3\5";
    static final String dfa_3s = "\4\14\2\uffff\3\14";
    static final String dfa_4s = "\4\uffff\1\2\1\1\3\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\6\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\7\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\10\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "",
            "",
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\1\5",
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 258:3: ( ( (lv_values_4_0= ruleValue ) )* (this_WS_5= RULE_WS )? otherlv_6= 'G' (this_WS_7= RULE_WS )? this_INT_8= RULE_INT this_ENDLINE_9= RULE_ENDLINE )+";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\6\1\4\1\5\3\4\2\uffff\3\5";
    static final String dfa_9s = "\1\6\3\13\1\16\1\13\2\uffff\3\13";
    static final String dfa_10s = "\6\uffff\1\1\1\2\3\uffff";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\10\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\11\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3\2\uffff\1\6",
            "\1\12\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3",
            "",
            "",
            "\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3",
            "\1\6\1\4\1\uffff\1\7\1\uffff\1\5\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "831:4: (lv_entries_0_1= rulePMultiEntry | lv_entries_0_2= rulePEntry )";
        }
    }
    static final String dfa_13s = "\2\13\1\16\1\13\2\uffff\3\13";
    static final String[] dfa_14s = {
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1",
            "\1\6\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1",
            "\1\7\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1\2\uffff\1\5",
            "\1\10\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1",
            "",
            "",
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1",
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1",
            "\1\5\1\2\1\uffff\1\4\1\uffff\1\3\1\1"
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_13;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 1030:3: ( ( (lv_values_2_0= ruleValue ) )* (this_WS_3= RULE_WS )? ( (lv_dIndex_4_0= RULE_INT ) ) otherlv_5= 'P' (this_WS_6= RULE_WS )? ( (lv_indicies_7_0= RULE_INT ) ) this_ENDLINE_8= RULE_ENDLINE )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008222L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001C60L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001D60L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000D40L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000260L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000D50L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000C70L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000C60L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000D60L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008220L});

}