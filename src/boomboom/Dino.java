package boomboom;

public class Dino {
	static String dinoAct;
	static int dinoLine;
	
	static private void defaultMoves(Player player){
		System.out.println("\nt: talk\ni: use an item\nc: check the time on the bomb");
		dinoAct = Game.scan.nextLine();
		player.subtractMoves();
		player.setTime();
	}
	
	static private void checkTime(Player player){
		System.out.println("\nthe clock reads " + Player.bombTime + ".");
		player.subtractMoves();
		player.setTime();
	}
	
	static private void defaultChoice(Player player){
		System.out.println("that's not an option right now. be more careful -\n"
				+ "you're losing time.");
		player.subtractMoves();
		player.setTime();
	}
	
	static void dinoChallenge(Player player){
		while(!Player.gameOver){
		System.out.println("\nt: talk\ni: use an item\nc: check the time on the bomb");
		dinoAct = Game.scan.nextLine();
		switch(dinoAct){
		case "t":
		//TODO PATH 1	
				System.out.println("\n\"what are you doing, kid?\" you ask, voice soft.\n"
						+ "he looks at you, expression turning almost sad. \"get out of here,\" he says,\n"
						+ "quieter.");
				defaultMoves(player);
				while(!Player.gameOver){
					switch(dinoAct){
						case "t": 
							//TODO PATH TALK-TALK
							System.out.println("1: \"i'm not leaving until you disable that.\"\n"
											+ "2: \"i'm just here to help.\"\n"
											+ "3: \"don't do this.\"");
							dinoLine = Game.scan.nextInt();
							if(dinoLine == 1){
								//TODO PATH TALK-TALK-1
								System.out.println("\"i'm not leaving until you disable that,\" you say.\n"
										+ "the kids smiles the empty smile of a man sentenced to death.\n"
										+ "\"if you don't leave now, you won't have a chance to leave\n"
										+ "later,\" he says, cryptic.");
								defaultMoves(player);
								while(!Player.gameOver){
									switch(dinoAct){
										case "t":
										//TODO PATH TALK-TALK-1-TALK
											
										case "i": 
										//TODO PATH TALK-TALK-1-ITEM
											
											Action.printInv(player);
											int i;
											if(player.inventory.isEmpty()){
												System.out.println("\nyour inventory is empty.");
												break;
											}
												for(i = 0;i<player.inventory.size();i++){
												System.out.println((i+1) + ": "+ player.inventory.get(i).name);
											}
											dinoAct = Game.scan.nextLine();
											player.existsIn(player.inventory);
											if(!Action.exists){
												System.out.println("that's not an option right now. be more careful -\nyou're losing time.");
											}
											else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.radio)){
												System.out.println("you pull the radio out of your pocket and lower it to the floor behind you,\n"
														+ "sliding the cord delicately between your fingers. it makes a little\n"
														+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
														+ "eyes narrowing in suspicion.\n"
														+ "\"who else knows i'm here?\" he asks, wary.");
												defaultMoves(player);
												while(!Player.gameOver){
													switch(dinoAct){
														case "t":
														case "i":
														case "c": checkTime(player); break;
														default: defaultChoice(player); break;
													}
												}
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.drone)){
							 					
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.diagram)){
							 					
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.bracelet)){
							 					
							 				}
											break;
										case "c": checkTime(player); break;
										default: defaultChoice(player); break;
									}
								}
							}
							//TODO PATH TALK-TALK-2
							else if(dinoLine == 2){
								
							}
						break;
						//TODO PATH 1-2
						case "i":
							Action.printInv(player);
							int i;
							if(player.inventory.isEmpty()){
								System.out.println("\nyour inventory is empty.");
								break;
							}
								for(i = 0;i<player.inventory.size();i++){
								System.out.println((i+1) + ": "+ player.inventory.get(i).name);
							}
							dinoAct = Game.scan.nextLine();
							player.existsIn(player.inventory);
							if(!Action.exists){
								System.out.println("that's not an option right now. be more careful -\nyou're losing time.");
							}
							else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.radio)){
								System.out.println("you pull the radio out of your pocket and lower it to the floor behind you,\n"
										+ "sliding the cord delicately between your fingers. it makes a little\n"
										+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
										+ "eyes narrowing in suspicion.\n"
										+ "\"who else knows i'm here?\" he asks, wary.");
								defaultMoves(player);
								while(!Player.gameOver){
									switch(dinoAct){
										case "t":
										case "i":
										case "c": checkTime(player); break;
										default: defaultChoice(player); break;
									}
								}
			 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.drone)){
			 					
			 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.diagram)){
			 					
			 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.bracelet)){
			 					
			 				}
							break;
						//TODO CLOCK && DEFAULT
						case "c": checkTime(player); break;
						default: defaultChoice(player); break;
					}
				}
				break;
			//TODO PATH 2
			case "i":
				Action.printInv(player);
				int i;
				if(player.inventory.isEmpty()){
					System.out.println("\nyour inventory is empty.");
					break;
				}
					for(i = 0;i<player.inventory.size();i++){
					System.out.println((i+1) + ": "+ player.inventory.get(i).name);
				}
				dinoAct = Game.scan.nextLine();
				player.existsIn(player.inventory);
				if(!Action.exists){
					System.out.println("that's not an option right now. be more careful -\nyou're losing time.");
				}
				else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.radio)){
					System.out.println("you pull the radio out of your pocket and lower it to the floor behind you,\n"
							+ "sliding the cord delicately between your fingers. it makes a little\n"
							+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
							+ "eyes narrowing in suspicion.\n"
							+ "\"who else knows i'm here?\" he asks, wary.");
					defaultMoves(player);
					while(!Player.gameOver){
						switch(dinoAct){
							case "t":
							case "i":
							case "c": checkTime(player); break;
							default: defaultChoice(player); break;
						}
					}
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.drone)){
 					
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.diagram)){
 					
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.bracelet)){
 					
 				}
				break;
			//TODO CLOCK && DEFAULT
			case "c": checkTime(player); break;
			default: defaultChoice(player); break; 
		}
		}
	}
}
