package day43JavaRecap;


public class practice2 {
	
	public static void main(String[] args) {
		
		staticKeyword1.printName();//static method cen ba called through the class name
		staticKeyword1 obj1=new staticKeyword1();//inorder to call the insta method I need to create an object
		System.out.println(obj1.InsName);//Filiz
		obj1.printName2();
		
		
		practice2.printName();//Semra
		printName();//Semra
		
		//calling static variable
		
		System.out.println(staticKeyword1.StaName);
		System.out.println(obj1.InsName);//Filiz, can not be called throguh the class
		
		
		
		
		
	}
	
	public  static void printName() {
		System.out.println("Semra");
	}
	

}
