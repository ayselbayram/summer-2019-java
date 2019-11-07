package day49_AbstractionIntro;
/*
 * bugun ki warmup u abstract kullanarak tekrar yapabilirsin, abstract class da body vermene gerek yok
 * ama sub class larda istedigin kadar abstract method o override yapip classs a ozel kilabilirsin
 * 
 * abstract and final hicbir zaman yanyana olmaz
 */


abstract class  shape{
	public abstract void Area();
	
	
}
abstract class T extends Shape{
	//if the sub class is abstract class, no need to override, it is inherited already
}
class Triangle extends Shape{//concrete claas, you can create object from
	
	public void Area() {
		System.out.println("Area of the triangle is ...");
		
	}
	
}



public class Practice{
	public static void main(String[] args) {
		
	
	Triangle obj=new Triangle();
	    obj.Area();
	}

}
