package homeworks;

public class Task03_biggerNumber {
	
	public static void main(String[] args) {
		int n1 = 3000, n2 = 3000 , n3= 3000; 
		
		
		if (n1 > n2 && n1>n3) {// in order num1 become the ,maximum: 
			
			System.out.println(n1 + "is the bigger number");
			
		}
		
		else if (n2 >n3 && n2 > n1) {// n2 > n3 && n2 > n1
			System.out.println(n2 + "is the bigger number");
			
			
		}
		
		else if  (n3 > n2 && n3 > n1 ) { // n3 > n1 && n3 > n2
			System.out.println(n3 + "is the bigger number");
		}
		else if (n1==n2 && n1> n3) {
			System.out.println(n1 + "and" + n2 + "are equal and " + n1 + "is the bigger number");
		}
		else if (n1 == n3 && n1>n2) {
			System.out.println(n1 + "and" + n3 + "are equal and " + n1 + "is the bigger number");
		}
		else if (n2 == n3 && n3 > n1) {
			System.out.println(n3 + "and" + n2 + "are equal and " + n2 + "is the bigger number");
		}
		
		
		else {
			System.out.println(" all of them are equal");
			
		}
		
		// String result = "Maximum number between " + + n1 + "," + n2 + "," + n3  + " is " + max;
		
		
		//solution 2, the solution that I didi at the first but that is less popular for reusable
		
		
		int A;
		if(true) {// as soon as the condition is true A is initializing 
			A=12;
		}
		
		System.out.println(A);// local variables must be initialize BEFORE USED
		
		//double B ;
		//if (false) {
			//B=100;
		//}
		//System.out.println(B);// does not work because B is not initialize
		
		
		
		
	}
	
	
	
	
	

}
