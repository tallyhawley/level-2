package boomboom;

import java.util.Scanner;

public class Game {

	Room directory;
	Room elevator;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		init();
		Player player = new Player(1, 6, 100);
		
		System.out.println("what is your name, player?");
		String name = scan.nextLine();
		player.setPlayerName(name);

		System.out.println("- WELCOME TO B O O M B O O M -\n" 
				+ "your mission: defend the ship.\n" 
				+ "s. coups and woozi are counting on you, " + player.name + ".\n"
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
		
		String act = scan.nextLine();
		//TODO delete
		System.out.println("you can't go to " + act + ", " + player.name + ". can't you see? you're meant to be here.");
	}

	@SuppressWarnings("unused")
	static void init() {
		NPCRoom coups = new NPCRoom(3, 5,
				"the office you enter is dim. the walls are lined by bookshelves\n" + "and a large desk stands in the center. it's covered in paperwork and\n"
						+ "the walls are lined with the same kind of maps and diagrams as the\n" + "hallway outside. at closer inspection, the paperwork looks more like\n"
						+ "floor plans.\n" + "behind the desk sits s. coups: leader of the operation and owner of\n"
						+ "the building. he looks up, almost surprised to see you standing there.\n" + "he sits back in his chair and beckons for you to sit down.\n"
						+ "what will you do?", 1);
		Room tocoups = new Room(3, 5, "you're standing next to a large wooden door, like an office door\n"
				+ "from the sixties. maybe that's what it is. you don't know. what you know\n"
				+ "is that on the door there is a placard which reads\n"
				+ "'s. coups\n"
				+ "seventeen project leader'\n"
				+ "will you enter? or continue forward?", 14);
		NPCRoom woozi = new NPCRoom(5, 4, "you push open the door to reveal what looks like a closet.\n"
				+ "the inside is lined with screens and a boy who can't be older than\n"
				+ "fifteen sits, monitoring them. there's a half-eaten donut and a coffee\n"
				+ "sitting on the desk next to him.\n"
				+ "suddenly he whips around in his chair, glasses slipping down his\n"
				+ "nose in his hurry. at a closer look, he looks closer to twenty.\n"
				+ "you guess this is woozi.\n"
				+ "what will you do?", 2);
		Room towoozi = new Room(5, 5, "there's a small door to the side, made of a flimsy laminate and a big change from\n"
				+ "the 'sturdy oak' aesthetic of the rest of the building. the label\n"
				+ "next to it reads 'woozi' and 'DO NOT DISTURB' in a messy scrawl.\n"
				+ "will you enter? or continue forward?", 13);
		NPCRoom dk = new NPCRoom(6, 7, "as soon as you enter this room, you're starting to get sick of\n"
				+ "the map-covered-walls aesthetic. there's somebody working at a desk\n"
				+ "on the other side of the room, natural light from the massive window\n"
				+ "washing out the room and giving everything a dusty look. or maybe it's\n"
				+ "just naturally dusty like that.\n"
				+ "the guy turns around and smiles, eyes crinkling at the corners.\n"
				+ "what will you do?", 3);
		Room todk = new Room(7, 7, "next to you, another door. it's a dusty colour, like someone brought it in from the desert. the label, gold plated\n"
				+ "and shiny, reads 'DK || LEE SEOKMIN', and underneath, 'COMMUNICATIONS & PLANNING'.\n"
				+ "on your other side is a sort of map of the building, smudged and practically indecipherable\n"
				+ "under the glass. you can make out a 'BOO SEUNGKWAN' somewhere in the top right,\n"
				+ "and a 'CHOI VERNON HANSOL', on the left. the red of the 'YOU ARE HERE' symbol barely\n"
				+ "peeks out, close to the bottom of the map. the door still looms next to you."
				+ "will you enter? or continue forward?", 12);
		NPCRoom kwan = new NPCRoom(9, 1, "the room is lit with a soft light, covered wall to wall in soft\n"
				+ "pastels. a boy, no older than eighteen, seems to be sleeping on a beige sofa\n"
				+ "he opens his eyes and sits up, blinking away sleep and yawning. his dyed blonde\n"
				+ "hair falls just short of dark, weary eyes, shadowing full cheeks and a sharp\n"
				+ "jaw. he looks at you, almost inquisitive.\n"
				+ "what will you do?", 4);
		Room tokwan = new Room(8, 1, "in front of you, there is a white door. next to it, a pastel blue label\n"
				+ "reads 'boo seungkwan, resident sunshine'. next to the words, someone's drawn\n"
				+ "a little heart and a smiley face. at the bottom, in a small font, is written,\n"
				+ "'hansol's', with another heart.", 10);
		NPCRoom the8 = new NPCRoom(1, 3, "the hallway brightens slightly. it holds a foreboding aura, neon\n" 
				+ "flashing in front and the welcoming light of the lobby behind. you\n"
				+ "can see the sillouhette of a young man aged nineteen or twenty. light\n"
				+ "glints off of glossy red hair, illuminates dark eyes and pointed ears.\n"
				+ "he holds a remote control in his hand, the type you've seen people online use\n"
				+ "with little cars and drones with four motors. one of these drones hangs\n"
				+ "from the fingers of his other hand." 
				+ "what will you do?", 5);
		NPCRoom dino = new NPCRoom(9, 3, "the room you enter is dark, almost too dark to make out the boy\n" 
				+ "standing against the opposite wall. his skin almost glows in the low\n"
				+ "light, pale even against a white jacket and faded blonde hair, and he\n" 
				+ "moves to cover up the ticking numbers behind him, kicks at the beeping\n"
				+ "thing with a curse.\n" 
				+ "this kid is... young. seventeen, at the oldest. sixteen, maybe. you don't\n"
				+ "want to hurt him. you want to send him back to his parents, and maybe tuck\n"
				+ "him into bed. but you know he's planted a bomb in here, so you're going to\n" 
				+ "have to stop him. somehow.\n" 
				+ "what will you do?", 0);
		//finish these descriptions
		Room todino = new Room(8, 3, "the door in front of you is rather foreboding, you think. you don't\n"
				+ "know whether it's supposed to be like that or if you're just tired as hell\n"
				+ "and you're starting to imagine things. it's metal, and the words 'boiler room'\n"
				+ "are engraved into the surface."
				+ "will you enter? or will you turn around?", 10);
		Room lasers = new Room(1, 2, "", 5);
		Room turnlas = new Room(1, 1, "", 8);
		Room lasend = new Room(2, 1, "", 10);
		Room startrm = new Room(1, 6, "you're back where you started, in the brightly lit foyer with the\n"
				+ "big windows. it's not as fascinating the second time around.\n"
				+ "where will you go?", 11);
		Room nhall = new Room(1, 4, "the darkness is oppressive and hazy, almost smokey. you think you can see flashes\n"
				+ "of light somewhere. you're not sure. you're going to keep walking.", 5);
		Room ehall = new Room(2, 5, "the pastel yellow of the walls is calming but surreal. you're surrounded by\n"
				+ "maps written in languages you can't understand. you're going to keep walking.", 10);
		Room eend = new Room(9,5, "you seem to have hit a dead end. you're going to have to turn around.", 4);
		Room shall = new Room(1, 6, "the lights are a little disconcerting. the sterile 'doctor's office' feeling\n"
				+ "still there. the hallway smells like disinfectant. you're going to keep walking.", 5);
		Room send = new Room(1,9, "you seem to have hit a dead end. you're going to have to turn around.", 1);
		Room dkhall = new Room(7, 6, "", 5);
		Room dkend = new Room(7, 8, "you seem to have hit a dead end. you're going to have to turn around.",1);
		Room todkhall = new Room(7, 6, "", 14);
		Room kwanhall = new Room(3, 1, "", 10);
		Room todinohall = new Room(7, 1, "", 14);
		Room dinohall = new Room(7,2, "", 5);
		Room dinoturn = new Room(7, 3, "", 6);
		Room directory = new Room(1, 7, "", 11);
		NPCRoom elevator = new NPCRoom(2, 7, "", 4);
		//items
		Weapon drone = new Weapon("drone", "a dart-equipped drone given to you by the8.\n"
				+ "it's made of a sturdy metal you think is titanium and painted a matte black.\n"
				+ "the motor makes a low whirr when you turn it on.", 300, 10);
	}
}
