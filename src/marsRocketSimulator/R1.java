package marsRocketSimulator;

public class R1 extends Rocket {

	public R1() {
		setRocketCost(100);
		setRocketWeight(10000);
		setRocketMaximumWeight(18000);
		setLaunchExplosionRate(0.05);
		setLandingExplosionRate(0.01);
		setCargoLimit(getRocketMaximumWeight() - getRocketWeight());
		setCurrentWeight(getRocketWeight());
	}

	@Override
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
