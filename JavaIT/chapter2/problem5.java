package chapter2;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		boolean isDev = false;
		if ((number % 7) == 0) {
			isDev = true;
		}
		System.out.println(isDev);

	}

}
