package boomboom;

public class Item {
	String name;
	String desc;
	int worth;
	
	public void printDesc(){
		System.out.println("item: "+this.name+"\n"
				+ "description: "+this.desc+"\n"
						+ "worth: $"+this.worth);
	}
}