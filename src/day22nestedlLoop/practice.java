package day22nestedlLoop;

public class practice {
	public static void main(String[] args) {
		/*
		 *   *
		 *   **
		 *   ***
		 *   ****
		 *   *****
		 
		 */
	for(int j=1;j<=10;j++) {	//related with lines
		for(int i=1;i<=j;i++) {//related with starts
			System.out.print("*");
	    }
        System.out.println();
}
	System.out.println();
	
	for (int i=6;i>=1;i--) {
		for(int c=1;c<=i;c++) {
			System.out.print("*");
		}System.out.println();
	}
	System.out.println();
	
	
	
	int x=1;
	while(x<=6) {
		int y=1;
		while(y<=x) {
			System.out.print("*");
			
		y++;	
		}
		System.out.println();
		x++;
	}
	System.out.println();
}
}