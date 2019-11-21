package day50_Abstraction;

public class Cat extends Animal {
	//2 reson while we have err
	//1. constructor
	//abstract methods
	//the reason to create this cat constructor to set the variable int the being extended class
	//if I created def cat constructor, every time I need to initialize the variables
	public Cat(char Gender, byte Age, String Color, String NickName) {
		super(Gender, Age, Color, NickName);
	}
	
	
	@Override
	public void Eat(String food) {// I also need to add this parameter in the abstract method
		
		System.out.println(NickName+" eats "+food);
		
	}
	@Override
	public void Sleep(int hours) {
		System.out.println(NickName+" "+hours+" hours in a day");
		
		
	}
	@Override
	public void Drink(String drink) {
		System.out.println(NickName+" drinks "+ drink);
		
	}
	@Override
	public void Speak(String language) {
		System.out.println(NickName+" speaks "+language);
		
	}
	
	
	

}
