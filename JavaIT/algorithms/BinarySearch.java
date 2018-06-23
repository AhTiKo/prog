package algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {8, 12, 28, 39, 52, 70, 71, 95, 110, 129, 156, 161, 218, 243, 270, 287, 299, 310, 328, 346, 390, 415, 421, 426, 429, 432, 441, 442, 445, 447, 460, 466, 480, 485, 526, 568, 598, 670, 726, 747, 795, 801, 806, 836, 869, 874, 881, 887, 899, 946};
		int x = 218;
		int index = binarySearch(arr,x,0,arr.length-1);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] arr, int x, int start, int end) {
		int mid = (end + start)/2;
		if (start > end) {
			return -1;
		}
		if (x == arr[mid]) {
			return mid;
		}
		if (x < arr[mid]) {
			return binarySearch(arr, x, start, mid - 1);
		}
		if (x > arr[mid]) {
			return binarySearch(arr, x, mid + 1, end);
		}
		return -1;
	}

}
