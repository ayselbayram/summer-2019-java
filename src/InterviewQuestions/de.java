package InterviewQuestions;

public class de {
	public static void main(String[] args) {
		String x="barisinida",y="filiz";
		String result="";
		if(x.length()>y.length()) {
		for(int i=0;i<x.length();i++) {
			for(int j=0;j<y.length();j++) {
			result+=x.substring(i,i+1).concat(y.substring(j,j+1));
			
		}
			
			
		}	System.out.println(result);
		
		
		
		
		}	
		
	}

}
