package day38CustomClassContinue;

public class Employee {
	
	String EmployeeName;
	String EmployeeID;
	int age;
	String SSN;
	String JobTitle;
	double Salary;
	
	
	public Employee(String EmployeeName,String EmployeeID,int age,String SSN,String JobTitle,double Salary) {
		
	this.EmployeeName=EmployeeName;
	this.EmployeeID=EmployeeID;
	this.age=age;
	this.SSN=SSN;
	this.JobTitle=JobTitle;
	this.Salary=Salary;
	}
	
	public void getInfo() {
		System.out.println("---------------------------------------------------");
		System.out.println("Employee' name is: "+EmployeeName);
		System.out.println("Social security Number is: "+SSN);
		System.out.println("Age is: "+age);
		System.out.println("Job Title is: "+JobTitle);
		System.out.println("Employee ID is: "+EmployeeID);
		System.out.println("Salary: "+Salary);
		
		
	}
	

}
