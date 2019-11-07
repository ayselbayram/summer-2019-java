package day27_customMethods;

public class voidMethodPractice_removeduplicate4 {
	//task.write a method that can remove duplicate from the string and print out the result
		//(aabbbccc)
		//output(abc)
	public static void main(String[] args) {
		removeDuplicates("abbfhdjdyyydh");
	}
		public static void removeDuplicates(String a) {
			String result="";
			
			for(int i=0;i<a.length();i++) {
			if(! result.contains(a.substring(i,i+1))){
				result+=a.substring(i,i+1);
			
			}
		}System.out.println(result);

}
}