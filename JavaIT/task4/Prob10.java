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
		case 1: color = "спатия "; break;
		case 2: color = "каро "; break;
		case 3: color = "купа "; break;
		case 0: color = "пика "; break;
		default:; break;
		}
		return color;
	}
	
	static String findCard (int n) {
		String card = "";
		switch ((n-1)/4) {
		case 0: card = "Двойка "; break;
		case 1: card = "Тройка "; break;
		case 2: card = "Четворка "; break;
		case 3: card = "Петица "; break;
		case 4: card = "Шестица "; break;
		case 5: card = "Седмица "; break;
		case 6: card = "Осмица "; break;
		case 7: card = "Девятка "; break;
		case 8: card = "Десятка "; break;
		case 9: card = "Вале "; break;
		case 10: card = "Дама "; break;
		case 11: card = "Поп "; break;
		case 12: card = "Асо "; break;
		default:; break;
		}
		return card;
	}

}
