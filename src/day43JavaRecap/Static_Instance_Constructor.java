package day43JavaRecap;

public class Static_Instance_Constructor {
	static int a;
	int b=10;
	
	
	static {
		
		a=a+3;
	
		
	}
	{
	a+=7;
	b+=3;
	
	}
		
		
	
    
	public Static_Instance_Constructor() {
		a+=10;
		
		b-=6;
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		Static_Instance_Constructor obj=new Static_Instance_Constructor();
		System.out.println(obj.b);
		System.out.println(a);
		
		
		
	}
}
