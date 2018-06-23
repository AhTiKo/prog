package lesson01;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		int c = a;
		System.out.println(c);
		int sum = a + b;
		int prod = a* b;
		System.out.println("a + b = " + sum);
		System.out.println("a * b = " + prod);
		
		sum = sum + 10;
		System.out.println("sum is: " + sum);
		prod = prod * 5;
		System.out.println("prod is: " + prod);
		sum += 10;
		prod *= 5;
		System.out.println("sum is: " + sum);
		System.out.println("prod is: " + prod);
	}

}
