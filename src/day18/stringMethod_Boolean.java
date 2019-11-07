package day18;

public class stringMethod_Boolean {
	public static void main(String[] args) {
		/*
		 isEmpty(): checks if the string is empty.returns boolean expressions
		 empty==true,!empty==false
		 */
		//exp1
		String str="Cybertek";
		boolean R1=  str.isEmpty();//false
		System.out.println(R1);
		
		//exp2
		String str2="";
		
		if ("".isEmpty()) {//empty//true
			System.out.println("it is empty");
		}else {
			System.out.println("it is not empty");
		}
		/*
		 equals(str): checks if the two strings visiable text are equal or not,then returns boolean exp.
		 equal=true,!equal=false
		 */
		String A1="Cybertek";
		String A2=new String("Cybertek");
		System.out.println(A1==A2);//false those 2 are 2 different objects);,location memory are dif.
		System.out.println("*****************");
		
		boolean R2=A1.contentEquals(A2);
		System.out.println(R2);
		
		System.out.println("java".contentEquals("Java"));//false case sensitivity
		
		/*
		 *equalsIgnoreCase(str):check if the 2 strings visible text are equal or 
		 *not then returns boolean exp case sensitivity doen not matter
		 */
		
		String s1="Java";
		String s2=new String("java");
		System.out.println(s1==s2);//false,different location
		System.out.println(s1.contentEquals(s2));//false case sensitivity
		System.out.println("kkk"+s1.equalsIgnoreCase(s2));//true, just care face value, does not care case 
		
		/*
		 contains(str):checks if the str is cantained in this string or not,then it returns a boolean exp.
		 contained==>true, !contained==>false
		 */
		
		String name="Muhtar";
		boolean R3=name.contains("abc");// false
		System.out.println(R3);
		
		String name2="Marufjon";
		System.out.println(name2.contains("m"));//false case ensitive
		
		/*
		 startWith("str"): checks if this string is started with the str or not
		 start===>true, !start===>false
		 */
		
		 String tclass="Java";
		boolean R4= tclass.startsWith("J");//true
		System.out.println(R4);
		 String names="Cybertek School is great place to learn Java";
		 boolean R5=names.startsWith("Cybertek School");
		System.out.println(R5);
		
		/*
		 *endWith("str"):checks if the string ends with given str
		 end==>true, !end==>false
		 */
		
		String B1="Muhtar";
		System.out.println(B1.endsWith("R"));// false case sensitive
		System.out.println(B1.endsWith("r"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
