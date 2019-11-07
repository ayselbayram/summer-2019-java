package day33_ArrayList;

public class methodCalls1 {
	// any custom method can call each other
	public static void main(String[] args) {
		method1();//java method can not call itself
		method2();
		System.out.println();
		method3();
		
		int max2=max(34,687);//20
		System.out.println(max2);
		
		int max3=max(100,200 , 300);
		System.out.println(max3);
		
		maximumnum(465, 6758, 6574);//void can not assign to any data type, not return
		
		String str=print(10,20,30);//30
		System.out.println(str);
		
		int max=max(56, 67, 27, 89);
		System.out.println(max);
		
		int maxLast=max(56, 76, 546, 98, 1);
		System.out.println(maxLast);
		
		
		
		
	}
	public static void method1() {
		//method2(); method 2 contains method1
		System.out.println("A");
	}
	public static void method2() {
		method1();//A
		System.out.println("B");//B
	}
	public static void method3() {
		method2();//A B
		System.out.println("C");//C
	}
	public static int max(int a,int b) {
	   return (a>b)?a:b;
		
	}
	public static int max(int a, int b, int c) {
		int largestnum=max(a,b);//called max method
		return (largestnum>c) ? largestnum : c;
		
	}
	public static int max(int a,int b, int c, int d) {
//		int result=max(34, 56, 67);
//		if(result>d) {
//			return result;//89
//		}
//		return d;//
		
		//another way
		
		return max(max(a,b) , max(c,d));
		
	}
	public static void maximumnum(int a, int b,int c) {
		System.out.println(max(a,b,c));
	}
	public static String print(int a, int b, int c) {
		maximumnum(a,b,c);
		return"900";
		
	}
	
	public static int max(int a, int b, int c, int d, int e) {
		return max(max(a, b, c, d) , e);
	}
	
	
	/*
	 1-write a return method that can remove the duplicate from a string.
	   ex= removedup("AABBBCCCDD")==>ABC
	 2-write another return method that passes two string parameters, and return the number of occurance  and b
	    and return the number of apperances of b in a( how many times b occured in a)
	    exp=occured ("ABAB" , "A)==>2 times
	    
	 3- combine method 1 and 2 to write a method that can find the frequency of characters
	  exp;("AAABBBCCCDD")===>A3B3C3D2
	 */
	
	

}
