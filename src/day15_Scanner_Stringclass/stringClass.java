package day15_Scanner_Stringclass;

public class stringClass {
	public static void main(String[] args) {
		/*
		 * Heap Memory; the place where all the objects are stored at
		 * String Pool: located in the heap memory, stores all strings literals object.
		 String class:
		 1. String is consider as an object
		    There are 2 ways to create object from string class
		     1. String literals: 
		     
		     String str="cybertek";===>create object and stored in string pool in java heap memory
		     
		     2. By using the new keyword: String str = new String("Cybertek");===> stored in in Java heap memory
		     
		        String str = new String("cybertek");
		        
		 When the object is created by string literals that object will saved to string pool
		 (string pool does not take duplicate)
		 When the String object is created by using"new" keyword. 
		 The object will be saved at java heap memory NOT in the string pool
		 2. String object represent the sequences if characters=====>"ABCDE"these are all each character
		 each character in String value has its own index number
		 index number.index numbers starts from 0
		 String str= "Cybertek";
		 index number 01234567
		 index number starts from "0"
		 3. String is immutable:
		      once you declare iy you can not modify it.

		 */
		
		 String str = "cybertek";
		 String A= "cybertek";
		 String B="cybertek";
		 //there is only one "Cybertek" created at the string pool for these 3
		 String str2 = new String("Cybertek");
		 
		 System.out.println(A==B);//returns TRUE
		 //both string literals are stored at string pool as one object if they are the same
		 
		 System.out.println(str==str2);// returns FALSE because different memory locations
		 //str stored in string pool
		 //str2 stored in heap
		 
		 String str3 = new String("cybertek");
		 System.out.println(str2==str3);//returns FALSE  because even data is the same 
		 //2 different object created in heap memory location when created with "new" keyword 
		 
		 String a = "batch12";
		 String b=  "Batch12";
		 System.out.println(a==b);// FALSE===>java is case sensitive
		 
		 
		 
		 String c = new String("batch12");
		 String d = new String ("Batch12");
		 System.out.println(c==d);//FALSE ==>two different objects
		 
		 
		 
		 
		 
		 
	}  

}
