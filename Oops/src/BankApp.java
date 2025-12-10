
public class BankApp {
	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount("SA1234567", "Alam", 5000.0);
		CurrentAccount current = new CurrentAccount("SA707097", "Sumaiya", 5000);
		
		saving.deposit(1000);
		saving.withdraw(1500);
		
		current.deposit(2000);
		current.withdraw(1000);
	}
}
