package day33_ArrayList;

import java.util.Arrays;

public class warmUpOverloading {

	/*
	 * 1-write a return method that accepts an int array and sorts it in descending
	 * order 2-write a return method that accepts a double array and sorts it in
	 * descending order 3-write a return method that accepts a char array and sorts
	 * it in descending order 4- write a return method that accepts a String array
	 * and sorts it in descending order Hint: method overloading is prefered here
	 */
	public static void main(String[] args) {
		int[] numbers = { 4, 3, 7, 8, 1 };
		numbers = descending(numbers);
		System.out.println(Arrays.toString(numbers));
		
		double[] arr= {10.5,6.8,4,7};
		System.out.println(Arrays.toString(descending(arr)));//if i dont want to assign it to somewhere
		
		char[] arr1= {'a','b','e','z'};
		arr1=descending(arr1);
		System.out.println(Arrays.toString(arr1));
		
		String [] arr2= {"filiz","selim","ipek","baris"};
		arr2=descending(arr2);
		System.out.println(Arrays.deepToString(arr2));
		
		Integer [] num= {34,76,54,89};
		num=descending(num);
		System.out.println(Arrays.toString(num));

	}
	
	//Integer[]
    public static Integer [] descending(Integer [] arr) {
    	Arrays.sort(arr);// ascending

		int z = 0;
		Integer[] arr1 = new Integer [arr.length];// can contain all values of arr
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[z] = arr[i];
			z++;

		}
		return arr1;
    	
    }
	
	//String []
	
	public static String[] descending(String[]arr) {
		Arrays.sort(arr);// ascending

		int z = 0;
		String[] arr1 = new String[arr.length];// can contain all values of arr
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[z] = arr[i];
			z++;

		}
		return arr1;
		
	}

	// char []
	public static char[] descending(char[] arr) {
		Arrays.sort(arr);// ascending

		int z = 0;
		char[] arr1 = new char[arr.length];// can contain all values of arr
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[z] = arr[i];
			z++;

		}
		return arr1;
	}

	// double []
	public static double[] descending(double[] arr) {
		Arrays.sort(arr);// ascending

		int z = 0;
		double[] arr1 = new double[arr.length];// can contain all values of arr
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[z] = arr[i];
			z++;

		}
		return arr1;

	}

	// int []

	public static int[] descending(int[] arr) {
		Arrays.sort(arr);// ascending

		int z = 0;
		int[] arr1 = new int[arr.length];// can contain all values of arr
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[z] = arr[i];
			z++;

		}
		return arr1;

	}

}
