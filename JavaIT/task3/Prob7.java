package task3;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date : ");
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		int days = 0 ;
		for (int i = 1; i < month; i++) {
			int dayOfMonth = 0;
			switch (i) {
			case 1: 
				dayOfMonth = 31; break;
			case 2:
				if(year % 4 == 0){
					dayOfMonth = 29;
				} else {
					dayOfMonth = 28;
				}
				break;
			case 3: dayOfMonth = 31; break;
			case 4: dayOfMonth = 30; break;
			case 5: dayOfMonth = 31; break;
			case 6: dayOfMonth = 30; break;
			case 7: dayOfMonth = 31; break;
			case 8: dayOfMonth = 31; break;
			case 9: dayOfMonth = 30; break;
			case 10: dayOfMonth = 31; break;
			case 11: dayOfMonth = 30; break;
			case 12: dayOfMonth = 31; break;
			default:
				break;
			}
			days += dayOfMonth;
		}
		days += day ;
		
		System.out.println(days);
		

	}

}
