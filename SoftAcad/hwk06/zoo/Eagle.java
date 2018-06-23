package hwk06.zoo;

public class Eagle extends Animal{
	
	private String speciesOfEagle;
	private static int countEagles = 0;
	
	public Eagle(String speciesOfEagle, int speed) {
		super(0,false,speed,false);
		this.speciesOfEagle = speciesOfEagle;
		countEagles ++;
	}
	
	public static int getCountEagles() {
		return countEagles;
	}
	
	public static void countEaglesDown() {
		if(countEagles > 0) {
			countEagles --;
		}
	}
	
	public void eat() {
		super.eat("eagle " + this.speciesOfEagle);
	}
	
	@Override
	public String toString() {
		return "eagle: " + this.speciesOfEagle + ", " + super.toString();
	}
}
