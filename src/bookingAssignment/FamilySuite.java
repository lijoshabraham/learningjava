package bookingAssignment;

public class FamilySuite extends Hotel {

    public FamilySuite() {
        setMaxNumOfAdult(4);
        setMaxNumOfChild(2);
        setRatePerNight(230);
        setNameOfBookingType("Family Suite");

    }

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

