package day29_ReturnMethods;

public class warmup2 {
	public static void main(String[] args) {
		String str="AAAAABBCCEEEEDDDDD";// expected result=A2B2C2D2
      
		String expectedResult="";
		
		for(int j=0;j<str.length();j++) {
			int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if(!expectedResult.contains(""+str.charAt(j))){
				expectedResult+=""+str.charAt(j)+count;
		}
		str=str.replaceFirst(""+str.charAt(j), "");
	}System.out.println(expectedResult);

}
}