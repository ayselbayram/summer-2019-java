package day41initializerBlocks;

public class staticInitializerBlock {
	/*
	 static initializer block: used for initializing static variables.
	 static memebers: 1-static variable
	                  2- static methods
	                  3-static initializer block
	                  4- inner class(nested class)
	 static variable: decleared in the class, outside the any methods, with static keyword.(class variables)
	                 shared by class and all the other objects of that class
	 static method: a method that can be called using class name.static methods also belongs to the class.
	 
	 static initializer block:used for initializing static variables.
	 decleration of static block
	               
	               static {
	                  statements;
	               }
	               
	          static initializer block is executed as soon as the class is called.
	          it means this block is executed before the main method created 
	          
	  static initializer block:block is executed as soon as the class is loaded, only executed 1 time.
	  static block execution does not depend on the object.
	  
	   we can have multiple static block in java. First come first serve
	   
	   there is no object instance in any static, so therefore static does not accep nonestatic
	   
	   in order to call none-static in a static feture, we need to call it through the obj.
	   
	 */

}
