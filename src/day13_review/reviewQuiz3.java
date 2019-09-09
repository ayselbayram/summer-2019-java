package day13_review;

public class reviewQuiz3 {
	public static void main(String[] args) {
		//Q1
		int num = 9;
		if (num++==10) {
		//  9==10	== false
			System.out.println("Hello World"+ num);
		}                                 // 10
		else {
			System.out.println("Hello universe "+num);
		}                                       //10
		//Q2
		int score=0;
		if(score==0) {
			score+=50;//score=50
		}
		if (score!=0) {//true
			// true
			score+=50;//100
		}
		System.out.println(score);
		
		//Q3
		
		char grade= 'A';
		boolean passed = grade =='A' || grade == 'B';
				//          true        ||   false===>true
		boolean passed2 = grade == 'C' || grade == 'C';
		              //   false      ||    false=====>false
		if (passed || passed2) {
		// true || false===>true
			System.out.println("Tou have passed the exam");
		}
		else {
			System.out.println("you failed");
		}
		
		//Q4
		
		
		
		
		boolean A = true,B =!false;
		if(B) {
			System.out.println("B");// first block gets executed 
		}
		else if (A) {
			System.out.println("A");
		}
		else {
			System.out.println("C");
		}
		
		//Q5
		boolean result = true;
		if(result) {
			System.out.println("It is true");
		}
		else {
			System.out.println("it is false");
		}
		//else if (result)====gives compile error else  needs to be at the end.
		// multi- branch starts with IF and ends with ELSE can not ends with ELSE IF
		
		
		//Q8
		boolean X = true, Y=!X;
		//                y = false
		if(X) {
			if (Y) {
				System.out.println("Monday ");
			}
			else {
				System.out.println("Tuesday");
			}
			}
		else {
			if(X){
				System.out.println("Thursday");
		} else {
			System.out.println("Friday");
			
		}
	}
		//Q9
		int number = 10;
		if(--number>10) {
			System.out.println("hello ceybertek"+number);
		}else {
			System.out.println("Hello world "+ number);
		}
		
		
			
			
			
			
			
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
