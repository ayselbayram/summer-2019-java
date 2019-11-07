package day36JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz9Review {
	public static void main(String[] args) {
		//q3
		ArrayList<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3));
		int a=1;
		list.remove(a);
		System.out.println(list);//1,3
		
		//q4
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(Arrays.asList(1,2,3));
		Integer b=1;
		list2.remove(b);
		System.out.println(list2);
		
		//q5
		ArrayList<String> names=new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if(names.remove("Bran")) {
			names.remove("John");//[Robb, Rick, Bran]
		}
		
		System.out.println(names);
		
	
		
		
		
		
		
		
		
		
	}

}
