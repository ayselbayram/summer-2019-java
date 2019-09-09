package udemy;

public class operator_challenge {
public static void main(String[] args) {
	double a = 20.00;
	double b = 80.00;
	double c = (a + b)*100.00;
	System.out.println("c is "+ c);
			double d = c % 40.00;
			System.out.println("the remainder is "+ d);
	boolean A = (d==0) ? true:false;//ternary operator	
	System.out.println(A);
   if (!A) {
	   System.out.println("got some remainder");
   }
}
}
