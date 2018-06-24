package javaSyntax;

import java.util.Scanner;

public class Problem3 {
	public static String calcInBin(int num){
		String result ="";
		while (num != 0){
			result = (num%2) + result;
			num/=2;
		}
		return result;
	}
	
	public static String calcInHex(int num){
		String result = "" ;
		char temp =' ';
		while (num != 0){
			switch (num%16){
			case (0):temp = '0'; break;
			case (1):temp = '1'; break;
			case (2):temp = '2'; break;
			case (3):temp = '3'; break;
			case (4):temp = '4'; break;
			case (5):temp = '5'; break;
			case (6):temp = '6'; break;
			case (7):temp = '7'; break;
			case (8):temp = '8'; break;
			case (9):temp = '9'; break;
			case (10):temp = 'A'; break;
			case (11):temp = 'B'; break;
			case (12):temp = 'C'; break;
			case (13):temp = 'D'; break;
			case (14):temp = 'E'; break;
			case (15):temp = 'F'; break;
			default: ;break;
			}
			
			result = temp + result;
			num/=16;
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		
		System.out.printf("|%s       |",calcInHex(num));
		System.out.printf("%010d|",Integer.parseInt(calcInBin(num)));
		
	}

}
