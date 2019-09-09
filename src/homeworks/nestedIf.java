package homeworks;

public class nestedIf {
	public static void main(String[] args) {
		/*
		 60<= grade <70===>D
		 70<= grade <80===C
		 80<= grade <90===B
		 90<= grade <100===A
		 50<= grade < 60 ===>F
		 40<=grade <50===> G
		 30<=grade <40===>H
		 20<=grade <30===I
		 10<= grade< 20===>j
		 0<= grade <10===>K
		 */
        int grade = 65;
        if ( grade >=60 && grade<=100) {
       	 System.out.println("passed");
       	 if(grade >=90 && grade<=100)
       		 System.out.println("\twith an A");
       	 else if (grade >=80 && grade <90 ) {
       		 System.out.println("\t with a B");
       	 }
       	 else if (grade >=70 && grade <80) {
       		 System.out.println("\twith an C");
       	 }
       	 else {// 60 <grade <70
       		 System.out.println("\twith a D");
       	 }
       		 
       	 
       	 
        }
        else {
       	 if (grade <60) {// the condition is either less than 60 or greater tahn100
       		 System.out.println("you failed");
       		 if (50<=grade && grade<60)
       			 System.out.println("\twith F");
       		 else if (40<= grade && grade <50)
       			 System.out.println("\twith G");
       		 else if (30<=grade && grade <40)
       			 System.out.println("\twith H");
       		 else if (20<=grade && grade<30)
       			 System.out.println("\twith I");
       		 else if (10<= grade && grade<20)
       			 System.out.println("\twith J");
       		 else
       			 System.out.println("\twith K");
       			 
       			 
       	 }
       	 else {//greater than 100
       		 System.out.println("invalid score");
       	 }
        
        
       
	}
	}

}
