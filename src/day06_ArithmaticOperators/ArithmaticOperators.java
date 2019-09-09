package day06_ArithmaticOperators;

public class ArithmaticOperators {
	public static void main(String[] args) {
		/*
		 +: addition, ads 2 numbers together
		 -: subtraction, subtract a number from another number 
		 *: multiplication, multiplies
		  % remainder, returns the remainder from the divison
		 */
		
		int a=100;
		int b= a-400;// -300
		System.out.println(b);
		
		int c = a+b;
		System.out.println(c);//100-300=-200
		
		int x = 3, y=5, z=x*y;//if it is double it gives me 10.0
		System.out.println(z);//15
		
		int length=100,width=10, area= length*width;
		System.out.println(area);
		
		/*double resultnum =9/0;
		 * System.out.println(resultnum===> cant work
		 * denominater can not be zero
		 */
		
		short Number1 = 10/3;
		System.out.println(Number1);
		double Number2=10/3;//result 3.0/ if we give dominator a whole number machine takes it as int number
		System.out.println(Number2);
		double Number3 = 10/3f;//if i gave the dominator a decimal primitive value it gives me the decimal, the exact result
		System.out.println(Number3);
		double Number4 = 10/3.0;
		System.out.println(Number4);
		double Number5 = 10.0/3;
		System.out.println(Number5);
		
		
		int output = 12+6/3;// in math division calculated first then addition
		           //18/3=6
		System.out.println(output);//precedence: multiplicayion, division, %,
		
		System.out.println(5+2*4);//13
		System.out.println(5+4*2);//13
		System.out.println(10/2-3);//2
		System.out.println(8+12*2-4);
		
		//%REMAINDER
		/*
		 * 10/3==> 3 WITH REMAINDER OF 1
		 * 12/5==>2 WITH REMAINDER OF 2
		 
		 */
		int result1= 10%3;
		System.out.println(result1);
		System.out.println(12%5);
		System.out.println(20%3);
		
		//20,45,65,67,68
		int Number20 = 20%2;// if it gives me 0 no remainder even number, if it gives me something means odd number
		int Num45 = 45%2;
		System.out.println(Num45);
		int NUm65 = 65%2;
		System.out.println(NUm65);
		System.out.println(4+17%2-1);
		//                 4+1-1)
		System.out.println(6-3*2+7-1);
		
		System.out.println(6*3/2);
		System.out.println(6/2*4);//12 first came first
		//vip:() ,%, /, *,     
		
		System.out.println(1+2-2+3);//4
		System.out.println(1+2 - (2+3));//-2
		
		
		
		System.out.println(3+4*4+5*(4+3)-1);
		//                  3+4*4+5*7-1
		//                  3+16+35-1===53
		System.out.println((4+17)%2-1);//0
		
		
		//submit assignments: all java files stored in a folder called eclipse works space 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
