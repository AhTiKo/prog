package hwk10;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persons[] = new Person[10];

		persons[0] = new Person("Stamat", 17, true);
		persons[1] = new Person("Pena", 23, false);
		persons[2] = new Student("Prokopi", 19, true, 4);
		persons[3] = new Student("Mara", 18, false, 6);
		persons[4] = new Employee("Pesho", 31, true, 50);
		persons[5] = new Employee("Nastapinka", 17, false, 160);

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				if (persons[i].getClass() == Student.class) {
					((Student) persons[i]).showStudentInfo();
				} else if (persons[i].getClass() == Employee.class) {
					((Employee) persons[i]).showEmployeeInfo();
				} else {
					persons[i].showPersonInfo();
				}

			}
		}

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				if (persons[i].getClass() == Employee.class) {
					((Employee) persons[i]).showEmployeeInfo();
					System.out.printf("day overtime: %.2f %n",((Employee) persons[i]).calculateOvertime(2));
				}
			}
		}
	}

}
