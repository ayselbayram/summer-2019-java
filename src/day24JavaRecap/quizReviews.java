package day24JavaRecap;

public class quizReviews {
	public static void main(String[] args) {
		int x;
		int y=5;
		for(x=0;x<y;x++) {
			System.out.println((x+=2)  +" ");
			
		}
		
		int X=10;//10+0=10+1=10
		for(int j=0;j<=5;j++) {//012345
			X+=j;
		}System.out.println(X);
		String str="Java";
		String str2=new String(str);
		int count=10;
		
		do {//execute the statement first then check the condition
			count+=2;
		}
		while(str==str2);
		
		System.out.println(count);
			
		//assessment quiz6
		 int a=0;
		 while(a<=6) {
			 a+=2;
			 
		 }System.out.println(a);
		 
		 
		 int I;
		 int j=7;
		 for (I=0;I<j-1;I+=2) {
			  // 0  0<6   I++
			 System.out.print(I);
		 }
		 System.out.println();
		 
		 
		 for(int Y=0;Y<=4;) {
			 Y++;
			 System.out.print(Y);
			
		 }
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		}
	
		
	}


