package lesson07;

public class CarShopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop carShop = new CarShop(5);
		Car car1 = new Car("Lada",false,"White");
		carShop.addCar(car1);
		System.out.println(carShop.carsCount);
		Car car2 = new Car("Trabant",false,"White");
		carShop.addCar(car2);
		System.out.println(carShop.carsCount);
		for (int i = 0; i < carShop.carsCount; i++) {
			System.out.println(carShop.cars[i].model);
		}
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
//		System.out.println(carShop.getNextCar().model);
		Person stamat = new Person();
		stamat.money = 30000;
		carShop.sellNextCar(stamat);
		
	}

}
