package day40StaticKeyword;

public class staticMethods {
	/*
	 static methods: a method that we can call through the class name
	 any method called by class name is static method
	 Array,toString()>>Arrays is class name, toString is method name, 
	 any method called by class name is static method
	 
	 */
	
	int num1;
	public static void method1() {
		System.out.println("open the browser");
	}
	
	public static void main(String[] args) {
		staticMethods.method1();//static method we can call by class name
		//System.out.println(num1);//gives compile erstatic methods only accepts class members, only static
		staticMethods obj1=new staticMethods();
		System.out.println(obj1.num1);
		
		
		staticKeyword.printHello();//i created it it in "static keyword" class and called it here
	}

	
}
