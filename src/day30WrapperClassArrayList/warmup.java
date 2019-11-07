package day30WrapperClassArrayList;

public class warmup {
	
	/*
	 1. write a return method that accepts a string and remove duplicate values from the string
	 2. find the unique values of the string
	 */
public static void main(String[] args) {
	//warmUp1
	String str="AABFGDHJRYYYHDGGFHxm";
	String dup=duplicate(str);
	System.out.println(dup);
	//warmUp2
	unique(str);
	System.out.println(unique(str));
		
	}

    //warmUp2
    public static String unique (String a) {
    	String result="";//to store unique characters
    	for(int j=0;j<a.length();j++) {
    	int count=0;//count of appearance
    	for(int i=0;i<a.length();i++) {
    		
    		if(a.charAt(i)==a.charAt(j)) {
    			count++;
    		}
    	}if(count==1) {
    		result+=""+a.charAt(j);
    	}
    }return result;
    }

	//warmUp1
	public static String duplicate(String a) {
		String duplicate="";
		for(int i=0;i<a.length();i++) {
			if(!duplicate.contains(""+a.charAt(i))) {
				duplicate+=""+a.charAt(i);
			}
		}return duplicate;
	}
	
	

}
