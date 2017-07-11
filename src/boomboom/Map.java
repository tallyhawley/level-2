package boomboom;

public class Map {
	Room[][] map = new Room[10][10];
	static Room coups = new Room(3, 6,
			"the office you enter is dim. the walls are lined by bookshelves\n"
					+ "and a large desk stands in the center. it's covered in paperwork and\n"
					+ "the walls are lined with the same kind of maps and diagrams as the\n"
					+ "hallway outside. at closer inspection, the paperwork looks more like\n" + "floor plans.\n"
					+ "behind the desk sits s. coups: leader of the operation and owner of\n"
					+ "the building. he looks up, almost surprised to see you standing there.\n"
					+ "he sits back in his chair and beckons for you to sit down.\n" + "what will you do?",
			1, true);
	static Room tocoups = new Room(3, 5,
			"to your south stands a large wooden door, like a \"big boss\" office door\n"
					+ "from the sixties. maybe that's what it is. you don't know. what you know\n"
					+ "is that on the door there is a placard which reads\n" + "\"s. coups\n"
					+ "seventeen project leader\"\n" + "will you enter? or continue forward?",
			14, false);
	static Room woozi = new Room(5, 4,
			"you push open the door to reveal what looks like a closet.\n"
					+ "the inside is lined with screens and a boy who can't be older than\n"
					+ "fifteen sits, monitoring them. there's a half-eaten donut and a coffee\n"
					+ "sitting on the desk next to him.\n"
					+ "suddenly he whips around in his chair, glasses slipping down his\n"
					+ "nose in his hurry. at a closer look, he looks closer to twenty.\n" + "you guess this is woozi.\n"
					+ "what will you do?",
			2, true);
	static Room towoozi = new Room(5, 5,
			"there's a small door on your north side, made of a flimsy laminate and a big change from\n"
					+ "the \"sturdy oak\" aesthetic of the rest of the building. the label\n"
					+ "next to it reads \"woozi\" and \"DO NOT DISTURB\" in a messy scrawl.\n"
					+ "will you enter? or continue forward?",
			13, false);
	static Room dk = new Room(6, 7,
			"as soon as you enter this room, you're starting to get sick of\n"
					+ "the map-covered-walls aesthetic. there's somebody working at a desk\n"
					+ "on the other side of the room, natural light from the massive window\n"
					+ "washing out the room and giving everything a dusty look. or maybe it's\n"
					+ "just naturally dusty like that.\n"
					+ "the guy turns around and smiles, eyes crinkling at the corners.\n" + "what will you do?",
			3, true);
	static Room todk = new Room(7, 7,
			"next to you, to the west, another door. it's a dusty colour, like someone brought it in from the desert.\n"
					+ "the label, gold plated and shiny, reads \"DK || LEE SEOKMIN\", and underneath, \"COMMUNICATIONS & PLANNING\".\n"
					+ "on your other side is a sort of map of the building, smudged and practically indecipherable\n"
					+ "under the glass. you can make out a \"BOO SEUNGKWAN\" somewhere in the top right,\n"
					+ "and a \"VERNON HANSOL CHOI\", on the left. the red of the \"YOU ARE HERE\" symbol barely\n"
					+ "peeks out, close to the bottom right of the map. the door still looms next to you.\n"
					+ "will you enter? or continue forward?",
			12, false);
	static Room kwan = new Room(9, 1,
			"the room is lit with a soft light, covered wall to wall in soft\n"
					+ "pastels. a boy, no older than eighteen, seems to be sleeping on a beige sofa\n"
					+ "he opens his eyes and sits up, blinking away sleep and yawning. his dyed blonde\n"
					+ "hair falls just short of dark, weary eyes, shadowing full cheeks and a sharp\n"
					+ "jaw. he looks at you, almost inquisitive.\n" + "what will you do?",
			4, true);
	static Room tokwan = new Room(8, 1,
			"in front of you, eastside, there is a white door. next to it, a pastel blue label\n"
					+ "reads \"boo seungkwan, resident sunshine\". next to the words, someone's drawn\n"
					+ "a little heart and a smiley face. at the bottom, in a small font, is written,\n"
					+ "\"hansol's\", with another heart.",
			10, false);
	static Room the8 = new Room(1, 3,
			"the hallway brightens slightly. it holds a foreboding aura, neon\n"
					+ "flashing in front and the welcoming light of the lobby behind. you can\n"
					+ "see the sillouhette of a young man aged nineteen or twenty. light glints\n"
					+ "off of glossy red hair, illuminates dark eyes and slightly pointed ears.\n"
					+ "he holds a remote control in his hand, the type you've seen people online use\n"
					+ "with little cars and drones with four motors. one of these drones hangs\n"
					+ "from the fingers of his other hand.\n" + "what will you do?",
			5, true);
	static Room dino = new Room(9, 3, "the room you enter is dark, almost too dark to make out the boy\n"
			+ "standing against the opposite wall. his skin almost glows in the low\n"
			+ "light, pale even against a white jacket and faded blonde hair, and he\n"
			+ "moves to cover up four ticking numbers behind him, kicks at the beeping\n" + "machine with a curse.\n"
			+ "this kid is... young. seventeen, at the oldest. sixteen, maybe. you don't\n"
			+ "want to hurt him. you want to send him back to his parents, and maybe tuck\n"
			+ "him into bed. but you know he's planted a bomb in here, so you're going to\n"
			+ "have to stop him. somehow.\n" + "what will you do?", 0, true);
	static Room todino = new Room(8, 3,
			"the door in front of you is rather foreboding, you think. you don't\n"
					+ "know whether it's supposed to be like that or if you're just tired as hell\n"
					+ "and you're starting to imagine things. it's metal, and the words \"east boiler room\"\n"
					+ "are engraved into the surface.\n" + "will you enter? or will you turn around?",
			10, false);
	static Room lasers = new Room(1, 2, "wow. you definitely did not think this through. there are so many\n"
			+ "lasers. everywhere. holy shit. help.\n" + "the8 is still behind you, eyes glinting and mouth perking up\n"
			+ "in a smirk. what an asshole. a beautiful asshole.\n" + "do you want to keep moving?", 5, false);
	static Room turnlas = new Room(1, 1, "the hallway turns abruptly, stretching away to the east. there are still\n"
			+ "lasers. goddamnit. goddamn lasers.\n" + "keep going?", 8, false);
	static Room lasend = new Room(2, 1,
			"you can see light in front of you past these goddamn lasers. a hallway that\n"
					+ "looks... pastel? you've never been so happy to see pastels in your\n"
					+ "life. it's not stopping you now.\n" + "keep moving?",
			10, false);
	static Room startrm = new Room(1, 5,
			"you're back where you started, in the brightly lit foyer with the\n"
					+ "big windows. it's not as fascinating the second time around.\n" + "where will you go?",
			11, false);
	static Room nhall = new Room(1, 4,
			"the darkness is oppressive and hazy, almost smoky. you think you can see flashes\n"
					+ "of light somewhere. you're not sure. keep walking?",
			5, false);
	static Room ehall = new Room(2, 5, "the pastel yellow of the walls is calming but surreal. you're surrounded by\n"
			+ "maps written in languages you can't understand. keep walking?", 10, false);
	static Room eend = new Room(9, 5, "you seem to have hit a dead end. you're going to have to turn around.", 4,
			false);
	static Room shall = new Room(1, 6,
			"the lights are a little disconcerting. the sterile 'doctor's office' feeling is\n"
					+ "still there. the hallway smells like disinfectant. keep walking?",
			5, false);
	static Room send = new Room(1, 9, "you seem to have hit a dead end. you're going to have to turn around.", 1,
			false);
	static Room dkhall = new Room(7, 6, "looks like a normal hallway. a little sandy, maybe, but normal.\n"
			+ "keep walking?", 5, false);
	static Room dkend = new Room(7, 8, "you seem to have hit a dead end. you're going to have to turn around.", 1,
			false);
	static Room todkhall = new Room(7, 5, "the hallway branches off to the south here.\n"
			+ "where will you go?", 14, false);
	static Room kwanhall = new Room(3, 1, "the walls are painted in pretty pastels here, blue and yellow and\n"
			+ "a touch of pink. it's not really your personal aesthetic, but you\n"
			+ "can appreciate good colour schemes when you see them.\n"
			+ "keep walking?", 10, false);
	static Room todinohall = new Room(7, 1, "the hallway branches off to the south, going dark and foreboding\n"
			+ "like the hallway in a horror movie that you're not supposed to go into\n"
			+ "but some side character goes into it anyway. you don't know if you want\n"
			+ "to go in, at least just yet.\n"
			+ "where will you go?", 14, false);
	static Room dinohall = new Room(7, 2, "darkness and foreboding.\n"
			+ "keep walking?", 5, false);
	static Room dinoturn = new Room(7, 3, "the hallway turns abruptly here. it's not quite pitch dark\n"
			+ "but it's sort of creepy anyway.\n"
			+ "keep moving?", 6, false);
	static Room directory = new Room(1, 7, "to your side is a directory. all it reads is:\n"
			+ "- S. COUPS: project lead, biorhythmics. east hall.\n" + "- WOOZI: monitoring, analytics. east hall.\n"
			+ "- DK: planning, communications, topography. southeast hall.\n"
			+ "- THE8: weaponry, defense, security. north hall.\n" + "- BOO SEUNGKWAN: advertising. northeast hall.\n"
			+ "- VERNON: costuming, neurosciences. south hall.\n" + "and, crossed out:\n"
			+ "- DINO: mathematics, physics, chemistry. northeast hall.\n"
			+ "to your east is an elevator door. it seems like it's slightly open.\n" + "where will you go?", 11,
			false);
	static Room elevator = new Room(2, 7,
					"as you enter the elevator, you come face to face with an... unfairly attractive\n"
					+ "person. he looks sixteen, but knowing half of the people here he's probably\n"
					+ "more like eighteen. you check him out as discreetly as you can. he's dressed\n"
					+ "in a black trenchcoat, buttoned, over a turtleneck. he's probably the only\n"
					+ "person you've ever seen who can pull that off. he's smiling at you, a playful\n"
					+ "upturn of the lip. wow, that's not fair. what the hell.\n"
					+ "you can step back out, or you can stay and talk.\n"
					+ "what will you do?",
			4, true); 

