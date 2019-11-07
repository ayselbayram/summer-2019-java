package day36JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {
	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>();
		//add():takes an object stores into the list
		//add(index,object); add() is overloaded method insert the given object to given number
		list.add(10);//10 is primitive firss then converted withh add method to noprimitive
		list.add(20);
		list.add(1,30);
		//list.add(4,30)//i skipped 3 thats why gives "out of bound index" error
		list.add(50);
		System.out.println(list);
		
		//get(); takes index num, returns the obj at the given eindex
		
		System.out.println(list.get(3));
		System.out.println(list.get(1));
		
		//size():returns the total number of elements in the list(similar with length)
		int a=list.size();
//		System.out.println(list.size());// this is also fine
		System.out.println(a);
		
		//last index num:list.size()-1
		
		for(int i=0;i<list.size();i++) {
			list.get(i);
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		
		//reverse
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//clear(): removes all the objects from ArrayList
//		 list.clear();
		 System.out.println(list);
		 
		 //set(index, object):replace the index with given object
		 
		ArrayList<String> students=new ArrayList<>();
		students.add("Erhan");
		students.add("Homayra");
		students.add("Rhawa");
		students.add("Arzu");
		students.add("Mehmet");
		students.add("Rhawa");
		
		students.set(0, "Holly");//Erhan replaced
		students.set(4, "Happy Birthday Mehmet");
		System.out.println(students);
		
		//indexOf(object):returns the index number of the given object
		
		System.out.println(students.indexOf("Rhawa"));//2
		
		//lastIndexOf(object);retorns last index number of the given objet
		System.out.println(students.lastIndexOf("Rhawa"));//5
		
		//equals(ArrayList); checks the objects ib 2 array list and return boolean exp
		
		ArrayList<String> student2=new ArrayList<>(Arrays.asList("A","B","C"));
//		students=student2;//after this result is TRUE
		System.out.println(students.equals(student2));//false
		
		
		//contains(object);check the given object is contained in ArrayList or not
		
		System.out.println(students.contains("Muhtar"));//false
		System.out.println(students.contains("Rhawa"));//true
		
		//isEmpty(): checks if the size is arraylist is 0 or not, returns boolean exp;
		ArrayList<Character> ch=new ArrayList<>();
		System.out.println(ch.isEmpty());//true
		ch.add('Y');
		System.out.println(ch.isEmpty());//false
		
		//remove(primitive int);it removes the given index number's object
		//remove is not designed to be used with in the loop
		
		ArrayList<Integer> price=new ArrayList<>();
		 price.add(1);//0
		 price.add(2);//1
		 price.add(3);//2
		 
		 price.remove(1);
		 System.out.println(price);
		 
		 //removeAll(Interface):
		 ArrayList<Integer> nums=new ArrayList <>(Arrays.asList(1,1,1,1,1,2,2,3));
//		 for(int i =0;i<nums.size();i++) {
//			 if(nums.get(i)==1) {
//				 nums.remove(i);//index num
//			 }
//		 }System.out.println(nums);//Iterables
		 
		 nums.removeAll(Arrays.asList(1,2));// removes all the 1s and 2s
		 System.out.println(nums);
		 
		 //addAll(Interface);adds multiple object to the ArrayList
		 
		 ArrayList<String> n1=new ArrayList<>();
		 n1.addAll(Arrays.asList("Yasin","Talha","Ruslan"));
		 
		 System.out.println(n1);
		 
		 //Collections sort();
		 
		 Integer[] arr= {1,2,3,4,5,5,5,100,-100,-9};
		 ArrayList<Integer> lists=new ArrayList<>(Arrays.asList(arr));
		 Collections.sort(lists);
		 System.out.println(lists);
		 
		 
		 
		 
		 
		 
		 
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
