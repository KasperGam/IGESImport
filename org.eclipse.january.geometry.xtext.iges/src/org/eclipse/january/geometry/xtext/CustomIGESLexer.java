package org.eclipse.january.geometry.xtext;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CustomIGESLexer extends Lexer {
    public static final int RULE_HOLLERITH=8;
    public static final int RULE_ENDLINE=6;
    public static final int RULE_WS=4;
    public static final int RULE_STRING=7;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=9;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators

    public CustomIGESLexer() {;} 
    public CustomIGESLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomIGESLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalIGES.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:11:7: ( 'G' )
            // InternalIGES.g:11:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:12:7: ( ';' )
            // InternalIGES.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:13:7: ( 'D' )
            // InternalIGES.g:13:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:14:7: ( 'P' )
            // InternalIGES.g:14:9: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:15:7: ( ',' )
            // InternalIGES.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:16:7: ( 'S' )
            // InternalIGES.g:16:9: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:17:7: ( 'T' )
            // InternalIGES.g:17:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1528:10: ( ( '0' .. '9' )+ )
            // InternalIGES.g:1528:12: ( '0' .. '9' )+
            {
            // InternalIGES.g:1528:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIGES.g:1528:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1530:13: ( ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? )
            // InternalIGES.g:1530:15: ( '+' | '-' )? RULE_INT '.' ( RULE_INT )? ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            {
            // InternalIGES.g:1530:15: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalIGES.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INT(); 
            match('.'); 
            // InternalIGES.g:1530:39: ( RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIGES.g:1530:39: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalIGES.g:1530:49: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='E'||LA5_0=='e') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIGES.g:1530:50: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalIGES.g:1530:60: ( '+' | '-' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='+'||LA4_0=='-') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalIGES.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    /**
     * Custom lexer rule for getting Hollerith strings. Is not dictated by the grammar!
     * @author Kasper Gammeltoft
     * @throws RecognitionException
     */
    public final void mRULE_HOLLERITH() throws RecognitionException {
        try {
            int _type = RULE_HOLLERITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1571:16: ( RULE_INT 'H' . . . )
            // InternalIGES.g:1571:18: RULE_INT 'H' . . .
            
            
	    	String curInt = "";
	    	int cur = input.LA(1);
	    	while(cur >= '0' && cur <='9') {
	    		curInt+= (char)cur;
	    		matchRange('0','9');
	    		cur = input.LA(1);
	    	}
	    	int n;
	    	try {
	    		n = Integer.parseInt(curInt);
	    	} catch(Exception e) {
	    		throw new EarlyExitException(1, input);
	    	}	
            	
            match('H');
            
            for(int i=0; i<n; i++) {
            	matchAny(); 
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOLLERITH"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1534:13: ( ( 'A..Z' | 'a' .. 'z' | '0' .. '9' | '\"' )+ )
            // InternalIGES.g:1534:15: ( 'A..Z' | 'a' .. 'z' | '0' .. '9' | '\"' )+
            {
            // InternalIGES.g:1534:15: ( 'A..Z' | 'a' .. 'z' | '0' .. '9' | '\"' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 'A':
                    {
                    alt6=1;
                    }
                    break;
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt6=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt6=3;
                    }
                    break;
                case '\"':
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalIGES.g:1534:16: 'A..Z'
            	    {
            	    match("A..Z"); 


            	    }
            	    break;
            	case 2 :
            	    // InternalIGES.g:1534:23: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalIGES.g:1534:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalIGES.g:1534:41: '\"'
            	    {
            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1536:9: ( ( ' ' | '\\t' | '\\r' )+ )
            // InternalIGES.g:1536:11: ( ' ' | '\\t' | '\\r' )+
            {
            // InternalIGES.g:1536:11: ( ' ' | '\\t' | '\\r' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIGES.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ENDLINE"
    public final void mRULE_ENDLINE() throws RecognitionException {
        try {
            int _type = RULE_ENDLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1538:14: ( ( '\\r' )? '\\n' )
            // InternalIGES.g:1538:16: ( '\\r' )? '\\n'
            {
            // InternalIGES.g:1538:16: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIGES.g:1538:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDLINE"

    public void mTokens() throws RecognitionException {
        // InternalIGES.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_INT | RULE_DOUBLE | RULE_HOLLERITH | RULE_STRING | RULE_WS | RULE_ENDLINE )
        int alt9=13;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // InternalIGES.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // InternalIGES.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // InternalIGES.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // InternalIGES.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // InternalIGES.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // InternalIGES.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // InternalIGES.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // InternalIGES.g:1:52: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalIGES.g:1:61: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 10 :
                // InternalIGES.g:1:73: RULE_HOLLERITH
                {
                mRULE_HOLLERITH(); 

                }
                break;
            case 11 :
                // InternalIGES.g:1:88: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // InternalIGES.g:1:100: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalIGES.g:1:108: RULE_ENDLINE
                {
                mRULE_ENDLINE(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\10\uffff\1\16\2\uffff\1\14\4\uffff";
    static final String DFA9_eofS =
        "\20\uffff";
    static final String DFA9_minS =
        "\1\11\7\uffff\1\42\2\uffff\1\12\4\uffff";
    static final String DFA9_maxS =
        "\1\172\7\uffff\1\172\2\uffff\1\12\4\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\13\1\uffff\1\14\1\15\1\10\1\12";
    static final String DFA9_specialS =
        "\20\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\14\1\15\2\uffff\1\13\22\uffff\1\14\1\uffff\1\12\10\uffff\1\11\1\5\1\11\2\uffff\12\10\1\uffff\1\2\5\uffff\1\12\2\uffff\1\3\2\uffff\1\1\10\uffff\1\4\2\uffff\1\6\1\7\14\uffff\32\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\13\uffff\1\11\1\uffff\12\10\7\uffff\1\12\6\uffff\1\17\30\uffff\32\12",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_INT | RULE_DOUBLE | RULE_HOLLERITH | RULE_STRING | RULE_WS | RULE_ENDLINE );";
        }
    }
 

}