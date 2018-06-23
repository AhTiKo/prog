package hwk10;

public class Person {

	private String name;
	private int age;
	private boolean isMale;

	public Person() {

	}

	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("Age is not valid!");
		}

	}

	public boolean isMale() {
		return isMale;
	}

	public void showPersonInfo() {
		System.out.println();
		System.out.println("Person: name: " + this.getName());
		System.out.println("age: " + this.getAge());
		System.out.print("sex: ");
		if (isMale) {
			System.out.println("man");
		} else {
			System.out.println("woman");
		}
	}

}
