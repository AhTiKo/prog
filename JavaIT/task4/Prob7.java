package task4;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = scan.nextInt();
		int i = 1;
		int count = 1;
		while (count <= 10) {
			if ((i > n) && ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))) {
				System.out.print( count + ":" + i);
				count ++;
				if ((count > 1) && (count <= 10)) {
					System.out.print("; ");
				}
			
			}
			i ++;
		}

	}

}
