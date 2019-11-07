package day48_MethodOverriting;

public class Bank_2 {
	public void InterestRate() {
		System.out.println("9 percent");
	}
	public static void main(String[] args) {
		BOFA BOA=new BOFA();
		     BOA.InteresRate();//9, after overrite the method becomas 7
		
		ChaseBank Chase=new ChaseBank();
		     Chase.InterestRate();//9, after overrite the method becomas 4
		     
		CapitalOne Capital=new CapitalOne();
		     Capital.InterestRate();//9, after overrite the method becomas 6
		
		Bank_2 Bank=new Bank_2();// super class method//9
		    Bank.InterestRate();
	}
	

}
class BOFA extends Bank_2{
	public void InteresRate() {//override
		System.out.println("7 percent");
	}
	
}

class ChaseBank extends Bank_2{
	@Override// if this method is not override then gives compilation error
	public void InterestRate() {//override
		System.out.println("4 percent");
	}
	
	//@Override//gives compile er because it is not override
	//public void print() {//gives compile er because it is not override
    //   }
	
	
}

class CapitalOne extends Bank_2{
	public void InterestRate() {//override
		System.out.println("6 percent");
	}
	
}
