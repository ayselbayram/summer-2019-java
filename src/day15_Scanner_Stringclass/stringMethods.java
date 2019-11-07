package day15_Scanner_Stringclass;

public class stringMethods {
	public static void main(String[] args) {
		/*
		 String Methods:
       1-charAt(indexnum): it takes the index number and return's its character as char value.
       exp: String str ="cybertek";
            index        01234567
            str.charAt(5)==returns"t"==as char
          2-Length() methods; returns the total number of characters.
                String str ="cybertek";
                str.length()==>8
          
          3- concat(str) method: it takes a String and concats it to the String variable,
          and then returns NEW String value. modify the string
          String str ="cybertek";
          str.concat(" school");===>Cybertek school
          
          4- toUpperCase():converts to UpperCase AND THEN RETURNS IT TO A BRAND NEW VALUE
             String str ="cybertek";
             str.toUpperCase()===CYBERTEK
             
          5- toLowerCase(); converts to lower case AND THEN RETURNS IT TO A BRAND NEW VALUE
              String str ="CYBERTEK";====>CYBERTEK
              str.yoLowerCase();===>cybertek
              
          ,
          
		 */
		
		
		String str= "Cybertek";
	//index num:     01234567
	//	charAt(index):
		
		//System.out.println(str.charAt(8));// gives error because the string we have only  index num,index does not exist
		
		
		//charAt(index) method
		char ch = str.charAt(4);
		System.out.println(ch);
		
		String str2 = "Mu htar";
		//indexnum     0123456
		System.out.println(str2.charAt(2));//returns " "
		
		//length() methods
		String name ="Donald J Trump";
		int n= name.length();//n=14
		System.out.println(n);// n=14
		System.out.println(name.length());// 14 characters in this string
		
		//concat() method
		String s1 = "Cybertek";
		s1.concat(" school");// attempt to modify String s1
		System.out.println(s1);//Cybertek==> String immutable,that is why gives me cybertek, can not be modified
		//immutable= can not be modified but concat() returns you brand new string
		//s1= s1.concat(" school");==>both way is fine
		String s2= s1.concat(" school");//re initializing s1 value
		System.out.println("hh"+s2);//==>Cybertek school
		System.out.println(s1.concat(" school"));
		
		// toUpperCase(); method
		String N="cybertek";
		System.out.println(N);//==Cybertek, string is immutable
		N=N.toUpperCase();
		System.out.println(N);//==CYBERTEK
		
		//toLowerCase(): method
		String M ="SCHOOL";
		M.toLowerCase();
		System.out.println(M);// ==SCHOOL, STRING IS IMMUTABLE
		M=M.toLowerCase();
		System.out.println(M);//==school
		System.out.println("===========");
		
		//practices
		
		//charAt()== to get(extract) a specific character from a string and returns it as char value
		String a = "Batch 12 Javengers";
	    // index num  
		System.out.println(a.charAt(9));
		 char ch1= a.charAt(14);
		 System.out.println(ch1);
		 
		 //length()== how many characters are in the string
		  int num = a.length();
		  System.out.println(num);
		  int HighestIndexNum= a.length()-1;
		  System.out.println(HighestIndexNum);
		  //length()method= returns the total number of character in the string as an int value
		  System.out.println("=============");
		  
		 // concat("");
		  String b="Cybertek";
		  b.concat(" Batch12 Javengers");
		  System.out.println(b);//==Cybertek==
		  b=b.concat(" Batch12 Javengers");// I can also assign it to another string variable
		  System.out.println(b);// Cybertek Batch12 Javengers
		 System.out.println("===================");
		 // concates the value to the variables value and then returns a brand NEW string value
		 
		 //toUpperCase()
		 String d ="book";
		 d.toUpperCase();
		 System.out.println(d.toUpperCase());//BOOK
		 System.out.println(d);//book
		 d = d.toUpperCase();
		 System.out.println(d);//BOOK
		 
		 //toLowerCase()
		 String e = "JAVA IS FUN";
           e.toLowerCase();		
           System.out.println(e);// ==JAVA IS FUN
          String f =e.toLowerCase();
          System.out.println(f);//java is fun
		 
		
		
	}

}
