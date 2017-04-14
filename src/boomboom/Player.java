package boomboom;

public class Player {
	int x;
	int y;
	int health;
	String name;
	int remainingMoves;
	AvailAct actions = new AvailAct();
	Map map = new Map();

	public Player(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
	}

	public void setPlayerName(String name) {
		this.name = name;
	}

	//TODO
	public void act(String act){
		if(act.equalsIgnoreCase(actions.moveNorth.hotkey)){
			Action.moveNorth(this);
		}
		else if(act.equalsIgnoreCase(actions.moveEast.hotkey)){
				Action.moveEast(this);
		}
		else if(act.equalsIgnoreCase(actions.moveSouth.hotkey)){
			Action.moveSouth(this);
		}
		else if(act.equalsIgnoreCase(actions.moveWest.hotkey)){
			Action.moveWest(this);
		}
		if(act.equals(actions.talk.hotkey)){
			Action.talk(this.map.map[this.x][this.y]);
		}
	}
	
}
