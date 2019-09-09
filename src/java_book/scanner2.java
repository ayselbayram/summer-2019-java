package java_book;
import java.util.Scanner;

public class scanner2 {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter three numbers;");
	int num1,num2,num3, ValueOfSum;
	num1= keyboard.nextInt();
	num2= keyboard.nextInt();
	num3=keyboard.nextInt();
	ValueOfSum= num1 + num2+num3;
	System.out.println(ValueOfSum);
	
}
}