package day36JavaReview;

public class ConstructorsReview {
	/*
	 * Constructors: special method, used when we create an object of a class
            Every class MUST have constructor.
            if we don't create any constructor, then compiler will give default (no-arg) constructor
creating object:
        ClassName obj = new  ExistingConstructor;
        only the givenm given constructor gets executed
decleration of constructor:
        default constructor:
            access-modifier  className(){
            }
        
        constrcutor with arg:
            access-modifier  className(parameter){
            }
            constructor's name MUST be same with class name
            in constructor's method signature, there is no return type and specifier
            we can create multiple constructors by overloading the constructor
            
            we can give multiple parameters in constructor



	 */
	public ConstructorsReview () {
		System.out.println("default constructor");
	}
	
	public ConstructorsReview(int a) {
		
		System.out.println("Constructor with argument int "+a);
		
	}
	public static void main(String[] args) {
		ConstructorsReview  obj=new ConstructorsReview() ;
		//ConstructorsReview  obj2=new ConstructorsReview("Batch12") ;
		//the constructor with the aru. of string is not exist, compil er
		ConstructorsReview  obj2=new ConstructorsReview(7) ;
		
		
		
		
		
		
		
		
		
	}

}
