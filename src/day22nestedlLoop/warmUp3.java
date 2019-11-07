package day22nestedlLoop;

import java.util.Scanner;

public class warmUp3 {
	public static void main(String[] args) {
		/*
		 * CHECK IF THE STRING PALINDROME
		 * IF IT IS "TRUE" OTHERWISE "FALSE"
		 * LEVEL==LEVEL==PALINDROME
		 * do it without for loop
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter something");
		String original=scan.nextLine();
		
		int i=original.length()-1;
		String rev="";
		
		while(i>=0) {
			rev+=original.substring(i,i+1);
			//rev=+original.charAt(i); is also fine
			i--;
		}	boolean result=original.equals(rev) ? true
				:false;
		
	      System.out.println(result);
	
	}

}
