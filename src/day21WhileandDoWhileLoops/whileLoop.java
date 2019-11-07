package day21WhileandDoWhileLoops;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
		/*
		 * while Loop: 
		 *  while(condition){//any true false con.boolean string meyhods also
		 *  statements
		 *  }
		 *  while loops get executed as long as the condition is true
		 *  while loop=a repeating if statement
		 *  compiler first checks the condition of the while loop, 
		 *  if it is true execute the loop otherwise stops executing
		 *  ANYTHING WE CAN DO WITH FOR LOOP WE CAN DO WITH WHILE LOOP
		 *  you have to declare INITIALIZATIN outide of the loop body
		 *  ITERATER inside the ;loop body
		 *  
		 *  initialization:
		 *  while(condition)
		 *  iterater
		 */
		
		int a=9;//a=8
		
		while(a>8) {
			System.out.println("hello");
			a--;//java execute the code from top to button, if we need to use a in the print the we will have problem
		}
		
		/*
		 * write a java program that count how many times"book" occured in sentence
		 */
		
		String sentence="I like book, i read book,book book";
		int count=0;
		while(sentence.contains("book")) {
		 count++;
		 sentence=sentence.replaceFirst("book","");
		 break;
		 //replace method replace all the "book" from sentence
		 //this statement makes the condition false
		}System.out.println(count);
		
		/*
		 * break statement= can help you exit the switch statement, 
		 * break statement it also used to stop the loop statement(forcefully exits the loop
		 */
		
		while(true){
			System.out.println("hello");
			break;//forcefully exits the loop
		}
		int i=0;//we have to give this variable outside the loop
		while(true) {//exit the loop  after 5 times hello print
			
			i++;//i=1
			System.out.println("hello "+i);
			if(i==5) {//if we give i<=5, break statement will execute right after the first print
				break;
			}
		}
		
		
		//examples
		/*
		 * print all even numbers from1-100
		 * for
		 * while loop
		 * scanner
		 */
		//for loop solution
		for (int z=1;z <=100;z++) {
			if(z%2==0) {
				System.out.print(z+" ");
			}
			
		}
		System.out.println();
		//while loop solution//converting FOR LOOP TO WHILE LOOP
		int n=1;
		while(n<=100) {
			if (n%2==0) {
			System.out.print(n+"");
			
		}n++;
		
		
		}	
		//do the same problem with scanner
				Scanner scan=new Scanner(System.in);
				System.out.println("starting number");
				int start=scan.nextInt();
				System.out.println("ending number");
				int end=scan.nextInt();
				
				for(int j=start;j<=end;j++) {
					if(j%2==0) {
						
					System.out.print(j+" ");	
						
					}
				}
				System.out.println();
				
				 int g =start;
				 while(g<=end) {
					 if(g%2==0) {
						 System.out.print(g+" ");
						 
					 }g++;
				 }
				
		
	}

}
