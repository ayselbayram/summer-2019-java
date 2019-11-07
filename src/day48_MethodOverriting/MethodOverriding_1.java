package day48_MethodOverriting;
class Student{
	public void printName() {
		System.out.println("Hakan");
	}
}

public class MethodOverriding_1 extends Student{
	/*inherit
	 * public void printName() {
		System.out.println("Hakan");
	}
	 */
	
	public void print(String str) {
		
	}
	public void print(double a) {
		
	}
	
	public void printName() {//overriding 
		
		System.out.println("Sukran");
		
	}
	//public void print(String str) {// overriding can not happen in the same class
	public static void main(String[] args) {
		MethodOverriding_1 obj=new MethodOverriding_1();
		     obj.printName();//called from sub class object, Hakan
	Student obj2=new Student();
	       obj2.printName();//Hakan, after I override the method and give some different functionality 
	       //it becomes Sukran
	
	       
		
	}
		
	

}
