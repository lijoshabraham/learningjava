package bookingAssignment;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		user.signUp();
		int choice;
		do {
			System.out.println("\n1. Do you want to book another Hotel Room or Cruise?");
			System.out.println("2. Display list of your bookings");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			MyBookings booking;
			
			switch (choice) {
			case 1:
				System.out.println("Please enter the service you want to book (Hotel/Cruise): ");
				String serviceType = sc.next().toLowerCase();

				switch (serviceType) {
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
					break;
				}
				break;
			case 2:
				user.displayBookings();
				break;
			case 3:
				System.out.println("Thank you for choosing our booking system!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
		} while (choice != 3);

		sc.close();
	}

}
