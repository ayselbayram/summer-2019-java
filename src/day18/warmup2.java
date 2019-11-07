package day18;

import java.util.Scanner;

public class warmup2 {
	/*
	 ask user enter the first and last name
	 muHtAr
	 BuyHg
	 write a program correct the user input
	 output= Muhtar
	 lastnamename= Cybertek
	 */
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first and last name");
	String firstName= scan.nextLine();
	firstName= firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
	
	String lastname = scan.nextLine();
	lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
	
	String fullname= firstName.concat(" "+lastname);
	System.out.println("name is: "+fullname);
	
	
	String fn =scan.nextLine();
	fn=(""+fn.charAt(0)).toUpperCase()+fn.substring(1).toLowerCase();
	//string now
	
	String ln=scan.nextLine();
	ln=(""+ln.charAt(0)).toUpperCase()+ln.substring(1).toLowerCase();
	
	
	
	
}

}
