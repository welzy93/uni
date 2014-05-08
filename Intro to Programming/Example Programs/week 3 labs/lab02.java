
/*
 * Write a program which reads in the names of two teams and the number of
goals they have scored in a game. The program should output the name of
the winner, or output “draw”, depending on the score
 */
	public class lab02 {

		
		
		public static void main(String[] args) {
			
			String team1, team2;
			int t1Goals, t2Goals;
			
			TextIO.putln( "team 1 name" );
			team1 = TextIO.getln();
			TextIO.putln( "how many goals?" );
			t1Goals = TextIO.getInt();
			
			
			TextIO.putln( "team 2 name" );
			team2 = TextIO.getln();
			TextIO.putln( "how many goals?" );
			t2Goals = TextIO.getInt();

			if (t1Goals == t2Goals){
				TextIO.putln( "its a draw!");
			}

			if (t1Goals > t2Goals){
				TextIO.putln( "the winning team is " + team1 + " with " + t1Goals + " goals" );
			}
			 if (t2Goals > t1Goals){
				TextIO.putln( "the winning team is " + team2 + " with " + t2Goals + " goals" );
			}
						
		}//end main
	}