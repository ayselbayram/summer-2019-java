package InterviewQuestions;

public class combining2Arrays {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] arrays3 = new int[array1.length + array2.length];//size eneough to take 2 arrays

		for (int i = 0; i < array1.length; i++) {
			arrays3[i] = array1[i];
		}
		
		for(int i=0;i<array2.length;i++){
		   
		arrays3[i+array1.length]=array2[i];
		}
		
		for (int i = 0; i < arrays3.length; i++) {
			System.out.print(arrays3[i] + " ");
		}
	
	}

}
