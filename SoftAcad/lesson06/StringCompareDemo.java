package lesson06;

public class StringCompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Ivan";
		String secondName = "Petrov";
		
		String name = firstName + " " + secondName;
		
		String name1 = "Ivan Petrov";
		String name2 = new String("Ivan Petrov");
		String name3 = "Ivan Petrov";
	
		System.out.println( name == "Ivan Petrov");
		System.out.println(name.equals("Ivan Petrov"));
		
		System.out.println(name == name1);
		System.out.println(name.equals(name1));
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		System.out.println(name1 == name3);
		
	}

}
