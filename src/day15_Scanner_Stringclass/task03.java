package day15_Scanner_Stringclass;

import java.util.Scanner;

public class task03 {
public static void main(String[] args) {
	/*
	 write a program that asks to enter first and last name at th end shoul didsplay the full name
	 */
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your first name");
	String name= input.next();
	System.out.println("Enter your last name");
	String lastname = input.next();
	System.out.println("Your full name is: " + name + " "+ lastname);
	input.close();// we closed the scanner here to get rid of the warning, we can not use it later 
}
}
