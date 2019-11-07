package day26eachLoop;

import java.util.Arrays;
import java.util.TreeSet;

public class warmup1 {
	public static void main(String[] args) {
		/*
		 * check 2 string are build out of the same letters str1="aaccb"; str2="cab";
		 * output=true useArray and Array methods
		 */

		String a = "aabbc", b = "cabccaabaad";
		// a=abc b=cab//remove the duplicate

		String a1 = "";// store all the nonduplicated values from a

		
			for (int i = 0; i < a.length(); i++) {

				if (!a1.contains(a.substring(i, i + 1))) {
					a1 += a.substring(i, i + 1);

				}

			}System.out.println(a1);
		

	
	
	//b = "cabccaabaa";  remove duplicates
	String b1="";
	
	
	  for(int i=0;i<b.length();i++) {
		  if(!b1.contains(b.substring(i,i+1))) {
			          // (""+b.charAt(i))//gives same result
			  b1+=b.substring(i,i+1);
		  }
	
	  }System.out.println(b1);
	  
	  
	 char[] ch1=a1.toCharArray();
	 System.out.println(Arrays.toString(ch1));
	 
	 char [] ch2=b1.toCharArray();
	 System.out.println(Arrays.toString(ch2));
	 System.out.println("+++++++++++++++");
	 
	 Arrays.sort(ch1);
	 Arrays.sort(ch2);
	 
	 
	 System.out.println(Arrays.toString(ch1));
	 System.out.println(Arrays.toString(ch2));
	 
	 String str1=Arrays.toString(ch1);
	 String str2=Arrays.toString(ch2);
	 if(str1.equals(str2)){
		 System.out.println("true");
	 }else {
		 System.out.println("false");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  


}
}