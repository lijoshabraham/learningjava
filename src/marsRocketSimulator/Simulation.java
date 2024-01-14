package marsRocketSimulator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Simulation {

	// declares loadItems method and returns an ArrayList of Item objects.
	public ArrayList<Item> loadItems() throws FileNotFoundException {

		String readLine;

		// declaring and initializing items ArrayList that will store Item object
		ArrayList<Item> items = new ArrayList<>();

		// File path
		final String filePath = "src/marsRocketSimulator/phase-1.txt";

		// reading the file using Scanner
		Scanner sc = new Scanner(new File(filePath));

		// Reading the file line by line
		while (sc.hasNextLine()) {
			Item item = new Item(); // create an Item object for each item
			readLine = sc.nextLine(); // reading the item
			int index = readLine.indexOf("="); // finding index of "="
			item.setItemName(readLine.substring(0, index)); // extracting the name of item
			item.setItemWeight(Integer.parseInt(readLine.substring(index + 1))); // extracting the weight of item
			items.add(item); // adding it to an ArrayList of Items
			System.out.println(item.getItemName() + "=" + item.getItemWeight());
		}

		sc.close();

		// returning the ArrayList
		return items;
	}

	// loadU1 method
	ArrayList<R1> loadU1(ArrayList<Item> items) {
		ArrayList<R1> r1Rockets = new ArrayList<>(); // Initialize ArrayList to store fully loaded R1 rockets
		R1 rocket = new R1(); // creating a new r1 rocket
		int itemCounter; // keep track of the current item in the list.

		// System.out.println("\nU1 Rocket weight = " + r.weight + "; maxWeight = " +
		// r.maxWeight);

		for (itemCounter = 0; itemCounter < items.size(); itemCounter++) {

			// check if this rocket can carry items
			if (rocket.canCarry(items.get(itemCounter))) {
				r1Rockets.add(rocket); // adding the fully loaded rocket to the r1Rocket list

				R1 anotherRocket = new R1(); // creating another rocket after filling first with as many items possible

			}
			System.out.println("Rocket loaded & Current weight: " + rocket.getCurrentWeight());
		}

		return r1Rockets; // returning ArrayList of R1 rocket that are fully loaded.
	}

}
