
public class subroutines04 {


		
		public static void main(String[] args) {

			int x = 9;
			double y = 5.5;

			TextIO.putln ("x is " + x);
			TextIO.putln ("y is " + y);
			
			
			y = dividedByFunction(456);
			TextIO.putln( "y = dividedByFunction(456) gives... " + y);
			
			TextIO.putln( " dividedByFunction(70.89) returns... " + dividedByFunction(70.89)   );
			
			int n1, n2;
			 TextIO.putln(" enter a number ");
			 n1 = TextIO.getInt();
			 TextIO.putln(" enter a number ");
			 n2 = TextIO.getInt();
			 
		
			TextIO.putln( "addTwoNumbers(n1, n2) returns... " + addTwoNumbers(n1, n2)   );
			
			//addTen(x);
		}//main
		
		
		public static void addTen(int no1){									//1 formal parameter
			TextIO.putln( 10 + no1);
		}
		
		//*******************************************************************************************************
		
		public static int addTwoNumbers(int number1, int number2){			//2 formal parameters
			
			return (number1 + number2);							//returns an integer
		}

		//*******************************************************************************************************
		
		public static double dividedByFunction(double no1){					//1 formal parameter
			TextIO.putln( "no1 from inside dividedByFunction is " + no1);
			return no1/10;													////returns a double
		}
		
		
		
		
		
		

		
	}//class