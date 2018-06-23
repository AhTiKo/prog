package lesson06;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car volvo = new Car();
		Car honda = new Car();
		Car ford = new Car();
		
		volvo.model = "Volvo V70";
		volvo.color = "white";
		volvo.maxSpeed = 250;
		volvo.currentSpeed = 185;
		volvo.currentGear = 5;
		
		honda.model = "Honda Civic";
		honda.color = "blue";
		honda.maxSpeed = 140;
		honda.currentSpeed = 94;
		honda.currentGear = 4;
		
		ford.model = "Ford GT";
		ford.color = "black";
		ford.maxSpeed = 267;
		ford.currentSpeed = 235;
		ford.currentGear = 6;
		
		System.out.println("model: " + honda.model + " max speed: " + honda.maxSpeed);
		
		System.out.println("model: " + volvo.model + ", current speed : " + volvo.currentSpeed + ", gear : " + volvo.currentGear);
		volvo.currentSpeed = 57;
		volvo.currentGear = 3;
		
		System.out.println("model: " + volvo.model + ", current speed : " + volvo.currentSpeed + ", gear : " + volvo.currentGear);
		
		honda.model = "Honda Accord";
		honda.maxSpeed = 235;
		
		System.out.println("model: " + honda.model + " max speed: " + honda.maxSpeed);
		
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
		
		Person baiShile = new Person();
		baiShile.name = "Bai Shile";
		baiShile.age = 84;
		baiShile.isWoman = false;
		baiShile.presonalNumbber = 1245323L;
		baiShile.weight = 96;
		
		ford.owner = mariyka;
		honda.owner = ivancho;
		
		System.out.println("model: " + ford.model +" ,owner: " + ford.owner.name + " ,owner weight: " + ford.owner.weight + " kg");
		System.out.println("model: " + honda.model +" ,owner: " + honda.owner.name + " ,owner age: " + honda.owner.age );
		
		ford.owner = baiShile;
	
		System.out.println("model: " + ford.model +" ,owner: " + ford.owner.name + ", owner age: " + ford.owner.age + ", owner weight: " + ford.owner.weight + " kg");
		
		
		baiShile.friend = mariyka;
		baiShile.friend.isWoman = true;
		
		System.out.println(baiShile.name + "'s friend is " + baiShile.friend.name );
		
		ford.printCarSpecs();
		ford.changeGearDown();
		ford.changeColor("Gray");
		ford.accelerate();
		ford.printCarSpecs();
		ford.changeGearUp();
		ford.printCarSpecs();
		honda.printCarSpecs();
		honda.changeGear(3);
		honda.printCarSpecs();
	}

}
