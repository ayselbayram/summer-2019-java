package day08ShortHandOperators;

public class relationalOperators {
	public static void main(String[] args) {
		/*Relational Operators; return boolean expression
		 * >; greater than
		 * >=: greater then or equal
		 * <  ; less than
		 * <= : less than or equal
		 * == : equal
		 * != : not equal
		 * 
		 * = : assign
		 * !: exclamation mark means logical opposite, not
		 * 
		 
		 */
		
		System.out.println(10>9);// 
		boolean resultA= 10>9;
		System.out.println(resultA);
		
		System.out.println(10>=9);// greater or equal
		boolean resultB= 10>=9;
		System.out.println(resultB);
		boolean resultC = 10<=9;
		System.out.println(resultC);//false
		
		boolean resultD = 1100<1200;//less than
		System.out.println(resultD);//true
		
		boolean resultE= 1000<1000;
		System.out.println(resultE);//false
		
		boolean resultF= 1000<=1000;
		System.out.println(resultF);//true
		
		//== equal
		
		boolean resultG= 19==19;
		System.out.println(resultG);//true
		
		//!=  represent not equal
		
		boolean resultH= 20 !=20;
		System.out.println(resultH);//false
		
		boolean A = true== !false;
		System.out.println(A);//true
		
		boolean B =!false;
		System.out.println(B);//true
		
		/*
		 in java true ==true, false==false
		 !false = true
		 !true=false
		 so therefore: !false != !true;
		 true = !false
		  
		  
		 */
		boolean S= !false != !true;
		
		System.out.println("S is " +S);//true
		boolean X = true == !false;
		System.out.println(X);
		
		boolean V = !(!false);//true
		System.out.println(V);
		
		System.out.println("===========");
		boolean F = 10>9==9<10;
		System.out.println(F);//!false=true
		
		//practice !(not)
		boolean g = false;
		System.out.println(!g);//true because of the !
		System.out.println(!true==false);//true
		
		boolean h = "Batch 12"== "Batch13";//false
		System.out.println(h);
		
		System.out.println("batch12"=="Batch12");//false java is case sensitive
		
		System.out.println("cybertek " != "club");//true
		System.out.println("kuzzat"=="bad guy");//false
		System.out.println("Asiistant teachers in class" == "awesome");//false
		
		
		
		
		
		
		
		
		
		
		
				
		
		
	}

}
