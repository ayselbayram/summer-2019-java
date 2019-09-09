package day07_unary_shorthand;

public class UnaryOperators {
	public static void main(String[] args) {
		/*
		 +: positive
		 -: negative
		 ++: Increment
		 --: decrement
		 +_===>-
		 --===>+
		++====>=
		 
		 */
		int a = 10;
		int b = -10;
		System.out.println(b);
		
		int c = +b;
		System.out.println(c);
		int d = -c;
		System.out.println(d);

		/*INCREMENT
		 *pre increment; operator is placed before the variable
		 *INCREASES THE VALUE BY 1 IMMEDIATELY
		 * POST INCREMENT; OPERATORS PLACED THE VALUE AFTER THE ARIABLE
		 * 
		 * 
		 */
		int num1 = 100;
		
		System.out.println(++num1);//num1+1=101
		int num2= ++num1;
		System.out.println(num2);
		
		//post increment: operates places after the variable
		// and it will pass the current value first then second print it will be the icremented one
		
		int Intnum=100;
		
		System.out.println(Intnum ++);//100
		System.out.println(Intnum );//101);
		
		int Intnum2= Intnum++;
		System.out.println(Intnum2);
		System.out.println(Intnum);
		
		System.out.println("====================");
		//post examples
		
		int x= 100;
		int y = x++-1;
		//y=100-1;
		
		System.out.println(y);
		System.out.println("====================");
		
		// decrement: 
		 //  pre decrement: operator is place before the variable immediately
		  // post decrement; operator place after the variable. Pass the current value first
		  
		  int z = 100;
		  --z;// i decresed it here and below 2 times
		  System.out.println(--z);
		  System.out.println(z);
		  
		  int Y= 95;
		  System.out.println(Y--);//95
		  System.out.println(Y);//94, second time decrease the value
		  
		  int T = 25;
		  System.out.println(++T);//26
		  System.out.println(--T);//25
		  System.out.println(T--);
		  System.out.println(T);
		  
		  int p = 50;
		  p= --p + p++ + p-- + p++;
		  // 49 + 49 + 50 + 49
		  System.out.println(p);
		  
		  //exmp
		  
		  short Snum =4; //3
		  int R = Snum*4-Snum--;
		  //       16- 4=12
		  System.out.println(R);
		  System.out.println(Snum);
		  
		  int w=1;
		  w=-w-- + w++ / -w-- * --w;
		  // post   post pre  pre
		  // -1  +  0  / -1  *  -1
		  // -1 +   0  * -1
		  //-1 +  0
		  //-1
		  System.out.println(w);
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		
	}

}
