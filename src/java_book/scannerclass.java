package java_book;
import java.util.Scanner;


public class scannerclass {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two whole numbers");
		System.out.println("Saparated by one or two spaces");
		int n1 = keyboard.nextInt();
		int n2 = keyboard.nextInt();
		System.out.println(" You entered "+n1 + " and "+ n2);
		System.out.println("next enter two numbers");
		System.out.println("A decimal point is OK");
		double d1 = keyboard.nextDouble();
		double d2 = keyboard.nextDouble();
		System.out.println("You entered " + d1 +" and "+d2);
		System.out.println("next enter two words");
		String s1 = keyboard.next();
		String s2 = keyboard.next();
		System.out.println("You entered " + "\"" + s1 + "\"" + " and " + "\"" + s2 +"\"");
		System.out.println("next you enter a line of text");
		String s3 = keyboard.nextLine();
		
        System.out.println("You entered " + "\""+ s3 + "\"");	
        
		
		
	}

}
