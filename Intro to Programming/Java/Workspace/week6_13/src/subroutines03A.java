	//subroutines and passing parameters
public class subroutines03A {

			public static void main(String[] args) {

			//send 2 actual parameters
			 addTwoNumbers(152, 3732)   ;
				
				int n1, n2;
				 TextIO.putln(" enter a whole number ");
				 n1 = TextIO.getInt();
				 
				 TextIO.putln(" enter a whole number ");
				 n2 = TextIO.getInt();
				 
				 //send 2 actual parameters
				 addTwoNumbers(n1, n2) ;
				
				 
				 TextIO.putln(" enter a whole number ");
				 n1 = TextIO.getInt();
				 
				 TextIO.putln(" enter a whole number ");
				 n2 = TextIO.getInt();
				 
				 //send 2 actual parameters
				addTwoNumbers(n1, n2);
				
			}//main
			
		
			//this function has 2 parameters passed to it
			public static void addTwoNumbers(int number1, int number2){	//receives 2 formal parameters
				TextIO.putln("number1 + number2"+ number1 + number2);
			}//addTwoNumbers

		}//class
