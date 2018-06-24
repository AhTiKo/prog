package streamAPI;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exarcise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] elements = input.nextLine().split(" ");
		
		ArrayList<Integer> numbers = Arrays.stream(elements)
				.filter(StreamAPI::isNumber)
				.map(Integer::parseInt)
				.collect(Collectors.toList());

	}

}
