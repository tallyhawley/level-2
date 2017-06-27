package boomboom;

import java.util.Scanner;

public class Game {

	static Scanner scan = new Scanner(System.in);
	static Player player;
	
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
	static boolean cont;
	
	public Game(){
		player = new Player(1, 5, 100);
		
		System.out.println("what is your name, player?");
		String name = scan.nextLine();
		player.setPlayerName(name.toLowerCase());

		System.out.println("\n-- welcome to going seventeen --\n" + "your mission: defend the ship.\n"
				+ "s. coups and woozi are counting on you, " + player.name + ".\n" + "don't let them down.\nx x x\n"
				+ intro);
		while (!Player.gameOver) {
			player.actions.availDir(player.map.map[player.x][player.y]);
			player.actions.printAa();
			String act = scan.nextLine();
			player.act(act);
			if(!Player.gameOver){
				player.actions.clear();
			}
		}
		if(Player.timeOut){
			System.out.println("\nsomewhere in the building, a bomb goes off. a note in the rubble reads,\n"
					+ "\"thanks for taking your time, "+ player.name +"! love, l.d.n.\"\n"
					+ "do you want to try again?");
			System.out.println("\nenter \"y\" to try again. enter any other key to quit.");
			String yn = scan.nextLine();
			if(yn.equals("y")){
				System.out.println("  ");
				cont = true;
			}	
		}
	
	}

}
