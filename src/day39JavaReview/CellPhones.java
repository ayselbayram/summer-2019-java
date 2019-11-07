package day39JavaReview;

public class CellPhones {
	
	String brand;
	double size;
	String color;
	double price;
	String model;
	
	public CellPhones() {//set up default value for attributes of the class
		 brand="IPhone";
		 size=5.8;
		 color="White";
		 price= 700;
		 model="10";
		
	}
	public CellPhones(String brand, double price, String color, double size,String model) {//to cerate the second eobject with initialized
	this.brand=brand;//this is used for calling isntance variable
	this.size=size;
	this.color=color;
	this.price=price;
	this.model=model;
	}
	
	public void call(long PhoneNum) {
		System.out.println(brand+" "+model+" is calling "+PhoneNum);
	}
	public void sendMessage(long PhoneNum) {
		System.out.println("Sending message to "+PhoneNum);
		
	}
	public  void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+size+" $"+price);
		
	}
	
	

}
