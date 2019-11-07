package day30WrapperClassArrayList;

public class methodsofWrapperclass2 {
	public static void main(String[] args) {
	/*
	 useful methods of wrapper class;
	              Max_Value: it returns the maximum value of the primitive
	              Min_Valuereturns: the minimum value of primitive
	              parse methods: converting a String value to Primitives,returns value as primitive,
	                            it is not case sensitive
	              
	              ValueOfmethods:used for converting string value to Wrapper class,
	 	
	 	
	 	
	 */
		
		//max_Value: it returns the maximum value of the primitive
		  int maximum=Integer.MAX_VALUE;
		  System.out.println(maximum);
		  
		  
		  
		  double maxidouble=Double.MAX_VALUE;
		  System.out.println(maxidouble);
		
		  byte maxibyte=Byte.MAX_VALUE;
		  System.out.println(maxibyte);
		  
		  char maxiChar=Character.MAX_VALUE;
		  System.out.println(maxiChar);//returns character
		  
		  //min_value; returns the minimum value of primitive
		  
		  int minimum=Integer.MIN_VALUE;
		  System.out.println(minimum);
		  
		  byte minibyte=Byte.MIN_VALUE;
		  System.out.println(minibyte);
		  
		  //parse Methods: converting a String value to Primitives,returns value as primitive
		
		  //parseIn("strValue"):takes the string and converts the String to int primitive
		  System.out.println("+++++++++++++++++++++");
		  
		  Integer num1=Integer.parseInt("123");//auto boxing
		  //wrapper class<====primitive//auto boxing
		  System.out.println(num1);
		  
		  int num2=Integer.parseInt("125");//none
		  //primitive        primitive===>none
		  
		  
		  //parseByte("strValue"); takes string and converts string to byte 
		    
		  
		  int num3= Byte.parseByte("19");//we can assign byte to int(size)
		  System.out.println(num3+1);
		  
		  //byte num3= Byte.parseByte("198");//gives error out of range
		  
		  
		  Byte num4=Byte.parseByte("19");//auto-boxing
		  System.out.println(num4);

		  //parseShort("StrValur"):takes string value and converts it to short value
		  
		  short snum=Short.parseShort("200");//none
		  System.out.println(snum);
		  
		  Short num6=Short.parseShort("200");//auto-boxing
		  System.out.println(num6+1);
		  
		  // paresLong("strValue"): takes a string value and converts it to a long primitive
		  
		  long num7=Long.parseLong("1222");
		  System.out.println(num7);
		  
		  int  num8=(int)Long.parseLong("1222");//explicit casting
		  System.out.println(num8);
		  
		  //parseFloat("strValue");takes string value and converts it float primitive
		  
		  float num9=Float.parseFloat("12.5");
		  System.out.println(num9+0.5);
		  
		  Float num10=Float.parseFloat("12.5f");//auto
		  System.out.println(num10);
		  
		  //parseDouble(strValue):takes  string value and converts it to double primitive
		  
		   int num11=(int)Double.parseDouble("12.65");//explicit casting
		   System.out.println(num11);
		   
		   
		   
		   double num12=Double.parseDouble("12.65");
		   System.out.println(num12);//12.65
		   
		   double num13=Double.parseDouble("12.65");//auto boxing
		   System.out.println(num13);
		  
		  //parseBoolean("strValue");takes a string and converts it to a boolean primitive
		   
		   boolean A=Boolean.parseBoolean("true");//any string value other than True will return false
		   System.out.println(A);
		   
		   boolean B=Boolean.parseBoolean("TRUE");//methods ignores the case sensitivity
		   System.out.println(B);
		   
		   boolean C=Boolean.parseBoolean("10>9");
		    System.out.println(C);//false
		    
		    //======================================
		    System.out.println("+++++++++++++++++++++++++");
		    //we can assign int to bouble primitive
		    int a=10;
		    double b=a;
		// we can not assign int primitive to other type wrapper class
		    
		    //Double c=a;we can not assign int primitive to other type wrapper class
		    
		    int A1=Byte.parseByte("19");
		    //Integer A2=Byte.parseByte("19");//gives compile error needs to explicit
		    Integer A2=(int)Byte.parseByte("19");// needs to explicit
		    
		    
		    //exp
		    
		   // Short A3=(byte)Double.parseDouble("10.9"); gives compile error
		    //needs to explicit to short
		    Short A3=(short)Double.parseDouble("10.9");
		    
		//
		    int A5=100;
		    //Float A6=A5;//float wrapper class only for float primitive we need to cast iy
		    Float A6=(float)A5;
		
		    
		 //ValueOf METHODS: used for converting string value to Wrapper class,returns wrapper class values
		    
		    int z=Integer.valueOf("1234");//unboxing
		    
		    Integer z1=Integer.valueOf("1234");//none
		    
		    Integer z2=Integer.valueOf("1234"+1);//auto boxing
		    
		    //(int)Integer.valueOf("1234");//turns wrapper class to primitive value
		    System.out.println(z2+1);
		    
		   // exp
		    
		    boolean result=Boolean.valueOf("TrUe");//unboxing
		    System.out.println(result);
		    
		    //valuOf the methods ignores the case sensitivity
		    
		    boolean result1=!Boolean.valueOf("TrUe");//false
		    
		    //converting other data types to string
		    int totalNumber=100;
		    String str3=""+totalNumber;
		    
		    
		    
		    
		    
		    
		    
		    
		
		
	}

}
