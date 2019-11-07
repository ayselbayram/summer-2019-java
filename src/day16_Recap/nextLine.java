package day16_Recap;

import java.util.Scanner;

public class nextLine {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
	//nextLine ,methods accepts the "enter" from the keyboard
		
		System.out.println("Enter your phone number");
		//911 then "Enter"
		int phone=scan.nextInt();
		System.out.println(phone);
		scan.nextLine();
		System.out.println("Enter your name");
		String name=scan.nextLine();
		//the "Enter" I typed right after number actually took by nextLine,
		//then nextLine not allow to enter anything else
		//in order to fix this problem we need to assigned that ENTER to "scan.nextLine();"
		/*
		 *nextLine() methods will take everything in scanners memory up to the new line
		 */
		
		
		
		
		
		
		
	
	}

}
