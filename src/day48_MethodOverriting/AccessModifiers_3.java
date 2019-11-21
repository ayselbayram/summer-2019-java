package day48_MethodOverriting;

class  Mahribana{
	//public>protected>default>private
	protected void MethodA() {// the method that we are going to override MUST be inheritable to the subclass
		System.out.println("A");
		
	}
	public String methodB() {
		return "A";
	}
	
	protected static double salary(double bonus) {
		
		return bonus+1000;
		
	}
	public static void main(String[] args) {
		
	}
	
}

public class AccessModifiers_3 extends Mahribana {
	/*
	 * @Override
	 * private void MethodA(){
	 * syso   "MethodA"
	 * }
	 * override method' access modifiers need to be same or more visible
	 */
	//publi>protected>default>private
	protected void method() {
		System.out.println("Method A");
	}
	//override
	@Override
	public String methodB() {
		return "C";
	}
	
	//override
	// static hidden method
	protected static double salary(double salary) {
		return 2000;
	}
	public static void main(String[] args) {
		AccessModifiers_3 obj=new AccessModifiers_3();
		System.out.println(obj.methodB());
		obj.method();
		
		Mahribana obj2=new Mahribana();
		System.out.println(obj2.methodB());
		System.out.println("mahribaba"+obj2.salary(56));
		System.out.println(obj.salary(56));
	}

}
