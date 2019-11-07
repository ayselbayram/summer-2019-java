package day49_AbstractionIntro;

public class Circle extends Shape {
	double radius;
	double diameter=radius*2;
	final double PI=3.14;
	public Circle(double radius) {
		this.radius=radius;
		diameter=radius*2;
	}
	@Override
	protected void Area() {
		double area=radius*radius*PI;
		System.out.println("Area of the circle is "+area);
		
		
	}
	@Override
	protected void perimeter() {
		double perimeter= diameter*PI;
		System.out.println("perimater of the circle is "+perimeter);
		
	}
	
	

}
