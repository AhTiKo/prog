package lesson06;

public class Car {
	
	String model ;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	Person owner;
	
	void printCarSpecs() {
		System.out.println("model: " + this.model + " , owner: " + this.owner.name + " ,color: " + this.color + " ,max speed: " + this.maxSpeed);
		System.out.println("speed: " + this.currentSpeed + " , gear: " + this.currentGear);
	}
	
	void accelerate() {
		if(this.currentSpeed + 10 < this.maxSpeed){
			this.currentSpeed += 10;
		} else {
			this.currentSpeed = this.maxSpeed;
			this.currentGear = 5;
		}
	}
	
	void changeGearUp() {
		if (this.currentGear < 5) {
			this.currentGear ++;
		} else {
			System.out.println("You are now on 5th gear!");
		}
	}
	void changeGearDown() {
		if (this.currentGear > 1) {
			this.currentGear --;
		} else {
			System.out.println("You are now on 1st gear!");
		}
		
	}
	void changeGear(int nextGear) {
		if (nextGear >= 1 && nextGear <= 5) {
			this.currentGear = nextGear;
		} else {
			System.out.println("Invalid gear!");
		}
	}
	void changeColor(String newColor){
		this.color = newColor;
	}

	
}
