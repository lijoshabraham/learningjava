package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaShopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isValidSizeSelected = false;
		PizzaShop pizzaShop = null;

		System.out.println("\nChoose Pizza Size:" + "\n1. Small Pizza " + "\n2. Medium Pizza" + "\n3. Large Pizza ");

		System.out.println("\nEnter Small, Medium, or Large to choose pizza size:");
		while (!isValidSizeSelected) {
			String pizzaInputSize = sc.nextLine().toLowerCase();

			pizzaShop = new PizzaShop(pizzaInputSize);
			isValidSizeSelected = pizzaShop.isValidSize();

			if (!isValidSizeSelected) {
				System.out.println("\nInvalid pizza size. Enter Small, Medium, or Large to choose pizza size:");
			}
		}

		pizzaShop.addToppings();

		pizzaShop.addExtraCheese();

		System.out.println("Your final bill amount is: $" + pizzaShop.calculateTotalPrice());

		sc.close();
	}
}
