package day21WhileandDoWhileLoops;

import java.util.Scanner;

public class warmup1 {
	public static void main(String[] args) {
		/*
		 * write a program can remove the duplicate of the string
		 * input=aabbcc
		 * output=abc
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a sentence");
		String sentence=scan.nextLine();
		String result="";
		int lsen=sentence.length();
		
		for(int i=0;i<lsen-1;i++) {
			//if(!result.contains(sentence.substring(i,i+1))){// i,i+1=== only ona character
	     if(!result.contains(""+sentence.charAt(i))){
	    	 
				result+=sentence.substring(i,i+1);
				
	    
				
				
				
			}
		}System.out.println(result);
		
		
		
		
		
				
	}

}
