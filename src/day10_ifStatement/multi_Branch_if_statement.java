package day10_ifStatement;

public class multi_Branch_if_statement {
/*
 * multi_ branch if statement: we use it when we have more than 2 possibilities.
 if-else if- else
 * if (condition1) {
	   // A
    } else if (condition2){
        //B
	} else {
	    //C
	}
	 if condition 1 is true ====>A, 
	 if 2. condition is true====>B, //first condition is fale
	 if both condition are false ====>C// both condition false
	 // if both conditions are true first one gets executed
	  //only one of the block gets executed
    */
	public static void main(String[] args) {
		if (true) {
			System.out.println("if block");
		}
		else if (false) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 Task 01
		 90<= grade===>A
		 80<=grade <90===>B
		 70 <= grade <80===>C
		 60 <= grade <70===>C
		 else ==>F
		 
		 
		 * 
		 * 
		 * 
		 */
		int grade = 87;
		if (grade >=90) {
			System.out.println("You get A, greta job");
		}
		else if(grade <90 && grade >=80) {
			System.out.println("You made B, good"); 
			
		}else if(grade < 80 && grade>=70 ) {
			System.out.println("Ypu made C, that is ok.");
		}
		else if (grade<70 && grade >=60) {
			System.out.println("You made D, work hard");
			
		}
		else {
			System.out.println("You made F");
		}
		
		
		// FIND THE BUG
		
		int grade2=59;
		
		if (grade2 >=60 && grade2 <70) {
			System.out.println("D");// this is the bug
		}
		else if (grade2>=70 && grade2<80) {
			System.out.println("C");
		}
		else if( grade2 >=80 && grade2 <90 ) {
			System.out.println("B");
		}
			else if (grade2>=90 && grade2<100) {
				System.out.println("A");
				
			}
			else {
				System.out.println("F");
			}
		

		/*
		 *1.Write a program that
		     1. 0-12==> good morning
		     2. 12-15==>good afternoon
		     3.15-23===> good night
		     4. 12===> good noon
		     
		     
		 
		 */
		int time= 21;
		if (time >=0 && time<12) {
			System.out.println("Good morning");
		}
		else if(time >12 && time <=15) {
			System.out.println("Good afternoon");
		}
		else if(time > 15 && time <=23) {
			System.out.println("Good night");
		}
		else {
			System.out.println("Good noon");
		}
		
		/*Task
		 *int n1,n2,n3 find the bigger number
		  
		 */
		
		int num1 = 50, num2 = 100, num3=100;
		if (num1>num2 && num1>num3) {
			System.out.println(num1 + " is the bigger number");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the bigger number");
			
		}
		else if (num3> num2 && num3 >num1) {
			System.out.println(num3 + " is the bigger number");
			
		}
	
		else if (num3 == num2 && num3>num1) {
			System.out.println(num3 + " and "+ num2 + " are the bigger number");
			
		}
		else if (num3 ==num1 &&num3>num2) {
			System.out.println(num3 + " and " + num1 + " are the bigger number");
			
			
		
		}
		else if ( num1 ==num2 && num2>num3) {
			System.out.println(num1 + " and "+ num2 + " are the bigger number");
		}
		else {
			System.out.println("all of them equal");
		}
		
	
		
	
	
	
	
	}
}

	
	
	
		
		
		
	
	



