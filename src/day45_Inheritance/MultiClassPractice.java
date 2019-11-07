package day45_Inheritance;

class Data{
	public String name;
	private String age;
	String ID;
	protected String DOB;
	
	public void printHello() {
		//Hola(); private can call antwhere in the same class
		System.out.println("Hello world");
	}
	private void Hola() {
		System.out.println("Hola");
	}
	void Aloha(){//default access modifier
		//Hola();private can call antwhere in the same class
		System.out.println("Aloha");
	}
}

public class MultiClassPractice {
	public static void main(String[] args) {
		Data obj=new Data();
		System.out.println(obj.name);//public is visible at everywhere
		
		//System.out.println(obj.age); private is not visible outside its class
		
		System.out.println(obj.ID);// default classess are in the same package
		// if those 2 classess were located in 2 different packages then the default access modifier 
		//is not going to be visible
		
		//calling methods
		obj.printHello();
		//obj.Hola(); private method only visible with in the class
		obj.Aloha();
		
		
	}

}
