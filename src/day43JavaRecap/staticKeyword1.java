package day43JavaRecap;

public class staticKeyword1 {
	//objects come from class so, objects accepts all the class members
	public static String StaName="Nurzat";
	public String InsName="Filiz";
	
	public static void printName() {
		staticKeyword1 obj=new staticKeyword1();
		//System.out.println(InsName);//static only accepst static
		System.out.println(obj.InsName);
		System.out.println(StaName);//class member
		
		
	}
	
	public void printName2() {
		System.out.println(InsName);//insta variable
		System.out.println(StaName);//static variable
	}
	public static void main(String[] args) {
		System.out.println(StaName);
		printName();
		staticKeyword1 obj=new staticKeyword1();
		//System.out.println(InsName);//static only accepst static
		System.out.println(obj.InsName);
	}
	
	
	
	
	
	
	
	
	

}
