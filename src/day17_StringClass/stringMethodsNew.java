package day17_StringClass;

public class stringMethodsNew {
	public static void main(String[] args) {
		/*
		  String methods2
		  
    1.trim(); removes the unused spaces, and returns a new string value
	2.substring() has 2 types 
	   1. substring(beginning index):it creates the sub value of the string from the beginning index till the last index.
		   returns it as a NEW string value. 
	   2.substring(beginning index, ending index); it creates sub value of the string 
		 from the beginning index till the ending index(ending index will be excluded)
		 and return it as string value
	3. replace() has 2 types
	      1.replace('old char','new char'); replaces all the char value with the given new char value in the string 
	      and returns it as new string value
	      2. replace (old str,new str ): replace all the str values with the given new str values, 
	      and returns it as new string value
	4. replaceFirst(old str,new str): it replaces the first occurred old str with the new str.and returns as new string value
		 */
		
		//trim();
		
		String s1= "                    hello      ";
		s1= s1.trim();// removes the space at the beginning and the end
		System.out.println(s1);
		
		//exxp
		String s2="Cybertek       School";
		s2=s2.trim();// if the spaceis contained between the wordsDOES NOT TRiim that space
		System.out.println(s2);
		//ex2
		String s3="  ";
		System.out.println(s3);
		s3=s3.trim();// trim the 2 space
		System.out.println(s3);
		//exp3
		String s4= "       cybertek     shool";
		s4=s4.trim();// trim the beginning space
		System.out.println(s4);
		
		System.out.println("========");
		
		
		//1. substring(beginning index):it creates the sub value of the string from the beginning index till the last index.
		  // returns it as a NEW string value.
		
		String str="cybertek School is fun";
		//          0123456789   //beginning index num,9
		String str2= str.substring(9);//school is fun
		System.out.println(str2);
		
		String address="Mclean,VA, 22000";
		 String zipcode=address.substring(11);
		 System.out.println("zipcode:" +zipcode);//22000
		 
		 /*substring(beginning index, ending index); it creates sub value of the string 
		 *from the beginning index till the ending index(ending index will be excluded)
		 *and return it as string value
		 */
		 
		 String name= "Hello cybertek svhool";
		 String name1= name.substring(6, 13);//cyberte without k
		 System.out.println(name1);
		 String name2= name.substring(6, 13+1);//cybertek
		 System.out.println(name2);
		 
		 String fullname="Cybertek School Batc12";
		 String middlename= fullname.substring(9,15);
		 System.out.println(middlename);
		 
		 System.out.println("=============");
		 
		 //replace(old char,new char); replaces all the char value with the given new char value in the string 
		 //and returns it as new string value
		 
		 
		 String str1="java is fun programming language";
		 str1=str1.replace('a', 'A');//replace it to any character,
		 System.out.println(str1);
		 
		 //2. replace (old str,new str ): replace all the str values with the given new str values, and returns it as new string value
		 String str3="today is gonna be a great day to learn java";
		       str3=str3.replace("today", "tomorrow");
		       System.out.println(str3);
		    // we can also delete a string with this method
		       str3=str3.replace("java", " ");//delete all java words in sentence
		       System.out.println(str3);
		       
		       System.out.println("=============");
		       
		       //replaceFirst(old str,new str): it replaces the first occurred old str with the new str. and returns as new string value
		 
		 String s5= "Java is really fun, java is good";
		s5=s5.replaceFirst("java", "phyton");
		 System.out.println(s5);
		 
		 s5=s5.replace('s','S');//replace all s--S
		 System.out.println(s5);
		 s5=s5.replaceFirst("is good","is Good");
		 System.out.println(s5);
		 System.out.println("=================");
		 
		 
		 String s6="java is programming language, java is java";
		 //s6= s6.replace("java", "c#");, replace all the java with c#
		 s6=s6.replaceFirst("java is ", "c# is ");// only replace 
		 System.out.println(s6);
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
	}

}
