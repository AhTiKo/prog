package hwk08.race;

import java.util.Random;

public class CarRace {
	private String carRaceName;
	private Car[] carsInRace;
	private int carsCount;

	public CarRace(String carRaceName) {
		if (carRaceName != null && !carRaceName.equals("")) {
			this.carRaceName = carRaceName;
			this.carsInRace = new Car[20];
			this.carsCount = 0;
		} else {
			System.out.println("The name of the race is not valid!");
		}
	}

	public String getCarRaceName() {
		return carRaceName;
	}

	public static void printInfo() {
		System.out.println("Formula 1 is the best car championship in the world!");
		System.out.println();
	}

	public void addCar(String carModel, int carYear) {
		try {
			if (carsCount < 20) {
				Car car = new Car(carModel, carYear);
				carsInRace[carsCount] = car;
				if (carsInRace[carsCount] != null) {
					System.out.println("Car number " + (++carsCount) + " has been added!");
				}
			} else {
				System.out.println("There is no room for cars!");
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	public void removeCars() {
		while (carsCount > 0){
			carsInRace[--carsCount] = null;
		}
		System.out.println("All cars are removed");
		System.out.println();
	}
	
	public void startRace(int rounds){
		Random random = new Random();
		for (int i = 1; i < rounds; i++) {
			Car.setCurrentLeader(random.nextInt(carsCount) + 1);
			System.out.println("Lap : " + i +  ", leader is car : " + Car.getCurrentLeader());
		}
		Car.setCurrentLeader(random.nextInt(carsCount) + 1);
		System.out.println("Car number "+ Car.getCurrentLeader() + " is winner in " + carRaceName);
		System.out.println();
		
	}

}
