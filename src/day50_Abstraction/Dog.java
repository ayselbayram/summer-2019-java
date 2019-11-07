package day50_Abstraction;

public class Dog extends Animal {
	public Dog(char Gender, byte Age, String Color, String NickName) {
		super(Gender, Age, Color,NickName);
	}
	@Override
	public void Eat(String food) {
		System.out.println(NickName+ "  eats "+food);
	}
	@Override
	public void Sleep(int hours) {
		System.out.println(NickName+"  sleeps "+hours);
	}
	@Override
	public void Speak(String language) {
		System.out.println(NickName+" speaks "+language);
	}
	@Override
	public void Drink(String drink) {
		System.out.println(NickName+ " drinks "+drink);
	}
}
