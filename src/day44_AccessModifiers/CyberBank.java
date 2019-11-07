package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
	public static void main(String[] args) {
		BankAccount1 Sarah=new BankAccount1();
		  Sarah.setAccounHolder("Sarah Abdujjabbar");
		  Sarah.setAccounNumber(123456645474646L);
		
	
		
		System.out.println("Name: "+Sarah.getAccountHolder());
		System.out.println("Account Number: "+Sarah.getAccounNumber());
		System.out.println("AvailableBalance is: "+Sarah.getAvailableBalance());//0.0
		
		Sarah.deposit(2000);
		Sarah.ShowBalance();//2000
		
		Sarah.withdraw(2500);
		Sarah.ShowBalance();//-535.0
		Sarah.deposit(100000);
		Sarah.ShowBalance();//99465.0
		System.out.println("================");
		
		BankAccount1 Serkan=new BankAccount1();
		Serkan.getAccountInfo();
		Serkan.setAccounHolder("Serkan Holly");
		Serkan.setAccounNumber(1234566776767l);
		Serkan.getAccountInfo();
		Serkan.deposit(10000);
		Serkan.getAccountInfo();
		Serkan.ShowBalance();
		Serkan.withdraw(3000);
		Serkan.getAccountInfo();
		
		BankAccount1 [] accounts= {Sarah,Serkan};
		ArrayList<BankAccount1> Accounts=new ArrayList<>();
//		Accounts.add(Sarah);
//		Accounts.add(Serkan);
		
		Accounts.addAll(Arrays.asList(accounts));
		
		
		
		
		
		
		
	}

}
