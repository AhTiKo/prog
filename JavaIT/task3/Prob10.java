package task3;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date : ");
		int day = scan.nextInt();
		int month = scan.nextInt();
		int year = scan.nextInt();
		int newDay = day;
		int newMonth = month;
		int newYear = year;
		
		switch (month) {
		case 1:;
		case 3:;
		case 5:;
		case 7:;
		case 8:;
		case 10:
			if (day == 31) {
				newDay = 1;
				newMonth += 1;
			} else {
				newDay += 1;
			};
			break;
		case 12:
			if (day == 31) {
				newDay = 1;
				newMonth = 1;
				newYear += 1;
			} else {
				newDay += 1;
			}
			break;
		case 2:
			if(((day == 28) && (year % 4 != 0)) || (((day == 29) && (year % 4 == 0)))){
				newDay = 1;
				newMonth += 1;	
			} else {
				newDay += 1;
			}
			break;
		
		case 4:;
		case 6:;
		case 9:;
		case 11:
			if (day == 30) {
				newDay = 1;
				newMonth += 1;
			} else {
				newDay += 1;
			}
		; break;
		
		default:
			System.out.println("Error!");
			break;
		}
		
		System.out.printf("Next date is %d.%d.%d",newDay,newMonth,newYear);
	}

}
