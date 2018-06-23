package task2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter dex number : ");
		int num = scan.nextInt();
		System.out.println(DexInBin(num));
		
	}
	
	public static String DexInBin(int num) {
		String binRevNum = "";
		while(num >= 1) {
			int n = num % 2;
			binRevNum += n;
			num /= 2;
		}
		String binNum = "";
		for (int i = 0; i < binRevNum.length(); i++) {
			binNum += binRevNum.charAt(binRevNum.length()-1 - i); 
		}
		
		return binNum;
	}

}
