package day08ShortHandOperators;



public class shortHand {
	public static void main(String[] args) {
		/*
		 +=; addition assignment: x+=y====>x=x+y
		 -=: subtraction  assignment: x-=y====> x = x-y
		 x*=: multiplication assignment: x*=y===>x=x*y
		 /=; DIVISION ASSIGNMENT x/=y===> x=x/y
		 %=: remainder assignment x%=y===> x=x%y
		 
		  
		  
		 */
		int a = 9;
		//a =a +3; // a=12
		a +=3;
		
		System.out.println(a);
		int b = a+=5;//a=17
		//     b = 12 + ===== .12+5=17
		System.out.println(b);
		
		int c = a+=b; //a= 34 , b=17,c=34
		//       17 +=17 = 34
		System.out.println("c equal to " + c);
		System.out.println("a equal to " + a);
		System.out.println(" b equal to " + b);
		
		int d = a+=c;//d =68, a=68,c=34
		System.out.println("d equal to " + d);
		
		int e = (d+=b) *2;//d =85, b=17 e=170 c=34 a=68
		System.out.println(e);
		
		int f = b +=d *2;// b=  187 
		
		System.out.println(f);
		System.out.println(b);
		
		///-=:
		int g =101;
		int h = g-=1;// g=100, h=100
		System.out.println(g);
		System.out.println(h);
		
		int i = g+=h+5;//g=205, i 205
		System.out.println(i);
		System.out.println(g);
		
		int j = h+=g%i;
		//   j= 100 += 205%205
		//   j = 100+=0====>100
		System.out.println("j =" + j);// j = 100, h= 100
		System.out.println("h = " + h);
		
		int k = j-=h*2%5;//j=100 
		//  k = 100 -= 200%5
		//  k = 100-= 0
		// k= 100-0===0
		System.out.println("k = " + k);
		System.out.println("==============");
		
		// Multiplication Assignment
		
		int A = 100;
		A*=200;// A=20000 A=A*200
		System.out.println(A);
		
		int B =100;//B=1000
		B*= 100/10;
		// B*=100/10
		//10000/10==1000
		System.out.println(B);
		
		
		B*= B-1000;
		
		
		System.out.println("B is " + B);
		System.out.println("=========");
		
		//DIVISION ASSIGNMENT
		
		int C =1000;//C=200
		C/=5;//C=200
		System.out.println(C);
		
		int D =10;
		//C/= D-10;
		//System.out.println(C);
		C/=D +10;
		System.out.println("c is "+C);
		System.out.println("=============");
		//%Reaminder
		
		int z =10%2;// remainder is always positive number, 
		            //when we divide a number there will be either remainder or no remainder
		int E = 10;
		E%=2;//E = 0
		System.out.println("E is " + E);
		
		int F =100;
		F%=2;// ===>0 mean the number is even
		
		System.out.println(10.5%3);
		                 //10.5/3=3===remainder 10.5-3*3=1.5
		System.out.println(-100%3);
		
		System.out.println("==========");
		
		
		int M = 300;//j=300, k=10
		int K =10;
		
		M+= M %= K;
		
		//300+= M%K
		//300+= 300%10
		//300+= 0====> 300 + 0=300
		System.out.println("M is " + M);
		System.out.println("K is " + K);
				
		
		
				
		
		
		
		
				
		
		
		
	}

}
