package task4;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = scan.nextInt();
		int count = 0;
		int i = 1;
		while (count < x) {
			if (i % 3 == 0) {
				System.out.println(i);
				count ++;
			}
			i ++;
		}
	}

}
