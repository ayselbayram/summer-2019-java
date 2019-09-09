package day06_ArithmaticOperators;

public class primitivesCasting {
	public static void main(String[] args) {
		/*
		 casting: converting the larger primitive to smaller size. 
		    datatype variable name = (datatype)value
		    castings are either: explicit or implicit
		    explicit: used when converting using large datatype into a smaller datatype. 
		    Has to be done manually
		    exp: int a =10;
		        byte b = (byte) a;
		 primitives: byte, short, int,long, float, double
		  
		 
		 */
		//EXPLICIT CASTING
		
		int a= 10; 
		byte b = (byte) a;// explicit casting
		System.out.println(b);
		
		double  decimalNumber = 10.5;
		float floatNumber = (int) decimalNumber; // float number 10
		
		
		System.out.println(floatNumber);
		
		long LongNumber = 300l;
		
		int IntNumber = (short) LongNumber;// if the value is not in the range that the number co
		System.out.println(IntNumber);
		
		
		/*IMPLICIT CASTING: converting smaller size to larger size. Implicit casting is done by the compiler
		 * byte a = 10;
		 * int b =a;
		 * or int b = (int)a; done automatically
		 * 
		 * 
		 */
		 byte byteNum = 100;
		 int intNum2 = byteNum;
		 // these 2 ara the same
		 int intNum3 = (int) byteNum;
		 
		 short shortNum = 100;
		 long longNum2 = shortNum;
		 // they are the same
		 long longNum3 = (long) shortNum;
		 System.out.println("=============");
		 
		 //explicit casting examples
		 
		 double largestNum = 100.8765;
		 //bte byteNum = largestNum;
		 byte bytevalue = (byte) largestNum;//100
		 System.out.println(bytevalue);
		 
		 float floatvalue1= (float) largestNum;//100.0
		 System.out.println(floatvalue1);
		 
		 //float floatvalue= (short) largestNum; works
				 //float floatvalue= (float) largetsNum;works
		 //float floatvalue = (int) largestNum;works
		 float floatvalue2 = (int) largestNum;
		 System.out.println(floatvalue2);
		 float floatvalue3= (short)largestNum;
		 System.out.println(floatvalue3);
		 
		 float floatvalue4= (long) largestNum;
		 System.out.println(floatvalue4);
		 
		 /*short c= 180;
		  * byte d = (byte) c;
			 System.out.println(d); olmuyo sonuc -76 cikiyo
		  */
				 
		 //exp2 explicit casting
		 System.out.println("========");
		 
		 float Fnum= 500.67f;// 500
		 int iNum = (short) Fnum;
		 System.out.println(iNum);
		 // only used short or int
		 
		 //extra info
		 int num1 = 100, num2=200, num3=300;
		 //int num1 = 100;
		 //int num2=200;
		 //int num3=300;
		 /*
		  *  above lines are local variables
		  *  local veriables; veriables are declared with in the main method
		  *  LOCAL VARIABLES MUST BE DEFINED BEFORE WE USED IT
		  *  boolean result;
		 System.out.println(result); gives you compile erroro we need to define it
		  */
		 char Character1='A';
		 System.out.println(Character1);
		 
		 //bolean result1, result2, result3;
		// System.out.println(result1); we must be initialize them. error
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
