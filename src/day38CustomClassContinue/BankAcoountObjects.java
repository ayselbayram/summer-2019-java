package day38CustomClassContinue;

public class BankAcoountObjects {
	public static void main(String[] args) {
		BankAccount account1=new BankAccount();
		
		account1.AHolder="Filiz Coskunuzer";
		account1.ANumber=1234567891234567L;
		
		account1.Balance();
		account1.Deposit(2000);
		account1.Deposit(4000);
		account1.withdraw(3000);
		account1.withdraw(3001);
		account1.withdraw(2000);
		account1.Deposit(2000000);
		
		BankAccount account2=new BankAccount();
		account2.accountSetUP("Baris Coskunuzer", 1234567891234567L);
		account2.Balance();
		account2.Deposit(1000000);
		account2.withdraw(500000);
		
		BankAccount account3=new BankAccount("Selim Coskunuzer",3647587395874638L);
			
		account3.Balance();
		account3.Deposit(4000);
		account3.withdraw(5000.0);
		account3.withdraw(10);
		account3.Deposit(2000);
		
	
	}	

}
