package homePractice.java;

public class deneme2 {
	public static void main(String[] args) {
		String txt = "abcgshfyetdksidjd";
		System.out.println("The length of the string is " + txt.length());
		String spr = "123456";
		System.out.println(spr + "  " + spr.length());
		String name = "filizcoskunuzer";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name + "  " + name.length());
		System.out.println(txt.toUpperCase() + txt.length());
		System.out.println(txt.toLowerCase() + txt.length());
		System.out.println(txt.concat(name));
		
		String x = "10";
		int y = 20;
		
		
		String z = x + y;
		
		System.out.println(z);
		System.out.println("==========");
		
		System.out.println(Math.max(10, 34));
		System.out.println(Math.min(10, 34));
		System.out.println(Math.sqrt(81));
		
		String greeting = "Hello";
		int n = greeting.length();
		System.out.println(n);
		String text = "stay where ever you are";
		System.out.println(text.indexOf("ever"));//11
		
		System.out.println("==========");
		String sentence = "Text processing is hard.";
		int position = sentence.indexOf("hard");
		System.out.println(position);
		System.out.println("I will be aleays with you \rShe");
		
		String greeting2 = "How do you do";
		System.out.println(greeting2 + "Seven of Nine");
		
		String test = "ascdefg";
		System.out.println(test.length());
		System.out.println(test.charAt(1));
		System.out.println(test.charAt(5));
		System.out.println(test.substring(2));
	String greeting3 = "AscdEfg";
	
	

		
		
		
		
	}

}
