package task10;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of words: ");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter words: ");
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextLine();
		}
		for (int i = 0; i < n; i++) {
			char[] ch = arr[i].toCharArray();
			Arrays.sort(ch);
			String strCh = "";
			for (int j = 0; j < ch.length; j++) {
				if (! strCh.contains(Character.toString(ch[j]))) {
					strCh += Character.toString(ch[j]);
				}
			}
			arr[i] = strCh;
		}
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].equals(arr[j])){
					count ++;
				}
			}
		}
		
		System.out.println("Number of words with the same letters : " + count);
	}

}