	public Map() {
		map[coups.x][coups.y] = coups;
		map[dino.x][dino.y] = dino;
		map[dinohall.x][dinohall.y] = dinohall;
		map[dinoturn.x][dinoturn.y] = dinoturn;
		map[directory.x][directory.y] = directory;
		map[dk.x][dk.y] = dk;
		map[dkend.x][dkend.y] = dkend;
		map[dkhall.x][dkhall.y] = dkhall;
		map[eend.x][eend.y] = eend;
		map[ehall.x][ehall.y] = ehall;
		map[elevator.x][elevator.y] = elevator;
		map[kwan.x][kwan.y] = kwan;
		map[tokwan.x][tokwan.y] = tokwan;
		map[kwanhall.x][kwanhall.y] = kwanhall;
		map[lasend.x][lasend.y] = lasend;
		map[lasers.x][lasers.y] = lasers;
		map[nhall.x][nhall.y] = nhall;
		map[send.x][send.y] = send;
		map[shall.x][shall.y] = shall;
		map[startrm.x][startrm.y] = startrm;
		map[the8.x][the8.y] = the8;
		map[tocoups.x][tocoups.y] = tocoups;
		map[todino.x][todino.y] = todino;
		map[todinohall.x][todinohall.y] = todinohall;
		map[todk.x][todk.y] = todk;
		map[todkhall.x][todkhall.y] = todkhall;
		map[tokwan.x][tokwan.y] = tokwan;
		map[towoozi.x][towoozi.y] = towoozi;
		map[turnlas.x][turnlas.y] = turnlas;
		map[woozi.x][woozi.y] = woozi;
		map[4][5] = ehall;
		map[6][5] = ehall;
		map[8][5] = ehall;
		map[1][8] = shall;
		map[4][1] = kwanhall;
		map[5][1] = kwanhall;
		map[6][1] = kwanhall;
	}
}
