package javaSyntax;

import java.util.Random;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two munbers: ");
		int n = input.nextInt();
		int m = input.nextInt();
		int rndnum;
		if ( n >= m ){
			rndnum = rnd.nextInt(n - m + 1) + m;
		}else {
			rndnum = rnd.nextInt(m - n + 1) + n;
		}
		
		System.out.print(rndnum);
	}

}
