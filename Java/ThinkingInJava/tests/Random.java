package tests;

public class Random {

	public static void main(String[] args) {
	//	int number = (int)(Math.random()*100);
		for(int number = 1; number <= 100; number++){
			if (number == 47){
				break;
			}
			System.out.println(number);
		}
	}

}
