package com.tyss.elftraining.customizeexception;

public class InsuffBalanceException extends Exception {
	String msg;
	
    public InsuffBalanceException() {
    	super();
    	
    }
    public InsuffBalanceException(String msg){
    	super(msg);
    	this.msg=msg;
    	
    }
  
    @Override
    public String getMessage() {
		return super.getMessage();//this.msg
    	
    }
    
    
    
}
