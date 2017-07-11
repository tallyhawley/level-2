package boomboom;

import java.util.InputMismatchException;

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
	}
	
	static private void defaultChoice(Player player){
		System.out.println("that's not an option right now. be more careful -\n"
				+ "you're losing time.");
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
				while(!Player.gameOver){
					defaultMoves(player);
					switch(dinoAct){
						case "t": 
							//TODO PATH TALK-TALK
							System.out.println("1: \"i'm not leaving until you disable that.\"\n"
											+ "2: \"i'm just here to help.\"\n");
							try{
							dinoLine = Game.scan.nextInt();
							}catch(InputMismatchException e){
								System.out.println("that's not an option. be careful - you're running out of time.");
								break;
							}
							if(dinoLine == 1){
								//TODO PATH TALK-TALK-1
								System.out.println("\"i'm not leaving until you disable that,\" you say.\n"
										+ "the kid smiles the empty smile of a man sentenced to death.\n"
										+ "\"if you don't leave now, you won't have a chance to leave\n"
										+ "later,\" he says, cryptic.");
								while(!Player.gameOver){
									defaultMoves(player);
									switch(dinoAct){
										case "t":
										//TODO PATH TALK-TALK-1-TALK
											System.out.println("1: \"is that a threat?\"\n"
													+ "2: \"what do you mean?\"");
											try{
												dinoLine = Game.scan.nextInt();
											}catch(InputMismatchException e){
												System.out.println("that's not an option. be careful - you're running out of time."); break;
											}
											if(dinoLine == 1){
												//TODO PATH TALK-TALK-1-TALK-1
												System.out.println("you take a step toward him.\n"
														+ "\"is that a threat?\" you ask. your voice is low.\n"
														+ "the kid laughs. he reaches into his pocket and pulls out a little remote.\n"
														+ "\"it could be!\"\n"
														+ "you take another step.\"don't do this.\"\n"
														+ "his finger hovers right over the big button in the middle.\n"
														+ "\"who are you to stop me?\" he says, right before he presses down\n"
														+ "and you two are no more.\n"
														+ "you never even learned his name.");
												Player.gameOver = true; Player.gameWon = false;
											}else if(dinoLine == 2){
												//TODO PATH TALK-TALK-1-TALK-2
											}else{
												System.out.println("that's not an option. be careful - you're running out of time.");
											}
										case "i": 
										//TODO PATH TALK-TALK-1-ITEM
											
											Action.printInv(player);
											if(player.inventory.isEmpty()){
												System.out.println("\nyour inventory is empty.");
												break;
											}
												for(int i = 0;i<player.inventory.size();i++){
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
							else if(dinoLine == 2){
							//TODO PATH TALK-TALK-2	
								System.out.println("\"i'm just here to help,\" you say gently.\n"
										+ "\"i don't need help,\" he spits. \"just leave.\"\n"
										+ "venom laces his words. perhaps it's spite at your request to help.\n"
										+ "you don't know.");
								defaultMoves(player);
							}
							else{
								System.out.println("that's not an option. be careful - you're running out of time.");
								break;
							}
						break;
						case "i":
						//TODO PATH TALK-ITEM
							Action.printInv(player);
							if(player.inventory.isEmpty()){
								System.out.println("\nyour inventory is empty.");
								break;
							}
								for(int i = 0;i<player.inventory.size();i++){
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
								while(!Player.gameOver){
									defaultMoves(player);
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
				break;
			case "i":
			//TODO PATH ITEM
				Action.printInv(player);
				if(player.inventory.isEmpty()){
					System.out.println("\nyour inventory is empty.");
					break;
				}
					for(int i = 0;i<player.inventory.size();i++){
					System.out.println((i+1) + ": "+ player.inventory.get(i).name);
				}
				dinoAct = Game.scan.nextLine();
				player.existsIn(player.inventory);
				if(!Action.exists){
					System.out.println("that's not an option right now. be more careful -\nyou're losing time.");
				}
				else if(player.inventory.get(Integer.parseInt(dinoAct)).equals(Player.radio)){
				//TODO PATH ITEM-RADIO
					System.out.println("you pull the radio out of your pocket and lower it to the floor behind you,\n"
							+ "sliding the cord delicately between your fingers. it makes a little\n"
							+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
							+ "eyes narrowing in suspicion.\n"
							+ "\"who else knows i'm here?\" he asks, wary.");
					defaultMoves(player);
					while(!Player.gameOver){
						switch(dinoAct){
							case "t":
							//TODO PATH ITEM-RADIO-TALK
							case "i":
							//TODO PATH ITEM-RADIO-ITEM
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
}
