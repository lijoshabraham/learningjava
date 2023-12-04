package arrayinterviewquestions;

import java.util.Scanner;

public class FibonacciSeriesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a limit to print the Fibonacci series up to: ");
		int limit = sc.nextInt();

		FibonacciSeries fibonacciSeries = new FibonacciSeries();

		fibonacciSeries.limit = limit;

		fibonacciSeries.printFibonacciSeries();

		sc.close();
	}

}
