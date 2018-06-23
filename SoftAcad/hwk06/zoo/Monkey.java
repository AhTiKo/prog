package hwk06.zoo;

public class Monkey extends Animal{
	
	private String speciesOfMonkey;
	private static int countMonkeys = 0;
	
	public Monkey(String speciesOfMonkey, int speed) {
		super(4,true,speed,false);
		this.speciesOfMonkey = speciesOfMonkey;
		countMonkeys ++;
	}
	
	public static int getCountMonkeys() {
		return countMonkeys;
	}
	
	public static void countMounkeyDown() {
		if(countMonkeys > 0){
			countMonkeys --;
		}
	}
	
	
	public void eat() {
		super.eat("monkey " + this.speciesOfMonkey);
	}
	
	@Override
	public String toString() {
		return "monkey: " + this.speciesOfMonkey + ", " + super.toString();
	}
}

