package task3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temp outside: ");
		int temp = scan.nextInt();
		
		if (temp < - 20) {
			System.out.println("������ �������");
		}
		if (temp >  25) {
			System.out.println("������");
		}
		if ((temp > - 20) && (temp < -1)) {
			System.out.println("�������");
		}
		if ((temp > 0) && (temp < 14)) {
			System.out.println("������");
		}
		if ((temp > 15) && (temp < 25)) {
			System.out.println("�����");
		}

	}

}
