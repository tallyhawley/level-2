package boomboom;

import java.util.ArrayList;

public class Player {
	int x;
	int y;
	int health;
	String name;
	int remainingMoves = 30;
	AvailAct actions = new AvailAct();
	Map map = new Map();
	ArrayList<Item> inventory = new ArrayList<Item>();
	boolean isEqual;

	public Player(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
	}

	public void setPlayerName(String name) {
		this.name = name;
	}

	public void act(String act) {
		for(Action action : this.actions.availableActions){
			isEqual = act.equals(action.hotkey);
			if (isEqual) break;
		}
		if(act.isEmpty()){
			System.out.println("you're going to need to be more specific than the nothing you just entered.");
		}
		else if(isEqual == false){
			System.out.println("\nthat's not an option right now. maybe it won't ever be an option. who knows?");
		}
		else if (act.equalsIgnoreCase(actions.moveNorth.hotkey) && actions.availableActions.contains(actions.moveNorth)) {
			Action.moveNorth(this);
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		} else if (act.equalsIgnoreCase(actions.moveEast.hotkey) && actions.availableActions.contains(actions.moveEast)) {
			Action.moveEast(this);
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		} else if (act.equalsIgnoreCase(actions.moveSouth.hotkey) && actions.availableActions.contains(actions.moveSouth)) {
			Action.moveSouth(this);
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		} else if (act.equalsIgnoreCase(actions.moveWest.hotkey) && actions.availableActions.contains(actions.moveWest)) {
			Action.moveWest(this);
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		}
		if (act.equals(actions.talk.hotkey) && actions.availableActions.contains(actions.talk)) {
			System.out.println(" ");
			Action.talk(this.map.map[this.x][this.y], this);
		}
		if (act.equals(actions.inv.hotkey) && actions.availableActions.contains(actions.inv)){
			Action.printInv(this);
		}
	}

}
