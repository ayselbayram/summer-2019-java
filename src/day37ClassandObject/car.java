package day37ClassandObject;

public class car {
	/*
	 *car
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
    car1 --> Audi Q7 2020, white,  100K, 10, 1232112112
        car1.start() ==>  Audi
    car2 --> Tesla ModelS 2025, red, 60K, 20, 231123123
        car2.start()  ==> Tesla
object: instance of the class, created from the class
class: where the objects came from, determines how the object should behave

instance variable: object variables, MUST be declared in the lcass and outside any method
local variable: variables that's created within the method, it s also called fields

instance methods: methods that belong to the object, the instance method does not have specifier called static.
                 those instance method designed to work as an instance of the class
                 
 regular method= acces modifier, specifier, return type, method name
 
 instance method decleration:
             access modifier  return type   methodName(parameter){
             }                     

	 */
	//attributes of the car class
	String Model;
	int Year;
	String Brand;
	String Color;
	double price;
	long mileage;
	
	
	
	public void drive() {
		System.out.println("Driving the car "+ Brand);
	}
	public void start() {
		System.out.println(Brand +" is starting.");
	}
	//2020 toyota corolla ,white, 10000$
	public void getInfo() {
		System.out.println(Year+", "+Brand+", "+ Model+", "+Color+", $"+price+", "+mileage+"mile.");
		
	}
	
	

}
