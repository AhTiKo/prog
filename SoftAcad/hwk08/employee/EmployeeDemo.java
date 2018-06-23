package hwk08.employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task1 = new Task("Task1", 10);
		Task taks2 = new Task("Task2", 4);
		Task taks3 = new Task("Task3", 7);
		Employee emp1 = new Employee("Prokopi");
		Employee emp2 = new Employee("Nastapinka");
		emp1.setHoursLeft(6);
		emp1.setCurrentTask(task1);
		emp1.work();
		emp2.setHoursLeft(8);
		emp2.setCurrentTask(taks3);
		emp2.work();
		emp2.setCurrentTask(taks2);
		emp2.work();
	}

}
