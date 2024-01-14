package marsRocketSimulator;

public interface SpaceShip {
	
	//defining the common methods

	public boolean launch();

	public boolean land();

	public boolean canCarry(Item item);

	public void carry(Item item);

}
