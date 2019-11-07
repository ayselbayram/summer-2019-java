package day19_ForLoop;

public class forLoop {
	public static void main(String[] args) {
		/*
		 loop:used for repeating actions.repeats the steps multiple times.
		 for loop:
		      for(initialization;condition;itirator ){
		      
		      }
           statement within loops body is repeated until condition became false
           initialization= usually the times of the number that we want to execute the loop
                starting point
                exp: int i=0;
           condition=condition is created based on the initialization
            exp  i<10==boolean exp.
            
            
            itirator= co-related to the condition,runs long enough and either 
                  increases or decreases the value of the initialization then 
                  eventuallay condition becomes false
                    exp    i++====this effects the condition
            itirator is not mandatory,but it will give logical error if we removed
            
            if the condition of loop is true the loop will be keep executed itirator stops the loop
		 */
		
		for(int i=10;i>0;i-- ) {
			System.out.println("Hello World"+i);
		}
		
	}

}
