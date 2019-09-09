package day07_unary_shorthand;

public class quiz_kahoot {
	public static void main(String[] args) {
		//question 1
		
		int a = 30;
		int b=(byte)a;
		System.out.println(b);//30
		
		//question 3
		
		System.out.print("Result A"+ 0+1); //Result A 01
		System.out.print("; Result B"+ (1)+(2));// ; Result B12
		
		System.out.println("========");
		
		//question4
		
		System.out.println("5+2 = "+ 3+4);
		System.out.println("5+2 = " + (3+4));
		
		//quetion5
		
		float FloatNum = 100.98765f;
		short shortNum = (byte) FloatNum;
		System.out.println(shortNum);
		
		//question 7
		
		System.out.println((3+2)*2/3%2);
		
		//question 9
		
		long Lnum = 3_000l;
		double dNum = (float) Lnum;
		int Inum = (short)dNum;
		System.out.println(Inum%1000);//0
		
		//question 10
		double result1 = 10/3;
		System.out.println(result1);//3.0
		System.out.println(10.0/3);
		
		// question 12
		
		//String str ="10.5"// string of text
				//int num = str; //WE CAN NOT ASSIGN TEXT TO NUMBER PRIMITIVES.STRING IS NOT PRIMITIVE
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
