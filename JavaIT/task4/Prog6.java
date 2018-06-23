package task4;

import java.time.Period;
import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Дата на раждане на Иван");
		System.out.println("Въведете ден: ");
		int dayIvan = scan.nextInt();
		System.out.println("Въведете месец: ");
		int monthIvan = scan.nextInt();
		System.out.println("Въведете година: ");
		int yearIvan = scan.nextInt();
		System.out.println("Дата на раждане на Петър");
		System.out.println("Въведете ден: ");
		int dayPetar = scan.nextInt();
		System.out.println("Въведете месец: ");
		int monthPetar = scan.nextInt();
		System.out.println("Въведете година: ");
		int yearPetar = scan.nextInt();
		int years = 0;
		int months = 0;
		int days = 0;
		
		if (howIsOlder(dayIvan, monthIvan, yearIvan, dayPetar, monthPetar, yearPetar) == 1) {
			days = calcDaysInMonths(monthPetar, yearPetar, monthIvan, yearIvan) + dayPetar - dayIvan;
			System.out.printf("Петър е по-голям с %d дни", days);
		} else {
			if (howIsOlder(dayIvan, monthIvan, yearIvan, dayPetar, monthPetar, yearPetar) == 2) {
				days = calcDaysInMonths(monthIvan, yearIvan, monthPetar, yearPetar) + dayIvan - dayPetar;
				System.out.printf("Петър е по-голям с %d дни", days);
				
			} else {
				System.out.println("Двамата са родени в един и същи ден!");
			}
		}
		
		
	}
	static byte howIsOlder (int day1, int month1, int year1, int day2, int month2, int year2) {
		if ((year1 > year2) || ((year1 == year2) && (month1 > month2)) || ((year1 == year2) && (month1 == year2) && ( day1 > day2))) {
			return 1;
		} else {
			if ((year2 > year1) || ((year2 == year1) && (month2 > month1)) || ((year2 == year1) && (month2 == year1) && ( day2 > day1))) {
				return 2;
			} else {
				return 0;
			}
		
		}
	}
	
	static int calcDaysInMonths (int monthStart,int yearStart, int monthEnd, int yearEnd) {
		int years = yearEnd - yearStart;
		int months = monthEnd - monthStart ;
		int days = 0;
		if (months < 0) {
			months += 12;
		}
		
		months += (years * 12);
		int year = 0;
		for(int i = monthStart ; i <= (monthStart + months); i++) {
			year = yearStart + (i / 12);
			switch (i % 12) {
			case 1:;
			case 3:;
			case 5:;
			case 7:;
			case 8:;
			case 10:;
			case 12: days += 31; break;
			case 4:;
			case 6:;
			case 9:;
			case 11: days += 30; break;
			case 2:
				if(year % 4 == 0){
					days += 29;
				} else {
					days += 28;
				}
				break;
			default:
				break;
			}
		}
		
		return days;
	}
	

	
	

}
