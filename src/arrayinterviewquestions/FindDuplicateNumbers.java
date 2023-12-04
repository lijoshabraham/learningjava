package arrayinterviewquestions;

import java.util.Scanner;

public class FindDuplicateNumbers {
	int[] arrayElements;

	void userInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length");
		int arrayLength = sc.nextInt();

		System.out.println("Enter array elements");
		arrayElements = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			arrayElements[i] = sc.nextInt();
		}
		findAndPrintDuplicates();
		sc.close();
	}

	void findAndPrintDuplicates() {
		System.out.println("\nRepeated numbers in the array:");

        for (int i = 0; i < arrayElements.length - 1; i++) {
            if (arrayElements[i] != -1) {
                int count = 1;

                for (int j = i + 1; j < arrayElements.length; j++) {
                    if (arrayElements[i] == arrayElements[j]) {
                        count++;
                        arrayElements[j] = -1;
                    }
                }

                if (count > 1) {
                    System.out.println(arrayElements[i] + " repeated " + count + " times");
                }
            }
        }
    }
}


