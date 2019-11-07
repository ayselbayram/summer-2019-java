package day31JavaReviews;

import java.util.Arrays;

public class ArraysReviewMultiDimensional2 {
	public static void main(String[] args) {
		
	
	/*
	 n dimensional array must contain (n-1) dimensional Arrays
	 */

	int[] arr1D= {1,2,3};
	// index         0 1 2    0 1 2
	int [][]arr2D= {{1,2,3},{ 4,5,6}};
	//index            0        1
	System.out.println(arr2D.length);//2
	//[index num of 1D arrays][index num of each value]
	
	//print2
	System.out.println(arr2D[0][1]);
	
	//print:{4,5,6}
	System.out.println(Arrays.toString(arr2D[1]));
	
	//print:{{1,2,3},{ 4,5,6}};
	
	System.out.println(arr2D);//hash code
	System.out.println(Arrays.toString(arr2D));//hash code
	
	//Arrays.deepToString(variablaname): converts multidimensional arrays to String
	String str=Arrays.deepToString(arr2D);
	System.out.println(str);
	
	
	//char value
	
	char[] ch= {'a','b','c','d','c','e'};
	
	for(char each:ch) {
		if(each=='c') {
			continue;
			//System.out.print(each+" "); it is going to be unreachable,skips the next statement
		}
			System.out.print(each+" ");//executed 4 times, collection size==a b c d
	}
	System.out.println();
	
	//2 dimensional array
	
	String[][] names= {{"Erhan","Holy","Muhtar"},{"Mike","Denis","Ariya"}};
	//outer loop executed 2 times,inner loop 3 times
	for(String[] each:names) {
//		System.out.println(Arrays.toString(each));
		for(String each1:each) {
			if(each1.equals("Holy") || each1.equals("Denis")) {
				continue;
			}
			System.out.print(each1+" ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}