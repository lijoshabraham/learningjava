package marsRocketSimulator;

public class R1 extends Rocket {

	public R1() {
		setRocketCost(100); // Rocket cost in million
		setRocketWeight(10000); // Rocket weight in kilograms
		setRocketMaximumWeight(18000); // Maximum rocket weight with cargo in kilograms
		setLaunchExplosionRate(0.05); // rate of launch explosion is 5%
		setLandingExplosionRate(0.01); // rate of landing explosion is 1%
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
