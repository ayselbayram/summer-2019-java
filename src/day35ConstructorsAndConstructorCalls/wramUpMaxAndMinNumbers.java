package day35ConstructorsAndConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class wramUpMaxAndMinNumbers {
	/*
	 * 1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer arrayList and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer arrayList and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
	 */
	public static void main(String[] args) {
		//task1
		int [] arr= {1,2,3,4,5};
		ArrayList<Integer> list=ArraytoArraylist(arr);
		System.out.println(list);
		//overload
		double[] arr2= {2.4,6,7.8,9};
		ArrayList<Double> list2= ArraytoArraylist(arr2);
		System.out.println(list2);
		//task2
		ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		int max=maxNum(list3);
		System.out.println(max);
		
		//task3
		int max2=secondMax(list3);
		System.out.println(max2);
		//task4
		int[]numbers= {-100,2,3,4,5,6,7};
		ArrayList<Integer> list5=ArraytoArraylist(numbers);
		 int min=minNum(list5);//1
		 System.out.println(min);
		
		//task5
		 
		 int second=secondMin(list5);
		 System.out.println(second);//2
		
		
		
	}
	//task1
	public static ArrayList<Integer> ArraytoArraylist(int [] arr) {
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int each:arr) {
			
			list.add(each);//convert it to Integer
			
		}
		return list;
	 
	}
	//overloading ArraytoArraylist
	
	public static ArrayList<Double>  ArraytoArraylist(double[] arr){
		ArrayList<Double> list=new ArrayList<>();
		for(double each:arr) {
			
			list.add(each);//convert it to Integer
			
		}
		return list;
		
	}
		
	
	//task2
	
	public static int maxNum (ArrayList<Integer> list) {
		int max=Integer.MIN_VALUE;
		for (int each:list) {
			if(each>max) {
				max=each;
			}
			
		}
		return max;
		
	}
	
	//task3
	
	public static int secondMax(ArrayList<Integer> list) {
		Integer max=maxNum(list);//int to integer auto boxing//called method1
		list.removeAll(Arrays.asList(max));//called method2, removes all the max numbers first if there are more then 1 max num
		int second=maxNum(list);
		return second;
	}
	
	//task4
	
	public static int minNum(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		for (int each:list) {
			if(each<min) {
				min=each;
			}
			
		}
		return min;
	}
	
	//task5
	public static int secondMin(ArrayList<Integer> list) {
		Integer min=minNum(list);
		list.removeAll(Arrays.asList(min));
		int second=minNum(list);
		return second;
		
	}
	
	
		
		
		
		
		
		
	

			
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	
	
}
