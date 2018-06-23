package hwk02;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете n: ");
		int n = scan.nextInt();
		int i = n;
		int j = n;
		int k = n;
		while (i >= 1) {
			j = n;
			while (j >= 1){
				System.out.printf("%3d",k-1);
				j --;
			}
			
			System.out.println();
			k +=2;
			i --;
		}
	}

}
