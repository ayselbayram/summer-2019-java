package InterviewQuestions;

import java.util.Arrays;

public class nigthwarmups {
	
	
	public static void main(String[] args) {
		sum3(12, 14 ,26)	;
		greatnum(60,78);
		calculateAge(1978);
		divisionwithout(10,0);
		sameletters("aaabccct","atttcbbbe");
		wordCount("I love my family that is how");
		mergeStrings("baris","filiz");
	}
     //1.
	public static void sum3(int a,int b,int c) {
		int Sum=0;
		Sum+=a+b+c;
		System.out.println(Sum);
	}
	//2.
	public static void greatnum(int x, int y) {
		int max=0;
		if(x>y) {
			max=x;
			
		}else {
			max=y;
		}System.out.println(max);
	}
	//3.
	public static void calculateAge(int year) {
		int currentdate=2019;
		int Age=currentdate-year;
		System.out.println(Age);
	}
	//4.
	
	public static void divisionwithout(int num1,int num2) {
		int count=0;
		if(num2>0) {
		while(num1>=num2) {
		
			num1-=num2;
			count++;
		
	    }System.out.println(count);
	
	}else{
		System.out.println("invalid entry");
	}
	}
	//5.
	
	public static void sameletters(String a,String b) {
		String a1="";
		String b1="";
		for(int i=0;i<a.length();i++) {
		if(!a1.contains(a.substring(i,i+1))){
			a1+=a.substring(i,i+1);
		}
		}
		for(int j=0;j<b.length();j++) {
			
			if(!b1.contains(b.substring(j,j+1))) {
				b1+=b.substring(j,j+1);
			}
		}
		
		char[]cha=a1.toCharArray();
		char[]chb=b1.toCharArray();
		
		Arrays.sort(cha);
		Arrays.sort(chb);
		
		if(Arrays.toString(cha).equals(Arrays.toString(chb))) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
	}
	//6
	public static void mergeStrings(String x,String y) {
		String result="";
		if(x.length()>y.length()) {
		for(int i=0;i<x.length();i++) {
//			for(int j=0;j<y.length();j++) {
			result+=x.substring(i,i+1).concat(y.substring(i,i+1));
			System.out.println(result);
		}
			
			
		}	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	//7
	public static void wordCount(String j) {
		int wordcount=0;
		for(int i=0;i<j.length();i++) {
			if(j.substring(i,i+1).equals(" "))
		    wordcount++;
	}if (wordcount>=0) {
		wordcount+=1;
		
	}System.out.println(wordcount);
	
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
}
