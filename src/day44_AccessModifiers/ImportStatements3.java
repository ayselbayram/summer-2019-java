package day44_AccessModifiers;

public class ImportStatements3 {
	/*
	 import statements:
	    import:
	          import PackageName.className:
	            //import a single class
	              Ex: import java.util.ArrayList;
	                            //package  class
	         
	      import PackegaeName.*;
	      //import all the classess from the package
	        exp: import java.util.*;
	  
	static import: used for importing the class members, mean anything is static,
	               we can access them directly without using the class name
	           
	            //declare
	             
	              import static Packagename.ClassName.StaticName(any static member);
	              //import a single static member from  the class
	              
	              import static Packagename.ClassName.*;
	              //impost all the class members(static members)
	                 exp:assertion class
	                     Assert.asserTrue();
	        
	  ACCESS MODIFIERS:public, protected, private, default
	       public: open for the world, visible at everywhere
	         ex: public int num=100;
	         
	        private: only visible within the class
	          ex: private int num=100;
	         
	        default: only visible within the PACKAGE, you wont be able to use it outside the pacjage
	                only visible to the classess in the same package, given bye default
	                
	                ex: int num=100;
	                
	        protected:only visible to the classess in the same package, but it is inheritable outsidethe package
	            ex:protected int num=100;
	    public is the only access modifier that's visible outside the package      
	 */

}
