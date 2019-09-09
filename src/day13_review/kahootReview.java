package day13_review;

public class kahootReview {
	public static void main(String[] args) {
		
		//Q1
		if (!true != !false) {
		//   false != true===>true
			System.out.println("Cybertek");
		}else {
			System.out.println("Batch12");
		}
		//Q2
		boolean resultA = 9>=9 || 10<=10;
				    //  true  || true===>true
		boolean	resultB = 'A' >=128 && 'B'<128;
				         // false && true ===>false
		if (resultA) {
			if(resultB) {
				System.out.println(resultA);
			}
				else {
					System.out.println(resultB);
				}
			}
		
		//Q3 in multibranch statement we dont need ELSE block,
		// the ELSE block can not be declared independetly, IF is mandatory
		if(true) {
			
		}else if (false) {
			
		}
		//Q4
		int num1 = 9;
		if (++num1 < 10) {
			//10<9==>false
			
			System.out.println(num1 +"Hello World");
			
		}else {
			System.out.println(num1 + " Hello universe ");
		}
		//Q5
		int x =1;
		int y =0;
		if(x++ > ++y) {
		// 1>     1===>false
			System.out.println("Hello");
		}else {
			System.out.print("Welcome");
		}
			
		System.out.println("log " + x+ ":" + y);	
		                         // 2        1
		//7
		boolean result = true;
		int N =100;
		if (true) {
			System.out.println("one");
		}
		if(true ) {
			System.out.println("two");
		}
		if (true) {
			System.out.println("three");
		}
		// still Q7
		boolean X =true;
				int B =100;
		
				if(X) {
					B/=10;//10
					
					X = !X;// ==false
					
				}
				if (X) {//false
					B*=2;//N==10
				}
				else {
					B-=5;//N = 10-5=5
					System.out.println(B);
				}
			//Q8
				boolean A= true;
						if (A==false) {
							//true==false===false
							
					    System.out.println("one");
							
						}
						else if (A==false!=true) {
							// true==false != true
							//false!=true==>true
							System.out.println("Two");
						}
						//rest of the else if not important any more 
						
	// Q10
		int n1 ='B';
		if (n1 >128 || n1 <= 129) {
			 //false|| true== >true
			System.out.println('B');
		}else
		System.out.println('A');
	                    

		
		
		
		
		
		
		
		}
		
		
		
		
		
		
	}


