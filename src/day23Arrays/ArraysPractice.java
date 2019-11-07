package day23Arrays;

public class ArraysPractice {
	public static void main(String[] args) {
		
		String[] Allstudents= {"ibrahim","ayse","Havva"};//size is 3
		Allstudents[0]="Marufjan";//re assigned the value
		//Allstudents[4]="Muhtar";//gives us compile error, in Arrays size is fixed to 3 here
		System.out.println(Allstudents[2]);
		
		//2. intialize the size  just given size only.Array size need to initialize before use
		 // int [] a=new int[length number];
		 
		   int[] array=new int[4];//this array can contain 4 values,its lenght is 4
		   //we havent given values to the array yet, but we initialized the size
		   System.out.println(array.length);
		   System.out.println(array[0]);// ==>0
		   System.out.println(array[1]);// ==>0
		   System.out.println(array[2]);//==>0
		  
		   //give values to the array
		   array[1]=100;
		   System.out.println(array[1]);//==100
		   System.out.println(array[0]);//==0 we havent initialize anything to"0" yet
		   array[2]=200;
		   System.out.println(array[0]);//==200
		   
		   // Arrays size if fixed
		   //System.out.println(array[5]);//gives error when we print it.out of the fixed array range
		   
		   
		   
		   
		   
		   
		
		   
		   
		   int [] array2;
		   //System.out.println(array2[0]);//compile error,size must be initialize
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
