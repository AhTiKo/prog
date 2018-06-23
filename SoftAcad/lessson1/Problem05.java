package hwk01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Degrees Fahrenheit: ");
		double degF = scan.nextDouble();
		double degC = (degF - 32)*5/9;
		System.out.println("Degrees Celsius = " + degC);
	}

}
