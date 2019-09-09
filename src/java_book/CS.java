package java_book;

public class CS {
	public static void main(String[] args) {
		int pounds= 150;
		double feet = 5;
		double inches= 0.5;
		double heightmeters=((feet * 12) + inches)*0.0254;
		double mass = pounds/2.2;
		double bmi= mass/(heightmeters*heightmeters);
		System.out.println(bmi);
		
		if (bmi>=0 && bmi<=50) {
			if (bmi<18.5) {
				System.out.println(" Underweight");
			}
		else if (bmi>= 18.5 && bmi<25) {
			System.out.println(" Normal Weight");
			
		}
		else if(bmi>=25 && bmi <30) {
			System.out.println(" Overweight");
		}
		
		
	} else {
		System.out.println("Obese");
	}
		int a = 11;
		int b=45;
		int max;
		
		if (a >10) {
			System.out.println("high number");
		}else if(a <5) {
			System.out.println("low number");
			
		}else{
			System.out.println("so-so number");
		}
	 max = (a>b)? a:b;
	 System.out.println(max);
	 System.out.println(7>0);
	}

	}
