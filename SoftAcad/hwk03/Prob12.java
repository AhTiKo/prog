package hwk03;

import java.util.Scanner;

public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �����: ");
		int n = scan.nextInt();
		boolean isPrime = true;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("������� � ������");
		} else {
			System.out.println("������� �� � ������");
		}
	}

}
