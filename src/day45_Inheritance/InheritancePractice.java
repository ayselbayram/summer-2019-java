package day45_Inheritance;
class TestBase{
	static String chromeDriver="Fire Fox";//default
	public static void TakeScreenShot() {
		System.out.println("Took Screenshot");
	}
	private static void closeBrowser() {//this is not visible, it is not going to be inheritable
		System.out.println("browser close");
	}
}


public class InheritancePractice extends TestBase{
           // sub class                  //super class
	//Inheritance (sub class)is gonna inherit all the visible or protected 
	//features from the super(TestBase) class
	/*
	 * static String chromeDriver;//invisible it is inherited from super claas because it is visible(def)
	 * public static void TakeScreenShot() {
		System.out.println("Took Screenshot");
		inherited variable and methods are not visible, we can not see them but they are there
	}
	 */
	 public static void main(String[] args) {
		 System.out.println(chromeDriver);//inherited from TesBase to Inheritance class
		 TakeScreenShot();
		
	}  
	 
	 
	
	
}
