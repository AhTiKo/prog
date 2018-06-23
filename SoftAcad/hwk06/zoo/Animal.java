package hwk06.zoo;

public abstract class Animal {
	private int legsCount;
	private boolean isMammal;
	private int speed;
	private boolean isFish;
	private static int countAnimals = 0;
	private static int countMammals = 0;
	private static int countFishes = 0;
	
	public Animal(int legsCount, boolean isMammal, int speed, boolean isFish) {
		this.legsCount = legsCount;
		this.isMammal = isMammal;
		this.speed = speed;
		this.isFish = isFish;
		if (isMammal) {
			countMammals ++;
		} else if (isFish) {
			countFishes ++;
		}
		countAnimals ++;
	}
	
	public int getLegsCount() {
		return this.legsCount;
	}
	
	public static int getCountAnimals(){
		return countAnimals;
	}
	
	public static void countAnimalsDown(){
		if(countAnimals > 0){
			countAnimals --;
		}
	}
	
	public static int getCountMammals(){
		return countMammals;
	}
	
	public void countMammalDown(){
		if (countMammals > 0) {
			countMammals --;
		}
	}
	
	public static int getCountFishes(){
		return countFishes;
	}
	
	public static void countFishesDown(){
		if(countFishes > 0) {
			countFishes --;
		}
	}
	
	public void eat(String animal) {
		System.out.println("The " + animal + " is eating now!");
	}
	
	@Override
	public String toString() {
		String retString = "";
		if (this.isMammal) {
			retString = "mammal";
		} else if (isFish){
			retString += " fish";
		}
		
		return retString + ", legs: " + this.getLegsCount() + ", speed: " + this.speed;
	}
	
}
