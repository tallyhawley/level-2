package leagueInvaders;

import java.awt.Graphics;

public class Rocketship extends GameObject{

	int speed;
	boolean moveUp;
	boolean moveDown;
	boolean moveRight;
	boolean moveLeft;
	
	
	public Rocketship(int x,int y,int width,int height){
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = 5;
	}
	
	public void update(){
		super.update();
		if(this.moveUp==true){
			this.y-=this.speed;
		}
		if(this.moveDown==true){
			this.y+=this.speed;
		}
		if(this.moveLeft==true){
			this.x-=this.speed;
		}
		if(this.moveRight==true){
			this.x+=this.speed;
		}
	}
	
	public void draw(Graphics g){
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
	}
	
}
