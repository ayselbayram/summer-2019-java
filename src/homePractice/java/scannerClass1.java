package homePractice.java;
import java.util.Scanner;

public class scannerClass1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first number");
		byte num1 = input.nextByte();
		System.out.println("First number" + num1);
		System.out.println("Enter the second number ");
		byte num2 = input.nextByte();
		
		System.out.println("Second number is " +num2);
		System.out.println("num1 + num2 is " + num1 + num2);
		
		
	}
	

}
