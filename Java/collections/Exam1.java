package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int n = input.nextInt();
		//int[] array = new int[n];
		String inputLine = input.nextLine();
		String[] array = inputLine.split("[^0-9]+");
		//System.out.println(Arrays.toString(array));
		String ab,cd;
		boolean find = false;
		for(int a = 0; a < array.length; a++){
			for(int b = 0; b < array.length; b++){
				for(int c = 0; c < array.length; c++){
					for(int d = 0; d < array.length; d++){
						if ((a != b) & (a != c) & (a != d) & (b != c) & (b != d) & (c != d)){
							if ((array[a] + array[b]).equals((array[c] + array[d]))){
								System.out.printf("%s|%s == %s|%s %n", array[a],array[b],array[c],array[d]);
								find = true;
							}
						}
					}
				}
			}
		}
		
		if (find != true){
			System.out.println("No");
		}
	}

}
