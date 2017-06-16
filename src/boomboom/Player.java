package boomboom;

import java.util.ArrayList;
import java.util.Random;

public class Player {
	int x;
	int y;
	int health;
	String name;
	int remainingMoves;
	AvailAct actions = new AvailAct();
	Map map = new Map();
	ArrayList<Item> inventory = new ArrayList<Item>();
	boolean isEqual;
	static Weapon drone = new Weapon("drone",
			"a dart-equipped drone given to you by the8.\n"
					+ "it's made of a sturdy metal you think is titanium and painted a matte black.\n"
					+ "the motor makes a low whirr when you turn it on.",
			300, 10);
	static Weapon dartgun = new Weapon("dart gun","given to you by the8",250,15);
	static Item radio = new Item("radio","a wireless radio, akin to a walkie-talkie, connecting you to woozi.\n"
			+ "it has a mic but no speaker, so that he can hear what's going on around\n"
			+ "you. it makes you a little uncomfortable, but you understand that it's\n"
			+ "for the safety of the mission.",250);
	static Item bracelet = new Item("woven bracelet","a good luck charm given to you by seungkwan. it isn't\n"
			+ "worth much money but the sentiment, though you haven't known him long,\n"
			+ "is priceless. keep it safe.",100);
	static Item diagram = new Item("diagram","a diagram, drawn by dokyeom. you can't really understand it,\n"
			+ "but you took it anyway. you don't know what to do with it.",145);
	static boolean gameOver = false;
	static boolean gameWon;
	
	public Player(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
		this.remainingMoves = 45;
		while(this.remainingMoves<45){
			if(this.remainingMoves<45){
				this.remainingMoves = new Random().nextInt(100);
			}	
		}
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
			this.remainingMoves--;
		}
		else if(isEqual == false){
			System.out.println("\nthat's not an option right now. maybe it won't ever be an option. who knows?");
			this.remainingMoves--;
		}
		else if (act.equalsIgnoreCase(actions.moveNorth.hotkey)) {
			Action.moveNorth(this);
			this.remainingMoves--;
			if(this.remainingMoves == 0){
				gameWon = false;
				gameOver = true;
			}
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		} else if (act.equalsIgnoreCase(actions.moveEast.hotkey)) {
			Action.moveEast(this);
			this.remainingMoves--;
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		} else if (act.equalsIgnoreCase(actions.moveSouth.hotkey)) {
			Action.moveSouth(this);
			this.remainingMoves--;
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		} else if (act.equalsIgnoreCase(actions.moveWest.hotkey)) {
			Action.moveWest(this);
			this.remainingMoves--;
			System.out.println(" ");
			System.out.println(this.map.map[this.x][this.y].desc);
		}
		if (act.equals(actions.talk.hotkey)) {
			System.out.println(" ");
			Action.talk(this.map.map[this.x][this.y], this);
		}
		if (act.equals(actions.inv.hotkey)){
			Action.printInv(this);
		}
		
	}

}
