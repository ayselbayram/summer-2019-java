package day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {
	//interface is pure abstrcation
	public abstract void method1();
	public abstract int method2();

	void method3();//by default abstrcat and public  keyword is given
	
	void method4();//by default abstrcat and public  keyword is given
}
class Test implements Interface_VS_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}