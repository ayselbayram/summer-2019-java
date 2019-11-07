package InterviewQuestions;

import java.util.Scanner;

public class warmup1 {
	public static void main(String[] args) {
		/*
		 * write a program that can divide two numbers without using division operator
		 * 10-3=7
		 * 7-3=4
		 * 4-3=1//3 times substract/10/3=3
		 * what if we give negative numbers
		 * find the bug 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 number");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		int count=0;
		int num=num1;
	if(num2!=0) {
		while(num1>=num2){
		    num1-=num2;
		    count++;
		} 
		System.out.println("division is "+count+" with a remainder of "+num1);  //result of the islem
		   System.out.println(num1);//remainder
	}else {
		System.out.println("invalid entry");
	}
		
		
		
		
		
	}

}
