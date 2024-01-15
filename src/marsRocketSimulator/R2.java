package marsRocketSimulator;

public class R2 extends Rocket {

	public R2() {
		setRocketCost(120); // Rocket cost in million
		setRocketWeight(18000); // Rocket weight in kilograms
		setRocketMaximumWeight(29000); // Maximum rocket weight with cargo in kilograms
		setLaunchExplosionRate(0.04); // rate of launch explosion is 4%
		setLandingExplosionRate(0.08); // rate of landing explosion is 8%
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
			// landing failed
			return land();
		}
		// landing successful
		return true;
	}

}
