package hwk08.race;

public class Car {
	private String model;
	private int year;
	private static int currentLeader;

	public Car(String model, int year) {
		setModel(model);
		setYear(year);
	}

	public static int getCurrentLeader() {
		return currentLeader;
	}

	public static void setCurrentLeader(int currentLeader) {
		if (currentLeader >= 1 && currentLeader <= 20) {
			Car.currentLeader = currentLeader;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if ( model != null && !model.equals("")) {
			this.model = model;
		} else {
			throw new IllegalArgumentException("The Model is not valid!");
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1960 && year <= 2017) {
			this.year = year;
		} else {
			throw new IllegalArgumentException ("Year is not valid!");
		}
	}

}
