package javaSyntax;

import java.util.Scanner;

public class Problem6 {
	
	public static int sevenToDec(int num){
		int result = 0;
		int i = 0;
		while (num != 0){
			result += (num%10)*Math.pow(7, i);
			num /=10;
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base-7 number: ");
		int num = input.nextInt();
		input.close();
		System.out.printf("Dec = %d",sevenToDec(num));

	}

}
