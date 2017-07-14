package boomboom;

public class Dino {
	static String dinoAct;
	
	static private void defaultMoves(Player player){
		System.out.println("\nt: talk\ni: use an item\nc: check the time on the bomb");
		dinoAct = Game.scan.nextLine();
		player.subtractMoves();
		player.setTime();
	}
	
	static private void checkTime(Player player){
		System.out.println("\nthe clock reads " + Game.player.bombTime + ".");
	}
	
	static private void defaultChoice(Player player){
		System.out.println("\nthat's not an option right now. be more careful -\n"
				+ "you're losing time.");
	}
	
	static void dinoChallenge(Player player){
		while(!Player.gameOver){
		System.out.println("\nt: talk\ni: use an item\nc: check the time on the bomb");
		dinoAct = Game.scan.nextLine();
		switch(dinoAct){
		case "t":
		//TODO PATH TALK	
				System.out.println("\n\"what are you doing, kid?\" you ask, voice soft.\n"
						+ "he looks at you, expression turning almost sad. \"get out of here,\" he says,\n"
						+ "quieter.");
				while(!Player.gameOver){
					defaultMoves(player);
					switch(dinoAct){
						case "t": 
							//TODO PATH TALK-TALK
							while(!Player.gameOver){
							System.out.println("\nwhat will you say?\n1: \"i'm not leaving until you disable that.\"\n"
											+ "2: \"i'm just here to help.\"");
							dinoAct = Game.scan.nextLine();
							if(dinoAct.equals("1")){
								//TODO PATH TALK-TALK-1
								System.out.println("\n\"i'm not leaving until you disable that,\" you say.\n"
										+ "the kid smiles the empty smile of a man sentenced to death.\n"
										+ "\"if you don't leave now, you won't have a chance to leave\n"
										+ "later,\" he says, cryptic.");
								while(!Player.gameOver){
									defaultMoves(player);
									switch(dinoAct){
										case "t":
											//TODO PATH TALK-TALK-1-TALK
											while(!Player.gameOver){
											System.out.println("\nwhat will you say?\n1: \"is that a threat?\"\n"
													+ "2: \"what do you mean?\"");
											dinoAct = Game.scan.nextLine();
											if(dinoAct.equals("1")){
												//TODO PATH TALK-TALK-1-TALK-1
												System.out.println("\nyou take a step toward him.\n"
														+ "\"is that a threat?\" you ask. your voice is low.\n"
														+ "the kid laughs. he reaches into his pocket and pulls out a little remote.\n"
														+ "\"it could be!\"\n"
														+ "you take another step.\"don't do this.\"\n"
														+ "his finger hovers right over the big button in the middle.\n"
														+ "\"who are you to stop me?\" he says, right before he presses down\n"
														+ "and you two are no more.\n"
														+ "you never even learned his name.");
												Player.gameOver = true; Player.gameWon = false;
											}else if(dinoAct.equals("2")){
												//TODO PATH TALK-TALK-1-TALK-2
												System.out.println("\n\"what do you mean by that?\" you ask, careful.\n"
														+ "he laughs, loud and unsettling.\n"
														+ "\"it means i could push a little button...\" he pauses.\n"
														+ "\"and you, i, and the rest of the lovely people in this building\n"
														+ "would go bye-bye.\"\n"
														+ "his face contorts into something mimicking sadness. \"and we wouldn't\n"
														+ "want that, would we?\"");
												while(!Player.gameOver){
													defaultMoves(player);
													switch(dinoAct){
													case "t":
														//TODO PATH TALK-TALK-1-TALK-2-TALK
														System.out.println("\n"
																+ "\"what did they do to you?\" you ask, soft.\n"
																+ "\"the kid smiles again but it's weak, eyes welling up with tears.\n"
																+ "\"they -\" he points toward the door and, presumably, the people\n"
																+ "beyond it. \"- didn't do anything. we were friends.\n"
																+ "\"it was the goddamn company! i poured my heart, my soul into this\n"
																+ "job, and they cast me away like nothing!\" at this point, he's really\n"
																+ "crying, tears rolling down his cheeks as he wipes at them futilely.\n"
																+ "\"they ruined my life and you can bet your ass i'm going to -\"\n"
																+ "he sobs. \"- i'm going to ruin theirs too! they can't just...\n"
																+ "they can't just call me in after four years of nothing but good work\n"
																+ "and results and say 'oh, dino, by the way - you're fired!'\n"
																+ "it doesn't fucking work that way, pledis!\"\n"
																+ "\"uh-\" you start, when dino pulls a remote from his pocket, thumb\n"
																+ "shaking over the big button in the middle.\n"
																+ "\"wait!\" you yell, and he pauses.");
														while(!Player.gameOver){
															defaultMoves(player);
															switch(dinoAct){
															case "t":
																System.out.println("\n"
																		+ "\"do you really want to do this?\" you ask. \"are you completely sure?\"\n"
																		+ "dino sniffles. \"no...\" he whispers.\n"
																		+ "\"don't all the innocent people here deserve better than that?\" you ask.\n"
																		+ "\"yes...\" he says. he hangs his head. \"i'm sorry...\" he mumbles.\n"
																		+ "he picks at the back of the remote with his nail, prying the cover off.\n"
																		+ "he flips a little switch and the clock stops.\n"
																		+ "\"tell them i'm sorry, will you?\" dino asks. at your nod, he leaves, slipping\n"
																		+ "quietly through a trapdoor in the floor.");
																Player.gameOver = true; Player.gameWon = true;
															case "i":
																Action.printInv(player);
																if(player.inventory.isEmpty()){
																	System.out.println("\nyour inventory is empty.");
																	break;
																}
																System.out.println("\npick an item");
																for(int i = 0;i<player.inventory.size();i++){
																	System.out.println((i+1) + ": "+ player.inventory.get(i).name);
																}
																dinoAct = Game.scan.nextLine();
																player.existsIn(player.inventory);
																if(!Action.exists){
																	System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
																}
																else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
																	System.out.println("\n"
																			+ "the radio beeps once, twice, three times. dino looks up.\n"
																			+ "\"who knows i'm here?\" he asks. he is strangely calm.\n"
																			+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																			+ "dino laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																			+ "say to that: woozi, come and get me yourself!\"\n"
																			+ "dino laughs one last, manic laugh before pushing the button.");
																	player.inventory.remove(Player.radio);
																	Player.gameOver = true; Player.gameWon = false;
												 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
												 					System.out.println("\n"
												 							+ "the drone whirs to life in your hand. it flies up over your head, and dino takes\n"
												 							+ "hardly one glance at it before he presses the button and everyone and everything\n"
												 							+ "goes bye-bye as promised.");
												 					player.inventory.remove(Player.drone);
												 					Player.gameOver = true; Player.gameWon = false;
												 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
												 					System.out.println("\n"
												 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
												 							+ "\"forget your lines?\" dino asks. you sputter."
												 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
												 							+ "it.\"\n"
												 							+ "click. boom. bye-bye!");
												 					player.inventory.remove(Player.diagram);
												 					Player.gameOver = true; Player.gameWon = false;
												 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
												 					System.out.println("\n"
												 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
												 							+ "your skin, and dino looks up at it.\n"
												 							+ "\"is that...\" he sniffles. \"is that seungkwan's?\"\n"
												 							+ "you nod nervously. no point in lying to him.\n"
												 							+ "dino backs up to the wall and slides down, resting his forehead on his knees.\n"
												 							+ "he's crying again.\n"
												 							+ "\"what am i doing?\" he whispers. \"they don't deserve this.\"\n"
												 							+ "he looks down at the remote in his hand. he opens the back cover with his nail and\n"
												 							+ "flips a little switch. the beeping stops.\n"
												 							+ "you glance over, and the clock has stopped at " + player.bombTime + ".");
												 					Player.gameOver = true; Player.gameWon = true;
												 				}
																break;
															case "c": checkTime(player); break;
															default: defaultChoice(player); break;
															}
														}
														break;
													case "i":
														Action.printInv(player);
														if(player.inventory.isEmpty()){
															System.out.println("\nyour inventory is empty.");
															break;
														}
														System.out.println("\npick an item");
														for(int i = 0;i<player.inventory.size();i++){
															System.out.println((i+1) + ": "+ player.inventory.get(i).name);
														}
														dinoAct = Game.scan.nextLine();
														player.existsIn(player.inventory);
														if(!Action.exists){
															System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
														}
														else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
															System.out.println("\n"
																	+ "the radio beeps once, twice, three times. the kid looks up.\n"
																	+ "\"who knows i'm here?\" he asks. he is strangely calm, fiddling with a little\n"
																	+ "remote, thumb ghosting over the button in the middle.\n"
																	+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																	+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																	+ "say to that: woozi, come and get me yourself!\"\n"
																	+ "he laughs one last, manic laugh before pushing the button.");
															player.inventory.remove(Player.radio);
															Player.gameOver = true; Player.gameWon = false;
										 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
										 					System.out.println("\n"
										 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
										 							+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
										 							+ "button and everyone and everything goes bye-bye as promised.");
										 					player.inventory.remove(Player.drone);
										 					Player.gameOver = true; Player.gameWon = false;
										 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
										 					System.out.println("\n"
										 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
										 							+ "\"forget your lines?\" the kid asks. you sputter."
										 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
										 							+ "it.\"\n"
										 							+ "click. boom. bye-bye, " + player.name + "!");
										 					player.inventory.remove(Player.diagram);
										 					Player.gameOver = true; Player.gameWon = false;
										 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
										 					System.out.println("\n"
										 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
												 					+ "your skin, and dino looks up at it.\n"
												 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
												 					+ "you nod nervously. no point in lying to him.\n"
												 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
												 					+ "he presses the button.\n"
												 					+ "you never even learned his name.");
										 					player.inventory.remove(Player.bracelet);
										 					Player.gameOver = true; Player.gameWon = false;
										 				}
														break;
													case "c": checkTime(player); break;
													default: defaultChoice(player); break;
													}
												}
											}else{
												System.out.println("\nthat's not an option. be careful - you're running out of time.");
												break;
											}
											}
											break;
										case "i": 
										//TODO PATH TALK-TALK-1-ITEM
											Action.printInv(player);
											if(player.inventory.isEmpty()){
												System.out.println("\nyour inventory is empty.");
												break;
											}
											System.out.println("\npick an item");
											for(int i = 0;i<player.inventory.size();i++){
												System.out.println((i+1) + ": "+ player.inventory.get(i).name);
											}
											dinoAct = Game.scan.nextLine();
											player.existsIn(player.inventory);
											if(!Action.exists){
												System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
											}
											else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
												System.out.println("\n"
														+ "the radio beeps once, twice, three times. the kid looks up.\n"
														+ "\"who knows i'm here?\" he asks. he is strangely calm, fiddling with a little\n"
														+ "remote, thumb ghosting over the button in the middle.\n"
														+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
														+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
														+ "say to that: woozi, come and get me yourself!\"\n"
														+ "he laughs one last, manic laugh before pushing the button. boom, boom.");
												player.inventory.remove(Player.radio);
												Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
							 					System.out.println("\n"
							 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
							 							+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
							 							+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
							 							+ "the building.");
							 					player.inventory.remove(Player.drone);
							 					Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
							 					System.out.println("\n"
							 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
							 							+ "\"forget your lines?\" the kid asks. you sputter."
							 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
							 							+ "it.\"\n"
							 							+ "click. boom. bye-bye, " + player.name + "!");
							 					player.inventory.remove(Player.diagram);
							 					Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
							 					System.out.println("\n"
							 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
									 					+ "your skin, and dino looks up at it.\n"
									 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
									 					+ "you nod nervously. no point in lying to him.\n"
									 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
									 					+ "he presses the button. boom, boom. you're gone.\n"
									 					+ "you never even learned his name.");
							 					player.inventory.remove(Player.bracelet);
							 					Player.gameOver = true; Player.gameWon = false;
							 				}
											break;
										case "c": checkTime(player); break;
										default: defaultChoice(player); break;
									}
								}
							}
							else if(dinoAct.equals("2")){
							//TODO PATH TALK-TALK-2	
								System.out.println("\n\"i'm just here to help,\" you say gently.\n"
										+ "\"i don't need help,\" he spits. \"just leave.\"\n"
										+ "venom laces his words. perhaps it's spite at your request to help.\n"
										+ "you don't know.");
								defaultMoves(player);
							}
							else{
								System.out.println("\nthat's not an option. be careful - you're running out of time.");
								break;
							}
						}
						break;
						case "i":
						//TODO PATH TALK-ITEM
							Action.printInv(player);
							if(player.inventory.isEmpty()){
								System.out.println("\nyour inventory is empty.");
								break;
							}
							System.out.println("\npick an item");
							for(int i = 0;i<player.inventory.size();i++){
								System.out.println((i+1) + ": "+ player.inventory.get(i).name);
							}
							dinoAct = Game.scan.nextLine();
							player.existsIn(player.inventory);
							if(!Action.exists){
								System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
							}
							else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
								System.out.println("\nyou pull the radio out of your pocket and lower it to the floor behind you,\n"
										+ "sliding the cord delicately between your fingers. it makes a little\n"
										+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
										+ "eyes narrowing in suspicion.\n"
										+ "\"who else knows i'm here?\" he asks, wary. he is strangely calm, fiddling with a little\n"
										+ "remote, thumb ghosting over the button in the middle.\n"
										+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
										+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
										+ "say to that: woozi, come and get me yourself!\"\n"
										+ "he laughs one last, manic laugh before pushing the button.");
								player.inventory.remove(Player.radio);
								Player.gameOver = true; Player.gameWon = false;
			 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
			 					player.inventory.remove(Player.drone);
			 					System.out.println("\n"
			 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
							 			+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
							 			+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
							 			+ "the building.");
			 					Player.gameOver = true; Player.gameWon = false;
			 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
			 					System.out.println("\n"
			 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
			 							+ "\"forget your lines?\" the kid asks. you sputter."
			 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
			 							+ "it.\"\n"
			 							+ "click. boom. bye-bye, " + player.name + "!");
			 					player.inventory.remove(Player.diagram);
			 					Player.gameOver = true; Player.gameWon = false;
			 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
			 					System.out.println("\n"
			 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
					 					+ "your skin, and dino looks up at it.\n"
					 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
					 					+ "you nod nervously. no point in lying to him.\n"
					 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
					 					+ "he presses the button. boom, boom. you're gone.\n"
					 					+ "you never even learned his name.");
			 					player.inventory.remove(Player.bracelet);
			 					Player.gameOver = true; Player.gameWon = false;
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
				System.out.println("\npick an item");
				for(int i = 0;i<player.inventory.size();i++){
					System.out.println((i+1) + ": "+ player.inventory.get(i).name);
				}
				dinoAct = Game.scan.nextLine();
				player.existsIn(player.inventory);
				if(!Action.exists){
					System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
				}
				else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
				//TODO PATH ITEM-RADIO
					System.out.println("\nyou pull the radio out of your pocket and lower it to the floor behind you,\n"
							+ "sliding the cord delicately between your fingers. it makes a little\n"
							+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
							+ "eyes narrowing in suspicion.\n"
							+ "\"who else knows i'm here?\" he asks, wary.");
					player.inventory.remove(Player.radio);
					while(!Player.gameOver){
						defaultMoves(player);
						switch(dinoAct){
							case "t":
							//TODO PATH ITEM-RADIO-TALK
								System.out.println("\n\"what are you doing, kid?\" you ask, voice soft.\n"
										+ "he looks at you, expression turning almost sad. \"get out of here,\" he says,\n"
										+ "quieter.");
								while(!Player.gameOver){
									defaultMoves(player);
									switch(dinoAct){
										case "t": 
											//TODO PATH ITEM-RADIO-TALK-TALK
											while(!Player.gameOver){
											System.out.println("\nwhat will you say?\n1: \"i'm not leaving until you disable that.\"\n"
															+ "2: \"i'm just here to help.\"");
											dinoAct = Game.scan.nextLine();
											if(dinoAct.equals("1")){
												//TODO PATH ITEM-RADIO-TALK-TALK-1
												System.out.println("\n\"i'm not leaving until you disable that,\" you say.\n"
														+ "the kid smiles the empty smile of a man sentenced to death.\n"
														+ "\"if you don't leave now, you won't have a chance to leave\n"
														+ "later,\" he says, cryptic.");
												while(!Player.gameOver){
													defaultMoves(player);
													switch(dinoAct){
														case "t":
															//TODO PATH ITEM-RADIO-TALK-TALK-1-TALK
															while(!Player.gameOver){
															System.out.println("\nwhat will you say?\n1: \"is that a threat?\"\n"
																	+ "2: \"what do you mean?\"");
															dinoAct = Game.scan.nextLine();
															if(dinoAct.equals("1")){
																//TODO PATH ITEM-RADIO-TALK-TALK-1-TALK-1
																System.out.println("\nyou take a step toward him.\n"
																		+ "\"is that a threat?\" you ask. your voice is low.\n"
																		+ "the kid laughs. he reaches into his pocket and pulls out a little remote.\n"
																		+ "\"it could be!\"\n"
																		+ "you take another step.\"don't do this.\"\n"
																		+ "his finger hovers right over the big button in the middle.\n"
																		+ "\"who are you to stop me?\" he says, right before he presses down\n"
																		+ "and you two are no more.\n"
																		+ "you never even learned his name.");
																Player.gameOver = true; Player.gameWon = false;
															}else if(dinoAct.equals("2")){
																//TODO PATH ITEM-RADIO-TALK-TALK-1-TALK-2
																System.out.println("\n\"what do you mean by that?\" you ask, careful.\n"
																		+ "he laughs, loud and unsettling.\n"
																		+ "\"it means i could push a little button...\" he pauses.\n"
																		+ "\"and you, i, and the rest of the lovely people in this building\n"
																		+ "would go bye-bye.\"\n"
																		+ "his face contorts into something mimicking sadness. \"and we wouldn't\n"
																		+ "want that, would we?\"");
																while(!Player.gameOver){
																	defaultMoves(player);
																	switch(dinoAct){
																	case "t":
																		//TODO PATH TALK-TALK-1-TALK-2-TALK
																		System.out.println("\n"
																				+ "\"what did they do to you?\" you ask, soft.\n"
																				+ "\"the kid smiles again but it's weak, eyes welling up with tears.\n"
																				+ "\"they -\" he points toward the door and, presumably, the people\n"
																				+ "beyond it. \"- didn't do anything. we were friends.\n"
																				+ "\"it was the goddamn company! i poured my heart, my soul into this\n"
																				+ "job, and they cast me away like nothing!\" at this point, he's really\n"
																				+ "crying, tears rolling down his cheeks as he wipes at them futilely.\n"
																				+ "\"they ruined my life and you can bet your ass i'm going to -\"\n"
																				+ "he sobs. \"- i'm going to ruin theirs too! they can't just...\n"
																				+ "they can't just call me in after four years of nothing but good work\n"
																				+ "and results and say 'oh, dino, by the way - you're fired!'\n"
																				+ "it doesn't fucking work that way, pledis!\"\n"
																				+ "\"uh-\" you start, when dino pulls a remote from his pocket, thumb\n"
																				+ "shaking over the big button in the middle.\n"
																				+ "\"wait!\" you yell, and he pauses.");
																		while(!Player.gameOver){
																			defaultMoves(player);
																			switch(dinoAct){
																			case "t":
																				System.out.println("\n"
																						+ "\"do you really want to do this?\" you ask. \"are you completely sure?\"\n"
																						+ "dino sniffles. \"no...\" he whispers.\n"
																						+ "\"don't all the innocent people here deserve better than that?\" you ask.\n"
																						+ "\"yes...\" he says. he hangs his head. \"i'm sorry...\" he mumbles.\n"
																						+ "he picks at the back of the remote with his nail, prying the cover off.\n"
																						+ "he flips a little switch and the clock stops.\n"
																						+ "\"tell them i'm sorry, will you?\" dino asks. at your nod, he leaves, slipping\n"
																						+ "quietly through a trapdoor in the floor.");
																				Player.gameOver = true; Player.gameWon = true;
																			case "i":
																				Action.printInv(player);
																				if(player.inventory.isEmpty()){
																					System.out.println("\nyour inventory is empty.");
																					break;
																				}
																				System.out.println("\npick an item");
																				for(int i = 0;i<player.inventory.size();i++){
																					System.out.println((i+1) + ": "+ player.inventory.get(i).name);
																				}
																				dinoAct = Game.scan.nextLine();
																				player.existsIn(player.inventory);
																				if(!Action.exists){
																					System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
																				}
																				else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
																					System.out.println("\n"
																							+ "the radio beeps once, twice, three times. dino looks up.\n"
																							+ "\"who knows i'm here?\" he asks. he is strangely calm.\n"
																							+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																							+ "dino laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																							+ "say to that: woozi, come and get me yourself!\"\n"
																							+ "dino laughs one last, manic laugh before pushing the button.");
																					player.inventory.remove(Player.radio);
																					Player.gameOver = true; Player.gameWon = false;
																 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
																 					System.out.println("\n"
																 							+ "the drone whirs to life in your hand. it flies up over your head, and dino takes\n"
																 							+ "hardly one glance at it before he presses the button and everyone and everything\n"
																 							+ "goes bye-bye as promised.");
																 					player.inventory.remove(Player.drone);
																 					Player.gameOver = true; Player.gameWon = false;
																 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
																 					System.out.println("\n"
																 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
																 							+ "\"forget your lines?\" dino asks. you sputter."
																 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
																 							+ "it.\"\n"
																 							+ "click. boom. bye-bye!");
																 					player.inventory.remove(Player.diagram);
																 					Player.gameOver = true; Player.gameWon = false;
																 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
																 					System.out.println("\n"
																 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
																 							+ "your skin, and dino looks up at it.\n"
																 							+ "\"is that...\" he sniffles. \"is that seungkwan's?\"\n"
																 							+ "you nod nervously. no point in lying to him.\n"
																 							+ "dino backs up to the wall and slides down, resting his forehead on his knees.\n"
																 							+ "he's crying again.\n"
																 							+ "\"what am i doing?\" he whispers. \"they don't deserve this.\"\n"
																 							+ "he looks down at the remote in his hand. he opens the back cover with his nail and\n"
																 							+ "flips a little switch. the beeping stops.\n"
																 							+ "you glance over, and the clock has stopped at " + player.bombTime + ".");
																 					Player.gameOver = true; Player.gameWon = true;
																 				}
																				break;
																			case "c": checkTime(player); break;
																			default: defaultChoice(player); break;
																			}
																		}
																		break;
																	case "i":
																		Action.printInv(player);
																		if(player.inventory.isEmpty()){
																			System.out.println("\nyour inventory is empty.");
																			break;
																		}
																		System.out.println("\npick an item");
																		for(int i = 0;i<player.inventory.size();i++){
																			System.out.println((i+1) + ": "+ player.inventory.get(i).name);
																		}
																		dinoAct = Game.scan.nextLine();
																		player.existsIn(player.inventory);
																		if(!Action.exists){
																			System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
																		}
																		else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
																			System.out.println("\n"
																					+ "the radio beeps once, twice, three times. the kid looks up.\n"
																					+ "\"who knows i'm here?\" he asks. he is strangely calm, fiddling with a little\n"
																					+ "remote, thumb ghosting over the button in the middle.\n"
																					+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																					+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																					+ "say to that: woozi, come and get me yourself!\"\n"
																					+ "he laughs one last, manic laugh before pushing the button.");
																			player.inventory.remove(Player.radio);
																			Player.gameOver = true; Player.gameWon = false;
														 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
														 					System.out.println("\n"
														 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
														 							+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
														 							+ "button and everyone and everything goes bye-bye as promised.");
														 					player.inventory.remove(Player.drone);
														 					Player.gameOver = true; Player.gameWon = false;
														 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
														 					System.out.println("\n"
														 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
														 							+ "\"forget your lines?\" the kid asks. you sputter."
														 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
														 							+ "it.\"\n"
														 							+ "click. boom. bye-bye, " + player.name + "!");
														 					player.inventory.remove(Player.diagram);
														 					Player.gameOver = true; Player.gameWon = false;
														 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
														 					System.out.println("\n"
														 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
																 					+ "your skin, and dino looks up at it.\n"
																 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
																 					+ "you nod nervously. no point in lying to him.\n"
																 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
																 					+ "he presses the button.\n"
																 					+ "you never even learned his name.");
														 					player.inventory.remove(Player.bracelet);
														 					Player.gameOver = true; Player.gameWon = false;
														 				}
																		break;
																	case "c": checkTime(player); break;
																	default: defaultChoice(player); break;
																	}
																}
															}else{
																System.out.println("\nthat's not an option. be careful - you're running out of time.");
																break;
															}
															}
															break;
														case "i": 
														//TODO PATH TALK-TALK-1-ITEM
															Action.printInv(player);
															if(player.inventory.isEmpty()){
																System.out.println("\nyour inventory is empty.");
																break;
															}
															System.out.println("\npick an item");
															for(int i = 0;i<player.inventory.size();i++){
																System.out.println((i+1) + ": "+ player.inventory.get(i).name);
															}
															dinoAct = Game.scan.nextLine();
															player.existsIn(player.inventory);
															if(!Action.exists){
																System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
															}
															else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
																System.out.println("\n"
																		+ "the radio beeps once, twice, three times. the kid looks up.\n"
																		+ "\"who knows i'm here?\" he asks. he is strangely calm, fiddling with a little\n"
																		+ "remote, thumb ghosting over the button in the middle.\n"
																		+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																		+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																		+ "say to that: woozi, come and get me yourself!\"\n"
																		+ "he laughs one last, manic laugh before pushing the button. boom, boom.");
																player.inventory.remove(Player.radio);
																Player.gameOver = true; Player.gameWon = false;
											 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
											 					System.out.println("\n"
											 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
											 							+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
											 							+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
											 							+ "the building.");
											 					player.inventory.remove(Player.drone);
											 					Player.gameOver = true; Player.gameWon = false;
											 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
											 					System.out.println("\n"
											 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
											 							+ "\"forget your lines?\" the kid asks. you sputter."
											 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
											 							+ "it.\"\n"
											 							+ "click. boom. bye-bye, " + player.name + "!");
											 					player.inventory.remove(Player.diagram);
											 					Player.gameOver = true; Player.gameWon = false;
											 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
											 					System.out.println("\n"
											 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
													 					+ "your skin, and dino looks up at it.\n"
													 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
													 					+ "you nod nervously. no point in lying to him.\n"
													 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
													 					+ "he presses the button. boom, boom. you're gone.\n"
													 					+ "you never even learned his name.");
											 					player.inventory.remove(Player.bracelet);
											 					Player.gameOver = true; Player.gameWon = false;
											 				}
															break;
														case "c": checkTime(player); break;
														default: defaultChoice(player); break;
													}
												}
											}
											else if(dinoAct.equals("2")){
											//TODO PATH TALK-TALK-2	
												System.out.println("\n\"i'm just here to help,\" you say gently.\n"
														+ "\"i don't need help,\" he spits. \"just leave.\"\n"
														+ "venom laces his words. perhaps it's spite at your request to help.\n"
														+ "you don't know.");
												defaultMoves(player);
											}
											else{
												System.out.println("\nthat's not an option. be careful - you're running out of time.");
												break;
											}
										}
										break;
										case "i":
										//TODO PATH TALK-ITEM
											Action.printInv(player);
											if(player.inventory.isEmpty()){
												System.out.println("\nyour inventory is empty.");
												break;
											}
											System.out.println("\npick an item");
											for(int i = 0;i<player.inventory.size();i++){
												System.out.println((i+1) + ": "+ player.inventory.get(i).name);
											}
											dinoAct = Game.scan.nextLine();
											player.existsIn(player.inventory);
											if(!Action.exists){
												System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
											}
											else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
												System.out.println("\nyou pull the radio out of your pocket and lower it to the floor behind you,\n"
														+ "sliding the cord delicately between your fingers. it makes a little\n"
														+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
														+ "eyes narrowing in suspicion.\n"
														+ "\"who else knows i'm here?\" he asks, wary. he is strangely calm, fiddling with a little\n"
														+ "remote, thumb ghosting over the button in the middle.\n"
														+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
														+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
														+ "say to that: woozi, come and get me yourself!\"\n"
														+ "he laughs one last, manic laugh before pushing the button.");
												player.inventory.remove(Player.radio);
												Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
							 					player.inventory.remove(Player.drone);
							 					System.out.println("\n"
							 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
											 			+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
											 			+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
											 			+ "the building.");
							 					Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
							 					System.out.println("\n"
							 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
							 							+ "\"forget your lines?\" the kid asks. you sputter."
							 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
							 							+ "it.\"\n"
							 							+ "click. boom. bye-bye, " + player.name + "!");
							 					player.inventory.remove(Player.diagram);
							 					Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
							 					System.out.println("\n"
							 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
									 					+ "your skin, and dino looks up at it.\n"
									 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
									 					+ "you nod nervously. no point in lying to him.\n"
									 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
									 					+ "he presses the button. boom, boom. you're gone.\n"
									 					+ "you never even learned his name.");
							 					player.inventory.remove(Player.bracelet);
							 					Player.gameOver = true; Player.gameWon = false;
							 				}
											break;
										case "c": checkTime(player); break;
										default: defaultChoice(player); break;
									}
								}
								break;
							case "i":
							//TODO PATH ITEM-RADIO-ITEM
								Action.printInv(player);
								if(player.inventory.isEmpty()){
									System.out.println("\nyour inventory is empty.");
									break;
								}
								System.out.println("\npick an item");
								for(int i = 0;i<player.inventory.size();i++){
									System.out.println((i+1) + ": "+ player.inventory.get(i).name);
								}
								dinoAct = Game.scan.nextLine();
								player.existsIn(player.inventory);
								if(!Action.exists){
									System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
								}
								else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
									System.out.println("\nyou pull the radio out of your pocket and lower it to the floor behind you,\n"
											+ "sliding the cord delicately between your fingers. it makes a little\n"
											+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
											+ "eyes narrowing in suspicion.\n"
											+ "\"who else knows i'm here?\" he asks, wary. he is strangely calm, fiddling with a little\n"
											+ "remote, thumb ghosting over the button in the middle.\n"
											+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
											+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
											+ "say to that: woozi, come and get me yourself!\"\n"
											+ "he laughs one last, manic laugh before pushing the button.");
									player.inventory.remove(Player.radio);
									Player.gameOver = true; Player.gameWon = false;
				 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
				 					player.inventory.remove(Player.drone);
				 					System.out.println("\n"
				 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
								 			+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
								 			+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
								 			+ "the building.");
				 					Player.gameOver = true; Player.gameWon = false;
				 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
				 					System.out.println("\n"
				 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
				 							+ "\"forget your lines?\" the kid asks. you sputter."
				 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
				 							+ "it.\"\n"
				 							+ "click. boom. bye-bye, " + player.name + "!");
				 					player.inventory.remove(Player.diagram);
				 					Player.gameOver = true; Player.gameWon = false;
				 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
				 					System.out.println("\n"
				 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
						 					+ "your skin, and dino looks up at it.\n"
						 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
						 					+ "you nod nervously. no point in lying to him.\n"
						 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
						 					+ "he presses the button. boom, boom. you're gone.\n"
						 					+ "you never even learned his name.");
				 					player.inventory.remove(Player.bracelet);
				 					Player.gameOver = true; Player.gameWon = false;
				 				}
								break;
							case "c": checkTime(player); break;
							default: defaultChoice(player); break;
						}
					}
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
 					//TODO PATH ITEM-DRONE
 					System.out.println("\n"
 							+ "the drone whirs to life, deadly quiet. the kid doesn't notice anything happen.\n"
 							+ "it fires a dart into his neck, and dino falls over unconscious. you run over and\n"
 							+ "search his pockets for anything you can use to turn off the bomb.\n"
 							+ "in his coat pocket there's a wallet and a little remote with a red button on it.\n"
 							+ "a peek in the wallet reveals an i.d. reading \"lee dino, d.o.b 02-11-1999\".\n"
 							+ "you inspect the remote, and on the back you find a little hatch. you pry it open\n"
 							+ "with your nail (if only you hadn't cut them last night!) to reveal a little switch.\n"
 							+ "the label reads \"shut off\". you flip the switch, and the beeping stops beside you.\n"
 							+ "a glance shows that the numbers have stopped moving.");
					player.inventory.remove(Player.drone);
					Player.gameOver = true; Player.gameWon = true;
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
 					//TODO PATH ITEM-DIAGRAM
 					System.out.println("\n"
 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
 							+ "\"forget your lines?\" the kid asks. you sputter."
 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
 							+ "it.\"\n"
 							+ "click. boom. bye-bye, " + player.name + "!");
 					player.inventory.remove(Player.diagram);
 					Player.gameOver = true; Player.gameWon = false;
 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
 					//TODO PATH ITEM-BRACELET
 					System.out.println("\n"
 							+ "you fiddle with the bracelet around your wrist. nothing happens.");
					while(!Player.gameOver){
						defaultMoves(player);
						switch(dinoAct){
							case "t":
							//TODO PATH ITEM-BRACELET-TALK
								System.out.println("\n\"what are you doing, kid?\" you ask, voice soft.\n"
										+ "he looks at you, expression turning almost sad. \"get out of here,\" he says,\n"
										+ "quieter.");
								while(!Player.gameOver){
									defaultMoves(player);
									switch(dinoAct){
										case "t": 
											//TODO PATH ITEM-RADIO-TALK-TALK
											while(!Player.gameOver){
											System.out.println("\nwhat will you say?\n1: \"i'm not leaving until you disable that.\"\n"
															+ "2: \"i'm just here to help.\"");
											dinoAct = Game.scan.nextLine();
											if(dinoAct.equals("1")){
												//TODO PATH ITEM-RADIO-TALK-TALK-1
												System.out.println("\n\"i'm not leaving until you disable that,\" you say.\n"
														+ "the kid smiles the empty smile of a man sentenced to death.\n"
														+ "\"if you don't leave now, you won't have a chance to leave\n"
														+ "later,\" he says, cryptic.");
												while(!Player.gameOver){
													defaultMoves(player);
													switch(dinoAct){
														case "t":
															//TODO PATH ITEM-RADIO-TALK-TALK-1-TALK
															while(!Player.gameOver){
															System.out.println("\nwhat will you say?\n1: \"is that a threat?\"\n"
																	+ "2: \"what do you mean?\"");
															dinoAct = Game.scan.nextLine();
															if(dinoAct.equals("1")){
																//TODO PATH ITEM-RADIO-TALK-TALK-1-TALK-1
																System.out.println("\nyou take a step toward him.\n"
																		+ "\"is that a threat?\" you ask. your voice is low.\n"
																		+ "the kid laughs. he reaches into his pocket and pulls out a little remote.\n"
																		+ "\"it could be!\"\n"
																		+ "you take another step.\"don't do this.\"\n"
																		+ "his finger hovers right over the big button in the middle.\n"
																		+ "\"who are you to stop me?\" he says, right before he presses down\n"
																		+ "and you two are no more.\n"
																		+ "you never even learned his name.");
																Player.gameOver = true; Player.gameWon = false;
															}else if(dinoAct.equals("2")){
																//TODO PATH ITEM-RADIO-TALK-TALK-1-TALK-2
																System.out.println("\n\"what do you mean by that?\" you ask, careful.\n"
																		+ "he laughs, loud and unsettling.\n"
																		+ "\"it means i could push a little button...\" he pauses.\n"
																		+ "\"and you, i, and the rest of the lovely people in this building\n"
																		+ "would go bye-bye.\"\n"
																		+ "his face contorts into something mimicking sadness. \"and we wouldn't\n"
																		+ "want that, would we?\"");
																while(!Player.gameOver){
																	defaultMoves(player);
																	switch(dinoAct){
																	case "t":
																		//TODO PATH TALK-TALK-1-TALK-2-TALK
																		System.out.println("\n"
																				+ "\"what did they do to you?\" you ask, soft.\n"
																				+ "\"the kid smiles again but it's weak, eyes welling up with tears.\n"
																				+ "\"they -\" he points toward the door and, presumably, the people\n"
																				+ "beyond it. \"- didn't do anything. we were friends.\n"
																				+ "\"it was the goddamn company! i poured my heart, my soul into this\n"
																				+ "job, and they cast me away like nothing!\" at this point, he's really\n"
																				+ "crying, tears rolling down his cheeks as he wipes at them futilely.\n"
																				+ "\"they ruined my life and you can bet your ass i'm going to -\"\n"
																				+ "he sobs. \"- i'm going to ruin theirs too! they can't just...\n"
																				+ "they can't just call me in after four years of nothing but good work\n"
																				+ "and results and say 'oh, dino, by the way - you're fired!'\n"
																				+ "it doesn't fucking work that way, pledis!\"\n"
																				+ "\"uh-\" you start, when dino pulls a remote from his pocket, thumb\n"
																				+ "shaking over the big button in the middle.\n"
																				+ "\"wait!\" you yell, and he pauses.");
																		while(!Player.gameOver){
																			defaultMoves(player);
																			switch(dinoAct){
																			case "t":
																				System.out.println("\n"
																						+ "\"do you really want to do this?\" you ask. \"are you completely sure?\"\n"
																						+ "dino sniffles. \"no...\" he whispers.\n"
																						+ "\"don't all the innocent people here deserve better than that?\" you ask.\n"
																						+ "\"yes...\" he says. he hangs his head. \"i'm sorry...\" he mumbles.\n"
																						+ "he picks at the back of the remote with his nail, prying the cover off.\n"
																						+ "he flips a little switch and the clock stops.\n"
																						+ "\"tell them i'm sorry, will you?\" dino asks. at your nod, he leaves, slipping\n"
																						+ "quietly through a trapdoor in the floor.");
																				Player.gameOver = true; Player.gameWon = true;
																			case "i":
																				Action.printInv(player);
																				if(player.inventory.isEmpty()){
																					System.out.println("\nyour inventory is empty.");
																					break;
																				}
																				System.out.println("\npick an item");
																				for(int i = 0;i<player.inventory.size();i++){
																					System.out.println((i+1) + ": "+ player.inventory.get(i).name);
																				}
																				dinoAct = Game.scan.nextLine();
																				player.existsIn(player.inventory);
																				if(!Action.exists){
																					System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
																				}
																				else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
																					System.out.println("\n"
																							+ "the radio beeps once, twice, three times. dino looks up.\n"
																							+ "\"who knows i'm here?\" he asks. he is strangely calm.\n"
																							+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																							+ "dino laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																							+ "say to that: woozi, come and get me yourself!\"\n"
																							+ "dino laughs one last, manic laugh before pushing the button.");
																					player.inventory.remove(Player.radio);
																					Player.gameOver = true; Player.gameWon = false;
																 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
																 					System.out.println("\n"
																 							+ "the drone whirs to life in your hand. it flies up over your head, and dino takes\n"
																 							+ "hardly one glance at it before he presses the button and everyone and everything\n"
																 							+ "goes bye-bye as promised.");
																 					player.inventory.remove(Player.drone);
																 					Player.gameOver = true; Player.gameWon = false;
																 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
																 					System.out.println("\n"
																 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
																 							+ "\"forget your lines?\" dino asks. you sputter."
																 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
																 							+ "it.\"\n"
																 							+ "click. boom. bye-bye!");
																 					player.inventory.remove(Player.diagram);
																 					Player.gameOver = true; Player.gameWon = false;
																 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
																 					System.out.println("\n"
																 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
																 							+ "your skin, and dino looks up at it.\n"
																 							+ "\"is that...\" he sniffles. \"is that seungkwan's?\"\n"
																 							+ "you nod nervously. no point in lying to him.\n"
																 							+ "dino backs up to the wall and slides down, resting his forehead on his knees.\n"
																 							+ "he's crying again.\n"
																 							+ "\"what am i doing?\" he whispers. \"they don't deserve this.\"\n"
																 							+ "he looks down at the remote in his hand. he opens the back cover with his nail and\n"
																 							+ "flips a little switch. the beeping stops.\n"
																 							+ "you glance over, and the clock has stopped at " + player.bombTime + ".");
																 					Player.gameOver = true; Player.gameWon = true;
																 				}
																				break;
																			case "c": checkTime(player); break;
																			default: defaultChoice(player); break;
																			}
																		}
																		break;
																	case "i":
																		Action.printInv(player);
																		if(player.inventory.isEmpty()){
																			System.out.println("\nyour inventory is empty.");
																			break;
																		}
																		System.out.println("\npick an item");
																		for(int i = 0;i<player.inventory.size();i++){
																			System.out.println((i+1) + ": "+ player.inventory.get(i).name);
																		}
																		dinoAct = Game.scan.nextLine();
																		player.existsIn(player.inventory);
																		if(!Action.exists){
																			System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
																		}
																		else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
																			System.out.println("\n"
																					+ "the radio beeps once, twice, three times. the kid looks up.\n"
																					+ "\"who knows i'm here?\" he asks. he is strangely calm, fiddling with a little\n"
																					+ "remote, thumb ghosting over the button in the middle.\n"
																					+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																					+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																					+ "say to that: woozi, come and get me yourself!\"\n"
																					+ "he laughs one last, manic laugh before pushing the button.");
																			player.inventory.remove(Player.radio);
																			Player.gameOver = true; Player.gameWon = false;
														 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
														 					System.out.println("\n"
														 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
														 							+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
														 							+ "button and everyone and everything goes bye-bye as promised.");
														 					player.inventory.remove(Player.drone);
														 					Player.gameOver = true; Player.gameWon = false;
														 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
														 					System.out.println("\n"
														 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
														 							+ "\"forget your lines?\" the kid asks. you sputter."
														 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
														 							+ "it.\"\n"
														 							+ "click. boom. bye-bye, " + player.name + "!");
														 					player.inventory.remove(Player.diagram);
														 					Player.gameOver = true; Player.gameWon = false;
														 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
														 					System.out.println("\n"
														 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
																 					+ "your skin, and dino looks up at it.\n"
																 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
																 					+ "you nod nervously. no point in lying to him.\n"
																 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
																 					+ "he presses the button.\n"
																 					+ "you never even learned his name.");
														 					player.inventory.remove(Player.bracelet);
														 					Player.gameOver = true; Player.gameWon = false;
														 				}
																		break;
																	case "c": checkTime(player); break;
																	default: defaultChoice(player); break;
																	}
																}
															}else{
																System.out.println("\nthat's not an option. be careful - you're running out of time.");
																break;
															}
															}
															break;
														case "i": 
														//TODO PATH TALK-TALK-1-ITEM
															Action.printInv(player);
															if(player.inventory.isEmpty()){
																System.out.println("\nyour inventory is empty.");
																break;
															}
															System.out.println("\npick an item");
															for(int i = 0;i<player.inventory.size();i++){
																System.out.println((i+1) + ": "+ player.inventory.get(i).name);
															}
															dinoAct = Game.scan.nextLine();
															player.existsIn(player.inventory);
															if(!Action.exists){
																System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
															}
															else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
																System.out.println("\n"
																		+ "the radio beeps once, twice, three times. the kid looks up.\n"
																		+ "\"who knows i'm here?\" he asks. he is strangely calm, fiddling with a little\n"
																		+ "remote, thumb ghosting over the button in the middle.\n"
																		+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
																		+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
																		+ "say to that: woozi, come and get me yourself!\"\n"
																		+ "he laughs one last, manic laugh before pushing the button. boom, boom.");
																player.inventory.remove(Player.radio);
																Player.gameOver = true; Player.gameWon = false;
											 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
											 					System.out.println("\n"
											 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
											 							+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
											 							+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
											 							+ "the building.");
											 					player.inventory.remove(Player.drone);
											 					Player.gameOver = true; Player.gameWon = false;
											 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
											 					System.out.println("\n"
											 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
											 							+ "\"forget your lines?\" the kid asks. you sputter."
											 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
											 							+ "it.\"\n"
											 							+ "click. boom. bye-bye, " + player.name + "!");
											 					player.inventory.remove(Player.diagram);
											 					Player.gameOver = true; Player.gameWon = false;
											 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
											 					System.out.println("\n"
											 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
													 					+ "your skin, and dino looks up at it.\n"
													 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
													 					+ "you nod nervously. no point in lying to him.\n"
													 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
													 					+ "he presses the button. boom, boom. you're gone.\n"
													 					+ "you never even learned his name.");
											 					player.inventory.remove(Player.bracelet);
											 					Player.gameOver = true; Player.gameWon = false;
											 				}
															break;
														case "c": checkTime(player); break;
														default: defaultChoice(player); break;
													}
												}
											}
											else if(dinoAct.equals("2")){
											//TODO PATH TALK-TALK-2	
												System.out.println("\n\"i'm just here to help,\" you say gently.\n"
														+ "\"i don't need help,\" he spits. \"just leave.\"\n"
														+ "venom laces his words. perhaps it's spite at your request to help.\n"
														+ "you don't know.");
												defaultMoves(player);
											}
											else{
												System.out.println("\nthat's not an option. be careful - you're running out of time.");
												break;
											}
										}
										break;
										case "i":
										//TODO PATH TALK-ITEM
											Action.printInv(player);
											if(player.inventory.isEmpty()){
												System.out.println("\nyour inventory is empty.");
												break;
											}
											System.out.println("\npick an item");
											for(int i = 0;i<player.inventory.size();i++){
												System.out.println((i+1) + ": "+ player.inventory.get(i).name);
											}
											dinoAct = Game.scan.nextLine();
											player.existsIn(player.inventory);
											if(!Action.exists){
												System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
											}
											else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
												System.out.println("\nyou pull the radio out of your pocket and lower it to the floor behind you,\n"
														+ "sliding the cord delicately between your fingers. it makes a little\n"
														+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
														+ "eyes narrowing in suspicion.\n"
														+ "\"who else knows i'm here?\" he asks, wary. he is strangely calm, fiddling with a little\n"
														+ "remote, thumb ghosting over the button in the middle.\n"
														+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
														+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
														+ "say to that: woozi, come and get me yourself!\"\n"
														+ "he laughs one last, manic laugh before pushing the button.");
												player.inventory.remove(Player.radio);
												Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
							 					player.inventory.remove(Player.drone);
							 					System.out.println("\n"
							 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
											 			+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
											 			+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
											 			+ "the building.");
							 					Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
							 					System.out.println("\n"
							 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
							 							+ "\"forget your lines?\" the kid asks. you sputter."
							 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
							 							+ "it.\"\n"
							 							+ "click. boom. bye-bye, " + player.name + "!");
							 					player.inventory.remove(Player.diagram);
							 					Player.gameOver = true; Player.gameWon = false;
							 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
							 					System.out.println("\n"
							 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
									 					+ "your skin, and dino looks up at it.\n"
									 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
									 					+ "you nod nervously. no point in lying to him.\n"
									 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
									 					+ "he presses the button. boom, boom. you're gone.\n"
									 					+ "you never even learned his name.");
							 					player.inventory.remove(Player.bracelet);
							 					Player.gameOver = true; Player.gameWon = false;
							 				}
											break;
										case "c": checkTime(player); break;
										default: defaultChoice(player); break;
									}
								}
								break;
							case "i":
							//TODO PATH ITEM-BRACELET-ITEM
								Action.printInv(player);
								if(player.inventory.isEmpty()){
									System.out.println("\nyour inventory is empty.");
									break;
								}
								System.out.println("\npick an item");
								for(int i = 0;i<player.inventory.size();i++){
									System.out.println((i+1) + ": "+ player.inventory.get(i).name);
								}
								dinoAct = Game.scan.nextLine();
								player.existsIn(player.inventory);
								if(!Action.exists){
									System.out.println("\nthat's not an option right now. be more careful -\nyou're losing time.");
								}
								else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.radio)){
									System.out.println("\nyou pull the radio out of your pocket and lower it to the floor behind you,\n"
											+ "sliding the cord delicately between your fingers. it makes a little\n"
											+ "click as it touches the floor, and the boy zeroes in on it immediately,\n"
											+ "eyes narrowing in suspicion.\n"
											+ "\"who else knows i'm here?\" he asks, wary. he is strangely calm, fiddling with a little\n"
											+ "remote, thumb ghosting over the button in the middle.\n"
											+ "\"woozi,\" you say. you save yourself the trouble of lying to him.\n"
											+ "the kid laughs. \"so they hired you to find me, didn't they? well, here's what i\n"
											+ "say to that: woozi, come and get me yourself!\"\n"
											+ "he laughs one last, manic laugh before pushing the button.");
									player.inventory.remove(Player.radio);
									Player.gameOver = true; Player.gameWon = false;
				 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.drone)){
				 					player.inventory.remove(Player.drone);
				 					System.out.println("\n"
				 							+ "the drone whirs to life in your hand. it flies up over your head, and the kid takes\n"
								 			+ "hardly one glance at it before he pulls out a little remote and presses the little red\n"
								 			+ "button and everyone and everything goes bye-bye - you, him, and everyone else in\n"
								 			+ "the building.");
				 					Player.gameOver = true; Player.gameWon = false;
				 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.diagram)){
				 					System.out.println("\n"
				 							+ "you pull the diagram dk gave you from your pocket, smoothing it over your knee.\n"
				 							+ "\"forget your lines?\" the kid asks. you sputter."
				 							+ "\"well, since i can see your obvious disregard for this production, i'll just cancel\n"
				 							+ "it.\"\n"
				 							+ "click. boom. bye-bye, " + player.name + "!");
				 					player.inventory.remove(Player.diagram);
				 					Player.gameOver = true; Player.gameWon = false;
				 				}else if(player.inventory.get(Integer.parseInt(dinoAct)-1).equals(Player.bracelet)){
				 					System.out.println("\n"
				 							+ "you fiddle with the bracelet around your wrist. the soft threads whisper against\n"
						 					+ "your skin, and dino looks up at it.\n"
						 					+ "\"is that...\" he asks. \"is that seungkwan's?\"\n"
						 					+ "you nod nervously. no point in lying to him.\n"
						 					+ "he laughs, pulling a little remote from his pocket. \"bye-bye, boo!\"\n"
						 					+ "he presses the button. boom, boom. you're gone.\n"
						 					+ "you never even learned his name.");
				 					player.inventory.remove(Player.bracelet);
				 					Player.gameOver = true; Player.gameWon = false;
				 				}
								break;
							case "c": checkTime(player); break;
							default: defaultChoice(player); break;
						}
					}
 				}
				break;
			case "c": checkTime(player); break;
			default: defaultChoice(player); break; 
		}
		}
	}
}
