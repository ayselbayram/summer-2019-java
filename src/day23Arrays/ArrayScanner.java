package day23Arrays;

import java.util.Scanner;

public class ArrayScanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] inputs=new int[10];//int his array we can store 10 elements,highestnum.of index is 9
		
		
		
		for(int i=0;i<inputs.length;i++) {
			
		System.out.println("enter a number");
		      inputs[i]=scan.nextInt();
		      
		}
	    for(int i=0;i<inputs.length;i++) {
			System.out.print(inputs[i]+" ");
		}
		
		
		
		
		
		
	}

}
