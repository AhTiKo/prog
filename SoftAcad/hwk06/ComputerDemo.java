package hwk06;

public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer dell = new Computer();
		dell.year = 2015;
		dell.price = 1450f;
		dell.isNotebook = false;
		dell.hardDiskMemory = 1000f;
		dell.freeMemory = 2048f;
		dell.operationSystem = "Windows 7";
		
		Computer hp = new Computer();
		hp.year = 2016;
		hp.price = 2225;
		hp.isNotebook = true;
		hp.hardDiskMemory = 1500f;
		hp.freeMemory = 4096f;
		hp.operationSystem = "Windows 10";
		
		dell.printComputerParam();
		hp.printComputerParam();
		
		dell.useMemory(100);
		hp.changeOperationsystem("Dos 3.11");
		
		dell.printComputerParam();
		hp.printComputerParam();
		
	}

}
