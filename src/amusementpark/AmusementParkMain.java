package amusementpark;

import java.util.Scanner;

public class AmusementParkMain {

	public static void main(String[] args) {
		// Create object
		AmusementPark amusementPark = new AmusementPark();

		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Receive input from the user for height
		System.out.println("Enter your height in cm");
		amusementPark.height = sc.nextInt();

		// Check height eligibility
		amusementPark.checkHeightEligibility();
	}

}
