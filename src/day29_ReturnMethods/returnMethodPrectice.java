package day29_ReturnMethods;

import java.util.Arrays;

public class returnMethodPrectice {
	public static void main(String[] args) {
	sum(10,20);
	//int max=sum(10,20);// the method sum does not return any value
	addition(45,76);//this method is an int value,
	System.out.println(  addition(45,76)  );
	
	int num=addition(45,76);
	System.out.println(num);
	//byte num1=addition(45,76);//byte does not have enough size
	byte num1=(byte)addition(45,76);//explicit casting
	
	//exp
	greater(34,67,895);
	int max=(int)greater(34,67,895);
	System.out.println(max);
	System.out.println(greater(34,67,895));
	//exp
	int []arr= {2,56,76,8987,3,42};
	int maxNum=maximum(arr);
	System.out.println(maxNum);
	
	int [] arr2= {1000,466657,7363546};
	int maxnum2=maximum(arr2);
	System.out.println(maxnum2);
	
	//lunch warmup
	String [] names= {"filiz","barisciiik","selimcim","ipekcikbirnumara"};
	String longestName=longest(names);
	System.out.println(longestName);
	
	}
	
	
	
	
	
	
	
	//5lunch warm up
	public static String longest(String []str) {
		int max=0;
		String longest="";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>max) {
				max=str[i].length();
				longest=str[i]+" ";
				
			}
		}
		return longest;
	}
	
	
	//exp1
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	
	//exp2
	public static int addition(int a, int b) {
		return a+b;
	}
	
	//exp.exepts 3 numbers and returm max num//ARRAY FIND THE MAX NUMBER
	
	public static double greater(int a,int b,int c) {
		
		int[] arr= {a,b,c};
		//         {1,2,3}
		Arrays.sort(arr);//1,2,3 largest value at the last index
		return arr[arr.length-1];
		
		
	}
	
	//4EXP=CREATE A METHOD THAT ACCEPT INT ARRAY AND RETURNS MAXIMUM FROM THE ARRAY
	
	public static int maximum(int[]arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
