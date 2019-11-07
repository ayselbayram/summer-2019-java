package day28reviewArraysLoopsMethods;

public class reviewAsessmentQuiz7 {
	public static void main(String[] args) {
		//1
		String [] days= {"sun","mon","wed","sat"};
		int wd=0;
		for(int i=0;i<days.length;i++) {
			switch(days[i]) {
			case "sat":
			case "sun":
				wd-=1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd+=2;
			}
				
		}System.out.println(wd);
		System.out.println("+++++++++++");
		//5.
		int []num1=new int [3];
		int []num2= {1,2,3,4,5};
		num1=num2;//num1 size has reinitialized
		for(int each: num1) {
			System.out.print(each);
		}
		//ARRAYS VALUE NEEDS TO BE INITIALIZED FIRST OTHERWISE GIVES COMPILE ERROR
		System.out.println();
		//Q10
		int []array= {1,2,3,4};
		int i=0;
		do {
			System.out.print(array[i]+" ");//1,2,3
			i++;//1,2
		}while(i<array.length-1);
		
		
		
		
		
		
		
		
		
		
	}

}
