package chapter8;

public class Problem1 {

	public static void main(String[] args) {
		double number1 = 2.33d;
		double number2 = 3.3443d;
		sum(number1,number2);
	}
	
	public static void sum(double a, double b) {
		double sum = a + b;
		System.out.printf("%.4f",sum);
	}

}
