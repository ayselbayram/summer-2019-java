package day43JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {
	/*
	 * main reason the static block, to initilize the static variables
	 */
	
	static String [] arr=new String[3];
	static ArrayList<String> list=new ArrayList<>();
	double salary;
	
	static {
		System.out.println("static block");
		arr[2]="Alla";
		arr[0]="Kateryna";
		arr[1]="Ruslan";
		list.addAll(Arrays.asList(arr));
		//salary=500;, static only accepts static,compile er
		StaticBlock obj=new StaticBlock();//local obj
		obj.salary=4000;
		System.out.println(obj.salary);
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(Arrays.toString(arr));//[Kateryna, Ruslan, Alla]
		System.out.println(list);//[Kateryna, Ruslan, Alla]
		StaticBlock obj=new StaticBlock();
		System.out.println(obj.salary);//0.0, salary stays with in the static block, it is local
		
	}

}
