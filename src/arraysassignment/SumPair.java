package arraysassignment;

public class SumPair {

	int numbers[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
	int targetSum = 15;

	void displaySumPair() {

		int n = numbers.length;
		int pairCount = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = numbers[i] + numbers[j];
				if (sum == targetSum) {
					if (pairCount>0) {
						System.out.print(" , ");
					} 
					System.out.print("[" + numbers[i] + ", " + numbers[j] + "]");
					pairCount++;
				}
			}
		}

		if (pairCount==0) {
			System.out.println("No pair found with the sum equal to " + targetSum);
		}
		else if (pairCount==1){
			System.out.println("\nis the Pair of elements whose sum is equal to " + targetSum);
		}
		else {
			System.out.println("\nare the Pairs of elements whose sum is equal to " + targetSum);
		}
	}
}
