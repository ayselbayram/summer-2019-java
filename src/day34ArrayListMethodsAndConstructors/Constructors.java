package day34ArrayListMethodsAndConstructors;

public class Constructors {
	
	/*
	 Regular Method: acces- modifier  specifier return type methodname(){}
	 
	 
	 Constructor:  it is a very special METHOd.every single class must have  constructor.
	             if we dont give the constructor manually, then the compiler will give the default constructor.
	              it mean no argument,it is also called no argument constructor.
	       purpose:used for creating object of the class
	 
	 Decleration of constructor:called "constructor with an argument"
	        
	            access modifier class name(parameter){
	            statements
	            }
	  Default constructor:called"no parameter constructor", no argument
	         access modifier classname(){
	         //statements
	         }
	         
	  Decleration of constructor
	         access modifier className(parameter){
	                   statements
	            }
	   Constructor can not have return type and specifier 
	   Constructors name must be same with the classname  
	   Constructor calls:
	         only a constructor can call another constructor
	         constructor' execution depends on the creation of the object  
	   Create an object from the class
	       className referenceName=new   existingconstructorMethod
	   Constructor methods can be overload  
	   if we want to have more than 1 constructor we must overload the constructor
	   parameter can be any datatype  
	   when we create object from a class we must  use existing construcror 
	 */
	
	
	//declaration
	public Constructors () {
		System.out.println("Default costructor");//wiyhout creating object of thr class, never execute
		
	}
	
	public Constructors(int num) {
	System.out.println("hello world");
	System.out.println("i am a constructor with an argument int"+num);
		
	}
	public Constructors(double num) {
		System.out.println("this is double constructo");
	}
	
	public static void main(String[] args) {
		
		Constructors obj=new Constructors(8);//creating object
		//Constructors obj2=new Constructors("A");obj was ot created witj existing constructor
		method1();
	}	
		
	public static void method1() {
		Constructors obj=new Constructors(4.5);// object can be created in any method
		
	}
		
		
		
		
	
	
	

}
