package day22nestedlLoop;

import java.util.Scanner;

public class nestedLoopTask2 {
	public static void main(String[] args) {
		/*
		 * multiple the entered numbers
		 */
		
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("multiplication of the numbers: "+(a*b));
		System.out.println("do you want to continue");
		scan.nextLine();
		String answer=scan.nextLine().toLowerCase();
		
		while(!(answer.equals("yes")|| answer.equals("no"))){
			System.out.println("please make your mind");
			System.out.println("do you want to continue");
			answer=scan.nextLine();
			
		}
		
		if(answer.equals("no")) {
			break;
		}
		
		}
		
		
		
		
		
			
	}

}
