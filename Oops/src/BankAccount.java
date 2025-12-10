
public abstract class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	public abstract void  deposit(double amount);
	public abstract void  withdraw(double amount);
	
	public void displayAccountDetails(boolean showBalance ) {
		System.out.println("Account No: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		if(showBalance)
		System.out.println("Balance: " + balance);
	}
	
}
