package day42OOPEncapsulation;



public class employeeInfo {
	/*
	 Name
	 SSN
	 Age
	 Salary
	 */
	
	private String Name;
	private long SSN;
	private byte Age;
	private double Salary;
	
	//name
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public String getName() {
		return Name;
	}
	
	//SSN
	
	public void setSSN(long SSN) {
		this.SSN=SSN;
	}
	public long getSSN() {
		return SSN;
	}
	
	//age
	
	public byte getAge() {
		return Age;
	}
	
	public void setAge(byte Age) {
		this.Age=Age;
	}
	
	//salary
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary) {
		this.Salary=Salary;
	}
	
	//setInfo
	public  void setInfo(String Name,long SSN, byte Age, double Salary) {
		setName(Name);
		setSSN(SSN);
		setAge(Age);
		setSalary(Salary);
		
	//getInfo	
	}
		public static void main(String[] args) {
			employeeInfo obj=new employeeInfo();
			System.out.println(obj.Name);

	

}
}