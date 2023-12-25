package cruiseAssignment;

public class CruiseData {
	private String cruiseName;
	private double adultPrice;
	private double childPrice;
	private int numberOfDays;

	public CruiseData(String cruiseName, double adultPrice, double childPrice, int numberOfDays) {
		this.cruiseName = cruiseName;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
		this.numberOfDays = numberOfDays;
	}

	public String getCruiseName() {
		return cruiseName;
	}

	public double getAdultPrice() {
		return adultPrice;
	}

	public double getChildPrice() {
		return childPrice;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	private static CruiseData cruiseDataArray[] = { new CruiseData("Scenic Cruise", 43.99, 12.99, 3),
			new CruiseData("Sunset Cruise", 52.99, 15.99, 1), new CruiseData("Discovery Cruise", 39.99, 9.99, 4),
			new CruiseData("Mystery Cruise", 45.99, 12.99, 2) };

	public static CruiseData[] getCruiseDataArray() {
		return cruiseDataArray;
	}

}
