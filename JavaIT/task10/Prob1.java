package task10;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ans = binarySearch(0, 100);
		if (ans != -1) {
			System.out.println("answer is " + ans);
		} else {
			System.out.println("number not found ");
		}
	}
	
	static int binarySearch (int a, int b) {
		Scanner scan = new Scanner(System.in);
		int mid = (a + b)/2;
		if (a > b) {
			return -1;
		}
		System.out.println(mid + " ?" );
		int ans = scan.nextInt();
		
		if (ans == 1) {
			return mid;
		} else {
			if (ans == 0) {
				return binarySearch(a, mid - 1);
			} else {
				if (ans == 2) {
					return binarySearch(mid + 1, b);
				}
			}
			return -1;
		}
	}

}
