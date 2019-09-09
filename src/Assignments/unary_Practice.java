package Assignments;

public class unary_Practice {
	public static void main(String[] args) {
		int x =2;
		int y=x++;
		System.out.println(y);
		System.out.println(x);
		System.out.println("=============");
		
		int a= 2;
		
		
		System.out.println(a++);
		System.out.println("=============");
		
		int b = 2;
		System.out.println(--b);
		System.out.println("=============");
		
		int c= 8;
		int d = c--;
		
		System.out.println(d);
		System.out.println(c);
		
		System.out.println("=============");
		
		int e =1;
		e=-e-- + e++ / -e-- *--a;
		System.out.println(e);
		
		System.out.println("=============");
		
		
	}

}
