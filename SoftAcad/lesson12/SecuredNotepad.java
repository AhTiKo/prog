package lesson12;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad{
	
	private String password;

	public SecuredNotepad(int numOfPages, String password) {
		super(numOfPages);
		if (iSecurePassword(password)) {
			this.password = password;
		} else {
			throw new IllegalArgumentException("The password is not secure enough!");
		}
		
	}

	@Override
	public void addTextOnPage(String text, int page) {
		if (validatePassword()) {
			super.addTextOnPage(text, page);
		}
	}

	@Override
	public void changeTextOnPage(String text, int page) {
		if (validatePassword()) {
			super.changeTextOnPage(text, page);
		}
	}

	@Override
	public void deleteTextFromPage(int page) {
		if (validatePassword()) {
			super.deleteTextFromPage(page);
		}
	}

	@Override
	public void previewPages() {
		if (validatePassword()) {
			super.previewPages();
		}
	}
	

	public boolean validatePassword() {
		System.out.println("Please enter your password: ");
		Scanner scan = new Scanner(System.in);
		String inputPassword = scan.next();
		if (inputPassword.equals(password)){
			return true;
		} else {
			System.out.println("Invalid password!");
			return false;
		}
	}
	
	public boolean iSecurePassword(String password) {
		String pattern ="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{5,}";
		return password.matches(pattern);
	}
}
