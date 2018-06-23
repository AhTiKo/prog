package chapter6;

public class Problem4 {

	public static void main(String[] args) {
		char[] arr = { 'W', 'S', 'R', 'E', 'W', 'T', 'a', 'r', 'T', 'Q', 'j', 'N', 'S', 'd', '2'};
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] >= 'a') && (arr[i] <= 'z')) {
//				System.out.print(arr[i] + "  ");
				System.out.print("има!");
				break;
			}
		}

	}

}
