package day53_InterfaceContinue;

public class Tesla_Model3 implements Cars, ElectricVehicles {
	@Override
	public void start() {
		System.out.println("Voice control \"start the car \"");
	}

	@Override
	public void charge() {
	System.out.println("Charging");	
		
		
	}

	@Override
	public void selfDrive() {
    System.out.println("Self Driving");
		
	}

	@Override
	public void fly() {
		System.out.println("Tesla is flying");
		
	}

}
