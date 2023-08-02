package com.jap.wrapper.wrapper;

import java.io.*;

public class NumberValidator {

    //validation rules to be written
//	public static void main(String args[]){
//		NumberValidator obj=new NumberValidator();
//		System.out.println(obj.validateNumber(null));
//	}

    public int validateNumber(String input) {
    	int s=0;
    	if(input.length()==0 || input.equals(null) ){
    		return -1;
    	}
    	if(input.length()!=10){
    		return 0;
    	}
    	int b;
    	try {
    		Long.parseLong(input);
    		for (int i=0;i<10;i++){
    				b=Integer.valueOf(input.charAt(i));
    				System.out.print(b+" ");
    				s=s+b*(10-i);
    		}
    		if (s%11==0){
    			return 1;
    		}
    		else {
    			return 0;
    		}
    	}
    	catch(NumberFormatException e) {
    		throw e;
    	}
   }
}
