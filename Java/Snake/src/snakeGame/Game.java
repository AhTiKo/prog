package snakeGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Game extends Canvas implements Runnable{
	public static final int ROWS = 30;
	public static final int COLS = 30;
	public static final int SIZE = 20;
	public static final int WIDTH = COLS*SIZE;
	public static final int HEIGHT = ROWS*SIZE;
	
	public static Snake snake;
	public static Apple apple;
	public static int score;
	public static int threadSpeed;
	
	
	
	private Thread runThread;
	private Graphics globalGraphics;
	
	//public static SpriteSheet sh;
	
	public static boolean gameRunning = false;
	
	public void paint(Graphics g){
		globalGraphics = g.create();
		
		
		
		if (runThread == null){
			runThread = new Thread(this);
			runThread.start();
			gameRunning = true;
		}
	}
	
	public Game(){
		snake = new Snake();
		apple = new Apple();
	//	sh = new SpriteSheet(ImageLoader.loadImage("snake-graphics.png"));
		score = 0 ;
		threadSpeed = 150;
	}
	

	@Override
	public void run() {
		
		while(gameRunning){
			snake.tick();
			render(globalGraphics);
			try {
				Thread.sleep(threadSpeed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void changeSpeed(){
		if (Game.score % 50 == 0){
			Game.threadSpeed -= 10;
		}
	}
	
	public void render(Graphics g){
		g.clearRect(0, 0, WIDTH, HEIGHT);
		snake.drawSnake(globalGraphics);
		apple.drawApple(globalGraphics);
		drawScore(g);
	}
	public void drawScore(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(0, Game.HEIGHT, Game.WIDTH, 25);
		g.setColor(Color.white);
		g.drawString("Score : " + score , 10, Game.WIDTH + 15);
	}

}
