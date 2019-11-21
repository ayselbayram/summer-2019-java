package day53_InterfaceContinue;
/*
 * Extends keyword vs Implements keyword:
    
        extends keyword: a class can be extended by multiple classes
                         a class can extend only one class
                         class extends class
                         interface extends interface
        implements: only used for interface to be implemented to the class
                    can implement as many interfaces as we want
                    class implements interface 
        we can use extends and implement keyword at the same time
            class extends class implements interface(S)

 */
interface B{
	void Method3();
}


public interface Extends_VS_Implements extends B {
	       //       subtype                    supertype
	void method1();
	void method2();
	//void Method3(); inherited
	//we can not override the abstract method in interface because averride is instance method.

}
 class A implements Extends_VS_Implements{
	//if class is abstract we dont need to verride the abstarct class,but we can
	/* inherited 
	 * void method1();
	   void method2();
	   void Method3();
	 */


	@Override
	public void Method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	//we can use extends and implements keyword at the same time
	//the class extends the class then implements interface(s)
	
}
 class C extends A implements Extends_VS_Implements,B {
	 
 }