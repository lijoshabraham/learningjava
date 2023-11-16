package amusementpark;

import java.util.Scanner;

public class AmusementPark {
	// Declare a variable for height
	int height;

	// Counter to keep track of the number of people
	int numberOfPeople = 0;

	// create a method to check height eligibility
	void checkHeightEligibility() {
		// Check if the number of people is less than
		while (numberOfPeople < 3) {
			// Create Scanner object to read input from the user
			Scanner sc = new Scanner(System.in);

			// Receive input from the user for height
			System.out.println("Enter height for person in cm, or enter 1 to exit:");
			height = sc.nextInt();

			// Check if the user wants to exit
			if (height == 1) {
				System.out.println("Exiting.");
				sc.close();
				break;
			}

			// check if the person is eligible for the ride
			if (height >= 90 && height <= 200) {
				System.out.println("Allowed to ride!");
				// Increment the number of people
				numberOfPeople++;
			} 
			
			 if (numberOfPeople == 3) {
				System.out.println("Maximum riders reached");
			}
			 else {
				System.out.println("Not allowed to ride.");
			}

		}
	}
}
