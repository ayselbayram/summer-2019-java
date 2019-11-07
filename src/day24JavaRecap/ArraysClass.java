package day24JavaRecap;

public class ArraysClass {
	public static void main(String[] args) {
		/*
		 * Array decleration= 
		 * 1.Data Type [] variablename={1,2,3,4,}; 
		 * 2.Datatype variablename[]={1,2,3,4}
		 * ; same thing Arrays has index numbers.in order to
		 * retrieve a single value from an array variablename[indexvalue] Arrays size is
		 * fixed,size must be initialized before use it.there are 2 ways initialize
		 * Arrays size
		 * 
		 * 1. by giving value int[] arr={1,2,3};//size is 3 initialize the size and the
		 * value same time 2. new key word int[] arr= new int{size number] just size no
		 * value
		 */

		int[] arr = { 10, 20, 30 };

		int arr2[] = { 10, 20, 30 };

		char[] arr3 = { 'a', 'b', 'c' };
		String[] arr4 = { "ayse", "ftama", "ali", "veli" };
		String name = arr4[2];
		System.out.println(name);

		/*
		 * initialize size of Array int[]= new int[size]
		 * 
		 * 
		 */
		int[] mynumbers = new int[5];
		for (int i = 0; i < mynumbers.length; i++) {
			System.out.println(mynumbers[i]);
		}
		/*
		 * default value ==0 int,byte,short,lonf==>0 
		 * float,double==>0.0 boolean==>false
		 * char==>space
		 * 
		 * String===>null
		 */
		System.out.println("=================");

		int sarr[] = new int[3];// size initialized
		sarr[0] = 10;
		sarr[1] = 20;
		sarr[2] = 30;
		// sarr[3]=40; gives error

		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);// 10,20,30
		}
		// every time we REINITIALIZE THE ARRAY the previous data is lost

		sarr = new int[4];// re-initialize its size
		for (int z = 0; z < sarr.length; z++) {
			System.out.println(sarr[z]);// 0000
		}

		System.out.println("+++++");
		
		//combine 2 arrays
		
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] arrays3 = new int[array1.length + array2.length];//size eneough to take 2 arrays

		for (int i = 0; i < array1.length; i++) {
			arrays3[i] = array1[i];
		}
		
		for(int i=0;i<array2.length;i++){
		   
		arrays3[i+array1.length]=array2[i];
		}
		
		for (int i = 0; i < arrays3.length; i++) {
			System.out.print(arrays3[i] + " ");
		}
	
	}
}
