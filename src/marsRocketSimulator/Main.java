package marsRocketSimulator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();

		ArrayList<Item> items = simulation.loadItems();
		ArrayList<Rocket> r1Rockets = simulation.loadU1(items);
		ArrayList<Rocket> r2Rockets = simulation.loadU2(items);

		System.out
				.println("Total budget required for R1 rockets: $" + simulation.runSimulation(r1Rockets) + " Millions");

		System.out
				.println("Total budget required for R2 rockets: $" + simulation.runSimulation(r2Rockets) + " Millions");

	}
}
