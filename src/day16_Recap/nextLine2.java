package day16_Recap;

import java.util.Scanner;

public class nextLine2 {
	public static void main(String[] args) {
		/*
		 write a program that accepts zipcode,city,state,phonenumber
		 and then display all those gathered information
		 do not use next method
		 */
	
	Scanner input=new Scanner(System.in);
    System.out.println("Enter your zip code");
    int zip = input.nextInt();
    //12345"ENTER"//to get rid of this enter from scanner, i need to give something to take that ENTER
    //input.nextLine();===>takes out that enter
    
    input.nextLine();
    
    System.out.println("Enter your city");
    String city= input.nextLine();
    
    System.out.println("Enter your phone number");
    int phone = input.nextInt();
    //65657 ENTER
    
    input.nextLine();//take the ENTER from previous line
    
    System.out.println("Enter your state");
    String state=input.nextLine();
    
    
    System.out.println("zip code is: "+zip);
    System.out.println("city name is: "+city);
    System.out.println("phone number is: "+ phone);
    System.out.println("state name is: "+state);
    
    
    		
    		

}
}