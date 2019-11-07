package day39JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {
	/*
	 Decimal Formatter Class: presented ing "java.text" package
	 
	 */
	public static void main(String[] args) {
		DecimalFormat format=new DecimalFormat("0.00");
		double d= 23.65748575648;
		
		//format(double):format method of decimal:format the decimal and returns you a string value
		
		String str=format.format(d);
		System.out.println(str);//23.657=return you decimals 3 decimal after.
		
		double c=45.56748;
		
		System.out.println(format.format(c)+1);//45.57 because 3 number is greater than 5,returns string
		c=Double.parseDouble(format.format(c));
		System.out.println(c);//double 45.57
		
	}

}
