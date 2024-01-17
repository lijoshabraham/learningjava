package marsRocketSimulator;

import java.util.Random;

public class Rocket implements SpaceShip {

	// declaring private variables common for R1 & R2 rockets
	private int rocketCost; 
	private int rocketWeight; 
	private int rocketMaximumWeight; 
	private int currentWeight; 
	private int cargoCarried; // total weight of the cargo that the rocket is carrying in kilograms
	private int cargoLimit; // maximum weight of cargo that the rocket can carry in kilograms
	private double launchExplosionRate; 
	private double landingExplosionRate; 
	private double chanceOfLaunchExplosion;
	private double chanceOfLandingCrash; 

	//constructor & initializing values
	public Rocket() {
		currentWeight = 0;
		cargoCarried = 0;
		cargoLimit = 0;
		chanceOfLaunchExplosion = 0.0;
		chanceOfLandingCrash = 0.0;
	}

	public double randomNumber() {
		/*double min = 1;
	    double max = 5;
	    Random random = new Random();
	    return min + (max - min) * random.nextDouble();*/
		return new Random().nextDouble();
	}

	@Override
	public boolean launch() {
		return false;
	}

	@Override
	public boolean land() {
		return false;
	}

	@Override
	public boolean canCarry(Item item) {
		return (this.currentWeight + item.getItemWeight()) <= rocketMaximumWeight;
	}

	@Override
	public void carry(Item item) {
		this.currentWeight += item.getItemWeight();

	}

	// getter & setter methods

	public int getRocketCost() {
		return rocketCost;
	}

	public void setRocketCost(int rocketCost) {
		this.rocketCost = rocketCost;
	}

	public int getRocketWeight() {
		return rocketWeight;
	}

	public void setRocketWeight(int rocketWeight) {
		this.rocketWeight = rocketWeight;
	}

	public int getRocketMaximumWeight() {
		return rocketMaximumWeight;
	}

	public void setRocketMaximumWeight(int rocketMaximumWeight) {
		this.rocketMaximumWeight = rocketMaximumWeight;
	}

	public int getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}

	public int getCargoLimit() {
		return cargoLimit;
	}

	public void setCargoLimit(int cargoLimit) {
		this.cargoLimit = cargoLimit;
	}

	public double getLaunchExplosionRate() {
		return launchExplosionRate;
	}

	public void setLaunchExplosionRate(double launchExplosionRate) {
		this.launchExplosionRate = launchExplosionRate;
	}

	public double getLandingExplosionRate() {
		return landingExplosionRate;
	}

	public void setLandingExplosionRate(double landingExplosionRate) {
		this.landingExplosionRate = landingExplosionRate;
	}

	public int getCargoCarried() {
		return cargoCarried;
	}

	public void setCargoCarried(int cargoCarried) {
		this.cargoCarried = cargoCarried;
	}

	public double getChanceOfLaunchExplosion() {
		return chanceOfLaunchExplosion;
	}

	public void setChanceOfLaunchExplosion(double chanceOfLaunchExplosion) {
		this.chanceOfLaunchExplosion = chanceOfLaunchExplosion;
	}

	public double getChanceOfLandingCrash() {
		return chanceOfLandingCrash;
	}

	public void setChanceOfLandingCrash(double chanceOfLandingCrash) {
		this.chanceOfLandingCrash = chanceOfLandingCrash;
	}


}
