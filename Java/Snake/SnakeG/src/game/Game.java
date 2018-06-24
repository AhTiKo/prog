package game;

import entities.Apple;
import entities.Snake;
import gfx.ImageLoader;
import gfx.SpriteSheet;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;


import display.Display;

public class Game implements Runnable{
	private String name;
	public static int width;
	public static int height;
	
	public static boolean isRunning;
	private Thread thread;
	
	private Display display;
	private BufferStrategy bs;
	private Graphics g;
	private InputHandler ih;
	
	public static SpriteSheet sh;
	public static Snake snake;
	public static Apple apple;
	
	public Game(String name, int width, int height){
		this.name = name;
		this.width = width;
		this.height = height;
		
	}
	
	public void init(){
		snake = new Snake();
		apple = new Apple();
		this.display = new Display(this.name, width, height);
		this.ih = new InputHandler(this.display);
		this.sh = new SpriteSheet(ImageLoader.loadImage("/snakeRes.png"));
		
	}

	public void tick(){
		snake.tick();
	}
	
	public void render(){
		this.bs = this.display.getCanvas().getBufferStrategy();
		if (bs == null){
			this.display.getCanvas().createBufferStrategy(2);
			this.bs = this.display.getCanvas().getBufferStrategy();
		}
		this.g = this.bs.getDrawGraphics();
		
		this.g.drawImage(ImageLoader.loadImage("/stone.jpg"), 0, 0, 960, 640, null);
	//	this.g.drawImage(sh.crop(0, 96, 32, 32), 300, 300,null);
		snake.render(g);
		apple.render(g);
		
		this.g.dispose();
		this.bs.show();
			
			
	}
	
	@Override
	public void run() {
		init();
		
		int fps = 30;
		double timePerTick = 1_000_000_000 / fps; 
		double delta = 0;
		long now;
		long lastTimeTicked = System.nanoTime();
		
		while(isRunning){
			now = System.nanoTime();
			delta += (now - lastTimeTicked) / timePerTick;
			lastTimeTicked = now;
			if (delta >= 1 ){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tick();
				render();
				delta --;
			}
		}
		this.stop();
	}
	
	public synchronized void start(){
		this.isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		try {
			this.isRunning = false;
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
