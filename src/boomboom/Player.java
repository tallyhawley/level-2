package boomboom;

public class Player {
	int x;
	int y;
	int health;
	String name;

	// TODO change to action class
	Action[] availableActions;

	public Player(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
	}

	public void setPlayerName(String name) {
		this.name = name;
	}

}
