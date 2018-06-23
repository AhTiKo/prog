package hwk02;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете А: ");
		float a = scan.nextFloat();
		System.out.println("Въведете B: ");
		float b = scan.nextFloat();
		System.out.println("Въведете C: ");
		float c = scan.nextFloat();
		
		if (((a < c) && (c < b)) || ((a > c) && (c > b))) {
			System.out.println("Числото " + c + " е между " + a + " и " + b);
		} else {
			System.out.println("Числото " + c + " не е между " + a + " и " + b);
		}
	}

}
