package day14_TernaryScanner;

public class ternary {
	public static void main(String[] args) {
		/*
		 * if (condition)==> (condition) ? 
	       else         ====> :
	        else if     ======> : (condition)?
	        
	        in ternary body we can only give a single value
	        ternary MUST be initialized to a variabl or print it out because it returns a data value, 
	        MUST return value
		 
		 */
		
		/*int num = 0;
		
		if (true) 
			num =100;
			
		else 
			num=50;
			*/
		
		int num=0;
		int n  =(true) ? 100 :50;// ? mark is "if", ":" is else statement, we can initialize ternary in data type
		int y = false ? 100 : 50;// () is not necessary in ternary
		
		System.out.println(num);
		System.out.println(n);
		System.out.println(y);
		
		
		//string example
		String schoolname = "";
		boolean batch12 = true;
		if (batch12) {
			schoolname =" cybertek";
		}else {
			schoolname ="invalid";
		}
		
		System.out.println(batch12 ? "cybertek" : "invalid");
		
		schoolname = batch12 ? "cybertek" : "invalid";// we can also initiliazed another string data type here
					
			System.out.println(schoolname);
		
	
	
	//double z = true ? 10.5;====> in ternary total number of ? and : has to be equal
	
	// double example
			double interestRate =0;
			boolean GoodCredit = true;
			  interestRate= (GoodCredit==true) ? 0.5:0.9;
			  System.out.println(interestRate);
			  
			  byte grade= 60;
			  boolean passed=  grade >=60 ? true:false;
			  System.out.println(passed);
			  
			  System.out.println("=============");
			  
			  
			  /* elsei if statement
			  char finalgrade= 'A';
			  String group="";
			  
			  if(finalgrade=='A') {
				  group="as early bird";
			  }else if (finalgrade == 'B') {
				  group="group 1";
			  }else {
				  group="after group 1";
				  
			  }
			  
			  */
			  char finalgrade ='C';
			  String group= finalgrade=='A' ? "early bird":finalgrade == 'B' ? "Group 1" : "after group 1";
			  
			  System.out.println(group);
			  
			  System.out.println("===============");
			  
			  
			  // example
			
		
			
			  
			  if(finalgrade=='A') {
				  group="as early bird";
			  }else if (finalgrade == 'B') {
				  group="group 1";
				  
			  }else if (finalgrade == 'C') {
				  group="group2";
				  
			  }else {
				  group ="after group 2";
			  }
			  
			  group= finalgrade=='A' ? "as early bird"
					  : finalgrade=='B' ? "group 1" 
					  : finalgrade=='C' ? "group2"
					  : "after group 2";
			  
			  System.out.println(group);
				
			  
			  System.out.println("=========");
			  int score= 35;
			 char finals = 'A';
			 
			  
			  if(score >=90 &&  score <=100) 
			     finals = 'A';
			  else if (score >=80 && score <=89)
				  finals = 'B';
			  else if (score >=70 && score <=79)
				  finals ='C';
			  else if (score >=60 && score <=69)
				  finals = 'D';
			  else if (score >=0 && score <=59)
				  finals= 'F';
			  else
				  finals=' ';
			  score = 65;
			  
			  finals = score >=90 &&  score <=100 ? 'A'
					  :score >=80 && score <=89 ? 'B'
					     :score >=70 && score <=79 ? 'C'
					        :score >=60 && score <=69 ? 'D'
					            :score >=0 && score <=59 ? 'F'
					               :' ';
			 System.out.println(finals);
			 System.out.println("===========");
			 
			 int n1 =100, n2=700,n3=400;
			 int max = n1>n2 && n1> n3 ? n1
					       :n2>n3 && n2>n1 ? n2
					          : n3;
					       System.out.println(max);

							  
			 
			  
			  
			  
			  
			  
					  
			
		
	
	}
	}


