package day23Arrays;

import java.util.Scanner;

public class warmUp3 {
	public static void main(String[] args) {
		/*
		 * write a ptogram that can find the uniques characters of the string
		 * aabffj
		 * bj
		 * try to do it with substring??????
		 */
		String str="AAABCDEEFF";
		String unique="";//store the unique ones
		//any time the character is appear
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			
		for (int j=0;j<str.length();j++) {
			
			if(str.substring(j,j+1).equals(""+str.charAt(i))) {
				count++;                         //for this 'i' we need to give the outer loop
			}                   //if use substring str.substring(j,j+1)
			
		}
		if(count==1) {//if it is ==1 it is unique
			unique+=""+str.charAt(i);
		}
		}System.out.println(unique);
		
//		Scanner scan=new Scanner (System.in);
//		System.out.println("enter a sentence");
//		String word=scan.nextLine();
//		int lword=scan.nextInt();
		
		
		
		
		
		
	}

}
