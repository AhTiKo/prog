package hwk06.zoo;

public class Lion extends Animal{
	
	private int lionNumber;
	private static int countLions = 0;
	
	public Lion(int speed) {
		super(0,false,speed,true);
		this.lionNumber = ++countLions;
	}
	
	public static int getCountLions() {
		return countLions;
	}
	
	public static void countLionsDown() {
		if(countLions > 0) {
			countLions --;
		}
	}
	
	public void eat() {
		super.eat("lion " + this.lionNumber);
	}
	
	@Override
	public String toString() {
		return "lion: " + this.lionNumber + ", " + super.toString();
	}
}
