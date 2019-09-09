package day14_TernaryScanner;

import java.util.Scanner;
//this imports scanner class from java.util package
import java.util.*;
// this imports all the classes from java.utilpackage
//everything in scanner class is imported

public class scannerClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// Declaration
		System.out.println("Enter a byte value 1");
		    byte bytenum =  input.nextByte();// only allows user to enter byte values
	System.out.println("You have entered " + bytenum);
	
	 byte bytenum2=input.nextByte();
	 System.out.println("You have entered "+bytenum2);
	
	System.out.println("addition is "+ (bytenum + bytenum2));
		/*
		 it is a class that provides the methods to get user inputs.
		 Scanner class came presented in package "java.util"
		 in order to use the scanner class, the scanner class MUST be imported.
		 Import java.util.Scanner;
		 the import statement MUST be placed between package and class name
		 decleration of scanner;
		        Scanner variablename = new Scanner(System.in);
		   variablename: can reference      an object of the scanner class 
		   new Scanner(System.in): creates the object of the scanner class
		   
		   methods of scanner class;
		   variablename.nextByte(): allows user to enter byte value
		   variablename.nextshort()
           variablename.nextint()
           	   
		 */
	System.out.println("Where do you live");
	String question1 = input.nextLine();
	System.out.println(question1);
	System.out.println("How odl are you");
	int respond = input.nextInt();
	System.out.println(respond);
	System.out.println("do you have kids?");
	String question2 = input.nextLine();
	System.out.println(question2);
	
	
	
	
	}

}
