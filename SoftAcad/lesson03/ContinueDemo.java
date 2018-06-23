package lesson03;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i > 2 && i < 8) {
				continue;
			}
			sum += i;
		}
		
		System.out.println("End of continue demo " + sum);
	}

}
