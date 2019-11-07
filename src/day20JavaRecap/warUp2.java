package day20JavaRecap;

import java.util.Scanner;

public class warUp2 {
	public static void main(String[] args) {
		/*
		 * 
		 *   4. write a program that ask a user to enter number 10 times
		 *      1.fund the sum of those 10 inputs
		 *      
		 */
		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=10;i++) {
		System.out.println("Eter number");
		int input=scan.nextInt();
		sum+=input;
		
}System.out.println("sum of all 10 numbers"+sum);
		
		
		
		
		
		
		
		
		
		
	}

}
