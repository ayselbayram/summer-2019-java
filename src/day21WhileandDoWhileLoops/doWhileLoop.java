package day21WhileandDoWhileLoops;

import java.util.Scanner;

public class doWhileLoop {
	public static void main(String[] args) {
		/*
		 * do-while:
		 *   do{
		 *   statement;
		 *   }while(condition);
		 *   do while loop, compiler executes the block first and then checks the condition.
		 *   if the condition is true,then it keep executes
		 *   if the condition is false, stops the execution
		 *   WHILE vs DO WHILE
		 *  do while loops body gets executed at least one regardless of condition
		 *  while loop never gets execution if the condition false
		 */
		
		
		boolean A = false;
		while(A) {
			System.out.println("hello");//while loop checks the condition first
		}
		
		do {
			System.out.println("hello");
		}while(A);// execute the block first then checks the condition, it it is wrong them stops it after execution
		
		
		//PRINT ALL THE EVEN NUMBER BETWEEN 1=100
		
		int a=1;
		
		do {
			if(a%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}while(a<=100);
		
		System.out.println();
		
		
		//exp
		
		do {
			System.out.println("hello world");
			break;
			//System.out.println("hello ceybertek"); after we stop the loop 
			//what ever we gave after stop the loop is unreachable, out of loop
			//after break; statement we can not give anything
		}while(true);
		
		//exp
		
		
	
		
		
		
	}
}

