package homePractice.java;

public class switchStatement {
	public static void main(String[] args) {
		String str= "dell";
		switch (str) {
		case "Apple":
			System.out.println("Apple-no virus");
			break;
		case "dell":
			System.out.println("Tough one");
			break;
		case "Acer":
			System.out.println(" Cheap one");
			
		default:
			System.out.println("do not buy that one");
			break;
			
		}
		System.out.println("==============");
		int days= 1;
		switch(days) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
				
				
		
		}
		System.out.println("==============");
		char letter = 'B';
		switch(letter) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		case 'C':
			System.out.println("C");
			break;
		case 'D':
			System.out.println("D");
			break;
		case 'E':
			System.out.println("E");
			break;
		default:
			System.out.println(" not found");
			break;
		
		}
		System.out.println("==============");
		
		
		
	}

}
