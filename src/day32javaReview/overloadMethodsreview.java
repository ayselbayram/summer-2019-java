package day32javaReview;

public class overloadMethodsreview {
	/*
	 overload method: improves the reusability
	                  improves readibility
	                  very flexible during the run time
	                  
	  overload: multiple methods sharing the same name but different parameters.
	   return type is the overload does not matter               
	 
	 */
	public static void main(String[] args) {
	sum(10,20);	
	sum(23.5,67.4);
	sum(34,56,32);
	sum(34, 465, 10<20);
	int total=sum(10, 10.5, 10);
	System.out.println(total);
	}

	public static void sum(int a,int b) {
		System.out.println("sum is: "+ (a+b));
	}
	public static void sum(double a,double b) {
		System.out.println("double sum : "+(a+b));
	}
	public static void sum(int a,int b,int c) {
		System.out.println("Sum of three num: "+(a+b+c));
	}
	public static void sum(double a, long b, boolean c) {
		System.out.println("you have entered "+a+" "+b+" "+c);
	}
	public static int sum(int a, double b, int c) {
		int sum=(a+(short)b+c);
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
}
