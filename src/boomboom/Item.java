package boomboom;

public class Item {
	String name;
	String desc;
	int worth;
	
	public void printDesc(){
		System.out.println("Item: "+this.name+"\n"
				+ "Description: "+this.desc+"\n"
						+ "Worth: $"+this.worth);
	}
}