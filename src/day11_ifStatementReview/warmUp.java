package day11_ifStatementReview;

public class warmUp {
	public static void main(String[] args) {
		
		/*
		 single if : when we have only 1 option
		 if-else : when we have 2 options// else statement must be declared with if statement
		 else -if: when we have more than 2 options//
		 warm up:
		 1. Declared an int variable "year"
		 2. write a java program that can check if the year is a leap
		 if a year can be divided by 4 ===> leap
		 do not use single if statement 
		 
		 WARM UP 2
		 1.GRADE CALCULATOR
		 A => 90-100
		 B=> 80-89
		 C=> 70-79
		 D=>60-69
		 F=> 0-59
		 
		 NESTED IF: if a condition cen be evaluate to multiple scenarios||
		 if a multiple scenarios execution depends on a specific condition|| 
		 if you have requirement to check in the beginning
		     if (condition1){
		           //A
		          if (condition2){
		             //B
		              }
		             }
		 //B only gets executed condition1 =true and the condition2 = true
		 
		  
		 */
		int year = 2000;// leap
		boolean leapyear = year % 4 ==0;
		
		if (leapyear) {// leap year can diveded by 4
			System.out.println("Year " + year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
		
		// warm up2
		
		int grade =67;
		if(grade >=90 && grade <=100) {
			System.out.println(" You passed with A");
		}
		else if ( grade >=80 && grade <=89) {
			System.out.println("You passed with B");
		}
		else if ( grade>=70 && grade <=79) {
			System.out.println("You passed with C");
		}
		else if ( grade >=60 && grade <=69) {
			System.out.println(" You passed with D");
		}
		else   {
			System.out.println(" You failed with F");
		}
		
		// same problem different approach
		boolean A = grade >=90 && grade <=100;
		boolean B = grade >=80 && grade <=89;
		boolean C = grade>=70 && grade <=79;
		boolean D = grade >=60 && grade <=69;
		boolean validGrade = grade>=0 && grade<=100;
		if (validGrade) {//grade>=0 && grade<=100
			// in order to multi-branch, if gets executed first validGrade has to be true
			System.out.println("You passed");
		 if (A) {//grade >=90 && grade <=100
			 System.out.println(" You made A");
		 }
		 else if (B) {//grade >=80 && grade <=89
			 System.out.println("You made B");
		 }
		 else if (C) {//grade>=70 && grade <=79
			 System.out.println(" You made C");
		 }
		 else if(D) {//grade >=60 && grade <=69
			 System.out.println("You made D");
		 }else {//grade>=0 && grade <60
			 System.out.println("You made F");
		 }
		}
		else {// grade >100 || grade <0
			System.out.println("Invalid grade");
		}
		/*
		 1. declare int variable called age
		 declare a boolean variable called "good Person
		 if boolean if false you can get those
		 if it is ture " 
		   age >= 18 you can get cigarette
		   age >=21 you can get hookkah
		   age >=25 you can get alcohol
		   age <18 buy milk
		  
		 * 
		 */
		int age = 30;
		boolean goodPerson = true;
		
		if (age>=18 ) {
			if (goodPerson) {
				System.out.println(" Alcohol is a bad for your health");
				}
			else {// goodperson = false && age >=18
				System.out.println(" you can buy cigarette");
			
			if (age >=21) {
				System.out.println("you can buy hookkah");
			}
			if (age >=25) {
				System.out.println(" you can buy alcohol");
				
			}
			}
			
		}
		else {
			System.out.println("buy milk");
		}
		
		/*
		 * wtite a program that can find the number of the days in a month(assume feb has 28 days)
		 * int month = 0-12
		 * jan;31, feb;28. mrch;31, april:30, may:31, june;30, july;31, aug:31, sept:30, oct:31, nov:30, dec;31
		
		 *must use nested if
		 *
		 *28 days: feb
		 *30 days; 4,6,9,11
		 *31 days: 1,3,5,7,8,10,12
		 *even number of 30 days: 4 and 6
		 *odd number 30 days: 9&11
		 *even number of 31 days: 8,10,12
		 *odd number of 31 days: 1,3,5,7
		 *
		 */
		int month= 2;
		 
		 if (month>0 && month<13) {
			 if (month==1) {
				 System.out.println("31 days");
			
			 }
			 else if (month==2) {
				 System.out.println("28 days");
			 }
			 else if (month==3) {
				 System.out.println("31 days");
			 }
			 else if (month==4) {
				 System.out.println("30 days");
			 }
			 else if (month==5) {
				 System.out.println("31 days");
			 }
			 else if(month==6) {
				 System.out.println("30 days");
			 }
			 else if(month==7) {
				 System.out.println("31 days");
			 }
			 else if (month%2==0) {
				 System.out.println("31 days");
			 }
			 else {
				 System.out.println("30 days");
			 }
			 
			 
		 }
		 else {
			 System.out.println("Invalid entry");
		 }
		 
		 System.out.println("====================");
		 
		 
		 /*
		  * 28 days=2
		  * 30 days=4,6,9,11
		  * 31 days= 1,3,5,7,8,10,12
		  * leap year : 29 days
		  */
		 int month2=2;
		 int year1 = 2000;
		 if (month2>0 && month2<13) {// 1-12
			 if (month2==2) { // month=2
				 if (year1%4==0) {// condition for leap year
					 System.out.println("29 days");
				 }
					 else {// condition for regular year
				 System.out.println("28 days");
			 }
			 }
		 
			 else if ( month2 ==4 || month2 == 6) {// month2=4||month2=6
			 System.out.println("30 days");
		 }
		      else if (month2==9 || month2 ==11) {//month2=9||month2=11
			 System.out.println("30 days");
		 }
		      
				 
				 else {//1,3,5,7,8,10,12
					 System.out.println("31 days");
				 } 
		 }
			 else {// when we enter<0 or enter>12
				 System.out.println("invalid entry");
			 }
		
			// if else && else if;
		 if (true) {
			 System.out.println("hello");
		 }
		 else {
			 System.out.println("Batch12");
		 }
		 System.out.println("==================");
		 if (true) {
			 System.out.println("hello");
		 }
			 else if (false) {
				 System.out.println("batch 12");
			 }
			 else {
				 System.out.println("cybertek");
			 }
		 // else if must be declared right after the if block
		 int x=10;// difference between single if blocks and if else blocks
		 if (x > 0) {
			 System.out.println("great than 0");
			 
		 }
		 if (x >5) {
			 System.out.println(" greater tahn 5");
		 }
		 if (x==10) {
			 System.out.println(" equal to 10");
			 System.out.println("===============");
			 if (x > 0) {
				 System.out.println("great than 0");
				 
			 }
			 else if (x >5) {
				 System.out.println(" greater tahn 5");
			 }
			 else if (x==10) {
				 System.out.println(" equal to 10");
	

	}
			 //single if statement; when we have 1 condition
			 //if- else; statement; for 2 conditions
			 // else if statement; more than 2 condition
			 // nested if : when the multiple conditions depends on the pre condition,
	}
	}
}

