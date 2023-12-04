package arrayinterviewquestions;

import java.util.Scanner;

public class SmallestAndLargestNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length: ");
        int arrayLength = sc.nextInt();

        System.out.println("\nEnter array elements:");
        int[] arrayElements = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arrayElements[i] = sc.nextInt();
        }

        SmallestAndLargestNumber smallestAndLargestNumber = new SmallestAndLargestNumber();
        smallestAndLargestNumber.arrayElements = arrayElements;

        smallestAndLargestNumber.smallestNumber();

        smallestAndLargestNumber.largestNumber();

        sc.close();
	}

}
