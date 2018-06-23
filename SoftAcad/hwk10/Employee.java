package hwk10;

public class Employee extends Person {

	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}

	public double calculateOvertime(double hours) {
		double hourSalary = this.daySalary / 8;
		if (this.getAge() < 18) {
			return 0;
		} else {
			return hourSalary * 1.5 * hours;
		}
	}

	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.printf("day salary: %.2f %n", this.getDaySalary());
	}

}
