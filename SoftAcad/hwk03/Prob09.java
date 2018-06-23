package hwk03;

import java.util.Scanner;

public class Prob09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете първото число: ");
		int a = scan.nextInt();
		System.out.println("Въведете второто число: ");
		int b = scan.nextInt();
		
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = b; i <= a; i++) {
				System.out.print(i + " ");
			}
		}
	}

}
