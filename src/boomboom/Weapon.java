package boomboom;

public class Weapon extends Item{
	int damage;
	
	public Weapon(String name, String desc, int worth, int damage){
		super(name,desc,worth);
		this.damage = damage;
	}
	
	public void printDesc(){
		System.out.println("item: "+this.name+"\n"
				+ "description: "+this.desc+"\n"
				+ "damage: "+this.damage+"\n"
				+ "worth: $"+this.worth);
	}
}
