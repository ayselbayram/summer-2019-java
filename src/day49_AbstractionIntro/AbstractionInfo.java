package day49_AbstractionIntro;

public class AbstractionInfo {
	/*
	 * Abstraction: concentrating on essentials / important things
	 *              not worrying about the details/implementation
	 *     ***hiding the implementation details called abstraction
	 *              abstrcat method can only be declared either witnin the abstract class or interface
	 *           it is a method that's maent to be override(can not be final, private) in the regular sub class
	 *          exp:
	 *            car:
	 *               start(){  (these details ignored in abstarction)
	 *                  put the key
	 *                  turn the engine on
	 *                  start driving
	 *               }
	 *               
	 *  avstract method: it is a method that without body/implementation
	 *  
	 *       decleration of abstarct method
	 *            public acstract start();==>generic
	 *          
	 *            only instance method can be override and abstract
	 *                ex:
	 *                    pontanic car:
	 *                      start(){
	 *                        call th emavhanic
	 *                        insert the key in
	 *                        start the engine
	 *                        jumpstart
	 *                        drive
	 *                        }
	 *                     Tesla car;
	 *                     start(){
	 *                     say "start"
	 *                     drive
	 *                     }
	 *      both example start the car with different implementations. start is the generic name   
	 *      
	 *   Abstract class: abstarct is something that's not concrete.it is a class that we can not create object from.
	 *                  used for, meant to be extended.
	 *                  abstract class can not be "final"
	 *                  if the sub class is regular class, the sub class must override the abstrcat class
	 *                  if the sub class is abstract class, no need to override, it is inherited alreayd
	 *   IQ- Why we can not creat object from abstrcat class?:
	 *      abstrcation is something not concrete. object is concrete
	 *                           
	 *                  
	 */

}
