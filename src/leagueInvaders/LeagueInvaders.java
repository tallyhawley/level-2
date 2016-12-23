package leagueInvaders;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel game;
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		LeagueInvaders li = new LeagueInvaders();
	}
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	Dimension dim = new Dimension(WIDTH,HEIGHT);
	
	public LeagueInvaders(){
		frame = new JFrame("League Invaders");
		game = new GamePanel();
		frame.addKeyListener(game);
		setup();
	}
	
	public void setup(){
		game.setPreferredSize(dim);
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.startGame();
	}
}
