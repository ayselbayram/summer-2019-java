package day32javaReview;

public class WrapperClassreview {
	public static void main(String[] args) {
		
		/*
		 Primitives:byte, short,int,long,float,double,boolean,char
		 Wrapper Classes: Byte,Short,Integer,Long,Double,Float,Boolean,Character
		  
		  Difference between primitives and wrapper classes
		 1- 
		  Default values:
		  Wrapper classes: null
		  Primitive: int,byte,short,long:0
		             double,float: 0.0
		             boolean:false
		             char:space
		  2-Wrapper class accepts only their primitive values
		    Primitives accept any value as long as within the range
		  3-Wrapper classes have methods since they are classes.
		    Primitives don't have methods
		  4- Wrapper class takes object.
		     Primitives takes value
		  Methods: Max_values:to return the max value of the data type
		           Min_Values:to return the min values of the data type
		           Parse methods:converts String to primitives
		           ValueOf:converting String to Wrapper class
		   String is not a wrapper class
		 */
		int a=10;
		Integer b=10;//Integer only accepts int primitive values
		
		byte c=20;
		//Integer b2=c;// Integer only accepts int primitive values
		
		long L=b;//Integer within the range of long
		
		//auto-boxing:assign the primitives to wrapper class
		//unboxing:assign the wrapper class to primitives
		boolean result=9>0+1;
		Boolean result2=result;//auto boxing
		
		boolean result3=result2;//unboxing
		
		Boolean result4=result2;//none
		boolean result5=result3;//none
		
		/* Methods: Max_values:to return the max value of the data type
		           Min_Values:to return the min values of the data type
		           Parse methods:converts String to primitives
		           ValueOf:converting String to Wrapper class
		 */
		
		//max_value;
		
		int max=Integer.MAX_VALUE;
		//int max2=Double.MAX_VALUE;// double can not assign to int, int!=double
		System.out.println(max);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//min_value
		
		int min=Byte.MIN_VALUE;// min value of byte not int
		int min2=Integer.MIN_VALUE;//min value of int
		System.out.println(min);//-128
		System.out.println(min2);
		
		//parse methods
		
		short s1=Short.parseShort("123");
		System.out.println(s1+1);//it is number//124
		
		double d1=Double.parseDouble("78.5");//none,primitive to primitive
		System.out.println(d1);//78.5
		Double d2=Double.parseDouble("78.5");//auto-boxing
		
		
		boolean b1=Boolean.parseBoolean("arti");//none boxing
		System.out.println(b1);//false
		
		//valueOf methods:converst string to a warapper class valur
		Integer num=Integer.valueOf("123");//none boxing
		System.out.println(num);
		
		int num2=Integer.valueOf("123");//un boxing
		
		byte num3=Byte.valueOf("12");
		
		boolean R1=Boolean.valueOf("123");//other than true gives false,ignores case sensitivity
		System.out.println(R1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
