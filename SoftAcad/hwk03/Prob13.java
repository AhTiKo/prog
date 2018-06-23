package hwk03;

import java.util.Scanner;

public class Prob13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число: ");
		int n = scan.nextInt();
		int k = n - 1;
		for (int i = 1; i <= n; i++) {	
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3d", k );
			}
			System.out.println();
			k += 2;
		}
	}

}
