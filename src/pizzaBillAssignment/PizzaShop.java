package pizzaBillAssignment;

import java.util.Scanner;

public class PizzaShop {

    private String size;
    private double pizzaPrice;
    private double toppingsPrice;
    private Scanner scanner;

    public PizzaShop(String size) {
        this.size = size;
        this.scanner = new Scanner(System.in);
        setPizzaPrices();
    }

    private void setPizzaPrices() {
        switch (size.toLowerCase()) {
            case "small":
                pizzaPrice = 15.0;
                toppingsPrice = 2.0;
                break;
            case "medium":
                pizzaPrice = 20.0;
                toppingsPrice = 3.0;
                break;
            case "large":
                pizzaPrice = 25.0;
                toppingsPrice = 3.0;
                break;
            default:
                break;
        }
    }

    public boolean isValidSize() {
        return "small".equalsIgnoreCase(size) || "medium".equalsIgnoreCase(size) || "large".equalsIgnoreCase(size);
    }

    public void addToppings() {
        while (true) {
            System.out.println("\nWould you like to add pepperoni toppings? (Y or N)");
            String input = scanner.next().trim().toUpperCase();
            
            if (input.equals("Y")) {
            	 pizzaPrice += toppingsPrice;
                break;
            } else if (input.equals("N")) {
                break; 
            } else {
                System.out.println("\nInvalid input. Please enter Y or N.");
            }
        }
    }


    public void addExtraCheese() {
    	 while (true) {
             System.out.println("\nWould you like to add extra cheese? (Y or N)");
             String input = scanner.next().trim().toUpperCase();
             
             if (input.equals("Y")) {
            	 pizzaPrice += 1.0;
                 break;  
             } else if (input.equals("N")) {
                 break; 
             } else {
                 System.out.println("\nInvalid input. Please enter Y or N.");
             }
         }
    }


    public double calculateTotalPrice() {
        return pizzaPrice;
    }


}

