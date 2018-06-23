package task4;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N [1..52]: ");
		int n = scan.nextInt();
		for (int i = n; i <= 52; i++) {
			System.out.print(findCard(i) + findColor(i));
			if (i != 52) {
				System.out.print(", ");
			}
		}
		
		
		

	}
	static String findColor (int n) {
		String color = "";
		switch (n % 4) {
		case 1: color = "������ "; break;
		case 2: color = "���� "; break;
		case 3: color = "���� "; break;
		case 0: color = "���� "; break;
		default:; break;
		}
		return color;
	}
	
	static String findCard (int n) {
		String card = "";
		switch ((n-1)/4) {
		case 0: card = "������ "; break;
		case 1: card = "������ "; break;
		case 2: card = "�������� "; break;
		case 3: card = "������ "; break;
		case 4: card = "������� "; break;
		case 5: card = "������� "; break;
		case 6: card = "������ "; break;
		case 7: card = "������� "; break;
		case 8: card = "������� "; break;
		case 9: card = "���� "; break;
		case 10: card = "���� "; break;
		case 11: card = "��� "; break;
		case 12: card = "��� "; break;
		default:; break;
		}
		return card;
	}

}
