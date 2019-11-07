package day27_customMethods;

public class warmup {
	public static void main(String[] args) {
		/*
		 * create anArray called number with size 100
		 * assign 1-100 to the array index
		 * user for each loop to print out all even numbers
		 * must use continue statement
		 */
		
		int [] numbers=new int[100];
		
		for(int i=1;i<=numbers.length;i++) {
			
				numbers[i-1]=i;
			}
			
		
		
	for(int each: numbers) {
			if(each%2!=0) {//skip the odd numbers
				continue;
			
	}System.out.println(each);
	}
}
}