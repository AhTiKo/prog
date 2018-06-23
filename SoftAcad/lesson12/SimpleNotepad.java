package lesson12;

public class SimpleNotepad implements INotepad {

	private Page[] pages;

	public SimpleNotepad(int pagesCount) {
		this.pages = new Page[pagesCount];
		for (int i = 0; i < pagesCount; i++) {
			pages[i] = new Page();
		}
	}

	@Override
	public void addTextOnPage(String text, int page) {
		if (checkPage(page) == true) {
			this.pages[page].addText(text);
		}
	}

	@Override
	public void changeTextOnPage(String text, int page) {
		if (checkPage(page) == true) {
			this.pages[page].deleteText();
			this.pages[page].addText(text);
		}
	}

	@Override
	public void deleteTextFromPage(int page) {
		// TODO Auto-generated method stub
		if (checkPage(page) == true) {
			this.pages[page].deleteText();
		}
	}

	public boolean checkPage(int page) {
		if (page < 0 || page > pages.length - 1) {
			System.out.println("Invalid page");
			return false;
		}
		return true;
	}

	@Override
	public void previewPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println(pages[i].pagePreview());
		}
	}

	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigits()) {
				System.out.println(pages[i].pagePreview());
			}
		}
	}

}
