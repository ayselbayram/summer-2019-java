package day41initializerBlocks;

public class static_Instance_ConstructorBlocks {
	public int amount;
	
	
	
	static {
		
		System.out.println("static block");//static block execution does not depends on object
		//executed as soon as the class is loaded, before java checking the main method
		//executed only once
	}
	
	{
		System.out.println("instance block");//execution depends on object
		//when obj is cretaed instance block runs first,then constructor
	}
	
	public static_Instance_ConstructorBlocks() {//execution depends on the object
		this.amount=100;
		
		System.out.println("constructor");
		//constructor runs after the instance block
	}
	
	public static void main(String[] args) {
		static_Instance_ConstructorBlocks obj=new static_Instance_ConstructorBlocks();
		//instance and constructor executed, because obj created
		
		
		//constructor and instance bloc execution depends on the creation of object
		//if we created 2 objects it is executed 2 times
		
	static_Instance_ConstructorBlocks on=new static_Instance_ConstructorBlocks();
	System.out.println(on.amount);
		
		
	}
	

}
