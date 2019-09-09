package day10_ifStatement;

public class if_Else_Statement {
	public static void main(String[] args) {
		/*
		 if & else statement// we use it when there is 2 possibilities
		 
		 if( condition) {// if condition is true, we will get A
		    //A
		   
		 } else{// if the condition is false , else statement executed and we we will get B
		 //B
		 
		 }
		   */
		
		if (9>8) {
			System.out.println("9 is greater than 8.");
		}
		if (9 <8 ) {
			System.out.println("9 is less than 8.");
		}
		if ( 9 == 8) {
			System.out.println("9 is equal to 8.");
		}
		
		if (9 <=8 ) {
			System.out.println("9 is greater or equal to 8.");
		} else {
			System.out.println("9 is less than 8.");// else block gets executed because if block is false
		}
		 if (false==!false) {
			 System.out.println("if block");
		 }else {
			 System.out.println("else block");// if condition is false
		 }
		 
		 /*
		  Task 01: if score <60 ==>failed
		           if score >60 but score < 90===>pass
		           
		           
		   
		  
		  
		  * 
		  */
		 int score = 59;
		 String result = "";
		
		 if (score >=60 && score <=90) {
			 result = " passed";//System.out.println("passed");
		 }else {
			 result = "failed"; // System.out.println("failed");
		 }
		 System.out.println(result);
		 
		 /*
		  * task2: triangle:  has 3 angles, sum of the angles ==180
		  * 1. declare 3 variables ang 1, ang2 ang3
		  * initialize some value to them
		  * then write a program to check if the triangle is valid or not
		  * 
		  * 
		  */
		 int ang1, ang2, ang3;
		 ang1 = 20; ang2= 50; ang3 = 75;
		 boolean valid = (ang1+ang2+ang3)==180;
		 if (valid) {
			 System.out.println("it's a valid triangle");
		 }else {
			 System.out.println("invalid triangle, do some math");
		 }
		 
		 
		 
		
		 
		 
		 
		 
		
	}

}
