package boomboom;

import java.util.HashMap;
import java.util.Map;

public class Player {
	int x;
	int y;
	int health;
	String name;
	
	
	//TODO add actions!!!!!
	Map availableActions = new HashMap();
	
	public Player(int x, int y, int health){
		this.x = x;
		this.y = y;
		this.health = health;
	}
	
	public void setPlayerName(String name){
		this.name = name;
	}

}
