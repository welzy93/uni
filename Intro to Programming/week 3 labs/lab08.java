
public class lab08 {

/*  Savanna Mail has decided to have machines that print out postage stamps up
to maximum value of £99.99 (the currency uses Guineas and cents). The
stamps have a basic design as follows:
-----------
| SAVANNA |
| G14.30 |
| BY AIR |
-----------
The three zones of postage rates per 10 grams are as follows:
A 50c
B 90c
C G1.10
and the postage is doubled for air mail. Write a program that prompts the user
for the weight of an article, the zone to which it is going and whether it should
go by air or not, and then prints the correct stamp.
					 */
		
			
						public static void main(String[] args) {

							int weight;
							double rate, cost;
							char zone;
							boolean air = false;
							
							TextIO.putln( "enter weight of article" );
							weight = TextIO.getInt();
							
							
							TextIO.putln( "enter zone a,b,c" );
							zone = TextIO.getChar();
							if (zone=='a'){
								rate = .50;
							}else if (zone=='b'){
								rate= .90;
							}else{
								rate=1.10;
							}
							
							
							TextIO.putln( "by air? true / false" );
							air = TextIO.getBoolean();
							
							if(air==false){
								cost=weight*rate;
							}else
							{
								cost=(weight*rate)*2;
							}
						
							
							TextIO.putln( "----------- \n | SAVANNA | \n | G" + cost + " | \n | BY AIR | \n ----------- ");

				
				
							


						}//end main
					}
