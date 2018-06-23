package lesson07;

public class CarShopOld {
	public static void main(String[] args) {
		Car car1 = new Car("Mazda", true , "Blue");
		Car car2 = new Car("ford", false , "Red");
		Car car3 = new Car("BMW", true , "Black");
		

		System.out.println( "model :" + car1.model + ", isSport: " + car1.isSportCar + ", color: " + car1.color);
		System.out.println( "model :" + car2.model + ", isSport: " + car2.isSportCar + ", color: " + car2.color);
		System.out.println( "model :" + car3.model + ", isSport: " + car3.isSportCar + ", color: " + car3.color);
		
		Car car4 = new Car("lada", false, "Yellow", 2000, 150);
		Car car5 = new Car("trabant", true, "Black", 4000, 285);
		System.out.println( "model :" + car4.model + ", isSport: " + car4.isSportCar + ", color: " + car4.color);
		System.out.println( "model :" + car5.model + ", isSport: " + car5.isSportCar + ", color: " + car5.color);
		System.out.println(car4.isMoreExpensive(car5));
		
		System.out.println(car4.calculateCarPriceForScrap(1));
		System.out.println(car5.calculateCarPriceForScrap(1));
	}
}
