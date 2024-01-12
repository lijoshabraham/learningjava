package bookingAssignment;

import java.util.List;
import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);
	String username;
	String password;
	String name;
	String phoneNumber;
	String emailAddress;
	MyBookings[] bookings;

	public void displayBookings() {
        List<MyBookings> bookingList = MyBookings.getBookingList();

        if (bookingList.isEmpty()) {
            System.out.println("\nNo bookings available.");
        } else {
            System.out.println("\nList of Bookings:");
            for (MyBookings booking : bookingList) {
                System.out.println("Booking Type: " + booking.getNameOfBookingType());
                System.out.println("Number of Adults: " + booking.getNumberOfAdults());
                System.out.println("Number of Children: " + booking.getNumberOfChildren());
                System.out.println("Number of Days of Stay: " + booking.getNumOfDaysOfStay());
                System.out.println("Total Price: $" + booking.getTotalPriceOfStay());
                System.out.println("------------");
            }
        }
    }
	public void signUp() {

		System.out.println("Please sign up to book a service.");
		System.out.println("Enter your email address.");
		emailAddress = scanner.nextLine();

		System.out.println("Enter the password that you want to use");
		password = scanner.nextLine();

		System.out.println("Enter your Full Name");
		name = scanner.nextLine();

		System.out.println("Enter your phone number");
		phoneNumber = scanner.nextLine();

		System.out.println("Thank you for registering!");

		chooseBookingType();
	}

	void chooseBookingType() {
		System.out.println("Please enter the service you want to book Hotel Stay/ Cruise");
		String service = scanner.nextLine();

		MyBookings booking;

		switch (service.toLowerCase()) {
		case "hotel":
			booking = new Hotel();
			booking.chooseType();
			break;
		case "cruise":
			booking = new Cruise();
			booking.chooseType();
			break;
		default:
			System.out.println("Invalid service type. Please enter either Hotel or Cruise.");
			return;
		}

	}

}
