package day27_customMethods;

public class voidMethod_withArgument3 {
	/*methods with parameters(argument):
	 * sometime methods need specific information from user to perform its task.
	 * then we need to declare the method with the parameters.
	 * Exp= Arrays.sort( array )
	 *    array is the argument, and sort method is the functionality is to sort the given array
	 * 
	 *   int[] arr={1,2,3,4};
	 *   Arrays.sort( what do i need to sort(arr))
	 *   
	 *   DECLERATION
	 *    access- modifier,specifier,return type,method name(parameter){}
	 *    
	 *    parameter: can be any data-Type(any data type)
	 */
	public static void main(String[] args) {
		oddOrEven(91);//need to provide a value can be assigned to the parameter(int)
		//method was designed to take an argument, needs argument
		int z=100;//local variables must be initialized before we used 
		oddOrEven(z); //we can also give this z value, it is already assigne int value
		
		        //sumOfTwoNums() not enough info to performence the task
				//sumOfTwoNums(10)// still not enough info
				sumOfTwoNums(10,20);
	}
	public static void oddOrEven(int a) {
		if(a%2==0) {
			System.out.println(a+ " is even number");
		}else {
			System.out.println(a+" is odd number");
		}
	}
	//WE CAN NOT CREATE METHOD IN METHOD	
		public static void sumOfTwoNums (int b,int c) {
			System.out.println("sum of "+b+" and "+ c+ " is "+ (b+c));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
   

