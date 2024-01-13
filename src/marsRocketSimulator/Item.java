package marsRocketSimulator;

public class Item {

	private String name;
	private int weight;

	// Constructor
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	// getter methods
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

}
