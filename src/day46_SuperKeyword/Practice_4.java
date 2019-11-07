package day46_SuperKeyword;
class Parent{
	public Parent(int a) {
		System.out.println("A");
	}
	public Parent(double c) {
		System.out.println("C");
	}
	
}

public class Practice_4 extends Parent{
	/*
	 as soon as practice extend super daf cons call def constructro
//	 public Practice(){
	 super();
	 
	 when we create a cont in super then we HAVE TO to call it manually in sub
	 
	 when we have more tan one constructor we need to call at least one of them
	 
	 */
	
	//sub class constructor
	public Practice_4(int a) {//called double arg constructor
		//this(); one constructor can call only one constructor
		super(5.5);
	}
	public Practice_4() {//called int arg constructor
		super(7);
		System.out.println("B");
		}
	public static void main(String[] args) {
		Practice_4 obj=new Practice_4();
	}

}
