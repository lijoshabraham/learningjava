package dynamicInput;

public class CalculateFuelInjection {

	int xThrottle, yFuel;
	boolean engineCool;

	void calculateFuelInjection() {

		// if(condition) {code that will be executed}
		if (engineCool && xThrottle <= 127 ) {
			yFuel = xThrottle * 2;
			System.out.println("yFuel value is : " + yFuel);
		} else if (xThrottle > 127) {
			yFuel = xThrottle + 127;
			System.out.println("yFuel value is : " + yFuel);
		} else {
			yFuel = xThrottle * 3;
			System.out.println("yFuel value is : " + yFuel);
		}
		
		if (xThrottle>765) {
			System.out.println("yFuel value is : 765");
		}
		else {
			System.out.println("yFuel value is : " + yFuel);
		}

	}

}
