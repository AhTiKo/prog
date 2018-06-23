package lesson02;

import java.util.Scanner;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		int i = 1;
//		}
//		while (i <= n ) {
//			int x = i;
//			int j = 1;
//			while (j <= n) {
//				System.out.printf("%3d", x);
//				x += i;
//				j ++;
//			}
//			System.out.println();
//			i ++;
//		}
		while (i <= n) {
			int j = 1;
			while (j <= n){
				System.out.printf("%3d", i * j);
				j ++;
			}
			System.out.println();
			i ++;
		}
			
		
		
	}

}
