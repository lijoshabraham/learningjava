package marsRocketSimulator;

public class R2 extends Rocket {

	public R2() {
		setRocketCost(120);
		setRocketWeight(18000);
		setRocketMaximumWeight(29000);
		setLaunchExplosionRate(0.04);
		setLandingExplosionRate(0.08);
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
