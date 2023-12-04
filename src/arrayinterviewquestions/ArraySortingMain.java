package arrayinterviewquestions;

import java.util.Scanner;

public class ArraySortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length");
        int arrayLength = sc.nextInt();

        System.out.println("Enter array elements");
        int[] arrayElements = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arrayElements[i] = sc.nextInt();
        }

        ArraySorting arraySorting = new ArraySorting();
        arraySorting.arrayElements = arrayElements;

        arraySorting.printArrayElements();

        arraySorting.sortedArray();

        sc.close();
	}

}
