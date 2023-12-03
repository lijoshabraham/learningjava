package arrayinterviewquestions;

import java.util.Scanner;

public class FindLargestNumber {

	Scanner sc = new Scanner(System.in);
	int size;
	int[] numbers;

	void userInputs() {

		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		numbers = new int[size];

		System.out.println("\nEnter the numbers: ");
		for (int i = 0; i < size; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			numbers[i] = sc.nextInt();
		}
		displayNumbers();
	}

	void displayNumbers() {
		
		System.out.print("\nNumbers: [");
		for (int i = 0; i < size; i++) {
			System.out.print(numbers[i]);
			if (i < size - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		findAndDisplayLargestNumber();
	}

	void findAndDisplayLargestNumber() {
		
		int maxNumber = numbers[0];
		for (int j = 1; j < size; j++) {
			if (numbers[j] > maxNumber) {
				maxNumber = numbers[j];
			}
		}
		System.out.println("The largest number is: " + maxNumber);
	}
}
