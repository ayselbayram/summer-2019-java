package day33_ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsPractice {
	public static void main(String[] args) {
		//set(indexnum,object);replace
		ArrayList<String> Javengers=new ArrayList<>();

		Javengers.add("Jena");//index 0
		Javengers.add("Mary");//1
		Javengers.add("Tarah");//2
		Javengers.add("Mahriban");//3
		
		Javengers.set(1,"seyfo" );
		System.out.println(Javengers);//[Jena, seyfo, Tarah, Mahriban]
		
		Javengers.remove(0);
	     Javengers.add(0,"Pilot");
		System.out.println(Javengers);//[Pilot, seyfo, Tarah, Mahriban]
		
		//remove(int): removes the index num
		
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		numbers.remove(3);//removes object 4, index 3==>1,2,3,5,
		System.out.println(numbers);
		
		
		//remove(object): removes the first matching object, returns a boolean value
		boolean result=numbers.remove("3");//string
		System.out.println(numbers);//Integer
		
		boolean result1=numbers.remove(Integer.valueOf("3"));//converts string to wrapper
		
		System.out.println(numbers);//[1, 2, 5]
		System.out.println(result1);//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
