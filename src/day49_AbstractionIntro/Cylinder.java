package day49_AbstractionIntro;

public class Cylinder extends Shape{
	double radius;
	double height;
	final double PI=3.14;
	double diameter;
	
	
	public Cylinder(double radius, double height) {
		this.radius=radius;
		this.height=height;
		diameter=radius*2;
	}
	@Override
	protected void Area() {
		double area=( 3.14 * diameter * radius) + (height*2*3.14*radius);
		System.out.println("Area of the cylinder is "+area);
	}
	@Override
	protected void perimeter(){
		double perimeter=2*(PI*diameter*height);
		System.out.println("perimeter of the cylinder is "+perimeter);
		
	}
	
	@Override
	protected void capacity() {
		double capacity=PI * radius * radius * height;
		System.out.println("Capacity of the cylinder is "+capacity);
	}
	

}
