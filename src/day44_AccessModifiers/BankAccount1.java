package day44_AccessModifiers;

public class BankAccount1 {
	/*
	 * WarmUp: creata a custom class for bankaccount
    The attributes/data that the class can have are: 
            AccountHolder, AccountNumber, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    requiremnets:
            1. apply encapsulations
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing account is greater than available balance,
                 35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, 
                account holder won't be able to withdraw money
	 */
	private long AccountNumber;
	private String AccounHolder;
	private double AvailableBalance;
	
	//getter:instance return method,returnt type must mathc instance variable type
	
	public String getAccountHolder() {
		return AccounHolder;
	}
	
	public double  getAvailableBalance() {
		return AvailableBalance;
	}
	
	public  long getAccounNumber() {
		return AccountNumber;
	}
	
	//setter(modify):instance void method, passes a parameter, 
	//parameters data type needs to match the inastance variables data type
	
	public void setAccounHolder(String AccounHolder) {
		this.AccounHolder=AccounHolder;
	}
	
	public void setAccounNumber(long AccounNumber) {
		this.AccountNumber=AccounNumber;
	}
	
	//no need to set method for available balance
	
	//actions:
	    //deposit
	     
	 public void deposit(double amount) {
		 AvailableBalance +=amount;
		 
	 }
	 
	 //withdraw
	 
	 public void withdraw(double amount) {
		 
//	 if(AvailableBalance<=0) {
//		 System.out.println("your account balance is less or equal to zero");
//		 return;
//	 } if(amount>AvailableBalance) {
//		 AvailableBalance-=35;
//		 
//		 
//	 }AvailableBalance-=amount;
		 
		 if(AvailableBalance<=0) {
			 System.out.println("your account balance is less or equal to zero"); 
		 }else if(amount>AvailableBalance) {
			 AvailableBalance-=amount; 
			 AvailableBalance-=35;
		 }else {
			 AvailableBalance-=amount;
		 }
	 }
	 
	 //checking balance
	 
	 public void ShowBalance() {
		 System.out.println("Available balance is: "+AvailableBalance);
	 }
	 
	 //getInfo
	 
	 public void getAccountInfo() {
		 System.out.println("Name: "+getAccountHolder());
			System.out.println("Account Number: "+getAccounNumber());
			System.out.println("AvailableBalance is: "+getAvailableBalance());
	 }
	 
	 
	 
	
}	
	
	
	
	


