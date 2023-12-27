package cruiseAssignment;

public class CruiseDetails {
    private String cruiseName;
    private double adultPrice;
    private double childrenPrice;
    private int numberOfDays;

    public CruiseDetails(String cruiseName, double adultPrice, double childrenPrice, int numberOfDays) {
        this.cruiseName = cruiseName;
        this.adultPrice = adultPrice;
        this.childrenPrice = childrenPrice;
        this.numberOfDays = numberOfDays;
    }

    public String getCruiseName() {
        return cruiseName;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getChildrenPrice() {
        return childrenPrice;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}