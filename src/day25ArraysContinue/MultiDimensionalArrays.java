package day25ArraysContinue;

import java.util.Arrays;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		/*
		 Multi-DinemsionalArrays:
		        n dimensional array contains(n-1) dimensional array
		        
		 What is 2 dimensinal array= array that contains multiple (2-1==1) dimensional array
		 2D=comtains multiple single dimensional arrays
		 */
		
		int[]arr1D= {1,2,3};
		
		int [][] arr2D={ {1,2,3,} , {4,5,6}};// contains multiple one dimensional,called 2 dimensional array
		
		//2 dimensional String Array
		
		
		String[] arr= {"A","B"};// 1 dimeansional array
		//                     0   1         0    1
		String [][]str2D= {  {"A","B"}  ,  {"C","D","E"}  };//contains multiple one dimensional array
		            //           0             1
		//first bracket=[represents the index number of 1 dimensional Arrays]
		//second bracket[index number of values]
		
//in order to print A
		System.out.println(str2D[0][0]);//A
		System.out.println(str2D[1][1]);//D
		System.out.println(str2D[1][2]);//E
		
//print [A, B]
		System.out.println(Arrays.toString(str2D[0]));
		
		//print [C,D,E]
		System.out.println(Arrays.toString(str2D[1]));
		
//Arrays.deepToString(variablenames): converts multi- dimensional arrays to string value
//print [A,B], [C,D,E]	
		
		System.out.println(Arrays.deepToString(str2D));
		
		
		//examples with int ARRAY
		//                   0 1     0 1    0 1
		int[][]numbers2D= { {1,2} , {3,4}, {5,6,7,8,9,10} };		
		//                    0        1     2
		
		//print 6
		
		System.out.println(numbers2D[2][1]);
		
		//print 10
		
		System.out.println(numbers2D[2][5]);
		
		//print {5,6,7,8,9,10}
		System.out.println(Arrays.toString(numbers2D[2]));
		
		//PTINR THE ENTIRE 2D ARRAY
		System.out.println(Arrays.deepToString(numbers2D));
		
		
		System.out.println("%%%%%%%%%%%");
		//3 dimensional array contains mulitple 2 dimensional arrays
		int [][] Array2D= {{1,2},{3,4}};
		 //                       0     1            0     1
		int [][][] array3D= { { {1,2},{3,4} } ,  { {5,6},{7,8}}};
		
	//[index number of 2Darray][index number of 1D array][index number of value]	
		//print 8
		
		System.out.println(array3D[1][1][1]);
		
		//print {5,6}
		System.out.println(Arrays.toString(array3D[1][0]));
		
		//{ {5,6},{7,8}}
		
		System.out.println(Arrays.deepToString(array3D[1]));
		
		//print the netire 3d array
		System.out.println(Arrays.deepToString(array3D));
		
		//4 dimensional array contains multiple 3 dimensional arrays
//		int [][][][] number4D= {{{ {1,2},{3,4}},               } }}   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
