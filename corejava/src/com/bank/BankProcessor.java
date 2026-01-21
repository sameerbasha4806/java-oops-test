package com.bank;

public class BankProcessor {

	public static void main(String[] args) {
	BankAccount customer1 =new BankAccount(123456,"Asifa",80000.0);
	System.out.println("Account Number: "+customer1.getaccountNumber());
	System.out.println("Account HolderName: "+customer1.getaccountHolderName());
	System.out.println("Current Balance :"+customer1.getbalance());
	customer1.deposit(10000.0);
	System.out.println("After Deposit Balance : "+customer1.getbalance());
	customer1.withdraw(20000.0);
	System.out.println("After Withdraw Balance: "+customer1.getbalance());
	System.out.println("================================================");
	BankAccount customer2 =new BankAccount(56789,"Sameer",70000.0);
	System.out.println("Account Number: "+customer2.getaccountNumber());
	System.out.println("Account HolderName: "+customer2.getaccountHolderName());
	System.out.println("Current Balance :"+customer2.getbalance());
	customer2.deposit(0.0);
	System.out.println("After Deposit Balance : "+customer2.getbalance());
	customer2.withdraw(80000.0);
//	System.out.println("After Withdraw Balance : "+customer2.getbalance());

	}

}
