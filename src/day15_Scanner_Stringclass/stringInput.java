package day15_Scanner_Stringclass;

import java.util.Scanner;

public class stringInput {
/*
 *next() vs nextLine()
 nextLine()// returns entire user input as String value
 next()// returns the first word of the user input as String value
 */
  public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter your first name");
	String firstname= scan.nextLine();
	
	System.out.println("Enter your last name");
	String lastname=scan.nextLine();
	
	System.out.println("==============");
	
	
	
	
	Scanner scan1= new Scanner(System.in);
	System.out.println("Enter your first name");
	String firstname1= scan1.next();
	
	System.out.println("Enter your last name");
	String lastname1=scan1.next();
	System.out.println("first name;" + firstname1);
	System.out.println("last name:" + lastname1);
	
	System.out.println("Enter char value");
	char ch = scan.next().charAt(0);
	System.out.println(ch);
}
	
	
	
}
