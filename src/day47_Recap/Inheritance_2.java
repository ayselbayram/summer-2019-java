package day47_Recap;
class A{
	public String name="Ayaz";
	
}
class B extends A{
	//public String name="Ayaz"; inherutad from class A
	public String name2="Sukran";
	public String name3="Erhan";
	public void method1() {
		this.name="Feride";//only change the B class variable
		
//		super.name="Filiz";//since this variable is inheritad from A class it will be change in both place
//		this.name="Feride"
	
	
	
		System.out.println("*"+super.name);
		System.out.println(this.name);
			
	}	
	
}

public class Inheritance_2 extends B{
	//public String name="Ayaz"; inherutad from class B
	//public String name2="Sukran"; inheritad from B class
	//public String name3="Erhan";  nheritad from B class
	public String name4="Mehmet";
	public String name5="Mahribana";

	public static void main(String[] args) {
		

	Inheritance_2 obj=new Inheritance_2();
	System.out.println(obj.name);
	System.out.println(obj.name2);
	System.out.println(obj.name3);
	System.out.println(obj.name4);
	System.out.println(obj.name5);
	System.out.println("=======================");
	
	B obj2=new B();
	System.out.println(obj2.name);
	System.out.println(obj2.name2);
	System.out.println(obj2.name3);
	//System.out.println(obj2.name4); this insta variable are not in B classs
	//System.out.println(obj2.name5); this insta variable are not in B classs
	System.out.println("=======================");
	
	A obj3=new A();
	System.out.println("--"+obj3.name);
	
	obj2.method1();
	
	
	
	

	
	}
}
