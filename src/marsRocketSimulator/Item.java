package marsRocketSimulator;

public class Item {

	// variables
	private String itemName;
	private int itemWeight;

	// Constructor
	public Item(String itemName, int itemWeight) {
		super();
		this.itemName = itemName;
		this.itemWeight = itemWeight;
	}

	// getter & setter methods
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

}
