package task3;

import java.util.Scanner;

public class Prog9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter hour [0-24] : ");
		int hour = scan.nextInt();
		
		switch (hour) {
		case 4:;
		case 5:;
		case 6:;
		case 7:;
		case 8:;
		case 9:
			System.out.println("Добро утро!"); 
			break;
		case 10:;
		case 11:;
		case 12:;
		case 13:;
		case 14:;
		case 15:;
		case 16:;
		case 17:;
		case 18:
			System.out.println("Добър ден!"); 
		break;
		case 19:;
		case 20:;
		case 21:;
		case 22:;
		case 23:;
		case 0:;
		case 1:;
		case 3:
			System.out.println("Добра вечер!");
			break;
		default:
			System.out.println("Не сте въвели коректен час!"); 
			break;
		}

	}

}
