package arrayinterviewquestions;

import java.util.Arrays;

public class ArraySorting {

	int[] arrayElements;

	void printArrayElements() {
		System.out.println("Original array: " + Arrays.toString(arrayElements));
	}

	void sortedArray() {
		Arrays.sort(arrayElements);		
		System.out.println("Sorted array: " + Arrays.toString(arrayElements));
	}

}
