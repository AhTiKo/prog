
public class Test {

	public static void main(String[] args) {
		DynamicList numbers = new DynamicList();
		numbers.add(5);
		numbers.add(2);
		numbers.add(7);
		numbers.add(13);
		numbers.add(1);
		numbers.add(16);
		numbers.add(2);
		numbers.add(6);
		for (int i = 0; i < numbers.size(); i ++){
			System.out.println(numbers.get(i));
		}
		numbers.sortInt();
		System.out.println("After sort: ");
		for (int i = 0; i < numbers.size(); i ++){
			System.out.println(numbers.get(i));
		}

	}

}
