package lesson07;

public class CarShop {
	Car[] cars;
	int carsCount;
	int currentCarNumber;
//	int startIndex;
	
	CarShop(int capacity){
		this.cars = new Car[capacity];
		this.carsCount = 0;
		this.currentCarNumber = 0;
	}
	
//	boolean addCar(Car car){
//		boolean isEmptyPlace = false;
//		for (int i = 0; i < this.cars.length; i++) {
//			if (this.cars[i] == null) {
//				this.cars[i] = car;
//				isEmptyPlace = true;
//				break;
//			}
//		}
//		return isEmptyPlace;
//	}
	
	boolean addCar(Car car) {
		if (this.carsCount < this.cars.length) {
			this.cars[carsCount] = car;
			this.carsCount ++;
			return true;
		}
		return false;
	}
	
	Car getNextCar() {
		return this.cars[currentCarNumber ++];	
	}
	
	void sellNextCar(Person buyer){
		buyer.buyCar(this.getNextCar());
	}
	
	void removeCar(Car car){
		for (int i = 0; i < this.cars.length; i++) {
			if (this.cars[i].equals(car)) {
				
			}
		}
	}
	
	
	
}
