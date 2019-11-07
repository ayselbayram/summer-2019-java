package day45_Inheritance;

public class Prptecetd_vs_Default extends A {
	
	public static void main(String[] args) {
		System.out.println(b);
	}	
	
	protected static  String name;
	          static String ID;
	public int age;
	          
	protected static void printHello() {
		System.out.println("print hello");
		
	}
	
	static void printHola() {
		
		
	}

}



class cybertek{
	public static void main(String[] args) {
	Prptecetd_vs_Default obj=new Prptecetd_vs_Default();
	    obj.printHello();
	    obj.printHola();
	    System.out.println(obj.name);
	    System.out.println(obj.ID);
}
}
