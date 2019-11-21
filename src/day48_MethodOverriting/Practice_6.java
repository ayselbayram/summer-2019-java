package day48_MethodOverriting;

class WebDriver{
	public void get() {
		System.out.println("opens browser");
	}
	
}
class ChromeDriver extends WebDriver{
	//method overriding
	@Override//it is override
	public void get() {
		System.out.println("Open Chrome browser");
	}
	
}

class FirefoxDriver extends WebDriver{
	//method overriding
	public void get() {
		System.out.println("Open Firefox  browser");
	} 
	
}

public class Practice_6 {
	public static void main(String[] args) {
		ChromeDriver obj=new ChromeDriver();
		    obj.get();//I wan to say "open chrome browser"
		WebDriver obj2=new WebDriver();
		    obj2.get();//opens browser, original one
		FirefoxDriver obj3=new FirefoxDriver();
		    obj3.get();//Open Firefox  browser
	}

}
