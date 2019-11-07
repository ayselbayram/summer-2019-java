package day44_AccessModifiers;

public class TestData4 {
	public static String Name="Juline";
	public static String ID="007";
	public static String SchoolName="Cybertek";
	
	private static String Password="cybertek";
	         static int age=41;//access modifier is default
	protected static double Salary=100000;
	
	public static void printHello() {
		System.out.println("Hello");
	}

}
