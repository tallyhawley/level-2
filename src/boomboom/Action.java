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
			player.x--;
		}
		
		static void moveSouth(Player player){
			player.y++;
		}
		
		static void talk(Room room){
			if(room==Game.coups){
				System.out.println("s. coups leans forward, elbows resting on the surface of his desk. he looks\n"
						+ "worried");
			}
		}
		
}
