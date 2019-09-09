package homePractice.java;
import java.util.Scanner;

public class ScannerClass3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 1. number");
		int num1 = input.nextInt();
		System.out.println("Enter 2. number");
		int num2 = input.nextInt();
		System.out.println("Enter 3. number");
		int num3 = input.nextInt();
		
		int max= num1>num2&&num1>num3 ? num1
		
		
		         : num2>num1 &&num2>num3 ?  num2
			
		               :num3;
		         System.out.println("great number= " +max);
				
		
		
		
		
				
	}

}
