package homePractice.java;



public class if_conditions {
	public static void main(String[] args) {
		int x, y,z;
		x =67; y =78; z =78;
		if (x > y && x >z){
			System.out.println(x + " is the great number");
		}
		else if(y >x && y >z){
			System.out.println(y + " is the great number");
		}
		else if (z >x && z >y){
			System.out.println(z + " is the great number");
		}
		else if (x==y && x > y){
			System.out.println(x + " and "+ y + " are equal ant the great numbers");
		}
		else if (x == z && x > y){
			System.out.println(x + " and "+ z +" are equal and great numbers");
		}
		else if (y==z && y > x){
			System.out.println(y + " and "+ z + " are equal and the great numbers");
			
		}
		else {
			System.out.println("All of the numbers are equal");
		}
		
		{
			
		}
		
		System.out.println("==============");
		boolean A= x > y && x > z;
		boolean B = y > x && y > z;
		boolean C = z > x && z > y;
		boolean D = x==y && x>z;
		boolean E = x==z &&x>y;
		boolean F = y==z && y>x;
		if (A) {
			System.out.println("X");
		}
		else if(B) {
			System.out.println("y");
		}
		else if(C) {
			System.out.println("z");
		}
		else if (D) {
			System.out.println("x=y");
		}
		else if(E) {
			System.out.println("x=z");
		}
		else if(F) {
			System.out.println("y=z");
		}
		else {
			System.out.println("x=y=z");
		}
		System.out.println("===============");
		
		int grade = 76;
		boolean a = grade >=0 && grade <=100;
		boolean b = grade >=90 && grade<=100;
		boolean c = grade >=80 && grade <=89;
		boolean d = grade >=70 && grade <=79;
		boolean e = grade >=60 && grade <=69;
		
	
		
		if (a) {
			if (b) {
				System.out.println("Passed with A");
			}
			else if (c) {
				System.out.println("Passed with B");
			}
			else if (d) {
				System.out.println("Passed with C");
			}
			else if(e) {
				System.out.println("Passed with D");
			}
			else {
				System.out.println("You failed");
			}
		}
		
		else {
			System.out.println("Ivalid entry");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}


