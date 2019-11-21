package day44_AccessModifiers;

//import static day44_AccessModifiers.TestData4.Name;
//              packagename     //class name//staticname
//import the static variable Name 
//import static day44_AccessModifiers.TestData4.ID;
import static day44_AccessModifiers.TestData4.*;//import all the static members,Name,ID
//import static day44_AccessModifiers.TestData4.printHello;

public class Test5 {
	public static String Name="Muhtar";
	public static void main(String[] args) {
		System.out.println(Name); //if i dont import tjis static variable it would give me compile er
		
		System.out.println(ID);
		System.out.println(SchoolName);
		//to get Juline from other class we need to call it through the class name
		System.out.println(TestData4.Name);
		printHello();
		
		System.out.println(age);//access modifier default
		//System.out.println(Password); even this variable static but it is Private not visible in anpther class
		
		//private data from practice class
		
		
		defaultAccessModifierPractice obj=new defaultAccessModifierPractice();
		System.out.println(obj.namePublic);
		//System.out.println(obj.namePrivate);//private acess modifier
		System.out.println(obj.nameDefault);// default is accessible within the same package
	}

}
