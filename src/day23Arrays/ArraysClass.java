package day23Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		
		/*
		 * Arrays: a variable that we can store multiple values
		 * regular variables= int a=10; can only have 1 value
		 * 
		 * Arrays:
		 *      int []    arr(variable name)= {10,20,30,40};
		 *     dataType     variable name
		 *     each values in an Array they have their own index numbers:
		 *     
		 *        int[] arr={10, 20, 30, 40}		
		 *        index num=  0  1.  2.   3.
		 *        
		 *        to retrieve data from the array:
		 *           
		 *             variable name[indexnumber of the data]
		 *             
		 *               arr[3] ===>40
		 *               arr[0]==>10
		 *             
		 *   Arrays is immutable, and Array's size is fixed
		 *   Arrays size must be initialized, there are 2 ways we can initialize arrays size
		 *      1.given values
		 *           int[] a ={1,2,3,};
		 *      2. just guven size only
		 *           int [] a=new int[length number];
		 *             
		 *         
		 *         
		*/
		
		
		int[] arr = {1,2};
		String[] names = { "Nigar","Sumayya","Medina"};
		//                   0          1       2
		System.out.println(names[0]);
		System.out.println(names[1]);
		String str1=names[2];
		
		System.out.println(str1);
		//System.out.println(names[4]);// gives error index num
		
		System.out.println("******************");
		
		double[] myArray= {1,2,3,4,5,8,0,2};
		          //index  0 1 2 3 4 5 6 7 
		
		for(int i=0;i<=7;i++) {
			System.out.print(myArray[i]+" ");//print decimal because ot he double variable
			
			
			
		}
		
		System.out.println();
		
		//find length of ARRAYs
		String str="ABC";
		int A=str.length();//3 
		System.out.println(A);
		
		
		int[]numbers= {12,24,48,96,2,3,4,5,6,7,8,9,10,11};
		int B=numbers.length;//total number of elements in the array//14 "," not included
		System.out.println(B);
		int HighestIndexNum=numbers.length-1;
		System.out.println(HighestIndexNum);
		
		for (int x=0;x<numbers.length;x++) {
			int s1=numbers[x];//i can assign it to 'int' because the characters are intigers
			System.out.print(s1+" ");
		}
		System.out.println();
		System.out.println("+++++++++++++++");
		
		
		char[] mychars= {'a','b','c','d'};
		int highestIn=mychars.length;
		System.out.println(highestIn);
		
		
		
		
		
		
		
		
		
	}

}
