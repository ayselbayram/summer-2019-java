package day35ConstructorsAndConstructorCalls;

public class ConstructorMethod {
	public ConstructorMethod(int a){
		this(10.5);
		System.out.println(" constructor with argument "+a);
		
	}
	public ConstructorMethod (double a) {
//this(5);this is called by (int) constructor, now int constructor contains(double) constructor, gives error.
		System.out.println(" constructor with argument "+a);
		//this(6.5); can not call itself, gives er.
	}
	//calling constructor
	public ConstructorMethod (boolean a) {
		this(100);// this has to be firt int this constructor other wise compile er.
		//this(5.5); this constructor can not call another constructor, gives compile er
		System.out.println("constructor with argument of: "+a);
	}
	public static void main(String[] args) {
	
		//ConstructorMethod obj=new ConstructorMethod("Hello");//constructor is not exist
		//ConstructorMethod obj=new ConstructorMethod(); constructor is not exist
		
		ConstructorMethod obj=new ConstructorMethod(7);//only int parameter constructor execute
		ConstructorMethod obj2=new ConstructorMethod(true);
		
	}
	
	
	
	
	
	
		/*
		 constructor: 1-used for creating an object
		              2-every single class must have constructor
		              3-if we dont give the constructor, compiler give the default constructor
		              4-constructor execution depends on creation of the object
		     
		              5- constructors name must be same with class name   
		              6- no return type, no specifier
		                   
		              
		   decleartion of constructor
		     default constructir=no-argument constructor
		         acces modifier   className{}// only class name given as method name
		  if we give a constructor compiler doe not create the default one    
		  
		     create and object from a class:
		        className obj=new existingConstructor; 
		        
		        
		   constructor call:
		      1.only a constructor can call another constructor
		      2. constructor CAN NOT BE CALLED BY THEIR NAME
		       we must use this() keyword to call current constructor
		      3. the constructor call has to have priority in the calling constructor
		       constructor call has to be the firts statment ind the calleing constructor.
		      4. one constructor can call only one constructor
		      5. constructor can not call itsef 
		      6. constructor can not contain itself 
		      7. one constructor can be called by different constructor
		 */
	

}
