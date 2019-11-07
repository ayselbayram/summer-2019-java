package day25ArraysContinue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		
	
	/*
	 There are 2 methods that connect to Array
	     1-split(str): splits the string by the given value, and returns it as StringArray
	     String word="ABCDEFG";
	     String[] AllCharacters=word.split("");
	      System.out.println(Arrays.toString(AllCharacters));
	      [A, B, C, D, E, F, G]
	     2-toCharArray:returns a char Array from the String
	     String Str="Java";
	      char[] ch=Str.toCharArray();
	   System.out.println(Arrays.toString(ch));
	   [J, a, v, a]
	   
	 */
	
	//1-split(str):
	
	String sentence="Today is great day, good day to learn Java";
	   
	    String [] arr=sentence.split(" ");
	    System.out.println(Arrays.toString(arr));
	    
	    
	    
	//exp    
	 String email="firstname_lastname";
	 String[] arr2=email.split("_");
	 
	 String str=Arrays.toString(arr2);
	 System.out.println(str);//[firstname, lastname]
	 System.out.println(str.replace("[", " ").replace("]"," "));//get rid of the square brackets
	 
	 
	 System.out.println("==================");
	 
	 String fullname="Cybertek School Batch12";
	 //exp1
	 String[] array1 =fullname.split(" ");//creat an Array contains 3 words,2 spaces
	 System.out.println(Arrays.toString(array1));
	 //exp2
	 String java=" java I love java and java is fun, java is life java";
	            //   |  I love  |   and   |   is fun, | is life    |
	 String[] array2=java.split("java");
	 System.out.println(Arrays.toString(array2));
	 System.out.println(array2.length-1);//java occured 3 times in the sentence
	 //when java at the beginning and the end we need to put space at the beginning and edn to male the javas count
	 
	 
	 System.out.println("++++++++++++++++");
	 //phyton how many times
	 
	 String Python=" Python is good, I love Python, Python is life ";//put space at the beginning and end fro accuracy
	 //                 |    is good I love  | ,      | is  life
	 String[] array3=Python.split("Python");
	 System.out.println(array3.length-1);//returns the total number of Phyton in String
	 
	 System.out.println("****************");
	 
	 
	 
	 
	 
	 String emailAddress="Cybertek.school.batch12@Gmail.com";
	 String Fullname=emailAddress.substring(0,emailAddress.indexOf("@"));
	 System.out.println(Fullname);
	 
	
	 String [] allnames=Fullname.split("\\.");
	 System.out.println(Arrays.toString(allnames));
	 
	 System.out.println("First Name: "+ allnames[0]);
	 
	 
	 
	 System.out.println("%%%%%%%%%%%%%%%%%%");
	 String word="ABCDEFG";
	 String[] AllCharacters=word.split("");//all characters from the string as an Array
	 //splits the string character by character
	 System.out.println(Arrays.toString(AllCharacters));
	 
	 /*
	  * toCharArray()=returns a char Array from the String
	  */
	 
	 String Str="Java";
	 
	   char[] ch=Str.toCharArray();
	   System.out.println(Arrays.toString(ch));
	
	 
	 
	

}
}