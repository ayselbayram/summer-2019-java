package day15_Scanner_Stringclass;

import java.util.Scanner;

public class task01 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1= input.nextInt();
		System.out.println("Enter the second number");
		int n2= input.nextInt();
		System.out.println("The sum is:" + n1+n2);// ad the string if wothout ()
		System.out.println("The sum is:" + (n1+n2));
		
		
		
	}

}
