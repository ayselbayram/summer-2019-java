package day53_InterfaceContinue;

public class Jeep_Wrangler implements GasVehicles,Cars{
	@Override
	public void start() {
		System.out.println("Call Mechanic");
		System.out.println("Oil change");
		System.out.println("Jump Srat");
		
	}

	@Override
	public void PumpGas() {
		System.out.println("pumping gas");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Jeep can do self parking");
		
	}
	

}
