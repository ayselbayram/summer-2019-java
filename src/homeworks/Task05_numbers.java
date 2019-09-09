package homeworks;

public class Task05_numbers {
	public static void main(String[] args) {
		int num = 0;
		String result = "zero";// if i give the default here(zero) I dont need the third if statement
		/*
		 * number to be positive: number>0, 
		 *  number to be negative: number <0
		 *  number to be zero: number==0
		 *  
		 */
		
		
	     if (num <0 )  {
					result = "negative";
				}
		if (num > 0) {
			result = "positive";
			
		}
		
		
		System.out.println(num + " is " + result) ;
		
		int num2 =5000;
		if (num2 > 0) {
			System.out.println("positive");
			
		}
		else if  (num2 <0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
	}

}
