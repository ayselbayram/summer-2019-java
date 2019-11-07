package day29_ReturnMethods;

import java.util.Arrays;

public class methodOverLoading {
	/*
	 Method Overloading:
	             feature that allows us to have more than one method with same name,the method must have 
	             different parameters.
	 in overloading the return type of the methods does not have to be same 
	 Why do we need overload method:
	 in java all the methods can be overloaded
	              1. improves the reusuability
	              2. improves the readability
	              3. it is easier to remember 1 method name instead of remembirin buch of ones
	              4. overload methods is very flexible
	 */
	public static void main(String[] args) {
		int result=sum(35, 76);
		System.out.println(result);
		
		System.out.println(sum(23, 65, 78));
		;
		System.out.println(sum(0.5, 10.5));
		
		int [] arr= {1,2,3,4,5};
		sort(arr);
		
		char [] ch= {'a','c','g','d'};
		//sort(ch) compile error, this method design only for int array,i oveloaded the sort now we can use char
		
		sort(ch);
		
		String [] str= {"filiz","baris","selim","ipek"};
		sort(str);
				
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a, long b,int c) {
		return a+(int)b+c;
	}
	//public static double sum(int a,int b) {//parameters MUST be different
		
	public static double sum(double a, double b) {
		return a+b;
	}
	
	//overloead method example:the sort method of Arrays classINTERVIEW q.
	//it accepts all data type 
	
	//Arrays.sort();//this is an overload method
	
	//write a method called sort, that can sort an int array, in descending order
	
	public static void sort(int[] arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}System.out.println();
		
	}
	
	public static void sort(char[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public static void sort(String[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
