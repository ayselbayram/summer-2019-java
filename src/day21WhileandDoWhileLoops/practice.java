package day21WhileandDoWhileLoops;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		/*
		 * ask user to enter 2 numbers and print out addition of these two numbers
		 */
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("enter second number");
		int num2=scan.nextInt();
		System.out.println("addition is: "+(num1+num2));
		System.out.println("do you wanna continue");
		String answer=scan.next();
		if (answer.equalsIgnoreCase("no")) {
			break;
			
		}
			
		}
		}
		
				
	
	}


