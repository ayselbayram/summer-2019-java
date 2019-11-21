package day46_SuperKeyword;
class B{
	public B() {
		System.out.println("super class constructor");
		
	}
	public B(int a) {
		System.out.println("int constructor");
	}
	
}

public class DefaultConstructor_3 extends B {
	/*
	 deafult constructor of super class is called in the sub class by default
	 if we created a constructor in super with parameter we need to call it manually
	 */
	public DefaultConstructor_3() {
		
		super(8);
		System.out.println("this is sub constructor");
	}
	public static void main(String[] args) {
		DefaultConstructor_3 obj=new DefaultConstructor_3();
	}

}
