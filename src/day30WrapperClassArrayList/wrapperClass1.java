package day30WrapperClassArrayList;

import java.util.Arrays;

public class wrapperClass1 {
	public static void main(String[] args) {
		
		/*
		 Wrapper classes: every primitive in java has a class that's  designed dedicated to it.
		 They have their own wrapper class
		 All the wrapper class are objects
		 ptimitives=byte,short,int,long,float,double,boolean,char
		 
		 wrapper classes: Byte, Short, Integer,Long, Float,Double, Boolean,Character(those are classes)
		 
		 All wrapper class presented in "java.lang" package.
		 no need to import "java.lang" compiler import for us for each classes
		 
		 String class is also presented in 'java.lang' package
		 All classses in package "java.lang" imported by default
		 
		 Auto-Boxing : converting primitive values to wrapper class;
		 Unboxing= is converting wrapper class vale to a primtive value
		 ===============================================
		 default values;byte,short,int long====>0
		 double, float===>0.0
		 boolean===>false
		 char===>space
		 Default value of Wrapper classes:'null'
		 if we do  not give any objects to class (reference) null will be given by default.
		      String's default value is also 'null'
		 */
		
		int numInt=10;//primitive
		Integer numInteger=10;//wrapper class
		
		double numdouble=5.5;
		Double numDouble=5.5;
		
		long numlong=20L;
		Long numLong=numlong;//convert long primitive to wrapper class background 'Auto-Boxing 'is happening
		System.out.println(numlong);
		System.out.println(numLong);
		
		Boolean Booleanresult=false;
		boolean booleanResult=Booleanresult;// converting wrapper to primitive called "unboxing"
		
		
		char ch='A';
		
		Character ch1=ch;/// auto -boxing
		
		char ch3=ch;// primitive to primitive non
		
		char ch4= ch1;// unboxing
		
		char ch5=ch;//non
		
		//default value
		
		int[] arr= new int[3];//[0,0,0]
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr1= new Integer[3];//[0,0,0] default of the primitives
		System.out.println(Arrays.toString(arr1));//[null,null,null],default value of Wrapper classes
		
		System.out.println("++++++++++++++++");
		
		int num1=10;
		//num1.method(); primitives does not have methods, variable num1 is not an object 
		
		Integer num2=20;
		     int x=num2.MAX_VALUE;
		
		
		     
		     
		     
		     
		     
		     
		     
		
	}

}
