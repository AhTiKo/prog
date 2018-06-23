package hwk02;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("a: ");
		float a = scan.nextFloat();
		System.out.println("b: ");
		float b = scan.nextFloat();
		System.out.println("c: ");
		float c = scan.nextFloat();
		
		if ((a >= b) && (a >= c)) {
			System.out.println(a);
			if (b >= c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else {
			if ((b >= a) && (b >= c)) {
				System.out.println(b);
				if (a >= c) {
					System.out.println(a);
					System.out.println(c);
				} else {
					System.out.println(c);
					System.out.println(a);
				}
				
			} else {
				System.out.println(c);
				if (a >= b) {
					System.out.println(a);
					System.out.println(b);
				} else {
					System.out.println(b);
					System.out.println(a);
				}
			}
		}
	}

}
