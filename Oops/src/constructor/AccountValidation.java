package constructor;

public class AccountValidation {
	String accountNumber;
	double balance ;
	public AccountValidation(String accountNumber, double balance) {
		if(accountNumber == null || accountNumber.isEmpty()) {
			System.out.println("Error: Account Number should not be empty or Null, Please enter valid account number");
			return;
		}
		if(balance <= 0) {
			System.out.println("Error: Balance should not be negative");
			return;
		}
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
