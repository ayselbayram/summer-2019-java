package day46_SuperKeyword;

import day45_Protected_Default.day46_protectedTest;

class Data{
	public static int num1=10;
	protected static int num2=20;
	private static int num3=30;
	static int num4=40;
}

public class InheritanceReview_1 extends Data {
	static int staticNum;
	int insNum;
	
	/*public static int num1=10;
	protected static int num2=20;
	static int num4=40;
	
	 * 
	 */
   public static void main(String[] args) {
	   
//	   InheritanceReview_1 obj=new InheritanceReview_1();
//	   System.out.println(obj.num1);
	   //when we make them not static instance we can execute them by creating sub class object
	   //i can also call  them by crating Data class object
	   
	   
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num4);
	
	day46_protectedTest obj2=new day46_protectedTest();
	//System.out.println(obj2.nameprotected);  i created an protected instace variable in another 
	//package and try to call ai here but proteced is not visible
	System.out.println(obj2.namePublic);//i created in another package and called it here, public is worldwide
//instance cs static
	
	InheritanceReview_1 objA=new InheritanceReview_1();
	                    objA.staticNum=100;
	                    objA.insNum=200;
	      
	InheritanceReview_1 objB=new InheritanceReview_1();
	                    objB.insNum=400;
	    System.out.println(objB.insNum);//400
	    System.out.println(objB.staticNum);//100 only one copy for all objects
	
	
}
}
