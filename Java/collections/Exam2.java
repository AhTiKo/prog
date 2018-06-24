package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Exam2 {
	
	public static int calcResult(String[]arr){
		int result = 0;
		int count = 1;
		int card = 0;
		
		for (int i = 0; i < arr.length; i++) {
			switch(arr[i]){
			case "2" : card = 2;break;
			case "3" : card = 3;break;
			case "4" : card = 4;break;
			case "5" : card = 5;break;
			case "6" : card = 6;break;
			case "7" : card = 7;break;
			case "8" : card = 8;break;
			case "9" : card = 9;break;
			case "10" : card = 10;break;
			case "J" : card = 12;break;
			case "Q" : card = 13;break;
			case "K" : card = 14;break;
			case "A" : card = 15;break;
			}
			if ((i > 0)&(i < arr.length-1)){
				if ((arr[i].equals(arr[i-1])) || (arr[i].equals(arr[i+1]))){
					card = 2*card;
				}
			}else{
				if (i == 0){
					if (arr[i].equals(arr[i+1])){
						card = 2*card;
					}
				}else{
					if (arr[i].equals(arr[i-1])){
						card = 2*card;
					}
				}
			}
			result += card;
		}
		
		return result;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		String[] cards = inputLine.split("[SHDC*\\s]+");
		
		System.out.println(calcResult(cards));
	}

}
