package amusementpark;

public class AmusementPark {
	// Declare two variables for height
	int height;

	// create a method to check height eligibility
	void checkHeightEligibility() {
		// check the person is eligible for ride
		if (height >= 90 && height <= 200) {
            System.out.println("Allowed to ride!");
            System.out.println("Not allowed to ride.");
        }
	}
}
