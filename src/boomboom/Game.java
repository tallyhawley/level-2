package boomboom;

import java.util.Scanner;

public class Game {
	
	static String intro = "you are standing in the foyer of a large building. the ceiling arches high above you\n"
			+ "and there are windows covering the entire wall behind you. your shadow stretches far\n"
			+ "in front of you in the afternoon sun. you're not sure whether your sweat-slick skin \n"
			+ "is due to the heat or the anxiety.\n"
			+ "there are hallways leading to the north, east, and south. the north hallway is unlit\n"
			+ "and empty. the east hallway is covered wall to wall in polaroids, maps, and diagrams.\n"
			+ "occasionally someone will step out from a single door on the right side. the south\n"
			+ "hallway is brightly lit and reminds you a little of a doctor's office. there is an\n"
			+ "elevator on the left side and a directory that you can't read very well. other halls\n"
			+ "branch off from the ones you can see, but they're dim and far away.\n"
			+ "you have instructions to meet s. coups in his office, but you don't know where it is.\n"
			+ "where will you go?";

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){

		Player player = new Player(1, 5, 100);
		
		System.out.println("what is your name, player?");
		String name = scan.nextLine();
		player.setPlayerName(name.toLowerCase());

		System.out.println("-- welcome to going seventeen --\n" + "your mission: defend the ship.\n"
				+ "s. coups and woozi are counting on you, " + player.name + ".\n" + "don't let them down.\nx x x\n"
				+ intro);
		while (Player.gameOver == false) {
			player.actions.availDir(player.map.map[player.x][player.y]);
			player.actions.printAa();
			String act = scan.nextLine();
			player.act(act);
			player.actions.clear();
		}
	}

}
