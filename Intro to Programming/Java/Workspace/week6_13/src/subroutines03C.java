
public class subroutines03C {

	//subroutines and passing parameters
			
			public static void main(String[] args) {

							
				int n1, n2;
				
				do{
					 TextIO.putln(" enter a whole number ");
					 n1 = TextIO.getInt();
					 TextIO.putln(" enter a whole number ");
					 n2 = TextIO.getInt();
					 
					 													//send 2 actual parameters
					 TextIO.putln( "the total of the two numbers is " + addTwoNumbers(n1, n2)   );
				
				} while ((n1>0) || (n2>0));
	
				
			}//main
			
		
			//this function has 2 parameters passed to it
			public static int addTwoNumbers(int number1, int number2){			//receives 2 formal parameters
				return (number1 + number2);								//returns an integer
			}
			
		
			
		}//class
