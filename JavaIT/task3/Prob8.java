package task3;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter tank's volume : ");
		int vol = scan.nextInt();
		
		int both = vol / 5;
		int residue = vol % 5;
		int bucket3 = residue / 3;
		int bucket2 = residue / 2;
		if (both > 0) {
			System.out.print(both + " пъти и двете кофи");
		}
		if ( residue > 0 ) {
			if (both > 0 && residue > 1) {
				System.out.print(" и");
			}
			
			if ( bucket3 > 0) {
				System.out.print(" " + bucket3 + " кофа от 3 литра");
				
			} else {
				if (bucket2 > 0) {
					System.out.print(" "+ bucket2 + " кофа от 2 литра");
				}
			}
			if ((residue == 1) || (residue == 4)) {
				System.out.print(" и остава един литър ");
			}
		}
		
	}
	

}
