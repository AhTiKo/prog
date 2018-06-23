package lesson07;

public class Person {
	String name;
	int age;
	long presonalNumbber;
	boolean isWoman;
	double weight;
	Person friend;
	double money;
	Car car;
	
	void eat() {
		System.out.println("Eating ..");
	}
	
	void growUp() {
		age ++;
	}
	
	void drinkWater(double litres) {
		if (litres > 1) {
			System.out.println("This is too much watter !");
		} else {
			System.out.println(name + " is drnking " + litres + " water.");
		}
	}
	
	void buyCar(Car car){
		if(this.money > car.price){
			System.out.println("The car is bought!");
			if(car.owner == null) {
				this.car = car;
				car.changeOwner(this);
				this.money -= car.price;

			} else {
				car.owner.money += car.price;
				car.changeOwner(this);
				this.money -= car.price;
			}
			
		} else {
			System.out.println("Not enough money!");
		}
	}
	
	 double sellCarForScrap(){
		 double moneyOfScrap = this.car.calculateCarPriceForScrap(1000);
		 this.money += moneyOfScrap;
		 this.car.changeOwner(null);
		 this.car = null;
		 return moneyOfScrap;
	 }

	
}

