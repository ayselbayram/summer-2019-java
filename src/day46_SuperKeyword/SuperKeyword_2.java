package day46_SuperKeyword;
/*
super. :used for calling the instances(insatance variable and methods) from the super class.
        super keyword only can be used in sub class
this. vs super. : 
      this. used for calling instances from the current classes
           to use this. we dont need inheritance
      super. used for calling instances from the super class
            to use super. we must have super and sub classess

Constructor: at least one constructor from the super class has yo be clalled in the sub class.
super(): used for calling constructors from the super class. MUST be used in sub class
this(): used for calling the constrcutor from the current class itself
*/

class A{
	String name="Medina";
	
	public void methodA(int a){
		
	}
	
	//constructor
	public A(int a) {//super class constructor
		
		
	}
	
}

public class SuperKeyword_2 extends A{
		/*
	 * String name="Medina";
	 */
	
	public SuperKeyword_2(int a) {//sub class constructor
		super(7);//	super class constructor  must be called by the sub class constructor
	    
	}
	
	
	public void method() {
		super.name="Mahir";//instances from the super class
//		this.name="Ihsan";//instances from the sub class
		super.methodA(7);//super class
		this.methodA(8);//sub class
		this.name="Filiz";
		System.out.println(super.name);
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		SuperKeyword_2 obj1=new SuperKeyword_2(8);
		obj1.method();
	}

}
