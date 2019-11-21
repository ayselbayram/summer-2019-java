package day43JavaRecap;
import day44_AccessModifiers.defaultAccessModifierPractice;


public class cridentials6 {
	

	private  String UserName="Ibrahim";
	private String Password="123";
	
	public String getUserName() {
		return UserName;
	}
	
	public String getPassword() {
	    return Password;
	}
	
	public void setUserName(String UserName) {
		this.UserName=UserName;
	}
	public void setPassword(String Password) {
		this.Password=Password;
		
	}
    public static void main(String[] args) {
    	defaultAccessModifierPractice obj=new defaultAccessModifierPractice();
    	System.out.println(obj.namePublic);
    	
    	
}
}