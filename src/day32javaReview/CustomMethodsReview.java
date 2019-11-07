package day32javaReview;



public class CustomMethodsReview {
	public static void main(String[] args) {
		for (int i=0;i<5;i++) {
		method1();
		}
		even1to100();
		
		String str1="filiz";
		reversestr(str1);
		reversestr("ipek");
		
		//return
		byte result=(byte)largestNum(10,20);//normally int we cast it to byte
		System.out.println(result);//max num
		String str="Baris";
		reverse(str);
		System.out.println(reverse(str));
		
	}
		/*
		 decleration of method;
		      access modifier-specifier-return type-methodname(parameter){
		      method body
		      
		      Access Modifier:public
		      specifier:static
		      return type: void:method does not return any value
		                   all primitives and nonprimitives:must return a value,and value must match the return type
		      method name: any name
		      parameter: all data type
		      
		  
		 */
		
	
	   //return type:
	
	 public static String reverse(String str) {
		 String str1="";
		 for(int i=str.length()-1;i>=0;i--) {
			str1+=""+str.charAt(i);
		 }
		return str1; 
	 }
	   
	 public static int largestNum(int a, int b) {
		 if(a>b) {
		return a;	 
		 }else {
			 return b;
		 }
	 }
	
	
	
		//void
		
		public static void method1() {
			System.out.println("Hello World");
			System.out.println("Hello Cybertek");
			System.out.println("Hello Batch12");
			
		}
		
		public static void even1to100() {
			for(int i=0;i<=10;i++) {
				if(i%2==1) {
					continue;
					
				}System.out.print(i+" ");
			}System.out.println();
					
				}
		
		
		//methods with argument;
		//parameter means method requires extra informations
		
		public static void reversestr(String str) {
			for (int i=str.length()-1;i>=0;i--) {
				System.out.println(str.charAt(i));
			}
			
		}
		
		public static void print(String str) {
			System.out.println(str);
		}
		
		
		
		
		
		
			
		}
		
		
	


