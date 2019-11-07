package day25ArraysContinue;

import java.util.Scanner;

public class warmUp1intArrayuniquesvalue {
	// print out the unique values from int Array
	// if arr={1,2,2,3,4,4}
	// output=1,3
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 5, 7 };
		
		
		for (int j = 0; j < arr.length; j++) {

			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[j]);//- numbers also work just give you unique ones
			}

		}
	}
}
