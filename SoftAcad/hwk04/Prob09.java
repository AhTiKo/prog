package hwk04;

import java.util.Scanner;

public class Prob09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ������� �� ������ �����: ");
		int len = scan.nextInt();
		int[] arr1 = new int[len];
		System.out.println("�������� ���������� �� ������ �����: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("�������� ������� �� ������ �����: ");
		int len2 = scan.nextInt();
		int[] arr2 = new int[len2];
		System.out.println("�������� ���������� �� ������ �����: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		boolean isSame = true;
		boolean isEqualLen = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					isSame = false;
					break;
				}
			}
		} else {
			isEqualLen = false;
		}
		
		if (isEqualLen && isSame) {
			System.out.println("�������� �� �������.");
		} else if(isEqualLen && !isSame) {
			System.out.println("�������� �� ��������.");
			System.out.println("�������� ���� ������� ������.");
		} else {
			System.out.println("�������� �� ��������.");
		}
	}

}
