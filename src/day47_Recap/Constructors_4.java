package day47_Recap;

class Cinthya {
	public Cinthya(int a) {
		this(5.5);
		//this() constructor can not call more than 1 constructor
		System.out.println("Cinthya");
	}
	public Cinthya(double a) {
		System.out.println("Cinthya2");
	}
	public Cinthya(String a) {
		System.out.println("Cinthya3");
	}
	public Cinthya() {//when we created default constructor we dont need to call it in sub class, comes default
		
			System.out.println("Cinthya4");
		}
	}


public class Constructors_4 extends Cinthya {
	public Constructors_4() {
		

	}
	
	public static void main(String[] args) {
		Constructors_4 obj=new Constructors_4();//calls default one 
	}
	

}
