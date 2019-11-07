package day43JavaRecap;

import java.util.Arrays;

public class InstanceBlock {
	
	String[] names=new String[3];
	
	
	{
		System.out.println("instance block");
		names[0]="Alla";
		names[1]="Seyfo";
		names[2]="Kusrhed";
		
		//names[3]="Sukran";out of bound exception
	}
	public InstanceBlock() {
		System.out.println("constructor");
		names[0]="Rahwa";
		names[1]="Gulmila";
		names[2]="Esma";
	}
	
	
	public static void main(String[] args) {
		InstanceBlock obj=new InstanceBlock();
		System.out.println("main method");
		System.out.println(Arrays.toString(obj.names));//instance variable we nee to add obj.names
		InstanceBlock obj1=new InstanceBlock();
	}

}
