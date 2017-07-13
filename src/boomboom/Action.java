package boomboom;

import java.util.ArrayList;

public class Action {
	String hotkey;
	String name;
	static boolean finish;
	static boolean exists;
	static boolean contains;

	static void nextLine(Player player){
		player.actions.availableActions.clear();
		player.actions.availableActions.add(player.actions.talk);
		player.actions.printAa();
		Game.scan.nextLine();
	}
	
	public static boolean containsItem(ArrayList<Item> array, Item item){
		for(int i = 0;i<array.size();i++){
			if(array.get(i).equals(item)){
				contains = true;
				break;
			}
		}
		return contains;
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
			if(!containsItem(player.inventory,Player.radio)){
				player.inventory.add(Player.radio);	
				System.out.println("\nyou have received \"radio\" from woozi.");
			}
			finish = true;
		}
		//
		if (room == Map.kwan) {
			System.out.println(Line.kwan1);
			nextLine(player);
			System.out.println(Line.kwan2);
			if(!containsItem(player.inventory,Player.bracelet)){
				player.inventory.add(Player.bracelet);
				System.out.println("\nyou have received \"bracelet\" from seungkwan.");
			}
			finish = true;
		}
		//
		if (room == Map.dk) {
			System.out.println(Line.dk1);
			nextLine(player);
			System.out.println(Line.dk2);
			if(!containsItem(player.inventory,Player.diagram)){
				player.inventory.add(Player.diagram);
				System.out.println("\nyou have received \"diagram\" from dk.");
			}
			finish = true;
		}
		//
		if (room == Map.the8) {
			System.out.println(Line.the81);
			nextLine(player);
			System.out.println(Line.the82);
			if(!containsItem(player.inventory,Player.drone)){
				player.inventory.add(Player.drone);
				System.out.println("\"oh, wait,\" the8 says. \"before you go, take this. it could help.\n"
			+ "even if it doesn't, it's good to be prepared, yeah?\"\n"
						+ "\nyou have received \"drone\" from the8.");
			}
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
			player.setTime();
			System.out.println(Line.dino1);
			Dino.dinoChallenge(player);
		}
	}

	static void printInv(Player player){
		if(player.inventory.isEmpty()){
			if(!player.map.map[player.x][player.y].equals(Map.dino)){
			System.out.println(" ");
			System.out.println("your inventory is empty right now. collect something and come back later.");
			}
		}
		else{
			for(Item item : player.inventory){
				System.out.println();
				item.printDesc();
			}
		}
	}	
	
	
}

