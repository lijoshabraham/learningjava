package cruiseAssignment;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {

		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise you want to select\n");

		for (CruiseData cruiseData : CruiseData.getCruiseDataArray()) {
			System.out.println(cruiseData.getCruiseName());
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the first word of the cruise you want to select: ");
		String enteredWord = sc.next();

		String selectedCruise = CruiseUtility.findCruiseByFirstWord(enteredWord, CruiseData.getCruiseDataArray());

		if (selectedCruise != null) {

			CruiseData selectedCruiseData = CruiseUtility.findCruiseDataByName(selectedCruise,
					CruiseData.getCruiseDataArray());

			if (selectedCruiseData != null) {

				int numberOfDays = selectedCruiseData.getNumberOfDays();

				System.out.println("\nThe cruise that you have selected is " + selectedCruise + " which is a "
						+ numberOfDays + "-day cruise.");
			} else {
				System.out.println("\nInvalid selection. Please enter a valid cruise name.");
			}
		}

		sc.close();
	}
}
