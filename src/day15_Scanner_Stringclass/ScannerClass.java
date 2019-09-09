package day15_Scanner_Stringclass;

import java.util.Scanner;// import Scanner class only from java.util


import java.util.Scanner;//Wild import// imports all the classes from java.util


public class ScannerClass {
	public static void main(String[] args) {
		/*
		 Scanner Class: used for reading the user input
		 package name is: java.util
		 class name: Scanner
		 Scanner class presented in "java.util"
		 in order to use Scanner, we MUST imported from its package
		        import java.util.Scanner;//import scanner class only from java.util' package
		 import statement  must be placed between class and package
		         package A;
		             import java.util.Scanner;
		         public class B{}
		         
		         
		   WILD import: 
		         import java.util.*;
		    import all the classes within 'java.util' package
		 */
	
		/*Declaration of scanner class:
		          Scanner variablename = new Scanner(System.in); 
		variablename: can reference an object of scanner class
		
		new Scanner(System.in): creates an object from the scanner class
		*/
	Scanner input = new Scanner(System.in);
	System.out.println("Enter byte value");
	        byte num = input.nextByte();//returns the user input as byte value
	        System.out.println(num*5);
	/* Scanner methods: 
	     variablename.nextByte();// this method returns the user input as Byte value
	     variablename.nextShort();//this method returns the user as Short value
		 variablename.nextInt();//returns the user input as int value
		 variablename.nextLong();// returns the user input as long value
		 variablename.nextFloat();//returns the user input as float value
		 variablename.nextBoolean();// returns the user input as Boolean value
		 variablename.nextLine();// returns the ENTIRE user input as String
	*/
	        System.out.println("Enter short value");
	        short num2 = input.nextShort();
	        
	        System.out.println("Enter int value");
	        int num3 =input.nextInt();
	        
	        System.out.println("Enter long value");
	        long num4 = input.nextLong();
	        
	        System.out.println("Enter boolean expression");
	        boolean result = input.nextBoolean();//we have to enter True or False
	        
	        System.out.println("Enter Float value");
	        float num5 = input.nextFloat();
	        
	        System.out.println("Enter double value");
	        double num6 = input.nextDouble();
	        
	        
	        
	        
	        
	        
	        

}
}