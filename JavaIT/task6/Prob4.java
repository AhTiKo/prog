package task6;

public class Prob4 {

	public static void main(String[] args) {
		boolean[][] arr = {{false,false,false,false},{false,true,false,false},{false,false,false,false},{false,true,false,false}};
		boolean isFind = false;
		for (int i = 0; i < arr.length; i++) {
			if(isFind) {
				break;
			}
			for (int j = 0; j < arr.length; j++) {
				if(j < (arr.length - 1 - i)) {
					if (arr[i][j] == true) {
						isFind = true;
						break;
					}
					
				} else {
					break;
				}
			}
		}
		
		System.out.println(isFind);
	}

}
