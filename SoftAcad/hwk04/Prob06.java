package hwk04;

import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ������� �� ������: ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		System.out.println("�������� ���������� �� ������: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] arr2 = new int[len];
		
		for (int i = 0; i < arr2.length; i++) {
			int prev = 0;
			int next = 0;
			if (i != 0 && i != arr2.length -1) {
				prev = arr[i - 1];
				next = arr[i + 1];
			} else if(i == 0) {
				next = arr[i + 1];
			} else {
				prev = arr[i - 1];
			}
			arr2[i] = prev + next;
		}
		
		System.out.print("��������� ����� �: {");
		for (int i = 0; i < arr2.length - 1; i++) {
			System.out.print( arr2[i] + ", ");
		}
		System.out.println(arr2[arr2.length - 1] + "}");
		
	}

}
