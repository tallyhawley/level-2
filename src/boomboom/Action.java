package boomboom;

public class Action {
	String hotkey;
	String name;
	static boolean first = true;
	static boolean finish;
	static String coups1 = "s. coups leans forward, elbows resting on the surface of his desk. he looks\n"
			+ "worried.\n" + "\"i need your help. but...\" he pauses.\n"
			+ "\"this could be dangerous. are you sure you're up to it?\"";
	static String coups2 = "\"yes, mr. coups,\" you say. \"what do you need?\"\n"
			+ "s. coups laughs, shakes his head.\n" + "\"call me seungcheol,\" he says. \"anyway...\n"
			+ "\"there's a bomb, somewhere in the building. we don't know who planted it,\n"
			+ "or when it's going to go off. the only lead we have is the bomber's initials:\n"
			+ "'LDN'. they're familiar but i can't seem to remember who they belong to...\n"
			+ "anyway. we need you to find the bomber, and stop the bomb. you're our last\n" + "hope.\"\n"
			+ "he pauses.\n" + "\"if you need to, you can find ji- woozi. he's in charge of security, so he's\n"
			+ "got a bunch of footage. he'll tell you if he found anything suspicious.\"\n"
			+ "he nods, and you take this as your cue to leave.";
	static String woozi1 = "line 1";
	static String woozi2 = "line 2";
	static String the81 = "line 1";
	static String the82 = "line 2";
	static String kwan1 = "line 1";
	static String kwan2 = "line 2";
	static String dk1 = "line 1";
	static String dk2 = "line 2";
	static String vernon1 = "line 1";
	static String vernon2 = "line 2";
	static String dino1 = "line 1";
	static String dinoWin = "this prints if u win";
	static String dinoLose = "this prints if u lose";

	public Action(String name, String hotkey) {
		this.hotkey = hotkey;
		this.name = name;
	}

	static void moveNorth(Player player) {
		player.y--;
	}

	static void moveEast(Player player) {
		player.x++;
	}

	static void moveWest(Player player) {
		player.x--;
	}

	static void moveSouth(Player player) {
		player.y++;
	}

	static void talk(Room room, Player player) {

		if (room == Game.coups && first == true) {
			System.out.println(coups1);
			first = false;
			finish = false;
		} else if (room == Game.coups && first == false) {
			System.out.println(coups2);
			first = true;
			finish = true;
		}
		//
		if (room == Game.woozi && first == true) {
			System.out.println(woozi1);
			first = false;
			finish = false;
		} else if (room == Game.woozi && first == false) {
			System.out.println(woozi2);
			player.inventory.add(Game.radio);
			first = true;
			finish = true;
		}
		//
		if (room == Game.kwan && first == true) {
			System.out.println(kwan1);
			first = false;
			finish = false;
		} else if (room == Game.kwan && first == false) {
			System.out.println(kwan2);
			player.inventory.add(Game.bracelet);
			first = true;
			finish = true;
		}
		//
		if (room == Game.dk && first == true) {
			System.out.println(dk1);
			first = false;
			finish = false;
		} else if (room == Game.dk && first == false) {
			System.out.println(dk2);
			player.inventory.add(Game.diagram);
			first = true;
			finish = true;
		}
		//
		if (room == Game.the8 && first == true) {
			System.out.println(the81);
			first = false;
			finish = false;
		} else if (room == Game.the8 && first == false) {
			System.out.println(the82);
			player.inventory.add(Game.drone);
			first = true;
			finish = true;
		}
		//
		if (room == Game.elevator && first == true) {
			System.out.println(vernon1);
			first = false;
			finish = false;
		} else if (room == Game.elevator && first == false) {
			System.out.println(vernon2);
			first = true;
			finish = true;
		}
		//
		if (room == Game.dino && first == true) {
			System.out.println(dino1);
			first = false;
			finish = false;
		}
		else if (room == Game.dino && first == false && Game.gameWon == true) {
			System.out.println(dinoWin);
			first = true;
			finish = true;
		}
		else if(room == Game.dino && first == false && Game.gameWon == false){
			System.out.println(dinoLose);
			first = true;
			finish = true;
		}
	}

	static void printInv(Player player){
		System.out.println(" ");
		for(Item item : player.inventory){
			item.printDesc();
		}
	}	
}
