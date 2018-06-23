package hwk03;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число: ");
		int n = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum +=i;
		}
		
		System.out.println(sum);
	}

}
