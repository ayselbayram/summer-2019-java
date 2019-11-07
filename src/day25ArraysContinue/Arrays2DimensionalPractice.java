package day25ArraysContinue;

import java.util.Arrays;

public class Arrays2DimensionalPractice {
	public static void main(String[] args) {
		
		int [][] arr2D= { {1,2},{3,4} };
		
		////length method:
		
		    int length=arr2D.length;
		    System.out.println(length);//2
		    
		    for(int i=0;i<arr2D.length;i++) {
		    	System.out.println(Arrays.toString(arr2D[i]));
		    	
		    }
		    
		    for(int i=0;i<arr2D.length;i++) {//checks each index of 1D array
		    	
		    	for(int j=0;j<arr2D[i].length;j++) {//check the each index of element 
		    	System.out.print(arr2D[i][j]+" ");
		    }
		
		    }
		    System.out.println();
		    //exp
		    
		    char[][]ch2D= { {'A','B'} , {'C','D'}  } ;
		    //print out each element one by one
		    
		    for(int i=0;i<ch2D.length;i++) {//checks index number of 2d Array 0,1
		    	for(int j=0;j<ch2D.length;j++) {//checks the value of the 1d array
                   System.out.println((ch2D[i][j]));//A,B,C,D
		    
		    
		
		    
		    
		    	}
		    
		    	}    
	}

}
