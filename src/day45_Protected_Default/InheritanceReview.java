package day45_Protected_Default;

class A {
	protected static int a =7;
	public static int b=4;
	public static void methodA() {
		System.out.println("A");

	}

	public static void main(String[] args) {
		// methodB(); super class can not onherit anythng from sub class
		// methodC(); super class can not onherit anythng from sub class
	}

}

class B extends A {
	/*
	 * public static void methodA() { 
	 * System.out.println("A"); }
	 */
	public static void methodB() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		methodA();

	}

}

public class InheritanceReview extends B {
	/*
	 * public static void methodA() {
	 *  System.out.println("A"); }
	 *   public static void methodA(){
	 *   System.out.println("A");
	 *   public static void methodB(){
	 *  System.out.println("B"); }
	 * 
	 * 
	 * }
	 */
	public static void methodC() {
		System.out.println("C");
	}

	public static void main(String[] args) {// static
		methodA();
		methodC();

	}

}
