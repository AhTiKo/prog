package lesson12;

public interface INotepad {
	
	public void addTextOnPage(String text, int page);

	public void changeTextOnPage(String text, int page);

	public void deleteTextFromPage(int page);

	public void previewPages();
	
	public boolean searchWord(String word);
	
	public void printAllPagesWithDigits() ;
}
