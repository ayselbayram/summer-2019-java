package day48_MethodOverriting;

class  Mahribana{
	//public>protected>default>private
	protected void MethodA() {// the method that we are going to override MUST be inheritable to the subclass
		System.out.println("A");
		
	}
	public String methodB() {
		return "A";
	}
	
	protected double salary(double bonus) {
		
		return bonus+1000;
		
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
	@Override
	protected double salary(double salary) {
		return salary+2000;
	}
	

}
