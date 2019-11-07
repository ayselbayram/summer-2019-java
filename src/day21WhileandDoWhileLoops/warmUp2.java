package day21WhileandDoWhileLoops;

import java.util.Scanner;

public class warmUp2 {
	public static void main(String[] args) {
		/*
		 * write a java program that count how many times"book" occured in sentence
		 *                                                i,i+4
		 *                                                
		 */                                               
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a sentence");
		String sentence=scan.nextLine();
		int num=0;
		int lsen=sentence.length();
		
		for(int i=0; i<lsen-3;i++) {
		  if(sentence.substring(i,i+4).equalsIgnoreCase("book")) {
			  ++num;
		  }
		  
		}System.out.println(num);
	
	
	//exp=how many cybertek
		String word="Cybertek is a school,cybertek is great, cybertek";
		int sub=0;
		for (int i=0;i<word.length()-7;i++) {
			if(word.substring(i,i+8).equalsIgnoreCase("cybertek")) {
				++sub;
			}
			
		}System.out.println(sub+"times Cybertek");
	
	
	
	
	
	}
	
	

}
