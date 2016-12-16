package boomboom;

public class Weapon extends Item{
	String name;
	String desc;
	int worth;
	int damage;
	
	public void printDesc(){
		System.out.println("Item: "+this.name+"\n"
				+ "Description: "+this.desc+"\n"
				+ "Damage: "+this.damage
				+ "Worth: $"+this.worth);
	}
}
