package day43JavaRecap;

import day44_AccessModifiers.TestData4;//even import is not working because ae has default access modifier
import day44_AccessModifiers.defaultAccessModifierPractice;

public class Test11 {
	//this. keyword is not work in static instances
	//initializer icindekiler islem var ise sonuclari degistirebiliyor
	//q5
	
	int b;
	static int a;
	//q9
	long total=100;
	
	public Test11() {
		total-=50;
	}
	public Test11(int total) {
		this();
		this.total+=total;
	}
	
	{
		total*=2;
	}
	
	static {
		
		int total=200;
		total/=2;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		//q9
		Test11 test=new Test11(25);
		System.out.println(test.total);
		
		//q5
		Test11 obj1=new Test11();
		obj1.b=10;
		obj1.a=20;
		System.out.println(obj1.b);
		System.out.println(obj1.a);
		
		Test11 obj2=new Test11();
		obj2.b=30;
		obj2.a=40;
		
		System.out.println(obj2.b);
		System.out.println(a);
		
		//q9
		
		//test from day44 package default access modifier 
		 //System.out.println(TestData4.Age); compile er because access modifier is default even it is static
		//System.out.println(TestData4.Salary); access modifier is protected
		
		//defaultAccessModifierPractice tes
		defaultAccessModifierPractice obj=new defaultAccessModifierPractice();
		System.out.println(obj.namePublic);
		//System.out.println(obj.namePrivate); not visible outside the class
		//System.out.println(obj.nameDefault); not visible outside the package
		 
	}
	

}
