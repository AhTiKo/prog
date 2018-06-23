package hwk08.employee;

public class AllWork {
	private Task tasks[];
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	public AllWork(){
		this.tasks = new Task[10];
		this.freePlacesForTasks = tasks.length;
		this.currentUnassignedTask = 0;
	}
	
	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		this.currentUnassignedTask = currentUnassignedTask;
	}
	
	public void addTask(Task task){
		if (freePlacesForTasks > 0) {
			this.tasks[tasks.length - freePlacesForTasks] = task;
			freePlacesForTasks --;
		}
	}
	
	public Task getNextTask(){
		if (currentUnassignedTask < tasks.length - freePlacesForTasks) {
			return tasks[currentUnassignedTask ++];
		} else {
			return null;
		}
	}
	
	public boolean isAllWorkDone(){
		for (int i = 0; i < tasks.length - freePlacesForTasks; i++) {
			if (tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}


	
}
