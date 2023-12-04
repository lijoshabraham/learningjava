package arrayinterviewquestions;

public class DescendingOrderArray {
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

    void printDescendingOrder() {
        System.out.print("\nArray in Descending Order: [");
        for (int i = arrayElements.length - 1; i >= 0; i--) {
            System.out.print(arrayElements[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
