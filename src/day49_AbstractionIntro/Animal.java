package day49_AbstractionIntro;

public abstract class Animal {//it is generic topic, i can make is abstract
	//animal is abstract
	
	public abstract void eat();//eat is also generic for all animal
	//when i make it abstarct I dont need to worried about implementation
	
	public abstract void sleep();// sleep is also different for each animal
	public static void main(String[] args) {
		
	}
	
}// name of the animal that is concrete
class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("cat eats fish");
		
	}
	@Override
	public void sleep() {
		System.out.println("cat sleeps 14 hours in a day");
		
	}
}

class KingKong extends Animal{
	@Override
	public void eat() {
		System.out.println("KinKong eats humans");
	}
	@Override
	public void sleep() {
		System.out.println("KinKong sleeps 5 hours");
		
	}
}
class Test{
	public static void main(String[] args) {
		KingKong obj=new KingKong();
		  obj.sleep();
		  obj.eat();
        Cat obj2=new Cat();
           obj2.eat();
           obj2.sleep();
        		
	}
}
	
	
	
	


