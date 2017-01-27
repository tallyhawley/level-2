package boomboom;

public class Player {
	int x;
	int y;
	int health;
	String name;
	
	public Player(int x, int y, int health){
		this.x = x;
		this.y = y;
		this.health = health;
	}
	
	public void setPlayerName(String name){
		this.name = name;
	}
}
