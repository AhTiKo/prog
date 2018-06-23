package hwk01;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Degrees Celsius: ");
		double degC = scan.nextDouble();
		double degF = (degC * 9 /5) + 32;
		System.out.println("Degrees Fahrenheit = " + degF);
	}

}
