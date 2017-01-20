package boomboom;

public class NPCRoom extends Room{
		int x;
		int y;
		int dir;
		String desc;
		boolean hosh = false;
		
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
