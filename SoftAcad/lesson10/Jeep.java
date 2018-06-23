package lesson10;

public class Jeep extends Car {
	
	public Jeep (String model, String color){
		super(model, false, color);
	}
	
	public void switchAWD() {
		System.out.println("Switshing 4x4");
	}
	
	public void driveOffRoad(){
		System.out.println("Driving off road!");
	}

}
