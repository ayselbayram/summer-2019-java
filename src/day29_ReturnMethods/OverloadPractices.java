package day29_ReturnMethods;

public class OverloadPractices {
	public static void main(String[] args) {//valid main method
		System.out.println("String Array");
		boolean[] array1= {true, false};
		main(array1);
		
		double[] array2= {1.5,6.3,6,7};
		main(array2);
		
		return;
		//System.out.println("hello");..return statement exits the method , gives compile error
		
		
	}
	//call the rest method by name in main method
	public static void main(int [] b) {
		System.out.println("int Array");
	}
	public static double main(double[] gs) {//retyr
		System.out.println("double array");
		return 1.4;//return value must match with the return type of method
	}
	public static void main(boolean[] art) {
		System.out.println("boolean array");
	}
	
	//only first one ecexuted the valid main method the first one, place can be change
	
	
	

}
