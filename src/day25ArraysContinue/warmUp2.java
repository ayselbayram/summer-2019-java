package day25ArraysContinue;

public class warmUp2 {
	//write a program that can print out the unique values from string array
	public static void main(String[] args) {
		
		String[] arr= {"A","A","B","C","C"};
		
		
		for(int j=0;j<arr.length;j++) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				
				if(arr[j].equals(arr[i])) {
					count++;
				}
			}if(count==1) {
				System.out.println(arr[j]);
			}
		}
		
		
		
		
		
		
	}

}
