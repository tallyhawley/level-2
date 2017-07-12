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
	ArrayList<Item> inventory;
	boolean isEqual;
	static Weapon drone = new Weapon("drone",
			"a dart-equipped drone given to you by the8.\n"
					+ "it's made of a sturdy metal you think is titanium and painted a matte black.\n"
					+ "the motor makes a low whirr when you turn it on.",
			300, 10);
//	static Weapon dartgun = new Weapon("dart gun","given to you by the8",250,15);
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
	static boolean timeOut;
	static boolean dinoTOut;
	String bombTime;
	static int seconds;
	static int negTime;
	
	public Player(int x, int y, int health) {
		this.x = x;
		this.y = y;
		this.health = health;
		this.inventory = new ArrayList<Item>();
		this.remainingMoves = new Random().nextInt(56);
		this.remainingMoves += 45;
	}

	public void setTime(){
		if(this.remainingMoves > 59){
			seconds = this.remainingMoves - 60;
			if(seconds<10){
				this.bombTime = "02:0" + seconds;
			}else{
			this.bombTime = "02:" + seconds;
			}
		}else if(this.remainingMoves<10){
			this.bombTime = "01:0"+ this.remainingMoves;
		}
		else if(this.remainingMoves == 0){
			this.bombTime = "01:00";
		}
		else if(this.remainingMoves < 0){
			negTime = this.remainingMoves + 60;
			this.bombTime = "00:" + negTime;
		}
		else if(this.remainingMoves<-50){
			negTime = this.remainingMoves + 60;
			this.bombTime = "00:0"+negTime;
		}
		else if(this.remainingMoves > 10){this.bombTime = "01:" + this.remainingMoves;}
	}
	
	public void setPlayerName(String name) {
		this.name = name;
	}
	
	private void subtractMove(){
		this.remainingMoves--;
		setTime();
		if(this.remainingMoves == 0){
			gameOver = true;
			timeOut = true;
		}
	}
	
	public void subtractMoves(){
		this.remainingMoves-=3;
		setTime();
		if(this.remainingMoves <= -60){
			gameOver = true;
			dinoTOut = true;
		}
	}

	public void act(String act) {
		subtractMove();
		System.out.println("\nyou have " + remainingMoves + " moves remaining.");
		if(!gameOver){
			for(Action action : this.actions.availableActions){
				isEqual = act.equals(action.hotkey);
				if (isEqual) break;
			}
			if(act.isEmpty()){
				System.out.println("\nyou're going to need to be more specific than the nothing you just entered.");
			}
			else if(!isEqual){
				System.out.println("\nthat's not an option right now. maybe it won't ever be an option. who knows?");
			}
			else if (act.equalsIgnoreCase(actions.moveNorth.hotkey) && isEqual) {
				Action.moveNorth(this);
				System.out.println();
				System.out.println(this.map.map[this.x][this.y].desc);
			} else if (act.equalsIgnoreCase(actions.moveEast.hotkey) && isEqual) {
				Action.moveEast(this);
				System.out.println();
				System.out.println(this.map.map[this.x][this.y].desc);
			} else if (act.equalsIgnoreCase(actions.moveSouth.hotkey) && isEqual) {
				Action.moveSouth(this);
				System.out.println();
				System.out.println(this.map.map[this.x][this.y].desc);
			} else if (act.equalsIgnoreCase(actions.moveWest.hotkey) && isEqual) {
				Action.moveWest(this);
				System.out.println();
				System.out.println(this.map.map[this.x][this.y].desc);
			}
			if (act.equals(actions.talk.hotkey) && isEqual) {
				System.out.println();
				Action.talk(this.map.map[this.x][this.y], this);
			}
			if (act.equals(actions.inv.hotkey) && isEqual){
				Action.printInv(this);
			}
		}	
	}
	
	public void existsIn(ArrayList<Item> array){
		for(Item item : array){
			if(array.get(Integer.parseInt(Dino.dinoAct)).equals(item)){
				Action.exists = true;
			}
			if (Action.exists) break;
		}
	}

}
