
public class SavingAccount extends BankAccount {
	public SavingAccount(String ac, String name, double balance) {
		super(ac,name,balance);
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposited Rs" + amount + " successfully" );
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount < getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Witdraw Rs" + amount +" succeccfully");
		} else {
			System.out.println("Insufficient balance");
		}
		
	}
	
}
