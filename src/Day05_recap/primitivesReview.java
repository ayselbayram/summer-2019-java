package Day05_recap;

public class primitivesReview {
/*
 Primitves: byte: only tales whole numbers
            short:only tales whole numbers
            int:only tales whole numbers, used more often
            lon:g:only tales whole numbers
            float: can take decimals and whole numbers. (must have F when take decimals at the end)
            double: can take decimals and whole numbers
            boolean:can take true and false boolean expressions
            char:can take single characters within single quotes'' also takes numbers
           java application are executed from top to bottom. 
           I need to identify the variable before the print statement 
           
 */
	public static void main(String[] args) {
		byte bNum = 127;// range is -128 to 127, no decimals
		short sNUM = 1000; // takes whole number no decimal
		//we can not assign short to byte because short is greater than byte, 
		sNUM = bNum;
		System.out.println(sNUM);
		
		int intNum = 100;
		System.out.println(intNum);
		
		short ShortNum2 = 105;
				intNum = ShortNum2;
				System.out.println(intNum);
				System.out.println("==============");
				
				long LongNum = 100l;
				long LongNum2 = 100l;
				
				float floatNum = 10.5f;// if it is decimal we have to have f, 
				//all of the whole number primitives can initialize to float
				float floatNum2 = 300;// if it is not decimal we don't need to give f
				
				double doubleNum = 10l; // I can assign byte, short,int,long,float to double
				// double an int are going to be used more often
				
			boolean result = true; // I can also give some expressions which is equal true or false
				boolean result2 = false;// like 9>3=>true, 5>8=> false
				
				//char  takes character within single quotes, only 1 character
				char character1 = 'A';
						System.out.println(character1);
						char char1 = 125; // all the characters have rapresentetive numbers;
						System.out.println(char1);
						
						int num3 = 'B';
						System.out.println(num3);
						
						float fnum = 'B';
				        System.out.println(fnum);
				        
				         byte byteNum = 'B';
				         
				         System.out.println(byteNum);
				         
				         //practices:
				         /*
				          8: byte,short,int,long,float,double, char
				          9: byte,short,int,long,float,double, char
				          #: char
				          @: char
				          8.5: float, double
				          5.5f: float, double
				          128: byte,short,int,long,float,double, char
				          40000: 
				          9>10: boolean
				          true: blooean
				          false: boolean
				          
				          */
				         
				         
								
								
						
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
	}

}
