package day45_Inheritance;

public class InheritanceInfo {
	/*
	 * OOP Inheritance: one of the concepts of OOP.It is used for building relationships between classess.
	 * it builds' super' and 'sub' relationship between classess.
	 * 
	 *       how:we use "extends" keyword build super and sub relationships between classess.
	 *          
	 *            public  class  A  extends  B
	 *                       // sub         super
	 *      ex: dog is sub class, animal is the super class
	 * 
	 * sub class(A): it is also called child class.
	 *             Sub class basically can inherit the featured that super class has
	 *             sub class inherit the visible and protected(access modifier) features from the super class.
	 *             
	 *             features have public or protected access modifiers can be inherited at anywehere,
	 *             even outside the package
	 *             
	 *             feature hta jave default access modifier: can only be inherited to the claasess
	 *             that are in the same package.
	 *             
	 *             easiest way to get rich
	 *             
	 *             POM:page object module
	 *             
	 *             private: it can never be inherited 
	 *             
	 *             
	 * super class(B):it's called parent class.super class cannot inherit any features from the sub class.
	 *        
	 *      one class can only extend one class, but one class can be extended by multiple class
	 *      one super class can have multiple sub classess
	 *      
	 *      
	 *      BANEFIT OF INHERITANCE: 
	 *             1.increases the reasubility
	 *             2.esay to maintain
	 *             
	 *            
	 */
	
	private void init() {
		System.out.println("A");
	}
	private void sta() {
		init();
		System.out.println("b");
	}

}
