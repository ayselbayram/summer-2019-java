package day30WrapperClassArrayList;

import java.util.ArrayList;

public class ArrayListClass3 {
	public static void main(String[] args) {
		/*
		 *ArrayList class:
		     1. presented in "java.util" package
		              import java.util.ArrayList;
		     2. ArrayList does not support primitives
		     
		     3. in array list we store objects ONLY, all the values in ArrayList are objects(none primitives)
		     
		     4.ArrayList size is automatically adjusted (dynamic)
		     5. Array list ordered (has index numbers)
		     
		     
		     
		  DECLERATION of ArrayList: 2 ways
		  
		    1-  ArrayList<ClassType> variable name=new ArrayList<>();//more preferred
		    2-  ArrayList<ClassType> list1=new ArrayList<ClassType>();
		  
		 Methods of ArrayList
		           
		         1-add(value); adds values to ArrayList.if value is primitive ,it will converts it to a a wrapper class
		  
		         2- get(indexnum);gets specific values from the ArraList(returns value)
		         
		         3-size():returns the total number of values of the ArrayList(returns value)
		         
		         4-clear(): clears the ArrayList, removes all the values from the ArrayList
		         
		         5-Collections.sort(variablename): sorting the ArrayList, presented "java.util" pacjage
		         
		         
		         
		         
		   ArrayLst vs Array:
		   
		          1.Array's size is fixed, ArraList size is dynamic;
		          2.Array supports both primitives and non primitives, ArraList support only NONprimitives
		             (anything we add ArrayList is objects not primitives)
		          
		         
		  
		 */
		//add() methods:
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		       list1.add(10);//auto boxing//int to wrapper class
		       //10= int==>integer
		       list1.add(20);
		       list1.add(30);
		       //[10,20,30]
		//index   0   1  2
		
		System.out.println(list1);
		
		//get();
		
		System.out.println(list1.get(1));
		
		//System.out.println(list1.get(9)); gives error bc maximum index num is 2
		
		//size():
		System.out.println(list1.size());
		
		//clear();// can not use clear inside syso
		list1.clear();
		System.out.println(list1);
		System.out.println(list1.size());
		
		System.out.println("*************************");
		
		
		
		
		
		
		
		
		
		
	}

}
