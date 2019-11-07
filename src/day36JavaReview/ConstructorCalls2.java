package day36JavaReview;

public class ConstructorCalls2 {
	/*
	 * constructor rules:
	 * 6. constructor can not call itself, gives compile er
	 * 7. constructor can not contain itself
	 */
public ConstructorCalls2() {
	this(); constructor can not call itself, gives compile er
	System.out.println("default");
	//this(true); constructor can not contain itself
}

public ConstructorCalls2 (boolean a) {
	//this(true);constructor can not call itself, gives compile er
	this();
	System.out.println("boolean");
}
public static void main(String[] args) {
	ConstructorCalls2 obj=new ConstructorCalls2("hello");
}
public ConstructorCalls2(String a) {
	this(true);
	System.out.println("String");
	
}
}
