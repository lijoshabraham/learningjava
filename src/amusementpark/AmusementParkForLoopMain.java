package amusementpark;

import java.util.Scanner;

public class AmusementParkForLoopMain {

	public static void main(String[] args) {
		// Create object
		AmusementParkForLoop amusementParkForLoop = new AmusementParkForLoop();

		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Check height eligibility
		amusementParkForLoop.checkHeightEligibility();
	}

}
