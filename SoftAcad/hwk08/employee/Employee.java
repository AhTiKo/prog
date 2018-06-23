package hwk08.employee;

public class Employee {
	private String name;
	private Task currentTask;
	private double hoursLeft;
	private AllWork allWork;

	public Employee(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Name is not valid!");
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
		if (currentTask != null) {
			System.out.println("Assigning task " + currentTask.getName() + " to " + this.getName());
		} else {
			System.out.println(this.getName() + " no task!");
		}
	
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("HourLeft is not valid!");
		}

	}
	
	public AllWork getAllwork() {
		return allWork;
	}

	public void setAllWork(AllWork allWork) {
		this.allWork = allWork;
	}

	public void work() {
		if(getCurrentTask() != null){
			if (this.currentTask.getWorkingHours() >= this.hoursLeft) {
				System.out.println(this.getName() + " is working on task " + this.currentTask.getName() + " for " + this.getHoursLeft() +" hours.");
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.setHoursLeft(0); 
				return;
			} else {
				this.hoursLeft = this.hoursLeft - this.currentTask.getWorkingHours();
				System.out.println(this.getName() + " is working on task " + this.currentTask.getName() + " for " + this.currentTask.getWorkingHours() +" hours.");
				this.currentTask.setWorkingHours(0);
				this.setCurrentTask(allWork.getNextTask());
				if (currentTask == null) {
					return;
				}
			this.work();
			}
//			showReport();
		} else {
			this.setCurrentTask(allWork.getNextTask());
			if (this.currentTask != null) {
				this.work();
			}else {
				return;	
			}
		}
		
	}

	private void showReport() {
		System.out.println("Employee's name : " + this.name);
		System.out.println("Current task : " + this.currentTask.getName());
		if (this.getHoursLeft() == 0) {
			System.out.println("Workday is over!");
		} else {
			System.out.println("Time until the end of the working day : " + this.hoursLeft);
		}
		if (this.currentTask.getWorkingHours() == 0) {
			System.out.println("Task completed!");
		} else {
			System.out.println("Time to complete the task : " + this.currentTask.getWorkingHours());
		}
		System.out.println();
	}
	
	public void startWorkingDay(){
		this.setHoursLeft(8);
		this.work();
	}



}
