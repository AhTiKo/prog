package hwk04;

import java.util.Scanner;

public class Prob01 {

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
		int minValue = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if((arr[i] < minValue) && (arr[i] % 3 == 0)) {
				minValue = arr[i];
			}
		}
		
		if (minValue != Integer.MAX_VALUE) {
			System.out.println("���-������� ����� ������ �� 3 � " + minValue);
		} else {
			System.out.println("���� ������ �� 3 ����� � ������!");
		}
	}

}
