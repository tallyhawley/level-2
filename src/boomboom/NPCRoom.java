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



	void startTalking(){
		this.hosh = true;
	}
		
	void update(){
		if(this.hosh==true){
			this.dir = 0;
		}
		else{
			// TODO
			this.dir = 12;
		}
	}
}
