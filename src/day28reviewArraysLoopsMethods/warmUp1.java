package day28reviewArraysLoopsMethods;

import java.util.Arrays;

public class warmUp1 {
	
		/*
		 * 1- write A METHOD THAT CAN CONVERT KM TO MILE
		 *     1km=0.612 mile
		 * 2- WRITE A METHOD THAT CAN CONVERT GALLONS TO LITER
		 *    1g=3.75 l
		 * 3- write a method that can print out  the aArray in Descending order
		 *
		 *     
		 */
		public static void main(String[] args) {
			kmToMile(10);
			gallonToLiter(4);
		    
			int [] arr= {0,-1,1000,500,3000};
			
			sortDes(arr);
			
			
		}	
			
		//warm up1
			public static void kmToMile(double km) {
				Double Miles=km*0.612;
				System.out.println(km+ " km is equal: "+Miles+" mile");
		
	}
		//warmup2
			
			public static void gallonToLiter(double gallon) {
				double liters=gallon*3.75;
				System.out.println(gallon+ " gallons is equal: "+liters);
			}
		//warmup3
			
			public static void sortDes(int[] array) {
				Arrays.sort(array);
				for(int i=array.length-1;i>=0;i--) {
					System.out.print(array[i]+" ");
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
}
