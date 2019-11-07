package day24JavaRecap;

import java.util.Scanner;

public class ArraysPractice {
	/*
	 * ask user enter 5 numbers
	 * sum of the 5 number
	 * must use array
	 */
	public static void main(String[] args) {
		int [] number=new int[5];		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		
		for(int i=0;i<number.length;i++) {
			System.out.println("enter a number");
			number[i]=scan.nextInt();
//if we wan to store the firt input to the last index I will change the "i" in the for
		}
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]+" ");
		}	
		
		
		for(int i=0;i<number.length;i++) {
			sum+=number[i];
		}	System.out.println(sum);
		
		
	}

}
