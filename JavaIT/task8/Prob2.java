package task8;

public class Prob2 {

	public static void main(String[] args) {
		int[] arr = { 6,2,3,4,3,2,5,6,7,1,2,3,5,9};
		
		System.out.println(findMinElem(arr, 0));

	}
	
	static int findMinElem (int[] arr, int index) {
		
		if (index == arr.length -1) {
			return arr[arr.length - 1];
		}
		int currentMin = findMinElem(arr, index + 1 );
		
		if(arr[index] < currentMin) {
			return arr[index];
		} else {
			return currentMin;
		}
	}

}
