package hwk06.zoo;

public class Shark extends Animal{
	
	private String speciesOfShark;
	private static int countSharks = 0;
	
	public Shark(String speciesOfShark, int speed) {
		super(0,false,speed,true);
		this.speciesOfShark = speciesOfShark;
		countSharks ++;
	}
	
	public static int getCountSharks() {
		return countSharks;
	}
	
	public static void countSharksDown() {
		if(countSharks > 0) {
			countSharks --;
		}
	}
	
	public void eat() {
		super.eat("shark " + this.speciesOfShark);
	}
	
	@Override
	public String toString() {
		return "shark: " + this.speciesOfShark + ", " + super.toString();
	}
}
