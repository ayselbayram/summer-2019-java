package day39JavaReview;

public class constructors {
	 public constructors() {
//		 this("hello");
		 System.out.print("Erhan ");
	 }
	 public constructors(int a) {
		 this();//erhan
		 System.out.print("Ali ");
	 }
	 public constructors(double a) {
		 this(100);//erhan ali
		 System.out.print("Shawkrat ");
		 //this(); must be the first step.
	 }
	 public constructors(boolean a) {
		 this(2.5);
		 System.out.print("Dinara ");
		 
	 }
	 public constructors(String a) {//erhan ali seyfo
		 this(10);
		 System.out.print("Seyfo ");
		 
	 }
	 
	 public constructors(byte a) {//we need to explicit casting while creating obj for exwcution
		 //because java takes number default as int data type
		 this("hello");
		 System.out.print("Sabir ");
	 }
	public static void main(String[] args) {
		constructors obj=new constructors((byte)100);
		
	}
	

}
