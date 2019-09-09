package day12;

public class ifWithoutCurlyBrace {
	public static void main(String[] args) {
		if (true) {
			System.out.println("Hello");
			System.out.println("hello");
			System.out.println("hello");
		}
		else {
		System.out.println("world");
	}
// without curly brace : a single line of statement you van give
		if(true) 
	System.out.println("hello");
		//System.out.println("how are you"); this line make disconnest if and else statement, that is why giving erroe
		// without curly brace if can hold only one statement
		
		else 
			System.out.println("world");
		System.out.println("==============");
		// nested statement without culry brace
		if (true)
			if (true)
				System.out.println("Hello world");
			else
				System.out.println("Hello cybertek");
		else 
			System.out.println(" invalid");
		System.out.println("================");
		
		//multi -brach if without curly brace
		int grade =80;
		if (grade <=100 && grade >=0)
		  if (grade >=90)
			System.out.println("A");
		   else if (grade >=80)
			System.out.println("B");
		   else if(grade >=70)
			System.out.println("C");
		   else // belongs to else - if statement
			   System.out.println();
		   else // belongs to pre-condition if statement
			   System.out.println("invalid");
			// when we use without curly brace it is getting confusing .
		   //curly brace makes the code more readable
			
			
			
			
			
			
			
}
}