package amusementpark;

import java.util.Scanner;

public class AmusementParkMain {

	public static void main(String[] args) {
		// Create object
		AmusementPark amusementPark = new AmusementPark();

		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);


		// Check height eligibility
		amusementPark.checkHeightEligibility();
	}

}
