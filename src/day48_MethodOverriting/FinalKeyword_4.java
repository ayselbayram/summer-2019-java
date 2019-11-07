package day48_MethodOverriting;

class Credentials{
	private final String UserName="Cybertek";
	private final String Password="1234";
	
	//we can not declare setter method for final variable
	//final variables can not be re-assigned
	/*public void setUserName(String Username) {
		this.UserName=UserName;
	}*/
	//since getter is just for read we can decleare getter method for final variables
	public String getUserName() {
		return UserName;
	}
}
class Holly{
	 public  final void  printName() {
		System.out.println("Erhan");
	}
}

public class FinalKeyword_4 extends Holly{
	//override
	//@Override
	/*public void printName() {
		System.out.println("Medina");
		final methods can nt be override
	}*/
	
	final int AGE=27;
	public final static void main(String[] args) {
		final String SSN="123456";
		//SSN="654321";//final variables constant and can not be reassinged
		
		final String DOB="04/08/1978";
		
		FinalKeyword_4 obj=new FinalKeyword_4();
		System.out.println(obj.AGE);
	}
	
	//overloading
	//we can overload the final methods
	public final static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	//we can apply final to main method

}
