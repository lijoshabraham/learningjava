// CruiseMain.java
package cruiseAssignment;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		CruiseDetails[] cruises = { new CruiseDetails("Scenic Cruise", 43.99, 12.99, 3),
				new CruiseDetails("Sunset Cruise", 52.99, 15.99, 1),
				new CruiseDetails("Discovery Cruise", 39.99, 9.99, 4),
				new CruiseDetails("Mystery Cruise", 45.99, 12.99, 2) };

		boolean chooseAnotherCruise = true;
		CruiseDetails cruiseDetails = null;

		CruiseBooking cruiseBooking = new CruiseBooking(null, 0, 0);

		while (chooseAnotherCruise) {
			System.out.println("We offer 4 different packages as displayed below. "
					+ "Please enter the cruise that you want to select.\n");

			for (int i = 0; i < cruises.length; i++) {
				System.out.println(cruises[i].getCruiseName());
			}

			System.out.println("\nEnter the cruise name:");
			String selectedCruiseName = scanner.nextLine();

			for (int i = 0; i < cruises.length; i++) {
				if (cruises[i].getCruiseName().equalsIgnoreCase(selectedCruiseName)) {
					cruiseDetails = cruises[i];
					break;
				}
			}

			if (cruiseDetails == null) {
				System.out.println("Invalid cruise Name.");
				continue;
			}

			cruiseBooking.setSelectedCruise(cruiseDetails);
			cruiseBooking.displaySelectedCruiseInfo();

			System.out.println(
					"\nPlease press Y if you want to continue with the selected cruise or press any other key to select another:");
			String continueSelectedCruise = scanner.nextLine();
			chooseAnotherCruise = !continueSelectedCruise.trim().equalsIgnoreCase("Y");

			if (chooseAnotherCruise) {
				System.out.println("Do you want to select another cruise? (Y/N):");
				String selectAnotherCruiseOption = scanner.nextLine();
				chooseAnotherCruise = selectAnotherCruiseOption.equalsIgnoreCase("Y");
			}

			if (chooseAnotherCruise) {
				continue;
			}

			while (true) {
				System.out.println("Enter the number of adults:");
				int numAdults = Integer.parseInt(scanner.nextLine());

				System.out.println("Enter the number of children:");
				int numChildren = Integer.parseInt(scanner.nextLine());

				if (numAdults > 0 || numChildren > 0) {
					cruiseBooking.setNumAdults(numAdults);
					cruiseBooking.setNumChildren(numChildren);
					break;
				} else {
					System.out.println("Please select at least 1 person to continue.");
				}
			}

		
			for (int i = 1; i <= cruiseBooking.getNumChildren(); i++) {
			    while (true) {
			        System.out.println("Enter the age of child " + i + ":");
			        int age = Integer.parseInt(scanner.nextLine());

			        // Assuming children below 5 can avail the service for free
			        if (age < 5) {
			            cruiseBooking.setNumChildren(cruiseBooking.getNumChildren() - 1);
			            break;
			        } else if (age > 12) {
			            System.out.println("Child age should be less than or equal to 12. Please enter the age again.");
			        } else {
			            
			            break;
			        }
			    }
			}


			// when no passengers are selected
			cruiseBooking.ifNoPassengersSelected();

			// if no passengers are selected then continue to the next iteration
			if (cruiseBooking.noPassengersSelected()) {
				continue;
			}

			// if the user wants to add meals
			cruiseBooking.askUserForMeals();

			double totalCost = cruiseBooking.calculateTotalCost();
			double hst = 0.15 * totalCost;
			double finalCost = cruiseBooking.calculateFinalCost(totalCost, 0.15);

			cruiseBooking.calculateFinalPrice(totalCost, finalCost, hst);
			scanner.close();
		}

	}

}
