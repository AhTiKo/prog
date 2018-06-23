package lesson06;

public class Person {
	
	String name;
	int age;
	long presonalNumbber;
	boolean isWoman;
	double weight;
	Person friend;
	
	void eat() {
		System.out.println(this.name + " is eating!");
	}
	
	void growUp(){
		this.age ++;
	}
	
	void drinkWater(float liters) {
		if(liters < 1) {
			System.out.println(this.name + " is drinking " + liters + " water!");
		} else {
			System.out.println("This is too much water!");
		}
	}
	
	void printPersonSpec() {
		System.out.print("name: " + this.name + ", age: " + this.age + ", sex: ");
		if(this.isWoman) {
			System.out.print("woman");
		} else {
			System.out.print("man");
		}
		System.out.print(" weight: " + this.weight + " ,PN: " + this.presonalNumbber + " ,friend: " + this.friend + " \n" );
	}
}
