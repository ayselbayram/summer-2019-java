package day28reviewArraysLoopsMethods;

public class warmup2 {
	/*   WRITE A METHOD THAT ACCEPST 3 PARAMETERS. 2 NUMBERS AND ONE OPERATIR
			 * IF(OPERATOR IS NOT BETWEEN[-,+,*,/,%]OUTPUT SHOULD BE INVALID OPERATOR.
			 * IF OPERAOT IS VALID THEN PRINT OUT THE RESSULT
			 * EXP=CALCULATE(10,2,"*")==>20
			 * */
	public static void main(String[] args) {
		calculate(10,2,"/");	
	}
	
	public static void calculate(int a,int b,String ope) {
		String result="";
		if(ope.equals("-")) {
			result+=(a-b);
		}else if(ope.equals("+")) {
			result+=(a+b);
		}else if(ope.equals("*")) {
			result+=(a*b);
			
		}else if(ope.equals("/")) {//fix the bug here 0
			result+=(a/b);
		}else if(ope.equals("%")) {
			result+=(a%b);
		}else {
			System.out.println("invalid operator");
		}
			
			
		
	
     String result2 ="";
     result2+=ope.equals("-") ? (a-b)
    		           :ope.equals("+") ? (a+b)
    		        		   :ope.equals("*") ? (a*b)
    		        				   :ope.equals("%") ? (a%b)
    		        						   :ope.equals("/") ? (a/b)
    		        								   :"invalid operator";
    		       System.out.println(result2);         
}
}