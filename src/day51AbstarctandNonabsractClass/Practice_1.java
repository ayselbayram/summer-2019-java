package day51AbstarctandNonabsractClass;

abstract class Test{
	
	public Test() {
		
	}
	abstract void m();
	//final abstract void m();// final makes the method immutable, con not be overrite, final meand constant
	// final can never be abstract
	

protected abstract void m(int a);
public static void main(String[] args) {
	//abstract can not  have static method, all the methods, nonabstract methods,
	//abstract class  can have everything that nonabstract calss have
}

}

final public class Practice_1 extends Test{
	@Override
	void m() {
		
	}
	@Override
	public void m(int a) {
		
	}
}

final class A{
	
	
}
//class B extends A{//because of the class A is final
	
//}



