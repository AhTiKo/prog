package hwk06.zoo;

public class Zoo {
	Monkey[] monkeys = new Monkey[10];
	Lion[] lions = new Lion[10];
	Eagle[] eagles = new Eagle[10];
	Snake[] snakes = new Snake[10];
	Shark[] sharks = new Shark[10];

	void addMonkey(String speciesOfMonkey, int speed) {
		boolean isFull = true;
		for (int i = 0; i < monkeys.length; i++) {
			if (monkeys[i] == null) {
				monkeys[i] = new Monkey(speciesOfMonkey, speed);
				System.out.println(monkeys[i] + " - added in cell: " + (i+1));
				isFull = false;
				break;
			}
		}
		if (isFull) {
			System.out.println("There is no room for more monkeys");
		}
	}

	void addLion(int speed) {
		boolean isFull = true;
		for (int i = 0; i < lions.length; i++) {
			if (lions[i] == null) {
				lions[i] = new Lion(speed);
				System.out.println(lions[i] + " - added in cell: " + (i+1));
				isFull = false;
				break;
			}
		}
		if (isFull) {
			System.out.println("There is no room for more lions");
		}
	}

	void addEagle(String speciesOfEagle, int speed) {
		boolean isFull = true;
		for (int i = 0; i < eagles.length; i++) {
			if (eagles[i] == null) {
				eagles[i] = new Eagle(speciesOfEagle, speed);
				System.out.println(eagles[i] + " - added in cell: " + (i + 1));
				isFull = false;
				break;
			}
		}
		if (isFull) {
			System.out.println("There is no room for more eagles");
		}
	}

	void addSnake(String speciesOfSnake, int speed) {
		boolean isFull = true;
		for (int i = 0; i < snakes.length; i++) {
			if (snakes[i] == null) {
				snakes[i] = new Snake(speciesOfSnake, speed);
				System.out.println(snakes[i] + " - added in terarium: " + (i+1));
				isFull = false;
				break;
			}
		}
		if (isFull) {
			System.out.println("There is no room for more snakes");
		}
	}

	void addShark(String speciesOfShark, int speed) {
		boolean isFull = true;
		for (int i = 0; i < sharks.length; i++) {
			if (sharks[i] == null) {
				sharks[i] = new Shark(speciesOfShark, speed);
				System.out.println(sharks[i] + " - added in aquarium: " + (i+1));
				isFull = false;
				break;
			}
		}
		if (isFull) {
			System.out.println("There is no room for more sharks");
		}
	}

	void removeMonkey() {
		boolean isEmpty = true;
		for (int i = monkeys.length - 1; i >= 0; i--) {
			if (monkeys[i] != null) {
				System.out.println(monkeys[i] + " from cell: " + (i + 1) + " - removed!");
				monkeys[i] = null;
				Monkey.countMounkeyDown();
				Animal.countAnimalsDown();
				Animal.getCountMammals();
				isEmpty = false;
				break;
			}
		}
		if (isEmpty) {
			System.out.println("No monkeys!");
		}
	}
	
	void removeLion() {
		boolean isEmpty = true;
		for (int i = lions.length - 1; i >= 0; i--) {
			if (lions[i] != null) {
				System.out.print(lions[i] + " from cell: " + (i + 1) + " - removed!");
				lions[i] = null;
				Lion.countLionsDown();
				Animal.countAnimalsDown();
				Animal.getCountMammals();
				isEmpty = false;
				break;
			}
		}
		if (isEmpty) {
			System.out.println("No lions!");
		}
	}
	
	void removeEagle() {
		boolean isEmpty = true;
		for (int i = eagles.length - 1; i >= 0; i--) {
			if (eagles[i] != null) {
				System.out.print(eagles[i] + " from cell: " + (i + 1) + " - removed!");
				eagles[i] = null;
				Eagle.countEaglesDown();
				Animal.countAnimalsDown();
				isEmpty = false;
				break;
			}
		}
		if (isEmpty) {
			System.out.println("No eagles!");
		}
	}
	
	void removeSnake() {
		boolean isEmpty = true;
		for (int i = snakes.length - 1; i >= 0; i--) {
			if (snakes[i] != null) {
				System.out.print(snakes[i] + " from terarium: " + (i + 1) + " - removed!");
				snakes[i] = null;
				Snake.countSnakesDown();
				Animal.countAnimalsDown();
				isEmpty = false;
				break;
			}
		}
		if (isEmpty) {
			System.out.println("No snake!");
		}
	}
	
	void removeShark() {
		boolean isEmpty = true;
		for (int i = sharks.length - 1; i >= 0; i--) {
			if (sharks[i] != null) {
				System.out.println(sharks[i] + " from aquarium: " + (i + 1) + " - removed!");
				sharks[i] = null;
				Shark.countSharksDown();
				Animal.countAnimalsDown();
				Animal.getCountFishes();
				isEmpty = false;
				break;
			}
		}
		if (isEmpty) {
			System.out.println("No sharks!");
		}
	}

	int getAnimalsCount() {
		return Animal.getCountAnimals();
	}

	int getMammalsCount() {
		return Animal.getCountMammals();
	}

	int getFishesCount() {
		return Animal.getCountFishes();
	}
	
	public void printAllAnimal(){
		for (int i = 0; i < monkeys.length; i++) {
			if(monkeys[i] == null){
				break;
			}
			System.out.println(monkeys[i]);
		}
		
		for (int i = 0; i < lions.length; i++) {
			if(lions[i] == null){
				break;
			}
			System.out.println(lions[i]);
		}
		for (int i = 0; i < eagles.length; i++) {
			if(eagles[i] == null){
				break;
			}
			System.out.println(eagles[i]);
		}
		for (int i = 0; i < snakes.length; i++) {
			if(snakes[i] == null){
				break;
			}
			System.out.println(snakes[i]);
		}
		for (int i = 0; i < sharks.length; i++) {
			if(sharks[i] == null){
				break;
			}
			System.out.println(sharks[i]);
		}
	}
	
	public void printAllFreeCells() {
		
		int freeMonkeyCells = monkeys.length - Monkey.getCountMonkeys();
		int freeLionCells = lions.length - Lion.getCountLions();
		int freeEagleCells = eagles.length - Eagle.getCountEagles();
		int freeSnakeTerariums = snakes.length - Snake.getCountSnakes();
		int freeSharkAquariums = sharks.length - Shark.getCountSharks();
		
		System.out.println("Free cells for monkeys : " + freeMonkeyCells);
		System.out.println("Free cells for lions : " + freeLionCells);
		System.out.println("Free cells for eagles : " + freeEagleCells);
		System.out.println("Free terariums for snakes : " + freeSnakeTerariums);
		System.out.println("Free aquariums for sharks : " + freeSharkAquariums);
	}

}
