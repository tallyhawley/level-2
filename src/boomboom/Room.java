package boomboom;

public class Room {
		int x;
		int y;
		String desc;
		int dir;
		boolean npc;
		
		public Room(int x,int y,String desc,int dir, boolean npc){
			this.x = x;
			this.y = y;
			this.desc = desc;
			this.dir = dir;
			this.npc = npc;
		}
}
