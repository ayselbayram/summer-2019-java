package day27_customMethods;

public class VoidMethod2 {
	/*
	 * DECLERATION OF METHODS
		 * (public)=access-modifier,(static)=specifier,(void)=return type,(name())=methods name
		 *    public                      static          void                 methodname
		 *    
		 *     public static void main(String[] args){  
		 *     statement;
		 *     { 
		 *     calling methods=we call the methods by their methods name
	 */
	public static void main(String[] args) {
		myFirstMethod();
		/*methods is grouping a series of statements to perform task
		 * benefits:reusable,can avoid repeating the same set of statements.
		 */
		even1To100();
		
	}
	
	public static void even1To100() {
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				continue;
			
		}System.out.print(i+" ");
		}
	}
	
	public static void myFirstMethod() {
		//public static void main(String[] args){}//methods MUST be declared with in the class 
		//not within another methods
	//in order to use this method it was called	in main methods	by giving my methods name
		
		System.out.println("hello world");
		System.out.println("hello cybertek");
		System.out.println("hello filiz");
	
	/*methods with parameters:
	 * sometime methods need specific information from user to perform its task.
	 * then we need to declare the method with the parameters.
	 * Exp= Arrays.sort( array )
	 *    arrsy is the argument, and sort method is the functionality is to sort the given array
	 * 
	 *   int[] arr={1,2,3,4};
	 *   Arrays.sort( what do i need to sort(arr))
	 */
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
