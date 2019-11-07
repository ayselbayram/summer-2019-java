package day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials{
	 private String userName;//admin
	 private String Password;//123
	 
	 public credentials() {//initialize default value fro variablae, constructor gets executed when we create obj
		 setuserName("Admin");
		 setPassword("123");
		 
	 }
	 
	 
	 public String getuserName() {
		 return userName;
	 }
	 
	 public String getPassword() {
		 return Password;
	 }
	 
	 public void setuserName(String userName) {
		 this.userName=userName;
	 }
	 
	 public void setPassword(String Password) {
		 this.Password=Password;
	 }
	 
	 public void setcredentials(String userName, String Password) {
		 //this.userName=userName;
		 //this.Password=Password;
		 setuserName(userName);
		 setPassword(Password);
		 
	 }
	 
	 public void getInfo() {
		 System.out.println("username; "+getuserName());
		 System.out.println("password: "+getPassword());
		 
	 }
	 
	
}

public class EncupsulationsReview {
	public static void main(String[] args) {
		//1.object
		credentials obj=new credentials();//obj is credentials object
		//obj.username="Zlfy";//private access
		//obj.password="1234";//private access
		obj.setcredentials("Zulfiye", "2767");
		
		System.out.println("user name: "+obj.getuserName());
		System.out.println("password: "+obj.getPassword());
		
		
		//2.object
		credentials Nurzat=new credentials();
		           Nurzat.setuserName("Nurzat 9876");
		           Nurzat.setPassword("nuri345");
		
		System.out.println("user name: "+Nurzat.getuserName());
		System.out.println("password: "+Nurzat.getPassword());
		
		credentials Seyfo=new credentials();
		Seyfo.setcredentials("Seyfo", "456");
		Seyfo.setPassword("789");//re-initialize
		System.out.println("username: "+Seyfo.getuserName());
		System.out.println("Password: "+Seyfo.getPassword());
		System.out.println("================================");
		Seyfo.getInfo();
		
		credentials [] users= {obj, Nurzat,Seyfo};
		
		users[0].getInfo();
		users[1].getInfo();
		users[2].getInfo();
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		ArrayList<credentials> list=new ArrayList<>(Arrays.asList(users));
		list.get(0).getInfo();
		list.get(1).getInfo();
		list.get(2).getInfo();
		
		//or for each
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&7");
		
		for(credentials each:list) {
		    each.getInfo();
		}
		
		//obj,Nurzat,Seyfo  are credentials class objects,
		//that is wht we can create array and arraylist from them
	}

}
