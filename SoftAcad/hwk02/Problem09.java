package hwk02;

import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете първото число: ");
		int a = scan.nextInt();
		System.out.println("Въведете второто число: ");
		int b = scan.nextInt();
		
		if (a > b) {
			while (b <= a) {
				System.out.print(b + " ");
				b ++;
			}
			
		} else {
			while (a <= b) {
				System.out.print(a + " ");
				a ++;
			}
		}
	}

}
