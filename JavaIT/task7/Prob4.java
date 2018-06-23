package task7;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month : ");
		String month = scan.nextLine();
		System.out.println("Enter year: ");
		int year = scan.nextInt();

		System.out.println("month have " + calcMonthDays(month, year));
	}
	
	static int calcMonthDays(String month, int year) {
		int days = 0;
		switch (month) {
		case "jan":
			days = 31;
			break;
		case "feb":
			days = 28;
			break;
		case "mar":
			days = 31;
			break;
		case "apr":
			days = 30;
			break;
		case "may":
			days = 31;
			break;
		case "jun":
			days = 30;
			break;
		case "jul":
			days = 31;
			break;
		case "aug":
			days = 31;
			break;
		case "sep":
			days = 30;
			break;
		case "oct":
			days = 31;
			break;
		case "nov":
			days = 30;
			break;
		case "dec":
			days = 31;
			break;

		default:
			break;
		}
		
		if ((year % 4 == 0) && (month.equals("feb"))) {
			days +=1;
		}
		return days;
	}

}
