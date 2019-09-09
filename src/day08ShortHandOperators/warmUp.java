package day08ShortHandOperators;

public class warmUp {
	public static void main(String[] args) {
		// write a java program convert gallon to liter
		//1 gallon = 3.786 liter
		
		int gallon = 200;
		double  liter = gallon * 3.875;// converts gallon to liters
		System.out.println(liter);
		System.out.println(gallon + " gallons equal to " +liter + " liters");
		// convert liters to gallon
		int lit = 1;
		double gal = lit/3.785;
		System.out.println(gal);
		String b = lit + " liters equal to " + gal + " gallons";
		System.out.println(b);
		
		//Task 2
		//1
		int x = 2;
		int y = x++;//y=2, x=3
		System.out.println(y);
		System.out.println(x);
		
		//2
		int x3 = +2;
		System.out.println(--x3);//1
		//3
		int x4 = 8;
		int y4 = x4--;
		System.out.println(y4);
		System.out.println(x4);
		
		
		
		
		
		
		
		
	}

}
