package day43JavaRecap;

public class LogIn7 {
	public static void main(String[] args) {
		cridentials6 obj=new cridentials6();
//		obj.userName="Fatih";
//		obj.password="123";
//		System.out.println(obj.userName);
//		System.out.println(obj.password); instance variables are private now
		
		//to read the private data
		System.out.println( obj.getUserName() );//to read
		System.out.println( obj.getPassword() );
		//to read
		cridentials6 fatih=new cridentials6();
		
		
		//modify the private data through the setter
		
		fatih.setUserName("Fatih");
		fatih.setPassword("354657");
		System.out.println(fatih.getUserName());
		System.out.println(fatih.getPassword());
		
		
		
		
		
		
		
		
		
	}

}
