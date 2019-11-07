package day16_Recap;

import java.util.Scanner;

public class nextVsnextLine {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name");
		String name= scan.next();
		System.out.println("Enter your last name");
		String lname=scan.next();
		
		System.out.println("your first name is "+name);
		System.out.println("your last name is "+lname);
		
		//next() take only one word the next word assigned the next scan entry
		//nextLine() takes the whole string
		
	
	}

}
