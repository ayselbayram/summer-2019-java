package day49_AbstractionIntro;

public abstract class Abstraction {
	public static void main(String[] args) {
		
	}
	public abstract void startTheCar();
		
	}

class Toyota extends Abstraction{
	@Override
	public void startTheCar() {
		System.out.println("Brake");
		System.out.println("push the start button");
		System.out.println("release the brake");
		
	}
	public static void main(String[] args) {
	//	Abstraction obj=new Abstraction();// abstraction class can not create object
		Tesla tesla=new Tesla();
		tesla.startTheCar();
		Toyota toyota=new Toyota();
		toyota.startTheCar();
	}
	
}
class Tesla extends Abstraction{
	//must implement the abstarct method from the abstract class
	public void startTheCar() {//when we give the implementation abstrcat is not abstract anymore
		System.out.println("voice control");
		System.out.println("drive");
		
	}
}
