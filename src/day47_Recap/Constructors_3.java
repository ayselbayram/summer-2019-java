package day47_Recap;
class Mehmet{
	public Mehmet() {
		System.out.println("Mehmet");
	}
	
}

class Resul extends Mehmet{
	public Resul() {
		//super()// you cant just see it but it is there
		System.out.println("Resul");
	}
	
}

class Viktoria extends Resul{
	public Viktoria() {
		//super()//Resul contsructor
		System.out.println("Viktoria");
	}
	
}

public class Constructors_3 {
	public static void main(String[] args) {
		Resul obj=new Resul();
		Viktoria obj2=new Viktoria();
	}

}
