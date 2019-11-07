package day29_ReturnMethods;

public class warmup {
	/*
	 * write a method that can find frequency of characters int String
	 * test(xxxyyyzzz)
	 * x3y3z3
	 */
	public static void main(String[] args) {
		frequency("aabbaabbbccccDD");//a5b5c5
		//letters:abcD
		
	}

	public static void frequency(String str) {
		
		
		String removeDuplicate="";//to store the non-duplicated values of str
		
			
		for(int i=0;i<str.length();i++) {
			if(!removeDuplicate.contains(str.substring(i,i+1))){
				removeDuplicate+=str.substring(i,i+1);
				
			
		}
		
		}System.out.println(removeDuplicate);//abcD
		
		String result="";//to store the expected result
		
		
		for(int j=0;j<removeDuplicate.length();j++) {
			int count=0;//count the numbers of appearance
		for(int i=0;i<str.length();i++ ) {
			if(str.substring(i,i+1).equals(removeDuplicate.substring(j,j+1))) {
				count++;
		}
		
	}result+=removeDuplicate.substring(j,j+1)+count;
}
		
		System.out.println(result);

//===========================================================


       String input="XXXYYYZZZ";
       //expected result:"X3Y3Z3
            //letters:XYZ
       
       String nonDuplicates="";//remove the duplicates and store them here
       for (int i=0;i<input.length();i++) {
    	   if(!nonDuplicates.contains(""+input.charAt(i))) {
    		   nonDuplicates+=""+input.charAt(i);
    	   }
       }System.out.println(nonDuplicates);

       
        String Result="";
        
        for(int j=0;j<nonDuplicates.length();j++) {
        	 int times=0;
        for(int i=0;i<input.length();i++) {
        	if(input.substring(i,i+1).equals(nonDuplicates.substring(j,j+1))) {
//        		if(input.charAt(i)==(nonDuplicates.charAt(j))){
//        			
//        		}// we can use char at like this
        		times++;
        	
        	}
        }Result+=nonDuplicates.substring(j,j+1)+times;
        //""+nonDuplicates.charAt(j)+times
     
}System.out.println(Result);
}
}		
		
		
		
		
		
	
		
		
		
	
	
	
	
	
		

