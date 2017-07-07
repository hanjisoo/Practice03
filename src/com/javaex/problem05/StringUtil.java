package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] strArr){
    	String sum="";
        for(int i=0; i<strArr.length; i++) {
        	
        	sum=sum+strArr[i];
        }
        return sum;
    }

}
