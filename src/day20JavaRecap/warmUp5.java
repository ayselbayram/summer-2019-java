package day20JavaRecap;

import java.util.Scanner;

public class warmUp5 {
	public static void main(String[] args) {
		/*
		 * 4. write a program that ask a user to enter number 10 time  
		 * find the minimum number
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		int min=99999999;//store the minimum user input value
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter a number");		
			int input=scan.nextInt();
			if (input<min) {
				min=input;
			}
			
			}System.out.println("min value is"+min);
			
	}

}
