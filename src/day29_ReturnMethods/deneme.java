package day29_ReturnMethods;

import java.util.Arrays;

public class deneme {
	public static void main(String[] args) {
		sum(45,65);
		int x=sum(45,65);
		System.out.println(x);
		//2. 
		
		maxinum(34,678,9857);
		
		//3.
		int [] deneme= {1,45,32,567,455};
		int maxdeneme=maximumnum(deneme);
		System.out.println(maxdeneme);
		
			
		
		
				
		
	}
	
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int maxinum(int a, int b, int c) {
		int[] arr= {a,b,c};
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		return max;
	}
	
	public static int maximumnum(int[] num ) {
		Arrays.sort(num);
		return num[num.length-1];
	}
	
	
	

}
