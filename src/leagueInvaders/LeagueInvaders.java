package leagueInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	public static void main(String[] args){
		
	}
	int width = 500;
	int height = 800;
	
	public LeagueInvaders(){
		frame = new JFrame("League Invaders");
	}
	
	public void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
