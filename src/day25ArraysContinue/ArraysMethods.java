package day25ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
	
	//System.out.println(arr);// gives hashcode  number error
	/*
	 * to print entire Array as whole; we need convert it to Sting
	 *     Array.toString(variablename):used for converting single dimensions(one []0 of Arrays
	 *     to a String.WE CAN CONVERT ANYTHING(char,double,int,float,short,..)TO STRING BY USING toString method
	 *  Arrays Class;utility of all the Array,
	 *     Arrays class is presented in
	 *       " java.util" package\
	 * Arrays Utilities;
	 *     Arrays class us presented in "java.utils" package
	 *     Arrays.toString(variable names); it converts an Array to string value
	 *        
	 *     
	 */
		int [] arr={1,2,3,};
	String str=Arrays.toString(arr);
	System.out.println(str);
	
	
	String []names= {"Elvira","Bibish","Tural","Daulet","Hakan"};
	System.out.println(names);//hash code 
	 String str1=Arrays.toString(names);//convert the whole arrays to string
	 System.out.println(str1);
	
	 /*
	  * Arrays.sort(variablename):sorts the values of the arrays in extending(from smallest to largest) order
	  * 
	  */
	 int[] number= {1,3,890,67,45};
	 System.out.println(Arrays.toString(number));
	 Arrays.sort(number);//sorts all the values of the array in ascending order
	 //number=[1,3,890,67,45];
	 System.out.println(Arrays.toString(number));
	 
	 System.out.println("maximum"+number[number.length-1]);
      System.out.println("minimum "+number[0]);	 
      
      System.out.println("=====================");
      
      String[] list= {"Alma","Enes","Myre","Smith","Sarah","Lexi"};
      Arrays.sort(list);//alphabetical order(from ASCII table)
      System.out.println(Arrays.toString(list));
      
      System.out.println("+++++++++++++++");
      
      char []ch= {'0','9','8','5','3','2','1'};
      Arrays.sort(ch);
      System.out.println(Arrays.toString(ch));//we must convert the Array to String for printing it out.
      
	  System.out.println("***************");
	  
	  int [] num= {2000,90,89,78,65,5555,44,-5};
	  Arrays.sort(num);
	  Arrays.toString(num);
	  System.out.println("max: "+num[num.length-1]);
	  System.out.println("min: "+num[0]);
	  System.out.println("secon max; "+num[num.length-2]);
	  System.out.println("second min: "+ num[1]);
	  Arrays.sort(num);
	  for(int i=num.length-1;i>=0;i--) {//sukrans way
		  System.out.print(num[i]);
	  }
	  System.out.println();
	  // write a program that can print the array in Decsending order(largest to smallest
	  System.out.println(Arrays.toString(num));//my way
	  int  [] newnum=new int[num.length];
	  for(int i=0;i<num.length;i++) {
		  newnum[i]=num[(num.length-1)-i];
	  }System.out.println(Arrays.toString(newnum));
	  
	  System.out.println("%%%%%%%%%%%%%%%%%%%%");
	  int [] arr2= {2000,90,89,78,65,5555,44,-5};
	  Arrays.sort(arr2);//Ascending order
	  int [] decending=new int[arr2.length];//descending order
	  int z=0;
	  for(int i=arr2.length-1;i>=0;i--) {
		  decending[z]=arr2[i];
		  z++;
	  }System.out.println("Acsending order: "+Arrays.toString(arr2));
	  System.out.println("Decsending order: "+Arrays.toString(decending));
	 
		  
	  
	
	
	

	
	
}
}
