package lesson12;

public class Demo {

	public static void main(String[] args) {
		
		// Page p1 = new Page();
		// p1.setTitle("Page 1 title");
		// p1.addText("Added text");
		// System.out.println(p1.pagePreview());
		// Page p2 = new Page();
		// p2.addText("Second page text");
		// p2.setTitle("Second page title");
		// Page p3 = new Page();
		// p3.addText("Third page text");
		// p3.setTitle("Third page title");
		//
		// SimpleNotepad simNotepad = new SimpleNotepad(3);
		// simNotepad.addTextOnPage("Page 1 text", 0);
		// simNotepad.addTextOnPage("Page 2 text", 1);
		// simNotepad.addTextOnPage("Page 3 text", 2);
		//
		// simNotepad.previewPages();
		//
		// simNotepad.changeTextOnPage("page 2 text changed",1);
		// System.out.println("================================");
		// simNotepad.previewPages();
		//
		// simNotepad.changeTextOnPage("page 2 text changeddddddddd",4);
		// System.out.println("================================");
		// simNotepad.previewPages();

//		SecuredNotepad secNotepad = new SecuredNotepad(3, "penka");
//		secNotepad.addTextOnPage("Page 1 text", 0);
//
//		secNotepad.previewPages();
//
//		secNotepad.changeTextOnPage("Na penka tigricata stranicata", 0);
//		secNotepad.previewPages();
		
		try {
			ElectronicSecuredNotepad elSecNotepad = new ElectronicSecuredNotepad(3, "ws3eeW");
			elSecNotepad.star();
			elSecNotepad.addTextOnPage("Page 1 text", 0);
			elSecNotepad.previewPages();
			elSecNotepad.changeTextOnPage("Na penka tigricata stranicata", 0);
			elSecNotepad.changeTextOnPage("Na penka2 tigricata stranicata", 1);
			elSecNotepad.changeTextOnPage("Na prokopi sranicata", 2);
			elSecNotepad.previewPages();
			System.out.println(elSecNotepad.searchWord("prokopi"));
			elSecNotepad.printAllPagesWithDigits();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
