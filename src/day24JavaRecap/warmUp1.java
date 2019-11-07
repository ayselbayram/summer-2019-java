package day24JavaRecap;

public class warmUp1 {
	public static void main(String[] args) {
		// retuen the maximum value from an int array
		//return the second mad value from Array
		
		int[] numbers= {3,45,67,89,98,234};
		int len=numbers.length;
		int max=0;
		
		for(int i=0;i<len;i++) {
			if(max<numbers[i]) {
				max=numbers[i];
			}
			
		}System.out.println(max);
		
		int max2=0;
		for(int j=0;j<len;j++) {
			if(numbers[j]>max2 && numbers[j]<max) {
				max2=numbers[j];
			}
		}System.out.println("secoond max num is: "+max2);
		
		
		
		
		
		
		
	}

}
