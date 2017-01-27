package boomboom;
public class Drone extends Weapon {
	public Drone(String name, String desc, int worth, int damage) {
		super(name, desc, worth, damage);
		// TODO Auto-generated constructor stub
	}
	String name = "remote-control drone";
	String desc = "a dart-equipped drone given to you by the8.\n"
			+ "it's made of a sturdy metal you think is titanium and painted a matte black.\n"
			+ "the motor makes a low whirr when you turn it on.";
	int damage = 10;
	int worth = 300;
}
