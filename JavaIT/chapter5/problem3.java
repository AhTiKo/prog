package chapter5;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= number; i++){
			sum += i;
		}
		System.out.println("Sum is : " + sum);
	}

}
