package day50_Abstraction;

public class WarmUpRequirements {
	/*
	 * WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
        
	 */
	/*
	 * abstrcation: concentrating on importance/essential things 
	 * without worrying about implemetations or details
	 * 
	 * Abstract class:abstrcat keyword can only be applicable to class and methods
	 *          abstrcat class is aclass that we can not create object
	 *          it is a class that is meant to be extended
	 *          can not be final, or immutable
	 *          class' access modifiers can only be public or default
	 *          
	 *  Abstrcat method: that is meant to be override.
	 *                   is a method without body, implementations.
	 *                   can not be static, private and final
	 *                   only the instance method can be override
	 *                   hides the implementation details
	 *                   
	 *            decleration of abstract method;
	 *                access-modifier  abstrcat keyword  return type   name(parameter);
	 *              access modifier: public, default, protected
	 *              return type: void, primitives, non-primitives(object)
	 *              name: any name
	 *              parameter:primitives, non-primitives(object)
	 *              
	 *  overriding: same method name, same parameter, same return type, same method signatures 
	 *              access modifier needs to be same or more visible
	 *              Must be override in sub class
	 *             @Override annitation must be applicable         
	 *            
	 *                          
	 *
	 */

}
