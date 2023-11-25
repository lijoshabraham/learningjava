package arraysassignment;

public class SumPair {

	int numbers[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
	int targetSum = 15;

	void displaySumPair() {

		int n = numbers.length;
		boolean isFirstPair = true;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = numbers[i] + numbers[j];

				if (sum == targetSum) {
					if (!isFirstPair) {
						System.out.print(", ");
					} else {
						isFirstPair = false;
					}
					System.out.print("[" + numbers[i] + ", " + numbers[j] + "]");
				}

			}
		}

		if (isFirstPair) {
			System.out.println("No pair found with the sum equal to " + targetSum);
		} else {
			System.out.println("\nare the Pair of elements whose sum is equal to " + targetSum);
		}
	}

}
