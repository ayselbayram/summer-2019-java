package day19_ForLoop;

public class Tasks {
	public static void main(String[] args) {
		/*
		 * tasl01;
		 */
		for (int i = 1; i<= 10 ;  i++) {//by changing condition we can have 100,1000 numbers square in one line
			System.out.println("the square of "+i+" is "+(i*i));
			
		}
		System.out.println();
		
		/*
		 * task2;pdf
		 */
		
		for (int a=1;a<=32;a++) {
			if(a%2==0) {
			System.out.print(a+" ");
		}
		
		
		}	
		System.out.println();
		/*
		 * task03pdf
		 */
		
		for (int b=1;b<=32;b++) {
			if(b%2==1) {
				System.out.print(b+" ");
			}
		}
		System.out.println();
		
		//task04
		
		String str="Ayfer";
		//          0123
		//reverse the str===avaJ
		
		String reverse=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
		
		
		
		String rev="";
		for (int c =str.length()-1; c>=0;c--)
		rev+=str.charAt(c);
		System.out.println(rev);
		
		
		
		
	}
	}

