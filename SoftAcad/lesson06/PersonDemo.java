package lesson06;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ivancho = new Person();
		ivancho.age = 31;
		ivancho.isWoman = false;
		ivancho.name = "Ivancho";
		ivancho.presonalNumbber = 123456L;
		ivancho.weight = 80.5;
		
		Person mariyka = new Person();
		mariyka.age = 39;
		mariyka.isWoman = false;
		mariyka.name ="Mara";
		mariyka.presonalNumbber = 34234234L;
		mariyka.weight = 90.5;
		
		ivancho.printPersonSpec();
		mariyka.printPersonSpec();
		
		System.out.println(ivancho.weight);
		System.out.println(mariyka.isWoman + "  " + mariyka.weight );
		
		mariyka.growUp();
		ivancho.eat();
		mariyka.drinkWater(0.4f);
		
		ivancho.printPersonSpec();
		mariyka.printPersonSpec();
		
	}

}
