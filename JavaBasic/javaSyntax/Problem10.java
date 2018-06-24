package javaSyntax;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		for(int i = 1; i <= 20 ; i++){
			for(int j= 1 ; j <= 20; j++){
				if (i + j == num){
					System.out.printf("%d + %d = %d %n",i ,j ,num);
				}
			}
		}
		for(int i = 1; i <= 20 ; i++){
			for(int j= 1 ; j <= 20; j++){
				if (i - j == num){
					System.out.printf("%d - %d = %d %n",i ,j ,num);
				}
			}
		}

	}

}
