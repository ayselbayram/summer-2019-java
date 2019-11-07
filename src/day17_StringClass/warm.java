package day17_StringClass;

import java.util.Scanner;

public class warm {
	public static void main(String[] args) {
		/*
		 * Declare Scanner class object
		 * ask user to enter first and last name
		 * declare string variable called full name
		 * concat first and last name assigning to full name
		 * display in the console total number of characeters of your full name
		 * print out the last character
		 */
		Scanner object= new Scanner (System.in);
		System.out.println("Enetr your first and last name ");
		String firstName=object.nextLine();
		String lastName=object.nextLine();
		String fullname= firstName.concat(" "+lastName);//concating first and last name
		int result = fullname.length();
		System.out.println(fullname +" contains "+result+" characters");
		
		// concat method we have to give String value or variable
		//+  we can give anything, string, number,cahr cagarcter, decimal numbers
		//print out the last character
		int lastindexnum=fullname.length()-1;
		System.out.println(fullname.charAt(lastindexnum));
	
		
		
		
		
		
	}

}
