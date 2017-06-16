package boomboom;

public class Action {
	String hotkey;
	String name;
	static boolean finish;

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
		if (room == Map.coups) {
			System.out.println(Line.coups1);
			nextLine(player);
			System.out.println(Line.coups2);
			
			finish = true;
		}
		//
		if (room == Map.woozi) {
			System.out.println(Line.woozi1);
			nextLine(player);
			System.out.println(Line.woozi2);
			player.inventory.add(Player.radio);
			finish = true;
		}
		//
		if (room == Map.kwan) {
			System.out.println(Line.kwan1);
			nextLine(player);
			System.out.println(Line.kwan2);
			player.inventory.add(Player.bracelet);
			finish = true;
		}
		//
		if (room == Map.dk) {
			System.out.println(Line.dk1);
			nextLine(player);
			System.out.println(Line.dk2);
			player.inventory.add(Player.diagram);
			finish = true;
		}
		//
		if (room == Map.the8) {
			System.out.println(Line.the81);
			nextLine(player);
			System.out.println(Line.the82);
			player.inventory.add(Player.drone);
			finish = true;
		}
		//
		if (room == Map.elevator) {
			System.out.println(Line.vernon1);
			nextLine(player);
			System.out.println(Line.vernon2);
			finish = true;
		}
		//
		if (room == Map.dino) {
			System.out.println(Line.dino1);
		}
		else if (room == Map.dino && Player.gameWon == true) {
			System.out.println(Line.dinoWin);
			finish = true;
			Player.gameOver = true;
		}
		else if(room == Map.dino && Player.gameWon == false){
			System.out.println(Line.dinoLose);
			finish = true;
			Player.gameOver = true;
		}
	}

	static void printInv(Player player){
		System.out.println(" ");
		if(player.inventory.isEmpty()){
			System.out.println("your inventory is empty right now.");
		}
		else{
			for(Item item : player.inventory){
			item.printDesc();
			}
		}
	}	
}
