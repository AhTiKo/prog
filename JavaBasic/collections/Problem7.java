package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputL1 = input.nextLine();
		String inputL2 = input.nextLine();
		
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		ArrayList<Character> union = new ArrayList<Character>();
		
		for (char c: inputL1.toCharArray()){
			if (c != ' '){ 
				list1.add(c);
			}
		}
		for (char c: inputL2.toCharArray()){
			if ( c != ' '){
			list2.add(c);
			}
		}
		union.addAll(list1);
		
		for (Character c: list2){
			if(!list1.contains(c)){
				union.add(c);
			}
		
		}
		
		for (Character c : union){
			System.out.print(c + " ");
		}
		
		
	}

}
