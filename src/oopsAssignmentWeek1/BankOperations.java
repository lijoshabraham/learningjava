package oopsAssignmentWeek1;

public class BankOperations {
	private double balance;

	public BankOperations(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful! Remaining balance: $" + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful! New balance: $" + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void viewBalance() {
		System.out.println("Current balance: $" + balance);
	}

}
