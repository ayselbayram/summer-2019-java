package day42OOPEncapsulation;

public class AmericanAirline {
	public static void main(String[] args) {
		//name
		employeeInfo Emrah=new employeeInfo();
		Emrah.setName("Emrah");
		System.out.println(Emrah.getName());//Emrah
		
		//SSN
		
		Emrah.setSSN(14356475);
		System.out.println(Emrah.getSSN());
		
		//age
		
		Emrah.setAge((byte) 41);
		System.out.println(Emrah.getAge());
		
		
		//salary
		
		Emrah.setSalary(3500);
		System.out.println(Emrah.getSalary());
		
System.out.println("======================");
		//2.object
		employeeInfo sirin=new employeeInfo();
		System.out.println(sirin.getName());//null we havent set it for sirin yet
		sirin.setName("Sirin");
		System.out.println(sirin.getName());
		sirin.setSSN(1223445);
		sirin.setAge((byte)28);
		sirin.setSalary(5000);
		System.out.println(sirin.getSalary());
		System.out.println(sirin.getSSN());
		System.out.println(sirin.getAge());
		System.out.println("+++++++++++++++++++++++++");
		
		//3.object
		
		employeeInfo ruhan=new employeeInfo();
		ruhan.setInfo("Ruhan", 12345, (byte)27, 6000);
		System.out.println(ruhan.getName());
		System.out.println(ruhan.getSSN());
		System.out.println(ruhan.getSalary());
		System.out.println(ruhan.getAge());
				
			
		
		
		
		
		
		
		
		
	}

}
