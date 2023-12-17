package oopsAssignmentWeek1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountDetails accountDetails = new AccountDetails("12345", "Lijosh", 100.65, 4545, "Lijosh123");

		System.out.println("Choose the type of operation: \n1. ATM \n2. Online Banking");
		String operationType = sc.next();

		if (operationType.equals("1")) {
			System.out.println("Please enter your 4 digit ATM PIN");
			int enteredPin = sc.nextInt();

			if (enteredPin == accountDetails.getPin()) {
				BankOperations atm = new BankOperations(accountDetails.getAvailableBalance());
				System.out.println("Welcome to ATM services," + accountDetails.nameOfAccHolder);
				System.out
						.println("Choose your action:\r\n" + "1. Withdraw\r\n" + "2. Deposit\r\n" + "3. View Balance");
				int atmOperation = sc.nextInt();

				switch (atmOperation) {
				case 1:
					System.out.println("Enter the amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
					break;
				case 2:
					System.out.println("Enter the amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
					break;
				case 3:
					atm.viewBalance();
					break;
				default:
					System.out.println("Invalid choice");
				}
			} else {
				System.out.println("Invalid PIN.");
			}
		} else if (operationType.equals("2")) {
			System.out.println("Please enter your Online banking password");
			String enteredPassword = sc.next();

			if (enteredPassword.equals(accountDetails.getOnlineBankPass()) ) {
				BankOperations onlineBanking = new BankOperations(accountDetails.getAvailableBalance());
				System.out.println("Welcome to Online services," + accountDetails.nameOfAccHolder);
				System.out
						.println("Choose your action:\r\n" + "1. Withdraw\r\n" + "2. Deposit\r\n" + "3. View Balance");
				int onlineOperation = sc.nextInt();

				switch (onlineOperation) {
				case 1:
					System.out.println("Enter the amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    onlineBanking.withdraw(withdrawAmount);
					break;
				case 2:
					System.out.println("Enter the amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    onlineBanking.deposit(depositAmount);
					break;
				case 3:
					onlineBanking.viewBalance();
					break;
				default:
					System.out.println("Invalid choice");
				}
			} else {
				System.out.println("Wrong Password.");
			}

		} else {
			System.out.println("Invalid option, please choose 1 or 2:");
		}

	}

}
