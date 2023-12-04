package arrayinterviewquestions;

public class SmallestAndLargestNumber {
	int[] arrayElements;
	
	void printArrayElements() {
        System.out.print("\nArray Elements: [");
        for (int i = 0; i < arrayElements.length; i++) {
            System.out.print(arrayElements[i]);
            if (i < arrayElements.length - 1) {
				System.out.print(", ");
			}
        }
        System.out.println("]");
    }

    void smallestNumber() {
		int minNumber = arrayElements[0];
		for (int i = 1; i < arrayElements.length; i++) {
			if (arrayElements[i] < minNumber) {
				minNumber = arrayElements[i];
			}
		}
		System.out.println("\nThe smallest number is: " + minNumber);
    }
    
    void largestNumber() {
		int maxNumber = arrayElements[0];
		for (int i = 1; i < arrayElements.length; i++) {
			if (arrayElements[i] > maxNumber) {
				maxNumber = arrayElements[i];
			}
		}
		System.out.println("\nThe largest number is: " + maxNumber);
    }
}
