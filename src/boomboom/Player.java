package boomboom;

import java.util.ArrayList;

public class Player {
	int x;
	int y;
	int health;
	String name;
	int remainingMoves;

	// TODO change to action class
	ArrayList<Action> availableActions = new ArrayList<Action>();

	public Player(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
	}

	public void setPlayerName(String name) {
		this.name = name;
	}

}
