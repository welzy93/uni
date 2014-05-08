
public class lab05 {



			/*
			 * Write a program that will evaluate simple expressions such as
			 *  17 + 3 and 3.14159 * 4.7. 
			 *  The expressions are to be typed in by the user. The input
always consist of a number, followed by an operator, followed by another
number. The operators that are allowed are +, -, *, and /. You can read the
numbers with TextIO.getDouble() and the operator with TextIO.getChar().
Your program should read an expression and print its value. For now, each
run of the program reads on expression and outputs the result and then
terminates (next week we will modify the solution so that it goes on reading
expressions till the user wants to quit).
			 */

				
				public static void main(String[] args) {
					
					double no1, no2;
					char operator;
					
					TextIO.putln( "enter no1" );
					no1 = TextIO.getInt();
					
					TextIO.putln( "enter operator + - * or /" );
					operator = TextIO.getChar();
						
					TextIO.putln( "enter no2" );
					no2 = TextIO.getInt();
					
					

					switch(operator) {
						case '/' : TextIO.putln(no1/no2);
							break;
						case '*' : TextIO.putln(no1*no2);
							break;
						case '+' : TextIO.putln(no1+no2);
							break;
						case '-' : TextIO.putln(no1-no2);
							break;
						default: TextIO.putln("wrong operator used");
						break;
					}
		
					


				}//end main
			}