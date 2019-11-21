package day53_InterfaceContinue;

public class ToyotaHybird implements Cars, GasVehicles, ElectricVehicles {

	@Override
	public void charge() {
	System.out.println("charging");	
		
	}

	@Override
	public void selfDrive() {
	System.out.println("self driving");
		
	}

	@Override
	public void PumpGas() {
	System.out.println("pumping gas");	
		
	}

	@Override
	public void start() {
		System.out.println("push start button");
		
	}

	@Override
	public void fly() {
		System.out.println("Toyo ta is flying");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("toyota can do self parking");
		
	}
	
	

}
