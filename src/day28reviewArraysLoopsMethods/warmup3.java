package day28reviewArraysLoopsMethods;

public class warmup3 {
	/*
	 *  * write a method that can calculate grade
		 *     if score is 100-90==>A
		 *     if score is 89-80==>B
		 *     if score is 79-70==>c
		 *     if score is 69-60==>D
		 *     if score is 59-50==>F
		 *     otherwise==> invalid score
	 */
     public static void main(String[] args) {
		
	}
     
     public static void grade(int A) {
			String result= A>=90 && A<=100 ? "A"
					         : A<=89 && A>=80 ? "B"
					        		 :A<=79 && A>=70 ? "C"
					        				 :A<=69 && A>=60 ? "D"
					        						 :A>=0 && A<=59 ? "F"
					        						 		:"Invalid score";
			System.out.println(result);
		}
}
