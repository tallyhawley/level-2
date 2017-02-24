package boomboom;

public class Player {
	int x;
	int y;
	int health;
	String name;
	int remainingMoves;
	boolean playing = true;
	
	AvailAct actions = new AvailAct();

	public Player(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
	}

	public void setPlayerName(String name) {
		this.name = name;
	}

}
