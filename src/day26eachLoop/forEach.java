package day26eachLoop;

import java.util.Arrays;

public class forEach {
	public static void main(String[] args) {
		/*
		 For each :used to acsess the value in a collection of values, 
		 it is a loop that is already been iterated
		 For each loop van NEVER be infinite loop
		   syntax=
		 
		         for(DataType "each"(can be any name):Array name){}
		         
		  *no used index number//can not get access to the index numbers
		  * 
		  *    variable name"each" represents each of the character of the array
		  *    
		  *    number of times execution of the loop depends on the length of the array
		  *    when do we use for each: when we don't need to create the index variables
		  *    in for each loop we don't provide index numbers.
		 */
		
		int[]arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
		
			System.out.println(arr[i]);
		}
		System.out.println("================");
		
		//forEach loop
		
		for(int each : arr) {
			System.out.print(each);
		}
		
		//foreach to string array
		System.out.println();
		
		String[]str1= {"a","b","c","d","e"};
		for(String values:str1) {//execute 3 time=str1.length//depends on length of the collection value
			System.out.print(values);
		}
		
		System.out.println();
		System.out.println("++++++++++++++");
		
		char []ch={'z','x','y','w','c','a','b'};
		Arrays.sort(ch);
		for(char charz:ch) {
			System.out.print(charz);
			
		}
		System.out.println();
		int [] arr1= {1,2,3,4,5,6,7,8,9,10,12,14};
		for(int each : arr1) {
			if(each %2==0)
			System.out.print(each+" ");
			
		}
		System.out.println();
		
		for(int each : arr1) {
			if(each %2!=0)
			System.out.print(each+" ");
			
		}
		
		//print out 1-100, we can not do it with each loop
		//because we need to have a collection of values, Array
		//only collection of values such as Arrays
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}