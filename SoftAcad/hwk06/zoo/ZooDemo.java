package hwk06.zoo;

public class ZooDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		zoo.addMonkey("gibon", 45);
		zoo.addMonkey("gorila", 60);
		zoo.addMonkey("shimpanze", 40);
		System.out.println(zoo.monkeys[1].getLegsCount());
		zoo.monkeys[1].eat();
		zoo.removeMonkey();
		
		zoo.addEagle("Golden eagle", 80);
		zoo.addEagle("Bald eagle", 85);
		
		zoo.addLion(70);
		zoo.addLion(81);
		zoo.removeLion();
		for (int i = 0; i < 10 ; i++) {
			zoo.addLion(70 + i);
		}
		
		zoo.addShark("white", 60);
		zoo.addShark("hammer", 70);
		
		zoo.removeSnake();
		zoo.addSnake("cobra", 30);
		zoo.addSnake("anaconda", 15);
		
		System.out.println(zoo.getAnimalsCount());
		System.out.println(zoo.getMammalsCount());
		System.out.println(zoo.getFishesCount());
		
		zoo.printAllAnimal();
		zoo.printAllFreeCells();
		
	}

}
