package task9;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = scan.nextInt();
		
		for (int i = 1 ; i <= num; i++) {		
			for(int k = num - i; k >= 0; k --){
				System.out.print(" ");
			}
			if (i > 1) {
				System.out.print(i);
				for (int j = 1; j <= (2*i) - 3; j++) {
					System.out.print("*");
				}
				System.out.print(i);
			} else {
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		for (int i = num - 1; i >= 1; i--) {
			for(int k = 0; k <= num - i; k ++){
				System.out.print(" ");
			}
			if (i > 1) {
				System.out.print(i);
				for (int j =  (2*i) - 3; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.print(i);
			} else {		
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
