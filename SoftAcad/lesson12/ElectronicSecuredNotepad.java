package lesson12;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	
	private boolean isStart;

	public ElectronicSecuredNotepad(int numOfPages, String password) {
		super(numOfPages, password);
		this.isStart = false;
		System.out.println(" Electronic Secured Notepad is not stated!");
	}

	@Override
	public void star() {
		System.out.println("Electronic Secured Notepad is starting!");
		isStart = true;
	}

	@Override
	public void stop() {
		System.out.println("Electronic Secured Notepad is stopping !");
		isStart = false;
		
	}

	@Override
	public boolean isStarted() {
		return isStart;
	}
	


	@Override
	public void addTextOnPage(String text, int page) {
		if (isStarted()) {
			super.addTextOnPage(text, page);
		}
	}

	@Override
	public void changeTextOnPage(String text, int page) {
		if (isStarted()) {
			super.changeTextOnPage(text, page);
		}
	}

	@Override
	public void deleteTextFromPage(int page) {
		if (isStarted()) {
			super.deleteTextFromPage(page);
		}
	}

	@Override
	public void previewPages() {
		if (isStarted()) {
			super.previewPages();
		}
	}
	

}
