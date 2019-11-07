package day36JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp {
	/*
	 *1. write a return method that can remove the duplicated objects from an Integer arraylist
    2. write a return method that can remove the duplicated objects from a String arraylist
    3. write a return method that can remove the duplicated objects from a Character arraylist
    4. write a return method that can remove the duplicated objects from a Double arraylist
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,3,5,6,1,2,3,4,4,3,2));
		list=removeDup(list);
		System.out.println(list);
		//task2
		String [] names= {"filiz","baris","ipek","selim","ipek","baris"};
		ArrayList<String> names1=new ArrayList<>(Arrays.asList(names));
		
		names1=removeDup2(names1);
		System.out.println(names1);
	}
	//task2
	public static ArrayList<String> removeDup2(ArrayList<String> list){
		ArrayList<String> result=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
		
	}
	
	//task1
	public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
		ArrayList<Integer> result=new ArrayList<>();
		for(Integer each:list) {
			if(!result.contains(each)) {
				result.add(each);
			}
		}
		return result;
		
	}
	
	
	

}
