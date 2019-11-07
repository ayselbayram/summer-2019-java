package day20JavaRecap;

import java.util.Scanner;

public class warmUp3 {
	public static void main(String[] args) {
		/*
		 * 4. write a program that ask a user to enter number 10 time    
		 *     1.find the maximum numbers  
		 */
		
		Scanner scan=new Scanner(System.in);
		int max=-99999999;
		
		
		
		
		for(int i=1;i<=5;i++) {
		System.out.println("Enter a number");		
		int input=scan.nextInt();//1 max==1, 2 max==2
		if(input>max) {
		max= input;
		}
		}
		System.out.println("max value is"+max);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
