
public class Menu {
	public static Turn[] TurnArray = new Turn[100];	
	static Player[] PlayerArray = new Player[Player.NoPlayer];
	
	public static void main (String[] args) {
		
		DisplayMenu();
		
		
	}
		public static void DisplayMenu() {
		int Option;
		TextIO.putln("1 = Start New Game");
		TextIO.putln("2 = Replay Last Game");
		TextIO.putln("3: Exit the Game");
		do{
			Option = TextIO.getInt();		
				
				switch (Option){
					case 1: TextIO.putln("You choose to start a new game");
						Game();
						break;
					case 2: TextIO.putln("You choose to replay the last game");
						break;
					case 3: TextIO.putln("You choose to exit the game");
						break;
					default:TextIO.putln("doesnt exist");
						break;
				}
		}while(Option !=3);
		
	
	}
	
	public static void Game(){
		int NoPlayer;
		TextIO.putln("How Many Players will there be?");
		NoPlayer = TextIO.getInt();
		Player.NoPlayer = NoPlayer;
		
		Player[] PlayerArray = new Player[NoPlayer];
		for(int i=0; i <PlayerArray.length; i++){
			PlayerArray[i] = new Player();
			TextIO.putln("Please Enter a Name:");
			PlayerArray[i].name = TextIO.getlnWord();
		}
		
		Turn[] TurnArray = new Turn[100];
		
		int turnCounter=0; 
		int thisPlayer=0;
		
		do{
			
			TurnArray[turnCounter] = new Turn();
			TextIO.putln("This is " + PlayerArray[0].name + "s" + " Turn");
			TurnArray[turnCounter].throwOne = AThrow();
			TextIO.putln("This is Your First Throw " + TurnArray[turnCounter].throwOne);
			TurnArray[turnCounter].throwTwo = AThrow();
			TextIO.putln("This is your Second Throw " + TurnArray[turnCounter].throwTwo);
			TurnArray[turnCounter].throwThree = AThrow();
			TextIO.putln("This is your Third Throw " + TurnArray[turnCounter].throwThree);
			TextIO.putln("This is " + PlayerArray[1].name + "s" + " Turn");
			TurnArray[turnCounter].throwOne = AThrow();
			TextIO.putln("This is Your First Throw " + TurnArray[turnCounter].throwOne);
			TurnArray[turnCounter].throwTwo = AThrow();
			TextIO.putln("This is your Second Throw " + TurnArray[turnCounter].throwTwo);
			TurnArray[turnCounter].throwThree = AThrow();
			TextIO.putln("This is your Third Throw " + TurnArray[turnCounter].throwThree);
			
			TurnArray[turnCounter].throwTotal = TurnArray[turnCounter].throwOne + TurnArray[turnCounter].throwTwo + TurnArray[turnCounter].throwThree;
			PlayerArray[thisPlayer].total = PlayerArray[thisPlayer].total - TurnArray[turnCounter].throwTotal;
			
			TextIO.putln("The total of your throws is " +  TurnArray[turnCounter].throwTotal);
			TextIO.putln("Your score is now " + PlayerArray[thisPlayer].total);
			
			if (PlayerArray[thisPlayer].total <= 0 ){
				Player.gameOver = true;
			}
			
			thisPlayer++;
			if(thisPlayer >= Player.NoPlayer){
				thisPlayer =0;
			}
			turnCounter ++;
			
			
			// this was my attempt to get the game to finish on a double 
			//if(PlayerArray[thisPlayer].total <=180){
				//PlayerArray[thisPlayer].total = (int)(20 * 2 * Math.random()) + 1;
			//}
			
			}while(Player.gameOver == false);
		
		int Option;
		TextIO.putln("1 = Start New Game");
		TextIO.putln("2 = Replay Last Game");
		TextIO.putln("3: Exit the Game");
		do{
			Option = TextIO.getInt();		
				
				switch (Option){
					case 1: TextIO.putln("You choose to start a new game");
						Game();
						break;
					case 2: TextIO.putln("You choose to replay the last game");
						for(int i= 0; i<100; i++){
							TextIO.putln("This is Your First Throw " + TurnArray[i].throwOne);
							TextIO.putln("This is Your Second Throw " + TurnArray[i].throwTwo);
							TextIO.putln("This is Your Third Throw " + TurnArray[i].throwThree);
							TextIO.putln("The total of your throws is " + TurnArray[i].throwTotal);
						}
						break;
					case 3: TextIO.putln("You choose to exit the game");
						break;
					default:TextIO.putln("doesnt exist");
						break;
				}
		}while(Option !=3);
	}
	
	public static int AThrow(){
		
		
		int Throw;
		
		switch ( (int)(3*Math.random()) ) {
	     case 0:
	        Throw = (int)(20 * Math.random()) + 1; //single
	        break;
	     case 1:
		    Throw = (int)(20 * Math.random()) + 1; //single again to reduce probability of scoring high
       break;
	     case 2:
	    	 Throw = (int)(25);
	    	 break;
	     case 3:
	    	 Throw = (int)(50);
	    	 break;
	     case 4:
	    	 Throw = (int)(20 * 2 * Math.random()) + 1; //double
	    	 break;
	     case 5:
	    	 Throw = (int)(0); // miss
	    	 break;
	     default:
	    	 Throw = (int)(20 * 3 * Math.random()) + 1; //triple
	        break;
		}  //switch
	        
	  
		return Throw;
	}
	
	

	
		
	

		



		
		
	







}
