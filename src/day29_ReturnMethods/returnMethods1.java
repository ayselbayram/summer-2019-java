package day29_ReturnMethods;

public class returnMethods1 {
	

		/*
		 meyhod decleartion:
		 sccess mofifier specifier return-type name{}
		 public static void 
		 
		 RETURN TYPE: void or other data types(int,sting....)
		 if the return type is not vois it is must be primitive or nonprimitives
		 
		 we have to use return statement;
		 return statement: used for exiting the method, 
		 we can also use return statement for return a value from the method
		  
		 void: does not return any value
		 
		 if the return- type is not void: the method must return a value
		 
		 RETURN METHOD:
		      1. does not have void as return type
		      2. the method must return a value otherwise compile error
		      3.the returning value must match with the return type of the method
		      4.the method body must be closed with return statement
		 there can only be one return type
		 */
	
	
	
	public static void main(String[] args) {
		name();//this is a string value
		System.out.println(name());//this how we call the method
		//return methods are either printed or assigned to the variable
	    String str=name();//assigned to another variable
	    System.out.println(str);
	    //exp
	    result();
	    System.out.println(result());
	    //exp
	     num();
	    System.out.println(num());
	    liter();
	    System.out.println(liter());
	    
	    
	}
		
		public static void method1() {
			System.out.println("hello");
			return;//exits the method immediately
		}
		// if the return type of the method is NOT VOID
		
		public static String name() {
			return "Batch12";//return a value
			//System.out.println();//unreachable
			//once return statement is executed then exits the method immediately
			
		}
		
		//exp
		
		public static boolean result() {
			return 9>7;
		}
		//exp
		public static int num() {
			return 2+4;
		}
		
		//exp
		public static double liter() {
			return 3*3.75;
		}
		
	

}
