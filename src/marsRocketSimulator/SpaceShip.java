package marsRocketSimulator;

public interface SpaceShip {
	
	//defining the common methods for space rockets R1 & R2

	public boolean launch();

	public boolean land();

	public boolean canCarry(Item item);

	public boolean carry(Item item);

}
