package arrayinterviewquestions;

import java.util.Scanner;

public class DescendingOrderArrayMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length");
        int arrayLength = sc.nextInt();

        System.out.println("Enter array elements");
        int[] arrayElements = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arrayElements[i] = sc.nextInt();
        }

        DescendingOrderArray descendingOrderArray = new DescendingOrderArray();
        descendingOrderArray.arrayElements = arrayElements;

        descendingOrderArray.printArrayElements();

        descendingOrderArray.printDescendingOrder();

        sc.close();
    }
}
