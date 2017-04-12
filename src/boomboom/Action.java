package boomboom;

public class Action {
		String hotkey;
		String name;
		
		public Action(String name, String hotkey){
			this.hotkey = hotkey;
			this.name = name;
		}
		
		static void moveNorth(Player player){
			player.y--;
		}
		
		static void moveEast(Player player){
			player.x++;
		}
		
		static void moveWest(Player player){
			player.y++;
		}
		
		static void moveSouth(Player player){
			player.x--;
		}
		
		static void talk(NPCRoom room){
			room.hosh = true;
		}
		
}
