package chapter6;

public class Problem2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int[] arr2 = { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//		int[] arr2 = { 7, 8, 9, 0};
		
		
		if(arr1.length != arr2.length) {
			System.out.println("noEqual");
			
		} else {
			int index = 0;
			int len = arr1.length;
			for (index = 0; index < len; index++) {
				if (arr1[index] != arr2[len - 1 - index]) {
					break;
				}
			}
			if ( index == len){
				System.out.println("Equal");
			} else {
				System.out.println("noEqual");
			}
		}
	}

}
