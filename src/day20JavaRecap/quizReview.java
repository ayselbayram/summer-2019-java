package day20JavaRecap;

public class quizReview {
public static void main(String[] args) {
	//q1
	String str="Hello wordl";
	//          012345678910
	System.out.println(str.substring(0,5));
	System.out.println(str.substring(10%2*3/2,10*2/4));
	//there are 3 more options for his question from kahoot, all of them are correct
	//= is assigned operator when you assign in syso it will chenge the assignemt
	//System.out.println(a+=1,      a-=5
	            //a=2     a=2+1=3   a=5-3=2// now a is 2
	//q3 equals and equalsIgnoreCase both of them are not memory sensitive
	String s1="Java";
	String s2="java";
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equalsIgnoreCase(s2));//true
	//q4
	String s3=" ";
	System.out.println(s3.trim().isEmpty());//true
	                    //""   
	//q5
	String w1="java";
	String w2=new String("java");
	System.out.print(s1==s2);//false
	System.out.print(" "+w1.equals(w2));//true,is check face value and case
	
	System.out.println();
	System.out.println("========");
	
	//q6
	String B1="Cybertek";
	String B2=new String(B1);
	String B3=B2;//because we did not give the key word b3 and b2 are in the same memory location in heap
	System.out.println("q6: "+(B3==B2));//true
	
	//q10
	int z=5;
	
	for(int i=5; i>0;i--) {
		z+=i;
	}
	System.out.println("q10: "+z);
	
	//q11
	/*
	 * in for loop we supposed to have 
	 * for(initialization;condition;iterator)
	 */
	int a=0;
	for( a =5; a<10;) {// a=5,7,9
		a+=2;//a=11
	}
	System.out.println("a is:"+a);
	
	//example;
	
	for(int j=1;j<=5;) {//j:1 2 3 4 
		++j;//2 3 4 5
	System.out.print(j+" ");
	}
	
	
	for(int j=1;j<=5;) {
		++j;
	System.out.print(j+" ");
	}
	
		
	
	
	
	
	
	
	
	
}
}
