package game;

import display.Display;

public class Launcher {
	
	public static void main(String[] args){
		Game game = new Game("test", 960, 640);
		game.start();
	}

}
