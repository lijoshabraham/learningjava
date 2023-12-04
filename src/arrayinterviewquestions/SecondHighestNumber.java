package arrayinterviewquestions;

public class SecondHighestNumber {
	int[] arrayElements;
	int temp = 0;
	int i = 0;
	int j = 1;

	void arraySorting() {
		for (i = 0; i < arrayElements.length - 1; i++) {
			for (j = i + 1; j < arrayElements.length; j++) {
				if (arrayElements[i] > arrayElements[j]) {
					temp = arrayElements[i];
					arrayElements[i] = arrayElements[j];
					arrayElements[j] = temp;
				}
			}
		}
		printSortedArray();
	}

	void printSortedArray() {
		System.out.print("\nSorted Array: ");
		for (i = 0; i < arrayElements.length; i++) {
			System.out.print(arrayElements[i] + " ");
		}
		printSecondHighestArray();
	}

	void printSecondHighestArray() {
		System.out.println("\nSecond highest number is: " + arrayElements[arrayElements.length - 2]);
	}
}
