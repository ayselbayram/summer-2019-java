package day45_Protected_Default;

import day45_Inheritance.Prptecetd_vs_Default;

public class Test extends Prptecetd_vs_Default{
	public static void main(String[] args) {
//		Prptecetd_vs_Default obj=new Prptecetd_vs_Default();
		//obj.printHello();// protected access modifier is not visible outside the package
		//obj.printHola()//default access modifier is not visible outside th epackage
		
		//System.out.println(obj.name); name has protected accees modifier
		//System.out.println(obj.ID); ID has default modifier
//		System.out.println(obj.age);// age has public access modifier, open to everywhere
		/*
		 * protected String name;//protected
		 * public int age;//public
		 * protected void printHello() //protected
		
	}
		 */
		Test obj=new Test();
		
		System.out.println(obj.name);//protected and inherited
		Prptecetd_vs_Default.printHello();
		
	}

}
