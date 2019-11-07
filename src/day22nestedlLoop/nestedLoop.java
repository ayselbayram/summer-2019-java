package day22nestedlLoop;

public class nestedLoop {
	public static void main(String[] args) {
		/*
		 * nested loop:loop inside another loop
		 * 
		 * for(){
		 *        for(){
		 *        syso "hello"
		 * }
		 * } "hello" will be display 5*5=25 times
		 * when do we use nested loop;when we need to repeat some steps inside loops body.
		 */
		
		
		
			  /*
			  * 12345 
			  * 12345 
			  * 12345 
			  * 12345 
			  * 12345 
			  */
		for (int z=1;z<5;z++) {
			
		
		   for(int i =1 ;i<=5; i++) {
			System.out.print(i);
		  }
		System.out.println();
		}
		
		//exp2
		
		/*
		 * print"*****
		 *       *****
		 *       *****
		 *       *****
		 *       *****
		 */
		
		
	int z=5;	
	while(z>0)	{
		int i= 1;
		while(i<=5) {
			System.out.print("*");
			i++;
			
		}
		System.out.println();
		
		z--;
	}
	
	// exp3
	/*
	 *   *
	 *   **
	 *   ***
	 *   ****
	 *   *****
	 *   ******
	 *   *******
	 int i= 1;
	 * 
	 * 
	 */
	System.out.println("\n");
	
	for(int i=1;i<=7;i++) {
		
		for (int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();
			
	}
	//same problrm with while loop
	
	int a=1;
	while(a<=7) {
		int b=1;
		while(b<=a) {
			System.out.print("%");
			
			b++;
		}System.out.println();
		
		a++;
	}
	
	

}
}