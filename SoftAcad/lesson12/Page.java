package lesson12;



public class Page {

	private String title;
	private String text;

	public Page() {
		this.title = "";
		this.text = "";
	}

	public void addText(String text) {
		this.text += text;
	}

	public void deleteText() {
		this.text = "";
	}

	public String pagePreview() {
		return this.title + "\n" + this.text;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean searchWord(String word) {
		if (this.text.indexOf(word) != -1) {
			return true;
		}
		return false;
	}

	public boolean containsDigits() {
		for (int i = 0; i < this.text.length(); i++) {
			if (Character.isDigit(this.text.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
