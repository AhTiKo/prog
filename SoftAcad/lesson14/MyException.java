package lesson14;

public class MyException extends Exception{
	public MyException(String exMessege) {
		super(exMessege);
		System.out.println(getMessage());
	}
}
