package day34ArrayListMethodsAndConstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {
		/*
		 1-ArrayList Methods(reamoining from yesterday)
		 2-converting Array to ArrayList 
		 3-removeAll(), addAll()
		 
		 1- ArrayList Methods(reamoining from yesterday)
		       1-indexOf(object):returns the index number of the object from the ArrayList
		       2-lastIndexOf(object): return the last index num. of given object as an int.
		       3-isEmpty():checks if the ArrayList is empty and returns boolean exp
		       
		 2-converting Array to ArrayList :
		 
		     1-Arrays.asList(object Array): used for converting object(not primitives) Arrays to list Interface(we will learn future)
		     
		 3- addAll(InterFace):used for storing multiple objects to ArrayList  
		 4-removeAll(interface) 
		 5- collections.sort(variablename):sorts descending order , it is presented in 'java util', sorts in ascending order 
		 
		 
		 
		 
		 
		 
		 
		 */
		
		
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);//auto
		list.add(Integer.valueOf("33"));//none
		list.add(Integer.parseInt("100"));//auto
		list.add(200);
		list.add(20);
		list.add(1);
		
		
		//indexOf(object)
		int a=list.indexOf(1);//auto
		System.out.println(a);//0
		int b=list.indexOf(1);//return the - number, means the object is not exist in the ArrayList
		
		int c=list.indexOf(200);
		System.out.println(c);//3
		
		//lastIndexOf(object);
		int a1=list.indexOf(1);
		int a2=list.lastIndexOf(1);
		
		System.out.println(a1);//first 1, index num
		System.out.println(a2);//last 1 index num
		
		
		//converting Array to ArrayList
		
		Integer [] arr= {1,2,3,4,5};
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(arr));//convert Array to ArrayList
		list2.add(100);
		System.out.println(list2);
		//in Array we can not add or remove, ArrayList we can.
		
		String [] arr2= {"java","phyton","c#","c++"};
		ArrayList<String> list3=new ArrayList<>(Arrays.asList(arr2));
		//isEmpty():checks if the ArrayList is empty and returns boolean exp
		
		System.out.println(list3.isEmpty());
		list3.add("F");
		System.out.println(list3);
		//only onbect Arrays can be converted to ArrayList
		
		//addAll(InterFace):used for storing multiple objects to ArrayList,convert to ArrayList
		
		ArrayList<String> names=new ArrayList<>();
		names.addAll(Arrays.asList("Filiz","Baris","Selim","Ipek"));
		System.out.println(names);
		
		//or
		String [] allnames= {"hakan","alex","rahva","erhan"};
		ArrayList<String> names1=new ArrayList<>();
		names1.addAll(Arrays.asList(allnames));
		System.out.println(names1);
		
		//removeAll(interface):
		
		ArrayList<Integer> number=new ArrayList<>();
		number.addAll(Arrays.asList(1,2,1,1,1,2,3,4,5));
		number.removeAll(Arrays.asList(1,2));
		System.out.println(number);
		
		//remove() method not designed to be used with in loop
		
//	ArrayList<Integer>lis=new ArrayList<>();
//	lis.addAll(Arrays.asList(1,2,1,2,3,2,1,4,5,4,5));
//	for(int i=0;i<lis.size();i++) {
//		if(lis.get(i)==1) {
//			lis.remove(i);
//		}
//	}System.out.println(lis);
		
		//collections.sort(variablename)
		
		Integer [] array= {1000,900,80,765,542};
		ArrayList<Integer> price=new ArrayList<>();
		price.addAll(Arrays.asList(array));
		System.out.println(price);
		
		Collections.sort(price);
		System.out.println(price);//ascending order
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
