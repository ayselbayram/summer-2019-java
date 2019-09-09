package Day03_variables;

public class PrimitiveDataTypes {
	/*
	 * Variables name rules:
	   1-variable names must start with the alphabet
	   2-variable names can not contain any special characters except _ and $ sign
	   3- variable name must be unique (can not use the same name to declare another value)
	   4-can not be java reserved words(can not be public, static, void, main, out etc.) 
	   PRIMITIVE DATA TYPES
	 * byte: we can assign integers(all the numbers) that's no decimal(no letters) must be wit in (-128<= byte <=127)
	 * short: we can only assign whole numbers. number range must be with in -32768<= short <=32767
	 * int(used more often): we can assign whole number. Must be in -21......
	 * long: whole numbers. Range of the data types......
	         the difference between int and long data type. we can give 'l or L' extension(means long data type) to 
	         the number in long data type
	         long longNumber = 10l
	         int intNumber =10 
	      byte< short<int<long    small one can be assigned to larger one---
	      byte byteNumber = 10;
		  short shortNumber = byteNumber;
	      
	 * Float: we can assign decimals. It does accept decimal must have 'f or F' at the end
	       float exampleNum2 = 10.5F; we give F at the end if it is decimal otherwise we don't need it
	 * double(used more often): we can assign decimal.
	 float < double
	 ALL THE FIRST 4 DATA TYPE (BYTE, SHORT, INT,LONG) CAN BE ASSIGNED TO 'FLOAT AND DOUBLE' DATA TYPE
	 
	 
	 
	
	 * While we are declaring a big numbers instead of comma(,) we used underscore(_) as comma
	 * 1,000,000,000=1_000_000_000
	 */

	public static void main(String[] args){
		byte length = 3;
		System.out.println(length);
		byte Width = 4;
		System.out.println(Width);
		
		//byte 9num=90 variable names must start with the alphabet
		
		byte byteNumber = 10;
		short shortNumber = byteNumber; //short is greater than byte 
		
		    
		int intNumer = -19876;
		long longNumber = intNumer;	// long is greater than int	
		
		 float exampleNum2 = 10.5F;//we need to have decimal number and f at the end
		 System.out.println(exampleNum2);
		 double doubleNumber = 10.5F;
		 System.out.println(doubleNumber);
		 
		 
		 byte bNumer = 10;
		 short snumber = 20;
		 int iNumber = 30;
		 long lNumber = 40;
				 System.out.println(bNumer);
		 System.out.println(snumber);
		 System.out.println(iNumber);
		 System.out.println(lNumber);
		 System.out.println("+++++++++++++++++++++");
		 
		 float fnum1 = bNumer;
		 float fnum2 = snumber;
		 float fnum3 = iNumber;
		float fnum4 = lNumber;
		System.out.println(fnum1);
				 System.out.println(fnum2);
				 System.out.println(fnum3);
				 System.out.println(fnum4 );
		 
		 
				 
		 
		
		
		
	}
}
