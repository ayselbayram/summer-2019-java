package day28reviewArraysLoopsMethods;

import java.util.Arrays;

public class reviewKahoot {
	public static void main(String[] args) {
		
		//q
		char[] ch= {'a','b','c'};
		int z=ch.length;
		int count=0;
		while(count<z-1) {
			
			
			count++;
			
		}System.out.println(count);
		
		//q
		
		
		int num[] = {5,4,3,2,1};
		  for(int each:num) {
			  if(each==3){
				continue;  
			  }System.out.println(each+" ");//5421
			  break;
		  }
		 
		//q
		  
		  char[] ch1= {'a','b','c'};
		  for(char each:ch1) {
			  System.out.print(each+" ");
			  if(each=='b') {
				  continue;
				  
			  }
			  System.out.println();
			  long []Arr=new long[2];//[0][0]
			  
			  Arr[0]=5L;//[5][0]
			  Arr[1]=10l;//[5][10]
			  
			  Arr=new long [4];//0000
			  Arr[2]=15L;//00150
			  Arr[3]=20l;//001520
			  
			  System.out.print(Arrays.toString(Arr));
			  
			
			  
		  }
	}

}
