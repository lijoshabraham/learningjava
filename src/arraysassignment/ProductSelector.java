package arraysassignment;

import java.util.Scanner;

public class ProductSelector {

	Scanner sc = new Scanner(System.in);

	String[] brandNames = { "Samsung", "Google", "Apple" };
	String[][] products = { { "S20", "S21", "Flip3", "Fold3" },
			{ "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" },
			{ "IPhone12", "IPhone SE", "IPhone 15", "IPhone 13" } };

	void displayProducts() {
		do {
			System.out.print("Enter the phone brand (Samsung, Google, Apple): \n");
			String brand = sc.nextLine();

			int brandIndex = -1;

			if (brand.isEmpty()) {
				System.out.println("Please enter a valid phone brand.\n");
				continue;
			}

			for (int i = 0; i < brandNames.length; i++) {
				if (brandNames[i].equalsIgnoreCase(brand.trim())) {
					brandIndex = i;
					break;
				}
			}

			if (brandIndex != -1) {

				System.out.println("\nAvailable " + brand + " products are: ");
				for (int j = 0; j < products[brandIndex].length; j++) {
					String product = products[brandIndex][j];
					System.out.println(product);
				}

				return;
			} else {
				System.out.println("\nBrand " + brand + " not found. Please enter Samsung, Google, or Apple.\n");
			}
		} while (true);

	}

}
