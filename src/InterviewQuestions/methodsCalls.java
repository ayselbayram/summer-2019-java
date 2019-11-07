package InterviewQuestions;

public class methodsCalls {
	/*
	 1-write a return method that can remove the duplicate from a string.
	   ex= removedup("AABBBCCCDD")==>ABC
	 2-write another return method that passes two string parameters, and return the number of occurance  and b
	    and return the number of apperances of b in a( how many times b occured in a)
	    exp=occured ("ABAB" , "A)==>2 times
	    
	 3- combine method 1 and 2 to write a method that can find the frequency of characters
	  exp;("AAABBBCCCDD")===>A3B3C3D2
	 */
	public static void main(String[] args) {
		frequency(str, a)
		
	}
	
	public static String revDuplicate(String str) {
		String duplicate="";
		
		for(int i=0;i<str.length();i++) {
			if(!duplicate.contains(str.substring(i,i+1))) {
				duplicate+=str.substring(i,i+1);
				
			}
			
		}return duplicate;
	}
	public static int occurance(String a, String b) {
		
		
		for(int j=0;j<b.length();j++) {
			int count=0;
			for(int i=0;j<a.length();i++) {
				if(a.substring(i,i+1).equals(""+b.charAt(j))){
					count++;
	}
			}return count;
		}
		return 0;
		
	}
	
	
	
	public static String frequency(String str, String a) {
		
		return occurance( str,revDuplicate(a));
		
		}
		
		
		
	}


