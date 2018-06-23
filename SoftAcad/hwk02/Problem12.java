package hwk02;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете n: ");
		int n = scan.nextInt();
		boolean isPrime = true;
		int i = 2;
		double limitDev = Math.sqrt(n);
		while (i <= limitDev) {
			if (n % i == 0) {
				isPrime = false;
			}
			i ++;
		}
		
		if(isPrime) {
			System.out.println("Числото е просто!");
		} else {
			System.out.println("Числото не е просто!");
		}
	}

}
