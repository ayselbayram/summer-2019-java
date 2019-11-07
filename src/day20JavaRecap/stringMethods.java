package day20JavaRecap;

import java.util.Scanner;

public class stringMethods {
	public static void main(String[] args) {
		/*
		 * methods:
		 * substring, indexOf(), lastIndexOf(),replace, replaceFirst, 
		 * equals, equalsIgnoraCase, contains, startWith,edsWith, chaeAr,trim,length,concat
		 */
		
		 //substring: creating the sub value of the string
		 
		
		String str="Cybertek Scool";
		String str2=str.substring(0,str.indexOf(" "));
		System.out.println(str2);
		
		//print out just school
		System.out.println(str.substring(str.indexOf("S")));//PROBLEM
		
		//indexOf()
		
		String s1="Java is a fun Langiage, I love java, java, java";
		System.out.println(s1.indexOf("a"));//1, returns the first occur values index number
		System.out.println(s1.indexOf("age"));//19, finds the "a" which has "ge" after that
		
		//lastIndexOf():returns the last occured char's index number
		System.out.println(s1.lastIndexOf("a"));// 34, finds the last "a"
		
		System.out.println(s1.lastIndexOf("ava"));//31, finds last "a" from "ava"
		
		System.out.println(s1.indexOf("ava,"));//gives the firts a which has "," at the end
		
		//replace :replace old value with the new one
		
		String name="Cybertek School Batch12";
		int length=name.length();
		System.out.println(length);//include the spaces
		name=name.replace(" ", "");//removed the spaces between the words
		System.out.println(name);
		System.out.println(name.length());//21 we erased the unused spaces with replace
		
		name=name.replace("e","a");
		System.out.println(name);
		
		name=name.replace("School", "Family" );
		System.out.println(name);
		
		//replaceFirst();replace the first occured characyer with the new one
		
		String A1="Java is fun, Java is object oriented, Java is cool, Java is fun";
		A1=A1.replaceFirst("Java", "C++");
			System.out.println(A1);
			System.out.println(A1.replace("n, Java", "n, phyton"));
			
			//==, equals, equalsIgnoreCase
			
			String R1="Cybertek";//string pool
			String R2=new String("cybertek");//heap
			String R3=new String("cybertek");//heap
			System.out.println(R1==R2);//false ddifferent loc.
			System.out.println(R1.contentEquals(R2));//true, visible text only
			System.out.println(R1.contentEquals(R3));//false case sensitivity
			System.out.println(R1.equalsIgnoreCase(R3));//true ignore case sensitivity
			
		// //trim();removed unused spaces
			
			String spaces="     N      ";
			spaces=spaces.trim();//"N" 
			
		System.out.println(spaces);
		
		String N1="      ";
		N1=N1.trim();
		System.out.println(N1.isEmpty());//true
		
		String N2="Tomorrow is gonna be a great day to do replit";
		N2=N2.trim();
		System.out.println(N2);//no remove spaces
		N2=N2.replace(" ","");
		System.out.println(N2);//replace " " with ""
		
		System.out.println("===========");
		
		//charAt()=returns a specific character from a string
		
		String C1="Cybertek";
		//         01234567
		char ch=C1.charAt(4);
		System.out.println(ch);//return 'r'
		
		String C2= "please do more and more java practises tomorrow";
		char ch2=C2.charAt(C2.lastIndexOf("o")+1);//w
		System.out.println(ch2);
		
		String sentence= "abcdefghijklmn";
		System.out.println(sentence.charAt(0));
		System.out.println(sentence.charAt(sentence.length()-1));
		String Result=""+ sentence.charAt(0)+	sentence.charAt(sentence.length()-1);
		System.out.println(Result);
		
		//startsWith-endWith: returns boolean checks the starting and ending values
		String gmail="cybertekSchool@gmail.com";
		boolean R=gmail.endsWith("@gmail.com");
		System.out.println(R);//true
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter you e mail address");
		String email=scan.nextLine().toLowerCase();
		if(email.endsWith("@gmail.com")) {
			System.out.println("valid e mail address");
		}else {
			System.out.println("invalid address");
		}
		
		scan.nextLine();
		
		//STARTS WITH WWW.
		System.out.println("eneter a web address");
		String URl=scan.nextLine().toLowerCase();
		
		if(URl.startsWith("www.")&&URl.endsWith(".com")){
		System.out.println("valid web side");
		
		}else {
			System.out.println("invalid adress");
		}
		
		
	// contains:checks if the given value is contained in the string or not
		
		String salary="100$";
		boolean check=salary.contains("$");
		System.out.println(check);//true
	//concat:combine 2 strings and returns a nesw string.
		String school="cybertek";
		String q=school.concat(" school");
		System.out.println(q);
		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
