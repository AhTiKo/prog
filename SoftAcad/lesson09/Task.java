package lesson09;

public class Task {
	private String name;
	private int workingHours;

	Task(String name, int workingHours) {
		
		setName(name);
		setWorkingHours(workingHours);
	}

	void setName(String nameToSet) {
		if (nameToSet != null && !nameToSet.isEmpty()) {
			this.name = nameToSet;
		}
	}

	void setWorkingHours(int hoursToSet) {
		if (hoursToSet >= 0) {
			this.workingHours = hoursToSet;
		}
	}

	String getName() {
		return this.name;
	}

	int getWorkingHours() {
		return this.workingHours;
	}

	
	
}
