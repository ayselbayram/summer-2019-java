package day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass2 {

	/*
	 * ArrayList: presented in java util package does not support primitives, we can
	 * only store objects in ArrayList ArrayList size is dynamic, adjusted
	 * automatically. ArrayList is an ordered collection af values(index number). we
	 * can add or remove objects from ArrayList.(advantage) ArrayList is a class
	 * Decleration of ArrayList: 1- ArrayList<onlyNonPrimitives> variable name=new
	 * ArrayList<onlyNonPrimitives>();
	 * 
	 * 2-ArrayList<onlyNonPrimitives> variable name=new ArrayList<>();(PREFERRED)
	 * 
	 * DECLERATION AF ARRAY: int []arr=new int[6];
	 * 
	 * ArrayList vs Array:(INTERVIEW QUESTION) ArraysList size is dynamic, Array' is
	 * fixed.
	 * 
	 * ArrayList only support nonprimitives,Array supports all.(primitive
	 * nonprimitive)
	 * 
	 * Array can be multidimensional, but ArrayList can not be multidimensional
	 * 
	 * Methods of Arraylisy 1-add(object): add objects to arrey list ,overloaded method
	 *                      2-get(index): gets the data drom the ArrayList 
	 *                
	 *                      3-size(): returns the length of ArrayList as an int; 
	 *                      4-clear(): removes everything from ArrayList
	 *                      5-set(indexnum,object): the given object will replaced with the object 
	 *                                        that the given index number
	 *                      6-contains(object): checks if the given contain inr the ArrayList or not,
		                                    returns boolean value
		                    7-equals(ArrayList): checks if the 2 ArrayList are equal or not, returns boolean value.
				                             case sensitive
	 *                      8-remove(int):removes the given index, overload method,
	 *                      9-remove(Integer); it removes the first matching object,
	 *                                          at the same time it returns you a boolean value.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// decleration of ArrayList:

		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>();

		// add(object):
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("apple");// index 0, size=1
		shoppingList.add("orange");// index 1, size:2
		shoppingList.add("grapes");// index2, size:3
		System.out.println(shoppingList);// no need toString for ArrayList

		// add(indexnum,object);// adds the object at the given index num

		shoppingList.add(1, "strawberry");// insert
		System.out.println(shoppingList);

		shoppingList.add(4, "cherry");// index outofbound error
		System.out.println(shoppingList);

		shoppingList.add(5, "kkk");
		System.out.println(shoppingList);
		
		
		
		// exp add(index,object)
		
		ArrayList<Integer> number=new ArrayList<>();
		
		number.add(0,5);//  [5]   ArrayList does not skip index numbers
		number.add(1,10);//[5,10]
		number.add(2,15);//[5,10,15]
		number.add(1,1);//[5,1,10,15], insert 1
		number.add(1,6);//[5,6,1,10,15],insert 6
		System.out.println(number);

		
		System.out.println("****************");
		
		//get(indexnum): return the object in that index
		
		  ArrayList<String> names=new ArrayList<>();
		  names.add("Humeyra");
		  names.add("Meri");
		  names.add(1,"Mikrigul");
		  names.add(1,"Tabriz");
		  names.add(0,"Asiya");
		  
		  
		  String str1=names.get(1);//none
		  System.out.println(str1);//Humeyra
		  
		  //size();returns us the size of the ArrayList as an int value
		  
		  int size=names.size();
		  System.out.println(size);
		  
		  for (int i=0;i<names.size();i++) {
			  String name=names.get(i)+" ";
			 
		  }System.out.print(names); 
		  System.out.println();
		  
		  for(String each:names) {
			  System.out.print(each+" ");
		  }
		  System.out.println();
		  System.out.println("+++++++++++++++++=");
		  
		  //clear();
		  
		  ArrayList<String> students=new ArrayList<>();
		  students.add("Holly");
		  students.add("Erhan");
		  students.add("Nadira");
		  students.add("Seyfo");
		  students.add("Cihan");
		  System.out.println(students);
		  System.out.println(students.size());//size:5
		  
		  students.clear();
		  System.out.println(students);//[]==>removes all the objects from the ArrayList
		  System.out.println(students.size());//size:0
		  
		  //set(indexnum,object);
		  
		   ArrayList<String> Javengers=new ArrayList<>();
		   Javengers.add("Ferhat");
		   Javengers.add("Lexi");
		   Javengers.add("Asiya");//replace it with Shawkrat
		   Javengers.add("Ozgen");
		   Javengers.add("Alex");
		   Javengers.add("Sefvan");
		   
		   Javengers.set(2, "Shawkrat");
		   System.out.println(Javengers);
		   
		   //contains(object): checks if the given contain inr the ArrayList or not,
		   //returns boolean value
		   
		   
		   ArrayList<String> goodGuys=new ArrayList<>();
		   
				   goodGuys.add("Hakan");
				   goodGuys.add("Ihsan");
				   goodGuys.add("Tim");
				   goodGuys.add("Ibrahim");
				   goodGuys.add("Dilyar");
				   
				   boolean result=goodGuys.contains("Tim");//true, if it was"Muhtar"==>false
				   System.out.println(result);
				   
     //equals(ArrayList): checks if the 2 ArrayList are equal or not, returns boolean value.
				   //case sensitive
				   
				   ArrayList<String> badGuys=new ArrayList<>();
				   badGuys.add("Muhtar");
				   badGuys.add("Asiya");
				   badGuys.add("Replit");
				  boolean result1= badGuys.equals(goodGuys);
				  System.out.println(result1);//false
				  
				  if(goodGuys.contains("Ibrahim")|| badGuys.contains("Ibrahim")) {//true, false==>true
					  System.out.println("ibrahim is good guy");
				  }
				   
				   
			//remove(int):removes that index, remove it accepts primitive
				  ArrayList<Integer>lists=new ArrayList<>();
				  lists.add(1);//index=0//compiler convert 1 to wrapper class Integer(primitive to wrapper)
				  lists.add(2);//index=1//auto boxing
				  lists.add(3);//index=2
				  lists.add(4);//index=3
				  lists.add(5);//index=4
				  
				  lists.remove(1);//[1,3,4,5]
				  
				  lists.remove(2);//1,4,5
				  lists.remove(1);//1,5
				  System.out.println(lists);
				  
				  System.out.println(lists.size());
				  
			//remove(Integer); it removes the first matching object, at the same time it returns you a boolean value.
				  
				  ArrayList<Integer> list3=new ArrayList<>();
				  list3.add(1);//index=0//
				  list3.add(2);//index=1//auto boxing
				  list3.add(3);//index=2
				  list3.add(4);//index=3
				  list3.add(5);//index=4
				  
				  //[1,2,3,4,5]
				  Integer a=1;// if a=8,==>false
				  boolean r1=list3.remove(a);
				  System.out.println(list3);//[2, 3, 4, 5]
				  System.out.println(r1);// if it is removed, true, otherwise false
						  
				   //exp
				  
				  ArrayList<String> city=new ArrayList<>();
				  city.add("Miami");
				  city.add("Miami");				  
				  city.add("Gotham");
				  city.add("Azarbaijan");
				  city.add("Istanbul");
				  city.add("Urumqi");
				  
				  boolean r2=city.remove("Miami");//[Miami, Gotham, Azarbaijan, Istanbul, Urumqi]
				  System.out.println(city);
				  
				  if(r2) {
					  city.remove(2);
					 
				  } 
				  
				  System.out.println(city);//[Miami, Gotham, Istanbul, Urumqi]
				   city.add(3,"Azarbaijan");
				  System.out.println(city);//[Miami, Gotham, Istanbul, Azarbaijan, Urumqi]
				  
				  //exp
				  
				  ArrayList<Integer> price=new ArrayList<>();
				  price.add(1);//auto boxing, primitive converted to Wrapper cllasss(object)
				  price.add(2);
				  price.add(3);
				  price.add(4);
				  price.add(5);
				  
				price.remove(Integer.parseInt("2"));//perse method returns primitive, index 2
				
				System.out.println(price);//[1, 2, 4, 5]
				   
				boolean r3=price.remove(Integer.valueOf("3"));//valueOf methods returns wrapper class
				
				System.out.println(price);//no 3 in ArrayList
				System.out.println(r3);//false
				   
				   		   
		  
		  
		  
		  
		  
		  
		  		
		  		
		
		
		
		
		
		
		
		
		
		

	}

}
