package marsRocketSimulator;

public class Item {

	private String itemName; // name of the item to be carried in the rocket
	private int itemWeight; // weight of the item to be carried in the rocket

	// Constructor
	public Item() {
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
