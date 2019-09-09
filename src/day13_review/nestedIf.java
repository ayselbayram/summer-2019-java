package day13_review;

public class nestedIf {
	public static void main(String[] args) {
		// nested if needed when we have pre- condition. if condition be evaluate to multiple scenarios
	/*
	 * vote ager;
	 * age >=18=== eligible for vote
	 * age>=70===> can vote three times
	 * >70age >= 60 ===>twice
	 * 50 >age> 18 
	 * 
	 */
	
	int age = 80;
	if (age >=0 && age <=150)
		
	
	if (age >18) {
		if(age>=70) {//age>=70
			System.out.println("can vote three times");
		}else if (age >=50) {// 70>age>=50
			System.out.println(" can vote 2 times");
		}else {// age <50
			System.out.println("can vote one time");
		}
	}
		
		else {
			System.out.println("not eligible");
		}
	

	else {
		System.out.println(" invalid entry");
	}
	
	}
	}
	
	
	


