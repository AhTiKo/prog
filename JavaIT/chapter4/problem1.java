package chapter4;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double number3 = sc.nextDouble();
			if ((number1 >= number2) && (number1 >= number3)) {
				System.out.println(number1);
			}else {
				if ((number2 >= number1) && (number2 >= number3)) {
					System.out.println(number2);
				
				} else {
					System.out.println(number3);
				}
			}
		

	}

}
