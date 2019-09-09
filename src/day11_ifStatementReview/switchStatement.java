package day11_ifStatementReview;

public class switchStatement {
public static void main(String[] args) {

	/*SWITCH STATEMENTS
	  the functionality of the switch statement does the similar thing like else - if (multi brach)statement does
	     
	     switch(expression){
	     case CaseValue:
	               statements1
	               statement2
	               break;
	           default:
	              statement;    
	     }
	     we can change the default and cases places in switch statement differ tan else if
	     we can give as many as cases in switch statements
	     We can only have one default section in a switch statement
	     break: exiting the switch statement
	     break: exiting the switch statement. without break it will continue to execute the all the cases till
	     find a break or closing curly brace}
	 */
	
	int score =3;
	if (score ==1) {// MUST give boolean expression
		System.out.println("1");
	}else if (score == 2) {
		System.out.println("2");
	}else {
		System.out.println("invalid");
	}
	
	switch(score) {// must give an expression;data
	 case 1:
	   System.out.println("1");
	    break;
	 case 2:
		 System.out.println("2");
		 break;
     default:
    	 System.out.println("invalid");
	     break;
	// we can change default and cases places different tan else if statement.
	     // case or default order does not matter
	}
	switch(score) {// must give an expression;data
	 
	 case 2:
		 System.out.println("2");
		 break;// closing statement
	 default:
	   	 System.out.println("invalid");
		 break;
	 case 1:
		   System.out.println("1");
		 break;
	}	 
    //break: Closing Statement exiting the switch statement.
    //without break it will continue to execute the all the cases till
	//find a break or closing curly brace}
	// without curly brace or break; code will continue run until exits the switch statement
	System.out.println("=============");
	
	String str = "Java";// without break it will xecute every statements
	switch (str){
		
		case "C#":
			System.out.println("C3 programming language");
			
			//System.out.println("hhh"); we can not add any extra statement after break statement
		case "Phyton":
			System.out.println("Phyton programming language");
		default://else
			System.out.println("invalid");
			
			
		
			
			
			
	}
	System.out.println("==========================");
	
	char grade ='A';
	switch (grade) {
	
	
	case 'B':
		System.out.println("Passed with B");//'A' != 'B'
	case'C':
		System.out.println("Passed with C");// 'A' != 'C'
	default:
		System.out.println("Failed");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
	

}
	
	
	
}
		
	


