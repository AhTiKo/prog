package lesson09;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	public Employee(String name) {
		setName(name);
	}

	public void work() {
//		if (this.currentTask != null && this.currentTask.getWorkingHours() == 0) {
//			this.setCurrentTask(allWork.getNextTask());
//		}
		
		if (getCurrentTask() != null) {
			if (this.hoursLeft >= currentTask.getWorkingHours()) {
				hoursLeft -= currentTask.getWorkingHours();
				System.out.println(this.getName() + " is working on task " + this.currentTask.getName() + " for " + this.currentTask.getWorkingHours() +" hours.");
				currentTask.setWorkingHours(0);
				setCurrentTask(allWork.getNextTask());
			} else {
				currentTask.setWorkingHours(currentTask.getWorkingHours() - getHoursLeft());
				System.out.println(this.getName() + " is working on task" + this.currentTask.getName() + "for " + this.getHoursLeft() +" hours.");
				setHoursLeft(0);
				this.startWorkingDay();
			}
		} else {
			setCurrentTask(allWork.getNextTask());
		}
	}

	public void showReport(){
		System.out.println(getName()+" "+this.currentTask.getName()+" "
				+getHoursLeft()+ " "+this.currentTask.getWorkingHours());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
			System.out.println("Assigning task " + currentTask.getName() + " to " + this.getName());
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	public static AllWork getAllWork() {
		return allWork;
	}

	public static void setAllWork(AllWork allWork) {
		Employee.allWork = allWork;
	}
	
	public void startWorkingDay() {
		this.hoursLeft = 8;
		
	}

}
