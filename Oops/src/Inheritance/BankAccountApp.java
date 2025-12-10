package Inheritance;

import java.util.Scanner;

public class BankAccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount("SH1254635", 500);
		
		int choice;
		do {
			System.out.println("Bank Menu");
			System.out.println("1. Deposit Ampunt");
			System.out.println("2. Withdraw");
			System.out.println("3. Check balance");
			System.out.println("4. exit");
			choice = sc.nextInt();
				
			
			
		}while(choice !=4);
	}
}
