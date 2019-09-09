package homePractice.java;

public class p1 {
public static void main(String[] args) {
	int a= 10; 
	byte b = (byte) a;// explicit casting
	System.out.println(b);
	
	
	
	double  decimalNumber = 10.5;
	float floatNumber = (int) decimalNumber;
	System.out.println(floatNumber);
	float a1 = (byte) decimalNumber;
	System.out.println(a1);
	float a2 = (short) decimalNumber;
	System.out.println(a2);
	float a3 = (long) decimalNumber;
	System.out.println(a3);
	float a4 = (float) decimalNumber;
	
	long LongNumber = 300l;
	
	int IntNumber = (short) LongNumber;// if the value is not in the range that the number co
	System.out.println(IntNumber);
	int I1 = (byte)IntNumber;
	int I2 = (int)IntNumber;
	
	
	
	
	
}
}
