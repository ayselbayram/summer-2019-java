package homePractice.java;

public class if_else {
	public static void main(String[] args) {
		int a = 20;
		if (a % 2 == 0) {
			System.out.println(a + " is an even number");
	}
	   else {
		System.out.println(a + " is an odd number");
		
	}
		System.out.println("==============");
		
		int hour = 18;
		if (hour < 12) {
			System.out.println("Good morning");
		}
			else if (hour>=12 && hour<15) {
				System.out.println("Good afternoon");
		}
		else {
			System.out.println("Good evening");
		}
		
		System.out.println("==============");
		
		// declare 3 numbers and display which one is great
		int x,y,z;
		x=13;y=34;z=67;
		if(x>y && x>z) {
			System.out.println(x + " is the great number");
		}
			else if(y >x && y>z) {
				System.out.println(y+ " is the great number");
			}
		
			else if (z>x && z>y) {
				System.out.println(z + " is the great number");
		}
		
			else if (x=z && x>y) {
				System.out.println(x + " and" + z +" are equal and great numbers");
			}
			else if (x=y && y>z) {
				System.out.println(x + " and" + y + " are equal and the great numbers");
				
			}
			else if (y=z && y>x) {
				System.out.println(y + " and "+ z + " are equal and great numbers");
			}
			else {
				System.out.println("all of them are equal");
			}
			
	System.out.println("==================");
	
		

}
}