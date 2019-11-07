package day41initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {
	public static String name;
	public static int[] arr;
	public static ArrayList<String> list=new ArrayList<>();
	public static ArrayList<String> students=new ArrayList<>();
	public static String[] online= {"Arzugil","Me","Spike","Savas","Bahadir"};
	public static String [] inClass= {"Daryna","Nadire","Olga","Mizgin"};
	public static double a=100;
	public int grade;//instance variables can initalize in constructor
	
	
	static {
		name="Suna";
		arr= new int [5];
		arr[0]=1;//1,0,0,0,0
		arr[2]=3;//1,0,3,0,0
		list.add("Coffee");
		list.add("Tea");
		students.addAll(Arrays.asList(online));
		a=300;
		//list.add(6,"Madina"); exception, skipped indexes
	
		
		
		
		
	}
	
	static {
		name="Erhan";
		arr= new int [3];
		arr[1]=2;//0,2,0
		list.add("Break");
		students.addAll(Arrays.asList(inClass));
		a=400;//last initialize execut first
		
		
	}
	
	public staticBlockPractice() {
		name="Mehmet";//we need to create an obj for execution
		grade=100;
		
	}
	
	
	
	public static void main(String[] args) {
		staticBlockPractice obj=new staticBlockPractice();
		
		System.out.println(name);// first null,after initilize with block//Suna//Erhan//Mehmet
		System.out.println(Arrays.toString(arr));
		System.out.println(list);//[Coffe, Tea, Break]
		System.out.println(students);//[Arzugil, Me, Spike, Savas, Bahadir, Daryna, Nadire, Olga, Mizgin]
		a=500;
		System.out.println(a);
		//non static call in static
		System.out.println(obj.grade);
	}

}
