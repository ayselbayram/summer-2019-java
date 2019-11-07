package day49_AbstractionIntro;

public class Shape {

	protected void Area() {
		System.out.println("Area ");

	}

	protected void perimeter() {
		System.out.println("perimeter is 0");
	}

	protected void capacity() {
		System.out.println("volume is 0");
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(30, 20);
		  rectangle.Area();
		  rectangle.perimeter();
		  rectangle.capacity();
		System.out.println("===================");
		Rectangle rectangle2 = new Rectangle(30, 40);
		  rectangle2.Area();
		  rectangle2.perimeter();
		  rectangle2.capacity();
		System.out.println("===================");

		Square square = new Square(10);
		  square.Area();// Square area is 100.0
		  square.perimeter();
		  square.capacity();
		System.out.println("===================");
		
		Circle circle=new Circle(5);
		  circle.Area();
		  circle.perimeter();
		  circle.capacity();
		System.out.println("===================");
		Cylinder cylinder=new Cylinder(5,4);
		  cylinder.Area();
		  cylinder.perimeter();
		  cylinder.capacity();
		   
		
	}
}
