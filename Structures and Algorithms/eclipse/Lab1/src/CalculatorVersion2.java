
public class CalculatorVersion2 {
	
	public static void main(String[] args) {
		int selection = 0;
		do
		{
			
			int valuea= 0, valueb = 0;
			valuea=Input.getInteger("Please enter a number: ");
			valueb=Input.getInteger("Please enter a number: ");
			
			System.out.println("0. Exit | 1. add | 2. Subtract | 3. multiply | 4. Integer Division | 5. floating point division ");
			selection=Input.getInteger("Please make a selection");
			
			switch (selection) {
			case 0: System.out.println("Exit");
					System.exit(0);
			case 1: CalculatorVersion2.add(valuea,valueb);
				break;
			case 2: CalculatorVersion2.subtract(valuea,valueb);
				break;
			case 3: CalculatorVersion2.multiply(valuea,valueb);
				break;
			case 4: CalculatorVersion2.IntegerDivision(valuea,valueb);
				break;
			case 5: CalculatorVersion2.FloatingPointDivision(valuea,valueb);
					
				break;
			
			}
			
		}
		while(selection != 0);

	}

	private static void FloatingPointDivision(int valuea, int valueb) {
		System.out.print("Floating Point Division"+(double)valuea/valueb);
		
	}

	private static void IntegerDivision(int valuea, int valueb) {
		System.out.print("Division: "+ (valuea/valueb));
		
	}

	private static void multiply(int valuea, int valueb) {
		System.out.print("Multiply: "+ (valuea*valueb));
		
	}

	private static void subtract(int valuea, int valueb) {
		System.out.print("Subtract: "+ (valuea-valueb));
		
	}

	private static void add(int valuea, int valueb) {
		System.out.print("add: "+ (valuea+valueb));
		
	}

}
