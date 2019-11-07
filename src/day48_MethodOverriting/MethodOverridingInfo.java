package day48_MethodOverriting;

public class MethodOverridingInfo {
	/*
	 * method overloading: same name, different parameter
	 *                     return type does not matter
	 *                     access modifier is not matter
	 *                     any method even main can be overload
	 *                     
	 *method overriding:  same name, same parameters
	 * why do we need it: to implement specific functionality to the method.
	 *       we creat method with same name and same parameters then provide  different functions to the method.
	 *       we can not override the same method within the same sub class more than one                
	 *      exp: that we have seen already
	 *           WebDriver driver=new ChromeDriver();
	 *           driver.get("URL"):goes to the URL in chrome browser
	 *           
	 *           WebDriver driver=new FireFox();
	 *           driver.get("URL"): goes to URL firefox browser
	 *           
	 *           method must be override in subclass
	 *           
	 *           get: methods accepts String, same name and same parameter, get is overrite method
	 * 
	 * @Override(annitaion): used to verify if the method is overridden or not
	 *           
	 *   exp:  super class: Bank
	 *               actions:Interest rate()==>%9
	 *               
	 *         sub clasees: BOFA     ==> %7
	 *                      PNC      ==>%6
	 *                      CapitalOne==>%8
	 *                      
	 *                      
	 * 1- the method overriding can NOT happened in the same class.
	 * 2- method must be override in subclass
	 * 3-only the instance methods can be override
	 * 4- static cen NEVER be overriden
	 * 5-constructor can NOT be overriden
	 * 6- private methods can NOT be overriden
	 * 7-override method' access modifiers need to be same or more visible
	 * 8-the method that we are going to override MUST be inheritable to the subclass
	 *       being overritten method==overrite method
	 *       default==>default, protected, public
	 *       protected==> protected, public
	 *       public==>public
	 *       ptivate==>can NOT be overritten
	 * 9- the return type MUST be same with the original method
	 * 10- any method that final can not be override
	 *       
	 *    publi>protected>default>private
	 *    
	 *    
	 *  Override VS Overload:
	 *      Overload: access modifier can be same or different, 
	 *                return type can be same or different
	 *                Parameter MUST be different
	 *                method name MUST be same
	 *                any method can be overload
	 *                can happen in the same class or sub classess
	 *                static, instance, constrcutro,final can be overload
	 *                
	 *      Override: access modifier needs to be same or more visible then the original one
	 *                the method must be inheritable to the sub class, private access modifier is not overloadable
	 *                return type MUST be same
	 *                method name MUST be same
	 *                parameters MUST be same
	 *                only isntance method can be overload
	 *                MUST be override in sub class, need inheritance
	 *                @Overide annotaion MUST be applicable 
	 *                
	 *   Benefits of Override:
	 *              readable
	 *              reusability
	 *              flexible
	 *               
	 */

}
