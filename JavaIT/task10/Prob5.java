package task10;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter :");
		String input = scan.nextLine();
		
		int arr[] = new int[2];
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0') {
				arr[0] ++;
			} else {
				if (input.charAt(i) == '1') {
					arr[1] ++;
				} else {
					System.out.println("Input Error!");
				}
			}		
		}
		
		for (int i = 0; i < arr[0]; i++) {
			System.out.print("0");
				
			
		}
		for(int i = 0; i < arr[1]; i ++) {
			System.out.print("1");
		}
	}

}
