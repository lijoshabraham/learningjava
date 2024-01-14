package marsRocketSimulator;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Simulation simulation = new Simulation();
		simulation.loadItems();
	}

}
