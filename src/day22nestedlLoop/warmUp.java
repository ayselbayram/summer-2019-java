package day22nestedlLoop;

public class warmUp {
	public static void main(String[] args) {
		/*
		 * write a program prints out the numbers from 1-30
		 *    1. disiion of 3 print"FIN"
		 *    2.division of 5 print"RA"
		 *    3.division of 3 and 5 print"FFINRA"
		 *    WE DIDI IT EIT IF AND TERNARY(MUCH EASIER)
		 */
		int i=1;
		String str="";//1+2+3+4+5 //str+=i;//1+2+3+4+5  if we add anything to string it will concate
		while(i<=30) {
		 if(i%3==0 && i%5==0) {
				str+="FINRA ";
		 }else if(i %3==0) {
				str+="FIN ";
			}
			else if(i%5==0) {
				str+="RA ";
			}
			
			
			
		      else {
				str+=i+" ";	
			}	
		 
		 
		 str+=	i%3==0 && i%5==0 ? "FINRA"
				  :i %3==0 ?       "FIN"
						  :i%5== 0  ?   "RA"
						    :i +" ";		
			
		 i++;
		
		}System.out.println(str);
		
		
			
			
		
		
		
		
		
		
		
	}

}
