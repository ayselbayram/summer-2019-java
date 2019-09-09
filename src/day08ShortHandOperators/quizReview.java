package day08ShortHandOperators;

public class quizReview {
	public static void main(String[] args) {
		// Assessment quiz 2 review
		//quest1
		//we can cot asign larger number to smaller number
		
		//question2
		
		String str = "Result A" +1+2;
		System.out.println(str);
		//String str2 = "Result A  " +7*2;// we can not use -
		
		String str2 = "Result A  " +7*2;// why there is no error here because * comes first
		System.out.println(str2);
		
		String str3= "Result A" + 8%2;
		System.out.println(str3);
		
		System.out.println("Result A" + (1+2));// anything we print out at the console is txt
		System.out.println("Result A" +(1) + (2));
		
		//question4
		long L=30l;
		long l2= L;// we can assign long to long variable
		System.out.println(l2);
		 // question5
		double I, J,K =10;// only K initialized here
		//local variables
		//System.out.println(j); if we don't initialize them they give us compile error
		//I=J local variables must be initialized before used
		J=K;// we already defined K here that's why work
		
		
		
		//question8
		
		int a = 3, b=2;
		long c = (a +b) *2 / 3 %2;
		
		System.out.println(c);
		
		//question 10
		Long Lnum = 3_000L;
		
		double dNum = (float)Lnum;
		System.out.println(dNum);//3000.0
		int iNum = (short)dNum;
		System.out.println(iNum);// 3000
		System.out.println(iNum%1000);//0
		
		//question 11
		System.out.println(10/3);
		//question 12
		System.out.println(10.0/3);
		//question 13
		System.out.println((int)10.0/3);// because we casting it to int
		//question14
		//we can not cast string to primitive, compilation fails
		//question15
		int x = 10;
		int y = x++;
		System.out.println(y++ + " " + x++ + " " + y);// y 11 , x=12
		
		//                 10 +      +11         + 11
		
		System.out.println(x);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
