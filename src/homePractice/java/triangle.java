package homePractice.java;

public class triangle {
	public static void main(String[] args) {
		int a,b,c;
		a= 35; b=-10; c= 100;
		boolean valid = (a +b+c)==180;
		boolean valid1 = a>0&&b>0&&c>0;
		boolean valid3 = valid1&&valid;
		if (valid3) {
			System.out.println("it is an triangle");
		}
		else {
			System.out.println(" do some math");
		}
		
		
		
		
	}
}
		
		
	


