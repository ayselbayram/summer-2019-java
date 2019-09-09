package Day05_recap;

public class Concatenation {
	/*
	 String: represent the sequence of characters. used for storing text.
	 assigned text in the string primitive. 
	 String values are surrendered by w double quote.
	 String has to have S capital s
	 Concatenation: combining, linking things together==>creates a String value
	               achieved by using + operator.
	               we can not contact any value to string
	 
	 */
	public static void main(String[] args) {
		String str = "any text goes here";
		System.out.println(str);
		String str2 = "1";// it is gonna treated as text because we assigned it text with string
		System.out.println(str2);
		String Hello = "Hello World";
		System.out.println(Hello);
		String Myname ="Cybertek" + " school";
		System.out.println(Myname);
		System.out.println('5'+'6'+"3");
		
		String Year = "This is "+ 2019;
		System.out.println(Year);
		//EXAMPLE
		String name ="Ipek";
		System.out.println("My name is " + name);
		
		//warm up example
		int cucumber = 3;   int tomato = 5;
		System.out.println("Cucumber is $ " + cucumber  );
		System.out.println("Tomato is $" + tomato);
		
		
		
		
		String newStr = "100" + 10;
		System.out.println(newStr);//10010
		System.out.println(1+2+3);
		System.out.println("1" + 2 +3 );//"12"+3=123
		//System.out.println("1"+1-3); // "11"-3
		System.out.println("Batch 12" + 1+2);//Batch 121 +2==>1212
		System.out.println(2-1+1+"4");//2="4"===>24
		System.out.println("Batch 12" + (1+2));//"Batch 12"+3===>Batch 123
		System.out.println(1 +"123" + 4+5);//112345
		System.out.println("123"+ (4+5));//1239
		System.out.println(1+("1"+2));// 1+"12"==>112
		System.out.println(4+3-(9+3)); //7-12);
		System.out.println((1+2)+"3");
	
		String BookName ="I like the book called \'Game of Throme\'";
				String MyINfo = "My name is: \n\tFiliz";
				System.out.println(MyINfo);
	System.out.println('3'+ 3);//ascii 51+3=54 '3' is a character from ASCII table,char values
	System.out.println("3" +'3');// "3 +51//IF WE CONCATE CHAR TO STRING CHAR IS CONCATED AS CHARACTER
	        
	System.out.println(12+'3');// IF WE CONCATE CHAR TO NUMBER' CHAR WILL BECOME NUMBER
	                   //12+51=63
	System.out.println(2+3);
	System.out.println("2"+"3");
	System.out.println('7' + 3);
				      //55+3=58
	System.out.println('7'+"3");//73
	System.out.println('7'+9);
	System.out.println();
	
		
	}

}
