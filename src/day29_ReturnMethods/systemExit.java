package day29_ReturnMethods;

public class systemExit {
	public static void main(String[] args) {
//		System.out.println(number());
		method1();
		System.out.println("done");
		System.out.println("completed");
		
	}
	
	public static void method1() {
		System.out.println("hello world");
		System.exit(0);//just execute the previous statement not in the main method in ones
	}
	
	
	
	
	public static int number() {
		if(true) {
			System.exit(0);// exits all the java execution//when 'false' never gets executed
		}
		return 5;
	}
	
	
	
	
	
	
	
	
	
	

}
