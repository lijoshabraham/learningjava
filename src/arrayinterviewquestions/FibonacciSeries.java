package arrayinterviewquestions;

public class FibonacciSeries {
	int limit;
	
	void printFibonacciSeries() {
		int firstNumber = 1;
		int secondNumber = 1;
        while (firstNumber <= limit) {
            System.out.print(firstNumber + " ");
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }
	}
}
