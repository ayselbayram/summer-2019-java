package day45_Inheritance;



public class InheritancePractice2 extends ParentClassofInheritancePractice2{
	       //sub                                  super
	/*
	 * protected static String password="123";
	public static int age=13;
	protected static double salary=100000;
	 */

	public static void main(String[] args) {
		//System.out.println(username); it is private in super class, can not be inherited
	     System.out.println(password);	//protected
	     System.out.println(age); //public
	     System.out.println(salary);//protected
	}
}

	

