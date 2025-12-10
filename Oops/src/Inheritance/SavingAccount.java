package Inheritance;

public class SavingAccount extends BankAccount {

	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}
	@Override
	public void deposit(double amount) {
		if(getBalance()- amount < 100) {
			System.out.println("Minimum balance of Rs100 is required");
		} else {
			super.withdraw(amount);
		}
	}

}
