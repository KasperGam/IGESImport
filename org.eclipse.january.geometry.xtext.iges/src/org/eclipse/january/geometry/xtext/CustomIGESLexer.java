package org.eclipse.january.geometry.xtext;

import org.eclipse.january.geometry.xtext.parser.antlr.internal.InternalIGESLexer;
// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CustomIGESLexer extends InternalIGESLexer {

	private String DELIMITER = null;
	private String SEPARATOR = null;
	boolean DELIM_SET = false;

    public CustomIGESLexer() {;} 
    public CustomIGESLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomIGESLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    
    @Override 
    public void mTokens() throws RecognitionException{
    	if (isHollerith()){
    			if (DELIMITER == null) {
    				setDelimiter();
    				DELIM_SET = true;
    			} else if (SEPARATOR == null) {
    				setSEPARATOR();
    			} 
    			RULE_HOLLERITH();
    			
    	} else if (isDelimiter()) {
    		
				RULE_DELIMITER();
				
    	} else if (isSEPARATOR()) {
    		
				RULE_SEPARATOR();
	 	} else {
    		if (isComma() && DELIMITER == null){
        		DELIMITER = ",";
        		super.mRULE_DELIMITER();
    		} else {
    			super.mTokens();	
    		}
    	}
    }
    
    private boolean isDelimiter() {
    	if (DELIMITER == null) {
    		return false;
    	}
    	int index = 0;
    	
    	while(index < DELIMITER.length() && (input.LA(index + 1))==DELIMITER.charAt(index)){
    		index++;
    	}
    	return index == DELIMITER.length();
    }
    
    private boolean isSEPARATOR() {
    	if (SEPARATOR == null) {
    		return false;
    	}
    	int index = 0;
    	
    	while(index < SEPARATOR.length() && (input.LA(index + 1))==SEPARATOR.charAt(index)){
    		index++;
    	}
    	return index == SEPARATOR.length();
    }
    
    
    private void setDelimiter() {
    	String curInt = "";
    	int index = 1;
    	int cur = input.LA(index);
    	while(cur >= '0' && cur <='9') {
    		curInt+= (char)cur;
    		index ++;
    		cur = input.LA(index);
    	}
    	int n;
    	try {
    		n = Integer.parseInt(curInt);
    	} catch(Exception e) {
    		e.printStackTrace();
    		return;
    	}	
        	
    	if (input.LA(index) == 'H'){
    		index ++;
    	} else {
    		return;
    	}
    	DELIMITER = "";
        for(int i=0; i<n; i++) {
        	DELIMITER += (char)input.LA(index+i);
        }
    }
    
    private void setSEPARATOR() {
    	String curInt = "";
    	int index = 1;
    	int cur = input.LA(index);
    	while(cur >= '0' && cur <='9') {
    		curInt+= (char)cur;
    		index ++;
    		cur = input.LA(index);
    	}
    	int n;
    	try {
    		n = Integer.parseInt(curInt);
    	} catch(Exception e) {
    		e.printStackTrace();
    		return;
    	}	
        	
    	if (input.LA(index) == 'H'){
    		index ++;
    	} else {
    		return;
    	}
    	SEPARATOR = "";
        for(int i=0; i<n; i++) {
        	SEPARATOR += (char)input.LA(index+i);
        }

    }
    
    public final void RULE_DELIMITER() throws RecognitionException {
        try {
            int _type = RULE_DELIMITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1540:16: ( ',' )
            // InternalIGES.g:1540:18: ','
            {
            	for(int i=0; i<DELIMITER.length(); i++) {
            		match(String.valueOf(DELIMITER.charAt(i)));
            	}
            	
            	if (SEPARATOR == null && !DELIM_SET) {
            		SEPARATOR = ";";
            	}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DELIMITER"

    // $ANTLR start "RULE_SEPARATOR"
    public final void RULE_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIGES.g:1542:16: ( ';' )
            // InternalIGES.g:1542:18: ';'
            {
            
            	for(int i=0; i<SEPARATOR.length(); i++) {
            		match(String.valueOf(SEPARATOR.charAt(i)));
            	}

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    
    /**
     * Custom lexer rule for getting Hollerith strings. Is not dictated by the grammar!
     * @author Kasper Gammeltoft
     * @throws RecognitionException
     */
    public final void RULE_HOLLERITH() throws RecognitionException {
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
    
    private boolean isHollerith() {
    	
    	int index = isInt();
    	
    	if (index > 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    private int isInt() {  
    	int index = 1;
    	int cur = input.LA(index);
    	
    	while(cur >= '0' && cur <='9'){
    		index++;
    		cur = input.LA(index);
    	}
    	if (index > 1 && cur == 'H'){
    		return index;
    	} else {
    		return -1;
    	}
    }
    
    private boolean isComma() {
    	
    	return (input.LA(1) == ',');

    }
 

}