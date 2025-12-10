package Inheritance;

public class BankAccount {
	private String accountNumber;
	private double balance=0.0;
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid amount, try again");
		} else {
			balance = balance + amount;
			System.out.println("Rs" + amount + " scuccessfully deposited");
		}		
	}
	public void withdraw(double amount) {
		if(amount > balance ) {
			System.out.println("Insufficient balance");
		} else {
			balance = balance - amount;
			System.out.println("You have successfully " + amount + " withdraw");
		}
	}
	public double getBalance() {
		return balance;
	}
}
