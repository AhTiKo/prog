package chapter4;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your money: ");
		double money = scan.nextDouble();
		String ill = null;
		boolean isIll = false;
		do {
			System.out.print("is ill? (y/n) : ");
			ill = scan.next();
		}
		while (!((ill.equals("true") || (ill.equals("false")))));
		
		if(ill.equals("true")) {
			isIll = true;
		}
		if (isIll) {
			if (money > 10) {
				System.out.println("�� �� ���� ���������!");
			} else {
				System.out.println("�� ��� ���!");
			}
 			
		} else {
			if (money > 10) {
				System.out.println("�� ��� �� ����!");
			} else {
				System.out.println("�� ��� �� ��������!");
			}
		}
		

	}

}
