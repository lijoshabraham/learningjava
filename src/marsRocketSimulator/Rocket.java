package marsRocketSimulator;

import java.util.Random;

public class Rocket implements SpaceShip {

	// declaring private variables common for R1 & R2 rockets
	private int rocketCost; // $ cost of rocket in Millions
	private int rocketWeight; // weight of rocket in kilograms
	private int rocketMaximumWeight; // maximum rocket weight with cargo in kilograms
	private int currentWeight; // current weight of rocket (with cargo) in kilograms
	private int cargoCarried; // total weight of the cargo that the rocket is carrying in kilograms
	private int cargoLimit; // maximum weight of cargo that the rocket can carry in kilograms
	private double launchExplosionRate; // rate of launch explosion
	private double landingExplosionRate; // rate of landing crash
	private double chanceOfLaunchExplosion; // Chance of launch explosion
	private double chanceOfLandingCrash; // Chance of landing crash

	public Rocket() {
		currentWeight = 0;
		cargoCarried = 0;
		cargoLimit = 0;
		chanceOfLaunchExplosion = 0.0;
		chanceOfLandingCrash = 0.0;
	}

	// generating a standard range random number using java random class(range
	// 0.0-1.0)
	protected double randomNumber() {
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
	// return true if the Item object can be carry items, false if it will exceed
	// the weight limit.
	public boolean canCarry(Item item) {
		return (this.currentWeight + item.getItemWeight()) <= rocketMaximumWeight;
	}

	@Override
	// this method takes Item object and updates the current weight of the rocket.
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
