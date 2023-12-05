package arrayinterviewquestions;

import java.util.Scanner;

public class DescendingOrderArray {

	Scanner sc = new Scanner(System.in);
	int[] arrayElements;
	int arrayLength;

	void userInput() {
		System.out.println("Enter the array length");
		arrayLength = sc.nextInt();

		System.out.println("Enter array elements");
		arrayElements = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			arrayElements[i] = sc.nextInt();
		}

		sc.close();
		printArrayElements();
	}

	void printArrayElements() {
		System.out.print("\nOriginal array Elements: [");
		for (int i = 0; i < arrayElements.length; i++) {
			System.out.print(arrayElements[i]);
			if (i < arrayElements.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		printDescendingOrder();
	}

	void printDescendingOrder() {
		System.out.print("\nArray in Descending Order: [");
		for (int i = arrayLength - 1; i >= 0; i--) {
			System.out.print(arrayElements[i]);
			if (i > 0) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
