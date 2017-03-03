package boomboom;

public class NPCRoom extends Room{
	
	int x;
	int y;
	int dir;
	String desc;
	boolean hosh = false;
	
	public NPCRoom(int x, int y, String desc, int dir) {
		super(x, y, desc, dir);
	}

	void sayLine(String line){
		System.out.println(line);
	}
	
	void startTalking(){
		this.hosh = true;
	}
		
	void update(Player player){
		if(this.hosh==true){
			player.actions.clear();
		}
		else{
			
		}
	}
}
