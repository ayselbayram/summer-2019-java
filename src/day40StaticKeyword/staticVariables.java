package day40StaticKeyword;

public class staticVariables {
	static String name;//static variables are mutable
	static double staticNum;
	
	public static void main(String[] args) {
		staticVariables obj1=new staticVariables();
		   obj1.name="Omer";//Omer
		   System.out.println(obj1.name);//Omer, top to bottom
		   
		   staticVariables obj2=new staticVariables();
		          obj2.name="Kurshed";
		        System.out.println(obj2.name);//kurshed
		        System.out.println(obj1.name);//kurshed
		        System.out.println("=========================");
		        System.out.println(staticVariables.staticNum);//i can call static variable through classname
		        staticVariables object1=new staticVariables();//0.0
		         object1.staticNum=4.5;//we reinitialized staticNum
		           System.out.println(object1.staticNum);//0.0
		        System.out.println(obj2.staticNum);//0.0
	}

}
