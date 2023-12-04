package arrayinterviewquestions;

import java.util.Scanner;

public class ReverseArrayInPlace {

	int[] arrayElements;

	void takeUserInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length");
		int arrayLength = sc.nextInt();

		System.out.println("Enter array elements");
		arrayElements = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			arrayElements[i] = sc.nextInt();
		}
		
		sc.close();
	}

	void reverseArrayInPlace() {
		int start = 0;
		int end = arrayElements.length - 1;

		while (start < end) {
			int temp = arrayElements[start];
			arrayElements[start] = arrayElements[end];
			arrayElements[end] = temp;
			start++;
			end--;
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

	void printReversedArray() {
		System.out.print("\nReversed array Elements: [");
		for (int i = 0; i < arrayElements.length; i++) {
			System.out.print(arrayElements[i]);
			if (i < arrayElements.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
