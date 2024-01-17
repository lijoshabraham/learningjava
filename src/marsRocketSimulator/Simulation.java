package marsRocketSimulator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Simulation {

	// declares loadItems method and returns an ArrayList of Item objects.
	public ArrayList<Item> loadItems() {

		String filePath = "src/marsRocketSimulator/phase-1.txt";
		ArrayList<Item> items = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File(filePath));

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				Item item = null;
				String[] split = line.split("=");
				item = new Item(split[0], Integer.parseInt(split[1]));
				items.add(item);
				// System.out.println(item.getItemName() + "=" + item.getItemWeight());
			}

		} catch (FileNotFoundException e) {
			System.err.println("File not found. Please check the file path.");
		}

		return items;
	}

	// loadU1 method takes an ArrayList of Items as input to fill the R1 rocket
	ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		int itemCounter = 0;
		int numberOfRockets = 0;

		while (itemCounter < items.size()) {
			Rocket rocket = new R1();

			while (itemCounter < items.size() && rocket.canCarry(items.get(itemCounter))) {
				rocket.carry(items.get(itemCounter));
				itemCounter++;
			}

			rockets.add(rocket);
			rocket = new R1();
			numberOfRockets++;
		}
		//System.out.println("Number of R1 Rockets needed to fill all items: " + numberOfRockets + " Rockets");

		return rockets;
	}

	// loadU2 method takes an ArrayList of Items as input to fill the R2 rocket
	ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		int itemCounter = 0;
		int numberOfRockets = 0;

		while (itemCounter < items.size()) {
			Rocket rocket = new R2();

			while (itemCounter < items.size() && rocket.canCarry(items.get(itemCounter))) {
				rocket.carry(items.get(itemCounter));
				itemCounter++;
			}

			rockets.add(rocket);
			rocket = new R2();
			numberOfRockets++;
		}
		/*
		 * System.out.println("Number of R2 Rockets needed to fill all items: " +
		 * numberOfRockets + " Rockets");
		 * System.out.println("------------------------------------------------");
		 */

		return rockets;
	}

	public int runSimulation(ArrayList<Rocket> rockets) {
		int totalBudget = 0;

		for (int rocketIndex = 0; rocketIndex < rockets.size(); rocketIndex++) {
			Rocket rocket = rockets.get(rocketIndex);

			do {
				if (rocket instanceof R1) {
					rocket = new R1();
				} else {
					rocket = new R2();
				}
				totalBudget += rocket.getRocketCost();
			} while (!(rocket.launch() && rocket.land()));
		}

		return totalBudget;
	}

}
