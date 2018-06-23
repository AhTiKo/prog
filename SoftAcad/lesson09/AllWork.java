package lesson09;

public class AllWork {
	private Task tasks[];
	private int freePlacesForTasks;
	private int currentUnassignedTasks;

	public AllWork() {
		freePlacesForTasks = 10;
		tasks = new Task[freePlacesForTasks];
		currentUnassignedTasks = 0;
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

	public int getCurrentUnassignedTasks() {
		return currentUnassignedTasks;
	}

	public void setCurrentUnassignedTasks(int currentUnassignedTasks) {
		this.currentUnassignedTasks = currentUnassignedTasks;
	}

	public void addTask(Task task) {
		if (freePlacesForTasks > 0) {
			tasks[tasks.length - freePlacesForTasks] = task;
			freePlacesForTasks--;
			System.out.println(task.getName() + "has been added to the tasks!");
		} else {
			System.out.println("No empty places for task!");
		}
	}

	public Task getNextTask() {
		if (currentUnassignedTasks < tasks.length - freePlacesForTasks) {
			return tasks[currentUnassignedTasks++];
		}
		return null;
	}

	public boolean isAllWorkDone() {
		for (int i = 0; i < tasks.length - freePlacesForTasks; i++) {
			if (tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}

}
