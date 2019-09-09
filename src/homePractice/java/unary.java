package homePractice.java;

public class unary {
	public static void main(String[] args) {
		
	
	int num1 = 100;
	
	System.out.println(++num1);//num1+1=101
	int num2= ++num1;
	System.out.println(num2);
	
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
	
	
	  int z = 100;
	  --z;
	  // i decresed it here and below 2 times
	  System.out.println(--z);
	  System.out.println(z);
	
	  int Y= 95;
	  System.out.println(Y--);//95
	  System.out.println(Y);
	  
	  short Snum =4; //3
	  int R = Snum*4-Snum--;
	  //       16- 4=12
	  System.out.println(R);
	  System.out.println(Snum);
	  
	  int p = 4;
	  int r = p*4-p++;
	  System.out.println(r);
	  System.out.println(p);
	  
	  System.out.println("=============");
	  
	  
	  
	
	
	
}
}