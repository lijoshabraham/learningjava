package arraysassignment;

import java.util.Scanner;

public class ProductSelector {

	Scanner sc = new Scanner(System.in);

	String[][] categoryAndProducts = { { "Samsung", "S20", "S21", "Flip3", "Fold3" },
			{ "Google", "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" },
			{ "Apple", "IPhone12", "IPhone SE", "IPhone 15", "IPhone 13" } };

	String selectedBrand;
	String[] selectedProducts;

	void displayProducts() {
		boolean isValidBrandSelected = false;

		while (!isValidBrandSelected) {
			System.out.print("Enter the phone brand (Samsung, Google, Apple): \n");
			String brand = sc.nextLine();

			int brandIndex = -1;

			if (brand.isEmpty()) {
				System.out.println("Please enter a valid phone brand.\n");
				continue;
			}

			for (int i = 0; i < categoryAndProducts.length; i++) {

				if (categoryAndProducts[i][0].equalsIgnoreCase(brand.trim())) {
					brandIndex = i;
					break;
				}
			}

			if (brandIndex != -1) {
				selectedBrand = brand;
				selectedProducts = categoryAndProducts[brandIndex];
				System.out.println("\nAvailable " + brand + " products are: ");

				for (int j = 1; j < categoryAndProducts[brandIndex].length; j++) {
					String product = categoryAndProducts[brandIndex][j];
					System.out.println(product);
				}

				selectProduct();
				isValidBrandSelected = true;

			} else {
				System.out.println("\nBrand " + brand + " not found. Please enter Samsung, Google, or Apple.\n");
			}
		}

	}

	void selectProduct() {
		boolean isValidProductSelected = false;

		while (!isValidProductSelected) {
			System.out.print("\nEnter the name of " + selectedBrand + " product: ");
			String selectedProduct = sc.nextLine();

			if (selectedProduct.isEmpty()) {
				System.out.println("Please enter a valid product name.");
				continue;
			}

			for (int i = 0; i < selectedProducts.length; i++) {
				String product = selectedProducts[i];
				if (selectedProduct.equalsIgnoreCase(product)) {
					System.out.println("\nSelected " + selectedBrand + " product is: " + product);
					isValidProductSelected = true;
					break;
				}
			}

			if (!isValidProductSelected) {
				System.out.println(
						"\nProduct not available in " + selectedBrand + ". Please select a product from the list.");
			}
		}
		sc.close();
	}
}
