package day36JavaReview;

public class ConstructorCalls {
	
	/*
	 * constructor calls: 
           1. only a construcor can call another constructor
           2. constructor can not be called just by constructor name
           3.we use "this()" keyword to call constructor.This keyword used for callis object 
           instances(anything that belong to the object);
           4.constructor call MUST be the first step in a constructor
           5. constructor call this() m]has to be first step int the constructor
           
	 */
	public ConstructorCalls() {
		
		System.out.println("A");
		
	}
	public ConstructorCalls(int a) {
		//System.out.println("B"); gives compile er. to this(), because this() has to be the first step
		this();//A
		System.out.println("B");
	}
	
	public ConstructorCalls(double a) {
		this(10);
		//this(); //one constructor can call only one constructor
		System.out.println("C");
	}
	public static void main(String[] args) {
		ConstructorCalls obj=new ConstructorCalls(2.5);
	}

}
