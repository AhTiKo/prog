package lesson10;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Honda",true,"Black");
		SportCar sportCar = new SportCar("Accura","Blue",true);
		
		car.startEngine();
		
		sportCar.startEngine();
	}

}
