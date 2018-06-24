package snake;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("HelloWorld3");
		shell.setSize(900, 700);
		shell.open();

		Canvas canvas = new Canvas();
		canvas.Initialize(shell);

		display.timerExec(1000, new Runnable() {
			public void run() {
				canvas.OnTimer();
				display.timerExec(1000, this);
			};
		});

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

		display.dispose();
	}
}