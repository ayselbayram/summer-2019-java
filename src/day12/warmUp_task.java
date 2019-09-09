package day12;

public class warmUp_task {
	/*
	 * warm up;
	 * declare 3 numbers
	 * find out their equality
	 * 
	 
	 */
	public static void main(String[] args) {
		int a = -12; int b = -76; int c = -76;
		if (a==b && a != c) {
			System.out.println(a + " and " + b + " are equal");
		}
		else if (a == c && a != b) {
			System.out.println(a + " and "+ c + " are equl");
		}
		else if (b==c && c != a) {
			System.out.println(b + " and " + c + " are equal");
		}
		else if (a == b && b == c){
			System.out.println("All of them are equal");
		}
		else {
			System.out.println("all of them are different");
			
		}
		System.out.println("================");
		
		//second solution
		 int n1 =8, n2=7,n3=9;
		 if (n1==n2 && n2==n3) {
			 System.out.println(" all of the are equal");
		 }
		 else if(n1==n2) {
			 System.out.println("n1 an n2 are equal");
		 }
		 else if(n2==n3) {
			 System.out.println("n2 and n3 are equal");
		 }
		 else if(n1 == n3) {
			 System.out.println("n2 and n3 are equal");
		 }
		 else {
			 System.out.println("none of them are equal");
		 }
		 //3.solution Nested if
		 
		 if (n1 == n2 && n2 ==n3) {// all of them are equal
			 System.out.println("all of them are equal");
		 }else {// if not all of them are equal
		 if(n1==n2) {
		 System.out.println("n1 and n2 are equal");
		 }
	     else if (n2 == n3) {
	  	 System.out.println(" n2 and n3 are equal");
	     }
	     else if (n1==n3) {
	    	 System.out.println("n1 and n3 are equal");
	     }
	     else {
	    	 System.out.println("none of them are equal");
	     }
}
		System.out.println("==============");
		/*
		 60-70====D
		 70-80==C
		 80-90===B
		 90-100===A
		 0-59===F
		 */
		int grade = 99;
		if (grade >=0 && grade <=100) {
			if (grade >=60) {
				if(grade >=90) {
					System.out.println("A");
				}
				else if(grade >=80) {
					System.out.println("B");
				}
				else if(grade>=70) {
					System.out.println("C");
				}
				else {
					System.out.println("D");
				}
			}
				else {
					System.out.println("failed");
				}
		}
				else {
					System.out.println("invalid");
				}
		
		int num = 9;
		if(num++==10) {
			System.out.println("helli" + num);
		}
	
	}
	 
		 }


