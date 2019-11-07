package day37ClassandObject;

public class dogObjects {
	public static void main(String[] args) {
		dog dog1=new dog();
		dog1.Breed="Husky";
		dog1.Size="Small";
		dog1.Color="Gray and White";
		dog1.Name="Holly";
		dog1.Gender='F';
		dog1.Age=25;
		dog1.Food="kabap";
		dog1.Toy="dog toys";
		
		System.out.println(dog1.Breed);
		System.out.println(dog1.Color);
		System.out.println(dog1.Color);
		System.out.println(dog1.Name);
		System.out.println(dog1.Gender);
		System.out.println(dog1.Age);
		
		System.out.println("+++++++++++++++++++++++++=");
		
		dog1.getInfo();
		
		dog dog2=new dog();
		dog2.Breed="Husky";
		dog2.Name="Lyka";
		dog2.Color="Gray";
		dog2.Age=6;
		dog2.Size="Medium";
		dog2.Gender='M';
		dog2.Food="sushi";
		dog2.Toy="dog toys";
		
		dog2.getInfo();
		
		dog1.eat();
		dog2.eat();
		
		dog1.play();
		dog2.play();
		
		String str=new String ("hello");
		str.toLowerCase();//called instance classmethods
		
		
		
		/*
		 Assignment: create a custom class for employees
		     attributes: employeename, employeeID, jobTitle, SSN,gender,salary,
		     
		     actions: getInfo, more actions pls
		 */
		
		
		
		
		
	}

}
