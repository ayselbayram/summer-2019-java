package day31JavaReviews;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReviews1 {
	public static void main(String[] args) {
		/*
		 Array: store multiple data to a variable
		        Array's size is fixed
		 
		 
		 */
		
		int num=10;
		
		//decleration of Array
		int [] arr= { 10 };//array size is 1 and fixed==[10]
//		    arr[1]=20;
//		    System.out.println(arr[1]);//out of bound exception
		    
		//initializing array's size
		
		    int [] arr2=new int [2];//[0,0],maximum capacity of the Array is 2
		    
		    System.out.println(arr2[0]);//default value ==0
		    
		    System.out.println(arr2[1]);//0 default number
		    
		    //exp
		    
		    String[] cars=new String[5];//takes 5 elements
		    //{Tesla, Audi, Toyota, Jeep,Subaru}
		    cars[4]="Subaru";
		    cars[2]="Toyota";
		    cars[1]="Audi";
		    cars[3]="Jeep";
		    cars[0]="Tesla";
		    
		    for(int i=0;i<=cars.length-1;i++) {
		    	System.out.print(cars[i]+" ");
		    }
		    System.out.println();
		    
		    System.out.println("++++++++++++++++++");
		    
		    cars=new String[10];
		    //{"ford","Honda","BMW","Volvo","Volkswagon"}
		    cars[5]="Ford";
		    System.out.println(Arrays.toString(cars));
		    System.out.println("**************");
		    
		    
		    boolean [] bool= {10>9,"Mikray".equals("Seyfo")};
		                   //    true      false
		    boolean b1=bool[0];
		    boolean b2=bool[1];
		    System.out.println(b1);//true
		    System.out.println(b2);//false
		    
		    //Arrays.toString: converts 1D Array to String
		    
		    System.out.println(bool);//hash code
		    String str=Arrays.toString(bool);
		    System.out.println(str);//[true, false]
		    
		    //Arrays.sort(variablename):it is not return method, just sort the Array, by ascending order,
		    double [] dArray= {1000,900,800,700,600};
		    
		    System.out.println(Arrays.toString(dArray));
		    
		    //expected result is {600,700,800,900,1000};
		    
		    Arrays.sort(dArray);// {600,700,800,900,1000};
		    System.out.println(Arrays.toString(dArray));
		    
		    //IQ=exp;print each value of the given array in descending order
		    
		    
		    int [] numbers= {200, 300, 20, 7890, 40, -9,-100};
		    
		    // sort it first then reverse it by for loop
		    
		    Arrays.sort(numbers);//sorts the array in ascending order
		    System.out.println(Arrays.toString(numbers));
		    System.out.println("%%%%%%%%%%%%%%%%%");
		    
		    String result="";
		    for(int  i= numbers.length-1;i>=0;i--) {
		    	result+=numbers[i]+", ";
		    }
		    	result=result.replace("-100", "-100");//another solution but just for this case
		    	result=result.substring(0,result.lastIndexOf(","));
		    	System.out.println(result);
		    	
		    	
		    	// ask user how many numbers want to add then find he maximum an minimum in Array
		    	Scanner scan=new Scanner(System.in);
		    	System.out.println("how many numbers would you like to add");
		    	int number =scan.nextInt();
		    	
		    	
		    	
		    	int [] arr3=new int [number];
		    	for(int i=0;i<arr3.length;i++) {
		    		System.out.println("Enter a number ");
		    	 arr3[i]=scan.nextInt();
		    	}
		    	
		    	 
		    	 
		    	 System.out.println(Arrays.toString(arr3));
		    	 
		    	 Arrays.sort(arr3);
		    	 System.out.println("min num: "+arr3[0]);
		    	 System.out.println("max num: "+arr3[arr3.length-1]);
		    	 
		    	 
		    	 
		    	
		    	
		    	
		    	
		    }
}

		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
		



