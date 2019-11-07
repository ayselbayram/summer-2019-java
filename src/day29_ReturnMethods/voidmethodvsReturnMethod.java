package day29_ReturnMethods;

public class voidmethodvsReturnMethod {
	public static void main(String[] args) {
		
	
	/*
	     void does not return any value
	     return method must return a value
	     
	     
	     continue statement=skips the current iteration of the loop
	     break statement=exits from the loop or swith statement
	     return statement=exits the method after the condition is true
	     System.exit(0): java stops all the execution
	 */
	
	
	for(int i=0;i<5;i++) {
		if(i==3) {
			return;//exits the method after the condition 012
			//break;//exits the loop
		}
	}
}
}

