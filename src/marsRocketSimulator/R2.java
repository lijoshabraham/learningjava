package marsRocketSimulator;

public class R2 extends Rocket {

	public R2() {
		setRocketCost(120); // Rocket cost in million
		setRocketWeight(18000); // Rocket weight in kilograms
		setRocketMaximumWeight(29000); // Maximum rocket weight with cargo in kilograms
		setLaunchExplosionRate(0.04); // rate of launch explosion is 4%
		setLandingExplosionRate(0.08); // rate of landing explosion is 8%
		setCargoLimit(getRocketMaximumWeight()-getRocketCost());
		setCurrentWeight(getRocketWeight());
	}

	@Override
	//overriding the launch method to calculate the corresponding chance of exploding
	public boolean launch() {
		setChanceOfLaunchExplosion(getLaunchExplosionRate()*(getCargoCarried()/getCargoLimit()));
		return launch();
	}

	@Override
	//override the land method to calculate the corresponding chance of crash
	public boolean land() {
		setChanceOfLandingCrash(getLandingExplosionRate()*(getCargoCarried()/getCargoLimit()));
		return land();
	}

}
