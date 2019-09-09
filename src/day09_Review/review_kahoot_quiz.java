package day09_Review;

public class review_kahoot_quiz {
public static void main(String[] args) {
	
// question2
	boolean result = !false != ("Batch12" != "best batch ever");
	            //    true  != true ====> false
	System.out.println(result);
	
	// question3
	int a =100;
			int b = a+=100/20;//105 // a=105, b=105
			System.out.println(a);
			
			System.out.println(105.1>105);// false
			
			//question 5
			boolean A = 128>'9' || 128==127;
			       //  128>127 || 128 == 127
			       //   true    ||  false====> true
			System.out.println("A is " + A);
			
			//question 6
			boolean stupidOperators;
			stupidOperators=  10>=20 &&'a'> 'b';
			               //    false && false====> false
			System.out.println(stupidOperators);
			//question 7
			
			int x = 9999999;
			int y = 10;
			System.out.println(x * y / 10 % x);
			//                  x and 10 has the same value ==> x%x==>0
			
			//question 9
			
			int z = 100;
			//System.out.println("z > 100 is" + H ); in java we need to define H before print method
			boolean H = z>100; //false
			
			//question 10
			System.out.println(5 + 7+ "8");//128
			System.out.println("8" + 5 +7);//857
			System.out.println( 5 + 7 + "8" + 5 +7);//12857
			System.out.println(5 + 7 + "8" + (5 +7));//12812
			
			//question 11
			boolean result1 = 1 + 11 + "3" == "123";
			System.out.println(result1);
			//question 12
			 int num = 100;
			 num += 300; //num=400
			 System.out.println(num ++ + " " + num);
			                    // 400 "  " 401===> 400  401
			 //question 14
			 System.out.println(( 10 * 2) / ( 5 * 4) * 1000 / 10 % 100);
			                              //1          * 1000 / 10 % 100
			                              // 100 %100===>0
			 

					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
}
}
