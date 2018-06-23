package hwk06;

public class Computer {
	int year;
	float price;
	boolean isNotebook;
	float hardDiskMemory;
	float freeMemory;
	String operationSystem;
	
	void changeOperationsystem (String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}
	void useMemory (float memory) {
		if (memory <= this.freeMemory) {
			this.freeMemory -= memory;
		} else {
			this.freeMemory = 0f;
			System.out.println("Not enough free memory!");
		}
	}
	
	void printComputerParam() {
		System.out.println("Year : " + this.year);
		System.out.println("Price: " + this.price);
		System.out.print("Type: ");
		if(this.isNotebook) {
			System.out.println("Notebook");
		} else {
			System.out.println("Desktop");
		}
		System.out.println("HDD : " + this.hardDiskMemory + " GB");
		System.out.println("Free memory: " + this.freeMemory + " MB");
		System.out.println("Operation system: " + this.operationSystem);
		System.out.println();
	}
 }
