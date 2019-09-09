package day09_Review;

public class if_Statement {
	public static void main(String[] args) {
		/*if statement : 
		    Single if statement:
		         if ( boolean expression ) {
		            // some codes to run, 
		         }
		          block only gets executed if the conditional boolean expression is true
		 
		 
		 
		 */
		
		
		if ( 9< 10 ) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("tomorrow is day of");
			System.out.println("class starts on MOnday");
		}
		
		
		
		
		int a = 1000;//1001
		if ( a ++ == 1001) {// when i make it true statement a == 2000
	//     1000===1001
			a = 2000;
			System.out.println("a is increased");
		}
		System.out.println(a);// when if statement is true a == 2000
		//when if statement is false a= 1001
		
		
		System.out.println("======"); 
		int x = 987654320; // to verify this given number is odd or even
		if (x%2 == 0) {
			//true
			System.out.println( x );
			System.out.println("it is an even number");
			
		}
		if ( x % 2 != 0) {
			// false
			System.out.println(x);
			System.out.println("it is an odd number");
			
		}
		
		System.out.println("==========");
		
		int b = 2345678;
		if ( b % 5 == 0) {
		// false  
			System.out.println(b + " can be divided by 5");
			
			
		}
		if ( b % 5 != 0) {
			// true
			System.out.println(b + " can't be divided by 5");
			
			System.out.println("==========");
			
			String CEO = "Main boss";
			
			String Kuzzat = "Main boss";
			System.out.println(CEO == Kuzzat);//true
			
			if ( CEO == Kuzzat) {
				//true
				System.out.println("Great person in the world ");
				System.out.println("First if block");
			}
			
			if (Kuzzat != CEO) {
				//false
				System.out.println("Great person in the world");
				System.out.println("second if block");
			}
			
			double TotalNumber = 100;
			boolean Cybertek = true;
					boolean BestSchool = true;
					
					
					
			if (Cybertek == BestSchool) {
				// true
			
			TotalNumber += 500;
		}
		
		
		if (Cybertek != BestSchool) {
			// false
			
			TotalNumber -= 50;
		}
		System.out.println(TotalNumber);
		
		/*
		 1. declare a variable, and initialize user age
		 2. write a program if the user eligible to vote for trump 2020 election
		 vote age is 18
		 * 
		 * 
		 */
		
		byte userAge = 14;
		byte voteAge = 18;
		
		if (userAge >= voteAge ) {
			//true
			System.out.println(" Yes you are eligible for vote");
			System.out.println(" and have fun with building the wall");
		}
			
		
			
			if (userAge < voteAge) {
				//false
				System.out.println("No you are not eligile to vote yet");
			}
			
			
		}
		
		
		
		
		
		
	}
}


