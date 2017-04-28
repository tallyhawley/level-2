package boomboom;

import java.util.ArrayList;

public class AvailAct {
	Action moveNorth;
	Action moveEast;
	Action moveWest;
	Action moveSouth;
	Action talk;
	Action inv;
	ArrayList<Action> availableActions = new ArrayList<Action>();

	public AvailAct() {
		this.moveNorth = new Action("move north", "n");
		this.moveEast = new Action("move east", "e");
		this.moveWest = new Action("move west", "w");
		this.moveSouth = new Action("move south", "s");
		this.talk = new Action("talk", "t");
		this.inv = new Action("check inventory", "i");
	}

	public void printAa() {
		System.out.println(" ");
		for (Action action : availableActions) {
			System.out.println(action.hotkey + ": " + action.name);
		}
	}

	public void clear() {
		availableActions.clear();
	}

	public void availDir(Room room) {
		switch (room.dir) {
		case 0:
			availableActions.clear();
			break;
		case 1:
			availableActions.clear();
			availableActions.add(moveNorth);
			break;
		case 2:
			availableActions.clear();
			availableActions.add(moveSouth);
			break;
		case 3:
			availableActions.clear();
			availableActions.add(moveEast);
			break;
		case 4:
			availableActions.clear();
			availableActions.add(moveWest);
			break;
		case 5:
			availableActions.clear();
			availableActions.add(moveNorth);
			availableActions.add(moveSouth);
			break;
		case 6:
			availableActions.clear();
			availableActions.add(moveNorth);
			availableActions.add(moveEast);
			break;
		case 7:
			availableActions.clear();
			availableActions.add(moveNorth);
			availableActions.add(moveWest);
			break;
		case 8:
			availableActions.clear();
			availableActions.add(moveEast);
			availableActions.add(moveSouth);
			break;
		case 9:
			availableActions.clear();
			availableActions.add(moveWest);
			availableActions.add(moveSouth);
			break;
		case 10:
			availableActions.clear();
			availableActions.add(moveEast);
			availableActions.add(moveWest);
			break;
		case 11:
			availableActions.clear();
			availableActions.add(moveNorth);
			availableActions.add(moveEast);
			availableActions.add(moveSouth);
			break;
		case 12:
			availableActions.clear();
			availableActions.add(moveNorth);
			availableActions.add(moveWest);
			availableActions.add(moveSouth);
			break;
		case 13:
			availableActions.clear();
			availableActions.add(moveNorth);
			availableActions.add(moveEast);
			availableActions.add(moveWest);
			break;
		case 14:
			availableActions.clear();
			availableActions.add(moveEast);
			availableActions.add(moveWest);
			availableActions.add(moveSouth);
			break;
		case 15:
			availableActions.clear();
			availableActions.add(moveNorth);
			availableActions.add(moveEast);
			availableActions.add(moveWest);
			availableActions.add(moveSouth);
			break;
		}
		if (room.npc == true && Action.finish == false) {
			availableActions.add(talk);
		}
		if (room.npc == true && Action.first == false) {
			availableActions.clear();
			availableActions.add(talk);
		}
		if (room.npc == false){
			availableActions.add(inv);
		}
	}

}
