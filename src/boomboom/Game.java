package boomboom;
import java.util.Scanner;
/*Keith was Here*/
public class Game {
	
	NPCRoom woozi;
	NPCRoom dk;
	NPCRoom the8;
	NPCRoom kwan;
	NPCRoom dino;
	Room lasers;
	Room turnlas;
	Room lasend;
	Room tocoups;
	Room towoozi;
	Room todk;
	Room todino;
	Room tokwan;
	Room directory;
	Room elevator;
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		NPCRoom coups = new NPCRoom(3,6,"the office you enter is dim. the walls are lined by bookshelves\n"
				+ "and a large desk stands in the center. it's covered in paperwork and\n"
				+ "the walls are lined with the same kind of maps and diagrams as the\n"
				+ "hallway outside. at closer inspection, the paperwork looks more like\n"
				+ "floor plans.\n"
				+ "behind the desk sits s. coups: leader of the operation and owner of\n"
				+ "the building. he looks up, almost surprised to see you standing there.\n"
				+ "he sits back in his chair and beckons for you to sit down.\n"
				+ "what will you do?",1);
		Player player = new Player(1,6,100);
		
		System.out.println("what is your name, player?");
		String name = scan.nextLine();
		player.setPlayerName(name);
		
		System.out.println("- WELCOME TO B O O M B O O M -\n"
				+ "your mission: defend the ship.\n"
				+ "s. coups and woozi are counting on you, "+player.name+".\n"
				+ "don't let them down.\nx x x\n"
				+ "you are standing in the foyer of a large building. the ceiling arches high above you\n"
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
				+ "where will you go?");
		// delete this later
		String ans = scan.nextLine();
		System.out.println("you can't go to"+ans+", "+player.name+". can't you see? you're meant to be here.");
	}
}
