package dynamicInput;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object Creation
		CalculateFuelInjection calculateFuelInjection = new CalculateFuelInjection();
		
		//Assign value to the variables
		calculateFuelInjection.xThrottle = 254;
		calculateFuelInjection.engineCool = false;
		
		//invoke method on the object
		calculateFuelInjection.calculateFuelInjection();
	}

}
