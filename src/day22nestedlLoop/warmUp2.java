package day22nestedlLoop;

import java.util.Scanner;

public class warmUp2 {
	public static void main(String[] args) {
		/*
		 * CHECK IF THE STRING PALINDROME
		 * IF IT IS "TRUE" OTHERWISE "FALSE"
		 * LEVEL==LEVEL==PALINDROME
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter something");
		String original=scan.nextLine();
		
		
		           //    01234
		// rev           43210
		String rev="";//edcba
		
		
		for(int i=original.length()-1;i>=0 ;i--) {
			//rev+=original.substring(i,i+1);
			rev+=original.charAt(i);//another way to do it
		}
		boolean result=original.equals(rev) ? true
				:false;
		
	      System.out.println(result);
	
		
	
	
		
		
		
		
		
	}	
	}


