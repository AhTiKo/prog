package lesson10;

public class SportCar extends Car{
	private boolean isCabriolet;
	
	
	public SportCar(String model, String color, boolean isCabriolet){
		super(model,true,color);
		this.isCabriolet = isCabriolet;
	}
	
	public SportCar(String model, String color, double price, int maxSpeed, boolean isCabriolet){
		super(model,true, color, price, maxSpeed);
		this.isCabriolet = isCabriolet;
	}
	
	public void setCabriolet(boolean isCabriolet) {
		this.isCabriolet = isCabriolet;
	}


	public void switshTurbo(){
		System.out.println("Switching turbo!");
	}

	public boolean isCabriolet() {
		return isCabriolet;
	}
	@Override
	public void startEngine() {
		super.startEngine();
		switshTurbo();
	}
}



