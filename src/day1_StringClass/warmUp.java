package day1_StringClass;

import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		/*
		 1.write a program that aska user "frist and last name" an the prints 
		 out the initals of the user 
		 by using substring method and charAt method
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String firstname= scan.nextLine();
		String lastname=scan.nextLine();
		//if both of them are nextLine there is no problem but when the first one ix next()
		//the enter will be taken by the nextLine()
		//String initials=(firstname.substring(0, 1).concat(".")+lastname.substring(0, 1)).toUpperCase();
		//                                                                               makes it upper case
		//System.out.println("initials are:"+initials);
		
		// do it with charAt() method
		//we can also do it loke thid
		//int firstnameindexnum=firtsname.length()-1;
		//int lastnameind=lastname.length()-1;
		
		
		String intials=(""+firstname.charAt(0)+"."+lastname.charAt(0)).toUpperCase();
		System.out.println("initials are:"+intials);
		//print last letters
		String Lastletter=(""+firstname.charAt(firstname.length()-1))+"."+lastname.charAt(lastname.length()-1);
		Lastletter=Lastletter.toLowerCase();
		
		System.out.println("last letters are :"+Lastletter);
		//do it with the substring
		
		
		
		// warmup2
		
		
		
		
		
				
	}

}
