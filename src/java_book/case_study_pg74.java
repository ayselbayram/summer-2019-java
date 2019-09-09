package java_book;

public class case_study_pg74 {
	public static void main(String[] args) {
		System.out.println("Enter a whole number from 1 to 99.");
		 System.out.println("I will find the combinations of coins\nthat equals that amount of change.");
		 
		 
		 int amount, originalAmount, quarter, dime, nickel,penny;
		 amount = 456;
		 originalAmount =amount ;
		 quarter = amount/25;
		 amount = amount % 25;
		 dime = amount /10;
		 amount = amount%10;
		 nickel = amount / 5;
		 amount = amount % 5;
		 penny = amount;
		 amount = originalAmount;
		 System.out.println(originalAmount +"\n");
		 System.out.println(amount + " cents in coins can be given as:");
		 
		 System.out.println(quarter + " quarters");
		 System.out.println(dime + " dimes");
		 System.out.println(nickel + " nickels");
		 System.out.println(penny + " pennies");
		 
		 
		 
		 
	}

}
