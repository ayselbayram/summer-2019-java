package day16_Recap;

import java.util.Scanner;

public class nextVsnextLine {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name");
		String name= scan.next();
		System.out.println("Enter your last name");
		String lname=scan.nextLine();
		
		System.out.println("your first name is "+name);
		System.out.println("your last name is "+lname);
		
	
	}

}
