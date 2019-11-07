package day50_Abstraction;

public class Zoo {
	public static void main(String[] args) {
		Cat Cleo=new Cat('F',(byte)5,"White and Black","Cleo");
     System.out.println("NickName is "+Cleo.NickName);
     System.out.println("Gender is "+Cleo.Gender);
     System.out.println("Age is "+Cleo.Age);
     System.out.println("Color is "+Cleo.Color);
     System.out.println("=================");
     
     //call getInfo Method
     Cleo.getInfo();
     //call the override methods
     Cleo.Drink("Milk");
     Cleo.Eat("Cheese");
     Cleo.Sleep(7);
     Cleo.Speak("Turkish");
     System.out.println("=================");
    
     
     //2. cat
     Cat Misha=new Cat('F',(byte)6,"White and Gray","Misha");
     Misha.getInfo();
     Misha.Drink("Water");
     Misha.Eat("fish");
     Misha.Speak("Meoww");
     Misha.Sleep(5);
     System.out.println("==================");
     
     //1. dog
     Dog Pngo=new Dog('M',(byte) 8, "Golden", "Pngo");
     Pngo.getInfo();
     
     Pngo.Speak("Spanish");
     Pngo.Eat("Fish");
     Pngo.Drink("Water");
     Pngo.Sleep(7);
     System.out.println("==================");
     
     //2. dog
     
     Dog Tuzik=new Dog('M', (byte)12, "black", "Tuzik");
     Tuzik.getInfo();
     Tuzik.Drink("Redbull");
     Tuzik.Eat("hot dog");
     Tuzik.Sleep(7);
     Tuzik.Speak("Kyrgyz Woof");
     
     Dog[] dog= {Pngo,Tuzik};// Dog is object so I can create an Array
     Cat[] cat= {Misha,Cleo};//cat is an object so I can create Array
     System.out.println("==================");
     dog[1].getInfo();
     cat[0].getInfo();
     /*
      * create an abstract class call Countries
      *     data/attrubutes: name,flag, language, population, reiligon, rivals, capital
      *     constructor that can set all those data
      *     actions(abstrack):exports(), import(), parameter is up to us, economy, currency
      *     create a sub-class:
      *                south Korea, USA, Kazakhistan, new Zealand, Mother Russia, Turkey
      *     
      *    abstract method, inheritance, abstract class, method overriding...
      */
     
     
     
     
     
		
	}
	

}
