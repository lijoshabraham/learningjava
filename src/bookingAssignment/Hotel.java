package bookingAssignment;

import java.util.Scanner;

public class Hotel extends MyBookings {
	private Scanner scanner = new Scanner(System.in);
	private double ratePerNight;
	private double totalMealPrice;
	private int maxNumOfAdult;
	private int maxNumOfChild;

	// setting the rates common for family & deluxe.
	public Hotel() {
		setTaxRate(0.18);
		setChildMealPrice(5);
		setAdultMealPrice(25);
	}

	@Override
	public void calculateTotalAfterTax() {
		double totalRoomPrice = getNumberofDaysOfStay() * getRatePerNight();
		setTotalMealPrice(askForMeal() ? calculateMealPrice() : 0);
		setTotalPriceOfStay(totalRoomPrice + getTotalMealPrice());

		// Display Bill details
		System.out.println("The total amount you will be charged is");
		System.out.println(getNameOfBookingType() + " @ " + getNumOfDaysOfStay() + "\t\t\t\t: $" + totalRoomPrice);
		System.out.println("Lunch Pre-Booked Special Rate Adults\t: $" + (getAdultMealPrice() * getNumberOfAdults()));
		System.out
				.println("Lunch Pre-Booked Special Rate Children\t: $" + (getChildMealPrice() * getNumberOfChildren()));
		System.out.println("Total Price\t\t\t\t: $" + getTotalPriceOfStay());
		System.out.println("HST @ 18%\t\t\t\t: $" + (getTotalPriceOfStay() * getTaxRate()));
		double finalPrice = getTotalPriceOfStay() + (getTotalPriceOfStay() * getTaxRate());
		System.out.println("Final Price\t\t\t\t: $" + finalPrice);
		System.out.println("Final Price : $" + finalPrice);
		addBooking(this);
	}

	@Override
	public double calculateMealPrice() {
		double adultMealRate = getNumberOfAdults() * getAdultMealPrice();
		double childMealRate = getNumberOfChildren() * getChildMealPrice();
		totalMealPrice = (adultMealRate + childMealRate) * getNumOfDaysOfStay();
		return totalMealPrice;
	}

	@Override
	public void collectDetails() {
		System.out.println("Enter the number of adults:");
		setNumberOfAdults(scanner.nextInt());

		System.out.println("Enter the number of children:");
		setNumberOfChildren(scanner.nextInt());

		while (getNumberOfAdults() > getMaxNumOfAdult() || getNumberOfChildren() > getMaxNumOfChild()) {
			System.out.println("The room is not suitable for the number of guests. "
					+ "Please select again or select separate rooms one at a time.");

			System.out.println("Enter the number of adults:");
			setNumberOfAdults(scanner.nextInt());

			System.out.println("Enter the number of children:");
			setNumberOfChildren(scanner.nextInt());
		}

		// If the number of people is within the maximum capacity then call askForMeal()
		boolean needMeal = askForMeal();

		if (needMeal) {
			getNumberofDaysOfStay();
			calculateTotalAfterTax();
		} else {
			// If the user doesn't need meal then set total meal price to 0 and ask number
			// of days of stay
			getNumberofDaysOfStay();
			setTotalMealPrice(0);
			calculateTotalAfterTax();
		}
	}

	public void setTotalMealPrice(double totalMealPrice) {
		this.totalMealPrice = totalMealPrice;
	}

	public boolean askForMeal() {
		System.out.println("All rooms come with free breakfast. "
				+ "Do you want to add lunch in your room as well at a discounted pre-booking rate? (yes/no)");
		String response = scanner.next().toLowerCase();
		return response.equals("yes");
	}

	@Override
	public void chooseType() {
		System.out.println("Please enter the room you want to select (Deluxe/Family): ");
		System.out.println("Delux Suite: accommodates 2 adults and 2 children at the rate of $180/ night");
		System.out.println("Family Suite: accommodates 4 adults and 4 children at $230/ night.");

		String roomType = scanner.next().toLowerCase();

		switch (roomType) {
		case "deluxe":
			DeluxeSuite deluxe = new DeluxeSuite();
			setNameOfBookingType(deluxe.getNameOfBookingType());
			setRatePerNight(deluxe.getRatePerNight());
			setMaxNumOfAdult(deluxe.getMaxNumOfAdult());
			setMaxNumOfChild(deluxe.getMaxNumOfChild());
			collectDetails();
			break;
		case "family":
			FamilySuite familySuite = new FamilySuite();
			setNameOfBookingType(familySuite.getNameOfBookingType());
            setRatePerNight(familySuite.getRatePerNight());
            setMaxNumOfAdult(familySuite.getMaxNumOfAdult());
            setMaxNumOfChild(familySuite.getMaxNumOfChild());
			collectDetails();
			break;
		default:
			System.out.println("Invalid room type.");
			break;
		}
	}

	public int getNumberofDaysOfStay() {
		System.out.println("Enter the number of days of stay");
		setNumOfDaysOfStay(scanner.nextInt());
		return getNumOfDaysOfStay();
	}

	// getter and setter methods for private variables in Hotel class
	public double getRatePerNight() {
		return ratePerNight;
	}

	public double getTotalMealPrice() {
		return totalMealPrice;
	}

	public int getMaxNumOfAdult() {
		return maxNumOfAdult;
	}

	public int getMaxNumOfChild() {
		return maxNumOfChild;
	}

	public void setMaxNumOfAdult(int maxNumOfAdult) {
		this.maxNumOfAdult = maxNumOfAdult;
	}

	public void setMaxNumOfChild(int maxNumOfChild) {
		this.maxNumOfChild = maxNumOfChild;
	}

	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}

}
