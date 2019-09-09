package day13_review;

public class switchStatement {
	public static void main(String[] args) {
		/* 
		 * Switch Statement: whenever you are writing code and checking if some variable equals different values:
		    1. you can use multi-branch values
		    2. switch statement
		    
		 * switch(expression){
		case casevalue:
		statements1;
		statement2;
		 break;
		 }
			
		we can have as many cases as we want
		case value must match with the switch expression data type
		case is similar with else -if
	
        case casevalue ;
		statement1;
		statement2;
		break;
		default: 
		statement 1;
		statement2;
		break
		
		break statement: 
		default statement is similar  like else statement. 
		default section will get executed when there is no cases that match with the given data.
		default section can be placed in anywhere n switch statement
		in switch statement none of those blocks are mandatory.even break;
		case value = data type base value
		
		
		
		switch statements expressions must be evaluate to a single value.
		that means, either, caharters, digits, text
		   4 data type we can not give switch statements
		        double a = 10L,10D, ---because of tthe LD letters
		        float = 10 f ---because of the L letter
		        long = 10 l----because of L
		        boolean = true, false, 10>9, 
		        
		   OR LOGIC IN SWITCH STATEMENT
		        
		 */
		
		int num = 5;
		switch (num) {
		case 7 :
		    System.out.println("sunday");
		    break;// case closed exiting the switch statement after the case is executed
		    default:
		    	System.out.println("invalid enrty");
		    	break;// exit the switch statement
		    	// we can not give any more statement after the break.
		    case 5:// we can also write case 10-5:
		    	System.out.println("Friday");
		    	System.out.println("tomorrow is saturday");// i can give another statement before break
		    	break;
		    
		}
		System.out.println("================");
		
		String days = "Friday";
		switch (days){
			
		    case "Tuesday":
			    System.out.println("Tuesday is great day");
			    // if there is no break here tuesday and monday executed then stop at the break 
			    //even case value data doesn't match
			    break;
			case "Monday":
				System.out.println("Monday is Fun day");
			    break;
			
			case days:
				System.out.println(" Wednesday is day off");
				break;
				
			default:
				System.out.println(" invalid ");
				break;
			// if we remove every break, every statement will be executed till curly brace	
				
		}
		System.out.println("===========");
		
		
		switch (days){
		
	    case "Tuesday":
		    System.out.println("Tuesday is great day");
		    // if there is no break here tuesday and monday executed then stop at the break 
		    //even case value data doesn't match
		    
		case "Monday":
			System.out.println("Monday is Fun day");
		    
		
		case "Wednesday":
			System.out.println(" Wednesday is day off");
			
			
		default:
			System.out.println(" invalid ");
			
		// if we remove every break, every statement will be executed till curly brace	
	}
		System.out.println("======================");
		
		// example of 4 data types are not accepted in switch
		
	//long n1= 10;// 10 is actuall 10L can not give long data type
		
		float n2 = 100;// 100.0f
		//switch(n2) {} compile error
		
		double n3=10;
		//switch (n3) { }// compile error
		boolean n4 = true;
		//switch(n4) {} compile error
		
		char num1 = 'A';
		switch(num1) {}// compile char is a a character data type
		
		
		// OR LOGIC WITH SWITCH STATEMENT
		// there is no direct way using or operator in switch
		// we can use multiple case block back to back
		
		char grade = 'A';
		if (grade =='A' || grade == 'B') {
		System.out.println(" you are passed");
		
		}else {
			System.out.println("you are failed");
		}
		System.out.println("======================");
		switch (grade) {
		    case 'A':
		    case 'B':
		    	System.out.println("passed the exam");
		    	break;
		    default:
		    	System.out.println("you failed");
		    	break;
		    
		}
		System.out.println("======================");
		String US = "USA";
			if (US == "USA" || US== "America" || US=="US") {
				System.out.println("American");
				
			}else {
				System.out.println(" not american");
			}
			System.out.println("================");
			
			switch (US) {
			case "US":
			case "USA":
			case "America":
				System.out.println("American");
				break;
					
				default:
					System.out.println("Not American");
					break;
			
			}
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
}
}