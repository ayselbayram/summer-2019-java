package day10_ifStatement;

public class nested_if {
	public static void main(String[] args) {
		/*
		 Nested if:  if in if
		 SINGLE IF
		 if ( condition1){
		     if (condition2){
		     // some code
		     }
		 }
		 IF ELSE
		 
		  
		 
		 */
		
		if ( true) {// both the conditions needs to be true
			if (true) {
				System.out.println("Hello world");
			}
		}
		
		System.out.println("===============");
		
		if ( true) {// both the conditions needs to be true
			System.out.println("Hello cybertek");
			if (false) {
				System.out.println("Hello world");
			}
		}
		System.out.println("====================");
		if ( true) {// both the conditions needs to be true
			System.out.println("Hello cybertek");
			if (true) {
				System.out.println("Hello world");
			}
		}
		System.out.println("=================");

		
		if ( true) {// if i make it false nothing will be executed
			System.out.println("Hello batch 12");//printed
			if (false) {
				System.out.println("Hello proggrammers");// 
				
			}
			else {
				System.out.println("Hello Team SDET");
			}
		}
		System.out.println("============");
		
		/*
		 60<= grade <70===>D
		 70<= grade <80===C
		 80<= grade <90===B
		 90<= grade <100===A
		 50<= grade < 60 ===>F
		 40<=grade <50===> G
		 30<=grade <40===>H
		 20<=grade <30===I
		 10<= grade< 20===>j
		 0<= grade <10===>K
		 */
         int grade = 0;
         if ( grade >=60 && grade<=100) {
        	 System.out.println("passed");
        	 if(grade >=90 && grade<=100)
        		 System.out.println("\twith an A");
        	 else if (grade >=80 && grade <90 ) {
        		 System.out.println("\t with a B");
        	 }
        	 else if (grade >=70 && grade <80) {
        		 System.out.println("\twith an C");
        	 }
        	 else {// 60 <grade <70
        		 System.out.println("\twith a D");
        	 }
        		 
        	 
        	 
         }
         else {
        	 if (grade <60) {// the condition is either less than 60 or greater tahn100
        		 System.out.println("you failed with a grade of F");
        	 }
        	 else {//greater than 100
        		 System.out.println("invalid score");
        	 }
         
         
        
	}
         System.out.println("===============");
         
         
         
         
         
         

}
}
