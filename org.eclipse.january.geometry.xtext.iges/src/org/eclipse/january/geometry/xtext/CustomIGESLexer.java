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
	private String SEPARATER = null;

    public CustomIGESLexer() {;} 
    public CustomIGESLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomIGESLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    
    @Override 
    public void mTokens(){
    	if (isHollerith()){
    		try {
    			if (DELIMITER == null) {
    				setDelimiter();
    			} else if (SEPARATER == null) {
    				setSeparater();
    			} 
    			RULE_HOLLERITH();
			} catch (RecognitionException e) {
				e.printStackTrace();
			}
    	//} else if (isDelimiter()) {
    		
    	//} else if (isSeparater()) {
    		
    	} else {
    		if (isComma()){
        		if (DELIMITER == null) {
        			DELIMITER = ",";
        		} else if (SEPARATER == null) {
        			SEPARATER = ";";
        		}
    		}
    		try {
				super.mTokens();
			} catch (RecognitionException e) {
				e.printStackTrace();
			}
    	}
    }
    
    private boolean isDelimiter() {
    	int index = 1;
    	
    	while((char)(input.LA(index))==DELIMITER.charAt(index-1) && index <= DELIMITER.length()){
    		index++;
    	}
    	return index == DELIMITER.length()+1;
    }
    
    private boolean isSeparater() {
    	int index = 1;
    	
    	while((char)(input.LA(index))==SEPARATER.charAt(index-1) && index <= SEPARATER.length()){
    		index++;
    	}
    	return index == SEPARATER.length()+1;
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
        	DELIMITER += (char)input.LA(index);
        }
    }
    
    private void setSeparater() {
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
    	SEPARATER = "";
        for(int i=0; i<n; i++) {
        	SEPARATER += (char)input.LA(index);
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