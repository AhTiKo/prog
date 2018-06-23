package hwk08.employee;

public class WorkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllWork allWork = new AllWork();
		allWork.addTask(new Task("Task 1", 15));
		allWork.addTask(new Task("Task 2", 4));
		allWork.addTask(new Task("Task 3", 6));
		allWork.addTask(new Task("Task 4", 1));
		allWork.addTask(new Task("Task 5", 32));
		allWork.addTask(new Task("Task 6", 40));
		allWork.addTask(new Task("Task 7", 18));
		allWork.addTask(new Task("Task 8", 2));
		allWork.addTask(new Task("Task 9", 3));
		allWork.addTask(new Task("Task 10", 2));
		
		Employee e1 = new Employee("Ivan");
		Employee e2 = new Employee("Niki");
		Employee e3 = new Employee("Tina");
		
		e1.setAllWork(allWork);
		e2.setAllWork(allWork);
		e3.setAllWork(allWork);
		
		int workDay = 1;
		
		while(!allWork.isAllWorkDone()){
			System.out.println();
			System.out.println("Start working day number " + workDay ++);

			e1.startWorkingDay();
			e2.startWorkingDay();
			e3.startWorkingDay();

		}
	}

}
