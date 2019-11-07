package day45_Inheritance;

public class MultiClass {
	/*
	 * multi Classess:we can have multiple classess in a java file.
	 *    but there can be only one Public class and the public class name must match with the Java File name
	 *    other classes we are creating in the same java file MUST have default access modifier
	 *    one public class in per java file     
	 */
	public static void main(String[] args) {
		System.out.println("main public class");
	}

}
class A{
	public static void main(String[] args) {
		System.out.println("default class A");
	}
	
}
class B{
	public static void main(String[] args) {
		System.out.println("default class B");
	}
}
