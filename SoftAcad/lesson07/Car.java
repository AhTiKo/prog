package lesson07;

public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int currentGear;
	Person owner;
	double price;
	boolean isSportCar;
	
	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.color = color;
		this.isSportCar = isSportCar;
		
	}
	
	Car(String model, boolean isSportCar, String color, double price, int maxSpeed) {
		this(model,isSportCar,color);
		this.price = price;
		if(maxSpeed > 200) {
			this.isSportCar = true;
		}
		
		
//		if (isSportCar) {
//			this.maxSpeed = maxSpeed;
//		} else if(maxSpeed > 200) {
//			this.maxSpeed = 200;	
//		} else {
//			this.maxSpeed = maxSpeed;
//		}
	}
	
	void changeColor(String colorToSet) {
		if(colorToSet.equals(color)) {
			System.out.println("Ivalid color!");
		} else {
			color = colorToSet;
		}
	}
	
	double calculateDif() {
		double dif = maxSpeed - currentSpeed;
		return dif;
	}
	
	double calculateCurrentConsumation(double consumation) {
		return consumation*currentSpeed/100;
	}
	
	boolean isMoreExpensive(Car car){
		if(this.price > car.price){
			return true;
		}
		return false;
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if (this.color.equals("White") || this.color.equals("Black") || this.color.equals("white") || this.color.equals("black")){
			coef +=0.05;
		}
		if (this.isSportCar) {
			coef += 0.05;
		}
		
		return metalPrice * coef;
	}
	
	 void changeOwner(Person newOwner){
		 if (this.owner == null) {
			 this.owner = newOwner; 
		 } else {
			 this.owner.car = null;
			 this.owner = newOwner;
			 if(newOwner != null) {
				 this.owner.car = this;
			 } 
		 }
		
	 }
	 
	 boolean equals (Car car){
		 if (this.model.equals(car.model) && this.color.equals(car.color) && (this.price == car.price) ) {
			return true;
		}
		 return false;
	 }
	
	
	
	
}

