package hwk04;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int len;
		do {
			System.out.println("�������� ������� �� ������, ����� �� � ������ �� 2: ");
			len = scan.nextInt();
		} while (len % 2 != 0);
		
		int[] arr = new int[len];
		
		for (int i = 0; i < arr.length / 2; i++) {
			System.out.println("�������� " + (i+1) + "-� �������: ");
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arr.length / 2; i++) {
			arr[arr.length / 2 + i] = arr[i];
		}
		System.out.println("��������� �: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
