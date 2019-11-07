package day29_ReturnMethods;

import java.util.Arrays;

public class returnMethodPractice2 {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	//write a method that accepts an int array and sorts it then returns an array
	
	public static int [] sort(int [] arr ) {
		Arrays.sort(arr);
		int [] numbers=new int [arr.length];
		int z=0;
			for(int i=numbers.length-1;i>=0;i--) {
				numbers[z]=arr[i];
				z++;
			}
			return numbers;
		}

	}
	
	
	
	
	
	


