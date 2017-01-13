package leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

	
	public Alien(int x,int y, int width, int height){
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void update(){
		super.update();
		y+=1;
	}
	
	public void draw(Graphics g){
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

}
