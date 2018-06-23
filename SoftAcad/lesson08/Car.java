package lesson08;

public class Car {
	private String model;
	private int year;
	static int countOfObj;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
		countOfObj ++;
	}
	

}
