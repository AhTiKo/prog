package lesson18;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cage<Animal> cage = new Cage<Animal>();
		cage.add(new Bird());
		cage.add(new Mammal());
		System.out.println(cage.isContained(new Virus()));
	}

}
