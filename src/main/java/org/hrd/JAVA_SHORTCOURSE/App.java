package org.hrd.JAVA_SHORTCOURSE;

import java.util.Currency;
import java.util.Locale;
import java.util.Random;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	/*Random rd=new Random();
    	//rd.setSeed(552300);
    	//System.out.println( Math.round(rd.nextDouble() *10) );
    	
    	byte[] nbyte= new byte[30];
    	
    	rd.nextBytes(nbyte);
    	
    	System.out.println(nbyte[1]);
    	
    	System.out.println(rd.nextInt(50));*/
    	
    	/*Locale locale=Locale.JAPAN;
    	Currency crr= Currency.getInstance(locale);
    	System.out.println(crr.getCurrencyCode());
    	System.out.println(crr.getSymbol());
    	System.out.println(crr.getDisplayName());
    	System.out.println(crr.getNumericCode());
    	System.out.println(crr.getDefaultFractionDigits());
    	System.out.println(crr.getAvailableCurrencies());*/
    	
    	Stack<String> stack=new Stack<String>();
    	stack.add("cat");
    	stack.add("car");
    	stack.add("cook");
    	stack.add("dog");
    	stack.add("dack");
    	
    	//System.out.println(stack.peek());
    	System.out.println(stack.pop());
    	
    	/*for( String  s : stack){
    		System.out.println(s);
    	}*/
    	stack.push("F");
    	
    	for( String  s : stack){
    		System.out.println(s);
    	}
    	
    	int s= stack.search("cook");
    	
    	System.out.println(s);
    }
}
