package day34ArrayListMethodsAndConstructors;

public class CunstroctorsPractice {

		//public sort(){} in construstor the method naem MUst be same with the classname
	
	//default constructor
		 public CunstroctorsPractice(int a) {
			 System.out.println("hi i am constructor witj parameter"+a);
			 

	}
		 
		 public static void main(String[] args) {
//			 CunstroctorsPractice obj=new CunstroctorsPractice(); does not exist
			 //default (no-arg) constructor given by default, when there is no other constructor
			 
			 //CunstroctorsPractice obj2= new CunstroctorsPractice("Hello");
			 //we do not have this constructor that passess String parameter
			 
			 CunstroctorsPractice obj3 = new CunstroctorsPractice(10);
			 //consytructors execution ALWAYS depends on creation of object
			 method2();
		}
		 public static void method2() {
			 CunstroctorsPractice obj = new CunstroctorsPractice(10);
			 method1();
			 
		 }
		 public static void method1() {
			 System.out.println("method 1");
		 }
		 
		 
	}
	
	 
