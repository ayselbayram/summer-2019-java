package day37ClassandObject;

public class dog {
	/*
	 Dog
    Attributes/data:
            breed, size, age, color, name ...
    actions:
        eat, sleep, bark, play ...
    Dog1 --> German Shepard, XXL, 5, pink, Lassie
        Dog1.eat() ==>   Lassie
    Dog2 --> Tibetan mastiff, small, 3, red, KIKO
        Dog2.eat() ==> KIKO
instance variable: object variables, MUST be declared in the lcass and outside any method
local variable: variables that's created within the method
	 */
//this is custom class we created
	String Breed;
	String Size;
	byte Age;
	String Color;
	String Name;
	char Gender;
	String Food;
	String Toy;
	
	public void getInfo() {
		System.out.println(Breed+", "+Size+", "+Age+" years old, "+Color+", "+"Gender is "
	+Gender+ ", and we called her "+Name);
	}
	public void eat() {
		System.out.println(Name+" is eating "+Food);
	}
	
	public void play() {
		System.out.println(Breed+" is playing with "+Toy);
	}
	
}
