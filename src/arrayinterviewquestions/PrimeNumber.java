package arrayinterviewquestions;

import java.util.Scanner;

public class PrimeNumber {
	Scanner sc = new Scanner(System.in);
	double inputNumber;

	double getNumberFromUser() {
		System.out.println("Enter a positive number");
		inputNumber = sc.nextDouble();

		while (inputNumber <= 0) {
			System.out.println("Please enter a positive number:");
			inputNumber = sc.nextDouble();
		}
		return inputNumber;
	}
	
	boolean isPrime() {
		for (int i = 2; i <= inputNumber/2; i++) {
			if (inputNumber % i == 0) {
				return false;
			}
		}
		if (inputNumber <= 1) {
			return false;
		}
		
		return true;
	}

	void displayResult() {
		if (isPrime()) {
			System.out.println(inputNumber + " is a prime number");
		} else {
			System.out.println(inputNumber + " is not a prime number");
		}
	}
}