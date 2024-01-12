package bookingAssignment;

public class DeluxeSuite extends Hotel {

    // Constructor
    public DeluxeSuite() {
        setMaxNumOfAdult(2);
        setMaxNumOfChild(2);
        setRatePerNight(180);
        setNameOfBookingType("Deluxe Suite");

    }

    // Getter and Setter methods for private variables in DeluxeSuite class
    public int getMaxNumOfAdult() {
        return super.getMaxNumOfAdult();
    }

    public void setMaxNumOfAdult(int maxNumOfAdult) {
        super.setMaxNumOfAdult(maxNumOfAdult);
    }

    public int getMaxNumOfChild() {
        return super.getMaxNumOfChild();
    }

    public void setMaxNumOfChild(int maxNumOfChild) {
        super.setMaxNumOfChild(maxNumOfChild);
    }

    public double getRatePerNight() {
        return super.getRatePerNight();
    }

    public String getNameOfBookingType() {
        return super.getNameOfBookingType();
    }


}
