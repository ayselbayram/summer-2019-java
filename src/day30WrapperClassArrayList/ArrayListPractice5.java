package day30WrapperClassArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice5 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<31;i++) {
			if(i%2==0) {
				list.add(i);
			}
			
		}System.out.println(list);
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//for each method
		for(Integer each:list) {
			System.out.print(each+ " ");
		}
		System.out.println();
		
//		for(Integer each:list) {//same result/unboxing
//			System.out.print(each+ " ");
//		}
//		
		
		//task
		int num=list.get(7);//unboxing
		//       == integer
		System.out.println(num);
//		list.clear();// size of the list becomes=0
		
		System.out.println(list.get(2));//gives error
		
		
		//Collections: sorting the ArrayList
		
		 Collections.sort(list);
		 System.out.println(list);
		 
		 ArrayList<Integer> list1=new ArrayList<>();
		 for(int i=20;i>=0;i--) {
			 list1.add(i);
			 
		 }System.out.println(list1);
		 Collections.sort(list1);
		 System.out.println(list1);
		 
		 //collections is a class
		
		
		
		
		
		
		
		}
		
		
		
		
	}


