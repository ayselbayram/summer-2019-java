package day01_FirstProgramming;

public class PracticeShortcut {
public static void main(String[] args) {
	String s5= "Java is really fun, java is good";
	s5=s5.replaceFirst("Java", "phyton");
	System.out.println(s5);
    
	String s1= "Java is fun, java says it is fun";
	s1=s1.replaceFirst("Java is","phyton was");
	System.out.println(s1);
	s1=s1.replace('s','S');
	System.out.println(s1);
}

}
