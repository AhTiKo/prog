package snake;

import java.awt.Color;
import java.awt.Label;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Timer;

public class Canvas {

	Point plotSize = new Point(80, 50);
	Shell shell;
	Timer timer;
	Snake snake;
	Plot plot;
	
	ArrayList<ITimerDependent> TimerDependentObjects = new ArrayList<ITimerDependent>() ;
	
	
	Display display = Display.getCurrent();

	void Initialize(Shell shell) {
		this.shell = shell;
		this.plot = new Plot(plotSize.x, plotSize.y);
		this.snake = new Snake(plotSize.x, plotSize.y);

		this.TimerDependentObjects.add(this.snake);
		this.drawBorder();
	}

	void drawBorder() {		
		Color color = this.display.getSystemColor(SWT.COLOR_BLUE);
		
		for (int x = 0; x < this.plotSize.x; x++) {
				this.drawToShell(color, x, 0);
				this.drawToShell(color, x, this.plotSize.y-1);
		}
		
		for(int y = 1; y < this.plotSize.y-1; y++){
			this.drawToShell(color, 0, y);
			this.drawToShell(color, this.plotSize.x-1, y);
		}
		
		color.dispose();
	}
	
	void drawToShell(Color color, int x, int y)
	{
		Label label = new Label(shell, SWT.BORDER);		
		label.setBackground(color);
		label.setSize(10, 10);
		label.setLocation(x*10, y*10);
	}
	
	void DrawSnake(int x, int y, boolean clear)
	{
		Color color = this.display.getSystemColor(SWT.COLOR_RED);
		if (clear)
		{
			color = this.display.getSystemColor(SWT.COLOR_WHITE);
		}
		
		Label label = new Label(shell, SWT.BORDER);		
		label.setBackground(color);
		label.setSize(10, 10);
		label.setLocation(x*10, y*10);
		
	}
	
	

	void OnTimer() {
		for (ITimerDependent iTimerDependent : TimerDependentObjects) {
			
			iTimerDependent.OnTimer();			
			iTimerDependent.Draw(this);
		}
	}

}

