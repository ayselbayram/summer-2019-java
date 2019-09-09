package homePractice.java;
import java.util.Scanner;


public class scannerClass2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your name");
		String name = input.nextLine();
		System.out.println("Enter your last name");
		
		String lastname = input.nextLine();
		System.out.println("My name is "+ name +" "+ lastname);
		
	}

}
