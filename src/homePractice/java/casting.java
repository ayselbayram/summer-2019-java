package homePractice.java;

public class casting {
	public static void main(String[] args) {
		System.out.println((5+2)*7);
		System.out.println(10/(5-3));
		System.out.println(8+12*(6-2));
		System.out.println((4+17));
		System.out.println((6-3)*(2+7)/3);
		System.out.println("===========");
	
		
		int x = 46, y = 90, z= x+y; //1
		System.out.println("x+y = " +z);
		
		double celcius = 40;//2
		double fahrenheit = celcius*9/5+32;
		System.out.println(fahrenheit);
		
		double x1 = 2;//3
		double convert = x1 *1.609344;
		System.out.println(convert);
		
		
		double radius = 5.6,  perimeter = 2*radius*3.14 , area = radius*radius*3.14;
		System.out.println("\tPerimeter = "+perimeter +"\n\tArea = " + area);
		
		double width = 4.5, length = 7.9, area2 = width*length;
		System.out.println(area2);
		
		double a= 25,b =46, c= 67, d = a+b+c/3;
		System.out.println(d);
		
		int pies = 10, people = 4;
		double piePerson= (double)(pies/people);
		System.out.println(piePerson);
		// double piePerson= pies/people; 10/4=2
		//double piePerson= (double)pies/people; 10/4=2.5
		//double piePerson= pies/(double)people;2.5
		//double piePerson= (double)(pies/people);2 I have no idea why?
		
		
		
		
		
		
		
		
		
		
	}
	

}
