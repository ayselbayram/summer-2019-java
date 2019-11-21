package day52_Interface;

public interface InterfaceIntro {
	int a =10;//even we write it instance, interface gives 'static' keyword given by default
	//static, final given by default. to make sure it is final or not reassing it.
	//aslo public access modifier is also given y default
	//protected int num=100;  public given by default, I can not give any more access modifier anymore
	public static final int x=399;//we can choose to give public, static final keywords,
	//needs to be initalize immediately bc of 'final'
	

	public abstract void methodA();
  
	public default void mathodC() { // default method, but we wont use it, just know it
	
		
	}
	public static void methodB() {//static methods also belong to interface
		
	}
public static void main(String[] args) {
	//a=200;   variables are final ans static by default, we can not reassign them.
	System.out.println();
}
	

}
interface Data{

	
	
}

class Test implements InterfaceIntro,Data{
//  subtype              supertype, supertype
	@Override
	public void methodA() {
		
		
	}

	



	
}