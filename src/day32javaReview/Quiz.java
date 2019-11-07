package day32javaReview;

import java.util.Arrays;

public class Quiz {
	public static void main(String[] args) {
		//Assessment quiz 8 review
		
		//Q4
		int[] arr= {30,20,10,5,0};
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==30) {
				continue;
				//count++; //GIVES COMPILE ERROR
			}System.out.println(arr[i]+" ");
		}
		
		// Q5
		
//		int [] numbers= {1,2,3,4,5};
//		int num=findmax(numbers);
//		
//	}	
//		
//	public static int findmax(int[] arr) {
//		return 1;
//		
//		
//	}
		//q6
		
		for(int i=5;i>=0;i--) {
			System.out.println(i+" ");//543
			if(i==3) {
				break;
			}
		}
		//q11
		
		//copy it from canvas
		
		//q12
		byte a1=10;
		Byte a2=a1;
		//Double a3=a1; gives compile error
		
		Double a3=(double)a1;//needs casting
		//wrapper class are loyal, accepts only their primitive values
		//primitives are not loyal
		
		Integer b1=20;
		long b2=b1;//primitive excepts any primitives, any value , needs to be in the range
		Integer c1=10;
		//Double c2=c1;, wrapper classes are loyal, accepts the same primitive type,but we can cast it
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
	//q8
		int num2=5;
		while(isAvailable(num2)) {
			//num2>0
			//num2--; 543210
			System.out.print(num2);
			num2--;//54321
		}
		System.out.println();


}
	//q8
			public static boolean isAvailable(int num) {
				return num-->0?true:false;
			}
			
}