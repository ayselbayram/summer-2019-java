package day22nestedlLoop;

import java.util.Scanner;

public class nestedLoopTask {
	public static void main(String[] args) {
		/*
		 * ask the user enter 2 numbers and print out the addition 
		 * ask user they wan to continue
		 * if they say yes... it will continue
		 * is say no stop it
		 */
		
		while(true) {
		
		System.out.println("enter two number");
     	Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("addition is: "+(a+b));
		System.out.println(" do you want to continue");
		String answer=scan.next();
		
		while(!(answer.contentEquals("yes") || answer.equals("no")) ){
			System.out.println("invalid entry please re enter");
			System.out.println(" do you want to continue");
			answer=scan.next();
		}
		if(answer.contentEquals("no")) {
			break;
			
		}
		
		
		}
		
		
	}

}
