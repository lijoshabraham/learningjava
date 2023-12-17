package oopsAssignmentWeek1;

public class AccountDetails {

	public String accountNumber;
	public String nameOfAccHolder;
	private double availableBalance;
	private int pin;
	private String onlineBankPass;
	
	public AccountDetails(String accountNumber, String nameOfAccHolder, double availableBalance, int pin,
			String onlineBankPass) {
		super();
		this.accountNumber = accountNumber;
		this.nameOfAccHolder = nameOfAccHolder;
		this.availableBalance = availableBalance;
		this.pin = pin;
		this.onlineBankPass = onlineBankPass;
	}

	public int getPin() {
		return pin;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public String getOnlineBankPass() {
		return onlineBankPass;
	}

	public void setAvailableBalance(double newBalance) {
		this.availableBalance = newBalance;
	}

}
