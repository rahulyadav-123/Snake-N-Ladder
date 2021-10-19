package sample;

public class snakeNladder {
	public static void main(String[] args) {
		int start_pos = 0;
		int final_pos = 100;
		int count_dice_rolled = 0;
		
		while(start_pos != final_pos){
			
			// Random Dice value between 1-6
			int dice_value = (int) Math.floor((Math.random()*6) + 1);
			// Random Option for No play, Ladder, and Snake
			int check_opt = (int) Math.floor(Math.random()*3);
			
			switch(check_opt) {
				case 1:
					start_pos += dice_value;
					break;
				case 2:
					start_pos -= dice_value;
					break;
				default:
					start_pos += 0;
			}
			
			//System.out.println("Starting position : " + start_pos + " and option value is " + check_opt + " and dice value " + dice_value);
			
			
			if(start_pos < 0)
				start_pos = 0;
			else if(start_pos > final_pos){
				start_pos -= dice_value;
			}
			
			System.out.println("Position of the Player token : " + start_pos + " || Option value is " + check_opt + " || Dice value " + dice_value);
			
			count_dice_rolled++;
		}
		
		System.out.println("Player rolls the dice " + count_dice_rolled + " times to win the game.");
	}

	}


