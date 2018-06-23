package task7;

public class Prob7 {

	public static void main(String[] args) {
		char[] arr = {'a','4','v','7','f','4','1','h'};
		System.out.println(countNumbers(arr));
	}
	
	static int countNumbers(char[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] > '/') && (arr[i] < ':')) {
				counter ++;
			}
		}
		return counter;
	}

}
