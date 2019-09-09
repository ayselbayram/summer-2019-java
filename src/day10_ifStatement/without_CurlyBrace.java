package day10_ifStatement;

public class without_CurlyBrace {
	public static void main(String[] args) {
		
		/*
		 single if statement; 
		 if( condition) {
		 // some codes
		 }
		  IF STATEMENT without curly braces :
		  single if statement
		  if(condition)
		  // only single line of code statement
		  IF ELSE STATEMENT: without curly brace
		  if (condition)
		       //single line of statement==>
		   else
		   // single line of statement
		   MULTI - BARNCH IF STATEMENT WITHOUT CURLY BRACEELSE 
		   if (condition)
		   // single line of statement
		   else if(condition2)
		   // single line of statement
		   else 
		   // single line of statement
		  
		 */
		
		if ( false ) {
			System.out.println("Today is Friday");
			System.out.println("Tomorrow is day off");
			System.out.println("There is no java class tomorrow");
		}
		
		if ( false)
			System.out.println("Today is Friday");// dont execute the first line because it is false
		
		System.out.println("Tomorrow is day off");// still execute because not in if block
		System.out.println("There is no java class tomorrow");
		
		
		 if ( true) 
			 System.out.println("Hello");
			 
		 System.out.println("Tomorrow is day off");
			System.out.println("There is no java class tomorrow");
		
			
			/*if -else  statement:
				  if (condition)
				       //single line of statement
				   else
				    single line of statement
				    */
			if (false) {
				System.out.println("Hello");
		
			}	
			//System.out.println("Good morning"); this line is separating if and else line, thats why gives compile error
			// else statement MUST be declared right after single if statement
			else {
				System.out.println("Hola");
				}
			
			/*MULTI - BARNCH STATEMENT WITHOUT CURLY BRACEELSE IF STATEMENT
		   if (condition)
		   // single line of statement
		   else if(condition2)
		   // single line of statement
		   else 
		   // single line of statement
		    * */
		    
			if (true)
				System.out.println("if block");
			//I can not add any statement here otherwise gives me compil error
			else if (true)
				System.out.println("else if block");
			// adding one more statement gives compil error
			else
				System.out.println("else blcok");
			// else if block = else block is not mendatory
			
			
					   
			
			
			
			
			
		
		
	}

}
