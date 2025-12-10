
public class CurrentAccount extends BankAccount {

	public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposited Rs" + amount + " in current Bank Account");
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= getBalance()+1000) {
			setBalance(getBalance()-amount);
			System.out.println("Withdraw Rs" + amount+ " successfully from current bank account");
		} else {
			System.out.println("Exceeded overdraft limit in Current Account");
		}

	}

}
