package day15_Scanner_Stringclass;

public class warmUp {
	public static void main(String[] args) {
		
	
	/*
	 *write a java program that can convert numbers between 0-9 to letters else should be invalid
	 */
int num=-16;
String result="";
if(num>=0 && num<=9) {
	if(num==1) 
		result = "nine";
	else if(num==8)
		result="eight";
	else if(num==7)
		result="seven";
	else if(num==6)
		result="six";
	else if(num==5)
		result="five";
	else if(num==4)
		result="four";
	else if(num==3)
		result="three";
	else if (num==2)
		result="two";
	else if (num==1)
		result="one";
	else
		result="zero";	
	
}else {
	System.out.println("invalid");
	
}
System.out.println(result);


int n= 7;// in ternary amount of the ? needs to equal amount of the:
String result2="";
result2 = n==1 ? "one":n==2 ? "two"
		
		   :n==3 ? "three":n==4 ? "four"
						
		   :n==5 ? "fove":n==6 ? "six"
										
		   :n==7 ? "seven":n==8 ? "eight"
														
		    :n==9 ? "nine": n==0 ? "zero"
																		
			:"invalid";
System.out.println(result2);










}
}