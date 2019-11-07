package day28reviewArraysLoopsMethods;

import java.util.Arrays;

public class ArrayReviews {
	/*
	 *Aray= ordered collection of value
	 *int [] arr1D= {1,2,3,4};
	 *int  arr1D[]= {1,2,3,4};
	 *
	 *
	 *3 ways to declare the Array
	 *   int []arr1D={1,2,3,4};
	 *   int arr1D[]={1,2,3,4};
	 *
	 *   int []arr1D=new int[]{1,2,3,4};
	 */
public static void main(String[] args) {
	
	
	int [] arr1D= {1,2,3,4};
	System.out.println(arr1D[2]);//3
	//             0,1,2,3
	//initialize size of 1D array
	
	  int[] arr=new int[3];//this array can contains 3 elements//defaultvalue000
	  //to print array
	  System.out.println(Arrays.toString(arr));
	  arr[1]=10;
	  arr[0]=30;//30 10 0
	  arr[2]=40;//30 10 40
	  //arr[3]=50; index 3 is does not exist int his array
	  System.out.println(Arrays.toString(arr));
	  
	  System.out.println("**************");
	  
	  int[]numbers= {10,20,30,40};
	  for(int each:numbers) {
		  if(each==20) {
			  continue;//skips every single statements after the continue
		  }
		  
		  System.out.print(each+" ");
		  break;//exits the loop immediately
		  
	  }
	  System.out.println();
	  
	  int []nums= {100, 200,300,400};
	  for(int i=0;i<nums.length;i++) {
		  if(nums[i]==300) {
			  break;//100,200
		  }
		  //break; everything will be unreachable, compile error
		 System.out.println(nums[i]);
		 /*
		  *  if(nums[i]==300) {
			  break;//100,200,300
		  }
		  */
		 
	  }
	  
	  /*
	   * Arrays Util Class:toString(), sort(),deepToString()
	   * toString: converting single dimensional array to string
	   * sort(): sorting single dimensional array in ascending order
	   * deepToString:converting multidimesinalArray to string
	   */
	  
	  //sort():
	  long[] Longarr= {20,400,500,10,20};
	  System.out.println(Arrays.toString(Longarr));
	  //after we sorted it
	  Arrays.sort(Longarr);
	  System.out.println(Arrays.toString(Longarr));
	  
	  //deepToString(): multidimensional array
	  
	  
	  int[][] arr2D={ {1,2} , {3,4} };
	  //                0       1
	  
	  //System.out.println(Arrays.toString()arr2D);//gives hash code number
	  System.out.println(Arrays.deepToString(arr2D));//[1,2],[3,4]
	  
	  //in 2d array:[index number of 1D arrays][index number of values
	  
	  //System.out.println(arr2D[1]);//needs to be converted to string
	  System.out.println(Arrays.toString(arr2D[1]));//[3,4]
	  
	  System.out.println(arr2D[1][1]);//4
	 System.out.println("++++++++++++"); 
	  //use for each
	  for(int [] each:arr2D) {
		 
		  for(int  each2:each) {//[3,4]
			  System.out.print(each2);
			  
		  }
//	  } System.out.println(Arrays.toString(each));
	  
	
	
	
	
	
	
	
	
	
	
	  }	
}
}
