package day09_Review;

public class review_operators {
	public static void main(String[] args) {
		/*
		 Relational Operators
		 
		 * >: greater than     only return true  when x > y
		 * >=: greater the or equal == returns true as long a s one of them qualified
		 * <: less than
		 * <=: less than or equal
		 * ==: equal   x==y true all the time
		 * !=: not equal   x != y   gives you rue
		  Logical Operators:
		  
		 * && and logic true; if both conditions are true
		 
		 * || or logic  true: as long as one condition is true
		 
		  
		 */
		
		System.out.println('z' > 'a'); //true
		System.out.println('z' >= 'a'); //true
	System.out.println('a' > 'A');// true because capital letters comes before lowercase in ASCII table means small
	
	 System.out.println('a' <='A'); // false
System.out.println('A' <= 'A');//true

System.out.println('A'<= 'a');// true

System.out.println(false==false);// true we need to have == here, = means assigning

System.out.println(!(false != true)); //false
byte x = 10;

int y = 10;
System.out.println(x==y);// true,  for the primitives, yes, primitives treated everything as value

System.out.println(true == true && false != true);
           //        true && true===>true
System.out.println(true != true || false == true );// false
             //        false || false===>false

System.out.println("monday"=="funday" || true == !false );// true
                    // false       ||  true=======> true






	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
