package entities;

import game.Game;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Collections;
import java.util.LinkedList;

public class Snake {

	public static LinkedList<Box> body;
	public static Box head;
	private int velX , velY;
	private static final int COLS = Game.width / Box.BOX_SIZE;
	private static final int ROWS = Game.height / Box.BOX_SIZE;
	
	
	
	
	public Snake(){
		body = new LinkedList<>();
		Collections.addAll(body,
				new Box(1, 2),
				new Box(2, 2),
				new Box(3, 2),
				new Box(4, 2)
				);
		head = body.peekLast();
		velX = 0;
		velY = 0;
	}
	
	public void render(Graphics g){
		for (Box box : body) {
			if (box == body.getLast()){
				g.drawImage(Game.sh.crop(128, 0, 32, 32), box.x*Box.BOX_SIZE, box.y*Box.BOX_SIZE ,null);
			}else if (box == body.getFirst()){
				g.drawImage(Game.sh.crop(128, 64, 32, 32), box.x*Box.BOX_SIZE, box.y*Box.BOX_SIZE ,null);
			}else{ 
				g.drawImage(Game.sh.crop(32, 0, 32, 32), box.x*Box.BOX_SIZE, box.y*Box.BOX_SIZE ,null);
			}	
				
	//		g.setColor(Color.green);
	//		g.fillRect(box.x*Box.BOX_SIZE, box.y*Box.BOX_SIZE
	//					,Box.BOX_SIZE, Box.BOX_SIZE);
	//		g.setColor(Color.black);
	//		g.drawRect(box.x*Box.BOX_SIZE, box.y*Box.BOX_SIZE
	//				,Box.BOX_SIZE, Box.BOX_SIZE);
			
		}
	}
	
	public void tick(){
		head = body.getLast();
		Box nextPos = new Box(head.x + velX,head.y + velY);
	
		
		boolean outOfBounds = 
				nextPos.x >= COLS || nextPos.x < 0 ||
				nextPos.y >= ROWS || nextPos.y < 0;
		
		if (nextPos.equals(Game.apple.getAppleBox())){
	//		Game.score += 10;
			body.add(Game.apple.getAppleBox());
	//		Game.apple = new Apple();
	//		Game.changeSpeed(); 
		}else if (body.contains(nextPos) || outOfBounds){
			Game.isRunning = false;
		}
		
		for (int i = 0; i < body.size()-1; i++) {
			body.set(i, body.get(i+1));
		}
		body.set(body.size()-1, nextPos);
		
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}
}

