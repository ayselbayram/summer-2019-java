package day42OOPEncapsulation;

public class Test2 {
	public static void main(String[] args) {
		TestData1 obj=new TestData1();
//		System.out.println(obj.Name);// encapsulation, this data is private now
		System.out.println(obj.getName());
		String str=obj.getName();//we can assign thos data
		System.out.println(obj.getID());
		int a=obj.getID();//i can assign it to another int, since return something
		System.out.println(str);
		//modify
		//obj.Name="Nurzat"; can not acces since the data is private
		
		obj.setName("Filiz");
		System.out.println(obj.getName());
		
		System.out.println(obj.getID());//before i called setter method
		obj.setID(356);
		System.out.println(obj.getID());
	}

}
