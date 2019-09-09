package Day04_variables;

public class PrimitiveDataTypes2 {
	/*
	 byte,short,int,long,float,double,boolean,char 
	 boolean: takes boolean expressions, and returns either true or false, 
	    anything that return either true or false it can be initialize with boolean
	 boolean result4 = earth is flat(can not assign), boolean only takes true or false results
	 
	 char: we have to know ASCII table. char primitive related to the ASCII table.
	 Char values declare with in the single quote''. single character as value only
	 ASCI TABLE: Acii table has all the characters, alphabet of computer programming language,
	 universal system that  understood by all the computers.
	 Each character has their own corresponding numbers to represent it.
	 
	 */
public static void main(String[] args) {
	boolean result = true; // true and false are java reserved words
	boolean result2 = false;
	boolean result3 = 9 > 3;
	boolean result4 = 2 > 5; 
	System.out.println(result); //true
	System.out.println(result2); //false
	System.out.println(result3); //true
	System.out.println(result4); //false
	
	// char:
	
	char char1 = 'a';// only we use single quote' when we are declaring single character
	System.out.println(char1);
	char char2 = '9'; // print the character as it is
	System.out.println(char2);
	char char3 = '#';
	System.out.println(char3);
	System.out.println("\n\n\n"); // give me multiple lines \n
	// welcome==> when you reverse it emoclew to do it we will need char
	// char with numbers
	char char4 = 67; // we dont need ' when we use numbers. ASCII table 
	System.out.println(char4);
	char char5 = '{'; // or char char5 = 123
	System.out.println(char5);// char 5 and char 6 print the same character is {
	char char6 = 123;
	System.out.println(char6);
	
	// initializing char to other primitives. char can be initialize to (byte,int,short,long,float,double)
	 char MyChar1 = 'b';
	 int MyInt = 'b';
	 System.out.println(MyInt); // the number that represent b initialize to the int
	 int MyInt2 = MyChar1;
	 System.out.println(MyInt2);
	 System.out.println("\n\n\n");
	 char myChar2 = 'e';
	 int myInt2 = 'e';
	 int myInt3 = myChar2;
	 
	 System.out.println(myChar2);
	 System.out.println(myInt2);
	 System.out.println(myInt3);
	 
	 
	 
	 
	 //byte
	 //byte MyByte = MyChar1;  char takes 2 bytes of memory, the byte takes 1 byte thats why we can't declare char to byte 
	 
	 byte MyByte = 'b';
	 System.out.println(MyByte);
	 //short
	 //short MyShort = MyChar1 // char' memory is could be bigger than short. range is greater than short too.
	 short MyShort = 'b'; //b's corresponding number is 98 from ASCII table
	 
	System.out.println(MyShort);
	
	
	//long
	
	long MyLong = MyChar1;// long memory is 8 bytes, bigger than char
	long MyLong2 = 'b';// b is 98
	System.out.println(MyLong2);
	
	//float:
	float floatNum = MyChar1;
	float floatNum2 = 'b';
	System.out.println(floatNum2);//98.0
	// double
	double doubleNum = MyChar1;
	double doubleNum2 = 'b';
	System.out.println(doubleNum2); //98.0
	/* all primitives data types accepts the value data from char characte
      byte a = 'a', short b = 'b', int c = 'c', long d = 'd', float f = 'f', double e = 'e'
      result will be the corresponding numbers of these characters from ASCII table.*/
	// java is case sensitive. 'A' does not equal to 'a'
	
	
	char c1 = 200;// out of the ASCII table 
	System.out.println(c1);// not recognize from all computers. we just need to know ASCII table thats all.
	byte deneme = 'f';
	System.out.println(deneme);
	char deneme2 = 'f';
	//byte deneme3 = deneme2; chart can not convert to byte because of the size
	
	
	
	
	
	
	 
	
}
}
