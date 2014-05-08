
public class lab03 {

	/* Write a program which reads in a username and a password, and expects the
username to be “brian” and the password to be “spam”. The program should
print a welcome message if these are both correct.
	 */

		
		public static void main(String[] args) {
			
			String username, password;
				
			
			
			TextIO.putln( "enter your name?" );
			username = TextIO.getln();
			TextIO.putln( "enter your password?" );
			password = TextIO.getln();	
			
			
			if ((username.equals("brian")) &&(password.equals("spam"))) {
				TextIO.putln( " correct " );
			}
			else{
				TextIO.putln( " incorrect " );
			}

		}//end main
	}