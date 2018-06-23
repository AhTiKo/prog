package chapter8;

public class Problem2 {

	public static void main(String[] args) {
		double number1 = 2.33d;
		double number2 = 3.3443d;
		calAverage(number1,number2);
	}
	
	public static void calAverage(double a, double b) {
		double average = (a + b)/2;
		System.out.printf("%.4f",average);
	}

}
