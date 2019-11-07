package day40StaticKeyword;

import java.util.Scanner;

public class staticKeyword {
	/*
	 * static:means that we can access the members through the class name.
	 * Any static members in java they belongs to the class itself.
	 * they also called class members
	 * 
	 * what can be static in Java: only 4 features
	 *            1-static variables(class variables,global)
	 *            2-static methods
	 *            3-static initializer block
	 *            4-static inner class(nested class)
	 *   instance variables: created in the class outside any methods.belongs to the object.
	 *                      each obj will have its own copy(also called fields)
	 *   local variables: declared within the methods or block .only accessible within the methods or block
	 *                    local variable only visible within the method
	 *   
	 *  1-static variables:created in the class outside any methods with static keyword.(class variables)
	 *  static keyword: when a variable is static, its shared by class and all objects of the class
	 *  and we call ist through the class name
	 *  
	 *  static methods only accepts  class members, non static must be called through the objects
	 *  
	 *  static features are shared by class and all other objects can only have one copy
	 *  each object have their own copy of instance variables
	 *  
	 *  summary:
	 *        1.static is shared by class and all other objects
	 *        2. there can only one copy for the static variable
	 *        3.Instance, each objects have their own copy of instance variable.
	 *        4. static members can be called through the class name
	 *        5. static method only accepts static members
	 *        6.in order to call nonstatic in a static method we MUSt call through the object
	 *        
	 */

	 //static variable
	  
	static int b;//static variable
	       int a;//instance variable
	  static Scanner scan=new Scanner(System.in);
	       
    public static void printHello() {// custom static method, i called this in static "methods class"
    	int a=scan.nextInt();
	 System.out.println("hello cybertek");
	   	}
	public void method3() {
		int a=scan.nextInt();
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//scan is local, i can not use it in other method unles  i created objects
		//for 100 method I need to create 100 object for this
	double num=10.5;//i can only use this variable within this method
	
	staticKeyword obj1=new staticKeyword();
	staticKeyword obj2=new staticKeyword();
	System.out.println(obj1.b);
	System.out.println(obj2.b);
	
	System.out.println("+++++++++++++++++++++++");
	staticKeyword obj3=new staticKeyword();
	obj3.a=100;
	System.out.println(obj3.a);//100
	staticKeyword obj4=new staticKeyword();
    System.out.println(obj4.a);//0
    obj3.b=400;
    System.out.println(obj3.b);
    System.out.println(obj4.b);
	
	System.out.println(staticKeyword.b);
	staticPractice obj=new staticPractice();
	obj.method2();
}
}
