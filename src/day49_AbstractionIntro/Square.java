package day49_AbstractionIntro;

public class Square extends Shape{
	double  side;
	public Square(double side) {
		this.side=side;
	}
	@Override
	protected void Area() {
		double area=side*side;
		System.out.println("Square area is "+area);
	}
	@Override
	protected void perimeter() {
		double perimeter=side*4;
		System.out.println("Square perimeter is "+perimeter);
	}
	
	

}
