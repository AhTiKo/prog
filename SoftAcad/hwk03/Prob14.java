package hwk03;

import java.util.Scanner;

public class Prob14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете първото число: ");
		int a = scan.nextInt();
		System.out.println("Въведете второто число: ");
		int b = scan.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (sum < 200) {
				if(i % 3 == 0) {
					System.out.print("skip "+ i + ", ");
				} else {
					int x = i * i;
					System.out.print(x + ", ");
					sum += x;
				}
			}
			
		}
	}

}
