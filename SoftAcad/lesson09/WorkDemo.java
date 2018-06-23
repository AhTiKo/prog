package lesson09;

public class WorkDemo {
	public static void main(String[] args) {
		Task task1 = new Task("Dig", 8);
		Task task2 = new Task("Ora", 4);

		Employee ivancho = new Employee("Ivancho");
		Employee mariyka = new Employee("Mariyka");

		ivancho.setHoursLeft(5);
		mariyka.setHoursLeft(5);

		ivancho.setCurrentTask(task1);
		mariyka.setCurrentTask(task2);
	
		ivancho.work();
		mariyka.work();
		
		ivancho.showReport();
		mariyka.showReport();

	}
}
