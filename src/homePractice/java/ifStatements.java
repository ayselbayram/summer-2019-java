package homePractice.java;

public class ifStatements {
	public static void main(String[] args) {
		int year = 2020;// calculating the leap year
		boolean leapYear = year % 4==0;
		if (leapYear) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		System.out.println("===================");
		int grade = 44;
		boolean A = grade >=90 && grade <=100;
		boolean B = grade >=80 && grade <=89;
		boolean C = grade >=70 && grade <=79;
		boolean D = grade >=60 && grade <=69;
		if (grade >=0 && grade <=100) {
			if (A) {
				System.out.println(" Passed with A");
			}
			else if (B) {
				System.out.println("You passed with B");
			}
			else if (C) {
				System.out.println("You passed with C");
			}
			else if(D) {
				System.out.println("You passed with D");
			}
			else {
				System.out.println("you failed");
			}
			
		}
		else {
			System.out.println("invalid entry");
		}
		System.out.println("=================");
		//jan  feb  march april may june july august sept oct nov dec 
		//31    28   31     30   31  30   31    31    30   31  30   31
		int month = 13;
		if (month <=12 && month>0) {
			if (month==2) {
				if(month%4==0) {
					System.out.println("29 days");
				}else {
					System.out.println("28 days");
				}
			}else if (month == 4 || month == 6) {
				System.out.println("30 days");
			}else if(month == 9 || month == 11) {
				System.out.println("30 days");
			}else {
				System.out.println("31 days");
			}
			}
			else {
				System.out.println("invalid entry");
			
		}	
	}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	


