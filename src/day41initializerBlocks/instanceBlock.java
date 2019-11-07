package day41initializerBlocks;

public class instanceBlock {
	/*instance initiaize block:used for initializing isntance variable, belongs to object
	 * instance variable: decleared int the class, outside any methods,
	     each objects has its own copy of instance variables.
	     
	      {
	         statement;
	      }
	      
	   instance block execution depends on creation of an object
	   instance block execution depends the creatin object also 
	   instance block executed first then the constructor
	   we can create multiple instance blocks
	   first instance block execute first
	   
	
*/
	{
		System.out.println("instance block");
	}
	
	{
		System.out.println("instance block2");
	}
	
	
	
	
	
	
	
	public instanceBlock() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		instanceBlock obj=new instanceBlock();
		instanceBlock obj1=new instanceBlock();
		instanceBlock obj2=new instanceBlock();
	}
	
	
	
	
	
	
	
}
