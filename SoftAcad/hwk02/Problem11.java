package hwk02;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете n: ");
		int n = scan.nextInt();
		int i = 3;
		while (n > 0) {
			if (i % 3 == 0) {
				if (n > 1) {
					System.out.print(i + ", ");
				} else {
					System.out.println(i);
				}
				
				n --;
			}
			i ++;
			
		}
	
	}

}
