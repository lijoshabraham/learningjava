package cruiseAssignment;

import java.util.Scanner;

public class CruiseBooking {
	
    private CruiseDetails selectedCruise;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfAdultMeals;
    private int numberOfChildMeals;
    Scanner scanner = new Scanner(System.in);

    public CruiseBooking(CruiseDetails selectedCruise, int numOfAdults, int numOfChildren) {
        this.selectedCruise = selectedCruise;
        this.numberOfAdults = numOfAdults;
        this.numberOfChildren = numOfChildren;
    }

    public void setSelectedCruise(CruiseDetails selectedCruise) {
        this.selectedCruise = selectedCruise;
    }

    public void setNumAdults(int numAdults) {
        this.numberOfAdults = numAdults;
    }

    public void setNumChildren(int numChildren) {
        this.numberOfChildren = numChildren;
    }

    public int getNumAdults() {
        return numberOfAdults;
    }

    public int getNumChildren() {
        return numberOfChildren;
    }

    public void askUserForMeals() {
        // ask for meals only if there are adults or children selected
        if (numberOfAdults > 0 || numberOfChildren > 0) {
            System.out.println("All our cruises have food service on board.");
            System.out.println("Do you want to pre-book for dinner buffet meals at $20.99 per day for adults and $4.99 per day for kids? (Yes/No):");
            String mealSelecion = scanner.nextLine();

            if (mealSelecion.equalsIgnoreCase("Y")) {
                if (numberOfAdults > 0) {
                    System.out.println("Enter the number of adult meals:");
                    numberOfAdultMeals = Integer.parseInt(scanner.nextLine());
                }

                // ask for the number of kids meals only if children selected
                if (numberOfChildren > 0) {
                    System.out.println("Enter the number of kids meals:");
                    numberOfChildMeals = Integer.parseInt(scanner.nextLine());
                }
            }
        }
    }

    public double calculateTotalCost() {
        double adultPrice = selectedCruise.getAdultPrice();
        double childrenPrice = selectedCruise.getChildrenPrice();
        int numberOfDays = selectedCruise.getNumberOfDays();

        double totalAdultCost = numberOfAdults * adultPrice;
        double totalChildrenCost = numberOfChildren * childrenPrice;

        return (totalAdultCost + totalChildrenCost) * numberOfDays;
    }


    public double calculateMealCost() {
        double adultMealPrice = 20.99;
        double childMealPrice = 4.99;

        double totalAdultMealCost = numberOfAdultMeals * adultMealPrice;
        double totalChildMealCost = numberOfChildMeals * childMealPrice;

        return (totalAdultMealCost + totalChildMealCost) * selectedCruise.getNumberOfDays();
    }

    public double calculateFinalCost(double totalCost, double taxRate) {
        double taxAmount = totalCost * taxRate;
        return totalCost + taxAmount;
    }

    public void displaySelectedCruiseInfo() {
        System.out.println("The cruise that you have selected is " + selectedCruise.getCruiseName() + " which is a "
                + selectedCruise.getNumberOfDays() + " day cruise");
        System.out.println("Price for Adults (greater than 12) : $" + selectedCruise.getAdultPrice() + " per day");
        System.out.println("Price for kids above 5 : $" + selectedCruise.getChildrenPrice() + " per day");
    }

    public void calculateFinalPrice(double totalCost, double finalCost, double hst) {

        System.out.println("\nYour Package includes:\n");
        System.out.println(selectedCruise.getCruiseName() + " Adults " + numberOfAdults + " : $" +
                (numberOfAdults * selectedCruise.getAdultPrice() * selectedCruise.getNumberOfDays()));

        if (numberOfChildren > 0) {
        	System.out.println(selectedCruise.getCruiseName() + " Children above 5 " + numberOfChildren + " : $" +
                    (numberOfChildren * selectedCruise.getChildrenPrice() * selectedCruise.getNumberOfDays()));

        }

        double mealCost = calculateMealCost();
        if (mealCost > 0) {
        	System.out.println("Buffet Special Price Adults @ " + numberOfAdults + " : $" +
                    (numberOfAdultMeals * 20.99 * selectedCruise.getNumberOfDays()));


            if (numberOfChildren > 0) {
            	System.out.println("Buffet Special Price Children above 5 @ " + numberOfChildren + " : $" +
                        (numberOfChildMeals * 4.99 * selectedCruise.getNumberOfDays()));

            }
        }

        System.out.printf("Subtotal : $%.2f%n", totalCost);
        System.out.printf("HST @ 15%% : $%.2f%n", hst);
        System.out.printf("Total Price : $%.2f%n", finalCost);


    }

    public boolean askToContinueWithSelectedCruise() {
        System.out.println("\nPlease press Y if you want to continue with the selected cruise or press any other key to select another:");
        String continueOption = scanner.nextLine();
        return continueOption.equalsIgnoreCase("Y");
    }

    public boolean noPassengersSelected() {
        return numberOfAdults == 0 && numberOfChildren == 0;
    }

    public void ifNoPassengersSelected() {
        if (noPassengersSelected()) {
            System.out.println("Please select at least 1 person to continue.");
        }
    }
}
