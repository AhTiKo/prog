package hwk03;

import java.util.Scanner;

public class Prob11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i != n){
				System.out.print((i * 3) + ", ");
			} else {
				System.out.println((i * 3));
			}
			
		}
	}

}
