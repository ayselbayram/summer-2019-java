package day17_StringClass;

public class stringMethods {
	public static void main(String[] args) {
		/*
		1.String is object, we called it object because every time we declare string it creates the string automatically 
		  2 ways we can create sting class object
		     1. String literals;
		         String str = "";  // stored in "string pool"//located in java heap memory
		     2. by using "new" keyword //saved in heap memory somewhere
		         String str = new String("");
		2. String is immutable, can not be modified
		3. String represent Sequence of characters;each character in string has index number and starts with 0
		     "ahmet" string    'd' character
		     String str= "cybertek'
		      index num   01234567
		   length=8
		   hoghest index num=length-1
		         
		         
		 java heap; memory location where the all objects will be saved(stored) at.
		 string pool: located in java heap memory.it is a very special place memory location for string literals
		 
		 every time if the string objects is created by string literals that object will be saved at string pool
		 every time if the string object created by using "new" keyword object will be saved in heap memory 
		 outside the string pool
		 
		 one memory location can be shared by multiple variables in String Pool.
		 
		 */
		

		 
		
		
		 //  ==
		
		String str1="Hello Javengers";
		 String str2= "Hello Javengers";
		 Boolean R1= str1==str2;//true
		 System.out.println(R1);
		 //because their memory is the same location
		 
		 String str3 = new String("Hello Javengers");
		 String str4 = new String("Hello Javengers");
		 boolean R2= str3==str4;  //false
		 //because their saved memory location is totally different in java heap
		 System.out.println(R2);
		 
		 boolean R3= str1==str3;//false
		 //because str1 in string pool(public pool), str3 in java heap pool(private pool)
		 System.out.println(R3);
		 
		 /*
		  String Class Methods
		  1.Concat,2,lenght, 3. charAt, 4.toUpperCase, 5.toLowerCase
		  */
		 
		 
		 //concat(str); it takes string and combines two strings, and ut returns it as new String value
		 
		 String a= "Cybertek";
		 a.concat("School");// cybertek school
		 a= a.concat("School");// we are reassingning to a
		 System.out.println(a);// cybertek school
		 
		 //exp
		 String A="hello", B="hello ";// different values " " space
		 System.out.println(A==B);//false
		 System.out.println("==========");
		 
		 //length(); it returns the total number of the characters as an int value.
		 String longname =" abcdefghyjtkdjd";
		 int num=longname.length();
		 System.out.println(num);
		 
		 System.out.println("============");
		 
		 //charAt(indexnum); it returns the character of that index num as char value
		 
		 String name1="muhtar";
		 char ch=name1.charAt(5);
		 System.out.println(ch);// r, index 5 is 'r'
		 
		 System.out.println("============");
		 
		 /*toUpperCase(); converts the strings value to upper case and returns it as a NEW string value
	
		  * toLowerCase(); converts it to lower case and returns it as a NEW string value
		 
		 */
		  String name2= "cybertek";
		 name2=name2.toUpperCase();
		 System.out.println(name2);
		 
		 String name3= "CYBERTEK";
		 name3.toLowerCase();
		 name3=name3.toLowerCase();
		 System.out.println(name3);
		 
		 String address="Mclean,VA, 22000";
		 String zipcode=address.substring(11);
		 System.out.println("zipcode:" +zipcode);//22000
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
	}

}
