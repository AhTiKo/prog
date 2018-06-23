package lesson07;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pesho = new Person();
		pesho.name = "Pesho";
		pesho.age = 23;
		pesho.isWoman = false;
		
		
		pesho.drinkWater(1.5);
		System.out.println(pesho.age);
		pesho.growUp();
		System.out.println(pesho.age);
		pesho.eat();
		pesho.drinkWater(0.5);
		Car car4 = new Car("lada", false, "Yellow", 2000, 150);
		Car car5 = new Car("trabant", true, "Black", 4000, 285);
		
		pesho.money = 20000;
		pesho.buyCar(car4);
		System.out.println(pesho.car.model);
		System.out.println(pesho.money);
		
		Person stamat = new Person();
		stamat.money = 30000;
		stamat.buyCar(pesho.car);
		System.out.println(stamat.car.model);
		System.out.println("Stamat money :" + stamat.money);
//		System.out.println(pesho.car.model);
		System.out.println("Pesho money : " +pesho.money);
		System.out.println(stamat.sellCarForScrap());
		System.out.println("Stamat money :" + stamat.money);
	}

}
