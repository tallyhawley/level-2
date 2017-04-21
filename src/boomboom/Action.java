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
			+ "\nthere's a bomb, somewhere in the building. we don't know who planted it,\n"
			+ "or when it's going to go off. the only lead we have is the bomber's initials:\n"
			+ "'LDN'. they're familiar but i can't seem to remember who they belong to...\n"
			+ "anyway. we need you to find the bomber, and stop the bomb. you're our last\n" + "hope.\"\n"
			+ "he pauses.\n" + "\"if you need to, you can find ji- woozi. he's in charge of security, so he's\n"
			+ "got a bunch of footage. he'll tell you if he found anything suspicious.\"\n\n"
			+ "he nods, and you take this as your cue to leave.";
	static String woozi1;
	static String woozi2;
	static String the81;
	static String the82;
	static String kwan1;

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

	static void talk(Room room) {

		if (room == Game.coups && first == true) {
			System.out.println(coups1);
			first = false;
			finish = false;
		} else if (room == Game.coups && first == false) {
			System.out.println(coups2);
			first = true;
			finish = true;
		}
		if (room == Game.woozi && first == true) {
			first = false;
			finish = false;
		} else if (room == Game.woozi && first == false) {
			first = true;
			finish = true;
		}
	}

}
