package day16_Recap;
import java.util.Scanner;//imports one class
public class warmUp {
	public static void main(String[] args) {
		/*
		 *Write a program that ask a user first and last name and then
		 print the full name in capital letters
		 */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your First name");
		String firstName= keyboard.nextLine().toUpperCase();
		System.out.println("Enter your Last name");
		String lastName= keyboard.nextLine().toUpperCase();
		//String Fullname= firstName+" "+lastName;//we can do it also with concat method
		//Fullname=Fullname.toUpperCase();//we can do it in both way
		String Fullname= firstName.concat(" "+lastName).toUpperCase();
		
		System.out.println(Fullname);
	}

}
