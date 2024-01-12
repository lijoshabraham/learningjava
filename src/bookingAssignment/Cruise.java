package bookingAssignment;
import java.util.Scanner;

public class Cruise extends MyBookings {
	Scanner scanner = new Scanner(System.in);
	private double adultRate;
	private double childRate;
	private String specificFeatureName;
	private double specificFeaturePrice;
	private boolean isneedSpecialFeature;

	public Cruise() {
		setTaxRate(0.15);
		setChildMealPrice(4.99);
		setAdultMealPrice(20.99);
	}

	@Override
	public void calculateTotalAfterTax() {
		double adultRateTotal = getNumberOfAdults() * getAdultRate() * getNumOfDaysOfStay();
		double childRateTotal = getNumberOfChildren() * getChildRate() * getNumOfDaysOfStay();
		double specialFeatureTotal = isIsneedSpecialFeature()
				? getSpecificFeaturePrice() * (getNumberOfAdults() + getNumberOfChildren())
				: 0;
		double mealPrice = calculateMealPrice() * getNumOfDaysOfStay();

		double totalPrice = adultRateTotal + childRateTotal + specialFeatureTotal + mealPrice;

		System.out.println("Your Package includes:\n");
		System.out.println(getNameOfBookingType() + " Adults @ " + getNumberOfAdults() + " : $" + adultRateTotal);
		System.out.println(
				getNameOfBookingType() + " Children above 5 @ " + getNumberOfChildren() + " : $" + childRateTotal);

		System.out.println("Buffet Special Price Adults @ " + getNumberOfAdults() + " : $" + mealPrice
				+ (getNumberOfAdults() * getAdultRate()));
		System.out.println("Buffet Special Price Children above 5 @ " + getNumberOfChildren() + " : $"
				+ (getNumberOfChildren() * getChildMealPrice()));

		System.out.println(getSpecificFeatureName() + " @ " + (getNumberOfAdults() + getNumberOfChildren()) + " : $"
				+ specialFeatureTotal);

		System.out.println("Total Price : $" + totalPrice);

		double hst = totalPrice * getTaxRate();
		System.out.println("HST @ " + (getTaxRate() * 100) + "% : $" + hst);

		double finalPrice = totalPrice + hst;
		System.out.println("Final Price : $" + finalPrice);
		addBooking(this);
	}

	@Override
	public double calculateMealPrice() {
		double adultMealRate = getNumberOfAdults() * getAdultMealPrice() * getNumOfDaysOfStay();
		double childMealRate = getNumberOfChildren() * getChildMealPrice() * getNumOfDaysOfStay();

		return adultMealRate + childMealRate;
	}

	@Override
	public void collectDetails() {
		System.out.println("Enter the number of adults:");
		int numberOfAdults = scanner.nextInt();

		System.out.println("Enter the number of children:");
		int numberOfChildren = scanner.nextInt();

		while (numberOfAdults == 0 && numberOfChildren > 0) {
			System.out.println(
					"Kids should accompany with at least 1 adult. Please enter the number of adults and children again.");

			System.out.println("Enter the number of adults:");
			numberOfAdults = scanner.nextInt();

			System.out.println("Enter the number of children:");
			numberOfChildren = scanner.nextInt();
		}

		setNumberOfAdults(numberOfAdults);
		setNumberOfChildren(numberOfChildren);

		if (numberOfChildren > 0) {
			for (int i = 1; i <= numberOfChildren; i++) {
				System.out.println("Enter the age of child " + i + ":");
				int childAge = scanner.nextInt();
			}
		}
		isneedSpecialFeature = askForSpecialFeature();
		setIsneedSpecialFeature(isneedSpecialFeature);
		askForMeals();
		calculateTotalAfterTax();

	}

	private boolean askForSpecialFeature() {
		System.out.println("Do you want the special feature? (yes/no)");
		String response = scanner.next().toLowerCase();
		return response.equals("yes");
	}

	@Override
	public boolean askForMeal() {
		return false;
	}

	public double askForMeals() {
		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? (Y or N)");
		String response = scanner.next().toLowerCase();

		if (response.equals("y")) {
			// If User wants to pre-book meals
			return calculateMealPrice();
		} else {
			// If User doesn't want to pre-book meals, then set prices to 0
			setChildMealPrice(0);
			setAdultMealPrice(0);
			return 0;
		}
	}

	@Override
	public void chooseType() {
		System.out.println("We offer 4 different packages. Please enter the cruise that you want to select:");
		System.out.println("1. Scenic Cruise");
		System.out.println("2. Sunset Cruise");
		System.out.println("3. Discovery Cruise");
		System.out.println("4. Mystery Cruise");

		int cruiseChoice = scanner.nextInt();

		switch (cruiseChoice) {
		case 1:
			ScenicCruise scenicCruise = new ScenicCruise();
			displayDetails(scenicCruise);
			break;
		case 2:
			SunsetCruise sunsetCruise = new SunsetCruise();
			displayDetails(sunsetCruise);
			break;
		case 3:
			DiscoveryCruise discoveryCruise = new DiscoveryCruise();
			displayDetails(discoveryCruise);
			break;
		case 4:
			MysteryCruise mysteryCruise =  new MysteryCruise();
			displayDetails(mysteryCruise);
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
	}

	private void displayDetails(Cruise selectedCruise) {
		System.out.println("The cruise that you have selected is " + selectedCruise.getNameOfBookingType()
				+ " which is a " + selectedCruise.getNumOfDaysOfStay() + " day cruise");
		System.out.println("Price for Adults (greater than 12) : $" + selectedCruise.getAdultRate() + " per day");
		System.out.println("Price for kids below 5 : $" + selectedCruise.getChildRate() + " per day");
		System.out.println(selectedCruise.getSpecificFeatureName() + " for $" + selectedCruise.getSpecificFeaturePrice()
				+ " per person");

		System.out.println(
				"Please press Y if you want to continue with the selection or press any other alphabet to select another Cruise.");

		String response = scanner.next().toLowerCase();
		if (response.equals("y")) {
			selectedCruise.collectDetails();
		} else {
			chooseType();
		}
	}

	// getters and setters
	public double getAdultRate() {
		return adultRate;
	}

	public void setAdultRate(double adultRate) {
		this.adultRate = adultRate;
	}

	public double getChildRate() {
		return childRate;
	}

	public void setChildRate(double childRate) {
		this.childRate = childRate;
	}

	public String getSpecificFeatureName() {
		return specificFeatureName;
	}

	public void setSpecificFeatureName(String specificFeature) {
		this.specificFeatureName = specificFeature;
	}

	public double getSpecificFeaturePrice() {
		return specificFeaturePrice;
	}

	public void setSpecificFeaturePrice(double specificFeaturePrice) {
		this.specificFeaturePrice = specificFeaturePrice;
	}

	public boolean isIsneedSpecialFeature() {
		return isneedSpecialFeature;
	}

	public void setIsneedSpecialFeature(boolean isneedSpecialFeature) {
		this.isneedSpecialFeature = isneedSpecialFeature;
	}

}