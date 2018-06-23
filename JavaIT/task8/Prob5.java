package task8;

public class Prob5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,15,6,7,8,9,5};
		System.out.println(findMaxElement(arr,0));
	}

	static int findMaxElement(int[] arr, int index) {
		if (index == arr.length - 1){
			return index;
		}
		int currentMaxElement = findMaxElement(arr, index +1);
		
		if(arr[index] > arr[currentMaxElement]) {
			return index;
		} else {
			return currentMaxElement; 
		}
	}

}
