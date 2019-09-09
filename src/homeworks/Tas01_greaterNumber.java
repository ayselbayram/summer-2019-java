package homeworks;

public class Tas01_greaterNumber {
	public static void main(String[] args) {
		int num1,num2, max;// local variables must be initialized before used
		num1 = 700;  num2 = 700; max = 0;
		
		if (num1 > num2) {
			max = num1; // or max += num1
			System.out.println("Maximum number between " + num1 + " and " + num2 + " is " + max);
			
		}
		else if (num1<num2) {
			max = num2;// max +=num2
			System.out.println("Maximum number between " + num1 + " and " + num2 + " is " + max);
			
		}
		else {
			max=num1;
		
			System.out.println(num1 + " and " + num2 + " are equal and " + max + " is the great number");
		}
				
		
		
		
	}

}
