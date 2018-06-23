package hwk02;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете A: ");
		int a = scan.nextInt();
		System.out.println("Въведете B: ");
		int b = scan.nextInt();
		int sum = 0;
		while (a <= b) {
			if(sum < 200) {
				if (a % 3 != 0) {
					System.out.print(a * a + ", ");
					sum += a * a;
				} else {
					System.out.print("skip " + a + ", ");
				}
			}
			a ++;
		}
	}

}
