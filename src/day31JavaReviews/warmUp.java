package day31JavaReviews;

import java.util.Arrays;
import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		// ask user how many numbers want to add then find he maximum an minimum in Array
    	Scanner scan=new Scanner(System.in);
    	System.out.println("how many numbers would you like to add");
    	int number =scan.nextInt();
    	
    	
    	
    	int [] arr3=new int [number];
    	for(int i=0;i<arr3.length;i++) {
    		System.out.println("Enter a number ");
    	 arr3[i]=scan.nextInt();
    	}
    	
    	 
    	 
    	 System.out.println(Arrays.toString(arr3));
    	 
    	 Arrays.sort(arr3);
    	 System.out.println("min num: "+arr3[0]);
    	 System.out.println("max num: "+arr3[arr3.length-1]);
	}

}
