package lesson07;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Mazda", true , "Blue");
		System.out.println( "model :" + myCar.model + ", isSport: " + myCar.isSportCar + ", color: " + myCar.color);
		myCar.color = "Yellow";
		
		System.out.println(myCar.color);
		
		myCar.changeColor("Blue");
		System.out.println(myCar.color);
		myCar.maxSpeed = 204;
		myCar.currentSpeed = 143;
		double dif = myCar.calculateDif();
		System.out.println(dif);
		
		System.out.println(myCar.calculateCurrentConsumation(10));
		
		
	}

}
