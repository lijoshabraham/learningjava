package bookingAssignment;

import java.util.ArrayList;
import java.util.List;

public abstract class MyBookings {

	private static List<MyBookings> bookingList = new ArrayList<>();

	// variables common for hotel and cruise
	private String nameOfBookingType;
	private int numberOfChildren;
	private int numberOfAdults;
	private int numOfDaysOfStay;
	private double taxRate;
	private double childMealPrice;
	private double adultMealPrice;
	private double totalPriceOfStay;

	// abstract methods common for hotel and cruise
	public abstract void calculateTotalAfterTax();

	public abstract double calculateMealPrice();

	public abstract void collectDetails();

	public abstract boolean askForMeal();

	public abstract void chooseType();

	// getter and setter methods for hotel and cruise
	public String getNameOfBookingType() {
		return nameOfBookingType;
	}

	public void setNameOfBookingType(String nameOfBookingType) {
		this.nameOfBookingType = nameOfBookingType;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumOfDaysOfStay() {
		return numOfDaysOfStay;
	}

	public void setNumOfDaysOfStay(int numOfDaysOfStay) {
		this.numOfDaysOfStay = numOfDaysOfStay;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getChildMealPrice() {
		return childMealPrice;
	}

	public void setChildMealPrice(double childMealPrice) {
		this.childMealPrice = childMealPrice;
	}

	public double getAdultMealPrice() {
		return adultMealPrice;
	}

	public void setAdultMealPrice(double adultMealPrice) {
		this.adultMealPrice = adultMealPrice;
	}

	public double getTotalPriceOfStay() {
		return totalPriceOfStay;
	}

	public void setTotalPriceOfStay(double totalPriceOfStay) {
		this.totalPriceOfStay = totalPriceOfStay;
	}

	public void addBooking(MyBookings booking) {
		bookingList.add(booking);
	}

	public static List<MyBookings> getBookingList() {
		return bookingList;
	}
}
