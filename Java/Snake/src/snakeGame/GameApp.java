package snakeGame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class GameApp extends Applet{
	
	private Game game;
	InputHandler iHendler;
	
	public void init(){
		game = new Game();
		game.setBackground(Color.lightGray);
		game.setPreferredSize(new Dimension(600, 625));
		game.setVisible(true);
		game.setFocusable(true);
		this.add(game);
		this.setVisible(true);
		iHendler = new InputHandler(game);
	}
	
	public void paint (Graphics g){
		this.setSize(new Dimension(800, 650));
	}

}
