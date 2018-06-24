package entities;

import game.Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Apple {

	private Random randGenerator;
	private Box appleBox;
	private static final int COLS = Game.width / Box.BOX_SIZE;
	private static final int ROWS = Game.height / Box.BOX_SIZE;
	
	public Apple(){
		appleBox = createApple(Game.snake);
	}
	private Box createApple(Snake s){
		randGenerator = new Random();
		
		int x = randGenerator.nextInt(COLS);
		int y = randGenerator.nextInt(ROWS);
		
		Box b = new Box(x,y);
		if (s.body.contains(b)){
			return createApple(s);
		}
		
		return b;
	}
	
	public void render (Graphics g){
		int boxSize = Box.BOX_SIZE;
	//	g.setColor(Color.red);
	//	g.fillOval(appleBox.x * boxSize, appleBox.y * boxSize, boxSize, boxSize);
		g.drawImage(Game.sh.crop(0, 96, 32, 32), appleBox.x * boxSize, appleBox.y * boxSize,null);
		//g.drawImage(ImageLoader.loadImage("\\snake-graphics.png"),appleBox.x * boxSize, appleBox.y * boxSize, null );
	}
	
	public Box getAppleBox(){
		return appleBox;
	}
}

