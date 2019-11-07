package day37ClassandObject;

public class carObjects {
// public mean acces modifier you can use it anywhere	
	public static void main(String[] args) {
		
		car car1=new         car();//object created from car class
		car car3=new car();
//classname  obj  keyword    constructor  	
		car1.Brand="BMW";
		car1.Color="White";
		car1.mileage=100000;
		car1.Model="X6";
		car1.price=15000.5;
		car1.Year=2000;
		System.out.println(car3.Brand+"deneme");
		System.out.println(car1.Brand);//BMW
		System.out.println(car1.Color);
		System.out.println(car1.mileage);
		System.out.println(car1.Model);
		System.out.println(car1.price);
		System.out.println(car1.Year);
		System.out.println("**************************");
		
		//2.object
		
		car car2=new car();
		System.out.println(car2.Brand);//null not initialized yet
		
		car2.Brand="Toyota";
		car2.Model="Corolla";
		car2.Color="Black";
		car2.mileage=150000;
		car2.Year=2010;
		car2.price=car2.Year;//we can always assign as long as data type allows
		
		
		System.out.println(car2.Brand);
		System.out.println(car2.Color);
		System.out.println(car2.mileage);
		System.out.println(car2.Model);
		System.out.println(car2.price);
		System.out.println(car2.Year);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		
		
		
		car1.drive();//driving BMW
		car2.drive();//Driving the car Toyota
		
		car1.start();//BMW is starting.
		car2.start();//Toyota is starting.
		
		car1.getInfo();
		car2.getInfo();
		
		
//		car car3=new car();
//		 car3.Brand="Lexus";
//		 car3.Model="RX350";
//		 car3.Year=2020;
//		 car3.mileage=25000;
//		 car3.Color="Purple";
//		 car3.price=40000;
//		 
//		 car3.getInfo();
		 
		 
		
		
		
		
		
		
		
		
	}

}
