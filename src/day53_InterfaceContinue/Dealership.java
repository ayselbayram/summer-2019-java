package day53_InterfaceContinue;

public class Dealership {
	public static void main(String[] args) {
		Tesla_Model3 obj1=new Tesla_Model3();
		obj1.charge();
		obj1.fly();
		obj1.selfDrive();
		obj1.start();
		System.out.println("===============");
		
	    ToyotaHybird obj2=new ToyotaHybird();
	    obj2.charge();
	    obj2.fly();
	    obj2.PumpGas();
	    obj2.SelfParking();
	    obj2.start();
	    obj2.selfDrive();
	    System.out.println("======================");
	    Jeep_Wrangler obj3=new Jeep_Wrangler();
	    obj3.PumpGas();
	    obj3.SelfParking();
	    obj3.start();
	}

}
