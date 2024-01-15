package marsRocketSimulator;

public class R1 extends Rocket {

	public R1() {
		setRocketCost(100); // Rocket cost in million
		setRocketWeight(10000); // Rocket weight in kilograms
		setRocketMaximumWeight(18000); // Maximum rocket weight with cargo in kilograms
		setLaunchExplosionRate(0.05); // rate of launch explosion is 5%
		setLandingExplosionRate(0.01); // rate of landing explosion is 1%
		setCargoLimit(getRocketMaximumWeight() - getRocketCost());
		setCurrentWeight(getRocketWeight());
	}

	@Override
	// launch method to calculate the corresponding chance of explosion
	/*
	 * If the Chance of launch explosion is greater than random number generated
	 * then it failed else it launches success
	 */
	public boolean launch() {
		setChanceOfLaunchExplosion(getLaunchExplosionRate() * (getCargoCarried() / getCargoLimit()));
		if ((getChanceOfLaunchExplosion()) > randomNumber()) {
			// launch failed
			return launch();
		}
		// launch successful
		return true;
	}

	@Override
	// override the land method to calculate the corresponding chance of crash
	public boolean land() {
		setChanceOfLandingCrash(getLandingExplosionRate() * (getCargoCarried() / getCargoLimit()));
		if ((getChanceOfLaunchExplosion()) > randomNumber()) {
			// launch failed
			return land();
		}
		// launch successful
		return true;
	}

}
