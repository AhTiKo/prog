package hwk02;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число: ");
		int n = scan.nextInt();
		int sum = 0;
		if (n > 1) {
			while (n >= 1) {
				sum += n;
				n --;
			}
		} else {
			while (n <= 1) {
				sum += n;
				n ++;
			}
		}
		
		System.out.println("Резултата е " + sum);
	}

}
