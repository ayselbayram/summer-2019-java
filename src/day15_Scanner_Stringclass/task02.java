package day15_Scanner_Stringclass;

import java.util.Scanner;

public class task02 {
	public static void main(String[] args) {
		
	
	//write a program that asks user to enter 3 numbers and return it largest
			//do it with ternary
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number");
	double n1 = input.nextDouble();
	System.out.println("Enter the second number");
	double n2= input.nextDouble();
	System.out.println("Enter the third number");
	double n3= input.nextDouble();
	
	double largest= (n1>n2 && n1>n3) ? n1
			:(n2>n3&&n2>n1) ? n2
					:n3;
	System.out.println("largest number is "+ largest);
	
		
}
}