
public class lab06 {



				/*Write a program that prints out the name of each of the days of the week,
given a number from 0 to 6 (for example, if the input is 0 the output is
Sunday). Use a switch statement.
				 */
	
		
					public static void main(String[] args) {

						int dow;
						
						TextIO.putln( "enter day number 0-6" );
						dow = TextIO.getInt();

						switch(dow) {
							case 0 : TextIO.putln("Sunday" );
								break;
							case 1 : TextIO.putln("Monday");
								break;
							case 2 : TextIO.putln("Tuesday");
								break;
							case 3 : TextIO.putln("Wednesday");
								break;
							case 4 : TextIO.putln("Thursday");
								break;
							case 5 : TextIO.putln("Friday");
								break;
							case 6 : TextIO.putln("Saturday");
								break;
							default: TextIO.putln("out of range");
							break;
						}
			
						


					}//end main
				}