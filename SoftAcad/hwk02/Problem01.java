package hwk02;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �: ");
		float a = scan.nextFloat();
		System.out.println("�������� B: ");
		float b = scan.nextFloat();
		System.out.println("�������� C: ");
		float c = scan.nextFloat();
		
		if (((a < c) && (c < b)) || ((a > c) && (c > b))) {
			System.out.println("������� " + c + " � ����� " + a + " � " + b);
		} else {
			System.out.println("������� " + c + " �� � ����� " + a + " � " + b);
		}
	}

}
