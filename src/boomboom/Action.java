package boomboom;

public class Action {
	String hotkey;
	String name;
	static boolean finish;
	static String coups1 = "s. coups leans forward, elbows resting on the surface of his desk. he looks\n"
			+ "worried.\n" + "\"i need your help. but...\" he pauses.\n"
			+ "\"this could be dangerous. are you sure you're up to it?\"";
	static String coups2 = "\n\"yes, mr. coups,\" you say. \"what do you need?\"\n"
			+ "s. coups laughs and shakes his head.\n" + "\"call me seungcheol,\" he says. \"anyway...\n"
			+ "\"there's a bomb, somewhere in the building. we don't know who planted it,\n"
			+ "or when it's going to go off. the only lead we have is the bomber's initials:\n"
			+ "'LDN'. they're familiar but i can't seem to remember who they belong to...\n"
			+ "anyway. we need you to find the bomber, and stop the bomb. you're our last\n" + "hope.\"\n"
			+ "he pauses.\n" + "\"if you need to, you can find ji- woozi. he's in charge of security, so he's\n"
			+ "got a bunch of footage. he'll tell you if he found anything suspicious.\"\n"
			+ "he nods, and you take this as your cue to leave.";
	static String woozi1 = "he blinks at you, pushing his glasses back up so that they rest, slightly\n"
			+ "crooked, on the bridge of his nose. he squints, nonetheless,\n"
			+ "as though he's trying to figure you out with one glance.\n"
			+ "\"oh!\" he exclaims. \"you're- the- the kid. that we hired.\n"
			+ "coups said he'd send you over. you know what we're trying to\n"
			+ "do, right?\"";
	static String woozi2 = "\nline 2";
	static String the81 = "line 1";
	static String the82 = "\nline 2";
	static String kwan1 = "line 1";
	static String kwan2 = "\nline 2";
	static String dk1 = "line 1";
	static String dk2 = "\nline 2";
	static String vernon1 = "line 1";
	static String vernon2 = "\nline 2";
	static String dino1 = "line 1";
	static String dinoWin = "\nthis prints if u win";
	static String dinoLose = "\nthis prints if u lose";

	static void nextLine(Player player){
		player.actions.availableActions.clear();
		player.actions.availableActions.add(player.actions.talk);
		player.actions.printAa();
		Game.scan.nextLine();
	}
	
	public Action(String name, String hotkey) {
		this.hotkey = hotkey;
		this.name = name;
	}

	static void moveNorth(Player player) {
		player.y--;
		finish = false;
	}

	static void moveEast(Player player) {
		player.x++;
		finish = false;
	}

	static void moveWest(Player player) {
		player.x--;
		finish = false;
	}

	static void moveSouth(Player player) {
		player.y++;
		finish = false;
	}

	static void talk(Room room, Player player) {
		if (room == Game.coups) {
			System.out.println(coups1);
			nextLine(player);
			System.out.println(coups2);
			finish = true;
		}
		//
		if (room == Game.woozi) {
			System.out.println(woozi1);
			nextLine(player);
			System.out.println(woozi2);
			player.inventory.add(Game.radio);
			finish = true;
		}
		//
		if (room == Game.kwan) {
			System.out.println(kwan1);
			nextLine(player);
			System.out.println(kwan2);
			player.inventory.add(Game.bracelet);
			finish = true;
		}
		//
		if (room == Game.dk) {
			System.out.println(dk1);
			nextLine(player);
			System.out.println(dk2);
			player.inventory.add(Game.diagram);
			finish = true;
		}
		//
		if (room == Game.the8) {
			System.out.println(the81);
			nextLine(player);
			System.out.println(the82);
			player.inventory.add(Game.drone);
			finish = true;
		}
		//
		if (room == Game.elevator) {
			System.out.println(vernon1);
			nextLine(player);
			System.out.println(vernon2);
			finish = true;
		}
		//
		if (room == Game.dino) {
			System.out.println(dino1);
		}
		else if (room == Game.dino && Game.gameWon == true) {
			System.out.println(dinoWin);
			finish = true;
			Game.gameOver = true;
		}
		else if(room == Game.dino && Game.gameWon == false){
			System.out.println(dinoLose);
			finish = true;
			Game.gameOver = true;
		}
	}

	static void printInv(Player player){
		System.out.println(" ");
		for(Item item : player.inventory){
			item.printDesc();
		}
	}	
}
