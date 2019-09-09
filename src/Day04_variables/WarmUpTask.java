package Day04_variables;

public class WarmUpTask {
	
		/*
		 1. Cucumber = 2.5$ => float or double
		 2. Tomato = 3$ =>byte,int,shot,long
		 3. Onion = 1.5$  => float,double
		 4. Green pepper = 2$
		 5. Carrot = 4$
		 */
	public static void main(String[] args) {
		//cucumber: 
		float cucumber = 2.5f; //we have to give f at the end because float can not contain double
		double cucumber2 = 2.5f; //double can contain float
		double cucumber3 = 2.5;
		// onion:1.4
		float onion = 1.5f;
		double onion2 = 1.5;
		//tomato
		int Tomato = 3;
		System.out.println(Tomato);
		
		//green pepper: 2
		int GreenPepper = 2;
		short GreenPepper2 = 2;
		byte GreenPepper3 = 2;
		long GreenPepper4 = 2l;
		float GreenPepper5 = 2; // only time we add f letter at the end when we gave decimal number to float
		double GreenPepper6 = 2;
		System.out.println(GreenPepper);
		System.out.println(GreenPepper2);
		System.out.println(GreenPepper3);
		System.out.println(GreenPepper4);
		System.out.println(GreenPepper5);
		System.out.println(GreenPepper6);
		
	int tomato4 = 4 * Tomato;
	System.out.println(tomato4);
	double onion3 = 2 * onion2;
	int carrot = 4;
	
	int carrot6 = 6 * carrot;
	System.out.println("1 Cucumber is " + cucumber + " dollars.");
	System.out.println("4 Tomatoes are " + tomato4 + " dollars.");
	System.out.println("2 Onion is " + onion3 + " dollars." );
	System.out.println("1 Pepper is  " + GreenPepper + " dollars.");
	System.out.println("6 Carrots is " + carrot6 + " dollars");
	
		
		
	}
	}


