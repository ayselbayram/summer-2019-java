package day08ShortHandOperators;

public class logicalOperators {
	public static void main(String[] args) {
		
	
	/*
	 && : And logic ==> when you give 2 condition if both of the are true will return true otherwise it will give you false 
	  exp;                true && true==true
	                      true && false==false
	                      false && false == false
	  
	 || ; or logic:  true || false===>true
	                 true || true ====> true
	                 false ||false ===> false // if both conditions false will return true
	                
	 */

	boolean ResultA = 9==0 && "Muhtar"=="good";
	                 //false      false=====>false
	System.out.println(ResultA);
	
	boolean ResultB = 8>5 && 7== (8-2+1);
	               //true       true ===> true
	System.out.println(ResultB);
	
	boolean ResultC = !false != true && !false ==!(!true);
	             // true != true &&  true ==! false
	          //        false  &&  true====>false
	System.out.println(ResultC);
	System.out.println("=========");
	//|| or logic
	
	boolean  A = "Monday"=="Funday" || 6==6;
	//             false   ||      true  =====> true
	System.out.println(A);
	
	boolean B = true || false;
	System.out.println(B);
	
	boolean C = !(8>5) || !("today" != "friday");
			//  !true    || ! true
			// false|| false
	System.out.println(C);
	System.out.println("=============");
	
	//|| &&
	boolean D = true && true || false;
	        //     true   || false ====>true
	System.out.println(D);
	
	boolean E = !(7>5 && 6 !=5) && (9>5 || 10>4); // gruoping calculate first
	         // ! true    && true 
	     //      false  && true====> false
	System.out.println(E);
	 
	
	
	
	
	
	
	
		
}
}