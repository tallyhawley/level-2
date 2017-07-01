package boomboom;

public class Action {
	String hotkey;
	String name;
	static boolean finish;
	static boolean exists;
	static String dinoAct;

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
			dinoChallenge(player);
		}
		else if (room == Map.dino && Player.gameWon) {
			System.out.println(Line.dinoWin);
			finish = true;
			Player.gameOver = true;
		}
		else if(room == Map.dino && !Player.gameWon){
			System.out.println(Line.dinoLose);
			finish = true;
			Player.gameOver = true;
		}
	}

	static void printInv(Player player){
		System.out.println(" ");
		if(player.inventory.isEmpty()){
			System.out.println("your inventory is empty right now. collect something and come back later.");
		}
		else{
			for(Item item : player.inventory){
			item.printDesc();
			System.out.println("  ");
			}
		}
	}	

	static void dinoChallenge(Player player){
		while(Player.gameOver){
		System.out.println("\nt: talk\ni: use an item\nc: check the time on the bomb\n");
		dinoAct = Game.scan.nextLine();
		switch(dinoAct){
			case "t":
				System.out.println("\"what are you doing, kid?\" you ask, voice soft.\n"
						+ "he looks at you, expression turning almost sad. \"get out of here,\" he says,\n"
						+ "quieter.");
				System.out.println("\nt: talk\ni: use an item\nc: check the time on the bomb\n");
				dinoAct = Game.scan.nextLine();
				player.subtractMoves();
				player.setTime();
				switch(dinoAct){
					case "t":
					case "i":
					case "c": System.out.println("the clock reads " + Player.bombTime + "."); break;
					default: System.out.println("that's not an option right now. be more careful -\n"
							+ "you're losing time."); break;
				}
				break;
			case "i":
				printInv(player);
				int i;
				if(player.inventory.isEmpty()){
					System.out.println("your inventory is empty.");
				}
				for(i = 0;i<player.inventory.size();i++){
					System.out.println((i+1) + ": "+ player.inventory.get(i).name);
				}
				dinoAct = Game.scan.nextLine();
				player.existsIn(player.inventory);
				if(!exists){
					System.out.println("that's not an option right now. be more careful -\nyou're losing time.");
				}
				else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.radio)){

 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.drone)){
 					
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.diagram)){
 					
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.bracelet)){
 					
 				}
				break;
			case "c": System.out.println("the clock reads " + Player.bombTime + "."); break;
			default: System.out.println("that's not an option right now. be more careful -\n"
					+ "you're losing time."); break; 
		}
		}
	}
}

