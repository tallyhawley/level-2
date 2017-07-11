package boomboom;

import java.io.IOException;

public class Runner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Game game = new Game();
		while(4<5){
			if(Game.cont){
				Player.timeOut = false;
				Player.dinoTOut = false;
				Player.gameOver = false;
				Game.cont = false;
				game = new Game();
			}else{
				System.exit(0);
			}
		}
	}
}
