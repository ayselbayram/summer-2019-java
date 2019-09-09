package homePractice.java;

public class nestedIf {
public static void main(String[] args) {
	 /*vote ager;
	 * age >=18=== eligible for vote
	 * age>=70===> can vote three times
	 * >70age >= 60 ===>twice
	 50 >age> 18
	 */
	
	int age  = 20;
	boolean a = age >=18 && age <=150;
	boolean b = age>=18;
	boolean c = age >=70;
	boolean d = age >=60 && age <70;
	if (a) {
		if (b) {
			System.out.println("eligible for vote");
	       if (d) {
			System.out.println("can vote twice");
		}
	       else if (c) {
			System.out.println("can vote three times");
			
		}
	}else {
		System.out.println("not eligible");
}
}else {
	System.out.println("not valid");
}
	System.out.println("===============");
	int num = 7;
	switch(num) {
	case 1:
		System.out.println("not true");
		break;
	case 2:
		System.out.println("not the one");
		break;
	case 6 :
		System.out.println("thats it");
		System.out.println("is there any other value");
		break;
	default:
		System.out.println("not valid");
		break;
	}
	System.out.println("================");
	String days = "monday";
	switch (days) {
		case"monday":
			System.out.println("monday");
			break;
		case "tuesday":
			System.out.println("tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		case"thursday":
			System.out.println("thursday");
			break;
			
		default:
			System.out.println("invalid entry");
			break;
			}
	
	switch (age) {
	case 18:
	case 19:
	case 20:
	case 21:
		
		System.out.println("eligible for vote");
		break;
	default:
		System.out.println("not eligible");
		break;
	}
	
	System.out.println("How old am I?");
	int age1 = 57;
	switch(age1) {
	case 57:
		System.out.println("You are "+ age1);
		break;
	default:
		System.out.println("I have no idea");
		
		
	}
	
	int seatnumber= 1;
	int price;
	switch (seatnumber +2) {// we can also write the switch value like this
	case 1:
		System.out.println("infront");
		price = 30;
		System.out.println("Ticket price " + "$" + price);
		break;
	case 2 :
		System.out.println(" second row");
		price = 20;
		System.out.println("Ticket price " + "$" + price);
		break;
	case 3:
		System.out.println("3rd row");
		price =10;
		System.out.println("Ticket price " + "$" + price);
		break;
	default:
		System.out.println("no more seats");
		break;
		
	}
	int score = 15;
	if (score >=0 && score <=100) {
		System.out.println("valid test score");
	}
		else {
			System.out.println("Invalid test score");
	}
	
	int x = 24;
	boolean A =(x%2 ==0);
	
	if (A) {
		System.out.println(x + " is even number");
	}else {
		System.out.println(x*3-1);
	}
	int y = x%2;
	switch (y) {
	case 1:
		System.out.println(x*3-1);
		break;
	case 0:
		System.out.println(x + " is even number");
		break;
	
	}
	
	String respond= "Y";
	switch (respond) {
           case "Yes":
           case "Y":
        	   System.out.println("Yes");
        	   break;
       
		   default:
			   System.out.println("No");
			   break;
	}
	int K = 11;
	if (K >5) {
		System.out.println("A");
	}
		else if (K<10) {
			System.out.println("B");
	}else {
		System.out.println("C");
	}
	
	String grade = "H";
	 switch (grade) {
	 case "A":
		 System.out.println("4.0");
		 break;
	 case "B":
		 System.out.println("3.0");
		 break;
	 case "C":
		 System.out.println("2.0");
		 break;
	 case "D":
		 System.out.println("1.0");
		 break;
	 default:
		 System.out.println("0.0");
		 break;
	 
		
		
	}
	 int degree = 10;
	 int x1= degree % 2;
	 if ( degree>=0 ) {
		 if (x1 == 0) {
			 System.out.println("Degrees");
		 }
		 else {
			 System.out.println("Degree");
		 }
	 }
	 
	 String answer = "YES";
	 System.out.println("Are you in college?");
	 switch (answer) {
	 case "yes":
	 case "y":
	 case "YES":
	 case "Yes":
		 System.out.println("yes");
		 break;
	 default:
		 System.out.println("no");
	 }
	 
	 
	 
	 
	
	
			
	
	
	
	
	
	
	
	
	
	
			
	
	}
	
	
	
	
	
	
	
	
	
	
}

