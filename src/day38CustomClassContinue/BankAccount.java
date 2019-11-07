package day38CustomClassContinue;



public class BankAccount {
	/*
	 create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: deposit, withdraw, showBalance
        requiremnts: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ penalty will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
     instance variable:declared int the class outside the method, also called object variable
     instance methids=object methods, no specifier, belongs to the object
     local variables and instance variable should not be the same,
      if we want to use the same name we use  this.keyword
	 this. keyword used for calling the instance variables in an object instance,used within the class
	 this. only used if local and inastance variable are the same names, 
	 if the names are different you dont need to use it
	 this():used for calling constructor, used within the class
	 
	 */
	
	
	String AHolder;
	long ANumber;
	double Balance;
//	String userName,password;
	
//	public BankAccount(String userName,String password) {
//		this.userName=userName;
//		this.password=password;
//	}
	public BankAccount() {//we need to give the def. because we have created obj, with def cantructor already
		
	}
	public BankAccount(String AHolder,long ANumber) {//constructor for creating account
		this.AHolder=AHolder;//this. only used if local and inastance variable are the same names
		this.ANumber=ANumber;
	}
	
	public void Balance() {
		System.out.println("----------------------------------------------------");
		String acct=""+ANumber;
		String AccountNumber="************"+ acct.substring(12);
		System.out.println("Account Holder: "+ AHolder );
		System.out.println("Account number: "+ AccountNumber);
		System.out.println("Available Balance: $"+Balance);
		System.out.println("----------------------------------------------------");
	}
	
	public void Deposit(double amount) {
		String acct=""+ANumber;
		String AccountNumber="************"+ acct.substring(12);
		System.out.println("Depositing "+amount+" to the account "+AccountNumber);
		Balance+=amount;
		System.out.println("New Balance: $"+Balance);
		System.out.println("----------------------------------------------------");
	}
	public void withdraw(double amount) {
		System.out.println("----------------------------------------------------");
		if(Balance<=0) {
			System.out.println("No available balance");
			return;// exits the method withdraw()
		}
		String acct=""+ANumber;
		String AccountNumber="************"+ acct.substring(12);
		System.out.println("Withdrawing "+amount+" to the account "+AccountNumber);
		Balance-=amount;
		
	
		if(Balance<0) {
			Balance-=35;
		}
		
		System.out.println("New Balance: $"+Balance);
		System.out.println("----------------------------------------------------");
		}
	
	public void accountSetUP(String name,long accountNum) {
		AHolder=name;
		ANumber=accountNum;
		
	}
		
		
	}
	



