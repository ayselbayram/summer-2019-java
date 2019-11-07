package day34ArrayListMethodsAndConstructors;

import java.util.ArrayList;

public class warmUp {
	/*
	 1. Write a return method that accespts an Integer ArrayList and returns the maximum number from the arraylist
        DO NOT use sort method of the collections class
2. use the method 1 to Write a return method that accepts an integer ArrayListand returns the second maximum number
        DO NOT use sort method of the collections class
        count("abcabca","a")==3
        
3. Write a return method that accespts an Integer ArrayList and returns the minimum number 
        DO NOT use sort method of the collections class
        
4. use the method 1 to write a return method that accepts an integer ArrayList and returns the second minimum number
        DO NOT use sort method of the collections class

	 */
	public static void main(String[] args) {
		//task1
		String a=RemoveDup("abcabcdefdef");
		System.out.println(a);
		//task2
		int count=count("abcaadabcdaaa","a");
		System.out.println(count);
		//task3
		System.out.println(frequency("abcabcaabbcccd"));
		//task4
		ArrayList<Integer> list=new ArrayList<>();
		list.add(-100);
		list.add(20);
		list.add(0);
		list.add(30);
		int num=maximum(list);
		System.out.println(num);
		//task5
		int minum=minimum(list);
		System.out.println(minum);
		
		
		
		
	}
	//task5
	public static int minimum(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		for(int each:list) {
			if(each<min) {
				min=each;
			}
		}return min;
		
		
	}
	
	//task4
	
	public static int maximum(ArrayList<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int each:list) {
			if(each>max) {
				max=each;
			}
		}return max;
		
	}
	//task3
	public static String frequency(String str) {
		
		String nondup=RemoveDup(str);//
		
		
		String result="";//to store the expected result
		for(int i=0;i<nondup.length();i++) {
		int count=count(str,""+nondup.charAt(i));
		result+=""+nondup.charAt(i)+count;
		}
		return result;
		
		
	}
	
	
	//task2
	public static int count(String a, String b) {
		             //       abab         a==>1
		            //         bab          a==>2
		int count=0;//to count how many time b is appeared in a
		while(a.contains(b)) {
			
			count++;
			a=a.replaceFirst(b, "");
			
		}
		
		return count;
	}
	
	//task1
	public static String RemoveDup(String str) {
		
		String result="";
		for(int i=0;i<str.length();i++) {
			if(!result.contains(str.substring(i,i+1))) {
				result+=str.substring(i,i+1);
			}
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
