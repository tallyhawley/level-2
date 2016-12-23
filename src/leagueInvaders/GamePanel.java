package leagueInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Rocketship rs = new Rocketship(250,700,50,50);
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
			updateEndState();
		}
	}
	
	public GamePanel(){
		timer = new Timer(1000/60, this);
		titleFont = new Font("Arial",Font.PLAIN,48);
	}
	
	public void startGame(){
		timer.start();
	}
	
	public void paintComponent(Graphics g){
		if(currentState == MENU_STATE){
			drawMenuState(g);
		}else if(currentState == GAME_STATE){
			drawGameState(g);
		}else if(currentState == END_STATE){
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			if(currentState<2){
				currentState++;
			}
			else{
				currentState=0;
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_W){
			rs.moveUp=true;
		}
		else if(e.getKeyCode()==KeyEvent.VK_A){
			rs.moveLeft=true;
		}
		else if(e.getKeyCode()==KeyEvent.VK_S){
			rs.moveDown=true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_W){
			rs.moveUp=false;
		}
		else if(e.getKeyCode()==KeyEvent.VK_A){
			rs.moveLeft=false;
		}
	}
	
	private void updateMenuState(){
		
	}
	private void updateGameState(){
		rs.update();
	}
	private void updateEndState(){
		
	}
	private void drawMenuState(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("LEAGUE INVADERS", 25, 400);
	}
	private void drawGameState(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		rs.draw(g);
	}
	private void drawEndState(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 110, 400);
	}
}
