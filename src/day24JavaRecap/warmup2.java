package day24JavaRecap;

public class warmup2 {
	public static void main(String[] args) {
		//retrun the minimum num from an int Array
		//find the second minimum nuber
		
		
		int[] numbers= {3,45,67,89,98,234};
		int len=numbers.length;
		int min=999999999;
		for(int i=0;i<len;i++) {
			if(min>numbers[i]) {
				min=numbers[i];
			}
		}System.out.println(min);
		
		int min2=999999999;
		for(int j=0;j<len;j++) {
			if(min2>numbers[j] && numbers[j] !=min) {
				min2=numbers[j];
			}
		}System.out.println("secoond minimum: "+min2);
		
		
		
		
		
	}

}
