package hwk04;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ������� �� ������: ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������� " + (i+1) + "-� �������: ");
			arr[i] = scan.nextInt();
		}
		
		boolean isMirror = true;
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				isMirror = false;
				break;
			}
		}
		
		if (isMirror) {
			System.out.println("������ � ���������");
		} else {
			System.out.println("������ �� � ���������");
		}
	}

}
