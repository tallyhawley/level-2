package boomboom;

public class Action {
		String hotkey;
		String name;
		
		public Action(String name, String hotkey){
			this.hotkey = hotkey;
			this.name = name;
		}
		
		void moveNorth(Player player){
			player.y--;
		}
		
		void moveEast(Player player){
			player.x++;
		}
		
		void moveWest(Player player){
			player.y++;
		}
		
		void moveSouth(Player player){
			player.x--;
		}
		
		void talk(NPCRoom room){
			room.hosh = true;
		}
		
}
