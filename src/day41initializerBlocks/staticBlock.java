package day41initializerBlocks;

public class staticBlock {
	static {//static block can be after the main method but execute first things in the class
		System.out.println("static block 3");
	}
	static {//static block can be after the main method but execute first things in the class
		System.out.println("static block 1");
		System.out.println("static block 2");
	}
	
	public staticBlock() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		staticBlock obj1=new staticBlock();
		staticBlock obj2=new staticBlock();
		staticBlock obj3=new staticBlock();
		staticBlock obj4=new staticBlock();
		staticBlock obj5=new staticBlock();
		
		System.out.println("main method");
		
	}
	

}
