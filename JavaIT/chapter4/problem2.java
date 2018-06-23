package chapter4;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double number3 = sc.nextDouble();
		boolean isMid = false;
		
		if (((number2 > number1) && (number2 < number3))||((number2 > number3) && (number2 < number1))) {
			isMid = true;
		}
		System.out.println(isMid);	

	}

}