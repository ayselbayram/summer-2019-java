package day20JavaRecap;

import java.util.Scanner;

public class warmup1 {
	public static void main(String[] args) {
		/*
		 * 1-find the sum of the numbers between 1-1000 (1+1000)/2 *1000=500500 2- find
		 * the sum of all even numbers between 1 to1000
		 * 
		 * 
		 */
		int sum1 = 0;
		for (int i = 1; i <= 1000; i++) {// i:1-1000 each time increment by 1
			sum1 += i;

		}
		System.out.println("sum of all the numbers is:" + sum1);// we just want it to print one time
		System.out.println("============");
		// task2

		int sum2 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}

		}
		System.out.println("sumf of all even number" + sum2);

		// second solution for task2
		int sum3 = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum3 += i;
		}

		System.out.println("sumf of all even number" + sum3);

		// task 3 1.solution
		System.out.println("=============");
		int sum5 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 1) {
				sum5 += i;
			}
		}
		System.out.println("Sum of all tho odd numbers " + sum5);
		// second solution of task3
		int sum4 = 0;
		for (int i = 1; i <= 1000; i += 2) {
			sum4 += i;
		}
		System.out.println("Sum of all tho odd numbers " + sum4);

	}

}
