package day40StaticKeyword;

public class staticPractice {
	/*
	 * difference between static method and instance method
	 * static methods always call through the class name
	 * static methods only accepts static features, belongs to class members 
	 * in order to call instanve methods and variables you need to create an pbject
	 * static methods aonly accepts class members.because instance variables and methods belongs to object.
	 * if we want to call any instance we need call them by creating the objects
	 * nonstatic can only be called through the objects in the static methed
	 * isntance method: 
	 */
	
	static long num1;
	long num2;
	
    public static void main(String[] args) {//static method
    	System.out.println(num1);//i can call num1 directly because they are at the same class, static variable
    	System.out.println(staticPractice.num1);//called it with class name, no need
    	
    	//System.out.println(num2); cmopile er
    	//System.out.println(staticPractice.num2); compile er, instance variabale belong to obj.
    	
    	staticPractice.method1();//static method called by class name
    	//if any method called by class name is static method
    	//staticPractice.method2(); compile erin order to call instanve 
    	//methods and variables you need to create an pbject
    	staticKeyword.printHello();
    	
    	staticPractice obj=new staticPractice();
    	    System.out.println(obj.num2);
    	    obj.method2();//instance method call
//    	obj.method3();//i created this in static keyword 
    	//that is why i need to create static keyword class obj
//    	staticKeyword obj2=new staticKeyword();
//    	obj.method3();
		
	}
    public static void method1() {//static method
    	System.out.println("A");
    	
    }
    public void method2() {//instance method
    	System.out.println("method 2");
    	
    }
}
