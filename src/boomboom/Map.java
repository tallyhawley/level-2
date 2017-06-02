package boomboom;

public class Map {
	Room[][] map = new Room[10][10];

	public Map() {
		map[Game.coups.x][Game.coups.y] = Game.coups;
		map[Game.dino.x][Game.dino.y] = Game.dino;
		map[Game.dinohall.x][Game.dinohall.y] = Game.dinohall;
		map[Game.dinoturn.x][Game.dinoturn.y] = Game.dinoturn;
		map[Game.directory.x][Game.directory.y] = Game.directory;
		map[Game.dk.x][Game.dk.y] = Game.dk;
		map[Game.dkend.x][Game.dkend.y] = Game.dkend;
		map[Game.dkhall.x][Game.dkhall.y] = Game.dkhall;
		map[Game.eend.x][Game.eend.y] = Game.eend;
		map[Game.ehall.x][Game.ehall.y] = Game.ehall;
		map[Game.elevator.x][Game.elevator.y] = Game.elevator;
		map[Game.kwan.x][Game.kwan.y] = Game.kwan;
		map[Game.tokwan.x][Game.tokwan.y] = Game.tokwan;
		map[Game.kwanhall.x][Game.kwanhall.y] = Game.kwanhall;
		map[Game.lasend.x][Game.lasend.y] = Game.lasend;
		map[Game.lasers.x][Game.lasers.y] = Game.lasers;
		map[Game.nhall.x][Game.nhall.y] = Game.nhall;
		map[Game.send.x][Game.send.y] = Game.send;
		map[Game.shall.x][Game.shall.y] = Game.shall;
		map[Game.startrm.x][Game.startrm.y] = Game.startrm;
		map[Game.the8.x][Game.the8.y] = Game.the8;
		map[Game.tocoups.x][Game.tocoups.y] = Game.tocoups;
		map[Game.todino.x][Game.todino.y] = Game.todino;
		map[Game.todinohall.x][Game.todinohall.y] = Game.todinohall;
		map[Game.todk.x][Game.todk.y] = Game.todk;
		map[Game.todkhall.x][Game.todkhall.y] = Game.todkhall;
		map[Game.tokwan.x][Game.tokwan.y] = Game.tokwan;
		map[Game.towoozi.x][Game.towoozi.y] = Game.towoozi;
		map[Game.turnlas.x][Game.turnlas.y] = Game.turnlas;
		map[Game.woozi.x][Game.woozi.y] = Game.woozi;
		map[4][5] = Game.ehall;
		map[6][5] = Game.ehall;
		map[8][5] = Game.ehall;
		map[1][8] = Game.shall;
		map[4][1] = Game.kwanhall;
		map[5][1] = Game.kwanhall;
		map[6][1] = Game.kwanhall;
	}
}
