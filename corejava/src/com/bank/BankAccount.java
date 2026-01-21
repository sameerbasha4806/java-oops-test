package com.bank;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountNumber,String accountHolderName,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;		
		
	}
	public int getaccountNumber() {
		return accountNumber;
	}
	public String getaccountHolderName() {
		return accountHolderName;
	}
	public double getbalance() {
		return balance;
	}
	public void setaccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setaccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited Succeffully");
		}else {
			System.out.println("Invalid Deposit");
		}
		
	}
	public void withdraw(double amount) {
		if(balance>=amount &&amount>0) {
			balance-=amount;
			System.out.println("Withdraw Successfully");
		}else {
			System.out.println("Insufficient Balance or Does Not Withdraw");
		}
	}

}
