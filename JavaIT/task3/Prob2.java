package task3;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 > num2) {
			if (num2 > num3) {
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			} else {
				if (num1 > num3) {
					System.out.println(num1);
					System.out.println(num3);
					System.out.println(num2);
				} else {
					System.out.println(num3);
					System.out.println(num1);
					System.out.println(num2);
				}
				
			}
		}else {
			if (num1 > num3) {
				System.out.println(num2);
				System.out.println(num1);
				System.out.println(num3);
			} else {
				if (num2 > num3) {
					System.out.println(num2);
					System.out.println(num3);
					System.out.println(num1);
				} else {
					System.out.println(num3);
					System.out.println(num2);
					System.out.println(num1);
				}
			}
		}
	}

}
