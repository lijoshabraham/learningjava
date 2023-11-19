package watertank;

import java.util.Scanner;

public class WaterTank {

    int tankCapacity = 100;
    int bucketCapacity = 10;
    int currentWaterLevel = 0;

    // create a method to fill the water tank
    void fillWaterTank() {
        Scanner sc = new Scanner(System.in);

        while (currentWaterLevel < tankCapacity) {
            System.out.print("Enter the capacity of the water to fill (in litres: ");
            int fillingWater = sc.nextInt();

            if (fillingWater != bucketCapacity) {
                System.out.println("Invalid capacity. Please enter 10 litres at a time.");
                continue; // Continue to the next iteration of the loop
            }

            // Check if fillingWater exceeds the remaining capacity in the tank
            if (currentWaterLevel + fillingWater > tankCapacity) {
                System.out.println("Maximum capacity reached. The tank is now full.");
                break; // Exit the loop if the tank is full
            }

            System.out.println("Filling " + fillingWater + " litres of water into the tank.");
            currentWaterLevel += fillingWater;

            System.out.println("Total Litres filled: " + currentWaterLevel);
        }

        sc.close();
    }
}
