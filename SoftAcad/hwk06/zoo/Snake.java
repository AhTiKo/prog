package hwk06.zoo;

public class Snake extends Animal{
	
	private String speciesOfSnake;
	private static int countSnakes = 0;
	
	public Snake(String speciesOfSnake, int speed) {
		super(0,false,speed,false);
		this.speciesOfSnake = speciesOfSnake;
		countSnakes ++;
	}
	
	public static int getCountSnakes() {
		return countSnakes;
	}
	
	public static void countSnakesDown() {
		if(countSnakes > 0){
			countSnakes --;
		}
	}
	
	public void eat() {
		super.eat("snake " + this.speciesOfSnake);
	}
	
	@Override
	public String toString() {
		return "snake: " + this.speciesOfSnake + ", " + super.toString();
	}	
}
