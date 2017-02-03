package boomboom;

import java.util.Scanner;

public class Game {
	
	Room directory;
	Room elevator;
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		Player player = new Player(1,6,100);
		initRooms();
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
		System.out.println("you can't go to "+ans+", "+player.name+". can't you see? you're meant to be here.");
	}
	
	@SuppressWarnings("unused")
	private static void initRooms(){
		NPCRoom coups = new NPCRoom(3,5,"the office you enter is dim. the walls are lined by bookshelves\n"
				+ "and a large desk stands in the center. it's covered in paperwork and\n"
				+ "the walls are lined with the same kind of maps and diagrams as the\n"
				+ "hallway outside. at closer inspection, the paperwork looks more like\n"
				+ "floor plans.\n"
				+ "behind the desk sits s. coups: leader of the operation and owner of\n"
				+ "the building. he looks up, almost surprised to see you standing there.\n"
				+ "he sits back in his chair and beckons for you to sit down.\n"
				+ "what will you do?",1);
		Room tocoups = new Room(3,5,"",14);
		NPCRoom woozi = new NPCRoom(5,4,"you push open the door to reveal what looks like a closet.\n"
				+ "the inside is lined with screens and a boy who can't be older than\n"
				+ "fifteen sits, monitoring them. there's a half-eaten donut and a coffee\n"
				+ "sitting on the desk next to him.\n"
				+ "suddenly he whips around in his chair, glasses slipping down his\n"
				+ "nose in his hurry. at a closer look, he looks closer to twenty.\n"
				+ "you guess this is woozi.\n"
				+ "what will you do?",2);
		Room towoozi = new Room(5,5,"",13);
		NPCRoom dk = new NPCRoom(6,7,"as soon as you enter this room, you're starting to get sick of\n"
				+ "the map-covered-walls aesthetic. there's somebody working at a desk\n"
				+ "on the other side of the room, natural light from the massive window\n"
				+ "washing out the room and giving everything a dusty look. or maybe it's\n"
				+ "just dusty like that.\n"
				+ "the guy turns around and smiles, eyes crinkling at the corners.\n"
				+ "what will you do?",3);
		Room todk = new Room(7,7,"",12);
		NPCRoom kwan = new NPCRoom(9,1,"",4);
		Room tokwan = new Room(8,1,"",10);
		NPCRoom the8 = new NPCRoom(1,3,"",5);
		NPCRoom dino = new NPCRoom(9,3,"",0);
		Room todino = new Room(8,3,"",10);
		Room lasers = new Room(1,2,"",5);
		Room turnlas = new Room(1,1,"",8);
		Room lasend = new Room(2,1,"",10);
	}
}
