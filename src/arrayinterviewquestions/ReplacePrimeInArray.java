package arrayinterviewquestions;

import java.util.Scanner;

public class ReplacePrimeInArray {

	Object[] arrayElements;
	int num;

	void takeUserInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length");
		int arrayLength = sc.nextInt();

		System.out.println("Enter array elements");
		arrayElements = new Object[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			arrayElements[i] = sc.nextInt();
		}
		sc.close();
	}

	void replacePrimeInArray() {
		for (int i = 0; i < arrayElements.length; i++) {
			num = (Integer) arrayElements[i];
			if (isPrime()) {
				arrayElements[i] = "prime";
			}
		}
		
	}

	void printOriginalArray() {
		System.out.print("\nOriginal array Elements: [");
		for (int i = 0; i < arrayElements.length; i++) {
			System.out.print(arrayElements[i]);
			if (i < arrayElements.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	void printReplacedArray() {
		System.out.print("\nArray Elements with Prime replaced: [");
		for (int i = 0; i < arrayElements.length; i++) {
			System.out.print(arrayElements[i]);
			if (i < arrayElements.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	boolean isPrime() {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
