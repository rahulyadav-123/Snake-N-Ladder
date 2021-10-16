package com.bridgelab;

public class SnakeNLadder {
	public static void main(String[] args) {
		
	
			//variables
			int positionPlayer1 = 0;
			int countDiceRolled1 = 0;

			int positionPlayer2 = 0;
			int countDiceRolled2 = 0;

			int finalPosition = 100;
			int switchPlayer = 1;

			//loops execute till final position
			while(positionPlayer1 != finalPosition && positionPlayer2 != finalPosition){

				// Random Dice value between 1-6
				int dice_value = (int) Math.floor((Math.random()*6) + 1);
			
				// Random Option for No play, Ladder, and Snake
				int check_opt = (int) Math.floor(Math.random()*3);
				
				if(switchPlayer == 1){				//Player 1 roll the dice
					//checking option using case
					switch(check_opt) {
						case 1:		//ladder
							positionPlayer1 += dice_value;
							if(positionPlayer1 > finalPosition)
								positionPlayer1 -= dice_value;
							switchPlayer = 1;
							break;
						case 2:		//snake
							positionPlayer1 -= dice_value;
							if(positionPlayer1 < 0)
								positionPlayer1 = 0;
							switchPlayer = 2;
							break;
						default:	//no play
							positionPlayer1 += 0;
							switchPlayer = 1;
					}
					System.out.println("Position of the Player 1 token : " + positionPlayer1 + " || Option value is " + check_opt + " || Dice value " + dice_value);
				
					countDiceRolled1++;
				}
				else{				//Player 2 roll the dice
					//checking option using case
					switch(check_opt) {
						case 1:		//ladder
							positionPlayer2 += dice_value;
							if(positionPlayer2 > finalPosition)
								positionPlayer2 -= dice_value;
							switchPlayer = 2;
							break;
						case 2:		//snake
							positionPlayer2 -= dice_value;
							if(positionPlayer2 < 0)
								positionPlayer2 = 0;
							switchPlayer = 1;
							break;
						default:	//no play
							positionPlayer2 += 0;
							switchPlayer = 2;
					}
					System.out.println("Position of the Player 2 token : " + positionPlayer2 + " || Option value is " + check_opt + " || Dice value " + dice_value);
				
					countDiceRolled2++;
				}
			}

			//checking who won the game
			if (positionPlayer1 > positionPlayer2)
				System.out.println("Player 1 rolls the dice " + countDiceRolled1 + " times to win the game.");
			else
				System.out.println("Player 2 rolls the dice " + countDiceRolled2 + " times to win the game.");
		}
	}


