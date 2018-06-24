package snake;

import java.awt.Canvas;
import java.awt.Point;
import java.util.ArrayList;

public class Snake implements ITimerDependent {

	Direction direction;
	int length = 5;
	int cyclesWait = 3;
	int[][] state;

	// LinkedList<Point> q = new LinkedList<Point>();

	ArrayList<Point> q = new ArrayList<Point>();

	public Snake(int maxX, int maxY) {
		this.state = new int[maxX][maxY];
		this.direction = Direction.Up;

		for (int y = maxY; y >= maxY - 5; y--) {
			this.q.add(new Point(maxX / 2, y));
		}
		
		String qStr = this.GetQueueString();
		System.out.println("Queue: " + qStr);

	}

	@Override
	public void OnTimer() {
		this.Move();
	}

	void Move() {
		Point head = q.get(q.size() - 1);

		// Point head = q.getLast();
		Point newP = new Point(head.x, head.y);

		switch (this.direction) {
		case Left:
			newP.x--;
			break;

		case Right:
			newP.x++;
			break;

		case Up:
			newP.y--;
			break;

		case Down:
			newP.y++;
			break;
		}

		String queueStr = this.GetQueueString();
		System.out.println("Queue: " + queueStr);

		// this.q.add(newP);
		this.q.add(newP);
		// this.q.remove();
		this.q.remove(0);

		queueStr = this.GetQueueString();
		System.out.println("Queue: " + queueStr);
	}

	String GetQueueString() {
		String queueStr = "";
		for (int i = 0; i < this.q.size(); i++) {
			Point p = this.q.get(i);
			queueStr = queueStr + p + "; ";
		}
		return queueStr;
	}

	@Override
	public void Draw(Canvas canvas) {
		Point newHead = this.q.get(this.q.size() - 1);// getLast();
		Point newTail = this.q.get(0);
		// System.out.println("Head: "+newHead+"; newTail: "+newTail);

		canvas.DrawSnake(newHead.x, newHead.y, false);
		canvas.DrawSnake(newTail.x, newTail.y, true);

	}
}
