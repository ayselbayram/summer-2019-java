package day24JavaRecap;

public class arrayPractice2 {
	public static void main(String[] args) {
		
		/*
		 * find out the longest name
		 */
		
		String[] names= {"syfo","asiya","myra","kateryna","daulet"};
		
		int max=0;
		String longest="";
		for (int i=0;i<names.length;i++) {
			 if(names[i].length() >max);{
			  max=names[i].length();
			  longest=names[i];
		}
		
		}System.out.println(max);
		System.out.println(longest);
		
		
		
		
		
		
		
		
	}

}
