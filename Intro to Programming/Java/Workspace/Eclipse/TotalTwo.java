
public class TotalTwo {
	
	public static void main (String[] args) {
		
		int n1, n2, total;
		 TextIO.putln(" enter a whole number ");
		 n1 = TextIO.getInt();
		 
		 TextIO.putln(" enter a whole number ");
		 n2 = TextIO.getInt();
		 
		 
		 total= addTwoNumbers(n1, n2) ;
		 
		 
	}
	
	
	
	public static int addTwoNumbers(int number1, int number2){	

		return number1 + number2;
	}


}
