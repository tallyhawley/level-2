package boomboom;

public class Runner {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Game game = new Game();
		while(4<5){
			if(Game.cont){
				game = new Game();
			}
		}
	}
	
}
